package buildengine

import (
	"context"
	"fmt"
	"os"
	"path/filepath"

	"github.com/alecthomas/types/optional"
	"golang.org/x/sync/errgroup"

	"github.com/TBD54566975/ftl/internal/log"
	"github.com/TBD54566975/ftl/internal/moduleconfig"
	"github.com/TBD54566975/ftl/internal/schema"
)

var buildDirName = ".ftl"

// GenerateStubs generates stubs for the given modules.
//
// Currently, only Go stubs are supported. Kotlin and other language stubs can be added in the future.
func GenerateStubs(ctx context.Context, projectRoot string, modules []*schema.Module, metas map[string]moduleMeta) error {
	modulesByName := map[string]*schema.Module{}
	for _, module := range modules {
		modulesByName[module.Name] = module
	}
	metasByLanguage := map[string][]moduleMeta{}
	for _, meta := range metas {
		metasByLanguage[meta.module.Config.Language] = append(metasByLanguage[meta.module.Config.Language], meta)
	}
	wg, wgctx := errgroup.WithContext(ctx)
	for language, metasForLang := range metasByLanguage {
		for idx, module := range modules {
			// spread the load across plugins
			assignedMeta := metasForLang[idx%len(metasForLang)]
			config := metas[module.Name].module.Config
			wg.Go(func() error {
				path := stubsModuleDir(projectRoot, language, module.Name)
				err := os.MkdirAll(path, 0750)
				if err != nil {
					return fmt.Errorf("failed to create directory %s: %w", path, err)
				}
				var nativeConfig optional.Option[moduleconfig.ModuleConfig]
				if config.Module == "builtin" || config.Language != language {
					nativeConfig = optional.Some(assignedMeta.module.Config)
				}
				if err := assignedMeta.plugin.GenerateStubs(wgctx, path, module, config, nativeConfig); err != nil {
					return err //nolint:wrapcheck
				}
				return nil
			})
		}
	}
	err := wg.Wait()
	if err != nil {
		return fmt.Errorf("failed to generate language stubs: %w", err)
	}
	return nil
}

// CleanStubs removes all generated stubs.
func CleanStubs(ctx context.Context, projectRoot string) error {
	logger := log.FromContext(ctx)
	logger.Debugf("Deleting all generated stubs")
	sharedFtlDir := filepath.Join(projectRoot, buildDirName)

	// Wipe the modules directory to ensure we don't have any stale modules.
	err := os.RemoveAll(sharedFtlDir)
	if err != nil {
		return fmt.Errorf("failed to remove %s: %w", sharedFtlDir, err)
	}

	return nil
}

// SyncStubReferences syncs the references in the generated stubs.
//
// For Go, this means updating all the go.work files to include all known modules in the shared stubbed modules directory.
func SyncStubReferences(ctx context.Context, projectRoot string, moduleNames []string, metas map[string]moduleMeta) error {
	wg, wgctx := errgroup.WithContext(ctx)
	for _, meta := range metas {
		stubsRoot := stubsLanguageDir(projectRoot, meta.module.Config.Language)
		if err := meta.plugin.SyncStubReferences(wgctx, meta.module.Config, stubsRoot, moduleNames); err != nil {
			return err //nolint:wrapcheck
		}
		return nil
	}
	err := wg.Wait()
	if err != nil {
		return fmt.Errorf("failed to sync go stub references: %w", err)
	}
	return nil
}

// WriteGenericSchemaFiles writes <module>.pb schema files for the given modules to the GeneratedSchemaDir
func WriteGenericSchemaFiles(modules []*schema.Module, metas map[string]moduleMeta) error {
	sch := &schema.Schema{Modules: modules}
	for _, meta := range metas {
		module := meta.module.Config
		if module.GeneratedSchemaDir == "" {
			continue
		}

		modPath := module.Abs().GeneratedSchemaDir
		err := os.MkdirAll(modPath, 0750)
		if err != nil {
			return fmt.Errorf("failed to create directory %s: %w", modPath, err)
		}

		for _, mod := range sch.Modules {
			data, err := schema.ModuleToBytes(mod)
			if err != nil {
				return fmt.Errorf("failed to export module schema for module %s %w", mod.Name, err)
			}
			err = os.WriteFile(filepath.Join(modPath, mod.Name+".pb"), data, 0600)
			if err != nil {
				return fmt.Errorf("failed to write schema file for module %s %w", mod.Name, err)
			}
		}
	}
	return nil
}

func stubsLanguageDir(projectRoot, language string) string {
	return filepath.Join(projectRoot, buildDirName, language, "modules")
}

func stubsModuleDir(projectRoot, language, module string) string {
	return filepath.Join(stubsLanguageDir(projectRoot, language), module)
}
