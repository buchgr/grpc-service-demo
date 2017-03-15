// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/datastore.proto

package com.google.datastore.v1;

/**
 * <pre>
 * The request for [Datastore.Lookup][google.datastore.v1.Datastore.Lookup].
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1.LookupRequest}
 */
public  final class LookupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1.LookupRequest)
    LookupRequestOrBuilder {
  // Use LookupRequest.newBuilder() to construct.
  private LookupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LookupRequest() {
    projectId_ = "";
    keys_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private LookupRequest(
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
            com.google.datastore.v1.ReadOptions.Builder subBuilder = null;
            if (readOptions_ != null) {
              subBuilder = readOptions_.toBuilder();
            }
            readOptions_ = input.readMessage(com.google.datastore.v1.ReadOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(readOptions_);
              readOptions_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              keys_ = new java.util.ArrayList<com.google.datastore.v1.Key>();
              mutable_bitField0_ |= 0x00000004;
            }
            keys_.add(
                input.readMessage(com.google.datastore.v1.Key.parser(), extensionRegistry));
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            projectId_ = s;
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        keys_ = java.util.Collections.unmodifiableList(keys_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.datastore.v1.DatastoreProto.internal_static_google_datastore_v1_LookupRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1.DatastoreProto.internal_static_google_datastore_v1_LookupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1.LookupRequest.class, com.google.datastore.v1.LookupRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PROJECT_ID_FIELD_NUMBER = 8;
  private volatile java.lang.Object projectId_;
  /**
   * <pre>
   * The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8;</code>
   */
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8;</code>
   */
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int READ_OPTIONS_FIELD_NUMBER = 1;
  private com.google.datastore.v1.ReadOptions readOptions_;
  /**
   * <pre>
   * The options for this lookup request.
   * </pre>
   *
   * <code>.google.datastore.v1.ReadOptions read_options = 1;</code>
   */
  public boolean hasReadOptions() {
    return readOptions_ != null;
  }
  /**
   * <pre>
   * The options for this lookup request.
   * </pre>
   *
   * <code>.google.datastore.v1.ReadOptions read_options = 1;</code>
   */
  public com.google.datastore.v1.ReadOptions getReadOptions() {
    return readOptions_ == null ? com.google.datastore.v1.ReadOptions.getDefaultInstance() : readOptions_;
  }
  /**
   * <pre>
   * The options for this lookup request.
   * </pre>
   *
   * <code>.google.datastore.v1.ReadOptions read_options = 1;</code>
   */
  public com.google.datastore.v1.ReadOptionsOrBuilder getReadOptionsOrBuilder() {
    return getReadOptions();
  }

  public static final int KEYS_FIELD_NUMBER = 3;
  private java.util.List<com.google.datastore.v1.Key> keys_;
  /**
   * <pre>
   * Keys of entities to look up.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key keys = 3;</code>
   */
  public java.util.List<com.google.datastore.v1.Key> getKeysList() {
    return keys_;
  }
  /**
   * <pre>
   * Keys of entities to look up.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key keys = 3;</code>
   */
  public java.util.List<? extends com.google.datastore.v1.KeyOrBuilder> 
      getKeysOrBuilderList() {
    return keys_;
  }
  /**
   * <pre>
   * Keys of entities to look up.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key keys = 3;</code>
   */
  public int getKeysCount() {
    return keys_.size();
  }
  /**
   * <pre>
   * Keys of entities to look up.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key keys = 3;</code>
   */
  public com.google.datastore.v1.Key getKeys(int index) {
    return keys_.get(index);
  }
  /**
   * <pre>
   * Keys of entities to look up.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key keys = 3;</code>
   */
  public com.google.datastore.v1.KeyOrBuilder getKeysOrBuilder(
      int index) {
    return keys_.get(index);
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
    if (readOptions_ != null) {
      output.writeMessage(1, getReadOptions());
    }
    for (int i = 0; i < keys_.size(); i++) {
      output.writeMessage(3, keys_.get(i));
    }
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, projectId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (readOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getReadOptions());
    }
    for (int i = 0; i < keys_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, keys_.get(i));
    }
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, projectId_);
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
    if (!(obj instanceof com.google.datastore.v1.LookupRequest)) {
      return super.equals(obj);
    }
    com.google.datastore.v1.LookupRequest other = (com.google.datastore.v1.LookupRequest) obj;

    boolean result = true;
    result = result && getProjectId()
        .equals(other.getProjectId());
    result = result && (hasReadOptions() == other.hasReadOptions());
    if (hasReadOptions()) {
      result = result && getReadOptions()
          .equals(other.getReadOptions());
    }
    result = result && getKeysList()
        .equals(other.getKeysList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    if (hasReadOptions()) {
      hash = (37 * hash) + READ_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getReadOptions().hashCode();
    }
    if (getKeysCount() > 0) {
      hash = (37 * hash) + KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getKeysList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1.LookupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.LookupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.LookupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.LookupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.LookupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.LookupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1.LookupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.LookupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1.LookupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.LookupRequest parseFrom(
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
  public static Builder newBuilder(com.google.datastore.v1.LookupRequest prototype) {
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
   * The request for [Datastore.Lookup][google.datastore.v1.Datastore.Lookup].
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1.LookupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1.LookupRequest)
      com.google.datastore.v1.LookupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.datastore.v1.DatastoreProto.internal_static_google_datastore_v1_LookupRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1.DatastoreProto.internal_static_google_datastore_v1_LookupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1.LookupRequest.class, com.google.datastore.v1.LookupRequest.Builder.class);
    }

    // Construct using com.google.datastore.v1.LookupRequest.newBuilder()
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
        getKeysFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      projectId_ = "";

      if (readOptionsBuilder_ == null) {
        readOptions_ = null;
      } else {
        readOptions_ = null;
        readOptionsBuilder_ = null;
      }
      if (keysBuilder_ == null) {
        keys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        keysBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.datastore.v1.DatastoreProto.internal_static_google_datastore_v1_LookupRequest_descriptor;
    }

    public com.google.datastore.v1.LookupRequest getDefaultInstanceForType() {
      return com.google.datastore.v1.LookupRequest.getDefaultInstance();
    }

    public com.google.datastore.v1.LookupRequest build() {
      com.google.datastore.v1.LookupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.datastore.v1.LookupRequest buildPartial() {
      com.google.datastore.v1.LookupRequest result = new com.google.datastore.v1.LookupRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.projectId_ = projectId_;
      if (readOptionsBuilder_ == null) {
        result.readOptions_ = readOptions_;
      } else {
        result.readOptions_ = readOptionsBuilder_.build();
      }
      if (keysBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          keys_ = java.util.Collections.unmodifiableList(keys_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.keys_ = keys_;
      } else {
        result.keys_ = keysBuilder_.build();
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
      if (other instanceof com.google.datastore.v1.LookupRequest) {
        return mergeFrom((com.google.datastore.v1.LookupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1.LookupRequest other) {
      if (other == com.google.datastore.v1.LookupRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (other.hasReadOptions()) {
        mergeReadOptions(other.getReadOptions());
      }
      if (keysBuilder_ == null) {
        if (!other.keys_.isEmpty()) {
          if (keys_.isEmpty()) {
            keys_ = other.keys_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureKeysIsMutable();
            keys_.addAll(other.keys_);
          }
          onChanged();
        }
      } else {
        if (!other.keys_.isEmpty()) {
          if (keysBuilder_.isEmpty()) {
            keysBuilder_.dispose();
            keysBuilder_ = null;
            keys_ = other.keys_;
            bitField0_ = (bitField0_ & ~0x00000004);
            keysBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getKeysFieldBuilder() : null;
          } else {
            keysBuilder_.addAllMessages(other.keys_);
          }
        }
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
      com.google.datastore.v1.LookupRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.datastore.v1.LookupRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public Builder clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectId_ = value;
      onChanged();
      return this;
    }

    private com.google.datastore.v1.ReadOptions readOptions_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.datastore.v1.ReadOptions, com.google.datastore.v1.ReadOptions.Builder, com.google.datastore.v1.ReadOptionsOrBuilder> readOptionsBuilder_;
    /**
     * <pre>
     * The options for this lookup request.
     * </pre>
     *
     * <code>.google.datastore.v1.ReadOptions read_options = 1;</code>
     */
    public boolean hasReadOptions() {
      return readOptionsBuilder_ != null || readOptions_ != null;
    }
    /**
     * <pre>
     * The options for this lookup request.
     * </pre>
     *
     * <code>.google.datastore.v1.ReadOptions read_options = 1;</code>
     */
    public com.google.datastore.v1.ReadOptions getReadOptions() {
      if (readOptionsBuilder_ == null) {
        return readOptions_ == null ? com.google.datastore.v1.ReadOptions.getDefaultInstance() : readOptions_;
      } else {
        return readOptionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The options for this lookup request.
     * </pre>
     *
     * <code>.google.datastore.v1.ReadOptions read_options = 1;</code>
     */
    public Builder setReadOptions(com.google.datastore.v1.ReadOptions value) {
      if (readOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        readOptions_ = value;
        onChanged();
      } else {
        readOptionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The options for this lookup request.
     * </pre>
     *
     * <code>.google.datastore.v1.ReadOptions read_options = 1;</code>
     */
    public Builder setReadOptions(
        com.google.datastore.v1.ReadOptions.Builder builderForValue) {
      if (readOptionsBuilder_ == null) {
        readOptions_ = builderForValue.build();
        onChanged();
      } else {
        readOptionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The options for this lookup request.
     * </pre>
     *
     * <code>.google.datastore.v1.ReadOptions read_options = 1;</code>
     */
    public Builder mergeReadOptions(com.google.datastore.v1.ReadOptions value) {
      if (readOptionsBuilder_ == null) {
        if (readOptions_ != null) {
          readOptions_ =
            com.google.datastore.v1.ReadOptions.newBuilder(readOptions_).mergeFrom(value).buildPartial();
        } else {
          readOptions_ = value;
        }
        onChanged();
      } else {
        readOptionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The options for this lookup request.
     * </pre>
     *
     * <code>.google.datastore.v1.ReadOptions read_options = 1;</code>
     */
    public Builder clearReadOptions() {
      if (readOptionsBuilder_ == null) {
        readOptions_ = null;
        onChanged();
      } else {
        readOptions_ = null;
        readOptionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The options for this lookup request.
     * </pre>
     *
     * <code>.google.datastore.v1.ReadOptions read_options = 1;</code>
     */
    public com.google.datastore.v1.ReadOptions.Builder getReadOptionsBuilder() {
      
      onChanged();
      return getReadOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The options for this lookup request.
     * </pre>
     *
     * <code>.google.datastore.v1.ReadOptions read_options = 1;</code>
     */
    public com.google.datastore.v1.ReadOptionsOrBuilder getReadOptionsOrBuilder() {
      if (readOptionsBuilder_ != null) {
        return readOptionsBuilder_.getMessageOrBuilder();
      } else {
        return readOptions_ == null ?
            com.google.datastore.v1.ReadOptions.getDefaultInstance() : readOptions_;
      }
    }
    /**
     * <pre>
     * The options for this lookup request.
     * </pre>
     *
     * <code>.google.datastore.v1.ReadOptions read_options = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.datastore.v1.ReadOptions, com.google.datastore.v1.ReadOptions.Builder, com.google.datastore.v1.ReadOptionsOrBuilder> 
        getReadOptionsFieldBuilder() {
      if (readOptionsBuilder_ == null) {
        readOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1.ReadOptions, com.google.datastore.v1.ReadOptions.Builder, com.google.datastore.v1.ReadOptionsOrBuilder>(
                getReadOptions(),
                getParentForChildren(),
                isClean());
        readOptions_ = null;
      }
      return readOptionsBuilder_;
    }

    private java.util.List<com.google.datastore.v1.Key> keys_ =
      java.util.Collections.emptyList();
    private void ensureKeysIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        keys_ = new java.util.ArrayList<com.google.datastore.v1.Key>(keys_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.datastore.v1.Key, com.google.datastore.v1.Key.Builder, com.google.datastore.v1.KeyOrBuilder> keysBuilder_;

    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public java.util.List<com.google.datastore.v1.Key> getKeysList() {
      if (keysBuilder_ == null) {
        return java.util.Collections.unmodifiableList(keys_);
      } else {
        return keysBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public int getKeysCount() {
      if (keysBuilder_ == null) {
        return keys_.size();
      } else {
        return keysBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public com.google.datastore.v1.Key getKeys(int index) {
      if (keysBuilder_ == null) {
        return keys_.get(index);
      } else {
        return keysBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public Builder setKeys(
        int index, com.google.datastore.v1.Key value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.set(index, value);
        onChanged();
      } else {
        keysBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public Builder setKeys(
        int index, com.google.datastore.v1.Key.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.set(index, builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public Builder addKeys(com.google.datastore.v1.Key value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.add(value);
        onChanged();
      } else {
        keysBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public Builder addKeys(
        int index, com.google.datastore.v1.Key value) {
      if (keysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeysIsMutable();
        keys_.add(index, value);
        onChanged();
      } else {
        keysBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public Builder addKeys(
        com.google.datastore.v1.Key.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.add(builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public Builder addKeys(
        int index, com.google.datastore.v1.Key.Builder builderForValue) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.add(index, builderForValue.build());
        onChanged();
      } else {
        keysBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public Builder addAllKeys(
        java.lang.Iterable<? extends com.google.datastore.v1.Key> values) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, keys_);
        onChanged();
      } else {
        keysBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public Builder clearKeys() {
      if (keysBuilder_ == null) {
        keys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        keysBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public Builder removeKeys(int index) {
      if (keysBuilder_ == null) {
        ensureKeysIsMutable();
        keys_.remove(index);
        onChanged();
      } else {
        keysBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public com.google.datastore.v1.Key.Builder getKeysBuilder(
        int index) {
      return getKeysFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public com.google.datastore.v1.KeyOrBuilder getKeysOrBuilder(
        int index) {
      if (keysBuilder_ == null) {
        return keys_.get(index);  } else {
        return keysBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public java.util.List<? extends com.google.datastore.v1.KeyOrBuilder> 
         getKeysOrBuilderList() {
      if (keysBuilder_ != null) {
        return keysBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(keys_);
      }
    }
    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public com.google.datastore.v1.Key.Builder addKeysBuilder() {
      return getKeysFieldBuilder().addBuilder(
          com.google.datastore.v1.Key.getDefaultInstance());
    }
    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public com.google.datastore.v1.Key.Builder addKeysBuilder(
        int index) {
      return getKeysFieldBuilder().addBuilder(
          index, com.google.datastore.v1.Key.getDefaultInstance());
    }
    /**
     * <pre>
     * Keys of entities to look up.
     * </pre>
     *
     * <code>repeated .google.datastore.v1.Key keys = 3;</code>
     */
    public java.util.List<com.google.datastore.v1.Key.Builder> 
         getKeysBuilderList() {
      return getKeysFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.datastore.v1.Key, com.google.datastore.v1.Key.Builder, com.google.datastore.v1.KeyOrBuilder> 
        getKeysFieldBuilder() {
      if (keysBuilder_ == null) {
        keysBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.datastore.v1.Key, com.google.datastore.v1.Key.Builder, com.google.datastore.v1.KeyOrBuilder>(
                keys_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        keys_ = null;
      }
      return keysBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.datastore.v1.LookupRequest)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1.LookupRequest)
  private static final com.google.datastore.v1.LookupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1.LookupRequest();
  }

  public static com.google.datastore.v1.LookupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LookupRequest>
      PARSER = new com.google.protobuf.AbstractParser<LookupRequest>() {
    public LookupRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new LookupRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LookupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LookupRequest> getParserForType() {
    return PARSER;
  }

  public com.google.datastore.v1.LookupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

