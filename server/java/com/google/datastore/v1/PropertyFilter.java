// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/query.proto

package com.google.datastore.v1;

/**
 * <pre>
 * A filter on a specific property.
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1.PropertyFilter}
 */
public  final class PropertyFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1.PropertyFilter)
    PropertyFilterOrBuilder {
  // Use PropertyFilter.newBuilder() to construct.
  private PropertyFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PropertyFilter() {
    op_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PropertyFilter(
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
            com.google.datastore.v1.PropertyReference.Builder subBuilder = null;
            if (property_ != null) {
              subBuilder = property_.toBuilder();
            }
            property_ = input.readMessage(com.google.datastore.v1.PropertyReference.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(property_);
              property_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            op_ = rawValue;
            break;
          }
          case 26: {
            com.google.datastore.v1.Value.Builder subBuilder = null;
            if (value_ != null) {
              subBuilder = value_.toBuilder();
            }
            value_ = input.readMessage(com.google.datastore.v1.Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(value_);
              value_ = subBuilder.buildPartial();
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
    return com.google.datastore.v1.QueryProto.internal_static_google_datastore_v1_PropertyFilter_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1.QueryProto.internal_static_google_datastore_v1_PropertyFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1.PropertyFilter.class, com.google.datastore.v1.PropertyFilter.Builder.class);
  }

  /**
   * <pre>
   * A property filter operator.
   * </pre>
   *
   * Protobuf enum {@code google.datastore.v1.PropertyFilter.Operator}
   */
  public enum Operator
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified. This value must not be used.
     * </pre>
     *
     * <code>OPERATOR_UNSPECIFIED = 0;</code>
     */
    OPERATOR_UNSPECIFIED(0),
    /**
     * <pre>
     * Less than.
     * </pre>
     *
     * <code>LESS_THAN = 1;</code>
     */
    LESS_THAN(1),
    /**
     * <pre>
     * Less than or equal.
     * </pre>
     *
     * <code>LESS_THAN_OR_EQUAL = 2;</code>
     */
    LESS_THAN_OR_EQUAL(2),
    /**
     * <pre>
     * Greater than.
     * </pre>
     *
     * <code>GREATER_THAN = 3;</code>
     */
    GREATER_THAN(3),
    /**
     * <pre>
     * Greater than or equal.
     * </pre>
     *
     * <code>GREATER_THAN_OR_EQUAL = 4;</code>
     */
    GREATER_THAN_OR_EQUAL(4),
    /**
     * <pre>
     * Equal.
     * </pre>
     *
     * <code>EQUAL = 5;</code>
     */
    EQUAL(5),
    /**
     * <pre>
     * Has ancestor.
     * </pre>
     *
     * <code>HAS_ANCESTOR = 11;</code>
     */
    HAS_ANCESTOR(11),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified. This value must not be used.
     * </pre>
     *
     * <code>OPERATOR_UNSPECIFIED = 0;</code>
     */
    public static final int OPERATOR_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Less than.
     * </pre>
     *
     * <code>LESS_THAN = 1;</code>
     */
    public static final int LESS_THAN_VALUE = 1;
    /**
     * <pre>
     * Less than or equal.
     * </pre>
     *
     * <code>LESS_THAN_OR_EQUAL = 2;</code>
     */
    public static final int LESS_THAN_OR_EQUAL_VALUE = 2;
    /**
     * <pre>
     * Greater than.
     * </pre>
     *
     * <code>GREATER_THAN = 3;</code>
     */
    public static final int GREATER_THAN_VALUE = 3;
    /**
     * <pre>
     * Greater than or equal.
     * </pre>
     *
     * <code>GREATER_THAN_OR_EQUAL = 4;</code>
     */
    public static final int GREATER_THAN_OR_EQUAL_VALUE = 4;
    /**
     * <pre>
     * Equal.
     * </pre>
     *
     * <code>EQUAL = 5;</code>
     */
    public static final int EQUAL_VALUE = 5;
    /**
     * <pre>
     * Has ancestor.
     * </pre>
     *
     * <code>HAS_ANCESTOR = 11;</code>
     */
    public static final int HAS_ANCESTOR_VALUE = 11;


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
    public static Operator valueOf(int value) {
      return forNumber(value);
    }

    public static Operator forNumber(int value) {
      switch (value) {
        case 0: return OPERATOR_UNSPECIFIED;
        case 1: return LESS_THAN;
        case 2: return LESS_THAN_OR_EQUAL;
        case 3: return GREATER_THAN;
        case 4: return GREATER_THAN_OR_EQUAL;
        case 5: return EQUAL;
        case 11: return HAS_ANCESTOR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Operator>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Operator> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operator>() {
            public Operator findValueByNumber(int number) {
              return Operator.forNumber(number);
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
      return com.google.datastore.v1.PropertyFilter.getDescriptor().getEnumTypes().get(0);
    }

    private static final Operator[] VALUES = values();

    public static Operator valueOf(
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

    private Operator(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.datastore.v1.PropertyFilter.Operator)
  }

  public static final int PROPERTY_FIELD_NUMBER = 1;
  private com.google.datastore.v1.PropertyReference property_;
  /**
   * <pre>
   * The property to filter by.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyReference property = 1;</code>
   */
  public boolean hasProperty() {
    return property_ != null;
  }
  /**
   * <pre>
   * The property to filter by.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyReference property = 1;</code>
   */
  public com.google.datastore.v1.PropertyReference getProperty() {
    return property_ == null ? com.google.datastore.v1.PropertyReference.getDefaultInstance() : property_;
  }
  /**
   * <pre>
   * The property to filter by.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyReference property = 1;</code>
   */
  public com.google.datastore.v1.PropertyReferenceOrBuilder getPropertyOrBuilder() {
    return getProperty();
  }

  public static final int OP_FIELD_NUMBER = 2;
  private int op_;
  /**
   * <pre>
   * The operator to filter by.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyFilter.Operator op = 2;</code>
   */
  public int getOpValue() {
    return op_;
  }
  /**
   * <pre>
   * The operator to filter by.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyFilter.Operator op = 2;</code>
   */
  public com.google.datastore.v1.PropertyFilter.Operator getOp() {
    com.google.datastore.v1.PropertyFilter.Operator result = com.google.datastore.v1.PropertyFilter.Operator.valueOf(op_);
    return result == null ? com.google.datastore.v1.PropertyFilter.Operator.UNRECOGNIZED : result;
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private com.google.datastore.v1.Value value_;
  /**
   * <pre>
   * The value to compare the property to.
   * </pre>
   *
   * <code>.google.datastore.v1.Value value = 3;</code>
   */
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   * <pre>
   * The value to compare the property to.
   * </pre>
   *
   * <code>.google.datastore.v1.Value value = 3;</code>
   */
  public com.google.datastore.v1.Value getValue() {
    return value_ == null ? com.google.datastore.v1.Value.getDefaultInstance() : value_;
  }
  /**
   * <pre>
   * The value to compare the property to.
   * </pre>
   *
   * <code>.google.datastore.v1.Value value = 3;</code>
   */
  public com.google.datastore.v1.ValueOrBuilder getValueOrBuilder() {
    return getValue();
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
    if (property_ != null) {
      output.writeMessage(1, getProperty());
    }
    if (op_ != com.google.datastore.v1.PropertyFilter.Operator.OPERATOR_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, op_);
    }
    if (value_ != null) {
      output.writeMessage(3, getValue());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (property_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProperty());
    }
    if (op_ != com.google.datastore.v1.PropertyFilter.Operator.OPERATOR_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, op_);
    }
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getValue());
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
    if (!(obj instanceof com.google.datastore.v1.PropertyFilter)) {
      return super.equals(obj);
    }
    com.google.datastore.v1.PropertyFilter other = (com.google.datastore.v1.PropertyFilter) obj;

    boolean result = true;
    result = result && (hasProperty() == other.hasProperty());
    if (hasProperty()) {
      result = result && getProperty()
          .equals(other.getProperty());
    }
    result = result && op_ == other.op_;
    result = result && (hasValue() == other.hasValue());
    if (hasValue()) {
      result = result && getValue()
          .equals(other.getValue());
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
    if (hasProperty()) {
      hash = (37 * hash) + PROPERTY_FIELD_NUMBER;
      hash = (53 * hash) + getProperty().hashCode();
    }
    hash = (37 * hash) + OP_FIELD_NUMBER;
    hash = (53 * hash) + op_;
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1.PropertyFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.PropertyFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.PropertyFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.PropertyFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.PropertyFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.PropertyFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1.PropertyFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.PropertyFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1.PropertyFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.PropertyFilter parseFrom(
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
  public static Builder newBuilder(com.google.datastore.v1.PropertyFilter prototype) {
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
   * A filter on a specific property.
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1.PropertyFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1.PropertyFilter)
      com.google.datastore.v1.PropertyFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.datastore.v1.QueryProto.internal_static_google_datastore_v1_PropertyFilter_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1.QueryProto.internal_static_google_datastore_v1_PropertyFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1.PropertyFilter.class, com.google.datastore.v1.PropertyFilter.Builder.class);
    }

    // Construct using com.google.datastore.v1.PropertyFilter.newBuilder()
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
      if (propertyBuilder_ == null) {
        property_ = null;
      } else {
        property_ = null;
        propertyBuilder_ = null;
      }
      op_ = 0;

      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        value_ = null;
        valueBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.datastore.v1.QueryProto.internal_static_google_datastore_v1_PropertyFilter_descriptor;
    }

    public com.google.datastore.v1.PropertyFilter getDefaultInstanceForType() {
      return com.google.datastore.v1.PropertyFilter.getDefaultInstance();
    }

    public com.google.datastore.v1.PropertyFilter build() {
      com.google.datastore.v1.PropertyFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.datastore.v1.PropertyFilter buildPartial() {
      com.google.datastore.v1.PropertyFilter result = new com.google.datastore.v1.PropertyFilter(this);
      if (propertyBuilder_ == null) {
        result.property_ = property_;
      } else {
        result.property_ = propertyBuilder_.build();
      }
      result.op_ = op_;
      if (valueBuilder_ == null) {
        result.value_ = value_;
      } else {
        result.value_ = valueBuilder_.build();
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
      if (other instanceof com.google.datastore.v1.PropertyFilter) {
        return mergeFrom((com.google.datastore.v1.PropertyFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1.PropertyFilter other) {
      if (other == com.google.datastore.v1.PropertyFilter.getDefaultInstance()) return this;
      if (other.hasProperty()) {
        mergeProperty(other.getProperty());
      }
      if (other.op_ != 0) {
        setOpValue(other.getOpValue());
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
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
      com.google.datastore.v1.PropertyFilter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.datastore.v1.PropertyFilter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.datastore.v1.PropertyReference property_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.datastore.v1.PropertyReference, com.google.datastore.v1.PropertyReference.Builder, com.google.datastore.v1.PropertyReferenceOrBuilder> propertyBuilder_;
    /**
     * <pre>
     * The property to filter by.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyReference property = 1;</code>
     */
    public boolean hasProperty() {
      return propertyBuilder_ != null || property_ != null;
    }
    /**
     * <pre>
     * The property to filter by.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyReference property = 1;</code>
     */
    public com.google.datastore.v1.PropertyReference getProperty() {
      if (propertyBuilder_ == null) {
        return property_ == null ? com.google.datastore.v1.PropertyReference.getDefaultInstance() : property_;
      } else {
        return propertyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The property to filter by.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyReference property = 1;</code>
     */
    public Builder setProperty(com.google.datastore.v1.PropertyReference value) {
      if (propertyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        property_ = value;
        onChanged();
      } else {
        propertyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The property to filter by.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyReference property = 1;</code>
     */
    public Builder setProperty(
        com.google.datastore.v1.PropertyReference.Builder builderForValue) {
      if (propertyBuilder_ == null) {
        property_ = builderForValue.build();
        onChanged();
      } else {
        propertyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The property to filter by.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyReference property = 1;</code>
     */
    public Builder mergeProperty(com.google.datastore.v1.PropertyReference value) {
      if (propertyBuilder_ == null) {
        if (property_ != null) {
          property_ =
            com.google.datastore.v1.PropertyReference.newBuilder(property_).mergeFrom(value).buildPartial();
        } else {
          property_ = value;
        }
        onChanged();
      } else {
        propertyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The property to filter by.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyReference property = 1;</code>
     */
    public Builder clearProperty() {
      if (propertyBuilder_ == null) {
        property_ = null;
        onChanged();
      } else {
        property_ = null;
        propertyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The property to filter by.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyReference property = 1;</code>
     */
    public com.google.datastore.v1.PropertyReference.Builder getPropertyBuilder() {
      
      onChanged();
      return getPropertyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The property to filter by.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyReference property = 1;</code>
     */
    public com.google.datastore.v1.PropertyReferenceOrBuilder getPropertyOrBuilder() {
      if (propertyBuilder_ != null) {
        return propertyBuilder_.getMessageOrBuilder();
      } else {
        return property_ == null ?
            com.google.datastore.v1.PropertyReference.getDefaultInstance() : property_;
      }
    }
    /**
     * <pre>
     * The property to filter by.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyReference property = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.datastore.v1.PropertyReference, com.google.datastore.v1.PropertyReference.Builder, com.google.datastore.v1.PropertyReferenceOrBuilder> 
        getPropertyFieldBuilder() {
      if (propertyBuilder_ == null) {
        propertyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1.PropertyReference, com.google.datastore.v1.PropertyReference.Builder, com.google.datastore.v1.PropertyReferenceOrBuilder>(
                getProperty(),
                getParentForChildren(),
                isClean());
        property_ = null;
      }
      return propertyBuilder_;
    }

    private int op_ = 0;
    /**
     * <pre>
     * The operator to filter by.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyFilter.Operator op = 2;</code>
     */
    public int getOpValue() {
      return op_;
    }
    /**
     * <pre>
     * The operator to filter by.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyFilter.Operator op = 2;</code>
     */
    public Builder setOpValue(int value) {
      op_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The operator to filter by.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyFilter.Operator op = 2;</code>
     */
    public com.google.datastore.v1.PropertyFilter.Operator getOp() {
      com.google.datastore.v1.PropertyFilter.Operator result = com.google.datastore.v1.PropertyFilter.Operator.valueOf(op_);
      return result == null ? com.google.datastore.v1.PropertyFilter.Operator.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The operator to filter by.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyFilter.Operator op = 2;</code>
     */
    public Builder setOp(com.google.datastore.v1.PropertyFilter.Operator value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      op_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The operator to filter by.
     * </pre>
     *
     * <code>.google.datastore.v1.PropertyFilter.Operator op = 2;</code>
     */
    public Builder clearOp() {
      
      op_ = 0;
      onChanged();
      return this;
    }

    private com.google.datastore.v1.Value value_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.datastore.v1.Value, com.google.datastore.v1.Value.Builder, com.google.datastore.v1.ValueOrBuilder> valueBuilder_;
    /**
     * <pre>
     * The value to compare the property to.
     * </pre>
     *
     * <code>.google.datastore.v1.Value value = 3;</code>
     */
    public boolean hasValue() {
      return valueBuilder_ != null || value_ != null;
    }
    /**
     * <pre>
     * The value to compare the property to.
     * </pre>
     *
     * <code>.google.datastore.v1.Value value = 3;</code>
     */
    public com.google.datastore.v1.Value getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.google.datastore.v1.Value.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The value to compare the property to.
     * </pre>
     *
     * <code>.google.datastore.v1.Value value = 3;</code>
     */
    public Builder setValue(com.google.datastore.v1.Value value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The value to compare the property to.
     * </pre>
     *
     * <code>.google.datastore.v1.Value value = 3;</code>
     */
    public Builder setValue(
        com.google.datastore.v1.Value.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The value to compare the property to.
     * </pre>
     *
     * <code>.google.datastore.v1.Value value = 3;</code>
     */
    public Builder mergeValue(com.google.datastore.v1.Value value) {
      if (valueBuilder_ == null) {
        if (value_ != null) {
          value_ =
            com.google.datastore.v1.Value.newBuilder(value_).mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        valueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The value to compare the property to.
     * </pre>
     *
     * <code>.google.datastore.v1.Value value = 3;</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        value_ = null;
        valueBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The value to compare the property to.
     * </pre>
     *
     * <code>.google.datastore.v1.Value value = 3;</code>
     */
    public com.google.datastore.v1.Value.Builder getValueBuilder() {
      
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The value to compare the property to.
     * </pre>
     *
     * <code>.google.datastore.v1.Value value = 3;</code>
     */
    public com.google.datastore.v1.ValueOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            com.google.datastore.v1.Value.getDefaultInstance() : value_;
      }
    }
    /**
     * <pre>
     * The value to compare the property to.
     * </pre>
     *
     * <code>.google.datastore.v1.Value value = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.datastore.v1.Value, com.google.datastore.v1.Value.Builder, com.google.datastore.v1.ValueOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1.Value, com.google.datastore.v1.Value.Builder, com.google.datastore.v1.ValueOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.datastore.v1.PropertyFilter)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1.PropertyFilter)
  private static final com.google.datastore.v1.PropertyFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1.PropertyFilter();
  }

  public static com.google.datastore.v1.PropertyFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PropertyFilter>
      PARSER = new com.google.protobuf.AbstractParser<PropertyFilter>() {
    public PropertyFilter parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PropertyFilter(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PropertyFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PropertyFilter> getParserForType() {
    return PARSER;
  }

  public com.google.datastore.v1.PropertyFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

