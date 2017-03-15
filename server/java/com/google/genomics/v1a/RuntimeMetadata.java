// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1alpha2/pipelines.proto

package com.google.genomics.v1a;

/**
 * <pre>
 * Runtime metadata that will be populated in the
 * [runtimeMetadata][google.genomics.v1.OperationMetadata.runtime_metadata]
 * field of the Operation associated with a RunPipeline execution.
 * </pre>
 *
 * Protobuf type {@code google.genomics.v1alpha2.RuntimeMetadata}
 */
public  final class RuntimeMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1alpha2.RuntimeMetadata)
    RuntimeMetadataOrBuilder {
  // Use RuntimeMetadata.newBuilder() to construct.
  private RuntimeMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RuntimeMetadata() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RuntimeMetadata(
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
            com.google.genomics.v1a.ComputeEngine.Builder subBuilder = null;
            if (computeEngine_ != null) {
              subBuilder = computeEngine_.toBuilder();
            }
            computeEngine_ = input.readMessage(com.google.genomics.v1a.ComputeEngine.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(computeEngine_);
              computeEngine_ = subBuilder.buildPartial();
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
    return com.google.genomics.v1a.PipelinesProto.internal_static_google_genomics_v1alpha2_RuntimeMetadata_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1a.PipelinesProto.internal_static_google_genomics_v1alpha2_RuntimeMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1a.RuntimeMetadata.class, com.google.genomics.v1a.RuntimeMetadata.Builder.class);
  }

  public static final int COMPUTE_ENGINE_FIELD_NUMBER = 1;
  private com.google.genomics.v1a.ComputeEngine computeEngine_;
  /**
   * <pre>
   * Execution information specific to Google Compute Engine.
   * </pre>
   *
   * <code>.google.genomics.v1alpha2.ComputeEngine compute_engine = 1;</code>
   */
  public boolean hasComputeEngine() {
    return computeEngine_ != null;
  }
  /**
   * <pre>
   * Execution information specific to Google Compute Engine.
   * </pre>
   *
   * <code>.google.genomics.v1alpha2.ComputeEngine compute_engine = 1;</code>
   */
  public com.google.genomics.v1a.ComputeEngine getComputeEngine() {
    return computeEngine_ == null ? com.google.genomics.v1a.ComputeEngine.getDefaultInstance() : computeEngine_;
  }
  /**
   * <pre>
   * Execution information specific to Google Compute Engine.
   * </pre>
   *
   * <code>.google.genomics.v1alpha2.ComputeEngine compute_engine = 1;</code>
   */
  public com.google.genomics.v1a.ComputeEngineOrBuilder getComputeEngineOrBuilder() {
    return getComputeEngine();
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
    if (computeEngine_ != null) {
      output.writeMessage(1, getComputeEngine());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (computeEngine_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getComputeEngine());
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
    if (!(obj instanceof com.google.genomics.v1a.RuntimeMetadata)) {
      return super.equals(obj);
    }
    com.google.genomics.v1a.RuntimeMetadata other = (com.google.genomics.v1a.RuntimeMetadata) obj;

    boolean result = true;
    result = result && (hasComputeEngine() == other.hasComputeEngine());
    if (hasComputeEngine()) {
      result = result && getComputeEngine()
          .equals(other.getComputeEngine());
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
    if (hasComputeEngine()) {
      hash = (37 * hash) + COMPUTE_ENGINE_FIELD_NUMBER;
      hash = (53 * hash) + getComputeEngine().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.genomics.v1a.RuntimeMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1a.RuntimeMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1a.RuntimeMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1a.RuntimeMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1a.RuntimeMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1a.RuntimeMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1a.RuntimeMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1a.RuntimeMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1a.RuntimeMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1a.RuntimeMetadata parseFrom(
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
  public static Builder newBuilder(com.google.genomics.v1a.RuntimeMetadata prototype) {
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
   * Runtime metadata that will be populated in the
   * [runtimeMetadata][google.genomics.v1.OperationMetadata.runtime_metadata]
   * field of the Operation associated with a RunPipeline execution.
   * </pre>
   *
   * Protobuf type {@code google.genomics.v1alpha2.RuntimeMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1alpha2.RuntimeMetadata)
      com.google.genomics.v1a.RuntimeMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1a.PipelinesProto.internal_static_google_genomics_v1alpha2_RuntimeMetadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1a.PipelinesProto.internal_static_google_genomics_v1alpha2_RuntimeMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1a.RuntimeMetadata.class, com.google.genomics.v1a.RuntimeMetadata.Builder.class);
    }

    // Construct using com.google.genomics.v1a.RuntimeMetadata.newBuilder()
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
      if (computeEngineBuilder_ == null) {
        computeEngine_ = null;
      } else {
        computeEngine_ = null;
        computeEngineBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1a.PipelinesProto.internal_static_google_genomics_v1alpha2_RuntimeMetadata_descriptor;
    }

    public com.google.genomics.v1a.RuntimeMetadata getDefaultInstanceForType() {
      return com.google.genomics.v1a.RuntimeMetadata.getDefaultInstance();
    }

    public com.google.genomics.v1a.RuntimeMetadata build() {
      com.google.genomics.v1a.RuntimeMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1a.RuntimeMetadata buildPartial() {
      com.google.genomics.v1a.RuntimeMetadata result = new com.google.genomics.v1a.RuntimeMetadata(this);
      if (computeEngineBuilder_ == null) {
        result.computeEngine_ = computeEngine_;
      } else {
        result.computeEngine_ = computeEngineBuilder_.build();
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
      if (other instanceof com.google.genomics.v1a.RuntimeMetadata) {
        return mergeFrom((com.google.genomics.v1a.RuntimeMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1a.RuntimeMetadata other) {
      if (other == com.google.genomics.v1a.RuntimeMetadata.getDefaultInstance()) return this;
      if (other.hasComputeEngine()) {
        mergeComputeEngine(other.getComputeEngine());
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
      com.google.genomics.v1a.RuntimeMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1a.RuntimeMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.genomics.v1a.ComputeEngine computeEngine_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.genomics.v1a.ComputeEngine, com.google.genomics.v1a.ComputeEngine.Builder, com.google.genomics.v1a.ComputeEngineOrBuilder> computeEngineBuilder_;
    /**
     * <pre>
     * Execution information specific to Google Compute Engine.
     * </pre>
     *
     * <code>.google.genomics.v1alpha2.ComputeEngine compute_engine = 1;</code>
     */
    public boolean hasComputeEngine() {
      return computeEngineBuilder_ != null || computeEngine_ != null;
    }
    /**
     * <pre>
     * Execution information specific to Google Compute Engine.
     * </pre>
     *
     * <code>.google.genomics.v1alpha2.ComputeEngine compute_engine = 1;</code>
     */
    public com.google.genomics.v1a.ComputeEngine getComputeEngine() {
      if (computeEngineBuilder_ == null) {
        return computeEngine_ == null ? com.google.genomics.v1a.ComputeEngine.getDefaultInstance() : computeEngine_;
      } else {
        return computeEngineBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Execution information specific to Google Compute Engine.
     * </pre>
     *
     * <code>.google.genomics.v1alpha2.ComputeEngine compute_engine = 1;</code>
     */
    public Builder setComputeEngine(com.google.genomics.v1a.ComputeEngine value) {
      if (computeEngineBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        computeEngine_ = value;
        onChanged();
      } else {
        computeEngineBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Execution information specific to Google Compute Engine.
     * </pre>
     *
     * <code>.google.genomics.v1alpha2.ComputeEngine compute_engine = 1;</code>
     */
    public Builder setComputeEngine(
        com.google.genomics.v1a.ComputeEngine.Builder builderForValue) {
      if (computeEngineBuilder_ == null) {
        computeEngine_ = builderForValue.build();
        onChanged();
      } else {
        computeEngineBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Execution information specific to Google Compute Engine.
     * </pre>
     *
     * <code>.google.genomics.v1alpha2.ComputeEngine compute_engine = 1;</code>
     */
    public Builder mergeComputeEngine(com.google.genomics.v1a.ComputeEngine value) {
      if (computeEngineBuilder_ == null) {
        if (computeEngine_ != null) {
          computeEngine_ =
            com.google.genomics.v1a.ComputeEngine.newBuilder(computeEngine_).mergeFrom(value).buildPartial();
        } else {
          computeEngine_ = value;
        }
        onChanged();
      } else {
        computeEngineBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Execution information specific to Google Compute Engine.
     * </pre>
     *
     * <code>.google.genomics.v1alpha2.ComputeEngine compute_engine = 1;</code>
     */
    public Builder clearComputeEngine() {
      if (computeEngineBuilder_ == null) {
        computeEngine_ = null;
        onChanged();
      } else {
        computeEngine_ = null;
        computeEngineBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Execution information specific to Google Compute Engine.
     * </pre>
     *
     * <code>.google.genomics.v1alpha2.ComputeEngine compute_engine = 1;</code>
     */
    public com.google.genomics.v1a.ComputeEngine.Builder getComputeEngineBuilder() {
      
      onChanged();
      return getComputeEngineFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Execution information specific to Google Compute Engine.
     * </pre>
     *
     * <code>.google.genomics.v1alpha2.ComputeEngine compute_engine = 1;</code>
     */
    public com.google.genomics.v1a.ComputeEngineOrBuilder getComputeEngineOrBuilder() {
      if (computeEngineBuilder_ != null) {
        return computeEngineBuilder_.getMessageOrBuilder();
      } else {
        return computeEngine_ == null ?
            com.google.genomics.v1a.ComputeEngine.getDefaultInstance() : computeEngine_;
      }
    }
    /**
     * <pre>
     * Execution information specific to Google Compute Engine.
     * </pre>
     *
     * <code>.google.genomics.v1alpha2.ComputeEngine compute_engine = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.genomics.v1a.ComputeEngine, com.google.genomics.v1a.ComputeEngine.Builder, com.google.genomics.v1a.ComputeEngineOrBuilder> 
        getComputeEngineFieldBuilder() {
      if (computeEngineBuilder_ == null) {
        computeEngineBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.genomics.v1a.ComputeEngine, com.google.genomics.v1a.ComputeEngine.Builder, com.google.genomics.v1a.ComputeEngineOrBuilder>(
                getComputeEngine(),
                getParentForChildren(),
                isClean());
        computeEngine_ = null;
      }
      return computeEngineBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.genomics.v1alpha2.RuntimeMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1alpha2.RuntimeMetadata)
  private static final com.google.genomics.v1a.RuntimeMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.genomics.v1a.RuntimeMetadata();
  }

  public static com.google.genomics.v1a.RuntimeMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RuntimeMetadata>
      PARSER = new com.google.protobuf.AbstractParser<RuntimeMetadata>() {
    public RuntimeMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RuntimeMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RuntimeMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RuntimeMetadata> getParserForType() {
    return PARSER;
  }

  public com.google.genomics.v1a.RuntimeMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

