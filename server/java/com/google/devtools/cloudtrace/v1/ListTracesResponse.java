// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudtrace/v1/trace.proto

package com.google.devtools.cloudtrace.v1;

/**
 * <pre>
 * The response message for the `ListTraces` method.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudtrace.v1.ListTracesResponse}
 */
public  final class ListTracesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudtrace.v1.ListTracesResponse)
    ListTracesResponseOrBuilder {
  // Use ListTracesResponse.newBuilder() to construct.
  private ListTracesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTracesResponse() {
    traces_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListTracesResponse(
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
              traces_ = new java.util.ArrayList<com.google.devtools.cloudtrace.v1.Trace>();
              mutable_bitField0_ |= 0x00000001;
            }
            traces_.add(
                input.readMessage(com.google.devtools.cloudtrace.v1.Trace.parser(), extensionRegistry));
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
        traces_ = java.util.Collections.unmodifiableList(traces_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.cloudtrace.v1.TraceProto.internal_static_google_devtools_cloudtrace_v1_ListTracesResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.cloudtrace.v1.TraceProto.internal_static_google_devtools_cloudtrace_v1_ListTracesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.cloudtrace.v1.ListTracesResponse.class, com.google.devtools.cloudtrace.v1.ListTracesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int TRACES_FIELD_NUMBER = 1;
  private java.util.List<com.google.devtools.cloudtrace.v1.Trace> traces_;
  /**
   * <pre>
   * List of trace records returned.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  public java.util.List<com.google.devtools.cloudtrace.v1.Trace> getTracesList() {
    return traces_;
  }
  /**
   * <pre>
   * List of trace records returned.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  public java.util.List<? extends com.google.devtools.cloudtrace.v1.TraceOrBuilder> 
      getTracesOrBuilderList() {
    return traces_;
  }
  /**
   * <pre>
   * List of trace records returned.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  public int getTracesCount() {
    return traces_.size();
  }
  /**
   * <pre>
   * List of trace records returned.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  public com.google.devtools.cloudtrace.v1.Trace getTraces(int index) {
    return traces_.get(index);
  }
  /**
   * <pre>
   * List of trace records returned.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  public com.google.devtools.cloudtrace.v1.TraceOrBuilder getTracesOrBuilder(
      int index) {
    return traces_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * If defined, indicates that there are more traces that match the request
   * and that this value should be passed to the next request to continue
   * retrieving additional traces.
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
   * If defined, indicates that there are more traces that match the request
   * and that this value should be passed to the next request to continue
   * retrieving additional traces.
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
    for (int i = 0; i < traces_.size(); i++) {
      output.writeMessage(1, traces_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < traces_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, traces_.get(i));
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
    if (!(obj instanceof com.google.devtools.cloudtrace.v1.ListTracesResponse)) {
      return super.equals(obj);
    }
    com.google.devtools.cloudtrace.v1.ListTracesResponse other = (com.google.devtools.cloudtrace.v1.ListTracesResponse) obj;

    boolean result = true;
    result = result && getTracesList()
        .equals(other.getTracesList());
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
    if (getTracesCount() > 0) {
      hash = (37 * hash) + TRACES_FIELD_NUMBER;
      hash = (53 * hash) + getTracesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.cloudtrace.v1.ListTracesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.cloudtrace.v1.ListTracesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v1.ListTracesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.cloudtrace.v1.ListTracesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v1.ListTracesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.cloudtrace.v1.ListTracesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v1.ListTracesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.cloudtrace.v1.ListTracesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v1.ListTracesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.cloudtrace.v1.ListTracesResponse parseFrom(
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
  public static Builder newBuilder(com.google.devtools.cloudtrace.v1.ListTracesResponse prototype) {
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
   * The response message for the `ListTraces` method.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudtrace.v1.ListTracesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudtrace.v1.ListTracesResponse)
      com.google.devtools.cloudtrace.v1.ListTracesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.cloudtrace.v1.TraceProto.internal_static_google_devtools_cloudtrace_v1_ListTracesResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.cloudtrace.v1.TraceProto.internal_static_google_devtools_cloudtrace_v1_ListTracesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.cloudtrace.v1.ListTracesResponse.class, com.google.devtools.cloudtrace.v1.ListTracesResponse.Builder.class);
    }

    // Construct using com.google.devtools.cloudtrace.v1.ListTracesResponse.newBuilder()
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
        getTracesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (tracesBuilder_ == null) {
        traces_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        tracesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.cloudtrace.v1.TraceProto.internal_static_google_devtools_cloudtrace_v1_ListTracesResponse_descriptor;
    }

    public com.google.devtools.cloudtrace.v1.ListTracesResponse getDefaultInstanceForType() {
      return com.google.devtools.cloudtrace.v1.ListTracesResponse.getDefaultInstance();
    }

    public com.google.devtools.cloudtrace.v1.ListTracesResponse build() {
      com.google.devtools.cloudtrace.v1.ListTracesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.devtools.cloudtrace.v1.ListTracesResponse buildPartial() {
      com.google.devtools.cloudtrace.v1.ListTracesResponse result = new com.google.devtools.cloudtrace.v1.ListTracesResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (tracesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          traces_ = java.util.Collections.unmodifiableList(traces_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.traces_ = traces_;
      } else {
        result.traces_ = tracesBuilder_.build();
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
      if (other instanceof com.google.devtools.cloudtrace.v1.ListTracesResponse) {
        return mergeFrom((com.google.devtools.cloudtrace.v1.ListTracesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.cloudtrace.v1.ListTracesResponse other) {
      if (other == com.google.devtools.cloudtrace.v1.ListTracesResponse.getDefaultInstance()) return this;
      if (tracesBuilder_ == null) {
        if (!other.traces_.isEmpty()) {
          if (traces_.isEmpty()) {
            traces_ = other.traces_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTracesIsMutable();
            traces_.addAll(other.traces_);
          }
          onChanged();
        }
      } else {
        if (!other.traces_.isEmpty()) {
          if (tracesBuilder_.isEmpty()) {
            tracesBuilder_.dispose();
            tracesBuilder_ = null;
            traces_ = other.traces_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tracesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTracesFieldBuilder() : null;
          } else {
            tracesBuilder_.addAllMessages(other.traces_);
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
      com.google.devtools.cloudtrace.v1.ListTracesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.cloudtrace.v1.ListTracesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.devtools.cloudtrace.v1.Trace> traces_ =
      java.util.Collections.emptyList();
    private void ensureTracesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        traces_ = new java.util.ArrayList<com.google.devtools.cloudtrace.v1.Trace>(traces_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.cloudtrace.v1.Trace, com.google.devtools.cloudtrace.v1.Trace.Builder, com.google.devtools.cloudtrace.v1.TraceOrBuilder> tracesBuilder_;

    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public java.util.List<com.google.devtools.cloudtrace.v1.Trace> getTracesList() {
      if (tracesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(traces_);
      } else {
        return tracesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public int getTracesCount() {
      if (tracesBuilder_ == null) {
        return traces_.size();
      } else {
        return tracesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public com.google.devtools.cloudtrace.v1.Trace getTraces(int index) {
      if (tracesBuilder_ == null) {
        return traces_.get(index);
      } else {
        return tracesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder setTraces(
        int index, com.google.devtools.cloudtrace.v1.Trace value) {
      if (tracesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTracesIsMutable();
        traces_.set(index, value);
        onChanged();
      } else {
        tracesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder setTraces(
        int index, com.google.devtools.cloudtrace.v1.Trace.Builder builderForValue) {
      if (tracesBuilder_ == null) {
        ensureTracesIsMutable();
        traces_.set(index, builderForValue.build());
        onChanged();
      } else {
        tracesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder addTraces(com.google.devtools.cloudtrace.v1.Trace value) {
      if (tracesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTracesIsMutable();
        traces_.add(value);
        onChanged();
      } else {
        tracesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder addTraces(
        int index, com.google.devtools.cloudtrace.v1.Trace value) {
      if (tracesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTracesIsMutable();
        traces_.add(index, value);
        onChanged();
      } else {
        tracesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder addTraces(
        com.google.devtools.cloudtrace.v1.Trace.Builder builderForValue) {
      if (tracesBuilder_ == null) {
        ensureTracesIsMutable();
        traces_.add(builderForValue.build());
        onChanged();
      } else {
        tracesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder addTraces(
        int index, com.google.devtools.cloudtrace.v1.Trace.Builder builderForValue) {
      if (tracesBuilder_ == null) {
        ensureTracesIsMutable();
        traces_.add(index, builderForValue.build());
        onChanged();
      } else {
        tracesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder addAllTraces(
        java.lang.Iterable<? extends com.google.devtools.cloudtrace.v1.Trace> values) {
      if (tracesBuilder_ == null) {
        ensureTracesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, traces_);
        onChanged();
      } else {
        tracesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder clearTraces() {
      if (tracesBuilder_ == null) {
        traces_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tracesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder removeTraces(int index) {
      if (tracesBuilder_ == null) {
        ensureTracesIsMutable();
        traces_.remove(index);
        onChanged();
      } else {
        tracesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public com.google.devtools.cloudtrace.v1.Trace.Builder getTracesBuilder(
        int index) {
      return getTracesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public com.google.devtools.cloudtrace.v1.TraceOrBuilder getTracesOrBuilder(
        int index) {
      if (tracesBuilder_ == null) {
        return traces_.get(index);  } else {
        return tracesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public java.util.List<? extends com.google.devtools.cloudtrace.v1.TraceOrBuilder> 
         getTracesOrBuilderList() {
      if (tracesBuilder_ != null) {
        return tracesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(traces_);
      }
    }
    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public com.google.devtools.cloudtrace.v1.Trace.Builder addTracesBuilder() {
      return getTracesFieldBuilder().addBuilder(
          com.google.devtools.cloudtrace.v1.Trace.getDefaultInstance());
    }
    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public com.google.devtools.cloudtrace.v1.Trace.Builder addTracesBuilder(
        int index) {
      return getTracesFieldBuilder().addBuilder(
          index, com.google.devtools.cloudtrace.v1.Trace.getDefaultInstance());
    }
    /**
     * <pre>
     * List of trace records returned.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public java.util.List<com.google.devtools.cloudtrace.v1.Trace.Builder> 
         getTracesBuilderList() {
      return getTracesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.cloudtrace.v1.Trace, com.google.devtools.cloudtrace.v1.Trace.Builder, com.google.devtools.cloudtrace.v1.TraceOrBuilder> 
        getTracesFieldBuilder() {
      if (tracesBuilder_ == null) {
        tracesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.cloudtrace.v1.Trace, com.google.devtools.cloudtrace.v1.Trace.Builder, com.google.devtools.cloudtrace.v1.TraceOrBuilder>(
                traces_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        traces_ = null;
      }
      return tracesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * If defined, indicates that there are more traces that match the request
     * and that this value should be passed to the next request to continue
     * retrieving additional traces.
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
     * If defined, indicates that there are more traces that match the request
     * and that this value should be passed to the next request to continue
     * retrieving additional traces.
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
     * If defined, indicates that there are more traces that match the request
     * and that this value should be passed to the next request to continue
     * retrieving additional traces.
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
     * If defined, indicates that there are more traces that match the request
     * and that this value should be passed to the next request to continue
     * retrieving additional traces.
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
     * If defined, indicates that there are more traces that match the request
     * and that this value should be passed to the next request to continue
     * retrieving additional traces.
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


    // @@protoc_insertion_point(builder_scope:google.devtools.cloudtrace.v1.ListTracesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudtrace.v1.ListTracesResponse)
  private static final com.google.devtools.cloudtrace.v1.ListTracesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.cloudtrace.v1.ListTracesResponse();
  }

  public static com.google.devtools.cloudtrace.v1.ListTracesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTracesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListTracesResponse>() {
    public ListTracesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListTracesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListTracesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTracesResponse> getParserForType() {
    return PARSER;
  }

  public com.google.devtools.cloudtrace.v1.ListTracesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

