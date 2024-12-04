from xyz.block.ftl.timeline.v1 import event_pb2 as _event_pb2
from xyz.block.ftl.v1 import ftl_pb2 as _ftl_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class GetTimelineRequest(_message.Message):
    __slots__ = ("deployment_key", "since_id", "limit", "event_types")
    DEPLOYMENT_KEY_FIELD_NUMBER: _ClassVar[int]
    SINCE_ID_FIELD_NUMBER: _ClassVar[int]
    LIMIT_FIELD_NUMBER: _ClassVar[int]
    EVENT_TYPES_FIELD_NUMBER: _ClassVar[int]
    deployment_key: str
    since_id: int
    limit: int
    event_types: _containers.RepeatedScalarFieldContainer[_event_pb2.EventType]
    def __init__(self, deployment_key: _Optional[str] = ..., since_id: _Optional[int] = ..., limit: _Optional[int] = ..., event_types: _Optional[_Iterable[_Union[_event_pb2.EventType, str]]] = ...) -> None: ...

class GetTimelineResponse(_message.Message):
    __slots__ = ("events",)
    EVENTS_FIELD_NUMBER: _ClassVar[int]
    events: _containers.RepeatedCompositeFieldContainer[_event_pb2.Event]
    def __init__(self, events: _Optional[_Iterable[_Union[_event_pb2.Event, _Mapping]]] = ...) -> None: ...

class DeleteOldEventsRequest(_message.Message):
    __slots__ = ("event_type", "age_seconds")
    EVENT_TYPE_FIELD_NUMBER: _ClassVar[int]
    AGE_SECONDS_FIELD_NUMBER: _ClassVar[int]
    event_type: _event_pb2.EventType
    age_seconds: int
    def __init__(self, event_type: _Optional[_Union[_event_pb2.EventType, str]] = ..., age_seconds: _Optional[int] = ...) -> None: ...

class DeleteOldEventsResponse(_message.Message):
    __slots__ = ("deleted_count",)
    DELETED_COUNT_FIELD_NUMBER: _ClassVar[int]
    deleted_count: int
    def __init__(self, deleted_count: _Optional[int] = ...) -> None: ...
