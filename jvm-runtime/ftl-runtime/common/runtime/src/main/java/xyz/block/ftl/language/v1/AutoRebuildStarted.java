// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/language/v1/language.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.language.v1;

/**
 * <pre>
 * AutoRebuildStarted should be sent when the plugin decides to start rebuilding automatically.
 *
 * It is not required to send this event, though it helps inform the user that their changes are not yet built.
 * FTL may ignore this event if it does not match FTL's current build context and state.
 * If the plugin decides to cancel the build because another build started, no failure or cancellation event needs
 * to be sent.
 * </pre>
 *
 * Protobuf type {@code xyz.block.ftl.language.v1.AutoRebuildStarted}
 */
public final class AutoRebuildStarted extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:xyz.block.ftl.language.v1.AutoRebuildStarted)
    AutoRebuildStartedOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      AutoRebuildStarted.class.getName());
  }
  // Use AutoRebuildStarted.newBuilder() to construct.
  private AutoRebuildStarted(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AutoRebuildStarted() {
    contextId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return xyz.block.ftl.language.v1.Language.internal_static_xyz_block_ftl_language_v1_AutoRebuildStarted_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return xyz.block.ftl.language.v1.Language.internal_static_xyz_block_ftl_language_v1_AutoRebuildStarted_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            xyz.block.ftl.language.v1.AutoRebuildStarted.class, xyz.block.ftl.language.v1.AutoRebuildStarted.Builder.class);
  }

  public static final int CONTEXT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object contextId_ = "";
  /**
   * <code>string context_id = 1 [json_name = "contextId"];</code>
   * @return The contextId.
   */
  @java.lang.Override
  public java.lang.String getContextId() {
    java.lang.Object ref = contextId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contextId_ = s;
      return s;
    }
  }
  /**
   * <code>string context_id = 1 [json_name = "contextId"];</code>
   * @return The bytes for contextId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContextIdBytes() {
    java.lang.Object ref = contextId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      contextId_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(contextId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, contextId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(contextId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, contextId_);
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
    if (!(obj instanceof xyz.block.ftl.language.v1.AutoRebuildStarted)) {
      return super.equals(obj);
    }
    xyz.block.ftl.language.v1.AutoRebuildStarted other = (xyz.block.ftl.language.v1.AutoRebuildStarted) obj;

    if (!getContextId()
        .equals(other.getContextId())) return false;
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
    hash = (37 * hash) + CONTEXT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getContextId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static xyz.block.ftl.language.v1.AutoRebuildStarted parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.language.v1.AutoRebuildStarted parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.language.v1.AutoRebuildStarted parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.language.v1.AutoRebuildStarted parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.language.v1.AutoRebuildStarted parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.language.v1.AutoRebuildStarted parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.language.v1.AutoRebuildStarted parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.language.v1.AutoRebuildStarted parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static xyz.block.ftl.language.v1.AutoRebuildStarted parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static xyz.block.ftl.language.v1.AutoRebuildStarted parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.block.ftl.language.v1.AutoRebuildStarted parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.language.v1.AutoRebuildStarted parseFrom(
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
  public static Builder newBuilder(xyz.block.ftl.language.v1.AutoRebuildStarted prototype) {
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
   * <pre>
   * AutoRebuildStarted should be sent when the plugin decides to start rebuilding automatically.
   *
   * It is not required to send this event, though it helps inform the user that their changes are not yet built.
   * FTL may ignore this event if it does not match FTL's current build context and state.
   * If the plugin decides to cancel the build because another build started, no failure or cancellation event needs
   * to be sent.
   * </pre>
   *
   * Protobuf type {@code xyz.block.ftl.language.v1.AutoRebuildStarted}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xyz.block.ftl.language.v1.AutoRebuildStarted)
      xyz.block.ftl.language.v1.AutoRebuildStartedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xyz.block.ftl.language.v1.Language.internal_static_xyz_block_ftl_language_v1_AutoRebuildStarted_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xyz.block.ftl.language.v1.Language.internal_static_xyz_block_ftl_language_v1_AutoRebuildStarted_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xyz.block.ftl.language.v1.AutoRebuildStarted.class, xyz.block.ftl.language.v1.AutoRebuildStarted.Builder.class);
    }

    // Construct using xyz.block.ftl.language.v1.AutoRebuildStarted.newBuilder()
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
      contextId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return xyz.block.ftl.language.v1.Language.internal_static_xyz_block_ftl_language_v1_AutoRebuildStarted_descriptor;
    }

    @java.lang.Override
    public xyz.block.ftl.language.v1.AutoRebuildStarted getDefaultInstanceForType() {
      return xyz.block.ftl.language.v1.AutoRebuildStarted.getDefaultInstance();
    }

    @java.lang.Override
    public xyz.block.ftl.language.v1.AutoRebuildStarted build() {
      xyz.block.ftl.language.v1.AutoRebuildStarted result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public xyz.block.ftl.language.v1.AutoRebuildStarted buildPartial() {
      xyz.block.ftl.language.v1.AutoRebuildStarted result = new xyz.block.ftl.language.v1.AutoRebuildStarted(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(xyz.block.ftl.language.v1.AutoRebuildStarted result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contextId_ = contextId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof xyz.block.ftl.language.v1.AutoRebuildStarted) {
        return mergeFrom((xyz.block.ftl.language.v1.AutoRebuildStarted)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(xyz.block.ftl.language.v1.AutoRebuildStarted other) {
      if (other == xyz.block.ftl.language.v1.AutoRebuildStarted.getDefaultInstance()) return this;
      if (!other.getContextId().isEmpty()) {
        contextId_ = other.contextId_;
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
              contextId_ = input.readStringRequireUtf8();
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

    private java.lang.Object contextId_ = "";
    /**
     * <code>string context_id = 1 [json_name = "contextId"];</code>
     * @return The contextId.
     */
    public java.lang.String getContextId() {
      java.lang.Object ref = contextId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contextId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string context_id = 1 [json_name = "contextId"];</code>
     * @return The bytes for contextId.
     */
    public com.google.protobuf.ByteString
        getContextIdBytes() {
      java.lang.Object ref = contextId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contextId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string context_id = 1 [json_name = "contextId"];</code>
     * @param value The contextId to set.
     * @return This builder for chaining.
     */
    public Builder setContextId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      contextId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string context_id = 1 [json_name = "contextId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContextId() {
      contextId_ = getDefaultInstance().getContextId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string context_id = 1 [json_name = "contextId"];</code>
     * @param value The bytes for contextId to set.
     * @return This builder for chaining.
     */
    public Builder setContextIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      contextId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:xyz.block.ftl.language.v1.AutoRebuildStarted)
  }

  // @@protoc_insertion_point(class_scope:xyz.block.ftl.language.v1.AutoRebuildStarted)
  private static final xyz.block.ftl.language.v1.AutoRebuildStarted DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new xyz.block.ftl.language.v1.AutoRebuildStarted();
  }

  public static xyz.block.ftl.language.v1.AutoRebuildStarted getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoRebuildStarted>
      PARSER = new com.google.protobuf.AbstractParser<AutoRebuildStarted>() {
    @java.lang.Override
    public AutoRebuildStarted parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutoRebuildStarted> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoRebuildStarted> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public xyz.block.ftl.language.v1.AutoRebuildStarted getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

