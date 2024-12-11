// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/language/v1/language.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.language.v1;

public interface ErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xyz.block.ftl.language.v1.Error)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string msg = 1 [json_name = "msg"];</code>
   * @return The msg.
   */
  java.lang.String getMsg();
  /**
   * <code>string msg = 1 [json_name = "msg"];</code>
   * @return The bytes for msg.
   */
  com.google.protobuf.ByteString
      getMsgBytes();

  /**
   * <code>.xyz.block.ftl.language.v1.Error.ErrorLevel level = 4 [json_name = "level"];</code>
   * @return The enum numeric value on the wire for level.
   */
  int getLevelValue();
  /**
   * <code>.xyz.block.ftl.language.v1.Error.ErrorLevel level = 4 [json_name = "level"];</code>
   * @return The level.
   */
  xyz.block.ftl.language.v1.Error.ErrorLevel getLevel();

  /**
   * <code>optional .xyz.block.ftl.language.v1.Position pos = 5 [json_name = "pos"];</code>
   * @return Whether the pos field is set.
   */
  boolean hasPos();
  /**
   * <code>optional .xyz.block.ftl.language.v1.Position pos = 5 [json_name = "pos"];</code>
   * @return The pos.
   */
  xyz.block.ftl.language.v1.Position getPos();
  /**
   * <code>optional .xyz.block.ftl.language.v1.Position pos = 5 [json_name = "pos"];</code>
   */
  xyz.block.ftl.language.v1.PositionOrBuilder getPosOrBuilder();

  /**
   * <code>.xyz.block.ftl.language.v1.Error.ErrorType type = 6 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.xyz.block.ftl.language.v1.Error.ErrorType type = 6 [json_name = "type"];</code>
   * @return The type.
   */
  xyz.block.ftl.language.v1.Error.ErrorType getType();
}
