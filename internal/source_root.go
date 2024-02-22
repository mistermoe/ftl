package internal

import (
	"os"
	"os/exec" //nolint:depguard
	"strings"
)

// GitRoot returns the root of the git repository containing dir, or empty string if dir is not in a git repository.
//
// If dir is empty, the current working directory is used.
func GitRoot(dir string) string {
	if dir == "" {
		var err error
		dir, err = os.Getwd()
		if err != nil {
			return ""
		}
	}
	cmd := exec.Command("git", "rev-parse", "--show-toplevel")
	cmd.Dir = dir
	output, err := cmd.CombinedOutput()
	if err != nil {
		return ""
	}
	return strings.TrimSpace(string(output))
}
