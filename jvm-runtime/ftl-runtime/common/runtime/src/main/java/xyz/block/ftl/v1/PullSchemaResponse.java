// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/v1/schemaservice.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.v1;

/**
 * Protobuf type {@code xyz.block.ftl.v1.PullSchemaResponse}
 */
public final class PullSchemaResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:xyz.block.ftl.v1.PullSchemaResponse)
    PullSchemaResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      PullSchemaResponse.class.getName());
  }
  // Use PullSchemaResponse.newBuilder() to construct.
  private PullSchemaResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PullSchemaResponse() {
    deploymentKey_ = "";
    moduleName_ = "";
    changeType_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return xyz.block.ftl.v1.Schemaservice.internal_static_xyz_block_ftl_v1_PullSchemaResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return xyz.block.ftl.v1.Schemaservice.internal_static_xyz_block_ftl_v1_PullSchemaResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            xyz.block.ftl.v1.PullSchemaResponse.class, xyz.block.ftl.v1.PullSchemaResponse.Builder.class);
  }

  private int bitField0_;
  public static final int DEPLOYMENT_KEY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object deploymentKey_ = "";
  /**
   * <pre>
   * Will not be set for builtin modules.
   * </pre>
   *
   * <code>optional string deployment_key = 1 [json_name = "deploymentKey"];</code>
   * @return Whether the deploymentKey field is set.
   */
  @java.lang.Override
  public boolean hasDeploymentKey() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Will not be set for builtin modules.
   * </pre>
   *
   * <code>optional string deployment_key = 1 [json_name = "deploymentKey"];</code>
   * @return The deploymentKey.
   */
  @java.lang.Override
  public java.lang.String getDeploymentKey() {
    java.lang.Object ref = deploymentKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deploymentKey_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Will not be set for builtin modules.
   * </pre>
   *
   * <code>optional string deployment_key = 1 [json_name = "deploymentKey"];</code>
   * @return The bytes for deploymentKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeploymentKeyBytes() {
    java.lang.Object ref = deploymentKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deploymentKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODULE_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object moduleName_ = "";
  /**
   * <code>string module_name = 2 [json_name = "moduleName"];</code>
   * @return The moduleName.
   */
  @java.lang.Override
  public java.lang.String getModuleName() {
    java.lang.Object ref = moduleName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      moduleName_ = s;
      return s;
    }
  }
  /**
   * <code>string module_name = 2 [json_name = "moduleName"];</code>
   * @return The bytes for moduleName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModuleNameBytes() {
    java.lang.Object ref = moduleName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      moduleName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCHEMA_FIELD_NUMBER = 4;
  private xyz.block.ftl.schema.v1.Module schema_;
  /**
   * <pre>
   * For deletes this will not be present.
   * </pre>
   *
   * <code>optional .xyz.block.ftl.schema.v1.Module schema = 4 [json_name = "schema"];</code>
   * @return Whether the schema field is set.
   */
  @java.lang.Override
  public boolean hasSchema() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * For deletes this will not be present.
   * </pre>
   *
   * <code>optional .xyz.block.ftl.schema.v1.Module schema = 4 [json_name = "schema"];</code>
   * @return The schema.
   */
  @java.lang.Override
  public xyz.block.ftl.schema.v1.Module getSchema() {
    return schema_ == null ? xyz.block.ftl.schema.v1.Module.getDefaultInstance() : schema_;
  }
  /**
   * <pre>
   * For deletes this will not be present.
   * </pre>
   *
   * <code>optional .xyz.block.ftl.schema.v1.Module schema = 4 [json_name = "schema"];</code>
   */
  @java.lang.Override
  public xyz.block.ftl.schema.v1.ModuleOrBuilder getSchemaOrBuilder() {
    return schema_ == null ? xyz.block.ftl.schema.v1.Module.getDefaultInstance() : schema_;
  }

  public static final int MORE_FIELD_NUMBER = 3;
  private boolean more_ = false;
  /**
   * <pre>
   * If true there are more schema changes immediately following this one as part of the initial batch.
   * If false this is the last schema change in the initial batch, but others may follow later.
   * </pre>
   *
   * <code>bool more = 3 [json_name = "more"];</code>
   * @return The more.
   */
  @java.lang.Override
  public boolean getMore() {
    return more_;
  }

  public static final int CHANGE_TYPE_FIELD_NUMBER = 5;
  private int changeType_ = 0;
  /**
   * <code>.xyz.block.ftl.v1.DeploymentChangeType change_type = 5 [json_name = "changeType"];</code>
   * @return The enum numeric value on the wire for changeType.
   */
  @java.lang.Override public int getChangeTypeValue() {
    return changeType_;
  }
  /**
   * <code>.xyz.block.ftl.v1.DeploymentChangeType change_type = 5 [json_name = "changeType"];</code>
   * @return The changeType.
   */
  @java.lang.Override public xyz.block.ftl.v1.DeploymentChangeType getChangeType() {
    xyz.block.ftl.v1.DeploymentChangeType result = xyz.block.ftl.v1.DeploymentChangeType.forNumber(changeType_);
    return result == null ? xyz.block.ftl.v1.DeploymentChangeType.UNRECOGNIZED : result;
  }

  public static final int MODULE_REMOVED_FIELD_NUMBER = 6;
  private boolean moduleRemoved_ = false;
  /**
   * <pre>
   * If this is true then the module was removed as well as the deployment. This is only set for DEPLOYMENT_REMOVED.
   * </pre>
   *
   * <code>bool module_removed = 6 [json_name = "moduleRemoved"];</code>
   * @return The moduleRemoved.
   */
  @java.lang.Override
  public boolean getModuleRemoved() {
    return moduleRemoved_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, deploymentKey_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(moduleName_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, moduleName_);
    }
    if (more_ != false) {
      output.writeBool(3, more_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(4, getSchema());
    }
    if (changeType_ != xyz.block.ftl.v1.DeploymentChangeType.DEPLOYMENT_CHANGE_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(5, changeType_);
    }
    if (moduleRemoved_ != false) {
      output.writeBool(6, moduleRemoved_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, deploymentKey_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(moduleName_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, moduleName_);
    }
    if (more_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, more_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getSchema());
    }
    if (changeType_ != xyz.block.ftl.v1.DeploymentChangeType.DEPLOYMENT_CHANGE_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, changeType_);
    }
    if (moduleRemoved_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, moduleRemoved_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof xyz.block.ftl.v1.PullSchemaResponse)) {
      return super.equals(obj);
    }
    xyz.block.ftl.v1.PullSchemaResponse other = (xyz.block.ftl.v1.PullSchemaResponse) obj;

    if (hasDeploymentKey() != other.hasDeploymentKey()) return false;
    if (hasDeploymentKey()) {
      if (!getDeploymentKey()
          .equals(other.getDeploymentKey())) return false;
    }
    if (!getModuleName()
        .equals(other.getModuleName())) return false;
    if (hasSchema() != other.hasSchema()) return false;
    if (hasSchema()) {
      if (!getSchema()
          .equals(other.getSchema())) return false;
    }
    if (getMore()
        != other.getMore()) return false;
    if (changeType_ != other.changeType_) return false;
    if (getModuleRemoved()
        != other.getModuleRemoved()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasDeploymentKey()) {
      hash = (37 * hash) + DEPLOYMENT_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getDeploymentKey().hashCode();
    }
    hash = (37 * hash) + MODULE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getModuleName().hashCode();
    if (hasSchema()) {
      hash = (37 * hash) + SCHEMA_FIELD_NUMBER;
      hash = (53 * hash) + getSchema().hashCode();
    }
    hash = (37 * hash) + MORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMore());
    hash = (37 * hash) + CHANGE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + changeType_;
    hash = (37 * hash) + MODULE_REMOVED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getModuleRemoved());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static xyz.block.ftl.v1.PullSchemaResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.v1.PullSchemaResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.v1.PullSchemaResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.v1.PullSchemaResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.v1.PullSchemaResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.v1.PullSchemaResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.v1.PullSchemaResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.v1.PullSchemaResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static xyz.block.ftl.v1.PullSchemaResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static xyz.block.ftl.v1.PullSchemaResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.block.ftl.v1.PullSchemaResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.v1.PullSchemaResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(xyz.block.ftl.v1.PullSchemaResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code xyz.block.ftl.v1.PullSchemaResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xyz.block.ftl.v1.PullSchemaResponse)
      xyz.block.ftl.v1.PullSchemaResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xyz.block.ftl.v1.Schemaservice.internal_static_xyz_block_ftl_v1_PullSchemaResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xyz.block.ftl.v1.Schemaservice.internal_static_xyz_block_ftl_v1_PullSchemaResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xyz.block.ftl.v1.PullSchemaResponse.class, xyz.block.ftl.v1.PullSchemaResponse.Builder.class);
    }

    // Construct using xyz.block.ftl.v1.PullSchemaResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getSchemaFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      deploymentKey_ = "";
      moduleName_ = "";
      schema_ = null;
      if (schemaBuilder_ != null) {
        schemaBuilder_.dispose();
        schemaBuilder_ = null;
      }
      more_ = false;
      changeType_ = 0;
      moduleRemoved_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return xyz.block.ftl.v1.Schemaservice.internal_static_xyz_block_ftl_v1_PullSchemaResponse_descriptor;
    }

    @java.lang.Override
    public xyz.block.ftl.v1.PullSchemaResponse getDefaultInstanceForType() {
      return xyz.block.ftl.v1.PullSchemaResponse.getDefaultInstance();
    }

    @java.lang.Override
    public xyz.block.ftl.v1.PullSchemaResponse build() {
      xyz.block.ftl.v1.PullSchemaResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public xyz.block.ftl.v1.PullSchemaResponse buildPartial() {
      xyz.block.ftl.v1.PullSchemaResponse result = new xyz.block.ftl.v1.PullSchemaResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(xyz.block.ftl.v1.PullSchemaResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deploymentKey_ = deploymentKey_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.moduleName_ = moduleName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.schema_ = schemaBuilder_ == null
            ? schema_
            : schemaBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.more_ = more_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.changeType_ = changeType_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.moduleRemoved_ = moduleRemoved_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof xyz.block.ftl.v1.PullSchemaResponse) {
        return mergeFrom((xyz.block.ftl.v1.PullSchemaResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(xyz.block.ftl.v1.PullSchemaResponse other) {
      if (other == xyz.block.ftl.v1.PullSchemaResponse.getDefaultInstance()) return this;
      if (other.hasDeploymentKey()) {
        deploymentKey_ = other.deploymentKey_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getModuleName().isEmpty()) {
        moduleName_ = other.moduleName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasSchema()) {
        mergeSchema(other.getSchema());
      }
      if (other.getMore() != false) {
        setMore(other.getMore());
      }
      if (other.changeType_ != 0) {
        setChangeTypeValue(other.getChangeTypeValue());
      }
      if (other.getModuleRemoved() != false) {
        setModuleRemoved(other.getModuleRemoved());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              deploymentKey_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              moduleName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              more_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getSchemaFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 34
            case 40: {
              changeType_ = input.readEnum();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              moduleRemoved_ = input.readBool();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object deploymentKey_ = "";
    /**
     * <pre>
     * Will not be set for builtin modules.
     * </pre>
     *
     * <code>optional string deployment_key = 1 [json_name = "deploymentKey"];</code>
     * @return Whether the deploymentKey field is set.
     */
    public boolean hasDeploymentKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Will not be set for builtin modules.
     * </pre>
     *
     * <code>optional string deployment_key = 1 [json_name = "deploymentKey"];</code>
     * @return The deploymentKey.
     */
    public java.lang.String getDeploymentKey() {
      java.lang.Object ref = deploymentKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deploymentKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Will not be set for builtin modules.
     * </pre>
     *
     * <code>optional string deployment_key = 1 [json_name = "deploymentKey"];</code>
     * @return The bytes for deploymentKey.
     */
    public com.google.protobuf.ByteString
        getDeploymentKeyBytes() {
      java.lang.Object ref = deploymentKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deploymentKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Will not be set for builtin modules.
     * </pre>
     *
     * <code>optional string deployment_key = 1 [json_name = "deploymentKey"];</code>
     * @param value The deploymentKey to set.
     * @return This builder for chaining.
     */
    public Builder setDeploymentKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      deploymentKey_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Will not be set for builtin modules.
     * </pre>
     *
     * <code>optional string deployment_key = 1 [json_name = "deploymentKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDeploymentKey() {
      deploymentKey_ = getDefaultInstance().getDeploymentKey();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Will not be set for builtin modules.
     * </pre>
     *
     * <code>optional string deployment_key = 1 [json_name = "deploymentKey"];</code>
     * @param value The bytes for deploymentKey to set.
     * @return This builder for chaining.
     */
    public Builder setDeploymentKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      deploymentKey_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object moduleName_ = "";
    /**
     * <code>string module_name = 2 [json_name = "moduleName"];</code>
     * @return The moduleName.
     */
    public java.lang.String getModuleName() {
      java.lang.Object ref = moduleName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        moduleName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string module_name = 2 [json_name = "moduleName"];</code>
     * @return The bytes for moduleName.
     */
    public com.google.protobuf.ByteString
        getModuleNameBytes() {
      java.lang.Object ref = moduleName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        moduleName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string module_name = 2 [json_name = "moduleName"];</code>
     * @param value The moduleName to set.
     * @return This builder for chaining.
     */
    public Builder setModuleName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      moduleName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string module_name = 2 [json_name = "moduleName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearModuleName() {
      moduleName_ = getDefaultInstance().getModuleName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string module_name = 2 [json_name = "moduleName"];</code>
     * @param value The bytes for moduleName to set.
     * @return This builder for chaining.
     */
    public Builder setModuleNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      moduleName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private xyz.block.ftl.schema.v1.Module schema_;
    private com.google.protobuf.SingleFieldBuilder<
        xyz.block.ftl.schema.v1.Module, xyz.block.ftl.schema.v1.Module.Builder, xyz.block.ftl.schema.v1.ModuleOrBuilder> schemaBuilder_;
    /**
     * <pre>
     * For deletes this will not be present.
     * </pre>
     *
     * <code>optional .xyz.block.ftl.schema.v1.Module schema = 4 [json_name = "schema"];</code>
     * @return Whether the schema field is set.
     */
    public boolean hasSchema() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * For deletes this will not be present.
     * </pre>
     *
     * <code>optional .xyz.block.ftl.schema.v1.Module schema = 4 [json_name = "schema"];</code>
     * @return The schema.
     */
    public xyz.block.ftl.schema.v1.Module getSchema() {
      if (schemaBuilder_ == null) {
        return schema_ == null ? xyz.block.ftl.schema.v1.Module.getDefaultInstance() : schema_;
      } else {
        return schemaBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * For deletes this will not be present.
     * </pre>
     *
     * <code>optional .xyz.block.ftl.schema.v1.Module schema = 4 [json_name = "schema"];</code>
     */
    public Builder setSchema(xyz.block.ftl.schema.v1.Module value) {
      if (schemaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        schema_ = value;
      } else {
        schemaBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For deletes this will not be present.
     * </pre>
     *
     * <code>optional .xyz.block.ftl.schema.v1.Module schema = 4 [json_name = "schema"];</code>
     */
    public Builder setSchema(
        xyz.block.ftl.schema.v1.Module.Builder builderForValue) {
      if (schemaBuilder_ == null) {
        schema_ = builderForValue.build();
      } else {
        schemaBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For deletes this will not be present.
     * </pre>
     *
     * <code>optional .xyz.block.ftl.schema.v1.Module schema = 4 [json_name = "schema"];</code>
     */
    public Builder mergeSchema(xyz.block.ftl.schema.v1.Module value) {
      if (schemaBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          schema_ != null &&
          schema_ != xyz.block.ftl.schema.v1.Module.getDefaultInstance()) {
          getSchemaBuilder().mergeFrom(value);
        } else {
          schema_ = value;
        }
      } else {
        schemaBuilder_.mergeFrom(value);
      }
      if (schema_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * For deletes this will not be present.
     * </pre>
     *
     * <code>optional .xyz.block.ftl.schema.v1.Module schema = 4 [json_name = "schema"];</code>
     */
    public Builder clearSchema() {
      bitField0_ = (bitField0_ & ~0x00000004);
      schema_ = null;
      if (schemaBuilder_ != null) {
        schemaBuilder_.dispose();
        schemaBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For deletes this will not be present.
     * </pre>
     *
     * <code>optional .xyz.block.ftl.schema.v1.Module schema = 4 [json_name = "schema"];</code>
     */
    public xyz.block.ftl.schema.v1.Module.Builder getSchemaBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getSchemaFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * For deletes this will not be present.
     * </pre>
     *
     * <code>optional .xyz.block.ftl.schema.v1.Module schema = 4 [json_name = "schema"];</code>
     */
    public xyz.block.ftl.schema.v1.ModuleOrBuilder getSchemaOrBuilder() {
      if (schemaBuilder_ != null) {
        return schemaBuilder_.getMessageOrBuilder();
      } else {
        return schema_ == null ?
            xyz.block.ftl.schema.v1.Module.getDefaultInstance() : schema_;
      }
    }
    /**
     * <pre>
     * For deletes this will not be present.
     * </pre>
     *
     * <code>optional .xyz.block.ftl.schema.v1.Module schema = 4 [json_name = "schema"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        xyz.block.ftl.schema.v1.Module, xyz.block.ftl.schema.v1.Module.Builder, xyz.block.ftl.schema.v1.ModuleOrBuilder> 
        getSchemaFieldBuilder() {
      if (schemaBuilder_ == null) {
        schemaBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            xyz.block.ftl.schema.v1.Module, xyz.block.ftl.schema.v1.Module.Builder, xyz.block.ftl.schema.v1.ModuleOrBuilder>(
                getSchema(),
                getParentForChildren(),
                isClean());
        schema_ = null;
      }
      return schemaBuilder_;
    }

    private boolean more_ ;
    /**
     * <pre>
     * If true there are more schema changes immediately following this one as part of the initial batch.
     * If false this is the last schema change in the initial batch, but others may follow later.
     * </pre>
     *
     * <code>bool more = 3 [json_name = "more"];</code>
     * @return The more.
     */
    @java.lang.Override
    public boolean getMore() {
      return more_;
    }
    /**
     * <pre>
     * If true there are more schema changes immediately following this one as part of the initial batch.
     * If false this is the last schema change in the initial batch, but others may follow later.
     * </pre>
     *
     * <code>bool more = 3 [json_name = "more"];</code>
     * @param value The more to set.
     * @return This builder for chaining.
     */
    public Builder setMore(boolean value) {

      more_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true there are more schema changes immediately following this one as part of the initial batch.
     * If false this is the last schema change in the initial batch, but others may follow later.
     * </pre>
     *
     * <code>bool more = 3 [json_name = "more"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMore() {
      bitField0_ = (bitField0_ & ~0x00000008);
      more_ = false;
      onChanged();
      return this;
    }

    private int changeType_ = 0;
    /**
     * <code>.xyz.block.ftl.v1.DeploymentChangeType change_type = 5 [json_name = "changeType"];</code>
     * @return The enum numeric value on the wire for changeType.
     */
    @java.lang.Override public int getChangeTypeValue() {
      return changeType_;
    }
    /**
     * <code>.xyz.block.ftl.v1.DeploymentChangeType change_type = 5 [json_name = "changeType"];</code>
     * @param value The enum numeric value on the wire for changeType to set.
     * @return This builder for chaining.
     */
    public Builder setChangeTypeValue(int value) {
      changeType_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.xyz.block.ftl.v1.DeploymentChangeType change_type = 5 [json_name = "changeType"];</code>
     * @return The changeType.
     */
    @java.lang.Override
    public xyz.block.ftl.v1.DeploymentChangeType getChangeType() {
      xyz.block.ftl.v1.DeploymentChangeType result = xyz.block.ftl.v1.DeploymentChangeType.forNumber(changeType_);
      return result == null ? xyz.block.ftl.v1.DeploymentChangeType.UNRECOGNIZED : result;
    }
    /**
     * <code>.xyz.block.ftl.v1.DeploymentChangeType change_type = 5 [json_name = "changeType"];</code>
     * @param value The changeType to set.
     * @return This builder for chaining.
     */
    public Builder setChangeType(xyz.block.ftl.v1.DeploymentChangeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      changeType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.xyz.block.ftl.v1.DeploymentChangeType change_type = 5 [json_name = "changeType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChangeType() {
      bitField0_ = (bitField0_ & ~0x00000010);
      changeType_ = 0;
      onChanged();
      return this;
    }

    private boolean moduleRemoved_ ;
    /**
     * <pre>
     * If this is true then the module was removed as well as the deployment. This is only set for DEPLOYMENT_REMOVED.
     * </pre>
     *
     * <code>bool module_removed = 6 [json_name = "moduleRemoved"];</code>
     * @return The moduleRemoved.
     */
    @java.lang.Override
    public boolean getModuleRemoved() {
      return moduleRemoved_;
    }
    /**
     * <pre>
     * If this is true then the module was removed as well as the deployment. This is only set for DEPLOYMENT_REMOVED.
     * </pre>
     *
     * <code>bool module_removed = 6 [json_name = "moduleRemoved"];</code>
     * @param value The moduleRemoved to set.
     * @return This builder for chaining.
     */
    public Builder setModuleRemoved(boolean value) {

      moduleRemoved_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If this is true then the module was removed as well as the deployment. This is only set for DEPLOYMENT_REMOVED.
     * </pre>
     *
     * <code>bool module_removed = 6 [json_name = "moduleRemoved"];</code>
     * @return This builder for chaining.
     */
    public Builder clearModuleRemoved() {
      bitField0_ = (bitField0_ & ~0x00000020);
      moduleRemoved_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:xyz.block.ftl.v1.PullSchemaResponse)
  }

  // @@protoc_insertion_point(class_scope:xyz.block.ftl.v1.PullSchemaResponse)
  private static final xyz.block.ftl.v1.PullSchemaResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new xyz.block.ftl.v1.PullSchemaResponse();
  }

  public static xyz.block.ftl.v1.PullSchemaResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PullSchemaResponse>
      PARSER = new com.google.protobuf.AbstractParser<PullSchemaResponse>() {
    @java.lang.Override
    public PullSchemaResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<PullSchemaResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PullSchemaResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public xyz.block.ftl.v1.PullSchemaResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

