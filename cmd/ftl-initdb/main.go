package main

import (
	"context"
	"os"

	"github.com/alecthomas/kong"

	"github.com/block/ftl/internal/dev"
	"github.com/block/ftl/internal/dsn"
	"github.com/block/ftl/internal/log"
)

var cli struct {
	log.Config
	Recreate bool   `help:"Drop and recreate the database."`
	DSN      string `help:"Postgres DSN." default:"${dsn}" env:"FTL_DSN"`
}

func main() {
	kctx := kong.Parse(&cli, kong.Vars{
		"dsn": dsn.PostgresDSN("ftl"),
	})
	ctx := log.ContextWithLogger(context.Background(), log.Configure(os.Stderr, cli.Config))
	conn, err := dev.CreateForDevel(ctx, cli.DSN, cli.Recreate)
	kctx.FatalIfErrorf(err)
	conn.Close()
}
