// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 * <pre>
 * A message data and its attributes. The message payload must not be empty;
 * it must contain either a non-empty data field, or at least one attribute.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.PubsubMessage}
 */
public  final class PubsubMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.PubsubMessage)
    PubsubMessageOrBuilder {
  // Use PubsubMessage.newBuilder() to construct.
  private PubsubMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PubsubMessage() {
    data_ = com.google.protobuf.ByteString.EMPTY;
    messageId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PubsubMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {

            data_ = input.readBytes();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              attributes_ = com.google.protobuf.MapField.newMapField(
                  AttributesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            attributes__ = input.readMessage(
                AttributesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            attributes_.getMutableMap().put(
                attributes__.getKey(), attributes__.getValue());
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            messageId_ = s;
            break;
          }
          case 34: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (publishTime_ != null) {
              subBuilder = publishTime_.toBuilder();
            }
            publishTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(publishTime_);
              publishTime_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_PubsubMessage_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetAttributes();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_PubsubMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.PubsubMessage.class, com.google.pubsub.v1.PubsubMessage.Builder.class);
  }

  private int bitField0_;
  public static final int DATA_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString data_;
  /**
   * <pre>
   * The message payload.
   * </pre>
   *
   * <code>bytes data = 1;</code>
   */
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  public static final int ATTRIBUTES_FIELD_NUMBER = 2;
  private static final class AttributesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_PubsubMessage_AttributesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> attributes_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetAttributes() {
    if (attributes_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          AttributesDefaultEntryHolder.defaultEntry);
    }
    return attributes_;
  }

  public int getAttributesCount() {
    return internalGetAttributes().getMap().size();
  }
  /**
   * <pre>
   * Optional attributes for this message.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */

  public boolean containsAttributes(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetAttributes().getMap().containsKey(key);
  }
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getAttributes() {
    return getAttributesMap();
  }
  /**
   * <pre>
   * Optional attributes for this message.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getAttributesMap() {
    return internalGetAttributes().getMap();
  }
  /**
   * <pre>
   * Optional attributes for this message.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */

  public java.lang.String getAttributesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetAttributes().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Optional attributes for this message.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */

  public java.lang.String getAttributesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetAttributes().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int MESSAGE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object messageId_;
  /**
   * <pre>
   * ID of this message, assigned by the server when the message is published.
   * Guaranteed to be unique within the topic. This value may be read by a
   * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
   * delivery. It must not be populated by the publisher in a `Publish` call.
   * </pre>
   *
   * <code>string message_id = 3;</code>
   */
  public java.lang.String getMessageId() {
    java.lang.Object ref = messageId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      messageId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ID of this message, assigned by the server when the message is published.
   * Guaranteed to be unique within the topic. This value may be read by a
   * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
   * delivery. It must not be populated by the publisher in a `Publish` call.
   * </pre>
   *
   * <code>string message_id = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMessageIdBytes() {
    java.lang.Object ref = messageId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      messageId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBLISH_TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp publishTime_;
  /**
   * <pre>
   * The time at which the message was published, populated by the server when
   * it receives the `Publish` call. It must not be populated by the
   * publisher in a `Publish` call.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp publish_time = 4;</code>
   */
  public boolean hasPublishTime() {
    return publishTime_ != null;
  }
  /**
   * <pre>
   * The time at which the message was published, populated by the server when
   * it receives the `Publish` call. It must not be populated by the
   * publisher in a `Publish` call.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp publish_time = 4;</code>
   */
  public com.google.protobuf.Timestamp getPublishTime() {
    return publishTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : publishTime_;
  }
  /**
   * <pre>
   * The time at which the message was published, populated by the server when
   * it receives the `Publish` call. It must not be populated by the
   * publisher in a `Publish` call.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp publish_time = 4;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getPublishTimeOrBuilder() {
    return getPublishTime();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!data_.isEmpty()) {
      output.writeBytes(1, data_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetAttributes(),
        AttributesDefaultEntryHolder.defaultEntry,
        2);
    if (!getMessageIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, messageId_);
    }
    if (publishTime_ != null) {
      output.writeMessage(4, getPublishTime());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, data_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetAttributes().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      attributes__ = AttributesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, attributes__);
    }
    if (!getMessageIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, messageId_);
    }
    if (publishTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getPublishTime());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.pubsub.v1.PubsubMessage)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.PubsubMessage other = (com.google.pubsub.v1.PubsubMessage) obj;

    boolean result = true;
    result = result && getData()
        .equals(other.getData());
    result = result && internalGetAttributes().equals(
        other.internalGetAttributes());
    result = result && getMessageId()
        .equals(other.getMessageId());
    result = result && (hasPublishTime() == other.hasPublishTime());
    if (hasPublishTime()) {
      result = result && getPublishTime()
          .equals(other.getPublishTime());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    if (!internalGetAttributes().getMap().isEmpty()) {
      hash = (37 * hash) + ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetAttributes().hashCode();
    }
    hash = (37 * hash) + MESSAGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMessageId().hashCode();
    if (hasPublishTime()) {
      hash = (37 * hash) + PUBLISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getPublishTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.PubsubMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.PubsubMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.PubsubMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.PubsubMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.PubsubMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.PubsubMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.PubsubMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.PubsubMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.PubsubMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.PubsubMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.pubsub.v1.PubsubMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A message data and its attributes. The message payload must not be empty;
   * it must contain either a non-empty data field, or at least one attribute.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.PubsubMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.PubsubMessage)
      com.google.pubsub.v1.PubsubMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_PubsubMessage_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetAttributes();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableAttributes();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_PubsubMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.PubsubMessage.class, com.google.pubsub.v1.PubsubMessage.Builder.class);
    }

    // Construct using com.google.pubsub.v1.PubsubMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      data_ = com.google.protobuf.ByteString.EMPTY;

      internalGetMutableAttributes().clear();
      messageId_ = "";

      if (publishTimeBuilder_ == null) {
        publishTime_ = null;
      } else {
        publishTime_ = null;
        publishTimeBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_PubsubMessage_descriptor;
    }

    public com.google.pubsub.v1.PubsubMessage getDefaultInstanceForType() {
      return com.google.pubsub.v1.PubsubMessage.getDefaultInstance();
    }

    public com.google.pubsub.v1.PubsubMessage build() {
      com.google.pubsub.v1.PubsubMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.pubsub.v1.PubsubMessage buildPartial() {
      com.google.pubsub.v1.PubsubMessage result = new com.google.pubsub.v1.PubsubMessage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.data_ = data_;
      result.attributes_ = internalGetAttributes();
      result.attributes_.makeImmutable();
      result.messageId_ = messageId_;
      if (publishTimeBuilder_ == null) {
        result.publishTime_ = publishTime_;
      } else {
        result.publishTime_ = publishTimeBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.pubsub.v1.PubsubMessage) {
        return mergeFrom((com.google.pubsub.v1.PubsubMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.PubsubMessage other) {
      if (other == com.google.pubsub.v1.PubsubMessage.getDefaultInstance()) return this;
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
      }
      internalGetMutableAttributes().mergeFrom(
          other.internalGetAttributes());
      if (!other.getMessageId().isEmpty()) {
        messageId_ = other.messageId_;
        onChanged();
      }
      if (other.hasPublishTime()) {
        mergePublishTime(other.getPublishTime());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.pubsub.v1.PubsubMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.PubsubMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The message payload.
     * </pre>
     *
     * <code>bytes data = 1;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <pre>
     * The message payload.
     * </pre>
     *
     * <code>bytes data = 1;</code>
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The message payload.
     * </pre>
     *
     * <code>bytes data = 1;</code>
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> attributes_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetAttributes() {
      if (attributes_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AttributesDefaultEntryHolder.defaultEntry);
      }
      return attributes_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableAttributes() {
      onChanged();;
      if (attributes_ == null) {
        attributes_ = com.google.protobuf.MapField.newMapField(
            AttributesDefaultEntryHolder.defaultEntry);
      }
      if (!attributes_.isMutable()) {
        attributes_ = attributes_.copy();
      }
      return attributes_;
    }

    public int getAttributesCount() {
      return internalGetAttributes().getMap().size();
    }
    /**
     * <pre>
     * Optional attributes for this message.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */

    public boolean containsAttributes(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetAttributes().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAttributesMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getAttributes() {
      return getAttributesMap();
    }
    /**
     * <pre>
     * Optional attributes for this message.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getAttributesMap() {
      return internalGetAttributes().getMap();
    }
    /**
     * <pre>
     * Optional attributes for this message.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */

    public java.lang.String getAttributesOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetAttributes().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Optional attributes for this message.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */

    public java.lang.String getAttributesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetAttributes().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearAttributes() {
      internalGetMutableAttributes().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Optional attributes for this message.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */

    public Builder removeAttributes(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableAttributes().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableAttributes() {
      return internalGetMutableAttributes().getMutableMap();
    }
    /**
     * <pre>
     * Optional attributes for this message.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */
    public Builder putAttributes(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableAttributes().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Optional attributes for this message.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */

    public Builder putAllAttributes(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableAttributes().getMutableMap()
          .putAll(values);
      return this;
    }

    private java.lang.Object messageId_ = "";
    /**
     * <pre>
     * ID of this message, assigned by the server when the message is published.
     * Guaranteed to be unique within the topic. This value may be read by a
     * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
     * delivery. It must not be populated by the publisher in a `Publish` call.
     * </pre>
     *
     * <code>string message_id = 3;</code>
     */
    public java.lang.String getMessageId() {
      java.lang.Object ref = messageId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messageId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * ID of this message, assigned by the server when the message is published.
     * Guaranteed to be unique within the topic. This value may be read by a
     * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
     * delivery. It must not be populated by the publisher in a `Publish` call.
     * </pre>
     *
     * <code>string message_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMessageIdBytes() {
      java.lang.Object ref = messageId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ID of this message, assigned by the server when the message is published.
     * Guaranteed to be unique within the topic. This value may be read by a
     * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
     * delivery. It must not be populated by the publisher in a `Publish` call.
     * </pre>
     *
     * <code>string message_id = 3;</code>
     */
    public Builder setMessageId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      messageId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of this message, assigned by the server when the message is published.
     * Guaranteed to be unique within the topic. This value may be read by a
     * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
     * delivery. It must not be populated by the publisher in a `Publish` call.
     * </pre>
     *
     * <code>string message_id = 3;</code>
     */
    public Builder clearMessageId() {
      
      messageId_ = getDefaultInstance().getMessageId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of this message, assigned by the server when the message is published.
     * Guaranteed to be unique within the topic. This value may be read by a
     * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
     * delivery. It must not be populated by the publisher in a `Publish` call.
     * </pre>
     *
     * <code>string message_id = 3;</code>
     */
    public Builder setMessageIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      messageId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp publishTime_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> publishTimeBuilder_;
    /**
     * <pre>
     * The time at which the message was published, populated by the server when
     * it receives the `Publish` call. It must not be populated by the
     * publisher in a `Publish` call.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 4;</code>
     */
    public boolean hasPublishTime() {
      return publishTimeBuilder_ != null || publishTime_ != null;
    }
    /**
     * <pre>
     * The time at which the message was published, populated by the server when
     * it receives the `Publish` call. It must not be populated by the
     * publisher in a `Publish` call.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 4;</code>
     */
    public com.google.protobuf.Timestamp getPublishTime() {
      if (publishTimeBuilder_ == null) {
        return publishTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : publishTime_;
      } else {
        return publishTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The time at which the message was published, populated by the server when
     * it receives the `Publish` call. It must not be populated by the
     * publisher in a `Publish` call.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 4;</code>
     */
    public Builder setPublishTime(com.google.protobuf.Timestamp value) {
      if (publishTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        publishTime_ = value;
        onChanged();
      } else {
        publishTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The time at which the message was published, populated by the server when
     * it receives the `Publish` call. It must not be populated by the
     * publisher in a `Publish` call.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 4;</code>
     */
    public Builder setPublishTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (publishTimeBuilder_ == null) {
        publishTime_ = builderForValue.build();
        onChanged();
      } else {
        publishTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The time at which the message was published, populated by the server when
     * it receives the `Publish` call. It must not be populated by the
     * publisher in a `Publish` call.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 4;</code>
     */
    public Builder mergePublishTime(com.google.protobuf.Timestamp value) {
      if (publishTimeBuilder_ == null) {
        if (publishTime_ != null) {
          publishTime_ =
            com.google.protobuf.Timestamp.newBuilder(publishTime_).mergeFrom(value).buildPartial();
        } else {
          publishTime_ = value;
        }
        onChanged();
      } else {
        publishTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The time at which the message was published, populated by the server when
     * it receives the `Publish` call. It must not be populated by the
     * publisher in a `Publish` call.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 4;</code>
     */
    public Builder clearPublishTime() {
      if (publishTimeBuilder_ == null) {
        publishTime_ = null;
        onChanged();
      } else {
        publishTime_ = null;
        publishTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The time at which the message was published, populated by the server when
     * it receives the `Publish` call. It must not be populated by the
     * publisher in a `Publish` call.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getPublishTimeBuilder() {
      
      onChanged();
      return getPublishTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The time at which the message was published, populated by the server when
     * it receives the `Publish` call. It must not be populated by the
     * publisher in a `Publish` call.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getPublishTimeOrBuilder() {
      if (publishTimeBuilder_ != null) {
        return publishTimeBuilder_.getMessageOrBuilder();
      } else {
        return publishTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : publishTime_;
      }
    }
    /**
     * <pre>
     * The time at which the message was published, populated by the server when
     * it receives the `Publish` call. It must not be populated by the
     * publisher in a `Publish` call.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getPublishTimeFieldBuilder() {
      if (publishTimeBuilder_ == null) {
        publishTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getPublishTime(),
                getParentForChildren(),
                isClean());
        publishTime_ = null;
      }
      return publishTimeBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.PubsubMessage)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.PubsubMessage)
  private static final com.google.pubsub.v1.PubsubMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.PubsubMessage();
  }

  public static com.google.pubsub.v1.PubsubMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PubsubMessage>
      PARSER = new com.google.protobuf.AbstractParser<PubsubMessage>() {
    public PubsubMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PubsubMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PubsubMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PubsubMessage> getParserForType() {
    return PARSER;
  }

  public com.google.pubsub.v1.PubsubMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

