// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/schema/v1/schema.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.schema.v1;

/**
 * Protobuf type {@code xyz.block.ftl.schema.v1.Bytes}
 */
public final class Bytes extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:xyz.block.ftl.schema.v1.Bytes)
    BytesOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      Bytes.class.getName());
  }
  // Use Bytes.newBuilder() to construct.
  private Bytes(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Bytes() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return xyz.block.ftl.schema.v1.SchemaOuterClass.internal_static_xyz_block_ftl_schema_v1_Bytes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return xyz.block.ftl.schema.v1.SchemaOuterClass.internal_static_xyz_block_ftl_schema_v1_Bytes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            xyz.block.ftl.schema.v1.Bytes.class, xyz.block.ftl.schema.v1.Bytes.Builder.class);
  }

  private int bitField0_;
  public static final int POS_FIELD_NUMBER = 1;
  private xyz.block.ftl.schema.v1.Position pos_;
  /**
   * <code>optional .xyz.block.ftl.schema.v1.Position pos = 1 [json_name = "pos"];</code>
   * @return Whether the pos field is set.
   */
  @java.lang.Override
  public boolean hasPos() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .xyz.block.ftl.schema.v1.Position pos = 1 [json_name = "pos"];</code>
   * @return The pos.
   */
  @java.lang.Override
  public xyz.block.ftl.schema.v1.Position getPos() {
    return pos_ == null ? xyz.block.ftl.schema.v1.Position.getDefaultInstance() : pos_;
  }
  /**
   * <code>optional .xyz.block.ftl.schema.v1.Position pos = 1 [json_name = "pos"];</code>
   */
  @java.lang.Override
  public xyz.block.ftl.schema.v1.PositionOrBuilder getPosOrBuilder() {
    return pos_ == null ? xyz.block.ftl.schema.v1.Position.getDefaultInstance() : pos_;
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
      output.writeMessage(1, getPos());
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
        .computeMessageSize(1, getPos());
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
    if (!(obj instanceof xyz.block.ftl.schema.v1.Bytes)) {
      return super.equals(obj);
    }
    xyz.block.ftl.schema.v1.Bytes other = (xyz.block.ftl.schema.v1.Bytes) obj;

    if (hasPos() != other.hasPos()) return false;
    if (hasPos()) {
      if (!getPos()
          .equals(other.getPos())) return false;
    }
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
    if (hasPos()) {
      hash = (37 * hash) + POS_FIELD_NUMBER;
      hash = (53 * hash) + getPos().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static xyz.block.ftl.schema.v1.Bytes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.schema.v1.Bytes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.schema.v1.Bytes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.schema.v1.Bytes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.schema.v1.Bytes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.schema.v1.Bytes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.schema.v1.Bytes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.schema.v1.Bytes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static xyz.block.ftl.schema.v1.Bytes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static xyz.block.ftl.schema.v1.Bytes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.block.ftl.schema.v1.Bytes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.schema.v1.Bytes parseFrom(
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
  public static Builder newBuilder(xyz.block.ftl.schema.v1.Bytes prototype) {
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
   * Protobuf type {@code xyz.block.ftl.schema.v1.Bytes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xyz.block.ftl.schema.v1.Bytes)
      xyz.block.ftl.schema.v1.BytesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xyz.block.ftl.schema.v1.SchemaOuterClass.internal_static_xyz_block_ftl_schema_v1_Bytes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xyz.block.ftl.schema.v1.SchemaOuterClass.internal_static_xyz_block_ftl_schema_v1_Bytes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xyz.block.ftl.schema.v1.Bytes.class, xyz.block.ftl.schema.v1.Bytes.Builder.class);
    }

    // Construct using xyz.block.ftl.schema.v1.Bytes.newBuilder()
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
        getPosFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      pos_ = null;
      if (posBuilder_ != null) {
        posBuilder_.dispose();
        posBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return xyz.block.ftl.schema.v1.SchemaOuterClass.internal_static_xyz_block_ftl_schema_v1_Bytes_descriptor;
    }

    @java.lang.Override
    public xyz.block.ftl.schema.v1.Bytes getDefaultInstanceForType() {
      return xyz.block.ftl.schema.v1.Bytes.getDefaultInstance();
    }

    @java.lang.Override
    public xyz.block.ftl.schema.v1.Bytes build() {
      xyz.block.ftl.schema.v1.Bytes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public xyz.block.ftl.schema.v1.Bytes buildPartial() {
      xyz.block.ftl.schema.v1.Bytes result = new xyz.block.ftl.schema.v1.Bytes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(xyz.block.ftl.schema.v1.Bytes result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pos_ = posBuilder_ == null
            ? pos_
            : posBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof xyz.block.ftl.schema.v1.Bytes) {
        return mergeFrom((xyz.block.ftl.schema.v1.Bytes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(xyz.block.ftl.schema.v1.Bytes other) {
      if (other == xyz.block.ftl.schema.v1.Bytes.getDefaultInstance()) return this;
      if (other.hasPos()) {
        mergePos(other.getPos());
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
              input.readMessage(
                  getPosFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private xyz.block.ftl.schema.v1.Position pos_;
    private com.google.protobuf.SingleFieldBuilder<
        xyz.block.ftl.schema.v1.Position, xyz.block.ftl.schema.v1.Position.Builder, xyz.block.ftl.schema.v1.PositionOrBuilder> posBuilder_;
    /**
     * <code>optional .xyz.block.ftl.schema.v1.Position pos = 1 [json_name = "pos"];</code>
     * @return Whether the pos field is set.
     */
    public boolean hasPos() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .xyz.block.ftl.schema.v1.Position pos = 1 [json_name = "pos"];</code>
     * @return The pos.
     */
    public xyz.block.ftl.schema.v1.Position getPos() {
      if (posBuilder_ == null) {
        return pos_ == null ? xyz.block.ftl.schema.v1.Position.getDefaultInstance() : pos_;
      } else {
        return posBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .xyz.block.ftl.schema.v1.Position pos = 1 [json_name = "pos"];</code>
     */
    public Builder setPos(xyz.block.ftl.schema.v1.Position value) {
      if (posBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pos_ = value;
      } else {
        posBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .xyz.block.ftl.schema.v1.Position pos = 1 [json_name = "pos"];</code>
     */
    public Builder setPos(
        xyz.block.ftl.schema.v1.Position.Builder builderForValue) {
      if (posBuilder_ == null) {
        pos_ = builderForValue.build();
      } else {
        posBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .xyz.block.ftl.schema.v1.Position pos = 1 [json_name = "pos"];</code>
     */
    public Builder mergePos(xyz.block.ftl.schema.v1.Position value) {
      if (posBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          pos_ != null &&
          pos_ != xyz.block.ftl.schema.v1.Position.getDefaultInstance()) {
          getPosBuilder().mergeFrom(value);
        } else {
          pos_ = value;
        }
      } else {
        posBuilder_.mergeFrom(value);
      }
      if (pos_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional .xyz.block.ftl.schema.v1.Position pos = 1 [json_name = "pos"];</code>
     */
    public Builder clearPos() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pos_ = null;
      if (posBuilder_ != null) {
        posBuilder_.dispose();
        posBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .xyz.block.ftl.schema.v1.Position pos = 1 [json_name = "pos"];</code>
     */
    public xyz.block.ftl.schema.v1.Position.Builder getPosBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPosFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .xyz.block.ftl.schema.v1.Position pos = 1 [json_name = "pos"];</code>
     */
    public xyz.block.ftl.schema.v1.PositionOrBuilder getPosOrBuilder() {
      if (posBuilder_ != null) {
        return posBuilder_.getMessageOrBuilder();
      } else {
        return pos_ == null ?
            xyz.block.ftl.schema.v1.Position.getDefaultInstance() : pos_;
      }
    }
    /**
     * <code>optional .xyz.block.ftl.schema.v1.Position pos = 1 [json_name = "pos"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        xyz.block.ftl.schema.v1.Position, xyz.block.ftl.schema.v1.Position.Builder, xyz.block.ftl.schema.v1.PositionOrBuilder> 
        getPosFieldBuilder() {
      if (posBuilder_ == null) {
        posBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            xyz.block.ftl.schema.v1.Position, xyz.block.ftl.schema.v1.Position.Builder, xyz.block.ftl.schema.v1.PositionOrBuilder>(
                getPos(),
                getParentForChildren(),
                isClean());
        pos_ = null;
      }
      return posBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:xyz.block.ftl.schema.v1.Bytes)
  }

  // @@protoc_insertion_point(class_scope:xyz.block.ftl.schema.v1.Bytes)
  private static final xyz.block.ftl.schema.v1.Bytes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new xyz.block.ftl.schema.v1.Bytes();
  }

  public static xyz.block.ftl.schema.v1.Bytes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Bytes>
      PARSER = new com.google.protobuf.AbstractParser<Bytes>() {
    @java.lang.Override
    public Bytes parsePartialFrom(
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

  public static com.google.protobuf.Parser<Bytes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Bytes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public xyz.block.ftl.schema.v1.Bytes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

