// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/v1/controller.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.v1;

public interface CreateDeploymentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xyz.block.ftl.v1.CreateDeploymentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.xyz.block.ftl.schema.v1.Module schema = 1 [json_name = "schema"];</code>
   * @return Whether the schema field is set.
   */
  boolean hasSchema();
  /**
   * <code>.xyz.block.ftl.schema.v1.Module schema = 1 [json_name = "schema"];</code>
   * @return The schema.
   */
  xyz.block.ftl.schema.v1.Module getSchema();
  /**
   * <code>.xyz.block.ftl.schema.v1.Module schema = 1 [json_name = "schema"];</code>
   */
  xyz.block.ftl.schema.v1.ModuleOrBuilder getSchemaOrBuilder();

  /**
   * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact artefacts = 2 [json_name = "artefacts"];</code>
   */
  java.util.List<xyz.block.ftl.v1.DeploymentArtefact> 
      getArtefactsList();
  /**
   * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact artefacts = 2 [json_name = "artefacts"];</code>
   */
  xyz.block.ftl.v1.DeploymentArtefact getArtefacts(int index);
  /**
   * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact artefacts = 2 [json_name = "artefacts"];</code>
   */
  int getArtefactsCount();
  /**
   * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact artefacts = 2 [json_name = "artefacts"];</code>
   */
  java.util.List<? extends xyz.block.ftl.v1.DeploymentArtefactOrBuilder> 
      getArtefactsOrBuilderList();
  /**
   * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact artefacts = 2 [json_name = "artefacts"];</code>
   */
  xyz.block.ftl.v1.DeploymentArtefactOrBuilder getArtefactsOrBuilder(
      int index);
}
