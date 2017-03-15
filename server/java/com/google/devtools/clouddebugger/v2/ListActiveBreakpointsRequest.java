// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/controller.proto

package com.google.devtools.clouddebugger.v2;

/**
 * <pre>
 * Request to list active breakpoints.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest}
 */
public  final class ListActiveBreakpointsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest)
    ListActiveBreakpointsRequestOrBuilder {
  // Use ListActiveBreakpointsRequest.newBuilder() to construct.
  private ListActiveBreakpointsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListActiveBreakpointsRequest() {
    debuggeeId_ = "";
    waitToken_ = "";
    successOnTimeout_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListActiveBreakpointsRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            debuggeeId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            waitToken_ = s;
            break;
          }
          case 24: {

            successOnTimeout_ = input.readBool();
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
    return com.google.devtools.clouddebugger.v2.ControllerProto.internal_static_google_devtools_clouddebugger_v2_ListActiveBreakpointsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouddebugger.v2.ControllerProto.internal_static_google_devtools_clouddebugger_v2_ListActiveBreakpointsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest.class, com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest.Builder.class);
  }

  public static final int DEBUGGEE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object debuggeeId_;
  /**
   * <pre>
   * Identifies the debuggee.
   * </pre>
   *
   * <code>string debuggee_id = 1;</code>
   */
  public java.lang.String getDebuggeeId() {
    java.lang.Object ref = debuggeeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      debuggeeId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Identifies the debuggee.
   * </pre>
   *
   * <code>string debuggee_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDebuggeeIdBytes() {
    java.lang.Object ref = debuggeeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      debuggeeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WAIT_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object waitToken_;
  /**
   * <pre>
   * A wait token that, if specified, blocks the method call until the list
   * of active breakpoints has changed, or a server selected timeout has
   * expired.  The value should be set from the last returned response.
   * </pre>
   *
   * <code>string wait_token = 2;</code>
   */
  public java.lang.String getWaitToken() {
    java.lang.Object ref = waitToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      waitToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A wait token that, if specified, blocks the method call until the list
   * of active breakpoints has changed, or a server selected timeout has
   * expired.  The value should be set from the last returned response.
   * </pre>
   *
   * <code>string wait_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getWaitTokenBytes() {
    java.lang.Object ref = waitToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      waitToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUCCESS_ON_TIMEOUT_FIELD_NUMBER = 3;
  private boolean successOnTimeout_;
  /**
   * <pre>
   * If set to `true`, returns `google.rpc.Code.OK` status and sets the
   * `wait_expired` response field to `true` when the server-selected timeout
   * has expired (recommended).
   * If set to `false`, returns `google.rpc.Code.ABORTED` status when the
   * server-selected timeout has expired (deprecated).
   * </pre>
   *
   * <code>bool success_on_timeout = 3;</code>
   */
  public boolean getSuccessOnTimeout() {
    return successOnTimeout_;
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
    if (!getDebuggeeIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, debuggeeId_);
    }
    if (!getWaitTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, waitToken_);
    }
    if (successOnTimeout_ != false) {
      output.writeBool(3, successOnTimeout_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDebuggeeIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, debuggeeId_);
    }
    if (!getWaitTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, waitToken_);
    }
    if (successOnTimeout_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, successOnTimeout_);
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
    if (!(obj instanceof com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest other = (com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest) obj;

    boolean result = true;
    result = result && getDebuggeeId()
        .equals(other.getDebuggeeId());
    result = result && getWaitToken()
        .equals(other.getWaitToken());
    result = result && (getSuccessOnTimeout()
        == other.getSuccessOnTimeout());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DEBUGGEE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDebuggeeId().hashCode();
    hash = (37 * hash) + WAIT_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getWaitToken().hashCode();
    hash = (37 * hash) + SUCCESS_ON_TIMEOUT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccessOnTimeout());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest prototype) {
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
   * Request to list active breakpoints.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest)
      com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.clouddebugger.v2.ControllerProto.internal_static_google_devtools_clouddebugger_v2_ListActiveBreakpointsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouddebugger.v2.ControllerProto.internal_static_google_devtools_clouddebugger_v2_ListActiveBreakpointsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest.class, com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest.Builder.class);
    }

    // Construct using com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest.newBuilder()
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
      debuggeeId_ = "";

      waitToken_ = "";

      successOnTimeout_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.clouddebugger.v2.ControllerProto.internal_static_google_devtools_clouddebugger_v2_ListActiveBreakpointsRequest_descriptor;
    }

    public com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest getDefaultInstanceForType() {
      return com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest.getDefaultInstance();
    }

    public com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest build() {
      com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest buildPartial() {
      com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest result = new com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest(this);
      result.debuggeeId_ = debuggeeId_;
      result.waitToken_ = waitToken_;
      result.successOnTimeout_ = successOnTimeout_;
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
      if (other instanceof com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest) {
        return mergeFrom((com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest other) {
      if (other == com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest.getDefaultInstance()) return this;
      if (!other.getDebuggeeId().isEmpty()) {
        debuggeeId_ = other.debuggeeId_;
        onChanged();
      }
      if (!other.getWaitToken().isEmpty()) {
        waitToken_ = other.waitToken_;
        onChanged();
      }
      if (other.getSuccessOnTimeout() != false) {
        setSuccessOnTimeout(other.getSuccessOnTimeout());
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
      com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object debuggeeId_ = "";
    /**
     * <pre>
     * Identifies the debuggee.
     * </pre>
     *
     * <code>string debuggee_id = 1;</code>
     */
    public java.lang.String getDebuggeeId() {
      java.lang.Object ref = debuggeeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        debuggeeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Identifies the debuggee.
     * </pre>
     *
     * <code>string debuggee_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDebuggeeIdBytes() {
      java.lang.Object ref = debuggeeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        debuggeeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Identifies the debuggee.
     * </pre>
     *
     * <code>string debuggee_id = 1;</code>
     */
    public Builder setDebuggeeId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      debuggeeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Identifies the debuggee.
     * </pre>
     *
     * <code>string debuggee_id = 1;</code>
     */
    public Builder clearDebuggeeId() {
      
      debuggeeId_ = getDefaultInstance().getDebuggeeId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Identifies the debuggee.
     * </pre>
     *
     * <code>string debuggee_id = 1;</code>
     */
    public Builder setDebuggeeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      debuggeeId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object waitToken_ = "";
    /**
     * <pre>
     * A wait token that, if specified, blocks the method call until the list
     * of active breakpoints has changed, or a server selected timeout has
     * expired.  The value should be set from the last returned response.
     * </pre>
     *
     * <code>string wait_token = 2;</code>
     */
    public java.lang.String getWaitToken() {
      java.lang.Object ref = waitToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        waitToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A wait token that, if specified, blocks the method call until the list
     * of active breakpoints has changed, or a server selected timeout has
     * expired.  The value should be set from the last returned response.
     * </pre>
     *
     * <code>string wait_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getWaitTokenBytes() {
      java.lang.Object ref = waitToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        waitToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A wait token that, if specified, blocks the method call until the list
     * of active breakpoints has changed, or a server selected timeout has
     * expired.  The value should be set from the last returned response.
     * </pre>
     *
     * <code>string wait_token = 2;</code>
     */
    public Builder setWaitToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      waitToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A wait token that, if specified, blocks the method call until the list
     * of active breakpoints has changed, or a server selected timeout has
     * expired.  The value should be set from the last returned response.
     * </pre>
     *
     * <code>string wait_token = 2;</code>
     */
    public Builder clearWaitToken() {
      
      waitToken_ = getDefaultInstance().getWaitToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A wait token that, if specified, blocks the method call until the list
     * of active breakpoints has changed, or a server selected timeout has
     * expired.  The value should be set from the last returned response.
     * </pre>
     *
     * <code>string wait_token = 2;</code>
     */
    public Builder setWaitTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      waitToken_ = value;
      onChanged();
      return this;
    }

    private boolean successOnTimeout_ ;
    /**
     * <pre>
     * If set to `true`, returns `google.rpc.Code.OK` status and sets the
     * `wait_expired` response field to `true` when the server-selected timeout
     * has expired (recommended).
     * If set to `false`, returns `google.rpc.Code.ABORTED` status when the
     * server-selected timeout has expired (deprecated).
     * </pre>
     *
     * <code>bool success_on_timeout = 3;</code>
     */
    public boolean getSuccessOnTimeout() {
      return successOnTimeout_;
    }
    /**
     * <pre>
     * If set to `true`, returns `google.rpc.Code.OK` status and sets the
     * `wait_expired` response field to `true` when the server-selected timeout
     * has expired (recommended).
     * If set to `false`, returns `google.rpc.Code.ABORTED` status when the
     * server-selected timeout has expired (deprecated).
     * </pre>
     *
     * <code>bool success_on_timeout = 3;</code>
     */
    public Builder setSuccessOnTimeout(boolean value) {
      
      successOnTimeout_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set to `true`, returns `google.rpc.Code.OK` status and sets the
     * `wait_expired` response field to `true` when the server-selected timeout
     * has expired (recommended).
     * If set to `false`, returns `google.rpc.Code.ABORTED` status when the
     * server-selected timeout has expired (deprecated).
     * </pre>
     *
     * <code>bool success_on_timeout = 3;</code>
     */
    public Builder clearSuccessOnTimeout() {
      
      successOnTimeout_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest)
  private static final com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest();
  }

  public static com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListActiveBreakpointsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListActiveBreakpointsRequest>() {
    public ListActiveBreakpointsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListActiveBreakpointsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListActiveBreakpointsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListActiveBreakpointsRequest> getParserForType() {
    return PARSER;
  }

  public com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

