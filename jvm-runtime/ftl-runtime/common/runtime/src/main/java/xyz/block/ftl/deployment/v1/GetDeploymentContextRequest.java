// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/deployment/v1/deployment.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.deployment.v1;

/**
 * Protobuf type {@code xyz.block.ftl.deployment.v1.GetDeploymentContextRequest}
 */
public final class GetDeploymentContextRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:xyz.block.ftl.deployment.v1.GetDeploymentContextRequest)
    GetDeploymentContextRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      GetDeploymentContextRequest.class.getName());
  }
  // Use GetDeploymentContextRequest.newBuilder() to construct.
  private GetDeploymentContextRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetDeploymentContextRequest() {
    deployment_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return xyz.block.ftl.deployment.v1.Deployment.internal_static_xyz_block_ftl_deployment_v1_GetDeploymentContextRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return xyz.block.ftl.deployment.v1.Deployment.internal_static_xyz_block_ftl_deployment_v1_GetDeploymentContextRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            xyz.block.ftl.deployment.v1.GetDeploymentContextRequest.class, xyz.block.ftl.deployment.v1.GetDeploymentContextRequest.Builder.class);
  }

  public static final int DEPLOYMENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object deployment_ = "";
  /**
   * <code>string deployment = 1 [json_name = "deployment"];</code>
   * @return The deployment.
   */
  @java.lang.Override
  public java.lang.String getDeployment() {
    java.lang.Object ref = deployment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deployment_ = s;
      return s;
    }
  }
  /**
   * <code>string deployment = 1 [json_name = "deployment"];</code>
   * @return The bytes for deployment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeploymentBytes() {
    java.lang.Object ref = deployment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deployment_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(deployment_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, deployment_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(deployment_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, deployment_);
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
    if (!(obj instanceof xyz.block.ftl.deployment.v1.GetDeploymentContextRequest)) {
      return super.equals(obj);
    }
    xyz.block.ftl.deployment.v1.GetDeploymentContextRequest other = (xyz.block.ftl.deployment.v1.GetDeploymentContextRequest) obj;

    if (!getDeployment()
        .equals(other.getDeployment())) return false;
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
    hash = (37 * hash) + DEPLOYMENT_FIELD_NUMBER;
    hash = (53 * hash) + getDeployment().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static xyz.block.ftl.deployment.v1.GetDeploymentContextRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.deployment.v1.GetDeploymentContextRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.deployment.v1.GetDeploymentContextRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.deployment.v1.GetDeploymentContextRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.deployment.v1.GetDeploymentContextRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.deployment.v1.GetDeploymentContextRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.deployment.v1.GetDeploymentContextRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.deployment.v1.GetDeploymentContextRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static xyz.block.ftl.deployment.v1.GetDeploymentContextRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static xyz.block.ftl.deployment.v1.GetDeploymentContextRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.block.ftl.deployment.v1.GetDeploymentContextRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.deployment.v1.GetDeploymentContextRequest parseFrom(
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
  public static Builder newBuilder(xyz.block.ftl.deployment.v1.GetDeploymentContextRequest prototype) {
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
   * Protobuf type {@code xyz.block.ftl.deployment.v1.GetDeploymentContextRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xyz.block.ftl.deployment.v1.GetDeploymentContextRequest)
      xyz.block.ftl.deployment.v1.GetDeploymentContextRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xyz.block.ftl.deployment.v1.Deployment.internal_static_xyz_block_ftl_deployment_v1_GetDeploymentContextRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xyz.block.ftl.deployment.v1.Deployment.internal_static_xyz_block_ftl_deployment_v1_GetDeploymentContextRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xyz.block.ftl.deployment.v1.GetDeploymentContextRequest.class, xyz.block.ftl.deployment.v1.GetDeploymentContextRequest.Builder.class);
    }

    // Construct using xyz.block.ftl.deployment.v1.GetDeploymentContextRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      deployment_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return xyz.block.ftl.deployment.v1.Deployment.internal_static_xyz_block_ftl_deployment_v1_GetDeploymentContextRequest_descriptor;
    }

    @java.lang.Override
    public xyz.block.ftl.deployment.v1.GetDeploymentContextRequest getDefaultInstanceForType() {
      return xyz.block.ftl.deployment.v1.GetDeploymentContextRequest.getDefaultInstance();
    }

    @java.lang.Override
    public xyz.block.ftl.deployment.v1.GetDeploymentContextRequest build() {
      xyz.block.ftl.deployment.v1.GetDeploymentContextRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public xyz.block.ftl.deployment.v1.GetDeploymentContextRequest buildPartial() {
      xyz.block.ftl.deployment.v1.GetDeploymentContextRequest result = new xyz.block.ftl.deployment.v1.GetDeploymentContextRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(xyz.block.ftl.deployment.v1.GetDeploymentContextRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deployment_ = deployment_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof xyz.block.ftl.deployment.v1.GetDeploymentContextRequest) {
        return mergeFrom((xyz.block.ftl.deployment.v1.GetDeploymentContextRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(xyz.block.ftl.deployment.v1.GetDeploymentContextRequest other) {
      if (other == xyz.block.ftl.deployment.v1.GetDeploymentContextRequest.getDefaultInstance()) return this;
      if (!other.getDeployment().isEmpty()) {
        deployment_ = other.deployment_;
        bitField0_ |= 0x00000001;
        onChanged();
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
              deployment_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private java.lang.Object deployment_ = "";
    /**
     * <code>string deployment = 1 [json_name = "deployment"];</code>
     * @return The deployment.
     */
    public java.lang.String getDeployment() {
      java.lang.Object ref = deployment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deployment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string deployment = 1 [json_name = "deployment"];</code>
     * @return The bytes for deployment.
     */
    public com.google.protobuf.ByteString
        getDeploymentBytes() {
      java.lang.Object ref = deployment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deployment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string deployment = 1 [json_name = "deployment"];</code>
     * @param value The deployment to set.
     * @return This builder for chaining.
     */
    public Builder setDeployment(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      deployment_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string deployment = 1 [json_name = "deployment"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDeployment() {
      deployment_ = getDefaultInstance().getDeployment();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string deployment = 1 [json_name = "deployment"];</code>
     * @param value The bytes for deployment to set.
     * @return This builder for chaining.
     */
    public Builder setDeploymentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      deployment_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:xyz.block.ftl.deployment.v1.GetDeploymentContextRequest)
  }

  // @@protoc_insertion_point(class_scope:xyz.block.ftl.deployment.v1.GetDeploymentContextRequest)
  private static final xyz.block.ftl.deployment.v1.GetDeploymentContextRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new xyz.block.ftl.deployment.v1.GetDeploymentContextRequest();
  }

  public static xyz.block.ftl.deployment.v1.GetDeploymentContextRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDeploymentContextRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetDeploymentContextRequest>() {
    @java.lang.Override
    public GetDeploymentContextRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDeploymentContextRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDeploymentContextRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public xyz.block.ftl.deployment.v1.GetDeploymentContextRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

