// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

package com.google.spanner.v1;

/**
 * <pre>
 * The response for [Commit][google.spanner.v1.Spanner.Commit].
 * </pre>
 *
 * Protobuf type {@code google.spanner.v1.CommitResponse}
 */
public  final class CommitResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.spanner.v1.CommitResponse)
    CommitResponseOrBuilder {
  // Use CommitResponse.newBuilder() to construct.
  private CommitResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommitResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CommitResponse(
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
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (commitTimestamp_ != null) {
              subBuilder = commitTimestamp_.toBuilder();
            }
            commitTimestamp_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(commitTimestamp_);
              commitTimestamp_ = subBuilder.buildPartial();
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
    return com.google.spanner.v1.SpannerProto.internal_static_google_spanner_v1_CommitResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.v1.SpannerProto.internal_static_google_spanner_v1_CommitResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.v1.CommitResponse.class, com.google.spanner.v1.CommitResponse.Builder.class);
  }

  public static final int COMMIT_TIMESTAMP_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp commitTimestamp_;
  /**
   * <pre>
   * The Cloud Spanner timestamp at which the transaction committed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp commit_timestamp = 1;</code>
   */
  public boolean hasCommitTimestamp() {
    return commitTimestamp_ != null;
  }
  /**
   * <pre>
   * The Cloud Spanner timestamp at which the transaction committed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp commit_timestamp = 1;</code>
   */
  public com.google.protobuf.Timestamp getCommitTimestamp() {
    return commitTimestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : commitTimestamp_;
  }
  /**
   * <pre>
   * The Cloud Spanner timestamp at which the transaction committed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp commit_timestamp = 1;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getCommitTimestampOrBuilder() {
    return getCommitTimestamp();
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
    if (commitTimestamp_ != null) {
      output.writeMessage(1, getCommitTimestamp());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (commitTimestamp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCommitTimestamp());
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
    if (!(obj instanceof com.google.spanner.v1.CommitResponse)) {
      return super.equals(obj);
    }
    com.google.spanner.v1.CommitResponse other = (com.google.spanner.v1.CommitResponse) obj;

    boolean result = true;
    result = result && (hasCommitTimestamp() == other.hasCommitTimestamp());
    if (hasCommitTimestamp()) {
      result = result && getCommitTimestamp()
          .equals(other.getCommitTimestamp());
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
    if (hasCommitTimestamp()) {
      hash = (37 * hash) + COMMIT_TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getCommitTimestamp().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.v1.CommitResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.CommitResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.CommitResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.CommitResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.CommitResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.CommitResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.v1.CommitResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.CommitResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.v1.CommitResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.CommitResponse parseFrom(
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
  public static Builder newBuilder(com.google.spanner.v1.CommitResponse prototype) {
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
   * The response for [Commit][google.spanner.v1.Spanner.Commit].
   * </pre>
   *
   * Protobuf type {@code google.spanner.v1.CommitResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.spanner.v1.CommitResponse)
      com.google.spanner.v1.CommitResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.spanner.v1.SpannerProto.internal_static_google_spanner_v1_CommitResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.v1.SpannerProto.internal_static_google_spanner_v1_CommitResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.v1.CommitResponse.class, com.google.spanner.v1.CommitResponse.Builder.class);
    }

    // Construct using com.google.spanner.v1.CommitResponse.newBuilder()
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
      if (commitTimestampBuilder_ == null) {
        commitTimestamp_ = null;
      } else {
        commitTimestamp_ = null;
        commitTimestampBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.spanner.v1.SpannerProto.internal_static_google_spanner_v1_CommitResponse_descriptor;
    }

    public com.google.spanner.v1.CommitResponse getDefaultInstanceForType() {
      return com.google.spanner.v1.CommitResponse.getDefaultInstance();
    }

    public com.google.spanner.v1.CommitResponse build() {
      com.google.spanner.v1.CommitResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.spanner.v1.CommitResponse buildPartial() {
      com.google.spanner.v1.CommitResponse result = new com.google.spanner.v1.CommitResponse(this);
      if (commitTimestampBuilder_ == null) {
        result.commitTimestamp_ = commitTimestamp_;
      } else {
        result.commitTimestamp_ = commitTimestampBuilder_.build();
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
      if (other instanceof com.google.spanner.v1.CommitResponse) {
        return mergeFrom((com.google.spanner.v1.CommitResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.v1.CommitResponse other) {
      if (other == com.google.spanner.v1.CommitResponse.getDefaultInstance()) return this;
      if (other.hasCommitTimestamp()) {
        mergeCommitTimestamp(other.getCommitTimestamp());
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
      com.google.spanner.v1.CommitResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.spanner.v1.CommitResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp commitTimestamp_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> commitTimestampBuilder_;
    /**
     * <pre>
     * The Cloud Spanner timestamp at which the transaction committed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp commit_timestamp = 1;</code>
     */
    public boolean hasCommitTimestamp() {
      return commitTimestampBuilder_ != null || commitTimestamp_ != null;
    }
    /**
     * <pre>
     * The Cloud Spanner timestamp at which the transaction committed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp commit_timestamp = 1;</code>
     */
    public com.google.protobuf.Timestamp getCommitTimestamp() {
      if (commitTimestampBuilder_ == null) {
        return commitTimestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : commitTimestamp_;
      } else {
        return commitTimestampBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Cloud Spanner timestamp at which the transaction committed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp commit_timestamp = 1;</code>
     */
    public Builder setCommitTimestamp(com.google.protobuf.Timestamp value) {
      if (commitTimestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commitTimestamp_ = value;
        onChanged();
      } else {
        commitTimestampBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Cloud Spanner timestamp at which the transaction committed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp commit_timestamp = 1;</code>
     */
    public Builder setCommitTimestamp(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (commitTimestampBuilder_ == null) {
        commitTimestamp_ = builderForValue.build();
        onChanged();
      } else {
        commitTimestampBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The Cloud Spanner timestamp at which the transaction committed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp commit_timestamp = 1;</code>
     */
    public Builder mergeCommitTimestamp(com.google.protobuf.Timestamp value) {
      if (commitTimestampBuilder_ == null) {
        if (commitTimestamp_ != null) {
          commitTimestamp_ =
            com.google.protobuf.Timestamp.newBuilder(commitTimestamp_).mergeFrom(value).buildPartial();
        } else {
          commitTimestamp_ = value;
        }
        onChanged();
      } else {
        commitTimestampBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Cloud Spanner timestamp at which the transaction committed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp commit_timestamp = 1;</code>
     */
    public Builder clearCommitTimestamp() {
      if (commitTimestampBuilder_ == null) {
        commitTimestamp_ = null;
        onChanged();
      } else {
        commitTimestamp_ = null;
        commitTimestampBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The Cloud Spanner timestamp at which the transaction committed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp commit_timestamp = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCommitTimestampBuilder() {
      
      onChanged();
      return getCommitTimestampFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Cloud Spanner timestamp at which the transaction committed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp commit_timestamp = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCommitTimestampOrBuilder() {
      if (commitTimestampBuilder_ != null) {
        return commitTimestampBuilder_.getMessageOrBuilder();
      } else {
        return commitTimestamp_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : commitTimestamp_;
      }
    }
    /**
     * <pre>
     * The Cloud Spanner timestamp at which the transaction committed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp commit_timestamp = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCommitTimestampFieldBuilder() {
      if (commitTimestampBuilder_ == null) {
        commitTimestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCommitTimestamp(),
                getParentForChildren(),
                isClean());
        commitTimestamp_ = null;
      }
      return commitTimestampBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.spanner.v1.CommitResponse)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.v1.CommitResponse)
  private static final com.google.spanner.v1.CommitResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.spanner.v1.CommitResponse();
  }

  public static com.google.spanner.v1.CommitResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommitResponse>
      PARSER = new com.google.protobuf.AbstractParser<CommitResponse>() {
    public CommitResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CommitResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CommitResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommitResponse> getParserForType() {
    return PARSER;
  }

  public com.google.spanner.v1.CommitResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

