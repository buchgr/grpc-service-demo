// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/duration.proto

package com.google.protobuf;

/**
 * <pre>
 * A Duration represents a signed, fixed-length span of time represented
 * as a count of seconds and fractions of seconds at nanosecond
 * resolution. It is independent of any calendar and concepts like "day"
 * or "month". It is related to Timestamp in that the difference between
 * two Timestamp values is a Duration and it can be added or subtracted
 * from a Timestamp. Range is approximately +-10,000 years.
 * Example 1: Compute Duration from two Timestamps in pseudo code.
 *     Timestamp start = ...;
 *     Timestamp end = ...;
 *     Duration duration = ...;
 *     duration.seconds = end.seconds - start.seconds;
 *     duration.nanos = end.nanos - start.nanos;
 *     if (duration.seconds &lt; 0 &amp;&amp; duration.nanos &gt; 0) {
 *       duration.seconds += 1;
 *       duration.nanos -= 1000000000;
 *     } else if (durations.seconds &gt; 0 &amp;&amp; duration.nanos &lt; 0) {
 *       duration.seconds -= 1;
 *       duration.nanos += 1000000000;
 *     }
 * Example 2: Compute Timestamp from Timestamp + Duration in pseudo code.
 *     Timestamp start = ...;
 *     Duration duration = ...;
 *     Timestamp end = ...;
 *     end.seconds = start.seconds + duration.seconds;
 *     end.nanos = start.nanos + duration.nanos;
 *     if (end.nanos &lt; 0) {
 *       end.seconds -= 1;
 *       end.nanos += 1000000000;
 *     } else if (end.nanos &gt;= 1000000000) {
 *       end.seconds += 1;
 *       end.nanos -= 1000000000;
 *     }
 * Example 3: Compute Duration from datetime.timedelta in Python.
 *     td = datetime.timedelta(days=3, minutes=10)
 *     duration = Duration()
 *     duration.FromTimedelta(td)
 * </pre>
 *
 * Protobuf type {@code google.protobuf.Duration}
 */
public  final class Duration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.protobuf.Duration)
    DurationOrBuilder {
  // Use Duration.newBuilder() to construct.
  private Duration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Duration() {
    seconds_ = 0L;
    nanos_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Duration(
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

            seconds_ = input.readInt64();
            break;
          }
          case 16: {

            nanos_ = input.readInt32();
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
    return com.google.protobuf.DurationProto.internal_static_google_protobuf_Duration_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.protobuf.DurationProto.internal_static_google_protobuf_Duration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.protobuf.Duration.class, com.google.protobuf.Duration.Builder.class);
  }

  public static final int SECONDS_FIELD_NUMBER = 1;
  private long seconds_;
  /**
   * <pre>
   * Signed seconds of the span of time. Must be from -315,576,000,000
   * to +315,576,000,000 inclusive.
   * </pre>
   *
   * <code>int64 seconds = 1;</code>
   */
  public long getSeconds() {
    return seconds_;
  }

  public static final int NANOS_FIELD_NUMBER = 2;
  private int nanos_;
  /**
   * <pre>
   * Signed fractions of a second at nanosecond resolution of the span
   * of time. Durations less than one second are represented with a 0
   * `seconds` field and a positive or negative `nanos` field. For durations
   * of one second or more, a non-zero value for the `nanos` field must be
   * of the same sign as the `seconds` field. Must be from -999,999,999
   * to +999,999,999 inclusive.
   * </pre>
   *
   * <code>int32 nanos = 2;</code>
   */
  public int getNanos() {
    return nanos_;
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
    if (seconds_ != 0L) {
      output.writeInt64(1, seconds_);
    }
    if (nanos_ != 0) {
      output.writeInt32(2, nanos_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (seconds_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, seconds_);
    }
    if (nanos_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, nanos_);
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
    if (!(obj instanceof com.google.protobuf.Duration)) {
      return super.equals(obj);
    }
    com.google.protobuf.Duration other = (com.google.protobuf.Duration) obj;

    boolean result = true;
    result = result && (getSeconds()
        == other.getSeconds());
    result = result && (getNanos()
        == other.getNanos());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSeconds());
    hash = (37 * hash) + NANOS_FIELD_NUMBER;
    hash = (53 * hash) + getNanos();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.protobuf.Duration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.protobuf.Duration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.protobuf.Duration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.protobuf.Duration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.protobuf.Duration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.protobuf.Duration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.protobuf.Duration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.protobuf.Duration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.protobuf.Duration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.protobuf.Duration parseFrom(
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
  public static Builder newBuilder(com.google.protobuf.Duration prototype) {
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
   * A Duration represents a signed, fixed-length span of time represented
   * as a count of seconds and fractions of seconds at nanosecond
   * resolution. It is independent of any calendar and concepts like "day"
   * or "month". It is related to Timestamp in that the difference between
   * two Timestamp values is a Duration and it can be added or subtracted
   * from a Timestamp. Range is approximately +-10,000 years.
   * Example 1: Compute Duration from two Timestamps in pseudo code.
   *     Timestamp start = ...;
   *     Timestamp end = ...;
   *     Duration duration = ...;
   *     duration.seconds = end.seconds - start.seconds;
   *     duration.nanos = end.nanos - start.nanos;
   *     if (duration.seconds &lt; 0 &amp;&amp; duration.nanos &gt; 0) {
   *       duration.seconds += 1;
   *       duration.nanos -= 1000000000;
   *     } else if (durations.seconds &gt; 0 &amp;&amp; duration.nanos &lt; 0) {
   *       duration.seconds -= 1;
   *       duration.nanos += 1000000000;
   *     }
   * Example 2: Compute Timestamp from Timestamp + Duration in pseudo code.
   *     Timestamp start = ...;
   *     Duration duration = ...;
   *     Timestamp end = ...;
   *     end.seconds = start.seconds + duration.seconds;
   *     end.nanos = start.nanos + duration.nanos;
   *     if (end.nanos &lt; 0) {
   *       end.seconds -= 1;
   *       end.nanos += 1000000000;
   *     } else if (end.nanos &gt;= 1000000000) {
   *       end.seconds += 1;
   *       end.nanos -= 1000000000;
   *     }
   * Example 3: Compute Duration from datetime.timedelta in Python.
   *     td = datetime.timedelta(days=3, minutes=10)
   *     duration = Duration()
   *     duration.FromTimedelta(td)
   * </pre>
   *
   * Protobuf type {@code google.protobuf.Duration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.Duration)
      com.google.protobuf.DurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.protobuf.DurationProto.internal_static_google_protobuf_Duration_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.protobuf.DurationProto.internal_static_google_protobuf_Duration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.protobuf.Duration.class, com.google.protobuf.Duration.Builder.class);
    }

    // Construct using com.google.protobuf.Duration.newBuilder()
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
      seconds_ = 0L;

      nanos_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.protobuf.DurationProto.internal_static_google_protobuf_Duration_descriptor;
    }

    public com.google.protobuf.Duration getDefaultInstanceForType() {
      return com.google.protobuf.Duration.getDefaultInstance();
    }

    public com.google.protobuf.Duration build() {
      com.google.protobuf.Duration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.protobuf.Duration buildPartial() {
      com.google.protobuf.Duration result = new com.google.protobuf.Duration(this);
      result.seconds_ = seconds_;
      result.nanos_ = nanos_;
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
      if (other instanceof com.google.protobuf.Duration) {
        return mergeFrom((com.google.protobuf.Duration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.protobuf.Duration other) {
      if (other == com.google.protobuf.Duration.getDefaultInstance()) return this;
      if (other.getSeconds() != 0L) {
        setSeconds(other.getSeconds());
      }
      if (other.getNanos() != 0) {
        setNanos(other.getNanos());
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
      com.google.protobuf.Duration parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.protobuf.Duration) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long seconds_ ;
    /**
     * <pre>
     * Signed seconds of the span of time. Must be from -315,576,000,000
     * to +315,576,000,000 inclusive.
     * </pre>
     *
     * <code>int64 seconds = 1;</code>
     */
    public long getSeconds() {
      return seconds_;
    }
    /**
     * <pre>
     * Signed seconds of the span of time. Must be from -315,576,000,000
     * to +315,576,000,000 inclusive.
     * </pre>
     *
     * <code>int64 seconds = 1;</code>
     */
    public Builder setSeconds(long value) {
      
      seconds_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Signed seconds of the span of time. Must be from -315,576,000,000
     * to +315,576,000,000 inclusive.
     * </pre>
     *
     * <code>int64 seconds = 1;</code>
     */
    public Builder clearSeconds() {
      
      seconds_ = 0L;
      onChanged();
      return this;
    }

    private int nanos_ ;
    /**
     * <pre>
     * Signed fractions of a second at nanosecond resolution of the span
     * of time. Durations less than one second are represented with a 0
     * `seconds` field and a positive or negative `nanos` field. For durations
     * of one second or more, a non-zero value for the `nanos` field must be
     * of the same sign as the `seconds` field. Must be from -999,999,999
     * to +999,999,999 inclusive.
     * </pre>
     *
     * <code>int32 nanos = 2;</code>
     */
    public int getNanos() {
      return nanos_;
    }
    /**
     * <pre>
     * Signed fractions of a second at nanosecond resolution of the span
     * of time. Durations less than one second are represented with a 0
     * `seconds` field and a positive or negative `nanos` field. For durations
     * of one second or more, a non-zero value for the `nanos` field must be
     * of the same sign as the `seconds` field. Must be from -999,999,999
     * to +999,999,999 inclusive.
     * </pre>
     *
     * <code>int32 nanos = 2;</code>
     */
    public Builder setNanos(int value) {
      
      nanos_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Signed fractions of a second at nanosecond resolution of the span
     * of time. Durations less than one second are represented with a 0
     * `seconds` field and a positive or negative `nanos` field. For durations
     * of one second or more, a non-zero value for the `nanos` field must be
     * of the same sign as the `seconds` field. Must be from -999,999,999
     * to +999,999,999 inclusive.
     * </pre>
     *
     * <code>int32 nanos = 2;</code>
     */
    public Builder clearNanos() {
      
      nanos_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.protobuf.Duration)
  }

  // @@protoc_insertion_point(class_scope:google.protobuf.Duration)
  private static final com.google.protobuf.Duration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.protobuf.Duration();
  }

  public static com.google.protobuf.Duration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Duration>
      PARSER = new com.google.protobuf.AbstractParser<Duration>() {
    public Duration parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Duration(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Duration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Duration> getParserForType() {
    return PARSER;
  }

  public com.google.protobuf.Duration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

