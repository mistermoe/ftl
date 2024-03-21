package buildengine

import (
	"context"
	"os"
	"testing"

	"github.com/TBD54566975/ftl/backend/schema"
	"github.com/TBD54566975/ftl/internal/log"
	"github.com/alecthomas/assert/v2"
)

func TestGenerateGoModule(t *testing.T) {
	sch := &schema.Schema{
		Modules: []*schema.Module{
			schema.Builtins(),
			{Name: "other", Decls: []schema.Decl{
				&schema.Enum{
					Name: "Color",
					Type: &schema.String{},
					Variants: []*schema.EnumVariant{
						{Name: "Red", Value: &schema.StringValue{Value: "Red"}},
						{Name: "Blue", Value: &schema.StringValue{Value: "Blue"}},
						{Name: "Green", Value: &schema.StringValue{Value: "Green"}},
					},
				},
				&schema.Enum{
					Name: "ColorInt",
					Type: &schema.Int{},
					Variants: []*schema.EnumVariant{
						{Name: "RedInt", Value: &schema.IntValue{Value: 0}},
						{Name: "BlueInt", Value: &schema.IntValue{Value: 1}},
						{Name: "GreenInt", Value: &schema.IntValue{Value: 2}},
					},
				},
				&schema.Data{Name: "EchoRequest"},
				&schema.Data{Name: "EchoResponse"},
				&schema.Verb{
					Name:     "echo",
					Request:  &schema.Ref{Name: "EchoRequest"},
					Response: &schema.Ref{Name: "EchoResponse"},
				},
				&schema.Data{Name: "SinkReq"},
				&schema.Verb{
					Name:     "sink",
					Request:  &schema.Ref{Name: "SinkReq"},
					Response: &schema.Unit{},
				},
				&schema.Data{Name: "SourceResp"},
				&schema.Verb{
					Name:     "source",
					Request:  &schema.Unit{},
					Response: &schema.Ref{Name: "SourceResp"},
				},
				&schema.Verb{
					Name:     "nothing",
					Request:  &schema.Unit{},
					Response: &schema.Unit{},
				},
			}},
			{Name: "test"},
		},
	}
	expected := `// Code generated by FTL. DO NOT EDIT.

//ftl:module other
package other

import (
  "context"
  "github.com/TBD54566975/ftl/go-runtime/ftl"
)

var _ = context.Background

//ftl:enum
type Color string
const (
  Red Color = "Red"
  Blue Color = "Blue"
  Green Color = "Green"
)

//ftl:enum
type ColorInt int
const (
  RedInt ColorInt = 0
  BlueInt ColorInt = 1
  GreenInt ColorInt = 2
)

type EchoRequest struct {
}

type EchoResponse struct {
}

//ftl:verb
func Echo(context.Context, EchoRequest) (EchoResponse, error) {
  panic("Verb stubs should not be called directly, instead use github.com/TBD54566975/ftl/runtime-go/ftl.Call()")
}

type SinkReq struct {
}

//ftl:verb
func Sink(context.Context, SinkReq) error {
  panic("Verb stubs should not be called directly, instead use github.com/TBD54566975/ftl/runtime-go/ftl.CallSink()")
}

type SourceResp struct {
}

//ftl:verb
func Source(context.Context) (SourceResp, error) {
  panic("Verb stubs should not be called directly, instead use github.com/TBD54566975/ftl/runtime-go/ftl.CallSource()")
}

//ftl:verb
func Nothing(context.Context) error {
  panic("Verb stubs should not be called directly, instead use github.com/TBD54566975/ftl/runtime-go/ftl.CallEmpty()")
}
`
	bctx := buildContext{
		moduleDir: "testdata/modules/another",
		buildDir:  "_ftl",
		sch:       sch,
	}
	testBuild(t, bctx, []assertion{
		assertGeneratedModule("go/modules/other/external_module.go", expected),
	})
}

func TestMetadataImportsExcluded(t *testing.T) {
	sch := &schema.Schema{
		Modules: []*schema.Module{
			schema.Builtins(),
			{Name: "test", Decls: []schema.Decl{
				&schema.Data{Name: "Req"},
				&schema.Data{Name: "Resp"},
				&schema.Verb{
					Name:     "call",
					Request:  &schema.Ref{Name: "Req"},
					Response: &schema.Ref{Name: "Resp"},
					Metadata: []schema.Metadata{
						&schema.MetadataCalls{Calls: []*schema.Ref{{Name: "verb", Module: "other"}}},
					},
				},
			}},
		},
	}
	expected := `// Code generated by FTL. DO NOT EDIT.

//ftl:module test
package test

import (
  "context"
)

var _ = context.Background

type Req struct {
}

type Resp struct {
}

//ftl:verb
func Call(context.Context, Req) (Resp, error) {
  panic("Verb stubs should not be called directly, instead use github.com/TBD54566975/ftl/runtime-go/ftl.Call()")
}
`
	bctx := buildContext{
		moduleDir: "testdata/modules/another",
		buildDir:  "_ftl",
		sch:       sch,
	}
	testBuild(t, bctx, []assertion{
		assertGeneratedModule("go/modules/test/external_module.go", expected),
	})
}

func TestExternalType(t *testing.T) {
	moduleDir := "testdata/modules/external"
	buildDir := "_ftl"

	ctx := log.ContextWithLogger(context.Background(), log.Configure(os.Stderr, log.Config{}))
	module, err := LoadModule(ctx, moduleDir)
	assert.NoError(t, err)

	sch := &schema.Schema{}
	err = Build(ctx, sch, module)
	assert.Contains(t, err.Error(), "field Month: unsupported external type time.Month")

	err = os.RemoveAll(buildDir)
	assert.NoError(t, err, "Error removing build directory")
}
