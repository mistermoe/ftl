// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/v1/controller.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.v1;

/**
 * Protobuf type {@code xyz.block.ftl.v1.GetDeploymentArtefactsRequest}
 */
public final class GetDeploymentArtefactsRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:xyz.block.ftl.v1.GetDeploymentArtefactsRequest)
    GetDeploymentArtefactsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      GetDeploymentArtefactsRequest.class.getName());
  }
  // Use GetDeploymentArtefactsRequest.newBuilder() to construct.
  private GetDeploymentArtefactsRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetDeploymentArtefactsRequest() {
    deploymentKey_ = "";
    haveArtefacts_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return xyz.block.ftl.v1.ControllerOuterClass.internal_static_xyz_block_ftl_v1_GetDeploymentArtefactsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return xyz.block.ftl.v1.ControllerOuterClass.internal_static_xyz_block_ftl_v1_GetDeploymentArtefactsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            xyz.block.ftl.v1.GetDeploymentArtefactsRequest.class, xyz.block.ftl.v1.GetDeploymentArtefactsRequest.Builder.class);
  }

  public static final int DEPLOYMENT_KEY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object deploymentKey_ = "";
  /**
   * <code>string deployment_key = 1 [json_name = "deploymentKey"];</code>
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
   * <code>string deployment_key = 1 [json_name = "deploymentKey"];</code>
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

  public static final int HAVE_ARTEFACTS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<xyz.block.ftl.v1.DeploymentArtefact> haveArtefacts_;
  /**
   * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
   */
  @java.lang.Override
  public java.util.List<xyz.block.ftl.v1.DeploymentArtefact> getHaveArtefactsList() {
    return haveArtefacts_;
  }
  /**
   * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends xyz.block.ftl.v1.DeploymentArtefactOrBuilder> 
      getHaveArtefactsOrBuilderList() {
    return haveArtefacts_;
  }
  /**
   * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
   */
  @java.lang.Override
  public int getHaveArtefactsCount() {
    return haveArtefacts_.size();
  }
  /**
   * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
   */
  @java.lang.Override
  public xyz.block.ftl.v1.DeploymentArtefact getHaveArtefacts(int index) {
    return haveArtefacts_.get(index);
  }
  /**
   * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
   */
  @java.lang.Override
  public xyz.block.ftl.v1.DeploymentArtefactOrBuilder getHaveArtefactsOrBuilder(
      int index) {
    return haveArtefacts_.get(index);
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(deploymentKey_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, deploymentKey_);
    }
    for (int i = 0; i < haveArtefacts_.size(); i++) {
      output.writeMessage(2, haveArtefacts_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(deploymentKey_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, deploymentKey_);
    }
    for (int i = 0; i < haveArtefacts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, haveArtefacts_.get(i));
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
    if (!(obj instanceof xyz.block.ftl.v1.GetDeploymentArtefactsRequest)) {
      return super.equals(obj);
    }
    xyz.block.ftl.v1.GetDeploymentArtefactsRequest other = (xyz.block.ftl.v1.GetDeploymentArtefactsRequest) obj;

    if (!getDeploymentKey()
        .equals(other.getDeploymentKey())) return false;
    if (!getHaveArtefactsList()
        .equals(other.getHaveArtefactsList())) return false;
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
    hash = (37 * hash) + DEPLOYMENT_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getDeploymentKey().hashCode();
    if (getHaveArtefactsCount() > 0) {
      hash = (37 * hash) + HAVE_ARTEFACTS_FIELD_NUMBER;
      hash = (53 * hash) + getHaveArtefactsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static xyz.block.ftl.v1.GetDeploymentArtefactsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.v1.GetDeploymentArtefactsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.v1.GetDeploymentArtefactsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.v1.GetDeploymentArtefactsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.v1.GetDeploymentArtefactsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.v1.GetDeploymentArtefactsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.v1.GetDeploymentArtefactsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.v1.GetDeploymentArtefactsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static xyz.block.ftl.v1.GetDeploymentArtefactsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static xyz.block.ftl.v1.GetDeploymentArtefactsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.block.ftl.v1.GetDeploymentArtefactsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.v1.GetDeploymentArtefactsRequest parseFrom(
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
  public static Builder newBuilder(xyz.block.ftl.v1.GetDeploymentArtefactsRequest prototype) {
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
   * Protobuf type {@code xyz.block.ftl.v1.GetDeploymentArtefactsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xyz.block.ftl.v1.GetDeploymentArtefactsRequest)
      xyz.block.ftl.v1.GetDeploymentArtefactsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xyz.block.ftl.v1.ControllerOuterClass.internal_static_xyz_block_ftl_v1_GetDeploymentArtefactsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xyz.block.ftl.v1.ControllerOuterClass.internal_static_xyz_block_ftl_v1_GetDeploymentArtefactsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xyz.block.ftl.v1.GetDeploymentArtefactsRequest.class, xyz.block.ftl.v1.GetDeploymentArtefactsRequest.Builder.class);
    }

    // Construct using xyz.block.ftl.v1.GetDeploymentArtefactsRequest.newBuilder()
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
      deploymentKey_ = "";
      if (haveArtefactsBuilder_ == null) {
        haveArtefacts_ = java.util.Collections.emptyList();
      } else {
        haveArtefacts_ = null;
        haveArtefactsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return xyz.block.ftl.v1.ControllerOuterClass.internal_static_xyz_block_ftl_v1_GetDeploymentArtefactsRequest_descriptor;
    }

    @java.lang.Override
    public xyz.block.ftl.v1.GetDeploymentArtefactsRequest getDefaultInstanceForType() {
      return xyz.block.ftl.v1.GetDeploymentArtefactsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public xyz.block.ftl.v1.GetDeploymentArtefactsRequest build() {
      xyz.block.ftl.v1.GetDeploymentArtefactsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public xyz.block.ftl.v1.GetDeploymentArtefactsRequest buildPartial() {
      xyz.block.ftl.v1.GetDeploymentArtefactsRequest result = new xyz.block.ftl.v1.GetDeploymentArtefactsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(xyz.block.ftl.v1.GetDeploymentArtefactsRequest result) {
      if (haveArtefactsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          haveArtefacts_ = java.util.Collections.unmodifiableList(haveArtefacts_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.haveArtefacts_ = haveArtefacts_;
      } else {
        result.haveArtefacts_ = haveArtefactsBuilder_.build();
      }
    }

    private void buildPartial0(xyz.block.ftl.v1.GetDeploymentArtefactsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deploymentKey_ = deploymentKey_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof xyz.block.ftl.v1.GetDeploymentArtefactsRequest) {
        return mergeFrom((xyz.block.ftl.v1.GetDeploymentArtefactsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(xyz.block.ftl.v1.GetDeploymentArtefactsRequest other) {
      if (other == xyz.block.ftl.v1.GetDeploymentArtefactsRequest.getDefaultInstance()) return this;
      if (!other.getDeploymentKey().isEmpty()) {
        deploymentKey_ = other.deploymentKey_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (haveArtefactsBuilder_ == null) {
        if (!other.haveArtefacts_.isEmpty()) {
          if (haveArtefacts_.isEmpty()) {
            haveArtefacts_ = other.haveArtefacts_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureHaveArtefactsIsMutable();
            haveArtefacts_.addAll(other.haveArtefacts_);
          }
          onChanged();
        }
      } else {
        if (!other.haveArtefacts_.isEmpty()) {
          if (haveArtefactsBuilder_.isEmpty()) {
            haveArtefactsBuilder_.dispose();
            haveArtefactsBuilder_ = null;
            haveArtefacts_ = other.haveArtefacts_;
            bitField0_ = (bitField0_ & ~0x00000002);
            haveArtefactsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getHaveArtefactsFieldBuilder() : null;
          } else {
            haveArtefactsBuilder_.addAllMessages(other.haveArtefacts_);
          }
        }
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
              xyz.block.ftl.v1.DeploymentArtefact m =
                  input.readMessage(
                      xyz.block.ftl.v1.DeploymentArtefact.parser(),
                      extensionRegistry);
              if (haveArtefactsBuilder_ == null) {
                ensureHaveArtefactsIsMutable();
                haveArtefacts_.add(m);
              } else {
                haveArtefactsBuilder_.addMessage(m);
              }
              break;
            } // case 18
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
     * <code>string deployment_key = 1 [json_name = "deploymentKey"];</code>
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
     * <code>string deployment_key = 1 [json_name = "deploymentKey"];</code>
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
     * <code>string deployment_key = 1 [json_name = "deploymentKey"];</code>
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
     * <code>string deployment_key = 1 [json_name = "deploymentKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDeploymentKey() {
      deploymentKey_ = getDefaultInstance().getDeploymentKey();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string deployment_key = 1 [json_name = "deploymentKey"];</code>
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

    private java.util.List<xyz.block.ftl.v1.DeploymentArtefact> haveArtefacts_ =
      java.util.Collections.emptyList();
    private void ensureHaveArtefactsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        haveArtefacts_ = new java.util.ArrayList<xyz.block.ftl.v1.DeploymentArtefact>(haveArtefacts_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        xyz.block.ftl.v1.DeploymentArtefact, xyz.block.ftl.v1.DeploymentArtefact.Builder, xyz.block.ftl.v1.DeploymentArtefactOrBuilder> haveArtefactsBuilder_;

    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public java.util.List<xyz.block.ftl.v1.DeploymentArtefact> getHaveArtefactsList() {
      if (haveArtefactsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(haveArtefacts_);
      } else {
        return haveArtefactsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public int getHaveArtefactsCount() {
      if (haveArtefactsBuilder_ == null) {
        return haveArtefacts_.size();
      } else {
        return haveArtefactsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public xyz.block.ftl.v1.DeploymentArtefact getHaveArtefacts(int index) {
      if (haveArtefactsBuilder_ == null) {
        return haveArtefacts_.get(index);
      } else {
        return haveArtefactsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public Builder setHaveArtefacts(
        int index, xyz.block.ftl.v1.DeploymentArtefact value) {
      if (haveArtefactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHaveArtefactsIsMutable();
        haveArtefacts_.set(index, value);
        onChanged();
      } else {
        haveArtefactsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public Builder setHaveArtefacts(
        int index, xyz.block.ftl.v1.DeploymentArtefact.Builder builderForValue) {
      if (haveArtefactsBuilder_ == null) {
        ensureHaveArtefactsIsMutable();
        haveArtefacts_.set(index, builderForValue.build());
        onChanged();
      } else {
        haveArtefactsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public Builder addHaveArtefacts(xyz.block.ftl.v1.DeploymentArtefact value) {
      if (haveArtefactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHaveArtefactsIsMutable();
        haveArtefacts_.add(value);
        onChanged();
      } else {
        haveArtefactsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public Builder addHaveArtefacts(
        int index, xyz.block.ftl.v1.DeploymentArtefact value) {
      if (haveArtefactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHaveArtefactsIsMutable();
        haveArtefacts_.add(index, value);
        onChanged();
      } else {
        haveArtefactsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public Builder addHaveArtefacts(
        xyz.block.ftl.v1.DeploymentArtefact.Builder builderForValue) {
      if (haveArtefactsBuilder_ == null) {
        ensureHaveArtefactsIsMutable();
        haveArtefacts_.add(builderForValue.build());
        onChanged();
      } else {
        haveArtefactsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public Builder addHaveArtefacts(
        int index, xyz.block.ftl.v1.DeploymentArtefact.Builder builderForValue) {
      if (haveArtefactsBuilder_ == null) {
        ensureHaveArtefactsIsMutable();
        haveArtefacts_.add(index, builderForValue.build());
        onChanged();
      } else {
        haveArtefactsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public Builder addAllHaveArtefacts(
        java.lang.Iterable<? extends xyz.block.ftl.v1.DeploymentArtefact> values) {
      if (haveArtefactsBuilder_ == null) {
        ensureHaveArtefactsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, haveArtefacts_);
        onChanged();
      } else {
        haveArtefactsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public Builder clearHaveArtefacts() {
      if (haveArtefactsBuilder_ == null) {
        haveArtefacts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        haveArtefactsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public Builder removeHaveArtefacts(int index) {
      if (haveArtefactsBuilder_ == null) {
        ensureHaveArtefactsIsMutable();
        haveArtefacts_.remove(index);
        onChanged();
      } else {
        haveArtefactsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public xyz.block.ftl.v1.DeploymentArtefact.Builder getHaveArtefactsBuilder(
        int index) {
      return getHaveArtefactsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public xyz.block.ftl.v1.DeploymentArtefactOrBuilder getHaveArtefactsOrBuilder(
        int index) {
      if (haveArtefactsBuilder_ == null) {
        return haveArtefacts_.get(index);  } else {
        return haveArtefactsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public java.util.List<? extends xyz.block.ftl.v1.DeploymentArtefactOrBuilder> 
         getHaveArtefactsOrBuilderList() {
      if (haveArtefactsBuilder_ != null) {
        return haveArtefactsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(haveArtefacts_);
      }
    }
    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public xyz.block.ftl.v1.DeploymentArtefact.Builder addHaveArtefactsBuilder() {
      return getHaveArtefactsFieldBuilder().addBuilder(
          xyz.block.ftl.v1.DeploymentArtefact.getDefaultInstance());
    }
    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public xyz.block.ftl.v1.DeploymentArtefact.Builder addHaveArtefactsBuilder(
        int index) {
      return getHaveArtefactsFieldBuilder().addBuilder(
          index, xyz.block.ftl.v1.DeploymentArtefact.getDefaultInstance());
    }
    /**
     * <code>repeated .xyz.block.ftl.v1.DeploymentArtefact have_artefacts = 2 [json_name = "haveArtefacts"];</code>
     */
    public java.util.List<xyz.block.ftl.v1.DeploymentArtefact.Builder> 
         getHaveArtefactsBuilderList() {
      return getHaveArtefactsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        xyz.block.ftl.v1.DeploymentArtefact, xyz.block.ftl.v1.DeploymentArtefact.Builder, xyz.block.ftl.v1.DeploymentArtefactOrBuilder> 
        getHaveArtefactsFieldBuilder() {
      if (haveArtefactsBuilder_ == null) {
        haveArtefactsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            xyz.block.ftl.v1.DeploymentArtefact, xyz.block.ftl.v1.DeploymentArtefact.Builder, xyz.block.ftl.v1.DeploymentArtefactOrBuilder>(
                haveArtefacts_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        haveArtefacts_ = null;
      }
      return haveArtefactsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:xyz.block.ftl.v1.GetDeploymentArtefactsRequest)
  }

  // @@protoc_insertion_point(class_scope:xyz.block.ftl.v1.GetDeploymentArtefactsRequest)
  private static final xyz.block.ftl.v1.GetDeploymentArtefactsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new xyz.block.ftl.v1.GetDeploymentArtefactsRequest();
  }

  public static xyz.block.ftl.v1.GetDeploymentArtefactsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDeploymentArtefactsRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetDeploymentArtefactsRequest>() {
    @java.lang.Override
    public GetDeploymentArtefactsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDeploymentArtefactsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDeploymentArtefactsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public xyz.block.ftl.v1.GetDeploymentArtefactsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

