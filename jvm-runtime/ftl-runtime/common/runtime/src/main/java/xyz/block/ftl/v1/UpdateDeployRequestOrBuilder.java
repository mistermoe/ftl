// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/v1/controller.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.v1;

public interface UpdateDeployRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xyz.block.ftl.v1.UpdateDeployRequest)
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
   * <code>optional int32 min_replicas = 2 [json_name = "minReplicas"];</code>
   * @return Whether the minReplicas field is set.
   */
  boolean hasMinReplicas();
  /**
   * <code>optional int32 min_replicas = 2 [json_name = "minReplicas"];</code>
   * @return The minReplicas.
   */
  int getMinReplicas();
}
