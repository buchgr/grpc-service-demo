// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

/**
 * Protobuf type {@code google.genomics.v1.GetCallSetRequest}
 */
public  final class GetCallSetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.GetCallSetRequest)
    GetCallSetRequestOrBuilder {
  // Use GetCallSetRequest.newBuilder() to construct.
  private GetCallSetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCallSetRequest() {
    callSetId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetCallSetRequest(
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

            callSetId_ = s;
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
    return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_GetCallSetRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_GetCallSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.GetCallSetRequest.class, com.google.genomics.v1.GetCallSetRequest.Builder.class);
  }

  public static final int CALL_SET_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object callSetId_;
  /**
   * <pre>
   * The ID of the call set.
   * </pre>
   *
   * <code>string call_set_id = 1;</code>
   */
  public java.lang.String getCallSetId() {
    java.lang.Object ref = callSetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      callSetId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the call set.
   * </pre>
   *
   * <code>string call_set_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCallSetIdBytes() {
    java.lang.Object ref = callSetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      callSetId_ = b;
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
    if (!getCallSetIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, callSetId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCallSetIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, callSetId_);
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
    if (!(obj instanceof com.google.genomics.v1.GetCallSetRequest)) {
      return super.equals(obj);
    }
    com.google.genomics.v1.GetCallSetRequest other = (com.google.genomics.v1.GetCallSetRequest) obj;

    boolean result = true;
    result = result && getCallSetId()
        .equals(other.getCallSetId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CALL_SET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCallSetId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.genomics.v1.GetCallSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.GetCallSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.GetCallSetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.GetCallSetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.GetCallSetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.GetCallSetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1.GetCallSetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.GetCallSetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1.GetCallSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.GetCallSetRequest parseFrom(
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
  public static Builder newBuilder(com.google.genomics.v1.GetCallSetRequest prototype) {
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
   * Protobuf type {@code google.genomics.v1.GetCallSetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.GetCallSetRequest)
      com.google.genomics.v1.GetCallSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_GetCallSetRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_GetCallSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.GetCallSetRequest.class, com.google.genomics.v1.GetCallSetRequest.Builder.class);
    }

    // Construct using com.google.genomics.v1.GetCallSetRequest.newBuilder()
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
      callSetId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_GetCallSetRequest_descriptor;
    }

    public com.google.genomics.v1.GetCallSetRequest getDefaultInstanceForType() {
      return com.google.genomics.v1.GetCallSetRequest.getDefaultInstance();
    }

    public com.google.genomics.v1.GetCallSetRequest build() {
      com.google.genomics.v1.GetCallSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.GetCallSetRequest buildPartial() {
      com.google.genomics.v1.GetCallSetRequest result = new com.google.genomics.v1.GetCallSetRequest(this);
      result.callSetId_ = callSetId_;
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
      if (other instanceof com.google.genomics.v1.GetCallSetRequest) {
        return mergeFrom((com.google.genomics.v1.GetCallSetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.GetCallSetRequest other) {
      if (other == com.google.genomics.v1.GetCallSetRequest.getDefaultInstance()) return this;
      if (!other.getCallSetId().isEmpty()) {
        callSetId_ = other.callSetId_;
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
      com.google.genomics.v1.GetCallSetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.GetCallSetRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object callSetId_ = "";
    /**
     * <pre>
     * The ID of the call set.
     * </pre>
     *
     * <code>string call_set_id = 1;</code>
     */
    public java.lang.String getCallSetId() {
      java.lang.Object ref = callSetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        callSetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the call set.
     * </pre>
     *
     * <code>string call_set_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCallSetIdBytes() {
      java.lang.Object ref = callSetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        callSetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the call set.
     * </pre>
     *
     * <code>string call_set_id = 1;</code>
     */
    public Builder setCallSetId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      callSetId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the call set.
     * </pre>
     *
     * <code>string call_set_id = 1;</code>
     */
    public Builder clearCallSetId() {
      
      callSetId_ = getDefaultInstance().getCallSetId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the call set.
     * </pre>
     *
     * <code>string call_set_id = 1;</code>
     */
    public Builder setCallSetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      callSetId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.GetCallSetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.GetCallSetRequest)
  private static final com.google.genomics.v1.GetCallSetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.genomics.v1.GetCallSetRequest();
  }

  public static com.google.genomics.v1.GetCallSetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCallSetRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetCallSetRequest>() {
    public GetCallSetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetCallSetRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetCallSetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCallSetRequest> getParserForType() {
    return PARSER;
  }

  public com.google.genomics.v1.GetCallSetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

