// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/appengine.proto

package com.google.appengine.v1;

/**
 * <pre>
 * Response message for `Versions.ListVersions`.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.ListVersionsResponse}
 */
public  final class ListVersionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.ListVersionsResponse)
    ListVersionsResponseOrBuilder {
  // Use ListVersionsResponse.newBuilder() to construct.
  private ListVersionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListVersionsResponse() {
    versions_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListVersionsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              versions_ = new java.util.ArrayList<com.google.appengine.v1.Version>();
              mutable_bitField0_ |= 0x00000001;
            }
            versions_.add(
                input.readMessage(com.google.appengine.v1.Version.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        versions_ = java.util.Collections.unmodifiableList(versions_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_ListVersionsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_ListVersionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.ListVersionsResponse.class, com.google.appengine.v1.ListVersionsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int VERSIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.appengine.v1.Version> versions_;
  /**
   * <pre>
   * The versions belonging to the requested service.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.Version versions = 1;</code>
   */
  public java.util.List<com.google.appengine.v1.Version> getVersionsList() {
    return versions_;
  }
  /**
   * <pre>
   * The versions belonging to the requested service.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.Version versions = 1;</code>
   */
  public java.util.List<? extends com.google.appengine.v1.VersionOrBuilder> 
      getVersionsOrBuilderList() {
    return versions_;
  }
  /**
   * <pre>
   * The versions belonging to the requested service.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.Version versions = 1;</code>
   */
  public int getVersionsCount() {
    return versions_.size();
  }
  /**
   * <pre>
   * The versions belonging to the requested service.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.Version versions = 1;</code>
   */
  public com.google.appengine.v1.Version getVersions(int index) {
    return versions_.get(index);
  }
  /**
   * <pre>
   * The versions belonging to the requested service.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.Version versions = 1;</code>
   */
  public com.google.appengine.v1.VersionOrBuilder getVersionsOrBuilder(
      int index) {
    return versions_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * Continuation token for fetching the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Continuation token for fetching the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < versions_.size(); i++) {
      output.writeMessage(1, versions_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < versions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, versions_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.appengine.v1.ListVersionsResponse)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.ListVersionsResponse other = (com.google.appengine.v1.ListVersionsResponse) obj;

    boolean result = true;
    result = result && getVersionsList()
        .equals(other.getVersionsList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getVersionsCount() > 0) {
      hash = (37 * hash) + VERSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getVersionsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.ListVersionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.ListVersionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.ListVersionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.ListVersionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.ListVersionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.ListVersionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.ListVersionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.ListVersionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.ListVersionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.ListVersionsResponse parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1.ListVersionsResponse prototype) {
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
   * Response message for `Versions.ListVersions`.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.ListVersionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.ListVersionsResponse)
      com.google.appengine.v1.ListVersionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_ListVersionsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_ListVersionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.ListVersionsResponse.class, com.google.appengine.v1.ListVersionsResponse.Builder.class);
    }

    // Construct using com.google.appengine.v1.ListVersionsResponse.newBuilder()
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
        getVersionsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (versionsBuilder_ == null) {
        versions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        versionsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1.AppengineProto.internal_static_google_appengine_v1_ListVersionsResponse_descriptor;
    }

    public com.google.appengine.v1.ListVersionsResponse getDefaultInstanceForType() {
      return com.google.appengine.v1.ListVersionsResponse.getDefaultInstance();
    }

    public com.google.appengine.v1.ListVersionsResponse build() {
      com.google.appengine.v1.ListVersionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.appengine.v1.ListVersionsResponse buildPartial() {
      com.google.appengine.v1.ListVersionsResponse result = new com.google.appengine.v1.ListVersionsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (versionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          versions_ = java.util.Collections.unmodifiableList(versions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.versions_ = versions_;
      } else {
        result.versions_ = versionsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.appengine.v1.ListVersionsResponse) {
        return mergeFrom((com.google.appengine.v1.ListVersionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.ListVersionsResponse other) {
      if (other == com.google.appengine.v1.ListVersionsResponse.getDefaultInstance()) return this;
      if (versionsBuilder_ == null) {
        if (!other.versions_.isEmpty()) {
          if (versions_.isEmpty()) {
            versions_ = other.versions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVersionsIsMutable();
            versions_.addAll(other.versions_);
          }
          onChanged();
        }
      } else {
        if (!other.versions_.isEmpty()) {
          if (versionsBuilder_.isEmpty()) {
            versionsBuilder_.dispose();
            versionsBuilder_ = null;
            versions_ = other.versions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            versionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVersionsFieldBuilder() : null;
          } else {
            versionsBuilder_.addAllMessages(other.versions_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      com.google.appengine.v1.ListVersionsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.appengine.v1.ListVersionsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.appengine.v1.Version> versions_ =
      java.util.Collections.emptyList();
    private void ensureVersionsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        versions_ = new java.util.ArrayList<com.google.appengine.v1.Version>(versions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.appengine.v1.Version, com.google.appengine.v1.Version.Builder, com.google.appengine.v1.VersionOrBuilder> versionsBuilder_;

    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public java.util.List<com.google.appengine.v1.Version> getVersionsList() {
      if (versionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(versions_);
      } else {
        return versionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public int getVersionsCount() {
      if (versionsBuilder_ == null) {
        return versions_.size();
      } else {
        return versionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public com.google.appengine.v1.Version getVersions(int index) {
      if (versionsBuilder_ == null) {
        return versions_.get(index);
      } else {
        return versionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public Builder setVersions(
        int index, com.google.appengine.v1.Version value) {
      if (versionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVersionsIsMutable();
        versions_.set(index, value);
        onChanged();
      } else {
        versionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public Builder setVersions(
        int index, com.google.appengine.v1.Version.Builder builderForValue) {
      if (versionsBuilder_ == null) {
        ensureVersionsIsMutable();
        versions_.set(index, builderForValue.build());
        onChanged();
      } else {
        versionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public Builder addVersions(com.google.appengine.v1.Version value) {
      if (versionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVersionsIsMutable();
        versions_.add(value);
        onChanged();
      } else {
        versionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public Builder addVersions(
        int index, com.google.appengine.v1.Version value) {
      if (versionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVersionsIsMutable();
        versions_.add(index, value);
        onChanged();
      } else {
        versionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public Builder addVersions(
        com.google.appengine.v1.Version.Builder builderForValue) {
      if (versionsBuilder_ == null) {
        ensureVersionsIsMutable();
        versions_.add(builderForValue.build());
        onChanged();
      } else {
        versionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public Builder addVersions(
        int index, com.google.appengine.v1.Version.Builder builderForValue) {
      if (versionsBuilder_ == null) {
        ensureVersionsIsMutable();
        versions_.add(index, builderForValue.build());
        onChanged();
      } else {
        versionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public Builder addAllVersions(
        java.lang.Iterable<? extends com.google.appengine.v1.Version> values) {
      if (versionsBuilder_ == null) {
        ensureVersionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, versions_);
        onChanged();
      } else {
        versionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public Builder clearVersions() {
      if (versionsBuilder_ == null) {
        versions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        versionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public Builder removeVersions(int index) {
      if (versionsBuilder_ == null) {
        ensureVersionsIsMutable();
        versions_.remove(index);
        onChanged();
      } else {
        versionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public com.google.appengine.v1.Version.Builder getVersionsBuilder(
        int index) {
      return getVersionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public com.google.appengine.v1.VersionOrBuilder getVersionsOrBuilder(
        int index) {
      if (versionsBuilder_ == null) {
        return versions_.get(index);  } else {
        return versionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public java.util.List<? extends com.google.appengine.v1.VersionOrBuilder> 
         getVersionsOrBuilderList() {
      if (versionsBuilder_ != null) {
        return versionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(versions_);
      }
    }
    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public com.google.appengine.v1.Version.Builder addVersionsBuilder() {
      return getVersionsFieldBuilder().addBuilder(
          com.google.appengine.v1.Version.getDefaultInstance());
    }
    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public com.google.appengine.v1.Version.Builder addVersionsBuilder(
        int index) {
      return getVersionsFieldBuilder().addBuilder(
          index, com.google.appengine.v1.Version.getDefaultInstance());
    }
    /**
     * <pre>
     * The versions belonging to the requested service.
     * </pre>
     *
     * <code>repeated .google.appengine.v1.Version versions = 1;</code>
     */
    public java.util.List<com.google.appengine.v1.Version.Builder> 
         getVersionsBuilderList() {
      return getVersionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.appengine.v1.Version, com.google.appengine.v1.Version.Builder, com.google.appengine.v1.VersionOrBuilder> 
        getVersionsFieldBuilder() {
      if (versionsBuilder_ == null) {
        versionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.appengine.v1.Version, com.google.appengine.v1.Version.Builder, com.google.appengine.v1.VersionOrBuilder>(
                versions_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        versions_ = null;
      }
      return versionsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Continuation token for fetching the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Continuation token for fetching the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Continuation token for fetching the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Continuation token for fetching the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Continuation token for fetching the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.appengine.v1.ListVersionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.ListVersionsResponse)
  private static final com.google.appengine.v1.ListVersionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.ListVersionsResponse();
  }

  public static com.google.appengine.v1.ListVersionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListVersionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListVersionsResponse>() {
    public ListVersionsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListVersionsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListVersionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListVersionsResponse> getParserForType() {
    return PARSER;
  }

  public com.google.appengine.v1.ListVersionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

