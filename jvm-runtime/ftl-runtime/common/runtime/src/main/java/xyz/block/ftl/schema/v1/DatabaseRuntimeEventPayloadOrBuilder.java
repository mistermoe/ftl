// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/schema/v1/schema.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.schema.v1;

public interface DatabaseRuntimeEventPayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xyz.block.ftl.schema.v1.DatabaseRuntimeEventPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.xyz.block.ftl.schema.v1.DatabaseRuntimeConnectionsEvent database_runtime_connections_event = 1 [json_name = "databaseRuntimeConnectionsEvent"];</code>
   * @return Whether the databaseRuntimeConnectionsEvent field is set.
   */
  boolean hasDatabaseRuntimeConnectionsEvent();
  /**
   * <code>.xyz.block.ftl.schema.v1.DatabaseRuntimeConnectionsEvent database_runtime_connections_event = 1 [json_name = "databaseRuntimeConnectionsEvent"];</code>
   * @return The databaseRuntimeConnectionsEvent.
   */
  xyz.block.ftl.schema.v1.DatabaseRuntimeConnectionsEvent getDatabaseRuntimeConnectionsEvent();
  /**
   * <code>.xyz.block.ftl.schema.v1.DatabaseRuntimeConnectionsEvent database_runtime_connections_event = 1 [json_name = "databaseRuntimeConnectionsEvent"];</code>
   */
  xyz.block.ftl.schema.v1.DatabaseRuntimeConnectionsEventOrBuilder getDatabaseRuntimeConnectionsEventOrBuilder();

  xyz.block.ftl.schema.v1.DatabaseRuntimeEventPayload.ValueCase getValueCase();
}
