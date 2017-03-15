// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/ml/v1beta1/job_service.proto

package com.google.cloud.ml.api.v1beta1;

/**
 * <pre>
 * Represents results of a prediction job.
 * </pre>
 *
 * Protobuf type {@code google.cloud.ml.v1beta1.PredictionOutput}
 */
public  final class PredictionOutput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.ml.v1beta1.PredictionOutput)
    PredictionOutputOrBuilder {
  // Use PredictionOutput.newBuilder() to construct.
  private PredictionOutput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PredictionOutput() {
    outputPath_ = "";
    predictionCount_ = 0L;
    errorCount_ = 0L;
    nodeHours_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PredictionOutput(
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

            outputPath_ = s;
            break;
          }
          case 16: {

            predictionCount_ = input.readInt64();
            break;
          }
          case 24: {

            errorCount_ = input.readInt64();
            break;
          }
          case 33: {

            nodeHours_ = input.readDouble();
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
    return com.google.cloud.ml.api.v1beta1.JobServiceProto.internal_static_google_cloud_ml_v1beta1_PredictionOutput_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.ml.api.v1beta1.JobServiceProto.internal_static_google_cloud_ml_v1beta1_PredictionOutput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.ml.api.v1beta1.PredictionOutput.class, com.google.cloud.ml.api.v1beta1.PredictionOutput.Builder.class);
  }

  public static final int OUTPUT_PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object outputPath_;
  /**
   * <pre>
   * The output Google Cloud Storage location provided at the job creation time.
   * </pre>
   *
   * <code>string output_path = 1;</code>
   */
  public java.lang.String getOutputPath() {
    java.lang.Object ref = outputPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      outputPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The output Google Cloud Storage location provided at the job creation time.
   * </pre>
   *
   * <code>string output_path = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOutputPathBytes() {
    java.lang.Object ref = outputPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      outputPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREDICTION_COUNT_FIELD_NUMBER = 2;
  private long predictionCount_;
  /**
   * <pre>
   * The number of generated predictions.
   * </pre>
   *
   * <code>int64 prediction_count = 2;</code>
   */
  public long getPredictionCount() {
    return predictionCount_;
  }

  public static final int ERROR_COUNT_FIELD_NUMBER = 3;
  private long errorCount_;
  /**
   * <pre>
   * The number of data instances which resulted in errors.
   * </pre>
   *
   * <code>int64 error_count = 3;</code>
   */
  public long getErrorCount() {
    return errorCount_;
  }

  public static final int NODE_HOURS_FIELD_NUMBER = 4;
  private double nodeHours_;
  /**
   * <pre>
   * Node hours used by the batch prediction job.
   * </pre>
   *
   * <code>double node_hours = 4;</code>
   */
  public double getNodeHours() {
    return nodeHours_;
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
    if (!getOutputPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, outputPath_);
    }
    if (predictionCount_ != 0L) {
      output.writeInt64(2, predictionCount_);
    }
    if (errorCount_ != 0L) {
      output.writeInt64(3, errorCount_);
    }
    if (nodeHours_ != 0D) {
      output.writeDouble(4, nodeHours_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOutputPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, outputPath_);
    }
    if (predictionCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, predictionCount_);
    }
    if (errorCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, errorCount_);
    }
    if (nodeHours_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, nodeHours_);
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
    if (!(obj instanceof com.google.cloud.ml.api.v1beta1.PredictionOutput)) {
      return super.equals(obj);
    }
    com.google.cloud.ml.api.v1beta1.PredictionOutput other = (com.google.cloud.ml.api.v1beta1.PredictionOutput) obj;

    boolean result = true;
    result = result && getOutputPath()
        .equals(other.getOutputPath());
    result = result && (getPredictionCount()
        == other.getPredictionCount());
    result = result && (getErrorCount()
        == other.getErrorCount());
    result = result && (
        java.lang.Double.doubleToLongBits(getNodeHours())
        == java.lang.Double.doubleToLongBits(
            other.getNodeHours()));
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + OUTPUT_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getOutputPath().hashCode();
    hash = (37 * hash) + PREDICTION_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPredictionCount());
    hash = (37 * hash) + ERROR_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getErrorCount());
    hash = (37 * hash) + NODE_HOURS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getNodeHours()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.ml.api.v1beta1.PredictionOutput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictionOutput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictionOutput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictionOutput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictionOutput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictionOutput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictionOutput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictionOutput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictionOutput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictionOutput parseFrom(
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
  public static Builder newBuilder(com.google.cloud.ml.api.v1beta1.PredictionOutput prototype) {
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
   * Represents results of a prediction job.
   * </pre>
   *
   * Protobuf type {@code google.cloud.ml.v1beta1.PredictionOutput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.ml.v1beta1.PredictionOutput)
      com.google.cloud.ml.api.v1beta1.PredictionOutputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.ml.api.v1beta1.JobServiceProto.internal_static_google_cloud_ml_v1beta1_PredictionOutput_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.ml.api.v1beta1.JobServiceProto.internal_static_google_cloud_ml_v1beta1_PredictionOutput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.ml.api.v1beta1.PredictionOutput.class, com.google.cloud.ml.api.v1beta1.PredictionOutput.Builder.class);
    }

    // Construct using com.google.cloud.ml.api.v1beta1.PredictionOutput.newBuilder()
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
      outputPath_ = "";

      predictionCount_ = 0L;

      errorCount_ = 0L;

      nodeHours_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.ml.api.v1beta1.JobServiceProto.internal_static_google_cloud_ml_v1beta1_PredictionOutput_descriptor;
    }

    public com.google.cloud.ml.api.v1beta1.PredictionOutput getDefaultInstanceForType() {
      return com.google.cloud.ml.api.v1beta1.PredictionOutput.getDefaultInstance();
    }

    public com.google.cloud.ml.api.v1beta1.PredictionOutput build() {
      com.google.cloud.ml.api.v1beta1.PredictionOutput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.ml.api.v1beta1.PredictionOutput buildPartial() {
      com.google.cloud.ml.api.v1beta1.PredictionOutput result = new com.google.cloud.ml.api.v1beta1.PredictionOutput(this);
      result.outputPath_ = outputPath_;
      result.predictionCount_ = predictionCount_;
      result.errorCount_ = errorCount_;
      result.nodeHours_ = nodeHours_;
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
      if (other instanceof com.google.cloud.ml.api.v1beta1.PredictionOutput) {
        return mergeFrom((com.google.cloud.ml.api.v1beta1.PredictionOutput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.ml.api.v1beta1.PredictionOutput other) {
      if (other == com.google.cloud.ml.api.v1beta1.PredictionOutput.getDefaultInstance()) return this;
      if (!other.getOutputPath().isEmpty()) {
        outputPath_ = other.outputPath_;
        onChanged();
      }
      if (other.getPredictionCount() != 0L) {
        setPredictionCount(other.getPredictionCount());
      }
      if (other.getErrorCount() != 0L) {
        setErrorCount(other.getErrorCount());
      }
      if (other.getNodeHours() != 0D) {
        setNodeHours(other.getNodeHours());
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
      com.google.cloud.ml.api.v1beta1.PredictionOutput parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.ml.api.v1beta1.PredictionOutput) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object outputPath_ = "";
    /**
     * <pre>
     * The output Google Cloud Storage location provided at the job creation time.
     * </pre>
     *
     * <code>string output_path = 1;</code>
     */
    public java.lang.String getOutputPath() {
      java.lang.Object ref = outputPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        outputPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The output Google Cloud Storage location provided at the job creation time.
     * </pre>
     *
     * <code>string output_path = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOutputPathBytes() {
      java.lang.Object ref = outputPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        outputPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The output Google Cloud Storage location provided at the job creation time.
     * </pre>
     *
     * <code>string output_path = 1;</code>
     */
    public Builder setOutputPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      outputPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The output Google Cloud Storage location provided at the job creation time.
     * </pre>
     *
     * <code>string output_path = 1;</code>
     */
    public Builder clearOutputPath() {
      
      outputPath_ = getDefaultInstance().getOutputPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The output Google Cloud Storage location provided at the job creation time.
     * </pre>
     *
     * <code>string output_path = 1;</code>
     */
    public Builder setOutputPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      outputPath_ = value;
      onChanged();
      return this;
    }

    private long predictionCount_ ;
    /**
     * <pre>
     * The number of generated predictions.
     * </pre>
     *
     * <code>int64 prediction_count = 2;</code>
     */
    public long getPredictionCount() {
      return predictionCount_;
    }
    /**
     * <pre>
     * The number of generated predictions.
     * </pre>
     *
     * <code>int64 prediction_count = 2;</code>
     */
    public Builder setPredictionCount(long value) {
      
      predictionCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of generated predictions.
     * </pre>
     *
     * <code>int64 prediction_count = 2;</code>
     */
    public Builder clearPredictionCount() {
      
      predictionCount_ = 0L;
      onChanged();
      return this;
    }

    private long errorCount_ ;
    /**
     * <pre>
     * The number of data instances which resulted in errors.
     * </pre>
     *
     * <code>int64 error_count = 3;</code>
     */
    public long getErrorCount() {
      return errorCount_;
    }
    /**
     * <pre>
     * The number of data instances which resulted in errors.
     * </pre>
     *
     * <code>int64 error_count = 3;</code>
     */
    public Builder setErrorCount(long value) {
      
      errorCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of data instances which resulted in errors.
     * </pre>
     *
     * <code>int64 error_count = 3;</code>
     */
    public Builder clearErrorCount() {
      
      errorCount_ = 0L;
      onChanged();
      return this;
    }

    private double nodeHours_ ;
    /**
     * <pre>
     * Node hours used by the batch prediction job.
     * </pre>
     *
     * <code>double node_hours = 4;</code>
     */
    public double getNodeHours() {
      return nodeHours_;
    }
    /**
     * <pre>
     * Node hours used by the batch prediction job.
     * </pre>
     *
     * <code>double node_hours = 4;</code>
     */
    public Builder setNodeHours(double value) {
      
      nodeHours_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Node hours used by the batch prediction job.
     * </pre>
     *
     * <code>double node_hours = 4;</code>
     */
    public Builder clearNodeHours() {
      
      nodeHours_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.ml.v1beta1.PredictionOutput)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.ml.v1beta1.PredictionOutput)
  private static final com.google.cloud.ml.api.v1beta1.PredictionOutput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.ml.api.v1beta1.PredictionOutput();
  }

  public static com.google.cloud.ml.api.v1beta1.PredictionOutput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PredictionOutput>
      PARSER = new com.google.protobuf.AbstractParser<PredictionOutput>() {
    public PredictionOutput parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PredictionOutput(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PredictionOutput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PredictionOutput> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.ml.api.v1beta1.PredictionOutput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

