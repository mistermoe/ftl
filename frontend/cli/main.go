package main

import (
	"context"
	"errors"
	"fmt"
	"net/url"
	"os"
	"os/signal"
	"path/filepath"
	"runtime"
	"runtime/trace"
	"strconv"
	"syscall"

	"github.com/alecthomas/kong"
	kongtoml "github.com/alecthomas/kong-toml"
	"github.com/alecthomas/types/optional"
	kongcompletion "github.com/jotaen/kong-completion"

	"github.com/block/ftl"
	"github.com/block/ftl/backend/admin"
	"github.com/block/ftl/backend/protos/xyz/block/ftl/lease/v1/leasepbconnect"
	provisionerconnect "github.com/block/ftl/backend/protos/xyz/block/ftl/provisioner/v1beta1/provisionerpbconnect"
	"github.com/block/ftl/backend/protos/xyz/block/ftl/v1/ftlv1connect"
	"github.com/block/ftl/backend/timeline"
	"github.com/block/ftl/internal"
	_ "github.com/block/ftl/internal/automaxprocs" // Set GOMAXPROCS to match Linux container CPU quota.
	"github.com/block/ftl/internal/configuration"
	"github.com/block/ftl/internal/configuration/manager"
	"github.com/block/ftl/internal/configuration/providers"
	"github.com/block/ftl/internal/dsn"
	"github.com/block/ftl/internal/log"
	"github.com/block/ftl/internal/profiles"
	"github.com/block/ftl/internal/projectconfig"
	"github.com/block/ftl/internal/rpc"
	"github.com/block/ftl/internal/schema/schemaeventsource"
	"github.com/block/ftl/internal/terminal"
)

type InteractiveCLI struct {
	Version             kong.VersionFlag `help:"Show version."`
	Endpoint            *url.URL         `default:"http://127.0.0.1:8892" help:"FTL endpoint to bind/connect to." env:"FTL_ENDPOINT"`
	ProvisionerEndpoint *url.URL         `help:"Provisioner endpoint." env:"FTL_PROVISIONER_ENDPOINT" default:"http://127.0.0.1:8893"`
	TimelineEndpoint    *url.URL         `help:"Timeline endpoint." env:"FTL_TIMELINE_ENDPOINT" default:"http://127.0.0.1:8894"`
	LeaseEndpoint       *url.URL         `help:"Lease endpoint." env:"FTL_LEASE_ENDPOINT" default:"http://127.0.0.1:8895"`
	AdminEndpoint       *url.URL         `help:"Admin endpoint." env:"FTL_ADMIN_ENDPOINT" default:"http://127.0.0.1:8896"`
	Trace               string           `help:"File to write golang runtime/trace output to." hidden:""`

	Ping     pingCmd     `cmd:"" help:"Ping the FTL cluster."`
	Status   statusCmd   `cmd:"" help:"Show FTL status."`
	Init     initCmd     `cmd:"" help:"Initialize a new FTL project."`
	Profile  profileCmd  `cmd:"" help:"Manage profiles."`
	New      newCmd      `cmd:"" help:"Create a new FTL module. See language specific flags with 'ftl new <language> --help'."`
	PS       psCmd       `cmd:"" help:"List deployments."`
	Call     callCmd     `cmd:"" help:"Call an FTL function."`
	Bench    benchCmd    `cmd:"" help:"Benchmark an FTL function."`
	Replay   replayCmd   `cmd:"" help:"Call an FTL function with the same request body as the last invocation."`
	Update   updateCmd   `cmd:"" help:"Update a deployment."`
	Kill     killCmd     `cmd:"" help:"Kill a deployment."`
	Schema   schemaCmd   `cmd:"" help:"FTL schema commands."`
	Build    buildCmd    `cmd:"" help:"Build all modules found in the specified directories."`
	Deploy   deployCmd   `cmd:"" help:"Build and deploy all modules found in the specified directories."`
	Download downloadCmd `cmd:"" help:"Download a deployment."`
	Secret   secretCmd   `cmd:"" help:"Manage secrets."`
	Config   configCmd   `cmd:"" help:"Manage configuration."`
	Pubsub   pubsubCmd   `cmd:"" help:"Manage pub/sub."`
	Release  releaseCmd  `cmd:"" help:"Manage releases."`
}

type CLI struct {
	InteractiveCLI
	LogConfig  log.Config `embed:"" prefix:"log-" group:"Logging:"`
	ConfigFlag string     `name:"config" short:"C" help:"Path to FTL project configuration file." env:"FTL_CONFIG" placeholder:"FILE"`

	Authenticators map[string]string `help:"Authenticators to use for FTL endpoints." mapsep:"," env:"FTL_AUTHENTICATORS" placeholder:"HOST=EXE,…"`
	Insecure       bool              `help:"Skip TLS certificate verification. Caution: susceptible to machine-in-the-middle attacks."`
	Plain          bool              `help:"Use a plain console with no color or status line." env:"FTL_PLAIN"`

	Interactive interactiveCmd            `cmd:"" help:"Interactive mode." default:""`
	Dev         devCmd                    `cmd:"" help:"Develop FTL modules. Will start the FTL cluster, build and deploy all modules found in the specified directories, and watch for changes."`
	Serve       serveCmd                  `cmd:"" help:"Start the FTL server."`
	Completion  kongcompletion.Completion `cmd:"" help:"Outputs shell code for initialising tab completions."`

	// Specify the 1Password vault to access secrets from.
	Vault string `name:"opvault" help:"1Password vault to be used for secrets. The name of the 1Password item will be the <ref> and the secret will be stored in the password field." placeholder:"VAULT"`
}

var cli CLI

func main() {
	ctx, cancel := context.WithCancel(context.Background())
	csm := &currentStatusManager{}

	app := createKongApplication(&cli, csm)

	// Dynamically update the kong app with language specific flags for the "ftl new" command.
	languagePlugin, err := prepareNewCmd(log.ContextWithNewDefaultLogger(ctx), app, os.Args[1:])
	app.FatalIfErrorf(err)
	if plugin, ok := languagePlugin.Get(); ok {
		// Kill the plugin when the app exits due to an error, or after showing help.
		addToExit(app, func(code int) {
			_ = plugin.Kill() //nolint:errcheck
		})
	}

	kctx, err := app.Parse(os.Args[1:])
	app.FatalIfErrorf(err)

	if cli.Trace != "" {
		file, err := os.OpenFile(cli.Trace, os.O_CREATE|os.O_WRONLY, 0644) // #nosec
		if err != nil {
			kctx.Fatalf("failed to open trace file: %s", err.Error())
		}
		err = trace.Start(file)
		if err != nil {
			kctx.Fatalf("failed to start tracing: %s", err.Error())
			return
		}
		defer trace.Stop()
	}

	if plugin, ok := languagePlugin.Get(); ok {
		// Plugins take time to launch, so we bind the "ftl new" plugin to the kong context.
		kctx.Bind(plugin)
	}

	if !cli.Plain {
		sm := terminal.NewStatusManager(ctx)
		csm.statusManager = optional.Some(sm)
		ctx = sm.IntoContext(ctx)
		defer sm.Close()
	}
	rpc.InitialiseClients(cli.Authenticators, cli.Insecure)

	// Set some envars for child processes.
	os.Setenv("LOG_LEVEL", cli.LogConfig.Level.String())

	configPath := cli.ConfigFlag
	if configPath == "" {
		var ok bool
		configPath, ok = projectconfig.DefaultConfigPath().Get()
		if !ok {
			kctx.Fatalf("could not determine default config path, either place an ftl-project.toml file in the root of your project, use --config=FILE, or set the FTL_CONFIG envar")
		}
	}
	if terminal.IsANSITerminal(ctx) {
		cli.LogConfig.Color = true
	}

	logger := log.Configure(os.Stderr, cli.LogConfig)
	ctx = log.ContextWithLogger(ctx, logger)

	if cli.Insecure {
		logger.Warnf("--insecure skips TLS certificate verification")
	}

	os.Setenv("FTL_CONFIG", configPath)

	// Handle signals.
	sigch := make(chan os.Signal, 1)
	signal.Notify(sigch, syscall.SIGINT, syscall.SIGTERM)
	go func() {
		sig := <-sigch
		logger.Debugf("FTL terminating with signal %s", sig)
		cancel()
		_ = syscall.Kill(-syscall.Getpid(), sig.(syscall.Signal)) //nolint:forcetypeassert,errcheck // best effort
		os.Exit(0)
	}()

	bindContext := makeBindContext(logger, cancel)
	ctx = bindContext(ctx, kctx)

	err = kctx.Run(ctx)
	kctx.FatalIfErrorf(err)
}

func createKongApplication(cli any, csm *currentStatusManager) *kong.Kong {
	gitRoot, _ := internal.GitRoot(".").Get()
	app := kong.Must(cli,
		kong.Description(`FTL - Towards a 𝝺-calculus for large-scale systems`),
		kong.Configuration(kongtoml.Loader, ".ftl.toml", "~/.ftl.toml"),
		kong.ShortUsageOnError(),
		kong.HelpOptions{Compact: true, WrapUpperBound: 80},
		kong.AutoGroup(func(parent kong.Visitable, flag *kong.Flag) *kong.Group {
			node, ok := parent.(*kong.Command)
			if !ok {
				return nil
			}
			return &kong.Group{Key: node.Name, Title: "Command flags:"}
		}),
		kong.Vars{
			"version": ftl.FormattedVersion,
			"os":      runtime.GOOS,
			"arch":    runtime.GOARCH,
			"numcpu":  strconv.Itoa(runtime.NumCPU()),
			"gitroot": gitRoot,
			"dsn":     dsn.PostgresDSN("ftl"),
		},
		kong.Exit(func(code int) {
			if sm, ok := csm.statusManager.Get(); ok {
				sm.Close()
			}
			os.Exit(code)
		},
		))
	return app
}

func addToExit(k *kong.Kong, cleanup func(code int)) {
	originalExit := k.Exit
	k.Exit = func(code int) {
		cleanup(code)
		if originalExit == nil {
			// Should not happen, but no harm being cautious
			os.Exit(code)
		}
		originalExit(code)
	}
}

func makeBindContext(logger *log.Logger, cancel context.CancelFunc) terminal.KongContextBinder {
	var bindContext terminal.KongContextBinder
	bindContext = func(ctx context.Context, kctx *kong.Context) context.Context {
		err := kctx.BindToProvider(func(cli *CLI) (projectconfig.Config, error) {
			config, err := projectconfig.Load(ctx, cli.ConfigFlag)
			if err != nil && !errors.Is(err, os.ErrNotExist) {
				return config, fmt.Errorf("%w", err)
			}
			return config, nil
		})
		kctx.FatalIfErrorf(err)
		kctx.Bind(logger)

		schemaServiceClient := rpc.Dial(ftlv1connect.NewSchemaServiceClient, cli.Endpoint.String(), log.Error)
		ctx = rpc.ContextWithClient(ctx, schemaServiceClient)
		kctx.BindTo(schemaServiceClient, (*ftlv1connect.SchemaServiceClient)(nil))

		// Bind a factory function that creates a new schema event source, as the event source cannot be reused.
		err = kctx.BindToProvider(func(client ftlv1connect.SchemaServiceClient) (func() schemaeventsource.EventSource, error) {
			return func() schemaeventsource.EventSource { return schemaeventsource.New(ctx, schemaServiceClient) }, nil
		})
		kctx.FatalIfErrorf(err)

		controllerServiceClient := rpc.Dial(ftlv1connect.NewControllerServiceClient, cli.Endpoint.String(), log.Error)
		ctx = rpc.ContextWithClient(ctx, controllerServiceClient)
		kctx.BindTo(controllerServiceClient, (*ftlv1connect.ControllerServiceClient)(nil))

		provisionerServiceClient := rpc.Dial(provisionerconnect.NewProvisionerServiceClient, cli.ProvisionerEndpoint.String(), log.Error)
		ctx = rpc.ContextWithClient(ctx, provisionerServiceClient)
		kctx.BindTo(provisionerServiceClient, (*provisionerconnect.ProvisionerServiceClient)(nil))

		timelineClient := timeline.NewClient(ctx, cli.TimelineEndpoint)
		kctx.Bind(timelineClient)

		leaseClient := rpc.Dial(leasepbconnect.NewLeaseServiceClient, cli.LeaseEndpoint.String(), log.Error)
		ctx = rpc.ContextWithClient(ctx, leaseClient)
		kctx.BindTo(leaseClient, (*leasepbconnect.LeaseServiceClient)(nil))

		adminClient := rpc.Dial(ftlv1connect.NewAdminServiceClient, cli.AdminEndpoint.String(), log.Error)
		ctx = rpc.ContextWithClient(ctx, adminClient)
		kctx.BindTo(adminClient, (*ftlv1connect.AdminServiceClient)(nil))

		err = kctx.BindToProvider(func() (*providers.Registry[configuration.Configuration], error) {
			return providers.NewDefaultConfigRegistry(), nil
		})
		kctx.FatalIfErrorf(err)

		err = kctx.BindToProvider(func(cli *CLI, projectConfig projectconfig.Config) (*providers.Registry[configuration.Secrets], error) {
			return providers.NewDefaultSecretsRegistry(projectConfig, cli.Vault), nil
		})
		kctx.FatalIfErrorf(err)

		kongcompletion.Register(kctx.Kong, kongcompletion.WithPredictors(terminal.Predictors(schemaeventsource.New(ctx, schemaServiceClient).ViewOnly())))

		verbServiceClient := rpc.Dial(ftlv1connect.NewVerbServiceClient, cli.Endpoint.String(), log.Error)
		ctx = rpc.ContextWithClient(ctx, verbServiceClient)
		kctx.BindTo(verbServiceClient, (*ftlv1connect.VerbServiceClient)(nil))

		err = kctx.BindToProvider(manager.NewDefaultConfigurationManagerFromConfig)
		kctx.FatalIfErrorf(err)

		err = kctx.BindToProvider(manager.NewDefaultSecretsManagerFromConfig)
		kctx.FatalIfErrorf(err)

		err = kctx.BindToProvider(func(projectConfig projectconfig.Config, secretsRegistry *providers.Registry[configuration.Secrets], configRegistry *providers.Registry[configuration.Configuration]) (*profiles.Project, error) {
			return profiles.Open(filepath.Dir(projectConfig.Path), secretsRegistry, configRegistry)
		})
		kctx.FatalIfErrorf(err)

		err = kctx.BindToProvider(provideAdminClient)
		kctx.FatalIfErrorf(err)

		kctx.Bind(cli.Endpoint)
		kctx.BindTo(ctx, (*context.Context)(nil))
		kctx.Bind(bindContext)
		kctx.BindTo(cancel, (*context.CancelFunc)(nil))
		return ctx
	}
	return bindContext
}

type currentStatusManager struct {
	statusManager optional.Option[terminal.StatusManager]
}

func provideAdminClient(
	ctx context.Context,
	cli *CLI,
	cm *manager.Manager[configuration.Configuration],
	sm *manager.Manager[configuration.Secrets],
	adminClient ftlv1connect.AdminServiceClient,
) (client admin.Client, err error) {
	shouldUseLocalClient, err := admin.ShouldUseLocalClient(ctx, adminClient, cli.AdminEndpoint)
	if err != nil {
		return client, fmt.Errorf("could not create admin client: %w", err)
	}
	if shouldUseLocalClient {
		return admin.NewLocalClient(cm, sm), nil
	}
	return adminClient, nil
}
