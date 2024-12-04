// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.35.2
// 	protoc        (unknown)
// source: xyz/block/ftl/timeline/v1/timeline.proto

package timelinev1

import (
	v1 "github.com/TBD54566975/ftl/backend/protos/xyz/block/ftl/v1"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type GetTimelineRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	DeploymentKey string      `protobuf:"bytes,1,opt,name=deployment_key,json=deploymentKey,proto3" json:"deployment_key,omitempty"`
	SinceId       *int64      `protobuf:"varint,2,opt,name=since_id,json=sinceId,proto3,oneof" json:"since_id,omitempty"`
	Limit         *int32      `protobuf:"varint,3,opt,name=limit,proto3,oneof" json:"limit,omitempty"`
	EventTypes    []EventType `protobuf:"varint,4,rep,packed,name=event_types,json=eventTypes,proto3,enum=xyz.block.ftl.timeline.v1.EventType" json:"event_types,omitempty"`
}

func (x *GetTimelineRequest) Reset() {
	*x = GetTimelineRequest{}
	mi := &file_xyz_block_ftl_timeline_v1_timeline_proto_msgTypes[0]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *GetTimelineRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetTimelineRequest) ProtoMessage() {}

func (x *GetTimelineRequest) ProtoReflect() protoreflect.Message {
	mi := &file_xyz_block_ftl_timeline_v1_timeline_proto_msgTypes[0]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetTimelineRequest.ProtoReflect.Descriptor instead.
func (*GetTimelineRequest) Descriptor() ([]byte, []int) {
	return file_xyz_block_ftl_timeline_v1_timeline_proto_rawDescGZIP(), []int{0}
}

func (x *GetTimelineRequest) GetDeploymentKey() string {
	if x != nil {
		return x.DeploymentKey
	}
	return ""
}

func (x *GetTimelineRequest) GetSinceId() int64 {
	if x != nil && x.SinceId != nil {
		return *x.SinceId
	}
	return 0
}

func (x *GetTimelineRequest) GetLimit() int32 {
	if x != nil && x.Limit != nil {
		return *x.Limit
	}
	return 0
}

func (x *GetTimelineRequest) GetEventTypes() []EventType {
	if x != nil {
		return x.EventTypes
	}
	return nil
}

type GetTimelineResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Events []*Event `protobuf:"bytes,1,rep,name=events,proto3" json:"events,omitempty"`
}

func (x *GetTimelineResponse) Reset() {
	*x = GetTimelineResponse{}
	mi := &file_xyz_block_ftl_timeline_v1_timeline_proto_msgTypes[1]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *GetTimelineResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetTimelineResponse) ProtoMessage() {}

func (x *GetTimelineResponse) ProtoReflect() protoreflect.Message {
	mi := &file_xyz_block_ftl_timeline_v1_timeline_proto_msgTypes[1]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetTimelineResponse.ProtoReflect.Descriptor instead.
func (*GetTimelineResponse) Descriptor() ([]byte, []int) {
	return file_xyz_block_ftl_timeline_v1_timeline_proto_rawDescGZIP(), []int{1}
}

func (x *GetTimelineResponse) GetEvents() []*Event {
	if x != nil {
		return x.Events
	}
	return nil
}

type CreateEventRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to Entry:
	//
	//	*CreateEventRequest_Log
	//	*CreateEventRequest_Call
	//	*CreateEventRequest_DeploymentCreated
	//	*CreateEventRequest_DeploymentUpdated
	//	*CreateEventRequest_Ingress
	//	*CreateEventRequest_CronScheduled
	//	*CreateEventRequest_AsyncExecute
	//	*CreateEventRequest_PubsubPublish
	//	*CreateEventRequest_PubsubConsume
	Entry isCreateEventRequest_Entry `protobuf_oneof:"entry"`
}

func (x *CreateEventRequest) Reset() {
	*x = CreateEventRequest{}
	mi := &file_xyz_block_ftl_timeline_v1_timeline_proto_msgTypes[2]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *CreateEventRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateEventRequest) ProtoMessage() {}

func (x *CreateEventRequest) ProtoReflect() protoreflect.Message {
	mi := &file_xyz_block_ftl_timeline_v1_timeline_proto_msgTypes[2]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateEventRequest.ProtoReflect.Descriptor instead.
func (*CreateEventRequest) Descriptor() ([]byte, []int) {
	return file_xyz_block_ftl_timeline_v1_timeline_proto_rawDescGZIP(), []int{2}
}

func (m *CreateEventRequest) GetEntry() isCreateEventRequest_Entry {
	if m != nil {
		return m.Entry
	}
	return nil
}

func (x *CreateEventRequest) GetLog() *LogEvent {
	if x, ok := x.GetEntry().(*CreateEventRequest_Log); ok {
		return x.Log
	}
	return nil
}

func (x *CreateEventRequest) GetCall() *CallEvent {
	if x, ok := x.GetEntry().(*CreateEventRequest_Call); ok {
		return x.Call
	}
	return nil
}

func (x *CreateEventRequest) GetDeploymentCreated() *DeploymentCreatedEvent {
	if x, ok := x.GetEntry().(*CreateEventRequest_DeploymentCreated); ok {
		return x.DeploymentCreated
	}
	return nil
}

func (x *CreateEventRequest) GetDeploymentUpdated() *DeploymentUpdatedEvent {
	if x, ok := x.GetEntry().(*CreateEventRequest_DeploymentUpdated); ok {
		return x.DeploymentUpdated
	}
	return nil
}

func (x *CreateEventRequest) GetIngress() *IngressEvent {
	if x, ok := x.GetEntry().(*CreateEventRequest_Ingress); ok {
		return x.Ingress
	}
	return nil
}

func (x *CreateEventRequest) GetCronScheduled() *CronScheduledEvent {
	if x, ok := x.GetEntry().(*CreateEventRequest_CronScheduled); ok {
		return x.CronScheduled
	}
	return nil
}

func (x *CreateEventRequest) GetAsyncExecute() *AsyncExecuteEvent {
	if x, ok := x.GetEntry().(*CreateEventRequest_AsyncExecute); ok {
		return x.AsyncExecute
	}
	return nil
}

func (x *CreateEventRequest) GetPubsubPublish() *PubSubPublishEvent {
	if x, ok := x.GetEntry().(*CreateEventRequest_PubsubPublish); ok {
		return x.PubsubPublish
	}
	return nil
}

func (x *CreateEventRequest) GetPubsubConsume() *PubSubConsumeEvent {
	if x, ok := x.GetEntry().(*CreateEventRequest_PubsubConsume); ok {
		return x.PubsubConsume
	}
	return nil
}

type isCreateEventRequest_Entry interface {
	isCreateEventRequest_Entry()
}

type CreateEventRequest_Log struct {
	Log *LogEvent `protobuf:"bytes,1,opt,name=log,proto3,oneof"`
}

type CreateEventRequest_Call struct {
	Call *CallEvent `protobuf:"bytes,2,opt,name=call,proto3,oneof"`
}

type CreateEventRequest_DeploymentCreated struct {
	DeploymentCreated *DeploymentCreatedEvent `protobuf:"bytes,3,opt,name=deployment_created,json=deploymentCreated,proto3,oneof"`
}

type CreateEventRequest_DeploymentUpdated struct {
	DeploymentUpdated *DeploymentUpdatedEvent `protobuf:"bytes,4,opt,name=deployment_updated,json=deploymentUpdated,proto3,oneof"`
}

type CreateEventRequest_Ingress struct {
	Ingress *IngressEvent `protobuf:"bytes,5,opt,name=ingress,proto3,oneof"`
}

type CreateEventRequest_CronScheduled struct {
	CronScheduled *CronScheduledEvent `protobuf:"bytes,6,opt,name=cron_scheduled,json=cronScheduled,proto3,oneof"`
}

type CreateEventRequest_AsyncExecute struct {
	AsyncExecute *AsyncExecuteEvent `protobuf:"bytes,7,opt,name=async_execute,json=asyncExecute,proto3,oneof"`
}

type CreateEventRequest_PubsubPublish struct {
	PubsubPublish *PubSubPublishEvent `protobuf:"bytes,8,opt,name=pubsub_publish,json=pubsubPublish,proto3,oneof"`
}

type CreateEventRequest_PubsubConsume struct {
	PubsubConsume *PubSubConsumeEvent `protobuf:"bytes,9,opt,name=pubsub_consume,json=pubsubConsume,proto3,oneof"`
}

func (*CreateEventRequest_Log) isCreateEventRequest_Entry() {}

func (*CreateEventRequest_Call) isCreateEventRequest_Entry() {}

func (*CreateEventRequest_DeploymentCreated) isCreateEventRequest_Entry() {}

func (*CreateEventRequest_DeploymentUpdated) isCreateEventRequest_Entry() {}

func (*CreateEventRequest_Ingress) isCreateEventRequest_Entry() {}

func (*CreateEventRequest_CronScheduled) isCreateEventRequest_Entry() {}

func (*CreateEventRequest_AsyncExecute) isCreateEventRequest_Entry() {}

func (*CreateEventRequest_PubsubPublish) isCreateEventRequest_Entry() {}

func (*CreateEventRequest_PubsubConsume) isCreateEventRequest_Entry() {}

type CreateEventResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *CreateEventResponse) Reset() {
	*x = CreateEventResponse{}
	mi := &file_xyz_block_ftl_timeline_v1_timeline_proto_msgTypes[3]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *CreateEventResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateEventResponse) ProtoMessage() {}

func (x *CreateEventResponse) ProtoReflect() protoreflect.Message {
	mi := &file_xyz_block_ftl_timeline_v1_timeline_proto_msgTypes[3]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateEventResponse.ProtoReflect.Descriptor instead.
func (*CreateEventResponse) Descriptor() ([]byte, []int) {
	return file_xyz_block_ftl_timeline_v1_timeline_proto_rawDescGZIP(), []int{3}
}

type DeleteOldEventsRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	EventType  EventType `protobuf:"varint,1,opt,name=event_type,json=eventType,proto3,enum=xyz.block.ftl.timeline.v1.EventType" json:"event_type,omitempty"`
	AgeSeconds int64     `protobuf:"varint,2,opt,name=age_seconds,json=ageSeconds,proto3" json:"age_seconds,omitempty"`
}

func (x *DeleteOldEventsRequest) Reset() {
	*x = DeleteOldEventsRequest{}
	mi := &file_xyz_block_ftl_timeline_v1_timeline_proto_msgTypes[4]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *DeleteOldEventsRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteOldEventsRequest) ProtoMessage() {}

func (x *DeleteOldEventsRequest) ProtoReflect() protoreflect.Message {
	mi := &file_xyz_block_ftl_timeline_v1_timeline_proto_msgTypes[4]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteOldEventsRequest.ProtoReflect.Descriptor instead.
func (*DeleteOldEventsRequest) Descriptor() ([]byte, []int) {
	return file_xyz_block_ftl_timeline_v1_timeline_proto_rawDescGZIP(), []int{4}
}

func (x *DeleteOldEventsRequest) GetEventType() EventType {
	if x != nil {
		return x.EventType
	}
	return EventType_EVENT_TYPE_UNSPECIFIED
}

func (x *DeleteOldEventsRequest) GetAgeSeconds() int64 {
	if x != nil {
		return x.AgeSeconds
	}
	return 0
}

type DeleteOldEventsResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	DeletedCount int64 `protobuf:"varint,1,opt,name=deleted_count,json=deletedCount,proto3" json:"deleted_count,omitempty"`
}

func (x *DeleteOldEventsResponse) Reset() {
	*x = DeleteOldEventsResponse{}
	mi := &file_xyz_block_ftl_timeline_v1_timeline_proto_msgTypes[5]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *DeleteOldEventsResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteOldEventsResponse) ProtoMessage() {}

func (x *DeleteOldEventsResponse) ProtoReflect() protoreflect.Message {
	mi := &file_xyz_block_ftl_timeline_v1_timeline_proto_msgTypes[5]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteOldEventsResponse.ProtoReflect.Descriptor instead.
func (*DeleteOldEventsResponse) Descriptor() ([]byte, []int) {
	return file_xyz_block_ftl_timeline_v1_timeline_proto_rawDescGZIP(), []int{5}
}

func (x *DeleteOldEventsResponse) GetDeletedCount() int64 {
	if x != nil {
		return x.DeletedCount
	}
	return 0
}

var File_xyz_block_ftl_timeline_v1_timeline_proto protoreflect.FileDescriptor

var file_xyz_block_ftl_timeline_v1_timeline_proto_rawDesc = []byte{
	0x0a, 0x28, 0x78, 0x79, 0x7a, 0x2f, 0x62, 0x6c, 0x6f, 0x63, 0x6b, 0x2f, 0x66, 0x74, 0x6c, 0x2f,
	0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x2f, 0x76, 0x31, 0x2f, 0x74, 0x69, 0x6d, 0x65,
	0x6c, 0x69, 0x6e, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x19, 0x78, 0x79, 0x7a, 0x2e,
	0x62, 0x6c, 0x6f, 0x63, 0x6b, 0x2e, 0x66, 0x74, 0x6c, 0x2e, 0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69,
	0x6e, 0x65, 0x2e, 0x76, 0x31, 0x1a, 0x25, 0x78, 0x79, 0x7a, 0x2f, 0x62, 0x6c, 0x6f, 0x63, 0x6b,
	0x2f, 0x66, 0x74, 0x6c, 0x2f, 0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x2f, 0x76, 0x31,
	0x2f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1a, 0x78, 0x79,
	0x7a, 0x2f, 0x62, 0x6c, 0x6f, 0x63, 0x6b, 0x2f, 0x66, 0x74, 0x6c, 0x2f, 0x76, 0x31, 0x2f, 0x66,
	0x74, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xd4, 0x01, 0x0a, 0x12, 0x47, 0x65, 0x74,
	0x54, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12,
	0x25, 0x0a, 0x0e, 0x64, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x5f, 0x6b, 0x65,
	0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0d, 0x64, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d,
	0x65, 0x6e, 0x74, 0x4b, 0x65, 0x79, 0x12, 0x1e, 0x0a, 0x08, 0x73, 0x69, 0x6e, 0x63, 0x65, 0x5f,
	0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x48, 0x00, 0x52, 0x07, 0x73, 0x69, 0x6e, 0x63,
	0x65, 0x49, 0x64, 0x88, 0x01, 0x01, 0x12, 0x19, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x05, 0x48, 0x01, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x88, 0x01,
	0x01, 0x12, 0x45, 0x0a, 0x0b, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x73,
	0x18, 0x04, 0x20, 0x03, 0x28, 0x0e, 0x32, 0x24, 0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62, 0x6c, 0x6f,
	0x63, 0x6b, 0x2e, 0x66, 0x74, 0x6c, 0x2e, 0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x2e,
	0x76, 0x31, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x54, 0x79, 0x70, 0x65, 0x52, 0x0a, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x54, 0x79, 0x70, 0x65, 0x73, 0x42, 0x0b, 0x0a, 0x09, 0x5f, 0x73, 0x69, 0x6e,
	0x63, 0x65, 0x5f, 0x69, 0x64, 0x42, 0x08, 0x0a, 0x06, 0x5f, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x22,
	0x4f, 0x0a, 0x13, 0x47, 0x65, 0x74, 0x54, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x38, 0x0a, 0x06, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x73,
	0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x20, 0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62, 0x6c, 0x6f,
	0x63, 0x6b, 0x2e, 0x66, 0x74, 0x6c, 0x2e, 0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x2e,
	0x76, 0x31, 0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x06, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x73,
	0x22, 0xfc, 0x05, 0x0a, 0x12, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x45, 0x76, 0x65, 0x6e, 0x74,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x37, 0x0a, 0x03, 0x6c, 0x6f, 0x67, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x23, 0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62, 0x6c, 0x6f, 0x63, 0x6b,
	0x2e, 0x66, 0x74, 0x6c, 0x2e, 0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x2e, 0x76, 0x31,
	0x2e, 0x4c, 0x6f, 0x67, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x48, 0x00, 0x52, 0x03, 0x6c, 0x6f, 0x67,
	0x12, 0x3a, 0x0a, 0x04, 0x63, 0x61, 0x6c, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x24,
	0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62, 0x6c, 0x6f, 0x63, 0x6b, 0x2e, 0x66, 0x74, 0x6c, 0x2e, 0x74,
	0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x43, 0x61, 0x6c, 0x6c, 0x45,
	0x76, 0x65, 0x6e, 0x74, 0x48, 0x00, 0x52, 0x04, 0x63, 0x61, 0x6c, 0x6c, 0x12, 0x62, 0x0a, 0x12,
	0x64, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x5f, 0x63, 0x72, 0x65, 0x61, 0x74,
	0x65, 0x64, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x31, 0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62,
	0x6c, 0x6f, 0x63, 0x6b, 0x2e, 0x66, 0x74, 0x6c, 0x2e, 0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e,
	0x65, 0x2e, 0x76, 0x31, 0x2e, 0x44, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x43,
	0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x48, 0x00, 0x52, 0x11, 0x64,
	0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64,
	0x12, 0x62, 0x0a, 0x12, 0x64, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x5f, 0x75,
	0x70, 0x64, 0x61, 0x74, 0x65, 0x64, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x31, 0x2e, 0x78,
	0x79, 0x7a, 0x2e, 0x62, 0x6c, 0x6f, 0x63, 0x6b, 0x2e, 0x66, 0x74, 0x6c, 0x2e, 0x74, 0x69, 0x6d,
	0x65, 0x6c, 0x69, 0x6e, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x44, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d,
	0x65, 0x6e, 0x74, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x64, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x48,
	0x00, 0x52, 0x11, 0x64, 0x65, 0x70, 0x6c, 0x6f, 0x79, 0x6d, 0x65, 0x6e, 0x74, 0x55, 0x70, 0x64,
	0x61, 0x74, 0x65, 0x64, 0x12, 0x43, 0x0a, 0x07, 0x69, 0x6e, 0x67, 0x72, 0x65, 0x73, 0x73, 0x18,
	0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x27, 0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62, 0x6c, 0x6f, 0x63,
	0x6b, 0x2e, 0x66, 0x74, 0x6c, 0x2e, 0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x2e, 0x76,
	0x31, 0x2e, 0x49, 0x6e, 0x67, 0x72, 0x65, 0x73, 0x73, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x48, 0x00,
	0x52, 0x07, 0x69, 0x6e, 0x67, 0x72, 0x65, 0x73, 0x73, 0x12, 0x56, 0x0a, 0x0e, 0x63, 0x72, 0x6f,
	0x6e, 0x5f, 0x73, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x64, 0x18, 0x06, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x2d, 0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62, 0x6c, 0x6f, 0x63, 0x6b, 0x2e, 0x66, 0x74,
	0x6c, 0x2e, 0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x43, 0x72,
	0x6f, 0x6e, 0x53, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x64, 0x45, 0x76, 0x65, 0x6e, 0x74,
	0x48, 0x00, 0x52, 0x0d, 0x63, 0x72, 0x6f, 0x6e, 0x53, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65,
	0x64, 0x12, 0x53, 0x0a, 0x0d, 0x61, 0x73, 0x79, 0x6e, 0x63, 0x5f, 0x65, 0x78, 0x65, 0x63, 0x75,
	0x74, 0x65, 0x18, 0x07, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2c, 0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62,
	0x6c, 0x6f, 0x63, 0x6b, 0x2e, 0x66, 0x74, 0x6c, 0x2e, 0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e,
	0x65, 0x2e, 0x76, 0x31, 0x2e, 0x41, 0x73, 0x79, 0x6e, 0x63, 0x45, 0x78, 0x65, 0x63, 0x75, 0x74,
	0x65, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x48, 0x00, 0x52, 0x0c, 0x61, 0x73, 0x79, 0x6e, 0x63, 0x45,
	0x78, 0x65, 0x63, 0x75, 0x74, 0x65, 0x12, 0x56, 0x0a, 0x0e, 0x70, 0x75, 0x62, 0x73, 0x75, 0x62,
	0x5f, 0x70, 0x75, 0x62, 0x6c, 0x69, 0x73, 0x68, 0x18, 0x08, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2d,
	0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62, 0x6c, 0x6f, 0x63, 0x6b, 0x2e, 0x66, 0x74, 0x6c, 0x2e, 0x74,
	0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x50, 0x75, 0x62, 0x53, 0x75,
	0x62, 0x50, 0x75, 0x62, 0x6c, 0x69, 0x73, 0x68, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x48, 0x00, 0x52,
	0x0d, 0x70, 0x75, 0x62, 0x73, 0x75, 0x62, 0x50, 0x75, 0x62, 0x6c, 0x69, 0x73, 0x68, 0x12, 0x56,
	0x0a, 0x0e, 0x70, 0x75, 0x62, 0x73, 0x75, 0x62, 0x5f, 0x63, 0x6f, 0x6e, 0x73, 0x75, 0x6d, 0x65,
	0x18, 0x09, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x2d, 0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62, 0x6c, 0x6f,
	0x63, 0x6b, 0x2e, 0x66, 0x74, 0x6c, 0x2e, 0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x2e,
	0x76, 0x31, 0x2e, 0x50, 0x75, 0x62, 0x53, 0x75, 0x62, 0x43, 0x6f, 0x6e, 0x73, 0x75, 0x6d, 0x65,
	0x45, 0x76, 0x65, 0x6e, 0x74, 0x48, 0x00, 0x52, 0x0d, 0x70, 0x75, 0x62, 0x73, 0x75, 0x62, 0x43,
	0x6f, 0x6e, 0x73, 0x75, 0x6d, 0x65, 0x42, 0x07, 0x0a, 0x05, 0x65, 0x6e, 0x74, 0x72, 0x79, 0x22,
	0x15, 0x0a, 0x13, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x7e, 0x0a, 0x16, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65,
	0x4f, 0x6c, 0x64, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x12, 0x43, 0x0a, 0x0a, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x0e, 0x32, 0x24, 0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62, 0x6c, 0x6f, 0x63, 0x6b,
	0x2e, 0x66, 0x74, 0x6c, 0x2e, 0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x2e, 0x76, 0x31,
	0x2e, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x54, 0x79, 0x70, 0x65, 0x52, 0x09, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x54, 0x79, 0x70, 0x65, 0x12, 0x1f, 0x0a, 0x0b, 0x61, 0x67, 0x65, 0x5f, 0x73, 0x65, 0x63,
	0x6f, 0x6e, 0x64, 0x73, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0a, 0x61, 0x67, 0x65, 0x53,
	0x65, 0x63, 0x6f, 0x6e, 0x64, 0x73, 0x22, 0x3e, 0x0a, 0x17, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65,
	0x4f, 0x6c, 0x64, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x12, 0x23, 0x0a, 0x0d, 0x64, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x64, 0x5f, 0x63, 0x6f, 0x75,
	0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0c, 0x64, 0x65, 0x6c, 0x65, 0x74, 0x65,
	0x64, 0x43, 0x6f, 0x75, 0x6e, 0x74, 0x32, 0xbc, 0x03, 0x0a, 0x0f, 0x54, 0x69, 0x6d, 0x65, 0x6c,
	0x69, 0x6e, 0x65, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x4a, 0x0a, 0x04, 0x50, 0x69,
	0x6e, 0x67, 0x12, 0x1d, 0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62, 0x6c, 0x6f, 0x63, 0x6b, 0x2e, 0x66,
	0x74, 0x6c, 0x2e, 0x76, 0x31, 0x2e, 0x50, 0x69, 0x6e, 0x67, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x1a, 0x1e, 0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62, 0x6c, 0x6f, 0x63, 0x6b, 0x2e, 0x66, 0x74,
	0x6c, 0x2e, 0x76, 0x31, 0x2e, 0x50, 0x69, 0x6e, 0x67, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x22, 0x03, 0x90, 0x02, 0x01, 0x12, 0x71, 0x0a, 0x0b, 0x47, 0x65, 0x74, 0x54, 0x69, 0x6d,
	0x65, 0x6c, 0x69, 0x6e, 0x65, 0x12, 0x2d, 0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62, 0x6c, 0x6f, 0x63,
	0x6b, 0x2e, 0x66, 0x74, 0x6c, 0x2e, 0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x2e, 0x76,
	0x31, 0x2e, 0x47, 0x65, 0x74, 0x54, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x2e, 0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62, 0x6c, 0x6f, 0x63, 0x6b,
	0x2e, 0x66, 0x74, 0x6c, 0x2e, 0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x2e, 0x76, 0x31,
	0x2e, 0x47, 0x65, 0x74, 0x54, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x22, 0x03, 0x90, 0x02, 0x01, 0x12, 0x6e, 0x0a, 0x0b, 0x43, 0x72, 0x65,
	0x61, 0x74, 0x65, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x12, 0x2d, 0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62,
	0x6c, 0x6f, 0x63, 0x6b, 0x2e, 0x66, 0x74, 0x6c, 0x2e, 0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e,
	0x65, 0x2e, 0x76, 0x31, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x45, 0x76, 0x65, 0x6e, 0x74,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x2e, 0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62, 0x6c,
	0x6f, 0x63, 0x6b, 0x2e, 0x66, 0x74, 0x6c, 0x2e, 0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65,
	0x2e, 0x76, 0x31, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x12, 0x7a, 0x0a, 0x0f, 0x44, 0x65, 0x6c,
	0x65, 0x74, 0x65, 0x4f, 0x6c, 0x64, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x12, 0x31, 0x2e, 0x78,
	0x79, 0x7a, 0x2e, 0x62, 0x6c, 0x6f, 0x63, 0x6b, 0x2e, 0x66, 0x74, 0x6c, 0x2e, 0x74, 0x69, 0x6d,
	0x65, 0x6c, 0x69, 0x6e, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x4f,
	0x6c, 0x64, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a,
	0x32, 0x2e, 0x78, 0x79, 0x7a, 0x2e, 0x62, 0x6c, 0x6f, 0x63, 0x6b, 0x2e, 0x66, 0x74, 0x6c, 0x2e,
	0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x44, 0x65, 0x6c, 0x65,
	0x74, 0x65, 0x4f, 0x6c, 0x64, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x22, 0x00, 0x42, 0x52, 0x50, 0x01, 0x5a, 0x4e, 0x67, 0x69, 0x74, 0x68, 0x75,
	0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x54, 0x42, 0x44, 0x35, 0x34, 0x35, 0x36, 0x36, 0x39, 0x37,
	0x35, 0x2f, 0x66, 0x74, 0x6c, 0x2f, 0x62, 0x61, 0x63, 0x6b, 0x65, 0x6e, 0x64, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x73, 0x2f, 0x78, 0x79, 0x7a, 0x2f, 0x62, 0x6c, 0x6f, 0x63, 0x6b, 0x2f, 0x66,
	0x74, 0x6c, 0x2f, 0x74, 0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x2f, 0x76, 0x31, 0x3b, 0x74,
	0x69, 0x6d, 0x65, 0x6c, 0x69, 0x6e, 0x65, 0x76, 0x31, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var (
	file_xyz_block_ftl_timeline_v1_timeline_proto_rawDescOnce sync.Once
	file_xyz_block_ftl_timeline_v1_timeline_proto_rawDescData = file_xyz_block_ftl_timeline_v1_timeline_proto_rawDesc
)

func file_xyz_block_ftl_timeline_v1_timeline_proto_rawDescGZIP() []byte {
	file_xyz_block_ftl_timeline_v1_timeline_proto_rawDescOnce.Do(func() {
		file_xyz_block_ftl_timeline_v1_timeline_proto_rawDescData = protoimpl.X.CompressGZIP(file_xyz_block_ftl_timeline_v1_timeline_proto_rawDescData)
	})
	return file_xyz_block_ftl_timeline_v1_timeline_proto_rawDescData
}

var file_xyz_block_ftl_timeline_v1_timeline_proto_msgTypes = make([]protoimpl.MessageInfo, 6)
var file_xyz_block_ftl_timeline_v1_timeline_proto_goTypes = []any{
	(*GetTimelineRequest)(nil),      // 0: xyz.block.ftl.timeline.v1.GetTimelineRequest
	(*GetTimelineResponse)(nil),     // 1: xyz.block.ftl.timeline.v1.GetTimelineResponse
	(*CreateEventRequest)(nil),      // 2: xyz.block.ftl.timeline.v1.CreateEventRequest
	(*CreateEventResponse)(nil),     // 3: xyz.block.ftl.timeline.v1.CreateEventResponse
	(*DeleteOldEventsRequest)(nil),  // 4: xyz.block.ftl.timeline.v1.DeleteOldEventsRequest
	(*DeleteOldEventsResponse)(nil), // 5: xyz.block.ftl.timeline.v1.DeleteOldEventsResponse
	(EventType)(0),                  // 6: xyz.block.ftl.timeline.v1.EventType
	(*Event)(nil),                   // 7: xyz.block.ftl.timeline.v1.Event
	(*LogEvent)(nil),                // 8: xyz.block.ftl.timeline.v1.LogEvent
	(*CallEvent)(nil),               // 9: xyz.block.ftl.timeline.v1.CallEvent
	(*DeploymentCreatedEvent)(nil),  // 10: xyz.block.ftl.timeline.v1.DeploymentCreatedEvent
	(*DeploymentUpdatedEvent)(nil),  // 11: xyz.block.ftl.timeline.v1.DeploymentUpdatedEvent
	(*IngressEvent)(nil),            // 12: xyz.block.ftl.timeline.v1.IngressEvent
	(*CronScheduledEvent)(nil),      // 13: xyz.block.ftl.timeline.v1.CronScheduledEvent
	(*AsyncExecuteEvent)(nil),       // 14: xyz.block.ftl.timeline.v1.AsyncExecuteEvent
	(*PubSubPublishEvent)(nil),      // 15: xyz.block.ftl.timeline.v1.PubSubPublishEvent
	(*PubSubConsumeEvent)(nil),      // 16: xyz.block.ftl.timeline.v1.PubSubConsumeEvent
	(*v1.PingRequest)(nil),          // 17: xyz.block.ftl.v1.PingRequest
	(*v1.PingResponse)(nil),         // 18: xyz.block.ftl.v1.PingResponse
}
var file_xyz_block_ftl_timeline_v1_timeline_proto_depIdxs = []int32{
	6,  // 0: xyz.block.ftl.timeline.v1.GetTimelineRequest.event_types:type_name -> xyz.block.ftl.timeline.v1.EventType
	7,  // 1: xyz.block.ftl.timeline.v1.GetTimelineResponse.events:type_name -> xyz.block.ftl.timeline.v1.Event
	8,  // 2: xyz.block.ftl.timeline.v1.CreateEventRequest.log:type_name -> xyz.block.ftl.timeline.v1.LogEvent
	9,  // 3: xyz.block.ftl.timeline.v1.CreateEventRequest.call:type_name -> xyz.block.ftl.timeline.v1.CallEvent
	10, // 4: xyz.block.ftl.timeline.v1.CreateEventRequest.deployment_created:type_name -> xyz.block.ftl.timeline.v1.DeploymentCreatedEvent
	11, // 5: xyz.block.ftl.timeline.v1.CreateEventRequest.deployment_updated:type_name -> xyz.block.ftl.timeline.v1.DeploymentUpdatedEvent
	12, // 6: xyz.block.ftl.timeline.v1.CreateEventRequest.ingress:type_name -> xyz.block.ftl.timeline.v1.IngressEvent
	13, // 7: xyz.block.ftl.timeline.v1.CreateEventRequest.cron_scheduled:type_name -> xyz.block.ftl.timeline.v1.CronScheduledEvent
	14, // 8: xyz.block.ftl.timeline.v1.CreateEventRequest.async_execute:type_name -> xyz.block.ftl.timeline.v1.AsyncExecuteEvent
	15, // 9: xyz.block.ftl.timeline.v1.CreateEventRequest.pubsub_publish:type_name -> xyz.block.ftl.timeline.v1.PubSubPublishEvent
	16, // 10: xyz.block.ftl.timeline.v1.CreateEventRequest.pubsub_consume:type_name -> xyz.block.ftl.timeline.v1.PubSubConsumeEvent
	6,  // 11: xyz.block.ftl.timeline.v1.DeleteOldEventsRequest.event_type:type_name -> xyz.block.ftl.timeline.v1.EventType
	17, // 12: xyz.block.ftl.timeline.v1.TimelineService.Ping:input_type -> xyz.block.ftl.v1.PingRequest
	0,  // 13: xyz.block.ftl.timeline.v1.TimelineService.GetTimeline:input_type -> xyz.block.ftl.timeline.v1.GetTimelineRequest
	2,  // 14: xyz.block.ftl.timeline.v1.TimelineService.CreateEvent:input_type -> xyz.block.ftl.timeline.v1.CreateEventRequest
	4,  // 15: xyz.block.ftl.timeline.v1.TimelineService.DeleteOldEvents:input_type -> xyz.block.ftl.timeline.v1.DeleteOldEventsRequest
	18, // 16: xyz.block.ftl.timeline.v1.TimelineService.Ping:output_type -> xyz.block.ftl.v1.PingResponse
	1,  // 17: xyz.block.ftl.timeline.v1.TimelineService.GetTimeline:output_type -> xyz.block.ftl.timeline.v1.GetTimelineResponse
	3,  // 18: xyz.block.ftl.timeline.v1.TimelineService.CreateEvent:output_type -> xyz.block.ftl.timeline.v1.CreateEventResponse
	5,  // 19: xyz.block.ftl.timeline.v1.TimelineService.DeleteOldEvents:output_type -> xyz.block.ftl.timeline.v1.DeleteOldEventsResponse
	16, // [16:20] is the sub-list for method output_type
	12, // [12:16] is the sub-list for method input_type
	12, // [12:12] is the sub-list for extension type_name
	12, // [12:12] is the sub-list for extension extendee
	0,  // [0:12] is the sub-list for field type_name
}

func init() { file_xyz_block_ftl_timeline_v1_timeline_proto_init() }
func file_xyz_block_ftl_timeline_v1_timeline_proto_init() {
	if File_xyz_block_ftl_timeline_v1_timeline_proto != nil {
		return
	}
	file_xyz_block_ftl_timeline_v1_event_proto_init()
	file_xyz_block_ftl_timeline_v1_timeline_proto_msgTypes[0].OneofWrappers = []any{}
	file_xyz_block_ftl_timeline_v1_timeline_proto_msgTypes[2].OneofWrappers = []any{
		(*CreateEventRequest_Log)(nil),
		(*CreateEventRequest_Call)(nil),
		(*CreateEventRequest_DeploymentCreated)(nil),
		(*CreateEventRequest_DeploymentUpdated)(nil),
		(*CreateEventRequest_Ingress)(nil),
		(*CreateEventRequest_CronScheduled)(nil),
		(*CreateEventRequest_AsyncExecute)(nil),
		(*CreateEventRequest_PubsubPublish)(nil),
		(*CreateEventRequest_PubsubConsume)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_xyz_block_ftl_timeline_v1_timeline_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   6,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_xyz_block_ftl_timeline_v1_timeline_proto_goTypes,
		DependencyIndexes: file_xyz_block_ftl_timeline_v1_timeline_proto_depIdxs,
		MessageInfos:      file_xyz_block_ftl_timeline_v1_timeline_proto_msgTypes,
	}.Build()
	File_xyz_block_ftl_timeline_v1_timeline_proto = out.File
	file_xyz_block_ftl_timeline_v1_timeline_proto_rawDesc = nil
	file_xyz_block_ftl_timeline_v1_timeline_proto_goTypes = nil
	file_xyz_block_ftl_timeline_v1_timeline_proto_depIdxs = nil
}
