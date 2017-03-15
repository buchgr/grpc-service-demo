// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1alpha2/pipelines.proto

package com.google.genomics.v1a;

/**
 * <pre>
 * The request to delete a saved pipeline by ID.
 * </pre>
 *
 * Protobuf type {@code google.genomics.v1alpha2.DeletePipelineRequest}
 */
public  final class DeletePipelineRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1alpha2.DeletePipelineRequest)
    DeletePipelineRequestOrBuilder {
  // Use DeletePipelineRequest.newBuilder() to construct.
  private DeletePipelineRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeletePipelineRequest() {
    pipelineId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DeletePipelineRequest(
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

            pipelineId_ = s;
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
    return com.google.genomics.v1a.PipelinesProto.internal_static_google_genomics_v1alpha2_DeletePipelineRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1a.PipelinesProto.internal_static_google_genomics_v1alpha2_DeletePipelineRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1a.DeletePipelineRequest.class, com.google.genomics.v1a.DeletePipelineRequest.Builder.class);
  }

  public static final int PIPELINE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object pipelineId_;
  /**
   * <pre>
   * Caller must have WRITE access to the project in which this pipeline
   * is defined.
   * </pre>
   *
   * <code>string pipeline_id = 1;</code>
   */
  public java.lang.String getPipelineId() {
    java.lang.Object ref = pipelineId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pipelineId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Caller must have WRITE access to the project in which this pipeline
   * is defined.
   * </pre>
   *
   * <code>string pipeline_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPipelineIdBytes() {
    java.lang.Object ref = pipelineId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pipelineId_ = b;
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
    if (!getPipelineIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pipelineId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPipelineIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pipelineId_);
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
    if (!(obj instanceof com.google.genomics.v1a.DeletePipelineRequest)) {
      return super.equals(obj);
    }
    com.google.genomics.v1a.DeletePipelineRequest other = (com.google.genomics.v1a.DeletePipelineRequest) obj;

    boolean result = true;
    result = result && getPipelineId()
        .equals(other.getPipelineId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PIPELINE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPipelineId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.genomics.v1a.DeletePipelineRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1a.DeletePipelineRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1a.DeletePipelineRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1a.DeletePipelineRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1a.DeletePipelineRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1a.DeletePipelineRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1a.DeletePipelineRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1a.DeletePipelineRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1a.DeletePipelineRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1a.DeletePipelineRequest parseFrom(
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
  public static Builder newBuilder(com.google.genomics.v1a.DeletePipelineRequest prototype) {
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
   * The request to delete a saved pipeline by ID.
   * </pre>
   *
   * Protobuf type {@code google.genomics.v1alpha2.DeletePipelineRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1alpha2.DeletePipelineRequest)
      com.google.genomics.v1a.DeletePipelineRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1a.PipelinesProto.internal_static_google_genomics_v1alpha2_DeletePipelineRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1a.PipelinesProto.internal_static_google_genomics_v1alpha2_DeletePipelineRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1a.DeletePipelineRequest.class, com.google.genomics.v1a.DeletePipelineRequest.Builder.class);
    }

    // Construct using com.google.genomics.v1a.DeletePipelineRequest.newBuilder()
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
      pipelineId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1a.PipelinesProto.internal_static_google_genomics_v1alpha2_DeletePipelineRequest_descriptor;
    }

    public com.google.genomics.v1a.DeletePipelineRequest getDefaultInstanceForType() {
      return com.google.genomics.v1a.DeletePipelineRequest.getDefaultInstance();
    }

    public com.google.genomics.v1a.DeletePipelineRequest build() {
      com.google.genomics.v1a.DeletePipelineRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1a.DeletePipelineRequest buildPartial() {
      com.google.genomics.v1a.DeletePipelineRequest result = new com.google.genomics.v1a.DeletePipelineRequest(this);
      result.pipelineId_ = pipelineId_;
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
      if (other instanceof com.google.genomics.v1a.DeletePipelineRequest) {
        return mergeFrom((com.google.genomics.v1a.DeletePipelineRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1a.DeletePipelineRequest other) {
      if (other == com.google.genomics.v1a.DeletePipelineRequest.getDefaultInstance()) return this;
      if (!other.getPipelineId().isEmpty()) {
        pipelineId_ = other.pipelineId_;
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
      com.google.genomics.v1a.DeletePipelineRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1a.DeletePipelineRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pipelineId_ = "";
    /**
     * <pre>
     * Caller must have WRITE access to the project in which this pipeline
     * is defined.
     * </pre>
     *
     * <code>string pipeline_id = 1;</code>
     */
    public java.lang.String getPipelineId() {
      java.lang.Object ref = pipelineId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pipelineId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Caller must have WRITE access to the project in which this pipeline
     * is defined.
     * </pre>
     *
     * <code>string pipeline_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPipelineIdBytes() {
      java.lang.Object ref = pipelineId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pipelineId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Caller must have WRITE access to the project in which this pipeline
     * is defined.
     * </pre>
     *
     * <code>string pipeline_id = 1;</code>
     */
    public Builder setPipelineId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pipelineId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Caller must have WRITE access to the project in which this pipeline
     * is defined.
     * </pre>
     *
     * <code>string pipeline_id = 1;</code>
     */
    public Builder clearPipelineId() {
      
      pipelineId_ = getDefaultInstance().getPipelineId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Caller must have WRITE access to the project in which this pipeline
     * is defined.
     * </pre>
     *
     * <code>string pipeline_id = 1;</code>
     */
    public Builder setPipelineIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pipelineId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.genomics.v1alpha2.DeletePipelineRequest)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1alpha2.DeletePipelineRequest)
  private static final com.google.genomics.v1a.DeletePipelineRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.genomics.v1a.DeletePipelineRequest();
  }

  public static com.google.genomics.v1a.DeletePipelineRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeletePipelineRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeletePipelineRequest>() {
    public DeletePipelineRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeletePipelineRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeletePipelineRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeletePipelineRequest> getParserForType() {
    return PARSER;
  }

  public com.google.genomics.v1a.DeletePipelineRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

