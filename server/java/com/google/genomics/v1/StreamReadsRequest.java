// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/reads.proto

package com.google.genomics.v1;

/**
 * <pre>
 * The stream reads request.
 * </pre>
 *
 * Protobuf type {@code google.genomics.v1.StreamReadsRequest}
 */
public  final class StreamReadsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.StreamReadsRequest)
    StreamReadsRequestOrBuilder {
  // Use StreamReadsRequest.newBuilder() to construct.
  private StreamReadsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamReadsRequest() {
    projectId_ = "";
    readGroupSetId_ = "";
    referenceName_ = "";
    start_ = 0L;
    end_ = 0L;
    shard_ = 0;
    totalShards_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private StreamReadsRequest(
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

            projectId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            readGroupSetId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            referenceName_ = s;
            break;
          }
          case 32: {

            start_ = input.readInt64();
            break;
          }
          case 40: {

            end_ = input.readInt64();
            break;
          }
          case 48: {

            shard_ = input.readInt32();
            break;
          }
          case 56: {

            totalShards_ = input.readInt32();
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
    return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_StreamReadsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_StreamReadsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.StreamReadsRequest.class, com.google.genomics.v1.StreamReadsRequest.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object projectId_;
  /**
   * <pre>
   * The Google Cloud project ID which will be billed
   * for this access. The caller must have WRITE access to this project.
   * Required.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Google Cloud project ID which will be billed
   * for this access. The caller must have WRITE access to this project.
   * Required.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int READ_GROUP_SET_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object readGroupSetId_;
  /**
   * <pre>
   * The ID of the read group set from which to stream reads.
   * </pre>
   *
   * <code>string read_group_set_id = 2;</code>
   */
  public java.lang.String getReadGroupSetId() {
    java.lang.Object ref = readGroupSetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      readGroupSetId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the read group set from which to stream reads.
   * </pre>
   *
   * <code>string read_group_set_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getReadGroupSetIdBytes() {
    java.lang.Object ref = readGroupSetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      readGroupSetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REFERENCE_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object referenceName_;
  /**
   * <pre>
   * The reference sequence name, for example `chr1`,
   * `1`, or `chrX`. If set to *, only unmapped reads are
   * returned.
   * </pre>
   *
   * <code>string reference_name = 3;</code>
   */
  public java.lang.String getReferenceName() {
    java.lang.Object ref = referenceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      referenceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The reference sequence name, for example `chr1`,
   * `1`, or `chrX`. If set to *, only unmapped reads are
   * returned.
   * </pre>
   *
   * <code>string reference_name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getReferenceNameBytes() {
    java.lang.Object ref = referenceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      referenceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int START_FIELD_NUMBER = 4;
  private long start_;
  /**
   * <pre>
   * The start position of the range on the reference, 0-based inclusive. If
   * specified, `referenceName` must also be specified.
   * </pre>
   *
   * <code>int64 start = 4;</code>
   */
  public long getStart() {
    return start_;
  }

  public static final int END_FIELD_NUMBER = 5;
  private long end_;
  /**
   * <pre>
   * The end position of the range on the reference, 0-based exclusive. If
   * specified, `referenceName` must also be specified.
   * </pre>
   *
   * <code>int64 end = 5;</code>
   */
  public long getEnd() {
    return end_;
  }

  public static final int SHARD_FIELD_NUMBER = 6;
  private int shard_;
  /**
   * <pre>
   * Restricts results to a shard containing approximately `1/totalShards`
   * of the normal response payload for this query. Results from a sharded
   * request are disjoint from those returned by all queries which differ only
   * in their shard parameter. A shard may yield 0 results; this is especially
   * likely for large values of `totalShards`.
   * Valid values are `[0, totalShards)`.
   * </pre>
   *
   * <code>int32 shard = 6;</code>
   */
  public int getShard() {
    return shard_;
  }

  public static final int TOTAL_SHARDS_FIELD_NUMBER = 7;
  private int totalShards_;
  /**
   * <pre>
   * Specifying `totalShards` causes a disjoint subset of the normal response
   * payload to be returned for each query with a unique `shard` parameter
   * specified. A best effort is made to yield equally sized shards. Sharding
   * can be used to distribute processing amongst workers, where each worker is
   * assigned a unique `shard` number and all workers specify the same
   * `totalShards` number. The union of reads returned for all sharded queries
   * `[0, totalShards)` is equal to those returned by a single unsharded query.
   * Queries for different values of `totalShards` with common divisors will
   * share shard boundaries. For example, streaming `shard` 2 of 5
   * `totalShards` yields the same results as streaming `shard`s 4 and 5 of 10
   * `totalShards`. This property can be leveraged for adaptive retries.
   * </pre>
   *
   * <code>int32 total_shards = 7;</code>
   */
  public int getTotalShards() {
    return totalShards_;
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
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (!getReadGroupSetIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, readGroupSetId_);
    }
    if (!getReferenceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, referenceName_);
    }
    if (start_ != 0L) {
      output.writeInt64(4, start_);
    }
    if (end_ != 0L) {
      output.writeInt64(5, end_);
    }
    if (shard_ != 0) {
      output.writeInt32(6, shard_);
    }
    if (totalShards_ != 0) {
      output.writeInt32(7, totalShards_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (!getReadGroupSetIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, readGroupSetId_);
    }
    if (!getReferenceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, referenceName_);
    }
    if (start_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, start_);
    }
    if (end_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, end_);
    }
    if (shard_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, shard_);
    }
    if (totalShards_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, totalShards_);
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
    if (!(obj instanceof com.google.genomics.v1.StreamReadsRequest)) {
      return super.equals(obj);
    }
    com.google.genomics.v1.StreamReadsRequest other = (com.google.genomics.v1.StreamReadsRequest) obj;

    boolean result = true;
    result = result && getProjectId()
        .equals(other.getProjectId());
    result = result && getReadGroupSetId()
        .equals(other.getReadGroupSetId());
    result = result && getReferenceName()
        .equals(other.getReferenceName());
    result = result && (getStart()
        == other.getStart());
    result = result && (getEnd()
        == other.getEnd());
    result = result && (getShard()
        == other.getShard());
    result = result && (getTotalShards()
        == other.getTotalShards());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + READ_GROUP_SET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getReadGroupSetId().hashCode();
    hash = (37 * hash) + REFERENCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getReferenceName().hashCode();
    hash = (37 * hash) + START_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStart());
    hash = (37 * hash) + END_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEnd());
    hash = (37 * hash) + SHARD_FIELD_NUMBER;
    hash = (53 * hash) + getShard();
    hash = (37 * hash) + TOTAL_SHARDS_FIELD_NUMBER;
    hash = (53 * hash) + getTotalShards();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.genomics.v1.StreamReadsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.StreamReadsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.StreamReadsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.StreamReadsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.StreamReadsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.StreamReadsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1.StreamReadsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.StreamReadsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1.StreamReadsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.StreamReadsRequest parseFrom(
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
  public static Builder newBuilder(com.google.genomics.v1.StreamReadsRequest prototype) {
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
   * The stream reads request.
   * </pre>
   *
   * Protobuf type {@code google.genomics.v1.StreamReadsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.StreamReadsRequest)
      com.google.genomics.v1.StreamReadsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_StreamReadsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_StreamReadsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.StreamReadsRequest.class, com.google.genomics.v1.StreamReadsRequest.Builder.class);
    }

    // Construct using com.google.genomics.v1.StreamReadsRequest.newBuilder()
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
      projectId_ = "";

      readGroupSetId_ = "";

      referenceName_ = "";

      start_ = 0L;

      end_ = 0L;

      shard_ = 0;

      totalShards_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_StreamReadsRequest_descriptor;
    }

    public com.google.genomics.v1.StreamReadsRequest getDefaultInstanceForType() {
      return com.google.genomics.v1.StreamReadsRequest.getDefaultInstance();
    }

    public com.google.genomics.v1.StreamReadsRequest build() {
      com.google.genomics.v1.StreamReadsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.StreamReadsRequest buildPartial() {
      com.google.genomics.v1.StreamReadsRequest result = new com.google.genomics.v1.StreamReadsRequest(this);
      result.projectId_ = projectId_;
      result.readGroupSetId_ = readGroupSetId_;
      result.referenceName_ = referenceName_;
      result.start_ = start_;
      result.end_ = end_;
      result.shard_ = shard_;
      result.totalShards_ = totalShards_;
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
      if (other instanceof com.google.genomics.v1.StreamReadsRequest) {
        return mergeFrom((com.google.genomics.v1.StreamReadsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.StreamReadsRequest other) {
      if (other == com.google.genomics.v1.StreamReadsRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (!other.getReadGroupSetId().isEmpty()) {
        readGroupSetId_ = other.readGroupSetId_;
        onChanged();
      }
      if (!other.getReferenceName().isEmpty()) {
        referenceName_ = other.referenceName_;
        onChanged();
      }
      if (other.getStart() != 0L) {
        setStart(other.getStart());
      }
      if (other.getEnd() != 0L) {
        setEnd(other.getEnd());
      }
      if (other.getShard() != 0) {
        setShard(other.getShard());
      }
      if (other.getTotalShards() != 0) {
        setTotalShards(other.getTotalShards());
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
      com.google.genomics.v1.StreamReadsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.StreamReadsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * The Google Cloud project ID which will be billed
     * for this access. The caller must have WRITE access to this project.
     * Required.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Google Cloud project ID which will be billed
     * for this access. The caller must have WRITE access to this project.
     * Required.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Google Cloud project ID which will be billed
     * for this access. The caller must have WRITE access to this project.
     * Required.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Cloud project ID which will be billed
     * for this access. The caller must have WRITE access to this project.
     * Required.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Cloud project ID which will be billed
     * for this access. The caller must have WRITE access to this project.
     * Required.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object readGroupSetId_ = "";
    /**
     * <pre>
     * The ID of the read group set from which to stream reads.
     * </pre>
     *
     * <code>string read_group_set_id = 2;</code>
     */
    public java.lang.String getReadGroupSetId() {
      java.lang.Object ref = readGroupSetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        readGroupSetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the read group set from which to stream reads.
     * </pre>
     *
     * <code>string read_group_set_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getReadGroupSetIdBytes() {
      java.lang.Object ref = readGroupSetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        readGroupSetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the read group set from which to stream reads.
     * </pre>
     *
     * <code>string read_group_set_id = 2;</code>
     */
    public Builder setReadGroupSetId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      readGroupSetId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the read group set from which to stream reads.
     * </pre>
     *
     * <code>string read_group_set_id = 2;</code>
     */
    public Builder clearReadGroupSetId() {
      
      readGroupSetId_ = getDefaultInstance().getReadGroupSetId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the read group set from which to stream reads.
     * </pre>
     *
     * <code>string read_group_set_id = 2;</code>
     */
    public Builder setReadGroupSetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      readGroupSetId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object referenceName_ = "";
    /**
     * <pre>
     * The reference sequence name, for example `chr1`,
     * `1`, or `chrX`. If set to *, only unmapped reads are
     * returned.
     * </pre>
     *
     * <code>string reference_name = 3;</code>
     */
    public java.lang.String getReferenceName() {
      java.lang.Object ref = referenceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        referenceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The reference sequence name, for example `chr1`,
     * `1`, or `chrX`. If set to *, only unmapped reads are
     * returned.
     * </pre>
     *
     * <code>string reference_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getReferenceNameBytes() {
      java.lang.Object ref = referenceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        referenceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The reference sequence name, for example `chr1`,
     * `1`, or `chrX`. If set to *, only unmapped reads are
     * returned.
     * </pre>
     *
     * <code>string reference_name = 3;</code>
     */
    public Builder setReferenceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      referenceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The reference sequence name, for example `chr1`,
     * `1`, or `chrX`. If set to *, only unmapped reads are
     * returned.
     * </pre>
     *
     * <code>string reference_name = 3;</code>
     */
    public Builder clearReferenceName() {
      
      referenceName_ = getDefaultInstance().getReferenceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The reference sequence name, for example `chr1`,
     * `1`, or `chrX`. If set to *, only unmapped reads are
     * returned.
     * </pre>
     *
     * <code>string reference_name = 3;</code>
     */
    public Builder setReferenceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      referenceName_ = value;
      onChanged();
      return this;
    }

    private long start_ ;
    /**
     * <pre>
     * The start position of the range on the reference, 0-based inclusive. If
     * specified, `referenceName` must also be specified.
     * </pre>
     *
     * <code>int64 start = 4;</code>
     */
    public long getStart() {
      return start_;
    }
    /**
     * <pre>
     * The start position of the range on the reference, 0-based inclusive. If
     * specified, `referenceName` must also be specified.
     * </pre>
     *
     * <code>int64 start = 4;</code>
     */
    public Builder setStart(long value) {
      
      start_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The start position of the range on the reference, 0-based inclusive. If
     * specified, `referenceName` must also be specified.
     * </pre>
     *
     * <code>int64 start = 4;</code>
     */
    public Builder clearStart() {
      
      start_ = 0L;
      onChanged();
      return this;
    }

    private long end_ ;
    /**
     * <pre>
     * The end position of the range on the reference, 0-based exclusive. If
     * specified, `referenceName` must also be specified.
     * </pre>
     *
     * <code>int64 end = 5;</code>
     */
    public long getEnd() {
      return end_;
    }
    /**
     * <pre>
     * The end position of the range on the reference, 0-based exclusive. If
     * specified, `referenceName` must also be specified.
     * </pre>
     *
     * <code>int64 end = 5;</code>
     */
    public Builder setEnd(long value) {
      
      end_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The end position of the range on the reference, 0-based exclusive. If
     * specified, `referenceName` must also be specified.
     * </pre>
     *
     * <code>int64 end = 5;</code>
     */
    public Builder clearEnd() {
      
      end_ = 0L;
      onChanged();
      return this;
    }

    private int shard_ ;
    /**
     * <pre>
     * Restricts results to a shard containing approximately `1/totalShards`
     * of the normal response payload for this query. Results from a sharded
     * request are disjoint from those returned by all queries which differ only
     * in their shard parameter. A shard may yield 0 results; this is especially
     * likely for large values of `totalShards`.
     * Valid values are `[0, totalShards)`.
     * </pre>
     *
     * <code>int32 shard = 6;</code>
     */
    public int getShard() {
      return shard_;
    }
    /**
     * <pre>
     * Restricts results to a shard containing approximately `1/totalShards`
     * of the normal response payload for this query. Results from a sharded
     * request are disjoint from those returned by all queries which differ only
     * in their shard parameter. A shard may yield 0 results; this is especially
     * likely for large values of `totalShards`.
     * Valid values are `[0, totalShards)`.
     * </pre>
     *
     * <code>int32 shard = 6;</code>
     */
    public Builder setShard(int value) {
      
      shard_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Restricts results to a shard containing approximately `1/totalShards`
     * of the normal response payload for this query. Results from a sharded
     * request are disjoint from those returned by all queries which differ only
     * in their shard parameter. A shard may yield 0 results; this is especially
     * likely for large values of `totalShards`.
     * Valid values are `[0, totalShards)`.
     * </pre>
     *
     * <code>int32 shard = 6;</code>
     */
    public Builder clearShard() {
      
      shard_ = 0;
      onChanged();
      return this;
    }

    private int totalShards_ ;
    /**
     * <pre>
     * Specifying `totalShards` causes a disjoint subset of the normal response
     * payload to be returned for each query with a unique `shard` parameter
     * specified. A best effort is made to yield equally sized shards. Sharding
     * can be used to distribute processing amongst workers, where each worker is
     * assigned a unique `shard` number and all workers specify the same
     * `totalShards` number. The union of reads returned for all sharded queries
     * `[0, totalShards)` is equal to those returned by a single unsharded query.
     * Queries for different values of `totalShards` with common divisors will
     * share shard boundaries. For example, streaming `shard` 2 of 5
     * `totalShards` yields the same results as streaming `shard`s 4 and 5 of 10
     * `totalShards`. This property can be leveraged for adaptive retries.
     * </pre>
     *
     * <code>int32 total_shards = 7;</code>
     */
    public int getTotalShards() {
      return totalShards_;
    }
    /**
     * <pre>
     * Specifying `totalShards` causes a disjoint subset of the normal response
     * payload to be returned for each query with a unique `shard` parameter
     * specified. A best effort is made to yield equally sized shards. Sharding
     * can be used to distribute processing amongst workers, where each worker is
     * assigned a unique `shard` number and all workers specify the same
     * `totalShards` number. The union of reads returned for all sharded queries
     * `[0, totalShards)` is equal to those returned by a single unsharded query.
     * Queries for different values of `totalShards` with common divisors will
     * share shard boundaries. For example, streaming `shard` 2 of 5
     * `totalShards` yields the same results as streaming `shard`s 4 and 5 of 10
     * `totalShards`. This property can be leveraged for adaptive retries.
     * </pre>
     *
     * <code>int32 total_shards = 7;</code>
     */
    public Builder setTotalShards(int value) {
      
      totalShards_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifying `totalShards` causes a disjoint subset of the normal response
     * payload to be returned for each query with a unique `shard` parameter
     * specified. A best effort is made to yield equally sized shards. Sharding
     * can be used to distribute processing amongst workers, where each worker is
     * assigned a unique `shard` number and all workers specify the same
     * `totalShards` number. The union of reads returned for all sharded queries
     * `[0, totalShards)` is equal to those returned by a single unsharded query.
     * Queries for different values of `totalShards` with common divisors will
     * share shard boundaries. For example, streaming `shard` 2 of 5
     * `totalShards` yields the same results as streaming `shard`s 4 and 5 of 10
     * `totalShards`. This property can be leveraged for adaptive retries.
     * </pre>
     *
     * <code>int32 total_shards = 7;</code>
     */
    public Builder clearTotalShards() {
      
      totalShards_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.StreamReadsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.StreamReadsRequest)
  private static final com.google.genomics.v1.StreamReadsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.genomics.v1.StreamReadsRequest();
  }

  public static com.google.genomics.v1.StreamReadsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamReadsRequest>
      PARSER = new com.google.protobuf.AbstractParser<StreamReadsRequest>() {
    public StreamReadsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new StreamReadsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StreamReadsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamReadsRequest> getParserForType() {
    return PARSER;
  }

  public com.google.genomics.v1.StreamReadsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

