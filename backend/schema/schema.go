package schema

import (
	"crypto/sha256"
	"fmt"
	"strings"

	"github.com/alecthomas/types"
	"google.golang.org/protobuf/proto"

	schemapb "github.com/TBD54566975/ftl/protos/xyz/block/ftl/v1/schema"
)

type Schema struct {
	Pos Position `parser:"" protobuf:"1,optional"`

	Modules []*Module `parser:"@@*" protobuf:"2"`
}

var _ Node = (*Schema)(nil)

func (s *Schema) String() string {
	out := &strings.Builder{}
	for i, m := range s.Modules {
		if i != 0 {
			fmt.Fprintln(out)
		}
		fmt.Fprint(out, m)
	}
	return out.String()
}

func (s *Schema) schemaChildren() []Node {
	out := make([]Node, len(s.Modules))
	for i, m := range s.Modules {
		out[i] = m
	}
	return out
}

func (s *Schema) Hash() [sha256.Size]byte {
	return sha256.Sum256([]byte(s.String()))
}

func (s *Schema) ResolveDataRef(ref *DataRef) *Data {
	for _, module := range s.Modules {
		if module.Name == ref.Module {
			for _, decl := range module.Decls {
				if data, ok := decl.(*Data); ok && data.Name == ref.Name {
					return data
				}
			}
		}
	}
	return nil
}

func (s *Schema) ResolveVerbRef(ref *VerbRef) *Verb {
	for _, module := range s.Modules {
		if module.Name == ref.Module {
			for _, decl := range module.Decls {
				if verb, ok := decl.(*Verb); ok && verb.Name == ref.Name {
					return verb
				}
			}
		}
	}
	return nil
}

// Module returns the named module if it exists.
func (s *Schema) Module(name string) types.Option[*Module] {
	for _, module := range s.Modules {
		if module.Name == name {
			return types.Some(module)
		}
	}
	return types.None[*Module]()
}

func (s *Schema) DataMap() map[DataRef]*Data {
	dataTypes := map[DataRef]*Data{}
	for _, module := range s.Modules {
		for _, decl := range module.Decls {
			if data, ok := decl.(*Data); ok {
				dataTypes[DataRef{Module: module.Name, Name: data.Name}] = data
			}
		}
	}
	return dataTypes
}

// Upsert inserts or replaces a module.
func (s *Schema) Upsert(module *Module) {
	for i, m := range s.Modules {
		if m.Name == module.Name {
			s.Modules[i] = module
			return
		}
	}
	s.Modules = append(s.Modules, module)
}

func (s *Schema) ToProto() proto.Message {
	return &schemapb.Schema{
		Pos:     posToProto(s.Pos),
		Modules: nodeListToProto[*schemapb.Module](s.Modules),
	}
}

// FromProto converts a protobuf Schema to a Schema and validates it.
func FromProto(s *schemapb.Schema) (*Schema, error) {
	modules, err := moduleListToSchema(s.Modules)
	if err != nil {
		return nil, err
	}
	schema := &Schema{
		Modules: modules,
	}
	return Validate(schema)
}
