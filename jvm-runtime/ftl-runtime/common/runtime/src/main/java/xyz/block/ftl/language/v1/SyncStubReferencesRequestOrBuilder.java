// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/language/v1/language.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.language.v1;

public interface SyncStubReferencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xyz.block.ftl.language.v1.SyncStubReferencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.xyz.block.ftl.language.v1.ModuleConfig module_config = 1 [json_name = "moduleConfig"];</code>
   * @return Whether the moduleConfig field is set.
   */
  boolean hasModuleConfig();
  /**
   * <code>.xyz.block.ftl.language.v1.ModuleConfig module_config = 1 [json_name = "moduleConfig"];</code>
   * @return The moduleConfig.
   */
  xyz.block.ftl.language.v1.ModuleConfig getModuleConfig();
  /**
   * <code>.xyz.block.ftl.language.v1.ModuleConfig module_config = 1 [json_name = "moduleConfig"];</code>
   */
  xyz.block.ftl.language.v1.ModuleConfigOrBuilder getModuleConfigOrBuilder();

  /**
   * <pre>
   * The path of the directory containing all module stubs. Each module is in a subdirectory
   * </pre>
   *
   * <code>string stubs_root = 2 [json_name = "stubsRoot"];</code>
   * @return The stubsRoot.
   */
  java.lang.String getStubsRoot();
  /**
   * <pre>
   * The path of the directory containing all module stubs. Each module is in a subdirectory
   * </pre>
   *
   * <code>string stubs_root = 2 [json_name = "stubsRoot"];</code>
   * @return The bytes for stubsRoot.
   */
  com.google.protobuf.ByteString
      getStubsRootBytes();

  /**
   * <pre>
   * The names of all modules that have had stubs generated
   * </pre>
   *
   * <code>repeated string modules = 3 [json_name = "modules"];</code>
   * @return A list containing the modules.
   */
  java.util.List<java.lang.String>
      getModulesList();
  /**
   * <pre>
   * The names of all modules that have had stubs generated
   * </pre>
   *
   * <code>repeated string modules = 3 [json_name = "modules"];</code>
   * @return The count of modules.
   */
  int getModulesCount();
  /**
   * <pre>
   * The names of all modules that have had stubs generated
   * </pre>
   *
   * <code>repeated string modules = 3 [json_name = "modules"];</code>
   * @param index The index of the element to return.
   * @return The modules at the given index.
   */
  java.lang.String getModules(int index);
  /**
   * <pre>
   * The names of all modules that have had stubs generated
   * </pre>
   *
   * <code>repeated string modules = 3 [json_name = "modules"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the modules at the given index.
   */
  com.google.protobuf.ByteString
      getModulesBytes(int index);
}
