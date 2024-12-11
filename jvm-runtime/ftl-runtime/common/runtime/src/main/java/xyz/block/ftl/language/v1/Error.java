// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/language/v1/language.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.language.v1;

/**
 * <pre>
 * Error contains information about an error that occurred during a build.
 * Errors do not always cause a build failure. Use lesser levels to help guide the user.
 * </pre>
 *
 * Protobuf type {@code xyz.block.ftl.language.v1.Error}
 */
public final class Error extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:xyz.block.ftl.language.v1.Error)
    ErrorOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      Error.class.getName());
  }
  // Use Error.newBuilder() to construct.
  private Error(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Error() {
    msg_ = "";
    level_ = 0;
    type_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return xyz.block.ftl.language.v1.Language.internal_static_xyz_block_ftl_language_v1_Error_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return xyz.block.ftl.language.v1.Language.internal_static_xyz_block_ftl_language_v1_Error_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            xyz.block.ftl.language.v1.Error.class, xyz.block.ftl.language.v1.Error.Builder.class);
  }

  /**
   * Protobuf enum {@code xyz.block.ftl.language.v1.Error.ErrorLevel}
   */
  public enum ErrorLevel
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ERROR_LEVEL_UNSPECIFIED = 0;</code>
     */
    ERROR_LEVEL_UNSPECIFIED(0),
    /**
     * <code>ERROR_LEVEL_INFO = 1;</code>
     */
    ERROR_LEVEL_INFO(1),
    /**
     * <code>ERROR_LEVEL_WARN = 2;</code>
     */
    ERROR_LEVEL_WARN(2),
    /**
     * <code>ERROR_LEVEL_ERROR = 3;</code>
     */
    ERROR_LEVEL_ERROR(3),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 0,
        /* suffix= */ "",
        ErrorLevel.class.getName());
    }
    /**
     * <code>ERROR_LEVEL_UNSPECIFIED = 0;</code>
     */
    public static final int ERROR_LEVEL_UNSPECIFIED_VALUE = 0;
    /**
     * <code>ERROR_LEVEL_INFO = 1;</code>
     */
    public static final int ERROR_LEVEL_INFO_VALUE = 1;
    /**
     * <code>ERROR_LEVEL_WARN = 2;</code>
     */
    public static final int ERROR_LEVEL_WARN_VALUE = 2;
    /**
     * <code>ERROR_LEVEL_ERROR = 3;</code>
     */
    public static final int ERROR_LEVEL_ERROR_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ErrorLevel valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ErrorLevel forNumber(int value) {
      switch (value) {
        case 0: return ERROR_LEVEL_UNSPECIFIED;
        case 1: return ERROR_LEVEL_INFO;
        case 2: return ERROR_LEVEL_WARN;
        case 3: return ERROR_LEVEL_ERROR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ErrorLevel>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ErrorLevel> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ErrorLevel>() {
            public ErrorLevel findValueByNumber(int number) {
              return ErrorLevel.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return xyz.block.ftl.language.v1.Error.getDescriptor().getEnumTypes().get(0);
    }

    private static final ErrorLevel[] VALUES = values();

    public static ErrorLevel valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ErrorLevel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:xyz.block.ftl.language.v1.Error.ErrorLevel)
  }

  /**
   * Protobuf enum {@code xyz.block.ftl.language.v1.Error.ErrorType}
   */
  public enum ErrorType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ERROR_TYPE_UNSPECIFIED = 0;</code>
     */
    ERROR_TYPE_UNSPECIFIED(0),
    /**
     * <code>ERROR_TYPE_FTL = 1;</code>
     */
    ERROR_TYPE_FTL(1),
    /**
     * <pre>
     * Compiler errors are errors that are from the compiler. This is useful to avoid duplicate errors
     * being shown to the user when combining errors from multiple sources (eg: an IDE showing compiler
     * errors and FTL errors via LSP).
     * </pre>
     *
     * <code>ERROR_TYPE_COMPILER = 2;</code>
     */
    ERROR_TYPE_COMPILER(2),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 0,
        /* suffix= */ "",
        ErrorType.class.getName());
    }
    /**
     * <code>ERROR_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int ERROR_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <code>ERROR_TYPE_FTL = 1;</code>
     */
    public static final int ERROR_TYPE_FTL_VALUE = 1;
    /**
     * <pre>
     * Compiler errors are errors that are from the compiler. This is useful to avoid duplicate errors
     * being shown to the user when combining errors from multiple sources (eg: an IDE showing compiler
     * errors and FTL errors via LSP).
     * </pre>
     *
     * <code>ERROR_TYPE_COMPILER = 2;</code>
     */
    public static final int ERROR_TYPE_COMPILER_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ErrorType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ErrorType forNumber(int value) {
      switch (value) {
        case 0: return ERROR_TYPE_UNSPECIFIED;
        case 1: return ERROR_TYPE_FTL;
        case 2: return ERROR_TYPE_COMPILER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ErrorType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ErrorType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ErrorType>() {
            public ErrorType findValueByNumber(int number) {
              return ErrorType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return xyz.block.ftl.language.v1.Error.getDescriptor().getEnumTypes().get(1);
    }

    private static final ErrorType[] VALUES = values();

    public static ErrorType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ErrorType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:xyz.block.ftl.language.v1.Error.ErrorType)
  }

  private int bitField0_;
  public static final int MSG_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object msg_ = "";
  /**
   * <code>string msg = 1 [json_name = "msg"];</code>
   * @return The msg.
   */
  @java.lang.Override
  public java.lang.String getMsg() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msg_ = s;
      return s;
    }
  }
  /**
   * <code>string msg = 1 [json_name = "msg"];</code>
   * @return The bytes for msg.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMsgBytes() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LEVEL_FIELD_NUMBER = 4;
  private int level_ = 0;
  /**
   * <code>.xyz.block.ftl.language.v1.Error.ErrorLevel level = 4 [json_name = "level"];</code>
   * @return The enum numeric value on the wire for level.
   */
  @java.lang.Override public int getLevelValue() {
    return level_;
  }
  /**
   * <code>.xyz.block.ftl.language.v1.Error.ErrorLevel level = 4 [json_name = "level"];</code>
   * @return The level.
   */
  @java.lang.Override public xyz.block.ftl.language.v1.Error.ErrorLevel getLevel() {
    xyz.block.ftl.language.v1.Error.ErrorLevel result = xyz.block.ftl.language.v1.Error.ErrorLevel.forNumber(level_);
    return result == null ? xyz.block.ftl.language.v1.Error.ErrorLevel.UNRECOGNIZED : result;
  }

  public static final int POS_FIELD_NUMBER = 5;
  private xyz.block.ftl.language.v1.Position pos_;
  /**
   * <code>optional .xyz.block.ftl.language.v1.Position pos = 5 [json_name = "pos"];</code>
   * @return Whether the pos field is set.
   */
  @java.lang.Override
  public boolean hasPos() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .xyz.block.ftl.language.v1.Position pos = 5 [json_name = "pos"];</code>
   * @return The pos.
   */
  @java.lang.Override
  public xyz.block.ftl.language.v1.Position getPos() {
    return pos_ == null ? xyz.block.ftl.language.v1.Position.getDefaultInstance() : pos_;
  }
  /**
   * <code>optional .xyz.block.ftl.language.v1.Position pos = 5 [json_name = "pos"];</code>
   */
  @java.lang.Override
  public xyz.block.ftl.language.v1.PositionOrBuilder getPosOrBuilder() {
    return pos_ == null ? xyz.block.ftl.language.v1.Position.getDefaultInstance() : pos_;
  }

  public static final int TYPE_FIELD_NUMBER = 6;
  private int type_ = 0;
  /**
   * <code>.xyz.block.ftl.language.v1.Error.ErrorType type = 6 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.xyz.block.ftl.language.v1.Error.ErrorType type = 6 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override public xyz.block.ftl.language.v1.Error.ErrorType getType() {
    xyz.block.ftl.language.v1.Error.ErrorType result = xyz.block.ftl.language.v1.Error.ErrorType.forNumber(type_);
    return result == null ? xyz.block.ftl.language.v1.Error.ErrorType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(msg_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, msg_);
    }
    if (level_ != xyz.block.ftl.language.v1.Error.ErrorLevel.ERROR_LEVEL_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, level_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(5, getPos());
    }
    if (type_ != xyz.block.ftl.language.v1.Error.ErrorType.ERROR_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(6, type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(msg_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, msg_);
    }
    if (level_ != xyz.block.ftl.language.v1.Error.ErrorLevel.ERROR_LEVEL_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, level_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getPos());
    }
    if (type_ != xyz.block.ftl.language.v1.Error.ErrorType.ERROR_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, type_);
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
    if (!(obj instanceof xyz.block.ftl.language.v1.Error)) {
      return super.equals(obj);
    }
    xyz.block.ftl.language.v1.Error other = (xyz.block.ftl.language.v1.Error) obj;

    if (!getMsg()
        .equals(other.getMsg())) return false;
    if (level_ != other.level_) return false;
    if (hasPos() != other.hasPos()) return false;
    if (hasPos()) {
      if (!getPos()
          .equals(other.getPos())) return false;
    }
    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + MSG_FIELD_NUMBER;
    hash = (53 * hash) + getMsg().hashCode();
    hash = (37 * hash) + LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + level_;
    if (hasPos()) {
      hash = (37 * hash) + POS_FIELD_NUMBER;
      hash = (53 * hash) + getPos().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static xyz.block.ftl.language.v1.Error parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.language.v1.Error parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.language.v1.Error parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.language.v1.Error parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.language.v1.Error parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.language.v1.Error parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.language.v1.Error parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.language.v1.Error parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static xyz.block.ftl.language.v1.Error parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static xyz.block.ftl.language.v1.Error parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.block.ftl.language.v1.Error parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.language.v1.Error parseFrom(
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
  public static Builder newBuilder(xyz.block.ftl.language.v1.Error prototype) {
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
   * Error contains information about an error that occurred during a build.
   * Errors do not always cause a build failure. Use lesser levels to help guide the user.
   * </pre>
   *
   * Protobuf type {@code xyz.block.ftl.language.v1.Error}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xyz.block.ftl.language.v1.Error)
      xyz.block.ftl.language.v1.ErrorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xyz.block.ftl.language.v1.Language.internal_static_xyz_block_ftl_language_v1_Error_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xyz.block.ftl.language.v1.Language.internal_static_xyz_block_ftl_language_v1_Error_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xyz.block.ftl.language.v1.Error.class, xyz.block.ftl.language.v1.Error.Builder.class);
    }

    // Construct using xyz.block.ftl.language.v1.Error.newBuilder()
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
      msg_ = "";
      level_ = 0;
      pos_ = null;
      if (posBuilder_ != null) {
        posBuilder_.dispose();
        posBuilder_ = null;
      }
      type_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return xyz.block.ftl.language.v1.Language.internal_static_xyz_block_ftl_language_v1_Error_descriptor;
    }

    @java.lang.Override
    public xyz.block.ftl.language.v1.Error getDefaultInstanceForType() {
      return xyz.block.ftl.language.v1.Error.getDefaultInstance();
    }

    @java.lang.Override
    public xyz.block.ftl.language.v1.Error build() {
      xyz.block.ftl.language.v1.Error result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public xyz.block.ftl.language.v1.Error buildPartial() {
      xyz.block.ftl.language.v1.Error result = new xyz.block.ftl.language.v1.Error(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(xyz.block.ftl.language.v1.Error result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.msg_ = msg_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.level_ = level_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pos_ = posBuilder_ == null
            ? pos_
            : posBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.type_ = type_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof xyz.block.ftl.language.v1.Error) {
        return mergeFrom((xyz.block.ftl.language.v1.Error)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(xyz.block.ftl.language.v1.Error other) {
      if (other == xyz.block.ftl.language.v1.Error.getDefaultInstance()) return this;
      if (!other.getMsg().isEmpty()) {
        msg_ = other.msg_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.level_ != 0) {
        setLevelValue(other.getLevelValue());
      }
      if (other.hasPos()) {
        mergePos(other.getPos());
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
              msg_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 32: {
              level_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 32
            case 42: {
              input.readMessage(
                  getPosFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 42
            case 48: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000008;
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

    private java.lang.Object msg_ = "";
    /**
     * <code>string msg = 1 [json_name = "msg"];</code>
     * @return The msg.
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msg = 1 [json_name = "msg"];</code>
     * @return The bytes for msg.
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msg = 1 [json_name = "msg"];</code>
     * @param value The msg to set.
     * @return This builder for chaining.
     */
    public Builder setMsg(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      msg_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 1 [json_name = "msg"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMsg() {
      msg_ = getDefaultInstance().getMsg();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 1 [json_name = "msg"];</code>
     * @param value The bytes for msg to set.
     * @return This builder for chaining.
     */
    public Builder setMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      msg_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int level_ = 0;
    /**
     * <code>.xyz.block.ftl.language.v1.Error.ErrorLevel level = 4 [json_name = "level"];</code>
     * @return The enum numeric value on the wire for level.
     */
    @java.lang.Override public int getLevelValue() {
      return level_;
    }
    /**
     * <code>.xyz.block.ftl.language.v1.Error.ErrorLevel level = 4 [json_name = "level"];</code>
     * @param value The enum numeric value on the wire for level to set.
     * @return This builder for chaining.
     */
    public Builder setLevelValue(int value) {
      level_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.xyz.block.ftl.language.v1.Error.ErrorLevel level = 4 [json_name = "level"];</code>
     * @return The level.
     */
    @java.lang.Override
    public xyz.block.ftl.language.v1.Error.ErrorLevel getLevel() {
      xyz.block.ftl.language.v1.Error.ErrorLevel result = xyz.block.ftl.language.v1.Error.ErrorLevel.forNumber(level_);
      return result == null ? xyz.block.ftl.language.v1.Error.ErrorLevel.UNRECOGNIZED : result;
    }
    /**
     * <code>.xyz.block.ftl.language.v1.Error.ErrorLevel level = 4 [json_name = "level"];</code>
     * @param value The level to set.
     * @return This builder for chaining.
     */
    public Builder setLevel(xyz.block.ftl.language.v1.Error.ErrorLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      level_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.xyz.block.ftl.language.v1.Error.ErrorLevel level = 4 [json_name = "level"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLevel() {
      bitField0_ = (bitField0_ & ~0x00000002);
      level_ = 0;
      onChanged();
      return this;
    }

    private xyz.block.ftl.language.v1.Position pos_;
    private com.google.protobuf.SingleFieldBuilder<
        xyz.block.ftl.language.v1.Position, xyz.block.ftl.language.v1.Position.Builder, xyz.block.ftl.language.v1.PositionOrBuilder> posBuilder_;
    /**
     * <code>optional .xyz.block.ftl.language.v1.Position pos = 5 [json_name = "pos"];</code>
     * @return Whether the pos field is set.
     */
    public boolean hasPos() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .xyz.block.ftl.language.v1.Position pos = 5 [json_name = "pos"];</code>
     * @return The pos.
     */
    public xyz.block.ftl.language.v1.Position getPos() {
      if (posBuilder_ == null) {
        return pos_ == null ? xyz.block.ftl.language.v1.Position.getDefaultInstance() : pos_;
      } else {
        return posBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .xyz.block.ftl.language.v1.Position pos = 5 [json_name = "pos"];</code>
     */
    public Builder setPos(xyz.block.ftl.language.v1.Position value) {
      if (posBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pos_ = value;
      } else {
        posBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .xyz.block.ftl.language.v1.Position pos = 5 [json_name = "pos"];</code>
     */
    public Builder setPos(
        xyz.block.ftl.language.v1.Position.Builder builderForValue) {
      if (posBuilder_ == null) {
        pos_ = builderForValue.build();
      } else {
        posBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .xyz.block.ftl.language.v1.Position pos = 5 [json_name = "pos"];</code>
     */
    public Builder mergePos(xyz.block.ftl.language.v1.Position value) {
      if (posBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          pos_ != null &&
          pos_ != xyz.block.ftl.language.v1.Position.getDefaultInstance()) {
          getPosBuilder().mergeFrom(value);
        } else {
          pos_ = value;
        }
      } else {
        posBuilder_.mergeFrom(value);
      }
      if (pos_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional .xyz.block.ftl.language.v1.Position pos = 5 [json_name = "pos"];</code>
     */
    public Builder clearPos() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pos_ = null;
      if (posBuilder_ != null) {
        posBuilder_.dispose();
        posBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .xyz.block.ftl.language.v1.Position pos = 5 [json_name = "pos"];</code>
     */
    public xyz.block.ftl.language.v1.Position.Builder getPosBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPosFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .xyz.block.ftl.language.v1.Position pos = 5 [json_name = "pos"];</code>
     */
    public xyz.block.ftl.language.v1.PositionOrBuilder getPosOrBuilder() {
      if (posBuilder_ != null) {
        return posBuilder_.getMessageOrBuilder();
      } else {
        return pos_ == null ?
            xyz.block.ftl.language.v1.Position.getDefaultInstance() : pos_;
      }
    }
    /**
     * <code>optional .xyz.block.ftl.language.v1.Position pos = 5 [json_name = "pos"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        xyz.block.ftl.language.v1.Position, xyz.block.ftl.language.v1.Position.Builder, xyz.block.ftl.language.v1.PositionOrBuilder> 
        getPosFieldBuilder() {
      if (posBuilder_ == null) {
        posBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            xyz.block.ftl.language.v1.Position, xyz.block.ftl.language.v1.Position.Builder, xyz.block.ftl.language.v1.PositionOrBuilder>(
                getPos(),
                getParentForChildren(),
                isClean());
        pos_ = null;
      }
      return posBuilder_;
    }

    private int type_ = 0;
    /**
     * <code>.xyz.block.ftl.language.v1.Error.ErrorType type = 6 [json_name = "type"];</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.xyz.block.ftl.language.v1.Error.ErrorType type = 6 [json_name = "type"];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.xyz.block.ftl.language.v1.Error.ErrorType type = 6 [json_name = "type"];</code>
     * @return The type.
     */
    @java.lang.Override
    public xyz.block.ftl.language.v1.Error.ErrorType getType() {
      xyz.block.ftl.language.v1.Error.ErrorType result = xyz.block.ftl.language.v1.Error.ErrorType.forNumber(type_);
      return result == null ? xyz.block.ftl.language.v1.Error.ErrorType.UNRECOGNIZED : result;
    }
    /**
     * <code>.xyz.block.ftl.language.v1.Error.ErrorType type = 6 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(xyz.block.ftl.language.v1.Error.ErrorType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.xyz.block.ftl.language.v1.Error.ErrorType type = 6 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000008);
      type_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:xyz.block.ftl.language.v1.Error)
  }

  // @@protoc_insertion_point(class_scope:xyz.block.ftl.language.v1.Error)
  private static final xyz.block.ftl.language.v1.Error DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new xyz.block.ftl.language.v1.Error();
  }

  public static xyz.block.ftl.language.v1.Error getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Error>
      PARSER = new com.google.protobuf.AbstractParser<Error>() {
    @java.lang.Override
    public Error parsePartialFrom(
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

  public static com.google.protobuf.Parser<Error> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Error> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public xyz.block.ftl.language.v1.Error getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

