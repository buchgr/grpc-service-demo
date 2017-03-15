// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/ml/v1/model_service.proto

package com.google.cloud.ml.api.v1;

/**
 * <pre>
 * Options for manually scaling a model.
 * </pre>
 *
 * Protobuf type {@code google.cloud.ml.v1.ManualScaling}
 */
public  final class ManualScaling extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.ml.v1.ManualScaling)
    ManualScalingOrBuilder {
  // Use ManualScaling.newBuilder() to construct.
  private ManualScaling(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ManualScaling() {
    nodes_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ManualScaling(
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
          case 8: {

            nodes_ = input.readInt32();
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
    return com.google.cloud.ml.api.v1.ModelServiceProto.internal_static_google_cloud_ml_v1_ManualScaling_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.ml.api.v1.ModelServiceProto.internal_static_google_cloud_ml_v1_ManualScaling_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.ml.api.v1.ManualScaling.class, com.google.cloud.ml.api.v1.ManualScaling.Builder.class);
  }

  public static final int NODES_FIELD_NUMBER = 1;
  private int nodes_;
  /**
   * <pre>
   * The number of nodes to allocate for this model. These nodes are always up,
   * starting from the time the model is deployed, so the cost of operating
   * this model will be proportional to nodes * number of hours since
   * deployment.
   * </pre>
   *
   * <code>int32 nodes = 1;</code>
   */
  public int getNodes() {
    return nodes_;
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
    if (nodes_ != 0) {
      output.writeInt32(1, nodes_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nodes_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, nodes_);
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
    if (!(obj instanceof com.google.cloud.ml.api.v1.ManualScaling)) {
      return super.equals(obj);
    }
    com.google.cloud.ml.api.v1.ManualScaling other = (com.google.cloud.ml.api.v1.ManualScaling) obj;

    boolean result = true;
    result = result && (getNodes()
        == other.getNodes());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NODES_FIELD_NUMBER;
    hash = (53 * hash) + getNodes();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.ml.api.v1.ManualScaling parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.ml.api.v1.ManualScaling parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1.ManualScaling parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.ml.api.v1.ManualScaling parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1.ManualScaling parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1.ManualScaling parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1.ManualScaling parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1.ManualScaling parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1.ManualScaling parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1.ManualScaling parseFrom(
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
  public static Builder newBuilder(com.google.cloud.ml.api.v1.ManualScaling prototype) {
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
   * Options for manually scaling a model.
   * </pre>
   *
   * Protobuf type {@code google.cloud.ml.v1.ManualScaling}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.ml.v1.ManualScaling)
      com.google.cloud.ml.api.v1.ManualScalingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.ml.api.v1.ModelServiceProto.internal_static_google_cloud_ml_v1_ManualScaling_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.ml.api.v1.ModelServiceProto.internal_static_google_cloud_ml_v1_ManualScaling_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.ml.api.v1.ManualScaling.class, com.google.cloud.ml.api.v1.ManualScaling.Builder.class);
    }

    // Construct using com.google.cloud.ml.api.v1.ManualScaling.newBuilder()
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
      nodes_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.ml.api.v1.ModelServiceProto.internal_static_google_cloud_ml_v1_ManualScaling_descriptor;
    }

    public com.google.cloud.ml.api.v1.ManualScaling getDefaultInstanceForType() {
      return com.google.cloud.ml.api.v1.ManualScaling.getDefaultInstance();
    }

    public com.google.cloud.ml.api.v1.ManualScaling build() {
      com.google.cloud.ml.api.v1.ManualScaling result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.ml.api.v1.ManualScaling buildPartial() {
      com.google.cloud.ml.api.v1.ManualScaling result = new com.google.cloud.ml.api.v1.ManualScaling(this);
      result.nodes_ = nodes_;
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
      if (other instanceof com.google.cloud.ml.api.v1.ManualScaling) {
        return mergeFrom((com.google.cloud.ml.api.v1.ManualScaling)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.ml.api.v1.ManualScaling other) {
      if (other == com.google.cloud.ml.api.v1.ManualScaling.getDefaultInstance()) return this;
      if (other.getNodes() != 0) {
        setNodes(other.getNodes());
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
      com.google.cloud.ml.api.v1.ManualScaling parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.ml.api.v1.ManualScaling) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int nodes_ ;
    /**
     * <pre>
     * The number of nodes to allocate for this model. These nodes are always up,
     * starting from the time the model is deployed, so the cost of operating
     * this model will be proportional to nodes * number of hours since
     * deployment.
     * </pre>
     *
     * <code>int32 nodes = 1;</code>
     */
    public int getNodes() {
      return nodes_;
    }
    /**
     * <pre>
     * The number of nodes to allocate for this model. These nodes are always up,
     * starting from the time the model is deployed, so the cost of operating
     * this model will be proportional to nodes * number of hours since
     * deployment.
     * </pre>
     *
     * <code>int32 nodes = 1;</code>
     */
    public Builder setNodes(int value) {
      
      nodes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of nodes to allocate for this model. These nodes are always up,
     * starting from the time the model is deployed, so the cost of operating
     * this model will be proportional to nodes * number of hours since
     * deployment.
     * </pre>
     *
     * <code>int32 nodes = 1;</code>
     */
    public Builder clearNodes() {
      
      nodes_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.ml.v1.ManualScaling)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.ml.v1.ManualScaling)
  private static final com.google.cloud.ml.api.v1.ManualScaling DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.ml.api.v1.ManualScaling();
  }

  public static com.google.cloud.ml.api.v1.ManualScaling getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ManualScaling>
      PARSER = new com.google.protobuf.AbstractParser<ManualScaling>() {
    public ManualScaling parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ManualScaling(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ManualScaling> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ManualScaling> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.ml.api.v1.ManualScaling getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

