# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: xyz/block/ftl/publish/v1/publish.proto
# Protobuf Python Version: 5.29.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    29,
    0,
    '',
    'xyz/block/ftl/publish/v1/publish.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from xyz.block.ftl.schema.v1 import schema_pb2 as xyz_dot_block_dot_ftl_dot_schema_dot_v1_dot_schema__pb2
from xyz.block.ftl.v1 import ftl_pb2 as xyz_dot_block_dot_ftl_dot_v1_dot_ftl__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&xyz/block/ftl/publish/v1/publish.proto\x12\x18xyz.block.ftl.publish.v1\x1a$xyz/block/ftl/schema/v1/schema.proto\x1a\x1axyz/block/ftl/v1/ftl.proto\"\x87\x01\n\x13PublishEventRequest\x12\x32\n\x05topic\x18\x01 \x01(\x0b\x32\x1c.xyz.block.ftl.schema.v1.RefR\x05topic\x12\x12\n\x04\x62ody\x18\x02 \x01(\x0cR\x04\x62ody\x12\x10\n\x03key\x18\x03 \x01(\tR\x03key\x12\x16\n\x06\x63\x61ller\x18\x04 \x01(\tR\x06\x63\x61ller\"\x16\n\x14PublishEventResponse2\xcb\x01\n\x0ePublishService\x12J\n\x04Ping\x12\x1d.xyz.block.ftl.v1.PingRequest\x1a\x1e.xyz.block.ftl.v1.PingResponse\"\x03\x90\x02\x01\x12m\n\x0cPublishEvent\x12-.xyz.block.ftl.publish.v1.PublishEventRequest\x1a..xyz.block.ftl.publish.v1.PublishEventResponseBPP\x01ZLgithub.com/TBD54566975/ftl/backend/protos/xyz/block/ftl/publish/v1;publishpbb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'xyz.block.ftl.publish.v1.publish_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'P\001ZLgithub.com/TBD54566975/ftl/backend/protos/xyz/block/ftl/publish/v1;publishpb'
  _globals['_PUBLISHSERVICE'].methods_by_name['Ping']._loaded_options = None
  _globals['_PUBLISHSERVICE'].methods_by_name['Ping']._serialized_options = b'\220\002\001'
  _globals['_PUBLISHEVENTREQUEST']._serialized_start=135
  _globals['_PUBLISHEVENTREQUEST']._serialized_end=270
  _globals['_PUBLISHEVENTRESPONSE']._serialized_start=272
  _globals['_PUBLISHEVENTRESPONSE']._serialized_end=294
  _globals['_PUBLISHSERVICE']._serialized_start=297
  _globals['_PUBLISHSERVICE']._serialized_end=500
# @@protoc_insertion_point(module_scope)
