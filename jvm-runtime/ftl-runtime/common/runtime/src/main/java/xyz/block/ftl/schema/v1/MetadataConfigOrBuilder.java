// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/schema/v1/schema.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.schema.v1;

public interface MetadataConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xyz.block.ftl.schema.v1.MetadataConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .xyz.block.ftl.schema.v1.Position pos = 1 [json_name = "pos"];</code>
   * @return Whether the pos field is set.
   */
  boolean hasPos();
  /**
   * <code>optional .xyz.block.ftl.schema.v1.Position pos = 1 [json_name = "pos"];</code>
   * @return The pos.
   */
  xyz.block.ftl.schema.v1.Position getPos();
  /**
   * <code>optional .xyz.block.ftl.schema.v1.Position pos = 1 [json_name = "pos"];</code>
   */
  xyz.block.ftl.schema.v1.PositionOrBuilder getPosOrBuilder();

  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Ref config = 2 [json_name = "config"];</code>
   */
  java.util.List<xyz.block.ftl.schema.v1.Ref> 
      getConfigList();
  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Ref config = 2 [json_name = "config"];</code>
   */
  xyz.block.ftl.schema.v1.Ref getConfig(int index);
  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Ref config = 2 [json_name = "config"];</code>
   */
  int getConfigCount();
  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Ref config = 2 [json_name = "config"];</code>
   */
  java.util.List<? extends xyz.block.ftl.schema.v1.RefOrBuilder> 
      getConfigOrBuilderList();
  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Ref config = 2 [json_name = "config"];</code>
   */
  xyz.block.ftl.schema.v1.RefOrBuilder getConfigOrBuilder(
      int index);
}
