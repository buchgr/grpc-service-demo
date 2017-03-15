// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/debugger.proto

package com.google.devtools.clouddebugger.v2;

/**
 * <pre>
 * Request to delete a breakpoint.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouddebugger.v2.DeleteBreakpointRequest}
 */
public  final class DeleteBreakpointRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouddebugger.v2.DeleteBreakpointRequest)
    DeleteBreakpointRequestOrBuilder {
  // Use DeleteBreakpointRequest.newBuilder() to construct.
  private DeleteBreakpointRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteBreakpointRequest() {
    debuggeeId_ = "";
    breakpointId_ = "";
    clientVersion_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DeleteBreakpointRequest(
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

            breakpointId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            clientVersion_ = s;
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
    return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_DeleteBreakpointRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_DeleteBreakpointRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest.class, com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest.Builder.class);
  }

  public static final int DEBUGGEE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object debuggeeId_;
  /**
   * <pre>
   * ID of the debuggee whose breakpoint to delete.
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
   * ID of the debuggee whose breakpoint to delete.
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

  public static final int BREAKPOINT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object breakpointId_;
  /**
   * <pre>
   * ID of the breakpoint to delete.
   * </pre>
   *
   * <code>string breakpoint_id = 2;</code>
   */
  public java.lang.String getBreakpointId() {
    java.lang.Object ref = breakpointId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      breakpointId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ID of the breakpoint to delete.
   * </pre>
   *
   * <code>string breakpoint_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getBreakpointIdBytes() {
    java.lang.Object ref = breakpointId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      breakpointId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENT_VERSION_FIELD_NUMBER = 3;
  private volatile java.lang.Object clientVersion_;
  /**
   * <pre>
   * The client version making the call.
   * Following: `domain/type/version` (e.g., `google.com/intellij/v1`).
   * </pre>
   *
   * <code>string client_version = 3;</code>
   */
  public java.lang.String getClientVersion() {
    java.lang.Object ref = clientVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The client version making the call.
   * Following: `domain/type/version` (e.g., `google.com/intellij/v1`).
   * </pre>
   *
   * <code>string client_version = 3;</code>
   */
  public com.google.protobuf.ByteString
      getClientVersionBytes() {
    java.lang.Object ref = clientVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientVersion_ = b;
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
    if (!getDebuggeeIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, debuggeeId_);
    }
    if (!getBreakpointIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, breakpointId_);
    }
    if (!getClientVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, clientVersion_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDebuggeeIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, debuggeeId_);
    }
    if (!getBreakpointIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, breakpointId_);
    }
    if (!getClientVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, clientVersion_);
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
    if (!(obj instanceof com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest other = (com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest) obj;

    boolean result = true;
    result = result && getDebuggeeId()
        .equals(other.getDebuggeeId());
    result = result && getBreakpointId()
        .equals(other.getBreakpointId());
    result = result && getClientVersion()
        .equals(other.getClientVersion());
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
    hash = (37 * hash) + BREAKPOINT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBreakpointId().hashCode();
    hash = (37 * hash) + CLIENT_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getClientVersion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest prototype) {
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
   * Request to delete a breakpoint.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouddebugger.v2.DeleteBreakpointRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouddebugger.v2.DeleteBreakpointRequest)
      com.google.devtools.clouddebugger.v2.DeleteBreakpointRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_DeleteBreakpointRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_DeleteBreakpointRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest.class, com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest.Builder.class);
    }

    // Construct using com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest.newBuilder()
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

      breakpointId_ = "";

      clientVersion_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto.internal_static_google_devtools_clouddebugger_v2_DeleteBreakpointRequest_descriptor;
    }

    public com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest getDefaultInstanceForType() {
      return com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest.getDefaultInstance();
    }

    public com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest build() {
      com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest buildPartial() {
      com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest result = new com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest(this);
      result.debuggeeId_ = debuggeeId_;
      result.breakpointId_ = breakpointId_;
      result.clientVersion_ = clientVersion_;
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
      if (other instanceof com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest) {
        return mergeFrom((com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest other) {
      if (other == com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest.getDefaultInstance()) return this;
      if (!other.getDebuggeeId().isEmpty()) {
        debuggeeId_ = other.debuggeeId_;
        onChanged();
      }
      if (!other.getBreakpointId().isEmpty()) {
        breakpointId_ = other.breakpointId_;
        onChanged();
      }
      if (!other.getClientVersion().isEmpty()) {
        clientVersion_ = other.clientVersion_;
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
      com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest) e.getUnfinishedMessage();
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
     * ID of the debuggee whose breakpoint to delete.
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
     * ID of the debuggee whose breakpoint to delete.
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
     * ID of the debuggee whose breakpoint to delete.
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
     * ID of the debuggee whose breakpoint to delete.
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
     * ID of the debuggee whose breakpoint to delete.
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

    private java.lang.Object breakpointId_ = "";
    /**
     * <pre>
     * ID of the breakpoint to delete.
     * </pre>
     *
     * <code>string breakpoint_id = 2;</code>
     */
    public java.lang.String getBreakpointId() {
      java.lang.Object ref = breakpointId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        breakpointId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * ID of the breakpoint to delete.
     * </pre>
     *
     * <code>string breakpoint_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBreakpointIdBytes() {
      java.lang.Object ref = breakpointId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        breakpointId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ID of the breakpoint to delete.
     * </pre>
     *
     * <code>string breakpoint_id = 2;</code>
     */
    public Builder setBreakpointId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      breakpointId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the breakpoint to delete.
     * </pre>
     *
     * <code>string breakpoint_id = 2;</code>
     */
    public Builder clearBreakpointId() {
      
      breakpointId_ = getDefaultInstance().getBreakpointId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the breakpoint to delete.
     * </pre>
     *
     * <code>string breakpoint_id = 2;</code>
     */
    public Builder setBreakpointIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      breakpointId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object clientVersion_ = "";
    /**
     * <pre>
     * The client version making the call.
     * Following: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 3;</code>
     */
    public java.lang.String getClientVersion() {
      java.lang.Object ref = clientVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The client version making the call.
     * Following: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 3;</code>
     */
    public com.google.protobuf.ByteString
        getClientVersionBytes() {
      java.lang.Object ref = clientVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The client version making the call.
     * Following: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 3;</code>
     */
    public Builder setClientVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clientVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The client version making the call.
     * Following: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 3;</code>
     */
    public Builder clearClientVersion() {
      
      clientVersion_ = getDefaultInstance().getClientVersion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The client version making the call.
     * Following: `domain/type/version` (e.g., `google.com/intellij/v1`).
     * </pre>
     *
     * <code>string client_version = 3;</code>
     */
    public Builder setClientVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clientVersion_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.clouddebugger.v2.DeleteBreakpointRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouddebugger.v2.DeleteBreakpointRequest)
  private static final com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest();
  }

  public static com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteBreakpointRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteBreakpointRequest>() {
    public DeleteBreakpointRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeleteBreakpointRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteBreakpointRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteBreakpointRequest> getParserForType() {
    return PARSER;
  }

  public com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

