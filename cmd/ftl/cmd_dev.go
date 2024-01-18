package main

import (
	"bufio"
	"bytes"
	"context"
	"crypto/sha256"
	"errors"
	"hash"
	"io"
	"io/fs"
	"os"
	"path"
	"path/filepath"
	"strings"
	"time"

	"connectrpc.com/connect"
	"github.com/bmatcuk/doublestar/v4"
	"golang.org/x/sync/errgroup"

	"github.com/TBD54566975/ftl/backend/common/log"
	"github.com/TBD54566975/ftl/backend/common/moduleconfig"
	ftlv1 "github.com/TBD54566975/ftl/protos/xyz/block/ftl/v1"
	"github.com/TBD54566975/ftl/protos/xyz/block/ftl/v1/ftlv1connect"
)

type moduleFolderInfo struct {
	ModuleName string
	FileHash   hash.Hash
}

type devCmd struct {
	BaseDir        string        `arg:"" help:"Directory to watch for FTL modules" type:"existingdir" default:"."`
	Watch          time.Duration `help:"Watch template directory at this frequency and regenerate on change." default:"500ms"`
	FailureDelay   time.Duration `help:"Delay before retrying a failed deploy." default:"5s"`
	ReconnectDelay time.Duration `help:"Delay before attempting to reconnect to FTL." default:"1s"`
}

type moduleMap map[string]*moduleFolderInfo

func (m *moduleMap) ForceRebuild(dir string) {
	(*m)[dir].FileHash = sha256.New()
}

func (m *moduleMap) AddModule(dir string, module string) {
	(*m)[dir] = &moduleFolderInfo{
		ModuleName: module,
		FileHash:   sha256.New(),
	}
}

func (m *moduleMap) RemoveModule(dir string) {
	delete(*m, dir)
}

func (m *moduleMap) ForceRebuildFromDependent(module string) {
	for dir, moduleInfo := range *m {
		if moduleInfo.ModuleName != module {
			(*m).ForceRebuild(dir)
		}
	}
}

func (d *devCmd) Run(ctx context.Context, client ftlv1connect.ControllerServiceClient) error {
	logger := log.FromContext(ctx)
	logger.Infof("Watching %s for FTL modules", d.BaseDir)

	schemaChanges := make(chan string, 64)
	modules := make(moduleMap)

	wg, ctx := errgroup.WithContext(ctx)

	wg.Go(func() error {
		return d.watchForSchemaChanges(ctx, client, schemaChanges)
	})

	for {
		delay := d.Watch

		tomls, err := d.getTomls(ctx)
		if err != nil {
			return err
		}

		err = d.addOrRemoveModules(tomls, modules)
		if err != nil {
			return err
		}

		for dir := range modules {
			currentModule := modules[dir]
			fileHash, err := d.updateFileInfo(ctx, dir)
			if err != nil {
				return err
			}

			if !bytes.Equal(currentModule.FileHash.Sum(nil), fileHash.Sum(nil)) {
				deploy := deployCmd{
					Replicas:  1,
					ModuleDir: dir,
				}
				err = deploy.Run(ctx, client)
				if err != nil {
					logger.Errorf(err, "Error deploying module %s. Will retry", dir)
					modules.RemoveModule(dir)
					// Increase delay when there's a compile failure.
					delay = d.FailureDelay
				}
			}
			currentModule.FileHash = fileHash
			modules[dir] = currentModule
		}

		select {
		case moduleName := <-schemaChanges:
			logger.Warnf("Schema change detected for module %s, rebuilding other modules.", moduleName)
			modules.ForceRebuildFromDependent(moduleName)

		drainLoop: // Drain all messages from the channel to avoid extra redeploys
			for {
				select {
				case moduleName := <-schemaChanges:
					logger.Warnf("Schema change detected for module %s, rebuilding other modules.", moduleName)
					modules.ForceRebuildFromDependent(moduleName)
				default:
					break drainLoop
				}
			}
		case <-time.After(delay):
		case <-ctx.Done():
			return wg.Wait()
		}
	}
}

func (d *devCmd) watchForSchemaChanges(ctx context.Context, client ftlv1connect.ControllerServiceClient, schemaChanges chan string) error {
	logger := log.FromContext(ctx)
	for {
		stream, err := client.PullSchema(ctx, connect.NewRequest(&ftlv1.PullSchemaRequest{}))
		if err != nil {
			return err
		}

		for stream.Receive() {
			msg := stream.Msg()
			if msg.ChangeType == ftlv1.DeploymentChangeType_DEPLOYMENT_CHANGED {
				logger.Warnf("Schema change detected for module %s", msg.ModuleName)
				schemaChanges <- msg.ModuleName
			}
		}

		stream.Close()
		logger.Infof("Stream disconnected, attempting to reconnect...")
		time.Sleep(d.ReconnectDelay)
	}
}

func (d *devCmd) getTomls(ctx context.Context) ([]string, error) {
	baseDir := d.BaseDir
	ignores := initGitIgnore(ctx, baseDir)
	tomls := []string{}

	err := walkDir(baseDir, ignores, func(srcPath string, d fs.DirEntry) error {
		if filepath.Base(srcPath) == "ftl.toml" {
			tomls = append(tomls, srcPath)
			return errSkip // Return errSkip to stop recursion in this branch
		}
		return nil
	})
	if err != nil {
		return nil, err
	}

	return tomls, nil
}

func (d *devCmd) addOrRemoveModules(tomls []string, modules moduleMap) error {
	for _, toml := range tomls {
		dir := filepath.Dir(toml)
		if _, ok := modules[dir]; !ok {
			config, err := moduleconfig.LoadConfig(dir)
			if err != nil {
				return err
			}
			modules.AddModule(dir, config.Module)
		}
	}

	for dir := range modules {
		found := false
		for _, toml := range tomls {
			if filepath.Dir(toml) == dir {
				found = true
				break
			}
		}
		if !found {
			modules.RemoveModule(dir)
		}
	}
	return nil
}

func (d *devCmd) updateFileInfo(ctx context.Context, dir string) (hash.Hash, error) {
	config, err := moduleconfig.LoadConfig(dir)
	if err != nil {
		return nil, err
	}

	ignores := initGitIgnore(ctx, dir)

	fileHash := sha256.New()
	err = walkDir(dir, ignores, func(srcPath string, entry fs.DirEntry) error {
		for _, pattern := range config.Watch {
			relativePath, err := filepath.Rel(dir, srcPath)
			if err != nil {
				return err
			}

			match, err := doublestar.PathMatch(pattern, relativePath)
			if err != nil {
				return err
			}

			if match && !entry.IsDir() {
				file, err := os.Open(srcPath)
				if err != nil {
					return err
				}

				if _, err := io.Copy(fileHash, file); err != nil {
					_ = file.Close()
					return err
				}

				err = file.Close()
				if err != nil {
					return err
				}
			}
		}

		return nil
	})
	if err != nil {
		return nil, err
	}

	return fileHash, err
}

// errSkip is returned by walkDir to skip a file or directory.
var errSkip = errors.New("skip directory")

// Depth-first walk of dir executing fn after each entry.
func walkDir(dir string, ignores []string, fn func(path string, d fs.DirEntry) error) error {
	dirInfo, err := os.Stat(dir)
	if err != nil {
		return err
	}
	if err = fn(dir, fs.FileInfoToDirEntry(dirInfo)); err != nil {
		if errors.Is(err, errSkip) {
			return nil
		}
		return err
	}
	entries, err := os.ReadDir(dir)
	if err != nil {
		return err
	}

	var dirs []os.DirEntry

	// Process files first, then recurse into directories.
	for _, entry := range entries {
		fullPath := filepath.Join(dir, entry.Name())

		// Check if the path matches any ignore pattern
		shouldIgnore := false
		for _, pattern := range ignores {
			match, err := doublestar.PathMatch(pattern, fullPath)
			if err != nil {
				return err
			}
			if match {
				shouldIgnore = true
				break
			}
		}

		if shouldIgnore {
			continue // Skip this entry
		}

		if entry.IsDir() {
			dirs = append(dirs, entry)
		} else {
			if err = fn(fullPath, entry); err != nil {
				if errors.Is(err, errSkip) {
					// If errSkip is found in a file, skip the remaining files in this directory
					return nil
				}
				return err
			}
		}
	}

	// Then, recurse into subdirectories
	for _, dirEntry := range dirs {
		dirPath := filepath.Join(dir, dirEntry.Name())
		ignores = append(ignores, loadGitIgnore(dirPath)...)
		if err := walkDir(dirPath, ignores, fn); err != nil {
			if errors.Is(err, errSkip) {
				return errSkip // Propagate errSkip upwards to stop this branch of recursion
			}
			return err
		}
	}
	return nil
}

func initGitIgnore(ctx context.Context, dir string) []string {
	ignore := []string{
		"**/.*",
		"**/.*/**",
	}
	home, err := os.UserHomeDir()
	if err == nil {
		ignore = append(ignore, loadGitIgnore(home)...)
	}
	gitRoot := gitRoot(ctx, dir)
	if gitRoot != "" {
		for current := dir; strings.HasPrefix(current, gitRoot); current = path.Dir(current) {
			ignore = append(ignore, loadGitIgnore(current)...)
		}
	}
	return ignore
}

func loadGitIgnore(dir string) []string {
	r, err := os.Open(path.Join(dir, ".gitignore"))
	if err != nil {
		return nil
	}
	ignore := []string{}
	lr := bufio.NewScanner(r)
	for lr.Scan() {
		line := lr.Text()
		line = strings.TrimSpace(line)
		if line == "" || line[0] == '#' || line[0] == '!' { // We don't support negation.
			continue
		}
		if strings.HasSuffix(line, "/") {
			line = path.Join("**", line, "**/*")
		} else if !strings.ContainsRune(line, '/') {
			line = path.Join("**", line)
		}
		ignore = append(ignore, line)
	}
	return ignore
}
