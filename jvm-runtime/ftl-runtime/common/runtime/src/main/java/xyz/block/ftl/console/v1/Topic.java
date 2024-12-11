// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/console/v1/console.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.console.v1;

/**
 * Protobuf type {@code xyz.block.ftl.console.v1.Topic}
 */
public final class Topic extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:xyz.block.ftl.console.v1.Topic)
    TopicOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      Topic.class.getName());
  }
  // Use Topic.newBuilder() to construct.
  private Topic(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Topic() {
    references_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return xyz.block.ftl.console.v1.Console.internal_static_xyz_block_ftl_console_v1_Topic_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return xyz.block.ftl.console.v1.Console.internal_static_xyz_block_ftl_console_v1_Topic_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            xyz.block.ftl.console.v1.Topic.class, xyz.block.ftl.console.v1.Topic.Builder.class);
  }

  private int bitField0_;
  public static final int TOPIC_FIELD_NUMBER = 1;
  private xyz.block.ftl.schema.v1.Topic topic_;
  /**
   * <code>.xyz.block.ftl.schema.v1.Topic topic = 1 [json_name = "topic"];</code>
   * @return Whether the topic field is set.
   */
  @java.lang.Override
  public boolean hasTopic() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.xyz.block.ftl.schema.v1.Topic topic = 1 [json_name = "topic"];</code>
   * @return The topic.
   */
  @java.lang.Override
  public xyz.block.ftl.schema.v1.Topic getTopic() {
    return topic_ == null ? xyz.block.ftl.schema.v1.Topic.getDefaultInstance() : topic_;
  }
  /**
   * <code>.xyz.block.ftl.schema.v1.Topic topic = 1 [json_name = "topic"];</code>
   */
  @java.lang.Override
  public xyz.block.ftl.schema.v1.TopicOrBuilder getTopicOrBuilder() {
    return topic_ == null ? xyz.block.ftl.schema.v1.Topic.getDefaultInstance() : topic_;
  }

  public static final int REFERENCES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<xyz.block.ftl.schema.v1.Ref> references_;
  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
   */
  @java.lang.Override
  public java.util.List<xyz.block.ftl.schema.v1.Ref> getReferencesList() {
    return references_;
  }
  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends xyz.block.ftl.schema.v1.RefOrBuilder> 
      getReferencesOrBuilderList() {
    return references_;
  }
  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
   */
  @java.lang.Override
  public int getReferencesCount() {
    return references_.size();
  }
  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
   */
  @java.lang.Override
  public xyz.block.ftl.schema.v1.Ref getReferences(int index) {
    return references_.get(index);
  }
  /**
   * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
   */
  @java.lang.Override
  public xyz.block.ftl.schema.v1.RefOrBuilder getReferencesOrBuilder(
      int index) {
    return references_.get(index);
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
      output.writeMessage(1, getTopic());
    }
    for (int i = 0; i < references_.size(); i++) {
      output.writeMessage(2, references_.get(i));
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
        .computeMessageSize(1, getTopic());
    }
    for (int i = 0; i < references_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, references_.get(i));
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
    if (!(obj instanceof xyz.block.ftl.console.v1.Topic)) {
      return super.equals(obj);
    }
    xyz.block.ftl.console.v1.Topic other = (xyz.block.ftl.console.v1.Topic) obj;

    if (hasTopic() != other.hasTopic()) return false;
    if (hasTopic()) {
      if (!getTopic()
          .equals(other.getTopic())) return false;
    }
    if (!getReferencesList()
        .equals(other.getReferencesList())) return false;
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
    if (hasTopic()) {
      hash = (37 * hash) + TOPIC_FIELD_NUMBER;
      hash = (53 * hash) + getTopic().hashCode();
    }
    if (getReferencesCount() > 0) {
      hash = (37 * hash) + REFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getReferencesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static xyz.block.ftl.console.v1.Topic parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.console.v1.Topic parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.console.v1.Topic parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.console.v1.Topic parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.console.v1.Topic parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.console.v1.Topic parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.console.v1.Topic parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.console.v1.Topic parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static xyz.block.ftl.console.v1.Topic parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static xyz.block.ftl.console.v1.Topic parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.block.ftl.console.v1.Topic parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.console.v1.Topic parseFrom(
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
  public static Builder newBuilder(xyz.block.ftl.console.v1.Topic prototype) {
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
   * Protobuf type {@code xyz.block.ftl.console.v1.Topic}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xyz.block.ftl.console.v1.Topic)
      xyz.block.ftl.console.v1.TopicOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xyz.block.ftl.console.v1.Console.internal_static_xyz_block_ftl_console_v1_Topic_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xyz.block.ftl.console.v1.Console.internal_static_xyz_block_ftl_console_v1_Topic_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xyz.block.ftl.console.v1.Topic.class, xyz.block.ftl.console.v1.Topic.Builder.class);
    }

    // Construct using xyz.block.ftl.console.v1.Topic.newBuilder()
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
        getTopicFieldBuilder();
        getReferencesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      topic_ = null;
      if (topicBuilder_ != null) {
        topicBuilder_.dispose();
        topicBuilder_ = null;
      }
      if (referencesBuilder_ == null) {
        references_ = java.util.Collections.emptyList();
      } else {
        references_ = null;
        referencesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return xyz.block.ftl.console.v1.Console.internal_static_xyz_block_ftl_console_v1_Topic_descriptor;
    }

    @java.lang.Override
    public xyz.block.ftl.console.v1.Topic getDefaultInstanceForType() {
      return xyz.block.ftl.console.v1.Topic.getDefaultInstance();
    }

    @java.lang.Override
    public xyz.block.ftl.console.v1.Topic build() {
      xyz.block.ftl.console.v1.Topic result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public xyz.block.ftl.console.v1.Topic buildPartial() {
      xyz.block.ftl.console.v1.Topic result = new xyz.block.ftl.console.v1.Topic(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(xyz.block.ftl.console.v1.Topic result) {
      if (referencesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          references_ = java.util.Collections.unmodifiableList(references_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.references_ = references_;
      } else {
        result.references_ = referencesBuilder_.build();
      }
    }

    private void buildPartial0(xyz.block.ftl.console.v1.Topic result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.topic_ = topicBuilder_ == null
            ? topic_
            : topicBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof xyz.block.ftl.console.v1.Topic) {
        return mergeFrom((xyz.block.ftl.console.v1.Topic)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(xyz.block.ftl.console.v1.Topic other) {
      if (other == xyz.block.ftl.console.v1.Topic.getDefaultInstance()) return this;
      if (other.hasTopic()) {
        mergeTopic(other.getTopic());
      }
      if (referencesBuilder_ == null) {
        if (!other.references_.isEmpty()) {
          if (references_.isEmpty()) {
            references_ = other.references_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureReferencesIsMutable();
            references_.addAll(other.references_);
          }
          onChanged();
        }
      } else {
        if (!other.references_.isEmpty()) {
          if (referencesBuilder_.isEmpty()) {
            referencesBuilder_.dispose();
            referencesBuilder_ = null;
            references_ = other.references_;
            bitField0_ = (bitField0_ & ~0x00000002);
            referencesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getReferencesFieldBuilder() : null;
          } else {
            referencesBuilder_.addAllMessages(other.references_);
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
              input.readMessage(
                  getTopicFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              xyz.block.ftl.schema.v1.Ref m =
                  input.readMessage(
                      xyz.block.ftl.schema.v1.Ref.parser(),
                      extensionRegistry);
              if (referencesBuilder_ == null) {
                ensureReferencesIsMutable();
                references_.add(m);
              } else {
                referencesBuilder_.addMessage(m);
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

    private xyz.block.ftl.schema.v1.Topic topic_;
    private com.google.protobuf.SingleFieldBuilder<
        xyz.block.ftl.schema.v1.Topic, xyz.block.ftl.schema.v1.Topic.Builder, xyz.block.ftl.schema.v1.TopicOrBuilder> topicBuilder_;
    /**
     * <code>.xyz.block.ftl.schema.v1.Topic topic = 1 [json_name = "topic"];</code>
     * @return Whether the topic field is set.
     */
    public boolean hasTopic() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.xyz.block.ftl.schema.v1.Topic topic = 1 [json_name = "topic"];</code>
     * @return The topic.
     */
    public xyz.block.ftl.schema.v1.Topic getTopic() {
      if (topicBuilder_ == null) {
        return topic_ == null ? xyz.block.ftl.schema.v1.Topic.getDefaultInstance() : topic_;
      } else {
        return topicBuilder_.getMessage();
      }
    }
    /**
     * <code>.xyz.block.ftl.schema.v1.Topic topic = 1 [json_name = "topic"];</code>
     */
    public Builder setTopic(xyz.block.ftl.schema.v1.Topic value) {
      if (topicBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        topic_ = value;
      } else {
        topicBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.xyz.block.ftl.schema.v1.Topic topic = 1 [json_name = "topic"];</code>
     */
    public Builder setTopic(
        xyz.block.ftl.schema.v1.Topic.Builder builderForValue) {
      if (topicBuilder_ == null) {
        topic_ = builderForValue.build();
      } else {
        topicBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.xyz.block.ftl.schema.v1.Topic topic = 1 [json_name = "topic"];</code>
     */
    public Builder mergeTopic(xyz.block.ftl.schema.v1.Topic value) {
      if (topicBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          topic_ != null &&
          topic_ != xyz.block.ftl.schema.v1.Topic.getDefaultInstance()) {
          getTopicBuilder().mergeFrom(value);
        } else {
          topic_ = value;
        }
      } else {
        topicBuilder_.mergeFrom(value);
      }
      if (topic_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.xyz.block.ftl.schema.v1.Topic topic = 1 [json_name = "topic"];</code>
     */
    public Builder clearTopic() {
      bitField0_ = (bitField0_ & ~0x00000001);
      topic_ = null;
      if (topicBuilder_ != null) {
        topicBuilder_.dispose();
        topicBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.xyz.block.ftl.schema.v1.Topic topic = 1 [json_name = "topic"];</code>
     */
    public xyz.block.ftl.schema.v1.Topic.Builder getTopicBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTopicFieldBuilder().getBuilder();
    }
    /**
     * <code>.xyz.block.ftl.schema.v1.Topic topic = 1 [json_name = "topic"];</code>
     */
    public xyz.block.ftl.schema.v1.TopicOrBuilder getTopicOrBuilder() {
      if (topicBuilder_ != null) {
        return topicBuilder_.getMessageOrBuilder();
      } else {
        return topic_ == null ?
            xyz.block.ftl.schema.v1.Topic.getDefaultInstance() : topic_;
      }
    }
    /**
     * <code>.xyz.block.ftl.schema.v1.Topic topic = 1 [json_name = "topic"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        xyz.block.ftl.schema.v1.Topic, xyz.block.ftl.schema.v1.Topic.Builder, xyz.block.ftl.schema.v1.TopicOrBuilder> 
        getTopicFieldBuilder() {
      if (topicBuilder_ == null) {
        topicBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            xyz.block.ftl.schema.v1.Topic, xyz.block.ftl.schema.v1.Topic.Builder, xyz.block.ftl.schema.v1.TopicOrBuilder>(
                getTopic(),
                getParentForChildren(),
                isClean());
        topic_ = null;
      }
      return topicBuilder_;
    }

    private java.util.List<xyz.block.ftl.schema.v1.Ref> references_ =
      java.util.Collections.emptyList();
    private void ensureReferencesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        references_ = new java.util.ArrayList<xyz.block.ftl.schema.v1.Ref>(references_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        xyz.block.ftl.schema.v1.Ref, xyz.block.ftl.schema.v1.Ref.Builder, xyz.block.ftl.schema.v1.RefOrBuilder> referencesBuilder_;

    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public java.util.List<xyz.block.ftl.schema.v1.Ref> getReferencesList() {
      if (referencesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(references_);
      } else {
        return referencesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public int getReferencesCount() {
      if (referencesBuilder_ == null) {
        return references_.size();
      } else {
        return referencesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public xyz.block.ftl.schema.v1.Ref getReferences(int index) {
      if (referencesBuilder_ == null) {
        return references_.get(index);
      } else {
        return referencesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public Builder setReferences(
        int index, xyz.block.ftl.schema.v1.Ref value) {
      if (referencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReferencesIsMutable();
        references_.set(index, value);
        onChanged();
      } else {
        referencesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public Builder setReferences(
        int index, xyz.block.ftl.schema.v1.Ref.Builder builderForValue) {
      if (referencesBuilder_ == null) {
        ensureReferencesIsMutable();
        references_.set(index, builderForValue.build());
        onChanged();
      } else {
        referencesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public Builder addReferences(xyz.block.ftl.schema.v1.Ref value) {
      if (referencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReferencesIsMutable();
        references_.add(value);
        onChanged();
      } else {
        referencesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public Builder addReferences(
        int index, xyz.block.ftl.schema.v1.Ref value) {
      if (referencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReferencesIsMutable();
        references_.add(index, value);
        onChanged();
      } else {
        referencesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public Builder addReferences(
        xyz.block.ftl.schema.v1.Ref.Builder builderForValue) {
      if (referencesBuilder_ == null) {
        ensureReferencesIsMutable();
        references_.add(builderForValue.build());
        onChanged();
      } else {
        referencesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public Builder addReferences(
        int index, xyz.block.ftl.schema.v1.Ref.Builder builderForValue) {
      if (referencesBuilder_ == null) {
        ensureReferencesIsMutable();
        references_.add(index, builderForValue.build());
        onChanged();
      } else {
        referencesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public Builder addAllReferences(
        java.lang.Iterable<? extends xyz.block.ftl.schema.v1.Ref> values) {
      if (referencesBuilder_ == null) {
        ensureReferencesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, references_);
        onChanged();
      } else {
        referencesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public Builder clearReferences() {
      if (referencesBuilder_ == null) {
        references_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        referencesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public Builder removeReferences(int index) {
      if (referencesBuilder_ == null) {
        ensureReferencesIsMutable();
        references_.remove(index);
        onChanged();
      } else {
        referencesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public xyz.block.ftl.schema.v1.Ref.Builder getReferencesBuilder(
        int index) {
      return getReferencesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public xyz.block.ftl.schema.v1.RefOrBuilder getReferencesOrBuilder(
        int index) {
      if (referencesBuilder_ == null) {
        return references_.get(index);  } else {
        return referencesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public java.util.List<? extends xyz.block.ftl.schema.v1.RefOrBuilder> 
         getReferencesOrBuilderList() {
      if (referencesBuilder_ != null) {
        return referencesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(references_);
      }
    }
    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public xyz.block.ftl.schema.v1.Ref.Builder addReferencesBuilder() {
      return getReferencesFieldBuilder().addBuilder(
          xyz.block.ftl.schema.v1.Ref.getDefaultInstance());
    }
    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public xyz.block.ftl.schema.v1.Ref.Builder addReferencesBuilder(
        int index) {
      return getReferencesFieldBuilder().addBuilder(
          index, xyz.block.ftl.schema.v1.Ref.getDefaultInstance());
    }
    /**
     * <code>repeated .xyz.block.ftl.schema.v1.Ref references = 2 [json_name = "references"];</code>
     */
    public java.util.List<xyz.block.ftl.schema.v1.Ref.Builder> 
         getReferencesBuilderList() {
      return getReferencesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        xyz.block.ftl.schema.v1.Ref, xyz.block.ftl.schema.v1.Ref.Builder, xyz.block.ftl.schema.v1.RefOrBuilder> 
        getReferencesFieldBuilder() {
      if (referencesBuilder_ == null) {
        referencesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            xyz.block.ftl.schema.v1.Ref, xyz.block.ftl.schema.v1.Ref.Builder, xyz.block.ftl.schema.v1.RefOrBuilder>(
                references_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        references_ = null;
      }
      return referencesBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:xyz.block.ftl.console.v1.Topic)
  }

  // @@protoc_insertion_point(class_scope:xyz.block.ftl.console.v1.Topic)
  private static final xyz.block.ftl.console.v1.Topic DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new xyz.block.ftl.console.v1.Topic();
  }

  public static xyz.block.ftl.console.v1.Topic getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Topic>
      PARSER = new com.google.protobuf.AbstractParser<Topic>() {
    @java.lang.Override
    public Topic parsePartialFrom(
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

  public static com.google.protobuf.Parser<Topic> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Topic> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public xyz.block.ftl.console.v1.Topic getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

