// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 * <pre>
 * ListOperationsResponse is the result of ListOperationsRequest.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.ListOperationsResponse}
 */
public  final class ListOperationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1.ListOperationsResponse)
    ListOperationsResponseOrBuilder {
  // Use ListOperationsResponse.newBuilder() to construct.
  private ListOperationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListOperationsResponse() {
    operations_ = java.util.Collections.emptyList();
    missingZones_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListOperationsResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              operations_ = new java.util.ArrayList<com.google.container.v1.Operation>();
              mutable_bitField0_ |= 0x00000001;
            }
            operations_.add(
                input.readMessage(com.google.container.v1.Operation.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              missingZones_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            missingZones_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        operations_ = java.util.Collections.unmodifiableList(operations_);
      }
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        missingZones_ = missingZones_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_ListOperationsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_ListOperationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.ListOperationsResponse.class, com.google.container.v1.ListOperationsResponse.Builder.class);
  }

  public static final int OPERATIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.container.v1.Operation> operations_;
  /**
   * <pre>
   * A list of operations in the project in the specified zone.
   * </pre>
   *
   * <code>repeated .google.container.v1.Operation operations = 1;</code>
   */
  public java.util.List<com.google.container.v1.Operation> getOperationsList() {
    return operations_;
  }
  /**
   * <pre>
   * A list of operations in the project in the specified zone.
   * </pre>
   *
   * <code>repeated .google.container.v1.Operation operations = 1;</code>
   */
  public java.util.List<? extends com.google.container.v1.OperationOrBuilder> 
      getOperationsOrBuilderList() {
    return operations_;
  }
  /**
   * <pre>
   * A list of operations in the project in the specified zone.
   * </pre>
   *
   * <code>repeated .google.container.v1.Operation operations = 1;</code>
   */
  public int getOperationsCount() {
    return operations_.size();
  }
  /**
   * <pre>
   * A list of operations in the project in the specified zone.
   * </pre>
   *
   * <code>repeated .google.container.v1.Operation operations = 1;</code>
   */
  public com.google.container.v1.Operation getOperations(int index) {
    return operations_.get(index);
  }
  /**
   * <pre>
   * A list of operations in the project in the specified zone.
   * </pre>
   *
   * <code>repeated .google.container.v1.Operation operations = 1;</code>
   */
  public com.google.container.v1.OperationOrBuilder getOperationsOrBuilder(
      int index) {
    return operations_.get(index);
  }

  public static final int MISSING_ZONES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList missingZones_;
  /**
   * <pre>
   * If any zones are listed here, the list of operations returned
   * may be missing the operations from those zones.
   * </pre>
   *
   * <code>repeated string missing_zones = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getMissingZonesList() {
    return missingZones_;
  }
  /**
   * <pre>
   * If any zones are listed here, the list of operations returned
   * may be missing the operations from those zones.
   * </pre>
   *
   * <code>repeated string missing_zones = 2;</code>
   */
  public int getMissingZonesCount() {
    return missingZones_.size();
  }
  /**
   * <pre>
   * If any zones are listed here, the list of operations returned
   * may be missing the operations from those zones.
   * </pre>
   *
   * <code>repeated string missing_zones = 2;</code>
   */
  public java.lang.String getMissingZones(int index) {
    return missingZones_.get(index);
  }
  /**
   * <pre>
   * If any zones are listed here, the list of operations returned
   * may be missing the operations from those zones.
   * </pre>
   *
   * <code>repeated string missing_zones = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMissingZonesBytes(int index) {
    return missingZones_.getByteString(index);
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
    for (int i = 0; i < operations_.size(); i++) {
      output.writeMessage(1, operations_.get(i));
    }
    for (int i = 0; i < missingZones_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, missingZones_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < operations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, operations_.get(i));
    }
    {
      int dataSize = 0;
      for (int i = 0; i < missingZones_.size(); i++) {
        dataSize += computeStringSizeNoTag(missingZones_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMissingZonesList().size();
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
    if (!(obj instanceof com.google.container.v1.ListOperationsResponse)) {
      return super.equals(obj);
    }
    com.google.container.v1.ListOperationsResponse other = (com.google.container.v1.ListOperationsResponse) obj;

    boolean result = true;
    result = result && getOperationsList()
        .equals(other.getOperationsList());
    result = result && getMissingZonesList()
        .equals(other.getMissingZonesList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getOperationsCount() > 0) {
      hash = (37 * hash) + OPERATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOperationsList().hashCode();
    }
    if (getMissingZonesCount() > 0) {
      hash = (37 * hash) + MISSING_ZONES_FIELD_NUMBER;
      hash = (53 * hash) + getMissingZonesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.ListOperationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.ListOperationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.ListOperationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.ListOperationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.ListOperationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.ListOperationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.ListOperationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1.ListOperationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.ListOperationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.ListOperationsResponse parseFrom(
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
  public static Builder newBuilder(com.google.container.v1.ListOperationsResponse prototype) {
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
   * ListOperationsResponse is the result of ListOperationsRequest.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.ListOperationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.ListOperationsResponse)
      com.google.container.v1.ListOperationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_ListOperationsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_ListOperationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.ListOperationsResponse.class, com.google.container.v1.ListOperationsResponse.Builder.class);
    }

    // Construct using com.google.container.v1.ListOperationsResponse.newBuilder()
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
        getOperationsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (operationsBuilder_ == null) {
        operations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        operationsBuilder_.clear();
      }
      missingZones_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_ListOperationsResponse_descriptor;
    }

    public com.google.container.v1.ListOperationsResponse getDefaultInstanceForType() {
      return com.google.container.v1.ListOperationsResponse.getDefaultInstance();
    }

    public com.google.container.v1.ListOperationsResponse build() {
      com.google.container.v1.ListOperationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.container.v1.ListOperationsResponse buildPartial() {
      com.google.container.v1.ListOperationsResponse result = new com.google.container.v1.ListOperationsResponse(this);
      int from_bitField0_ = bitField0_;
      if (operationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          operations_ = java.util.Collections.unmodifiableList(operations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.operations_ = operations_;
      } else {
        result.operations_ = operationsBuilder_.build();
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        missingZones_ = missingZones_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.missingZones_ = missingZones_;
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
      if (other instanceof com.google.container.v1.ListOperationsResponse) {
        return mergeFrom((com.google.container.v1.ListOperationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.ListOperationsResponse other) {
      if (other == com.google.container.v1.ListOperationsResponse.getDefaultInstance()) return this;
      if (operationsBuilder_ == null) {
        if (!other.operations_.isEmpty()) {
          if (operations_.isEmpty()) {
            operations_ = other.operations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOperationsIsMutable();
            operations_.addAll(other.operations_);
          }
          onChanged();
        }
      } else {
        if (!other.operations_.isEmpty()) {
          if (operationsBuilder_.isEmpty()) {
            operationsBuilder_.dispose();
            operationsBuilder_ = null;
            operations_ = other.operations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            operationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOperationsFieldBuilder() : null;
          } else {
            operationsBuilder_.addAllMessages(other.operations_);
          }
        }
      }
      if (!other.missingZones_.isEmpty()) {
        if (missingZones_.isEmpty()) {
          missingZones_ = other.missingZones_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureMissingZonesIsMutable();
          missingZones_.addAll(other.missingZones_);
        }
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
      com.google.container.v1.ListOperationsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1.ListOperationsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.container.v1.Operation> operations_ =
      java.util.Collections.emptyList();
    private void ensureOperationsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        operations_ = new java.util.ArrayList<com.google.container.v1.Operation>(operations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.container.v1.Operation, com.google.container.v1.Operation.Builder, com.google.container.v1.OperationOrBuilder> operationsBuilder_;

    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public java.util.List<com.google.container.v1.Operation> getOperationsList() {
      if (operationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(operations_);
      } else {
        return operationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public int getOperationsCount() {
      if (operationsBuilder_ == null) {
        return operations_.size();
      } else {
        return operationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public com.google.container.v1.Operation getOperations(int index) {
      if (operationsBuilder_ == null) {
        return operations_.get(index);
      } else {
        return operationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public Builder setOperations(
        int index, com.google.container.v1.Operation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.set(index, value);
        onChanged();
      } else {
        operationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public Builder setOperations(
        int index, com.google.container.v1.Operation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.set(index, builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public Builder addOperations(com.google.container.v1.Operation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.add(value);
        onChanged();
      } else {
        operationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public Builder addOperations(
        int index, com.google.container.v1.Operation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.add(index, value);
        onChanged();
      } else {
        operationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public Builder addOperations(
        com.google.container.v1.Operation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.add(builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public Builder addOperations(
        int index, com.google.container.v1.Operation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.add(index, builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public Builder addAllOperations(
        java.lang.Iterable<? extends com.google.container.v1.Operation> values) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, operations_);
        onChanged();
      } else {
        operationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public Builder clearOperations() {
      if (operationsBuilder_ == null) {
        operations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        operationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public Builder removeOperations(int index) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.remove(index);
        onChanged();
      } else {
        operationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public com.google.container.v1.Operation.Builder getOperationsBuilder(
        int index) {
      return getOperationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public com.google.container.v1.OperationOrBuilder getOperationsOrBuilder(
        int index) {
      if (operationsBuilder_ == null) {
        return operations_.get(index);  } else {
        return operationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public java.util.List<? extends com.google.container.v1.OperationOrBuilder> 
         getOperationsOrBuilderList() {
      if (operationsBuilder_ != null) {
        return operationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(operations_);
      }
    }
    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public com.google.container.v1.Operation.Builder addOperationsBuilder() {
      return getOperationsFieldBuilder().addBuilder(
          com.google.container.v1.Operation.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public com.google.container.v1.Operation.Builder addOperationsBuilder(
        int index) {
      return getOperationsFieldBuilder().addBuilder(
          index, com.google.container.v1.Operation.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of operations in the project in the specified zone.
     * </pre>
     *
     * <code>repeated .google.container.v1.Operation operations = 1;</code>
     */
    public java.util.List<com.google.container.v1.Operation.Builder> 
         getOperationsBuilderList() {
      return getOperationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.container.v1.Operation, com.google.container.v1.Operation.Builder, com.google.container.v1.OperationOrBuilder> 
        getOperationsFieldBuilder() {
      if (operationsBuilder_ == null) {
        operationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.container.v1.Operation, com.google.container.v1.Operation.Builder, com.google.container.v1.OperationOrBuilder>(
                operations_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        operations_ = null;
      }
      return operationsBuilder_;
    }

    private com.google.protobuf.LazyStringList missingZones_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMissingZonesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        missingZones_ = new com.google.protobuf.LazyStringArrayList(missingZones_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * If any zones are listed here, the list of operations returned
     * may be missing the operations from those zones.
     * </pre>
     *
     * <code>repeated string missing_zones = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getMissingZonesList() {
      return missingZones_.getUnmodifiableView();
    }
    /**
     * <pre>
     * If any zones are listed here, the list of operations returned
     * may be missing the operations from those zones.
     * </pre>
     *
     * <code>repeated string missing_zones = 2;</code>
     */
    public int getMissingZonesCount() {
      return missingZones_.size();
    }
    /**
     * <pre>
     * If any zones are listed here, the list of operations returned
     * may be missing the operations from those zones.
     * </pre>
     *
     * <code>repeated string missing_zones = 2;</code>
     */
    public java.lang.String getMissingZones(int index) {
      return missingZones_.get(index);
    }
    /**
     * <pre>
     * If any zones are listed here, the list of operations returned
     * may be missing the operations from those zones.
     * </pre>
     *
     * <code>repeated string missing_zones = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMissingZonesBytes(int index) {
      return missingZones_.getByteString(index);
    }
    /**
     * <pre>
     * If any zones are listed here, the list of operations returned
     * may be missing the operations from those zones.
     * </pre>
     *
     * <code>repeated string missing_zones = 2;</code>
     */
    public Builder setMissingZones(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMissingZonesIsMutable();
      missingZones_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If any zones are listed here, the list of operations returned
     * may be missing the operations from those zones.
     * </pre>
     *
     * <code>repeated string missing_zones = 2;</code>
     */
    public Builder addMissingZones(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMissingZonesIsMutable();
      missingZones_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If any zones are listed here, the list of operations returned
     * may be missing the operations from those zones.
     * </pre>
     *
     * <code>repeated string missing_zones = 2;</code>
     */
    public Builder addAllMissingZones(
        java.lang.Iterable<java.lang.String> values) {
      ensureMissingZonesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, missingZones_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If any zones are listed here, the list of operations returned
     * may be missing the operations from those zones.
     * </pre>
     *
     * <code>repeated string missing_zones = 2;</code>
     */
    public Builder clearMissingZones() {
      missingZones_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If any zones are listed here, the list of operations returned
     * may be missing the operations from those zones.
     * </pre>
     *
     * <code>repeated string missing_zones = 2;</code>
     */
    public Builder addMissingZonesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureMissingZonesIsMutable();
      missingZones_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.container.v1.ListOperationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.ListOperationsResponse)
  private static final com.google.container.v1.ListOperationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1.ListOperationsResponse();
  }

  public static com.google.container.v1.ListOperationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOperationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListOperationsResponse>() {
    public ListOperationsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListOperationsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListOperationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOperationsResponse> getParserForType() {
    return PARSER;
  }

  public com.google.container.v1.ListOperationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

