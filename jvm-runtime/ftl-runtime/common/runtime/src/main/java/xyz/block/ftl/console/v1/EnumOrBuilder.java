// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/console/v1/console.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.console.v1;

public interface EnumOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xyz.block.ftl.console.v1.Enum)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.xyz.block.ftl.schema.v1.Enum enum = 1 [json_name = "enum"];</code>
   * @return Whether the enum field is set.
   */
  boolean hasEnum();
  /**
   * <code>.xyz.block.ftl.schema.v1.Enum enum = 1 [json_name = "enum"];</code>
   * @return The enum.
   */
  xyz.block.ftl.schema.v1.Enum getEnum();
  /**
   * <code>.xyz.block.ftl.schema.v1.Enum enum = 1 [json_name = "enum"];</code>
   */
  xyz.block.ftl.schema.v1.EnumOrBuilder getEnumOrBuilder();

  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
   */
  java.util.List<xyz.block.ftl.schema.v1.Ref> 
      getReferencesList();
  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
   */
  xyz.block.ftl.schema.v1.Ref getReferences(int index);
  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
   */
  int getReferencesCount();
  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
   */
  java.util.List<? extends xyz.block.ftl.schema.v1.RefOrBuilder> 
      getReferencesOrBuilderList();
  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
   */
  xyz.block.ftl.schema.v1.RefOrBuilder getReferencesOrBuilder(
      int index);
}
