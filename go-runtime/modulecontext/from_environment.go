package modulecontext

import (
	"context"
	"fmt"
	"os"
	"strings"

	cf "github.com/TBD54566975/ftl/common/configuration"
)

// UpdateFromEnvironment adds configs, secrets and databases from the environment.
//
// This is useful for testing and development, where the environment is used to provide
// configurations, secrets and DSNs. The context is built from a combination of
// the ftl-project.toml file and (for now) environment variables.
func (b *Builder) UpdateFromEnvironment(ctx context.Context) (*Builder, error) {
	// TODO: split this func into separate purposes: explicitly reading a particular project file, and reading DSNs from environment
	cm, err := cf.NewDefaultConfigurationManagerFromEnvironment(ctx)
	if err != nil {
		return &Builder{}, err
	}
	configs, err := cm.MapForModule(ctx, b.module)
	if err != nil {
		return &Builder{}, err
	}
	for name, data := range configs {
		b.configs[name] = data
	}

	sm, err := cf.NewDefaultSecretsManagerFromEnvironment(ctx)
	if err != nil {
		return &Builder{}, err
	}
	secrets, err := sm.MapForModule(ctx, b.module)
	if err != nil {
		return &Builder{}, err
	}
	for name, data := range secrets {
		b.secrets[name] = data
	}

	for _, entry := range os.Environ() {
		if !strings.HasPrefix(entry, "FTL_POSTGRES_DSN_") {
			continue
		}
		parts := strings.SplitN(entry, "=", 2)
		if len(parts) != 2 {
			return &Builder{}, fmt.Errorf("invalid DSN environment variable: %s", entry)
		}
		key := parts[0]
		value := parts[1]
		// FTL_POSTGRES_DSN_MODULE_DBNAME
		parts = strings.Split(key, "_")
		if len(parts) != 5 {
			return &Builder{}, fmt.Errorf("invalid DSN environment variable: %s", entry)
		}
		moduleName := parts[3]
		dbName := parts[4]
		if !strings.EqualFold(moduleName, b.module) {
			continue
		}
		dbName = strings.ToLower(dbName)
		db, err := NewDatabase(DBTypePostgres, value)
		if err != nil {
			return &Builder{}, fmt.Errorf("could not create database %q with DSN %q: %w", dbName, value, err)
		}
		b.databases[dbName] = db
	}
	return b, nil
}
