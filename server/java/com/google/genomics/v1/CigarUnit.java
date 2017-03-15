// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/cigar.proto

package com.google.genomics.v1;

/**
 * <pre>
 * A single CIGAR operation.
 * </pre>
 *
 * Protobuf type {@code google.genomics.v1.CigarUnit}
 */
public  final class CigarUnit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.CigarUnit)
    CigarUnitOrBuilder {
  // Use CigarUnit.newBuilder() to construct.
  private CigarUnit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CigarUnit() {
    operation_ = 0;
    operationLength_ = 0L;
    referenceSequence_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CigarUnit(
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
            int rawValue = input.readEnum();

            operation_ = rawValue;
            break;
          }
          case 16: {

            operationLength_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            referenceSequence_ = s;
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
    return com.google.genomics.v1.CigarProto.internal_static_google_genomics_v1_CigarUnit_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.CigarProto.internal_static_google_genomics_v1_CigarUnit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.CigarUnit.class, com.google.genomics.v1.CigarUnit.Builder.class);
  }

  /**
   * <pre>
   * Describes the different types of CIGAR alignment operations that exist.
   * Used wherever CIGAR alignments are used.
   * </pre>
   *
   * Protobuf enum {@code google.genomics.v1.CigarUnit.Operation}
   */
  public enum Operation
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>OPERATION_UNSPECIFIED = 0;</code>
     */
    OPERATION_UNSPECIFIED(0),
    /**
     * <pre>
     * An alignment match indicates that a sequence can be aligned to the
     * reference without evidence of an INDEL. Unlike the
     * `SEQUENCE_MATCH` and `SEQUENCE_MISMATCH` operators,
     * the `ALIGNMENT_MATCH` operator does not indicate whether the
     * reference and read sequences are an exact match. This operator is
     * equivalent to SAM's `M`.
     * </pre>
     *
     * <code>ALIGNMENT_MATCH = 1;</code>
     */
    ALIGNMENT_MATCH(1),
    /**
     * <pre>
     * The insert operator indicates that the read contains evidence of bases
     * being inserted into the reference. This operator is equivalent to SAM's
     * `I`.
     * </pre>
     *
     * <code>INSERT = 2;</code>
     */
    INSERT(2),
    /**
     * <pre>
     * The delete operator indicates that the read contains evidence of bases
     * being deleted from the reference. This operator is equivalent to SAM's
     * `D`.
     * </pre>
     *
     * <code>DELETE = 3;</code>
     */
    DELETE(3),
    /**
     * <pre>
     * The skip operator indicates that this read skips a long segment of the
     * reference, but the bases have not been deleted. This operator is commonly
     * used when working with RNA-seq data, where reads may skip long segments
     * of the reference between exons. This operator is equivalent to SAM's
     * `N`.
     * </pre>
     *
     * <code>SKIP = 4;</code>
     */
    SKIP(4),
    /**
     * <pre>
     * The soft clip operator indicates that bases at the start/end of a read
     * have not been considered during alignment. This may occur if the majority
     * of a read maps, except for low quality bases at the start/end of a read.
     * This operator is equivalent to SAM's `S`. Bases that are soft
     * clipped will still be stored in the read.
     * </pre>
     *
     * <code>CLIP_SOFT = 5;</code>
     */
    CLIP_SOFT(5),
    /**
     * <pre>
     * The hard clip operator indicates that bases at the start/end of a read
     * have been omitted from this alignment. This may occur if this linear
     * alignment is part of a chimeric alignment, or if the read has been
     * trimmed (for example, during error correction or to trim poly-A tails for
     * RNA-seq). This operator is equivalent to SAM's `H`.
     * </pre>
     *
     * <code>CLIP_HARD = 6;</code>
     */
    CLIP_HARD(6),
    /**
     * <pre>
     * The pad operator indicates that there is padding in an alignment. This
     * operator is equivalent to SAM's `P`.
     * </pre>
     *
     * <code>PAD = 7;</code>
     */
    PAD(7),
    /**
     * <pre>
     * This operator indicates that this portion of the aligned sequence exactly
     * matches the reference. This operator is equivalent to SAM's `=`.
     * </pre>
     *
     * <code>SEQUENCE_MATCH = 8;</code>
     */
    SEQUENCE_MATCH(8),
    /**
     * <pre>
     * This operator indicates that this portion of the aligned sequence is an
     * alignment match to the reference, but a sequence mismatch. This can
     * indicate a SNP or a read error. This operator is equivalent to SAM's
     * `X`.
     * </pre>
     *
     * <code>SEQUENCE_MISMATCH = 9;</code>
     */
    SEQUENCE_MISMATCH(9),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>OPERATION_UNSPECIFIED = 0;</code>
     */
    public static final int OPERATION_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * An alignment match indicates that a sequence can be aligned to the
     * reference without evidence of an INDEL. Unlike the
     * `SEQUENCE_MATCH` and `SEQUENCE_MISMATCH` operators,
     * the `ALIGNMENT_MATCH` operator does not indicate whether the
     * reference and read sequences are an exact match. This operator is
     * equivalent to SAM's `M`.
     * </pre>
     *
     * <code>ALIGNMENT_MATCH = 1;</code>
     */
    public static final int ALIGNMENT_MATCH_VALUE = 1;
    /**
     * <pre>
     * The insert operator indicates that the read contains evidence of bases
     * being inserted into the reference. This operator is equivalent to SAM's
     * `I`.
     * </pre>
     *
     * <code>INSERT = 2;</code>
     */
    public static final int INSERT_VALUE = 2;
    /**
     * <pre>
     * The delete operator indicates that the read contains evidence of bases
     * being deleted from the reference. This operator is equivalent to SAM's
     * `D`.
     * </pre>
     *
     * <code>DELETE = 3;</code>
     */
    public static final int DELETE_VALUE = 3;
    /**
     * <pre>
     * The skip operator indicates that this read skips a long segment of the
     * reference, but the bases have not been deleted. This operator is commonly
     * used when working with RNA-seq data, where reads may skip long segments
     * of the reference between exons. This operator is equivalent to SAM's
     * `N`.
     * </pre>
     *
     * <code>SKIP = 4;</code>
     */
    public static final int SKIP_VALUE = 4;
    /**
     * <pre>
     * The soft clip operator indicates that bases at the start/end of a read
     * have not been considered during alignment. This may occur if the majority
     * of a read maps, except for low quality bases at the start/end of a read.
     * This operator is equivalent to SAM's `S`. Bases that are soft
     * clipped will still be stored in the read.
     * </pre>
     *
     * <code>CLIP_SOFT = 5;</code>
     */
    public static final int CLIP_SOFT_VALUE = 5;
    /**
     * <pre>
     * The hard clip operator indicates that bases at the start/end of a read
     * have been omitted from this alignment. This may occur if this linear
     * alignment is part of a chimeric alignment, or if the read has been
     * trimmed (for example, during error correction or to trim poly-A tails for
     * RNA-seq). This operator is equivalent to SAM's `H`.
     * </pre>
     *
     * <code>CLIP_HARD = 6;</code>
     */
    public static final int CLIP_HARD_VALUE = 6;
    /**
     * <pre>
     * The pad operator indicates that there is padding in an alignment. This
     * operator is equivalent to SAM's `P`.
     * </pre>
     *
     * <code>PAD = 7;</code>
     */
    public static final int PAD_VALUE = 7;
    /**
     * <pre>
     * This operator indicates that this portion of the aligned sequence exactly
     * matches the reference. This operator is equivalent to SAM's `=`.
     * </pre>
     *
     * <code>SEQUENCE_MATCH = 8;</code>
     */
    public static final int SEQUENCE_MATCH_VALUE = 8;
    /**
     * <pre>
     * This operator indicates that this portion of the aligned sequence is an
     * alignment match to the reference, but a sequence mismatch. This can
     * indicate a SNP or a read error. This operator is equivalent to SAM's
     * `X`.
     * </pre>
     *
     * <code>SEQUENCE_MISMATCH = 9;</code>
     */
    public static final int SEQUENCE_MISMATCH_VALUE = 9;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Operation valueOf(int value) {
      return forNumber(value);
    }

    public static Operation forNumber(int value) {
      switch (value) {
        case 0: return OPERATION_UNSPECIFIED;
        case 1: return ALIGNMENT_MATCH;
        case 2: return INSERT;
        case 3: return DELETE;
        case 4: return SKIP;
        case 5: return CLIP_SOFT;
        case 6: return CLIP_HARD;
        case 7: return PAD;
        case 8: return SEQUENCE_MATCH;
        case 9: return SEQUENCE_MISMATCH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Operation>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Operation> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operation>() {
            public Operation findValueByNumber(int number) {
              return Operation.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.genomics.v1.CigarUnit.getDescriptor().getEnumTypes().get(0);
    }

    private static final Operation[] VALUES = values();

    public static Operation valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Operation(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.genomics.v1.CigarUnit.Operation)
  }

  public static final int OPERATION_FIELD_NUMBER = 1;
  private int operation_;
  /**
   * <code>.google.genomics.v1.CigarUnit.Operation operation = 1;</code>
   */
  public int getOperationValue() {
    return operation_;
  }
  /**
   * <code>.google.genomics.v1.CigarUnit.Operation operation = 1;</code>
   */
  public com.google.genomics.v1.CigarUnit.Operation getOperation() {
    com.google.genomics.v1.CigarUnit.Operation result = com.google.genomics.v1.CigarUnit.Operation.valueOf(operation_);
    return result == null ? com.google.genomics.v1.CigarUnit.Operation.UNRECOGNIZED : result;
  }

  public static final int OPERATION_LENGTH_FIELD_NUMBER = 2;
  private long operationLength_;
  /**
   * <pre>
   * The number of genomic bases that the operation runs for. Required.
   * </pre>
   *
   * <code>int64 operation_length = 2;</code>
   */
  public long getOperationLength() {
    return operationLength_;
  }

  public static final int REFERENCE_SEQUENCE_FIELD_NUMBER = 3;
  private volatile java.lang.Object referenceSequence_;
  /**
   * <pre>
   * `referenceSequence` is only used at mismatches
   * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
   * Filling this field replaces SAM's MD tag. If the relevant information is
   * not available, this field is unset.
   * </pre>
   *
   * <code>string reference_sequence = 3;</code>
   */
  public java.lang.String getReferenceSequence() {
    java.lang.Object ref = referenceSequence_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      referenceSequence_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * `referenceSequence` is only used at mismatches
   * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
   * Filling this field replaces SAM's MD tag. If the relevant information is
   * not available, this field is unset.
   * </pre>
   *
   * <code>string reference_sequence = 3;</code>
   */
  public com.google.protobuf.ByteString
      getReferenceSequenceBytes() {
    java.lang.Object ref = referenceSequence_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      referenceSequence_ = b;
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
    if (operation_ != com.google.genomics.v1.CigarUnit.Operation.OPERATION_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, operation_);
    }
    if (operationLength_ != 0L) {
      output.writeInt64(2, operationLength_);
    }
    if (!getReferenceSequenceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, referenceSequence_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operation_ != com.google.genomics.v1.CigarUnit.Operation.OPERATION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, operation_);
    }
    if (operationLength_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, operationLength_);
    }
    if (!getReferenceSequenceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, referenceSequence_);
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
    if (!(obj instanceof com.google.genomics.v1.CigarUnit)) {
      return super.equals(obj);
    }
    com.google.genomics.v1.CigarUnit other = (com.google.genomics.v1.CigarUnit) obj;

    boolean result = true;
    result = result && operation_ == other.operation_;
    result = result && (getOperationLength()
        == other.getOperationLength());
    result = result && getReferenceSequence()
        .equals(other.getReferenceSequence());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + OPERATION_FIELD_NUMBER;
    hash = (53 * hash) + operation_;
    hash = (37 * hash) + OPERATION_LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOperationLength());
    hash = (37 * hash) + REFERENCE_SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + getReferenceSequence().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.genomics.v1.CigarUnit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1.CigarUnit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.CigarUnit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.CigarUnit parseFrom(
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
  public static Builder newBuilder(com.google.genomics.v1.CigarUnit prototype) {
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
   * A single CIGAR operation.
   * </pre>
   *
   * Protobuf type {@code google.genomics.v1.CigarUnit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.CigarUnit)
      com.google.genomics.v1.CigarUnitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.CigarProto.internal_static_google_genomics_v1_CigarUnit_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.CigarProto.internal_static_google_genomics_v1_CigarUnit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.CigarUnit.class, com.google.genomics.v1.CigarUnit.Builder.class);
    }

    // Construct using com.google.genomics.v1.CigarUnit.newBuilder()
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
      operation_ = 0;

      operationLength_ = 0L;

      referenceSequence_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.CigarProto.internal_static_google_genomics_v1_CigarUnit_descriptor;
    }

    public com.google.genomics.v1.CigarUnit getDefaultInstanceForType() {
      return com.google.genomics.v1.CigarUnit.getDefaultInstance();
    }

    public com.google.genomics.v1.CigarUnit build() {
      com.google.genomics.v1.CigarUnit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.CigarUnit buildPartial() {
      com.google.genomics.v1.CigarUnit result = new com.google.genomics.v1.CigarUnit(this);
      result.operation_ = operation_;
      result.operationLength_ = operationLength_;
      result.referenceSequence_ = referenceSequence_;
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
      if (other instanceof com.google.genomics.v1.CigarUnit) {
        return mergeFrom((com.google.genomics.v1.CigarUnit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.CigarUnit other) {
      if (other == com.google.genomics.v1.CigarUnit.getDefaultInstance()) return this;
      if (other.operation_ != 0) {
        setOperationValue(other.getOperationValue());
      }
      if (other.getOperationLength() != 0L) {
        setOperationLength(other.getOperationLength());
      }
      if (!other.getReferenceSequence().isEmpty()) {
        referenceSequence_ = other.referenceSequence_;
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
      com.google.genomics.v1.CigarUnit parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.CigarUnit) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int operation_ = 0;
    /**
     * <code>.google.genomics.v1.CigarUnit.Operation operation = 1;</code>
     */
    public int getOperationValue() {
      return operation_;
    }
    /**
     * <code>.google.genomics.v1.CigarUnit.Operation operation = 1;</code>
     */
    public Builder setOperationValue(int value) {
      operation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.google.genomics.v1.CigarUnit.Operation operation = 1;</code>
     */
    public com.google.genomics.v1.CigarUnit.Operation getOperation() {
      com.google.genomics.v1.CigarUnit.Operation result = com.google.genomics.v1.CigarUnit.Operation.valueOf(operation_);
      return result == null ? com.google.genomics.v1.CigarUnit.Operation.UNRECOGNIZED : result;
    }
    /**
     * <code>.google.genomics.v1.CigarUnit.Operation operation = 1;</code>
     */
    public Builder setOperation(com.google.genomics.v1.CigarUnit.Operation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      operation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.google.genomics.v1.CigarUnit.Operation operation = 1;</code>
     */
    public Builder clearOperation() {
      
      operation_ = 0;
      onChanged();
      return this;
    }

    private long operationLength_ ;
    /**
     * <pre>
     * The number of genomic bases that the operation runs for. Required.
     * </pre>
     *
     * <code>int64 operation_length = 2;</code>
     */
    public long getOperationLength() {
      return operationLength_;
    }
    /**
     * <pre>
     * The number of genomic bases that the operation runs for. Required.
     * </pre>
     *
     * <code>int64 operation_length = 2;</code>
     */
    public Builder setOperationLength(long value) {
      
      operationLength_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of genomic bases that the operation runs for. Required.
     * </pre>
     *
     * <code>int64 operation_length = 2;</code>
     */
    public Builder clearOperationLength() {
      
      operationLength_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object referenceSequence_ = "";
    /**
     * <pre>
     * `referenceSequence` is only used at mismatches
     * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
     * Filling this field replaces SAM's MD tag. If the relevant information is
     * not available, this field is unset.
     * </pre>
     *
     * <code>string reference_sequence = 3;</code>
     */
    public java.lang.String getReferenceSequence() {
      java.lang.Object ref = referenceSequence_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        referenceSequence_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * `referenceSequence` is only used at mismatches
     * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
     * Filling this field replaces SAM's MD tag. If the relevant information is
     * not available, this field is unset.
     * </pre>
     *
     * <code>string reference_sequence = 3;</code>
     */
    public com.google.protobuf.ByteString
        getReferenceSequenceBytes() {
      java.lang.Object ref = referenceSequence_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        referenceSequence_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * `referenceSequence` is only used at mismatches
     * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
     * Filling this field replaces SAM's MD tag. If the relevant information is
     * not available, this field is unset.
     * </pre>
     *
     * <code>string reference_sequence = 3;</code>
     */
    public Builder setReferenceSequence(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      referenceSequence_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `referenceSequence` is only used at mismatches
     * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
     * Filling this field replaces SAM's MD tag. If the relevant information is
     * not available, this field is unset.
     * </pre>
     *
     * <code>string reference_sequence = 3;</code>
     */
    public Builder clearReferenceSequence() {
      
      referenceSequence_ = getDefaultInstance().getReferenceSequence();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `referenceSequence` is only used at mismatches
     * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
     * Filling this field replaces SAM's MD tag. If the relevant information is
     * not available, this field is unset.
     * </pre>
     *
     * <code>string reference_sequence = 3;</code>
     */
    public Builder setReferenceSequenceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      referenceSequence_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.CigarUnit)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.CigarUnit)
  private static final com.google.genomics.v1.CigarUnit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.genomics.v1.CigarUnit();
  }

  public static com.google.genomics.v1.CigarUnit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CigarUnit>
      PARSER = new com.google.protobuf.AbstractParser<CigarUnit>() {
    public CigarUnit parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CigarUnit(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CigarUnit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CigarUnit> getParserForType() {
    return PARSER;
  }

  public com.google.genomics.v1.CigarUnit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

