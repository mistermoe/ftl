// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/schema/v1/schema.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.schema.v1;

public interface DatabaseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xyz.block.ftl.schema.v1.Database)
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
   * <code>optional .xyz.block.ftl.schema.v1.DatabaseRuntime runtime = 31634 [json_name = "runtime"];</code>
   * @return Whether the runtime field is set.
   */
  boolean hasRuntime();
  /**
   * <code>optional .xyz.block.ftl.schema.v1.DatabaseRuntime runtime = 31634 [json_name = "runtime"];</code>
   * @return The runtime.
   */
  xyz.block.ftl.schema.v1.DatabaseRuntime getRuntime();
  /**
   * <code>optional .xyz.block.ftl.schema.v1.DatabaseRuntime runtime = 31634 [json_name = "runtime"];</code>
   */
  xyz.block.ftl.schema.v1.DatabaseRuntimeOrBuilder getRuntimeOrBuilder();

  /**
   * <code>repeated string comments = 2 [json_name = "comments"];</code>
   * @return A list containing the comments.
   */
  java.util.List<java.lang.String>
      getCommentsList();
  /**
   * <code>repeated string comments = 2 [json_name = "comments"];</code>
   * @return The count of comments.
   */
  int getCommentsCount();
  /**
   * <code>repeated string comments = 2 [json_name = "comments"];</code>
   * @param index The index of the element to return.
   * @return The comments at the given index.
   */
  java.lang.String getComments(int index);
  /**
   * <code>repeated string comments = 2 [json_name = "comments"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the comments at the given index.
   */
  com.google.protobuf.ByteString
      getCommentsBytes(int index);

  /**
   * <code>string type = 4 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 4 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Metadata metadata = 5 [json_name = "metadata"];</code>
   */
  java.util.List<xyz.block.ftl.schema.v1.Metadata> 
      getMetadataList();
  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Metadata metadata = 5 [json_name = "metadata"];</code>
   */
  xyz.block.ftl.schema.v1.Metadata getMetadata(int index);
  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Metadata metadata = 5 [json_name = "metadata"];</code>
   */
  int getMetadataCount();
  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Metadata metadata = 5 [json_name = "metadata"];</code>
   */
  java.util.List<? extends xyz.block.ftl.schema.v1.MetadataOrBuilder> 
      getMetadataOrBuilderList();
  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Metadata metadata = 5 [json_name = "metadata"];</code>
   */
  xyz.block.ftl.schema.v1.MetadataOrBuilder getMetadataOrBuilder(
      int index);
}
