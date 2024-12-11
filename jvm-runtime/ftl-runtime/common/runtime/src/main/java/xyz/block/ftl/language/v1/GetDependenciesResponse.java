// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/language/v1/language.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.language.v1;

/**
 * Protobuf type {@code xyz.block.ftl.language.v1.GetDependenciesResponse}
 */
public final class GetDependenciesResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:xyz.block.ftl.language.v1.GetDependenciesResponse)
    GetDependenciesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      GetDependenciesResponse.class.getName());
  }
  // Use GetDependenciesResponse.newBuilder() to construct.
  private GetDependenciesResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetDependenciesResponse() {
    modules_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return xyz.block.ftl.language.v1.Language.internal_static_xyz_block_ftl_language_v1_GetDependenciesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return xyz.block.ftl.language.v1.Language.internal_static_xyz_block_ftl_language_v1_GetDependenciesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            xyz.block.ftl.language.v1.GetDependenciesResponse.class, xyz.block.ftl.language.v1.GetDependenciesResponse.Builder.class);
  }

  public static final int MODULES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList modules_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string modules = 1 [json_name = "modules"];</code>
   * @return A list containing the modules.
   */
  public com.google.protobuf.ProtocolStringList
      getModulesList() {
    return modules_;
  }
  /**
   * <code>repeated string modules = 1 [json_name = "modules"];</code>
   * @return The count of modules.
   */
  public int getModulesCount() {
    return modules_.size();
  }
  /**
   * <code>repeated string modules = 1 [json_name = "modules"];</code>
   * @param index The index of the element to return.
   * @return The modules at the given index.
   */
  public java.lang.String getModules(int index) {
    return modules_.get(index);
  }
  /**
   * <code>repeated string modules = 1 [json_name = "modules"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the modules at the given index.
   */
  public com.google.protobuf.ByteString
      getModulesBytes(int index) {
    return modules_.getByteString(index);
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
    for (int i = 0; i < modules_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, modules_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < modules_.size(); i++) {
        dataSize += computeStringSizeNoTag(modules_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getModulesList().size();
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
    if (!(obj instanceof xyz.block.ftl.language.v1.GetDependenciesResponse)) {
      return super.equals(obj);
    }
    xyz.block.ftl.language.v1.GetDependenciesResponse other = (xyz.block.ftl.language.v1.GetDependenciesResponse) obj;

    if (!getModulesList()
        .equals(other.getModulesList())) return false;
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
    if (getModulesCount() > 0) {
      hash = (37 * hash) + MODULES_FIELD_NUMBER;
      hash = (53 * hash) + getModulesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static xyz.block.ftl.language.v1.GetDependenciesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.language.v1.GetDependenciesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.language.v1.GetDependenciesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.language.v1.GetDependenciesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.language.v1.GetDependenciesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.language.v1.GetDependenciesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.language.v1.GetDependenciesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.language.v1.GetDependenciesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static xyz.block.ftl.language.v1.GetDependenciesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static xyz.block.ftl.language.v1.GetDependenciesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.block.ftl.language.v1.GetDependenciesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.language.v1.GetDependenciesResponse parseFrom(
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
  public static Builder newBuilder(xyz.block.ftl.language.v1.GetDependenciesResponse prototype) {
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
   * Protobuf type {@code xyz.block.ftl.language.v1.GetDependenciesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xyz.block.ftl.language.v1.GetDependenciesResponse)
      xyz.block.ftl.language.v1.GetDependenciesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xyz.block.ftl.language.v1.Language.internal_static_xyz_block_ftl_language_v1_GetDependenciesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xyz.block.ftl.language.v1.Language.internal_static_xyz_block_ftl_language_v1_GetDependenciesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xyz.block.ftl.language.v1.GetDependenciesResponse.class, xyz.block.ftl.language.v1.GetDependenciesResponse.Builder.class);
    }

    // Construct using xyz.block.ftl.language.v1.GetDependenciesResponse.newBuilder()
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
      modules_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return xyz.block.ftl.language.v1.Language.internal_static_xyz_block_ftl_language_v1_GetDependenciesResponse_descriptor;
    }

    @java.lang.Override
    public xyz.block.ftl.language.v1.GetDependenciesResponse getDefaultInstanceForType() {
      return xyz.block.ftl.language.v1.GetDependenciesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public xyz.block.ftl.language.v1.GetDependenciesResponse build() {
      xyz.block.ftl.language.v1.GetDependenciesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public xyz.block.ftl.language.v1.GetDependenciesResponse buildPartial() {
      xyz.block.ftl.language.v1.GetDependenciesResponse result = new xyz.block.ftl.language.v1.GetDependenciesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(xyz.block.ftl.language.v1.GetDependenciesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        modules_.makeImmutable();
        result.modules_ = modules_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof xyz.block.ftl.language.v1.GetDependenciesResponse) {
        return mergeFrom((xyz.block.ftl.language.v1.GetDependenciesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(xyz.block.ftl.language.v1.GetDependenciesResponse other) {
      if (other == xyz.block.ftl.language.v1.GetDependenciesResponse.getDefaultInstance()) return this;
      if (!other.modules_.isEmpty()) {
        if (modules_.isEmpty()) {
          modules_ = other.modules_;
          bitField0_ |= 0x00000001;
        } else {
          ensureModulesIsMutable();
          modules_.addAll(other.modules_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureModulesIsMutable();
              modules_.add(s);
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

    private com.google.protobuf.LazyStringArrayList modules_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureModulesIsMutable() {
      if (!modules_.isModifiable()) {
        modules_ = new com.google.protobuf.LazyStringArrayList(modules_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string modules = 1 [json_name = "modules"];</code>
     * @return A list containing the modules.
     */
    public com.google.protobuf.ProtocolStringList
        getModulesList() {
      modules_.makeImmutable();
      return modules_;
    }
    /**
     * <code>repeated string modules = 1 [json_name = "modules"];</code>
     * @return The count of modules.
     */
    public int getModulesCount() {
      return modules_.size();
    }
    /**
     * <code>repeated string modules = 1 [json_name = "modules"];</code>
     * @param index The index of the element to return.
     * @return The modules at the given index.
     */
    public java.lang.String getModules(int index) {
      return modules_.get(index);
    }
    /**
     * <code>repeated string modules = 1 [json_name = "modules"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the modules at the given index.
     */
    public com.google.protobuf.ByteString
        getModulesBytes(int index) {
      return modules_.getByteString(index);
    }
    /**
     * <code>repeated string modules = 1 [json_name = "modules"];</code>
     * @param index The index to set the value at.
     * @param value The modules to set.
     * @return This builder for chaining.
     */
    public Builder setModules(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureModulesIsMutable();
      modules_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string modules = 1 [json_name = "modules"];</code>
     * @param value The modules to add.
     * @return This builder for chaining.
     */
    public Builder addModules(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureModulesIsMutable();
      modules_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string modules = 1 [json_name = "modules"];</code>
     * @param values The modules to add.
     * @return This builder for chaining.
     */
    public Builder addAllModules(
        java.lang.Iterable<java.lang.String> values) {
      ensureModulesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, modules_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string modules = 1 [json_name = "modules"];</code>
     * @return This builder for chaining.
     */
    public Builder clearModules() {
      modules_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string modules = 1 [json_name = "modules"];</code>
     * @param value The bytes of the modules to add.
     * @return This builder for chaining.
     */
    public Builder addModulesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureModulesIsMutable();
      modules_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:xyz.block.ftl.language.v1.GetDependenciesResponse)
  }

  // @@protoc_insertion_point(class_scope:xyz.block.ftl.language.v1.GetDependenciesResponse)
  private static final xyz.block.ftl.language.v1.GetDependenciesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new xyz.block.ftl.language.v1.GetDependenciesResponse();
  }

  public static xyz.block.ftl.language.v1.GetDependenciesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDependenciesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetDependenciesResponse>() {
    @java.lang.Override
    public GetDependenciesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDependenciesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDependenciesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public xyz.block.ftl.language.v1.GetDependenciesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

