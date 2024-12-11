// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/language/v1/language.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.language.v1;

public interface BuildContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xyz.block.ftl.language.v1.BuildContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The configuration for the module
   * </pre>
   *
   * <code>.xyz.block.ftl.language.v1.ModuleConfig module_config = 2 [json_name = "moduleConfig"];</code>
   * @return Whether the moduleConfig field is set.
   */
  boolean hasModuleConfig();
  /**
   * <pre>
   * The configuration for the module
   * </pre>
   *
   * <code>.xyz.block.ftl.language.v1.ModuleConfig module_config = 2 [json_name = "moduleConfig"];</code>
   * @return The moduleConfig.
   */
  xyz.block.ftl.language.v1.ModuleConfig getModuleConfig();
  /**
   * <pre>
   * The configuration for the module
   * </pre>
   *
   * <code>.xyz.block.ftl.language.v1.ModuleConfig module_config = 2 [json_name = "moduleConfig"];</code>
   */
  xyz.block.ftl.language.v1.ModuleConfigOrBuilder getModuleConfigOrBuilder();

  /**
   * <pre>
   * The FTL schema including all dependencies
   * </pre>
   *
   * <code>.xyz.block.ftl.schema.v1.Schema schema = 3 [json_name = "schema"];</code>
   * @return Whether the schema field is set.
   */
  boolean hasSchema();
  /**
   * <pre>
   * The FTL schema including all dependencies
   * </pre>
   *
   * <code>.xyz.block.ftl.schema.v1.Schema schema = 3 [json_name = "schema"];</code>
   * @return The schema.
   */
  xyz.block.ftl.schema.v1.Schema getSchema();
  /**
   * <pre>
   * The FTL schema including all dependencies
   * </pre>
   *
   * <code>.xyz.block.ftl.schema.v1.Schema schema = 3 [json_name = "schema"];</code>
   */
  xyz.block.ftl.schema.v1.SchemaOrBuilder getSchemaOrBuilder();

  /**
   * <pre>
   * The dependencies for the module
   * </pre>
   *
   * <code>repeated string dependencies = 4 [json_name = "dependencies"];</code>
   * @return A list containing the dependencies.
   */
  java.util.List<java.lang.String>
      getDependenciesList();
  /**
   * <pre>
   * The dependencies for the module
   * </pre>
   *
   * <code>repeated string dependencies = 4 [json_name = "dependencies"];</code>
   * @return The count of dependencies.
   */
  int getDependenciesCount();
  /**
   * <pre>
   * The dependencies for the module
   * </pre>
   *
   * <code>repeated string dependencies = 4 [json_name = "dependencies"];</code>
   * @param index The index of the element to return.
   * @return The dependencies at the given index.
   */
  java.lang.String getDependencies(int index);
  /**
   * <pre>
   * The dependencies for the module
   * </pre>
   *
   * <code>repeated string dependencies = 4 [json_name = "dependencies"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the dependencies at the given index.
   */
  com.google.protobuf.ByteString
      getDependenciesBytes(int index);

  /**
   * <pre>
   * Build environment provides environment variables to be set for the build command
   * </pre>
   *
   * <code>repeated string build_env = 5 [json_name = "buildEnv"];</code>
   * @return A list containing the buildEnv.
   */
  java.util.List<java.lang.String>
      getBuildEnvList();
  /**
   * <pre>
   * Build environment provides environment variables to be set for the build command
   * </pre>
   *
   * <code>repeated string build_env = 5 [json_name = "buildEnv"];</code>
   * @return The count of buildEnv.
   */
  int getBuildEnvCount();
  /**
   * <pre>
   * Build environment provides environment variables to be set for the build command
   * </pre>
   *
   * <code>repeated string build_env = 5 [json_name = "buildEnv"];</code>
   * @param index The index of the element to return.
   * @return The buildEnv at the given index.
   */
  java.lang.String getBuildEnv(int index);
  /**
   * <pre>
   * Build environment provides environment variables to be set for the build command
   * </pre>
   *
   * <code>repeated string build_env = 5 [json_name = "buildEnv"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the buildEnv at the given index.
   */
  com.google.protobuf.ByteString
      getBuildEnvBytes(int index);
}
