// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/schema/v1/schema.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.schema.v1;

public interface MetadataSubscriberOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xyz.block.ftl.schema.v1.MetadataSubscriber)
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
   * <code>.xyz.block.ftl.schema.v1.Ref topic = 2 [json_name = "topic"];</code>
   * @return Whether the topic field is set.
   */
  boolean hasTopic();
  /**
   * <code>.xyz.block.ftl.schema.v1.Ref topic = 2 [json_name = "topic"];</code>
   * @return The topic.
   */
  xyz.block.ftl.schema.v1.Ref getTopic();
  /**
   * <code>.xyz.block.ftl.schema.v1.Ref topic = 2 [json_name = "topic"];</code>
   */
  xyz.block.ftl.schema.v1.RefOrBuilder getTopicOrBuilder();

  /**
   * <code>.xyz.block.ftl.schema.v1.FromOffset from_offset = 3 [json_name = "fromOffset"];</code>
   * @return The enum numeric value on the wire for fromOffset.
   */
  int getFromOffsetValue();
  /**
   * <code>.xyz.block.ftl.schema.v1.FromOffset from_offset = 3 [json_name = "fromOffset"];</code>
   * @return The fromOffset.
   */
  xyz.block.ftl.schema.v1.FromOffset getFromOffset();

  /**
   * <code>bool dead_letter = 4 [json_name = "deadLetter"];</code>
   * @return The deadLetter.
   */
  boolean getDeadLetter();
}
