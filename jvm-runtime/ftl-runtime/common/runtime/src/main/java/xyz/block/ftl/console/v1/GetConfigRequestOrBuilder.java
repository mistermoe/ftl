// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/console/v1/console.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.console.v1;

public interface GetConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xyz.block.ftl.console.v1.GetConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string module = 2 [json_name = "module"];</code>
   * @return Whether the module field is set.
   */
  boolean hasModule();
  /**
   * <code>optional string module = 2 [json_name = "module"];</code>
   * @return The module.
   */
  java.lang.String getModule();
  /**
   * <code>optional string module = 2 [json_name = "module"];</code>
   * @return The bytes for module.
   */
  com.google.protobuf.ByteString
      getModuleBytes();
}
