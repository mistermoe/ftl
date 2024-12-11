// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/v1/admin.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.v1;

/**
 * Protobuf type {@code xyz.block.ftl.v1.SecretSetRequest}
 */
public final class SecretSetRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:xyz.block.ftl.v1.SecretSetRequest)
    SecretSetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      SecretSetRequest.class.getName());
  }
  // Use SecretSetRequest.newBuilder() to construct.
  private SecretSetRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private SecretSetRequest() {
    provider_ = 0;
    value_ = com.google.protobuf.ByteString.EMPTY;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return xyz.block.ftl.v1.Admin.internal_static_xyz_block_ftl_v1_SecretSetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return xyz.block.ftl.v1.Admin.internal_static_xyz_block_ftl_v1_SecretSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            xyz.block.ftl.v1.SecretSetRequest.class, xyz.block.ftl.v1.SecretSetRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PROVIDER_FIELD_NUMBER = 1;
  private int provider_ = 0;
  /**
   * <code>optional .xyz.block.ftl.v1.SecretProvider provider = 1 [json_name = "provider"];</code>
   * @return Whether the provider field is set.
   */
  @java.lang.Override public boolean hasProvider() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .xyz.block.ftl.v1.SecretProvider provider = 1 [json_name = "provider"];</code>
   * @return The enum numeric value on the wire for provider.
   */
  @java.lang.Override public int getProviderValue() {
    return provider_;
  }
  /**
   * <code>optional .xyz.block.ftl.v1.SecretProvider provider = 1 [json_name = "provider"];</code>
   * @return The provider.
   */
  @java.lang.Override public xyz.block.ftl.v1.SecretProvider getProvider() {
    xyz.block.ftl.v1.SecretProvider result = xyz.block.ftl.v1.SecretProvider.forNumber(provider_);
    return result == null ? xyz.block.ftl.v1.SecretProvider.UNRECOGNIZED : result;
  }

  public static final int REF_FIELD_NUMBER = 2;
  private xyz.block.ftl.v1.ConfigRef ref_;
  /**
   * <code>.xyz.block.ftl.v1.ConfigRef ref = 2 [json_name = "ref"];</code>
   * @return Whether the ref field is set.
   */
  @java.lang.Override
  public boolean hasRef() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.xyz.block.ftl.v1.ConfigRef ref = 2 [json_name = "ref"];</code>
   * @return The ref.
   */
  @java.lang.Override
  public xyz.block.ftl.v1.ConfigRef getRef() {
    return ref_ == null ? xyz.block.ftl.v1.ConfigRef.getDefaultInstance() : ref_;
  }
  /**
   * <code>.xyz.block.ftl.v1.ConfigRef ref = 2 [json_name = "ref"];</code>
   */
  @java.lang.Override
  public xyz.block.ftl.v1.ConfigRefOrBuilder getRefOrBuilder() {
    return ref_ == null ? xyz.block.ftl.v1.ConfigRef.getDefaultInstance() : ref_;
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes value = 3 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getValue() {
    return value_;
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
      output.writeEnum(1, provider_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getRef());
    }
    if (!value_.isEmpty()) {
      output.writeBytes(3, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, provider_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRef());
    }
    if (!value_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, value_);
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
    if (!(obj instanceof xyz.block.ftl.v1.SecretSetRequest)) {
      return super.equals(obj);
    }
    xyz.block.ftl.v1.SecretSetRequest other = (xyz.block.ftl.v1.SecretSetRequest) obj;

    if (hasProvider() != other.hasProvider()) return false;
    if (hasProvider()) {
      if (provider_ != other.provider_) return false;
    }
    if (hasRef() != other.hasRef()) return false;
    if (hasRef()) {
      if (!getRef()
          .equals(other.getRef())) return false;
    }
    if (!getValue()
        .equals(other.getValue())) return false;
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
    if (hasProvider()) {
      hash = (37 * hash) + PROVIDER_FIELD_NUMBER;
      hash = (53 * hash) + provider_;
    }
    if (hasRef()) {
      hash = (37 * hash) + REF_FIELD_NUMBER;
      hash = (53 * hash) + getRef().hashCode();
    }
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static xyz.block.ftl.v1.SecretSetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.v1.SecretSetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.v1.SecretSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.v1.SecretSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.v1.SecretSetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.v1.SecretSetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.v1.SecretSetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.v1.SecretSetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static xyz.block.ftl.v1.SecretSetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static xyz.block.ftl.v1.SecretSetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.block.ftl.v1.SecretSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.v1.SecretSetRequest parseFrom(
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
  public static Builder newBuilder(xyz.block.ftl.v1.SecretSetRequest prototype) {
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
   * Protobuf type {@code xyz.block.ftl.v1.SecretSetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xyz.block.ftl.v1.SecretSetRequest)
      xyz.block.ftl.v1.SecretSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xyz.block.ftl.v1.Admin.internal_static_xyz_block_ftl_v1_SecretSetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xyz.block.ftl.v1.Admin.internal_static_xyz_block_ftl_v1_SecretSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xyz.block.ftl.v1.SecretSetRequest.class, xyz.block.ftl.v1.SecretSetRequest.Builder.class);
    }

    // Construct using xyz.block.ftl.v1.SecretSetRequest.newBuilder()
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
        getRefFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      provider_ = 0;
      ref_ = null;
      if (refBuilder_ != null) {
        refBuilder_.dispose();
        refBuilder_ = null;
      }
      value_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return xyz.block.ftl.v1.Admin.internal_static_xyz_block_ftl_v1_SecretSetRequest_descriptor;
    }

    @java.lang.Override
    public xyz.block.ftl.v1.SecretSetRequest getDefaultInstanceForType() {
      return xyz.block.ftl.v1.SecretSetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public xyz.block.ftl.v1.SecretSetRequest build() {
      xyz.block.ftl.v1.SecretSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public xyz.block.ftl.v1.SecretSetRequest buildPartial() {
      xyz.block.ftl.v1.SecretSetRequest result = new xyz.block.ftl.v1.SecretSetRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(xyz.block.ftl.v1.SecretSetRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.provider_ = provider_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ref_ = refBuilder_ == null
            ? ref_
            : refBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.value_ = value_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof xyz.block.ftl.v1.SecretSetRequest) {
        return mergeFrom((xyz.block.ftl.v1.SecretSetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(xyz.block.ftl.v1.SecretSetRequest other) {
      if (other == xyz.block.ftl.v1.SecretSetRequest.getDefaultInstance()) return this;
      if (other.hasProvider()) {
        setProvider(other.getProvider());
      }
      if (other.hasRef()) {
        mergeRef(other.getRef());
      }
      if (other.getValue() != com.google.protobuf.ByteString.EMPTY) {
        setValue(other.getValue());
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
            case 8: {
              provider_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getRefFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              value_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private int provider_ = 0;
    /**
     * <code>optional .xyz.block.ftl.v1.SecretProvider provider = 1 [json_name = "provider"];</code>
     * @return Whether the provider field is set.
     */
    @java.lang.Override public boolean hasProvider() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .xyz.block.ftl.v1.SecretProvider provider = 1 [json_name = "provider"];</code>
     * @return The enum numeric value on the wire for provider.
     */
    @java.lang.Override public int getProviderValue() {
      return provider_;
    }
    /**
     * <code>optional .xyz.block.ftl.v1.SecretProvider provider = 1 [json_name = "provider"];</code>
     * @param value The enum numeric value on the wire for provider to set.
     * @return This builder for chaining.
     */
    public Builder setProviderValue(int value) {
      provider_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .xyz.block.ftl.v1.SecretProvider provider = 1 [json_name = "provider"];</code>
     * @return The provider.
     */
    @java.lang.Override
    public xyz.block.ftl.v1.SecretProvider getProvider() {
      xyz.block.ftl.v1.SecretProvider result = xyz.block.ftl.v1.SecretProvider.forNumber(provider_);
      return result == null ? xyz.block.ftl.v1.SecretProvider.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .xyz.block.ftl.v1.SecretProvider provider = 1 [json_name = "provider"];</code>
     * @param value The provider to set.
     * @return This builder for chaining.
     */
    public Builder setProvider(xyz.block.ftl.v1.SecretProvider value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      provider_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .xyz.block.ftl.v1.SecretProvider provider = 1 [json_name = "provider"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProvider() {
      bitField0_ = (bitField0_ & ~0x00000001);
      provider_ = 0;
      onChanged();
      return this;
    }

    private xyz.block.ftl.v1.ConfigRef ref_;
    private com.google.protobuf.SingleFieldBuilder<
        xyz.block.ftl.v1.ConfigRef, xyz.block.ftl.v1.ConfigRef.Builder, xyz.block.ftl.v1.ConfigRefOrBuilder> refBuilder_;
    /**
     * <code>.xyz.block.ftl.v1.ConfigRef ref = 2 [json_name = "ref"];</code>
     * @return Whether the ref field is set.
     */
    public boolean hasRef() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.xyz.block.ftl.v1.ConfigRef ref = 2 [json_name = "ref"];</code>
     * @return The ref.
     */
    public xyz.block.ftl.v1.ConfigRef getRef() {
      if (refBuilder_ == null) {
        return ref_ == null ? xyz.block.ftl.v1.ConfigRef.getDefaultInstance() : ref_;
      } else {
        return refBuilder_.getMessage();
      }
    }
    /**
     * <code>.xyz.block.ftl.v1.ConfigRef ref = 2 [json_name = "ref"];</code>
     */
    public Builder setRef(xyz.block.ftl.v1.ConfigRef value) {
      if (refBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ref_ = value;
      } else {
        refBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.xyz.block.ftl.v1.ConfigRef ref = 2 [json_name = "ref"];</code>
     */
    public Builder setRef(
        xyz.block.ftl.v1.ConfigRef.Builder builderForValue) {
      if (refBuilder_ == null) {
        ref_ = builderForValue.build();
      } else {
        refBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.xyz.block.ftl.v1.ConfigRef ref = 2 [json_name = "ref"];</code>
     */
    public Builder mergeRef(xyz.block.ftl.v1.ConfigRef value) {
      if (refBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          ref_ != null &&
          ref_ != xyz.block.ftl.v1.ConfigRef.getDefaultInstance()) {
          getRefBuilder().mergeFrom(value);
        } else {
          ref_ = value;
        }
      } else {
        refBuilder_.mergeFrom(value);
      }
      if (ref_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.xyz.block.ftl.v1.ConfigRef ref = 2 [json_name = "ref"];</code>
     */
    public Builder clearRef() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ref_ = null;
      if (refBuilder_ != null) {
        refBuilder_.dispose();
        refBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.xyz.block.ftl.v1.ConfigRef ref = 2 [json_name = "ref"];</code>
     */
    public xyz.block.ftl.v1.ConfigRef.Builder getRefBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRefFieldBuilder().getBuilder();
    }
    /**
     * <code>.xyz.block.ftl.v1.ConfigRef ref = 2 [json_name = "ref"];</code>
     */
    public xyz.block.ftl.v1.ConfigRefOrBuilder getRefOrBuilder() {
      if (refBuilder_ != null) {
        return refBuilder_.getMessageOrBuilder();
      } else {
        return ref_ == null ?
            xyz.block.ftl.v1.ConfigRef.getDefaultInstance() : ref_;
      }
    }
    /**
     * <code>.xyz.block.ftl.v1.ConfigRef ref = 2 [json_name = "ref"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        xyz.block.ftl.v1.ConfigRef, xyz.block.ftl.v1.ConfigRef.Builder, xyz.block.ftl.v1.ConfigRefOrBuilder> 
        getRefFieldBuilder() {
      if (refBuilder_ == null) {
        refBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            xyz.block.ftl.v1.ConfigRef, xyz.block.ftl.v1.ConfigRef.Builder, xyz.block.ftl.v1.ConfigRefOrBuilder>(
                getRef(),
                getParentForChildren(),
                isClean());
        ref_ = null;
      }
      return refBuilder_;
    }

    private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes value = 3 [json_name = "value"];</code>
     * @return The value.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }
    /**
     * <code>bytes value = 3 [json_name = "value"];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      value_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bytes value = 3 [json_name = "value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000004);
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:xyz.block.ftl.v1.SecretSetRequest)
  }

  // @@protoc_insertion_point(class_scope:xyz.block.ftl.v1.SecretSetRequest)
  private static final xyz.block.ftl.v1.SecretSetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new xyz.block.ftl.v1.SecretSetRequest();
  }

  public static xyz.block.ftl.v1.SecretSetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecretSetRequest>
      PARSER = new com.google.protobuf.AbstractParser<SecretSetRequest>() {
    @java.lang.Override
    public SecretSetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SecretSetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecretSetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public xyz.block.ftl.v1.SecretSetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

