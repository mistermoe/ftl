package schema

import (
	schemapb "github.com/block/ftl/common/protos/xyz/block/ftl/schema/v1"
)

type TypeParameter struct {
	Pos Position `parser:"" protobuf:"1,optional"`

	Name string `parser:"@Ident" protobuf:"2"`
}

var _ Symbol = (*TypeParameter)(nil)

func (t *TypeParameter) Position() Position { return t.Pos }
func (t *TypeParameter) String() string     { return t.Name }

func (t *TypeParameter) schemaChildren() []Node { return nil }
func (t *TypeParameter) schemaSymbol()          {}
func (t *TypeParameter) GetName() string        { return t.Name }

func typeParametersToSchema(s []*schemapb.TypeParameter) []*TypeParameter {
	var out []*TypeParameter
	for _, n := range s {
		out = append(out, &TypeParameter{
			Pos:  PosFromProto(n.Pos),
			Name: n.Name,
		})
	}
	return out
}
