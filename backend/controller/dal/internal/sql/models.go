// Code generated by sqlc. DO NOT EDIT.
// versions:
//   sqlc v1.27.0

package sql

import (
	"database/sql/driver"
	"encoding/json"
	"fmt"
	"time"

	"github.com/TBD54566975/ftl/backend/controller/encryption/api"
	"github.com/TBD54566975/ftl/backend/controller/sql/sqltypes"
	"github.com/TBD54566975/ftl/backend/schema"
	"github.com/TBD54566975/ftl/internal/model"
	"github.com/alecthomas/types/optional"
	"github.com/sqlc-dev/pqtype"
)

type AsyncCallState string

const (
	AsyncCallStatePending   AsyncCallState = "pending"
	AsyncCallStateExecuting AsyncCallState = "executing"
	AsyncCallStateSuccess   AsyncCallState = "success"
	AsyncCallStateError     AsyncCallState = "error"
)

func (e *AsyncCallState) Scan(src interface{}) error {
	switch s := src.(type) {
	case []byte:
		*e = AsyncCallState(s)
	case string:
		*e = AsyncCallState(s)
	default:
		return fmt.Errorf("unsupported scan type for AsyncCallState: %T", src)
	}
	return nil
}

type NullAsyncCallState struct {
	AsyncCallState AsyncCallState
	Valid          bool // Valid is true if AsyncCallState is not NULL
}

// Scan implements the Scanner interface.
func (ns *NullAsyncCallState) Scan(value interface{}) error {
	if value == nil {
		ns.AsyncCallState, ns.Valid = "", false
		return nil
	}
	ns.Valid = true
	return ns.AsyncCallState.Scan(value)
}

// Value implements the driver Valuer interface.
func (ns NullAsyncCallState) Value() (driver.Value, error) {
	if !ns.Valid {
		return nil, nil
	}
	return string(ns.AsyncCallState), nil
}

type ControllerState string

const (
	ControllerStateLive ControllerState = "live"
	ControllerStateDead ControllerState = "dead"
)

func (e *ControllerState) Scan(src interface{}) error {
	switch s := src.(type) {
	case []byte:
		*e = ControllerState(s)
	case string:
		*e = ControllerState(s)
	default:
		return fmt.Errorf("unsupported scan type for ControllerState: %T", src)
	}
	return nil
}

type NullControllerState struct {
	ControllerState ControllerState
	Valid           bool // Valid is true if ControllerState is not NULL
}

// Scan implements the Scanner interface.
func (ns *NullControllerState) Scan(value interface{}) error {
	if value == nil {
		ns.ControllerState, ns.Valid = "", false
		return nil
	}
	ns.Valid = true
	return ns.ControllerState.Scan(value)
}

// Value implements the driver Valuer interface.
func (ns NullControllerState) Value() (driver.Value, error) {
	if !ns.Valid {
		return nil, nil
	}
	return string(ns.ControllerState), nil
}

type FsmStatus string

const (
	FsmStatusRunning   FsmStatus = "running"
	FsmStatusCompleted FsmStatus = "completed"
	FsmStatusFailed    FsmStatus = "failed"
)

func (e *FsmStatus) Scan(src interface{}) error {
	switch s := src.(type) {
	case []byte:
		*e = FsmStatus(s)
	case string:
		*e = FsmStatus(s)
	default:
		return fmt.Errorf("unsupported scan type for FsmStatus: %T", src)
	}
	return nil
}

type NullFsmStatus struct {
	FsmStatus FsmStatus
	Valid     bool // Valid is true if FsmStatus is not NULL
}

// Scan implements the Scanner interface.
func (ns *NullFsmStatus) Scan(value interface{}) error {
	if value == nil {
		ns.FsmStatus, ns.Valid = "", false
		return nil
	}
	ns.Valid = true
	return ns.FsmStatus.Scan(value)
}

// Value implements the driver Valuer interface.
func (ns NullFsmStatus) Value() (driver.Value, error) {
	if !ns.Valid {
		return nil, nil
	}
	return string(ns.FsmStatus), nil
}

type Origin string

const (
	OriginIngress Origin = "ingress"
	OriginCron    Origin = "cron"
	OriginPubsub  Origin = "pubsub"
)

func (e *Origin) Scan(src interface{}) error {
	switch s := src.(type) {
	case []byte:
		*e = Origin(s)
	case string:
		*e = Origin(s)
	default:
		return fmt.Errorf("unsupported scan type for Origin: %T", src)
	}
	return nil
}

type NullOrigin struct {
	Origin Origin
	Valid  bool // Valid is true if Origin is not NULL
}

// Scan implements the Scanner interface.
func (ns *NullOrigin) Scan(value interface{}) error {
	if value == nil {
		ns.Origin, ns.Valid = "", false
		return nil
	}
	ns.Valid = true
	return ns.Origin.Scan(value)
}

// Value implements the driver Valuer interface.
func (ns NullOrigin) Value() (driver.Value, error) {
	if !ns.Valid {
		return nil, nil
	}
	return string(ns.Origin), nil
}

type TopicSubscriptionState string

const (
	TopicSubscriptionStateIdle      TopicSubscriptionState = "idle"
	TopicSubscriptionStateExecuting TopicSubscriptionState = "executing"
)

func (e *TopicSubscriptionState) Scan(src interface{}) error {
	switch s := src.(type) {
	case []byte:
		*e = TopicSubscriptionState(s)
	case string:
		*e = TopicSubscriptionState(s)
	default:
		return fmt.Errorf("unsupported scan type for TopicSubscriptionState: %T", src)
	}
	return nil
}

type NullTopicSubscriptionState struct {
	TopicSubscriptionState TopicSubscriptionState
	Valid                  bool // Valid is true if TopicSubscriptionState is not NULL
}

// Scan implements the Scanner interface.
func (ns *NullTopicSubscriptionState) Scan(value interface{}) error {
	if value == nil {
		ns.TopicSubscriptionState, ns.Valid = "", false
		return nil
	}
	ns.Valid = true
	return ns.TopicSubscriptionState.Scan(value)
}

// Value implements the driver Valuer interface.
func (ns NullTopicSubscriptionState) Value() (driver.Value, error) {
	if !ns.Valid {
		return nil, nil
	}
	return string(ns.TopicSubscriptionState), nil
}

type AsyncCall struct {
	ID                int64
	CreatedAt         time.Time
	LeaseID           optional.Option[int64]
	Verb              schema.RefKey
	State             AsyncCallState
	Origin            string
	ScheduledAt       time.Time
	Request           api.EncryptedAsyncColumn
	Response          api.OptionalEncryptedAsyncColumn
	Error             optional.Option[string]
	RemainingAttempts int32
	Backoff           sqltypes.Duration
	MaxBackoff        sqltypes.Duration
	CatchVerb         optional.Option[schema.RefKey]
	Catching          bool
	ParentRequestKey  optional.Option[string]
	TraceContext      pqtype.NullRawMessage
}

type Controller struct {
	ID       int64
	Key      model.ControllerKey
	Created  time.Time
	LastSeen time.Time
	State    ControllerState
	Endpoint string
}

type CronJob struct {
	ID              int64
	Key             model.CronJobKey
	DeploymentID    int64
	Verb            string
	Schedule        string
	StartTime       time.Time
	NextExecution   time.Time
	ModuleName      string
	LastExecution   optional.Option[time.Time]
	LastAsyncCallID optional.Option[int64]
}

type Deployment struct {
	ID          int64
	CreatedAt   time.Time
	ModuleID    int64
	Key         model.DeploymentKey
	Schema      *schema.Module
	Labels      json.RawMessage
	MinReplicas int32
}

type FsmInstance struct {
	ID               int64
	CreatedAt        time.Time
	Fsm              schema.RefKey
	Key              string
	Status           FsmStatus
	CurrentState     optional.Option[schema.RefKey]
	DestinationState optional.Option[schema.RefKey]
	AsyncCallID      optional.Option[int64]
	UpdatedAt        time.Time
}

type FsmNextEvent struct {
	ID            int64
	CreatedAt     time.Time
	FsmInstanceID int64
	NextState     schema.RefKey
	Request       api.EncryptedAsyncColumn
	RequestType   sqltypes.Type
}

type Module struct {
	ID       int64
	Language string
	Name     string
}

type Topic struct {
	ID        int64
	Key       model.TopicKey
	CreatedAt time.Time
	ModuleID  int64
	Name      string
	Type      string
	Head      optional.Option[int64]
}

type TopicEvent struct {
	ID           int64
	CreatedAt    time.Time
	Key          model.TopicEventKey
	TopicID      int64
	Payload      api.EncryptedAsyncColumn
	Caller       optional.Option[string]
	RequestKey   optional.Option[string]
	TraceContext pqtype.NullRawMessage
}

type TopicSubscription struct {
	ID           int64
	Key          model.SubscriptionKey
	CreatedAt    time.Time
	TopicID      int64
	ModuleID     int64
	DeploymentID int64
	Name         string
	Cursor       optional.Option[int64]
	State        TopicSubscriptionState
}
