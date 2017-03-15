// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/debugger.proto

package com.google.devtools.clouddebugger.v2;

/**
 * <pre>
 * Response for getting breakpoint information.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouddebugger.v2.GetBreakpointResponse}
 */
public  final class GetBreakpointResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouddebugger.v2.GetBreakpointResponse)
    GetBreakpointResponseOrBuilder {
  // Use GetBreakpointResponse.newBuilder() to construct.
  private GetBreakpointResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBreakpointResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetBreakpointResponse(
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
            com.google.devtools.clouddebugger.v2.Breakpoint.Builder subBuilder = null;
            if (breakpoint_ != null) {
              subBuilder = breakpoint_.toBuilder();
            }
            breakpoint_ = input.readMessage(com.google.devtools.clouddebugger.v2.Breakpoint.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(breakpoint_);
              breakpoint_ = subBuilder.buildPartial();
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
    return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_GetBreakpointResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_GetBreakpointResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouddebugger.v2.GetBreakpointResponse.class, com.google.devtools.clouddebugger.v2.GetBreakpointResponse.Builder.class);
  }

  public static final int BREAKPOINT_FIELD_NUMBER = 1;
  private com.google.devtools.clouddebugger.v2.Breakpoint breakpoint_;
  /**
   * <pre>
   * Complete breakpoint state.
   * The fields `id` and `location` are guaranteed to be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
   */
  public boolean hasBreakpoint() {
    return breakpoint_ != null;
  }
  /**
   * <pre>
   * Complete breakpoint state.
   * The fields `id` and `location` are guaranteed to be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
   */
  public com.google.devtools.clouddebugger.v2.Breakpoint getBreakpoint() {
    return breakpoint_ == null ? com.google.devtools.clouddebugger.v2.Breakpoint.getDefaultInstance() : breakpoint_;
  }
  /**
   * <pre>
   * Complete breakpoint state.
   * The fields `id` and `location` are guaranteed to be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
   */
  public com.google.devtools.clouddebugger.v2.BreakpointOrBuilder getBreakpointOrBuilder() {
    return getBreakpoint();
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
    if (breakpoint_ != null) {
      output.writeMessage(1, getBreakpoint());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (breakpoint_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBreakpoint());
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
    if (!(obj instanceof com.google.devtools.clouddebugger.v2.GetBreakpointResponse)) {
      return super.equals(obj);
    }
    com.google.devtools.clouddebugger.v2.GetBreakpointResponse other = (com.google.devtools.clouddebugger.v2.GetBreakpointResponse) obj;

    boolean result = true;
    result = result && (hasBreakpoint() == other.hasBreakpoint());
    if (hasBreakpoint()) {
      result = result && getBreakpoint()
          .equals(other.getBreakpoint());
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
    if (hasBreakpoint()) {
      hash = (37 * hash) + BREAKPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getBreakpoint().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(
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
  public static Builder newBuilder(com.google.devtools.clouddebugger.v2.GetBreakpointResponse prototype) {
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
   * Response for getting breakpoint information.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouddebugger.v2.GetBreakpointResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouddebugger.v2.GetBreakpointResponse)
      com.google.devtools.clouddebugger.v2.GetBreakpointResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_GetBreakpointResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_GetBreakpointResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouddebugger.v2.GetBreakpointResponse.class, com.google.devtools.clouddebugger.v2.GetBreakpointResponse.Builder.class);
    }

    // Construct using com.google.devtools.clouddebugger.v2.GetBreakpointResponse.newBuilder()
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
      if (breakpointBuilder_ == null) {
        breakpoint_ = null;
      } else {
        breakpoint_ = null;
        breakpointBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_GetBreakpointResponse_descriptor;
    }

    public com.google.devtools.clouddebugger.v2.GetBreakpointResponse getDefaultInstanceForType() {
      return com.google.devtools.clouddebugger.v2.GetBreakpointResponse.getDefaultInstance();
    }

    public com.google.devtools.clouddebugger.v2.GetBreakpointResponse build() {
      com.google.devtools.clouddebugger.v2.GetBreakpointResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.devtools.clouddebugger.v2.GetBreakpointResponse buildPartial() {
      com.google.devtools.clouddebugger.v2.GetBreakpointResponse result = new com.google.devtools.clouddebugger.v2.GetBreakpointResponse(this);
      if (breakpointBuilder_ == null) {
        result.breakpoint_ = breakpoint_;
      } else {
        result.breakpoint_ = breakpointBuilder_.build();
      }
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
      if (other instanceof com.google.devtools.clouddebugger.v2.GetBreakpointResponse) {
        return mergeFrom((com.google.devtools.clouddebugger.v2.GetBreakpointResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouddebugger.v2.GetBreakpointResponse other) {
      if (other == com.google.devtools.clouddebugger.v2.GetBreakpointResponse.getDefaultInstance()) return this;
      if (other.hasBreakpoint()) {
        mergeBreakpoint(other.getBreakpoint());
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
      com.google.devtools.clouddebugger.v2.GetBreakpointResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.clouddebugger.v2.GetBreakpointResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.devtools.clouddebugger.v2.Breakpoint breakpoint_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.clouddebugger.v2.Breakpoint, com.google.devtools.clouddebugger.v2.Breakpoint.Builder, com.google.devtools.clouddebugger.v2.BreakpointOrBuilder> breakpointBuilder_;
    /**
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     */
    public boolean hasBreakpoint() {
      return breakpointBuilder_ != null || breakpoint_ != null;
    }
    /**
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     */
    public com.google.devtools.clouddebugger.v2.Breakpoint getBreakpoint() {
      if (breakpointBuilder_ == null) {
        return breakpoint_ == null ? com.google.devtools.clouddebugger.v2.Breakpoint.getDefaultInstance() : breakpoint_;
      } else {
        return breakpointBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     */
    public Builder setBreakpoint(com.google.devtools.clouddebugger.v2.Breakpoint value) {
      if (breakpointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        breakpoint_ = value;
        onChanged();
      } else {
        breakpointBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     */
    public Builder setBreakpoint(
        com.google.devtools.clouddebugger.v2.Breakpoint.Builder builderForValue) {
      if (breakpointBuilder_ == null) {
        breakpoint_ = builderForValue.build();
        onChanged();
      } else {
        breakpointBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     */
    public Builder mergeBreakpoint(com.google.devtools.clouddebugger.v2.Breakpoint value) {
      if (breakpointBuilder_ == null) {
        if (breakpoint_ != null) {
          breakpoint_ =
            com.google.devtools.clouddebugger.v2.Breakpoint.newBuilder(breakpoint_).mergeFrom(value).buildPartial();
        } else {
          breakpoint_ = value;
        }
        onChanged();
      } else {
        breakpointBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     */
    public Builder clearBreakpoint() {
      if (breakpointBuilder_ == null) {
        breakpoint_ = null;
        onChanged();
      } else {
        breakpoint_ = null;
        breakpointBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     */
    public com.google.devtools.clouddebugger.v2.Breakpoint.Builder getBreakpointBuilder() {
      
      onChanged();
      return getBreakpointFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     */
    public com.google.devtools.clouddebugger.v2.BreakpointOrBuilder getBreakpointOrBuilder() {
      if (breakpointBuilder_ != null) {
        return breakpointBuilder_.getMessageOrBuilder();
      } else {
        return breakpoint_ == null ?
            com.google.devtools.clouddebugger.v2.Breakpoint.getDefaultInstance() : breakpoint_;
      }
    }
    /**
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.clouddebugger.v2.Breakpoint, com.google.devtools.clouddebugger.v2.Breakpoint.Builder, com.google.devtools.clouddebugger.v2.BreakpointOrBuilder> 
        getBreakpointFieldBuilder() {
      if (breakpointBuilder_ == null) {
        breakpointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.clouddebugger.v2.Breakpoint, com.google.devtools.clouddebugger.v2.Breakpoint.Builder, com.google.devtools.clouddebugger.v2.BreakpointOrBuilder>(
                getBreakpoint(),
                getParentForChildren(),
                isClean());
        breakpoint_ = null;
      }
      return breakpointBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.devtools.clouddebugger.v2.GetBreakpointResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouddebugger.v2.GetBreakpointResponse)
  private static final com.google.devtools.clouddebugger.v2.GetBreakpointResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouddebugger.v2.GetBreakpointResponse();
  }

  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBreakpointResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetBreakpointResponse>() {
    public GetBreakpointResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetBreakpointResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetBreakpointResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBreakpointResponse> getParserForType() {
    return PARSER;
  }

  public com.google.devtools.clouddebugger.v2.GetBreakpointResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

