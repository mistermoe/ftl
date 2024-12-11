// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: xyz/block/ftl/timeline/v1/timeline.proto
// Protobuf Java Version: 4.29.0

package xyz.block.ftl.timeline.v1;

/**
 * Protobuf type {@code xyz.block.ftl.timeline.v1.StreamTimelineResponse}
 */
public final class StreamTimelineResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:xyz.block.ftl.timeline.v1.StreamTimelineResponse)
    StreamTimelineResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      StreamTimelineResponse.class.getName());
  }
  // Use StreamTimelineResponse.newBuilder() to construct.
  private StreamTimelineResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private StreamTimelineResponse() {
    events_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return xyz.block.ftl.timeline.v1.Timeline.internal_static_xyz_block_ftl_timeline_v1_StreamTimelineResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return xyz.block.ftl.timeline.v1.Timeline.internal_static_xyz_block_ftl_timeline_v1_StreamTimelineResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            xyz.block.ftl.timeline.v1.StreamTimelineResponse.class, xyz.block.ftl.timeline.v1.StreamTimelineResponse.Builder.class);
  }

  public static final int EVENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<xyz.block.ftl.timeline.v1.Event> events_;
  /**
   * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
   */
  @java.lang.Override
  public java.util.List<xyz.block.ftl.timeline.v1.Event> getEventsList() {
    return events_;
  }
  /**
   * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends xyz.block.ftl.timeline.v1.EventOrBuilder> 
      getEventsOrBuilderList() {
    return events_;
  }
  /**
   * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
   */
  @java.lang.Override
  public int getEventsCount() {
    return events_.size();
  }
  /**
   * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
   */
  @java.lang.Override
  public xyz.block.ftl.timeline.v1.Event getEvents(int index) {
    return events_.get(index);
  }
  /**
   * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
   */
  @java.lang.Override
  public xyz.block.ftl.timeline.v1.EventOrBuilder getEventsOrBuilder(
      int index) {
    return events_.get(index);
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
    for (int i = 0; i < events_.size(); i++) {
      output.writeMessage(1, events_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < events_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, events_.get(i));
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
    if (!(obj instanceof xyz.block.ftl.timeline.v1.StreamTimelineResponse)) {
      return super.equals(obj);
    }
    xyz.block.ftl.timeline.v1.StreamTimelineResponse other = (xyz.block.ftl.timeline.v1.StreamTimelineResponse) obj;

    if (!getEventsList()
        .equals(other.getEventsList())) return false;
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
    if (getEventsCount() > 0) {
      hash = (37 * hash) + EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEventsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static xyz.block.ftl.timeline.v1.StreamTimelineResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.timeline.v1.StreamTimelineResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.timeline.v1.StreamTimelineResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.timeline.v1.StreamTimelineResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.timeline.v1.StreamTimelineResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static xyz.block.ftl.timeline.v1.StreamTimelineResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static xyz.block.ftl.timeline.v1.StreamTimelineResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.timeline.v1.StreamTimelineResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static xyz.block.ftl.timeline.v1.StreamTimelineResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static xyz.block.ftl.timeline.v1.StreamTimelineResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static xyz.block.ftl.timeline.v1.StreamTimelineResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static xyz.block.ftl.timeline.v1.StreamTimelineResponse parseFrom(
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
  public static Builder newBuilder(xyz.block.ftl.timeline.v1.StreamTimelineResponse prototype) {
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
   * Protobuf type {@code xyz.block.ftl.timeline.v1.StreamTimelineResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xyz.block.ftl.timeline.v1.StreamTimelineResponse)
      xyz.block.ftl.timeline.v1.StreamTimelineResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return xyz.block.ftl.timeline.v1.Timeline.internal_static_xyz_block_ftl_timeline_v1_StreamTimelineResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return xyz.block.ftl.timeline.v1.Timeline.internal_static_xyz_block_ftl_timeline_v1_StreamTimelineResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              xyz.block.ftl.timeline.v1.StreamTimelineResponse.class, xyz.block.ftl.timeline.v1.StreamTimelineResponse.Builder.class);
    }

    // Construct using xyz.block.ftl.timeline.v1.StreamTimelineResponse.newBuilder()
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
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
      } else {
        events_ = null;
        eventsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return xyz.block.ftl.timeline.v1.Timeline.internal_static_xyz_block_ftl_timeline_v1_StreamTimelineResponse_descriptor;
    }

    @java.lang.Override
    public xyz.block.ftl.timeline.v1.StreamTimelineResponse getDefaultInstanceForType() {
      return xyz.block.ftl.timeline.v1.StreamTimelineResponse.getDefaultInstance();
    }

    @java.lang.Override
    public xyz.block.ftl.timeline.v1.StreamTimelineResponse build() {
      xyz.block.ftl.timeline.v1.StreamTimelineResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public xyz.block.ftl.timeline.v1.StreamTimelineResponse buildPartial() {
      xyz.block.ftl.timeline.v1.StreamTimelineResponse result = new xyz.block.ftl.timeline.v1.StreamTimelineResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(xyz.block.ftl.timeline.v1.StreamTimelineResponse result) {
      if (eventsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          events_ = java.util.Collections.unmodifiableList(events_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.events_ = events_;
      } else {
        result.events_ = eventsBuilder_.build();
      }
    }

    private void buildPartial0(xyz.block.ftl.timeline.v1.StreamTimelineResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof xyz.block.ftl.timeline.v1.StreamTimelineResponse) {
        return mergeFrom((xyz.block.ftl.timeline.v1.StreamTimelineResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(xyz.block.ftl.timeline.v1.StreamTimelineResponse other) {
      if (other == xyz.block.ftl.timeline.v1.StreamTimelineResponse.getDefaultInstance()) return this;
      if (eventsBuilder_ == null) {
        if (!other.events_.isEmpty()) {
          if (events_.isEmpty()) {
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEventsIsMutable();
            events_.addAll(other.events_);
          }
          onChanged();
        }
      } else {
        if (!other.events_.isEmpty()) {
          if (eventsBuilder_.isEmpty()) {
            eventsBuilder_.dispose();
            eventsBuilder_ = null;
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000001);
            eventsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getEventsFieldBuilder() : null;
          } else {
            eventsBuilder_.addAllMessages(other.events_);
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
              xyz.block.ftl.timeline.v1.Event m =
                  input.readMessage(
                      xyz.block.ftl.timeline.v1.Event.parser(),
                      extensionRegistry);
              if (eventsBuilder_ == null) {
                ensureEventsIsMutable();
                events_.add(m);
              } else {
                eventsBuilder_.addMessage(m);
              }
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

    private java.util.List<xyz.block.ftl.timeline.v1.Event> events_ =
      java.util.Collections.emptyList();
    private void ensureEventsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        events_ = new java.util.ArrayList<xyz.block.ftl.timeline.v1.Event>(events_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        xyz.block.ftl.timeline.v1.Event, xyz.block.ftl.timeline.v1.Event.Builder, xyz.block.ftl.timeline.v1.EventOrBuilder> eventsBuilder_;

    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public java.util.List<xyz.block.ftl.timeline.v1.Event> getEventsList() {
      if (eventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(events_);
      } else {
        return eventsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public int getEventsCount() {
      if (eventsBuilder_ == null) {
        return events_.size();
      } else {
        return eventsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public xyz.block.ftl.timeline.v1.Event getEvents(int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);
      } else {
        return eventsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public Builder setEvents(
        int index, xyz.block.ftl.timeline.v1.Event value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.set(index, value);
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public Builder setEvents(
        int index, xyz.block.ftl.timeline.v1.Event.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.set(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public Builder addEvents(xyz.block.ftl.timeline.v1.Event value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public Builder addEvents(
        int index, xyz.block.ftl.timeline.v1.Event value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(index, value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public Builder addEvents(
        xyz.block.ftl.timeline.v1.Event.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public Builder addEvents(
        int index, xyz.block.ftl.timeline.v1.Event.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public Builder addAllEvents(
        java.lang.Iterable<? extends xyz.block.ftl.timeline.v1.Event> values) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, events_);
        onChanged();
      } else {
        eventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public Builder clearEvents() {
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        eventsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public Builder removeEvents(int index) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.remove(index);
        onChanged();
      } else {
        eventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public xyz.block.ftl.timeline.v1.Event.Builder getEventsBuilder(
        int index) {
      return getEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public xyz.block.ftl.timeline.v1.EventOrBuilder getEventsOrBuilder(
        int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);  } else {
        return eventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public java.util.List<? extends xyz.block.ftl.timeline.v1.EventOrBuilder> 
         getEventsOrBuilderList() {
      if (eventsBuilder_ != null) {
        return eventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(events_);
      }
    }
    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public xyz.block.ftl.timeline.v1.Event.Builder addEventsBuilder() {
      return getEventsFieldBuilder().addBuilder(
          xyz.block.ftl.timeline.v1.Event.getDefaultInstance());
    }
    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public xyz.block.ftl.timeline.v1.Event.Builder addEventsBuilder(
        int index) {
      return getEventsFieldBuilder().addBuilder(
          index, xyz.block.ftl.timeline.v1.Event.getDefaultInstance());
    }
    /**
     * <code>repeated .xyz.block.ftl.timeline.v1.Event events = 1 [json_name = "events"];</code>
     */
    public java.util.List<xyz.block.ftl.timeline.v1.Event.Builder> 
         getEventsBuilderList() {
      return getEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        xyz.block.ftl.timeline.v1.Event, xyz.block.ftl.timeline.v1.Event.Builder, xyz.block.ftl.timeline.v1.EventOrBuilder> 
        getEventsFieldBuilder() {
      if (eventsBuilder_ == null) {
        eventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            xyz.block.ftl.timeline.v1.Event, xyz.block.ftl.timeline.v1.Event.Builder, xyz.block.ftl.timeline.v1.EventOrBuilder>(
                events_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        events_ = null;
      }
      return eventsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:xyz.block.ftl.timeline.v1.StreamTimelineResponse)
  }

  // @@protoc_insertion_point(class_scope:xyz.block.ftl.timeline.v1.StreamTimelineResponse)
  private static final xyz.block.ftl.timeline.v1.StreamTimelineResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new xyz.block.ftl.timeline.v1.StreamTimelineResponse();
  }

  public static xyz.block.ftl.timeline.v1.StreamTimelineResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamTimelineResponse>
      PARSER = new com.google.protobuf.AbstractParser<StreamTimelineResponse>() {
    @java.lang.Override
    public StreamTimelineResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<StreamTimelineResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamTimelineResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public xyz.block.ftl.timeline.v1.StreamTimelineResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

