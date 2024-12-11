// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/v1/controller.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.v1;

public interface StreamDeploymentLogsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xyz.block.ftl.v1.StreamDeploymentLogsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string deployment_key = 1 [json_name = "deploymentKey"];</code>
   * @return The deploymentKey.
   */
  java.lang.String getDeploymentKey();
  /**
   * <code>string deployment_key = 1 [json_name = "deploymentKey"];</code>
   * @return The bytes for deploymentKey.
   */
  com.google.protobuf.ByteString
      getDeploymentKeyBytes();

  /**
   * <code>optional string request_key = 2 [json_name = "requestKey"];</code>
   * @return Whether the requestKey field is set.
   */
  boolean hasRequestKey();
  /**
   * <code>optional string request_key = 2 [json_name = "requestKey"];</code>
   * @return The requestKey.
   */
  java.lang.String getRequestKey();
  /**
   * <code>optional string request_key = 2 [json_name = "requestKey"];</code>
   * @return The bytes for requestKey.
   */
  com.google.protobuf.ByteString
      getRequestKeyBytes();

  /**
   * <code>.google.protobuf.Timestamp time_stamp = 3 [json_name = "timeStamp"];</code>
   * @return Whether the timeStamp field is set.
   */
  boolean hasTimeStamp();
  /**
   * <code>.google.protobuf.Timestamp time_stamp = 3 [json_name = "timeStamp"];</code>
   * @return The timeStamp.
   */
  com.google.protobuf.Timestamp getTimeStamp();
  /**
   * <code>.google.protobuf.Timestamp time_stamp = 3 [json_name = "timeStamp"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeStampOrBuilder();

  /**
   * <code>int32 log_level = 4 [json_name = "logLevel"];</code>
   * @return The logLevel.
   */
  int getLogLevel();

  /**
   * <code>map&lt;string, string&gt; attributes = 5 [json_name = "attributes"];</code>
   */
  int getAttributesCount();
  /**
   * <code>map&lt;string, string&gt; attributes = 5 [json_name = "attributes"];</code>
   */
  boolean containsAttributes(
      java.lang.String key);
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAttributes();
  /**
   * <code>map&lt;string, string&gt; attributes = 5 [json_name = "attributes"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAttributesMap();
  /**
   * <code>map&lt;string, string&gt; attributes = 5 [json_name = "attributes"];</code>
   */
  /* nullable */
java.lang.String getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; attributes = 5 [json_name = "attributes"];</code>
   */
  java.lang.String getAttributesOrThrow(
      java.lang.String key);

  /**
   * <code>string message = 6 [json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 6 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>optional string error = 7 [json_name = "error"];</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>optional string error = 7 [json_name = "error"];</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <code>optional string error = 7 [json_name = "error"];</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();
}
