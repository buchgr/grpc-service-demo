// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v1/bigtable_data.proto

package com.google.bigtable.v1;

/**
 * <pre>
 * Specifies a contiguous range of raw byte values.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.v1.ValueRange}
 */
public  final class ValueRange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.bigtable.v1.ValueRange)
    ValueRangeOrBuilder {
  // Use ValueRange.newBuilder() to construct.
  private ValueRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValueRange() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ValueRange(
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
            startValueCase_ = 1;
            startValue_ = input.readBytes();
            break;
          }
          case 18: {
            startValueCase_ = 2;
            startValue_ = input.readBytes();
            break;
          }
          case 26: {
            endValueCase_ = 3;
            endValue_ = input.readBytes();
            break;
          }
          case 34: {
            endValueCase_ = 4;
            endValue_ = input.readBytes();
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
    return com.google.bigtable.v1.BigtableDataProto.internal_static_google_bigtable_v1_ValueRange_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.v1.BigtableDataProto.internal_static_google_bigtable_v1_ValueRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.v1.ValueRange.class, com.google.bigtable.v1.ValueRange.Builder.class);
  }

  private int startValueCase_ = 0;
  private java.lang.Object startValue_;
  public enum StartValueCase
      implements com.google.protobuf.Internal.EnumLite {
    START_VALUE_INCLUSIVE(1),
    START_VALUE_EXCLUSIVE(2),
    STARTVALUE_NOT_SET(0);
    private final int value;
    private StartValueCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StartValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static StartValueCase forNumber(int value) {
      switch (value) {
        case 1: return START_VALUE_INCLUSIVE;
        case 2: return START_VALUE_EXCLUSIVE;
        case 0: return STARTVALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public StartValueCase
  getStartValueCase() {
    return StartValueCase.forNumber(
        startValueCase_);
  }

  private int endValueCase_ = 0;
  private java.lang.Object endValue_;
  public enum EndValueCase
      implements com.google.protobuf.Internal.EnumLite {
    END_VALUE_INCLUSIVE(3),
    END_VALUE_EXCLUSIVE(4),
    ENDVALUE_NOT_SET(0);
    private final int value;
    private EndValueCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EndValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static EndValueCase forNumber(int value) {
      switch (value) {
        case 3: return END_VALUE_INCLUSIVE;
        case 4: return END_VALUE_EXCLUSIVE;
        case 0: return ENDVALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public EndValueCase
  getEndValueCase() {
    return EndValueCase.forNumber(
        endValueCase_);
  }

  public static final int START_VALUE_INCLUSIVE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Used when giving an inclusive lower bound for the range.
   * </pre>
   *
   * <code>bytes start_value_inclusive = 1;</code>
   */
  public com.google.protobuf.ByteString getStartValueInclusive() {
    if (startValueCase_ == 1) {
      return (com.google.protobuf.ByteString) startValue_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int START_VALUE_EXCLUSIVE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Used when giving an exclusive lower bound for the range.
   * </pre>
   *
   * <code>bytes start_value_exclusive = 2;</code>
   */
  public com.google.protobuf.ByteString getStartValueExclusive() {
    if (startValueCase_ == 2) {
      return (com.google.protobuf.ByteString) startValue_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int END_VALUE_INCLUSIVE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Used when giving an inclusive upper bound for the range.
   * </pre>
   *
   * <code>bytes end_value_inclusive = 3;</code>
   */
  public com.google.protobuf.ByteString getEndValueInclusive() {
    if (endValueCase_ == 3) {
      return (com.google.protobuf.ByteString) endValue_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int END_VALUE_EXCLUSIVE_FIELD_NUMBER = 4;
  /**
   * <pre>
   * Used when giving an exclusive upper bound for the range.
   * </pre>
   *
   * <code>bytes end_value_exclusive = 4;</code>
   */
  public com.google.protobuf.ByteString getEndValueExclusive() {
    if (endValueCase_ == 4) {
      return (com.google.protobuf.ByteString) endValue_;
    }
    return com.google.protobuf.ByteString.EMPTY;
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
    if (startValueCase_ == 1) {
      output.writeBytes(
          1, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) startValue_));
    }
    if (startValueCase_ == 2) {
      output.writeBytes(
          2, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) startValue_));
    }
    if (endValueCase_ == 3) {
      output.writeBytes(
          3, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) endValue_));
    }
    if (endValueCase_ == 4) {
      output.writeBytes(
          4, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) endValue_));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startValueCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            1, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) startValue_));
    }
    if (startValueCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            2, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) startValue_));
    }
    if (endValueCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            3, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) endValue_));
    }
    if (endValueCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            4, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) endValue_));
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
    if (!(obj instanceof com.google.bigtable.v1.ValueRange)) {
      return super.equals(obj);
    }
    com.google.bigtable.v1.ValueRange other = (com.google.bigtable.v1.ValueRange) obj;

    boolean result = true;
    result = result && getStartValueCase().equals(
        other.getStartValueCase());
    if (!result) return false;
    switch (startValueCase_) {
      case 1:
        result = result && getStartValueInclusive()
            .equals(other.getStartValueInclusive());
        break;
      case 2:
        result = result && getStartValueExclusive()
            .equals(other.getStartValueExclusive());
        break;
      case 0:
      default:
    }
    result = result && getEndValueCase().equals(
        other.getEndValueCase());
    if (!result) return false;
    switch (endValueCase_) {
      case 3:
        result = result && getEndValueInclusive()
            .equals(other.getEndValueInclusive());
        break;
      case 4:
        result = result && getEndValueExclusive()
            .equals(other.getEndValueExclusive());
        break;
      case 0:
      default:
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
    switch (startValueCase_) {
      case 1:
        hash = (37 * hash) + START_VALUE_INCLUSIVE_FIELD_NUMBER;
        hash = (53 * hash) + getStartValueInclusive().hashCode();
        break;
      case 2:
        hash = (37 * hash) + START_VALUE_EXCLUSIVE_FIELD_NUMBER;
        hash = (53 * hash) + getStartValueExclusive().hashCode();
        break;
      case 0:
      default:
    }
    switch (endValueCase_) {
      case 3:
        hash = (37 * hash) + END_VALUE_INCLUSIVE_FIELD_NUMBER;
        hash = (53 * hash) + getEndValueInclusive().hashCode();
        break;
      case 4:
        hash = (37 * hash) + END_VALUE_EXCLUSIVE_FIELD_NUMBER;
        hash = (53 * hash) + getEndValueExclusive().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.v1.ValueRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v1.ValueRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v1.ValueRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v1.ValueRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v1.ValueRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.v1.ValueRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.v1.ValueRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.bigtable.v1.ValueRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.v1.ValueRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.v1.ValueRange parseFrom(
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
  public static Builder newBuilder(com.google.bigtable.v1.ValueRange prototype) {
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
   * Specifies a contiguous range of raw byte values.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.v1.ValueRange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.v1.ValueRange)
      com.google.bigtable.v1.ValueRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.v1.BigtableDataProto.internal_static_google_bigtable_v1_ValueRange_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.v1.BigtableDataProto.internal_static_google_bigtable_v1_ValueRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.v1.ValueRange.class, com.google.bigtable.v1.ValueRange.Builder.class);
    }

    // Construct using com.google.bigtable.v1.ValueRange.newBuilder()
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
      startValueCase_ = 0;
      startValue_ = null;
      endValueCase_ = 0;
      endValue_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.v1.BigtableDataProto.internal_static_google_bigtable_v1_ValueRange_descriptor;
    }

    public com.google.bigtable.v1.ValueRange getDefaultInstanceForType() {
      return com.google.bigtable.v1.ValueRange.getDefaultInstance();
    }

    public com.google.bigtable.v1.ValueRange build() {
      com.google.bigtable.v1.ValueRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.v1.ValueRange buildPartial() {
      com.google.bigtable.v1.ValueRange result = new com.google.bigtable.v1.ValueRange(this);
      if (startValueCase_ == 1) {
        result.startValue_ = startValue_;
      }
      if (startValueCase_ == 2) {
        result.startValue_ = startValue_;
      }
      if (endValueCase_ == 3) {
        result.endValue_ = endValue_;
      }
      if (endValueCase_ == 4) {
        result.endValue_ = endValue_;
      }
      result.startValueCase_ = startValueCase_;
      result.endValueCase_ = endValueCase_;
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
      if (other instanceof com.google.bigtable.v1.ValueRange) {
        return mergeFrom((com.google.bigtable.v1.ValueRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.v1.ValueRange other) {
      if (other == com.google.bigtable.v1.ValueRange.getDefaultInstance()) return this;
      switch (other.getStartValueCase()) {
        case START_VALUE_INCLUSIVE: {
          setStartValueInclusive(other.getStartValueInclusive());
          break;
        }
        case START_VALUE_EXCLUSIVE: {
          setStartValueExclusive(other.getStartValueExclusive());
          break;
        }
        case STARTVALUE_NOT_SET: {
          break;
        }
      }
      switch (other.getEndValueCase()) {
        case END_VALUE_INCLUSIVE: {
          setEndValueInclusive(other.getEndValueInclusive());
          break;
        }
        case END_VALUE_EXCLUSIVE: {
          setEndValueExclusive(other.getEndValueExclusive());
          break;
        }
        case ENDVALUE_NOT_SET: {
          break;
        }
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
      com.google.bigtable.v1.ValueRange parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.v1.ValueRange) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int startValueCase_ = 0;
    private java.lang.Object startValue_;
    public StartValueCase
        getStartValueCase() {
      return StartValueCase.forNumber(
          startValueCase_);
    }

    public Builder clearStartValue() {
      startValueCase_ = 0;
      startValue_ = null;
      onChanged();
      return this;
    }

    private int endValueCase_ = 0;
    private java.lang.Object endValue_;
    public EndValueCase
        getEndValueCase() {
      return EndValueCase.forNumber(
          endValueCase_);
    }

    public Builder clearEndValue() {
      endValueCase_ = 0;
      endValue_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * Used when giving an inclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_value_inclusive = 1;</code>
     */
    public com.google.protobuf.ByteString getStartValueInclusive() {
      if (startValueCase_ == 1) {
        return (com.google.protobuf.ByteString) startValue_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Used when giving an inclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_value_inclusive = 1;</code>
     */
    public Builder setStartValueInclusive(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  startValueCase_ = 1;
      startValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used when giving an inclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_value_inclusive = 1;</code>
     */
    public Builder clearStartValueInclusive() {
      if (startValueCase_ == 1) {
        startValueCase_ = 0;
        startValue_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Used when giving an exclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_value_exclusive = 2;</code>
     */
    public com.google.protobuf.ByteString getStartValueExclusive() {
      if (startValueCase_ == 2) {
        return (com.google.protobuf.ByteString) startValue_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Used when giving an exclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_value_exclusive = 2;</code>
     */
    public Builder setStartValueExclusive(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  startValueCase_ = 2;
      startValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used when giving an exclusive lower bound for the range.
     * </pre>
     *
     * <code>bytes start_value_exclusive = 2;</code>
     */
    public Builder clearStartValueExclusive() {
      if (startValueCase_ == 2) {
        startValueCase_ = 0;
        startValue_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Used when giving an inclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_value_inclusive = 3;</code>
     */
    public com.google.protobuf.ByteString getEndValueInclusive() {
      if (endValueCase_ == 3) {
        return (com.google.protobuf.ByteString) endValue_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Used when giving an inclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_value_inclusive = 3;</code>
     */
    public Builder setEndValueInclusive(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  endValueCase_ = 3;
      endValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used when giving an inclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_value_inclusive = 3;</code>
     */
    public Builder clearEndValueInclusive() {
      if (endValueCase_ == 3) {
        endValueCase_ = 0;
        endValue_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Used when giving an exclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_value_exclusive = 4;</code>
     */
    public com.google.protobuf.ByteString getEndValueExclusive() {
      if (endValueCase_ == 4) {
        return (com.google.protobuf.ByteString) endValue_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Used when giving an exclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_value_exclusive = 4;</code>
     */
    public Builder setEndValueExclusive(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  endValueCase_ = 4;
      endValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used when giving an exclusive upper bound for the range.
     * </pre>
     *
     * <code>bytes end_value_exclusive = 4;</code>
     */
    public Builder clearEndValueExclusive() {
      if (endValueCase_ == 4) {
        endValueCase_ = 0;
        endValue_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:google.bigtable.v1.ValueRange)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.v1.ValueRange)
  private static final com.google.bigtable.v1.ValueRange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.v1.ValueRange();
  }

  public static com.google.bigtable.v1.ValueRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValueRange>
      PARSER = new com.google.protobuf.AbstractParser<ValueRange>() {
    public ValueRange parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ValueRange(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ValueRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValueRange> getParserForType() {
    return PARSER;
  }

  public com.google.bigtable.v1.ValueRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

