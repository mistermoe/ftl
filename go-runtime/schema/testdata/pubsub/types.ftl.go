// Code generated by FTL. DO NOT EDIT.
package pubsub

import (
	"context"
	"github.com/TBD54566975/ftl/go-runtime/ftl"
	"github.com/TBD54566975/ftl/go-runtime/ftl/reflection"
	"github.com/TBD54566975/ftl/go-runtime/server"
)

type BroadcastClient func(context.Context) error

type PayinClient func(context.Context) error

type ProcessBroadcastClient func(context.Context, PayinEvent) error

type ProcessPayinClient func(context.Context, PayinEvent) error

func init() {
	reflection.Register(
		reflection.ProvideResourcesForVerb(
			Broadcast,
			server.TopicHandle[PayinEvent, ftl.SinglePartitionMap[PayinEvent]]("pubsub", "publicBroadcast"),
		),
		reflection.ProvideResourcesForVerb(
			Payin,
			server.TopicHandle[PayinEvent, ftl.SinglePartitionMap[PayinEvent]]("pubsub", "payins"),
		),
		reflection.ProvideResourcesForVerb(
			ProcessBroadcast,
		),
		reflection.ProvideResourcesForVerb(
			ProcessPayin,
		),
	)
}
