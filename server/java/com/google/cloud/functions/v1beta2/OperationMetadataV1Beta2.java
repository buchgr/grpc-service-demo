// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v1beta2/operations.proto

package com.google.cloud.functions.v1beta2;

/**
 * <pre>
 * Metadata describing an [Operation][google.longrunning.Operation]
 * </pre>
 *
 * Protobuf type {@code google.cloud.functions.v1beta2.OperationMetadataV1Beta2}
 */
public  final class OperationMetadataV1Beta2 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.functions.v1beta2.OperationMetadataV1Beta2)
    OperationMetadataV1Beta2OrBuilder {
  // Use OperationMetadataV1Beta2.newBuilder() to construct.
  private OperationMetadataV1Beta2(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OperationMetadataV1Beta2() {
    target_ = "";
    type_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private OperationMetadataV1Beta2(
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

            target_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 26: {
            com.google.protobuf.Any.Builder subBuilder = null;
            if (request_ != null) {
              subBuilder = request_.toBuilder();
            }
            request_ = input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(request_);
              request_ = subBuilder.buildPartial();
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
    return com.google.cloud.functions.v1beta2.FunctionsOperationsProto.internal_static_google_cloud_functions_v1beta2_OperationMetadataV1Beta2_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.functions.v1beta2.FunctionsOperationsProto.internal_static_google_cloud_functions_v1beta2_OperationMetadataV1Beta2_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2.class, com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2.Builder.class);
  }

  public static final int TARGET_FIELD_NUMBER = 1;
  private volatile java.lang.Object target_;
  /**
   * <pre>
   * Target of the operation - for example
   * projects/project-1/locations/region-1/functions/function-1
   * </pre>
   *
   * <code>string target = 1;</code>
   */
  public java.lang.String getTarget() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      target_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Target of the operation - for example
   * projects/project-1/locations/region-1/functions/function-1
   * </pre>
   *
   * <code>string target = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTargetBytes() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      target_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <pre>
   * Type of operation.
   * </pre>
   *
   * <code>.google.cloud.functions.v1beta2.OperationType type = 2;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Type of operation.
   * </pre>
   *
   * <code>.google.cloud.functions.v1beta2.OperationType type = 2;</code>
   */
  public com.google.cloud.functions.v1beta2.OperationType getType() {
    com.google.cloud.functions.v1beta2.OperationType result = com.google.cloud.functions.v1beta2.OperationType.valueOf(type_);
    return result == null ? com.google.cloud.functions.v1beta2.OperationType.UNRECOGNIZED : result;
  }

  public static final int REQUEST_FIELD_NUMBER = 3;
  private com.google.protobuf.Any request_;
  /**
   * <pre>
   * The original request that started the operation.
   * </pre>
   *
   * <code>.google.protobuf.Any request = 3;</code>
   */
  public boolean hasRequest() {
    return request_ != null;
  }
  /**
   * <pre>
   * The original request that started the operation.
   * </pre>
   *
   * <code>.google.protobuf.Any request = 3;</code>
   */
  public com.google.protobuf.Any getRequest() {
    return request_ == null ? com.google.protobuf.Any.getDefaultInstance() : request_;
  }
  /**
   * <pre>
   * The original request that started the operation.
   * </pre>
   *
   * <code>.google.protobuf.Any request = 3;</code>
   */
  public com.google.protobuf.AnyOrBuilder getRequestOrBuilder() {
    return getRequest();
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
    if (!getTargetBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, target_);
    }
    if (type_ != com.google.cloud.functions.v1beta2.OperationType.OPERATION_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (request_ != null) {
      output.writeMessage(3, getRequest());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTargetBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, target_);
    }
    if (type_ != com.google.cloud.functions.v1beta2.OperationType.OPERATION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (request_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRequest());
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
    if (!(obj instanceof com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2)) {
      return super.equals(obj);
    }
    com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 other = (com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2) obj;

    boolean result = true;
    result = result && getTarget()
        .equals(other.getTarget());
    result = result && type_ == other.type_;
    result = result && (hasRequest() == other.hasRequest());
    if (hasRequest()) {
      result = result && getRequest()
          .equals(other.getRequest());
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
    hash = (37 * hash) + TARGET_FIELD_NUMBER;
    hash = (53 * hash) + getTarget().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    if (hasRequest()) {
      hash = (37 * hash) + REQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getRequest().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 parseFrom(
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
  public static Builder newBuilder(com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 prototype) {
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
   * Metadata describing an [Operation][google.longrunning.Operation]
   * </pre>
   *
   * Protobuf type {@code google.cloud.functions.v1beta2.OperationMetadataV1Beta2}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.functions.v1beta2.OperationMetadataV1Beta2)
      com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.functions.v1beta2.FunctionsOperationsProto.internal_static_google_cloud_functions_v1beta2_OperationMetadataV1Beta2_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.functions.v1beta2.FunctionsOperationsProto.internal_static_google_cloud_functions_v1beta2_OperationMetadataV1Beta2_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2.class, com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2.Builder.class);
    }

    // Construct using com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2.newBuilder()
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
      target_ = "";

      type_ = 0;

      if (requestBuilder_ == null) {
        request_ = null;
      } else {
        request_ = null;
        requestBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.functions.v1beta2.FunctionsOperationsProto.internal_static_google_cloud_functions_v1beta2_OperationMetadataV1Beta2_descriptor;
    }

    public com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 getDefaultInstanceForType() {
      return com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2.getDefaultInstance();
    }

    public com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 build() {
      com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 buildPartial() {
      com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 result = new com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2(this);
      result.target_ = target_;
      result.type_ = type_;
      if (requestBuilder_ == null) {
        result.request_ = request_;
      } else {
        result.request_ = requestBuilder_.build();
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
      if (other instanceof com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2) {
        return mergeFrom((com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 other) {
      if (other == com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2.getDefaultInstance()) return this;
      if (!other.getTarget().isEmpty()) {
        target_ = other.target_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasRequest()) {
        mergeRequest(other.getRequest());
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
      com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object target_ = "";
    /**
     * <pre>
     * Target of the operation - for example
     * projects/project-1/locations/region-1/functions/function-1
     * </pre>
     *
     * <code>string target = 1;</code>
     */
    public java.lang.String getTarget() {
      java.lang.Object ref = target_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        target_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Target of the operation - for example
     * projects/project-1/locations/region-1/functions/function-1
     * </pre>
     *
     * <code>string target = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTargetBytes() {
      java.lang.Object ref = target_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        target_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Target of the operation - for example
     * projects/project-1/locations/region-1/functions/function-1
     * </pre>
     *
     * <code>string target = 1;</code>
     */
    public Builder setTarget(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      target_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Target of the operation - for example
     * projects/project-1/locations/region-1/functions/function-1
     * </pre>
     *
     * <code>string target = 1;</code>
     */
    public Builder clearTarget() {
      
      target_ = getDefaultInstance().getTarget();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Target of the operation - for example
     * projects/project-1/locations/region-1/functions/function-1
     * </pre>
     *
     * <code>string target = 1;</code>
     */
    public Builder setTargetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      target_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * Type of operation.
     * </pre>
     *
     * <code>.google.cloud.functions.v1beta2.OperationType type = 2;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Type of operation.
     * </pre>
     *
     * <code>.google.cloud.functions.v1beta2.OperationType type = 2;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of operation.
     * </pre>
     *
     * <code>.google.cloud.functions.v1beta2.OperationType type = 2;</code>
     */
    public com.google.cloud.functions.v1beta2.OperationType getType() {
      com.google.cloud.functions.v1beta2.OperationType result = com.google.cloud.functions.v1beta2.OperationType.valueOf(type_);
      return result == null ? com.google.cloud.functions.v1beta2.OperationType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type of operation.
     * </pre>
     *
     * <code>.google.cloud.functions.v1beta2.OperationType type = 2;</code>
     */
    public Builder setType(com.google.cloud.functions.v1beta2.OperationType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of operation.
     * </pre>
     *
     * <code>.google.cloud.functions.v1beta2.OperationType type = 2;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any request_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> requestBuilder_;
    /**
     * <pre>
     * The original request that started the operation.
     * </pre>
     *
     * <code>.google.protobuf.Any request = 3;</code>
     */
    public boolean hasRequest() {
      return requestBuilder_ != null || request_ != null;
    }
    /**
     * <pre>
     * The original request that started the operation.
     * </pre>
     *
     * <code>.google.protobuf.Any request = 3;</code>
     */
    public com.google.protobuf.Any getRequest() {
      if (requestBuilder_ == null) {
        return request_ == null ? com.google.protobuf.Any.getDefaultInstance() : request_;
      } else {
        return requestBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The original request that started the operation.
     * </pre>
     *
     * <code>.google.protobuf.Any request = 3;</code>
     */
    public Builder setRequest(com.google.protobuf.Any value) {
      if (requestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        request_ = value;
        onChanged();
      } else {
        requestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The original request that started the operation.
     * </pre>
     *
     * <code>.google.protobuf.Any request = 3;</code>
     */
    public Builder setRequest(
        com.google.protobuf.Any.Builder builderForValue) {
      if (requestBuilder_ == null) {
        request_ = builderForValue.build();
        onChanged();
      } else {
        requestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The original request that started the operation.
     * </pre>
     *
     * <code>.google.protobuf.Any request = 3;</code>
     */
    public Builder mergeRequest(com.google.protobuf.Any value) {
      if (requestBuilder_ == null) {
        if (request_ != null) {
          request_ =
            com.google.protobuf.Any.newBuilder(request_).mergeFrom(value).buildPartial();
        } else {
          request_ = value;
        }
        onChanged();
      } else {
        requestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The original request that started the operation.
     * </pre>
     *
     * <code>.google.protobuf.Any request = 3;</code>
     */
    public Builder clearRequest() {
      if (requestBuilder_ == null) {
        request_ = null;
        onChanged();
      } else {
        request_ = null;
        requestBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The original request that started the operation.
     * </pre>
     *
     * <code>.google.protobuf.Any request = 3;</code>
     */
    public com.google.protobuf.Any.Builder getRequestBuilder() {
      
      onChanged();
      return getRequestFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The original request that started the operation.
     * </pre>
     *
     * <code>.google.protobuf.Any request = 3;</code>
     */
    public com.google.protobuf.AnyOrBuilder getRequestOrBuilder() {
      if (requestBuilder_ != null) {
        return requestBuilder_.getMessageOrBuilder();
      } else {
        return request_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : request_;
      }
    }
    /**
     * <pre>
     * The original request that started the operation.
     * </pre>
     *
     * <code>.google.protobuf.Any request = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getRequestFieldBuilder() {
      if (requestBuilder_ == null) {
        requestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getRequest(),
                getParentForChildren(),
                isClean());
        request_ = null;
      }
      return requestBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.functions.v1beta2.OperationMetadataV1Beta2)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.functions.v1beta2.OperationMetadataV1Beta2)
  private static final com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2();
  }

  public static com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OperationMetadataV1Beta2>
      PARSER = new com.google.protobuf.AbstractParser<OperationMetadataV1Beta2>() {
    public OperationMetadataV1Beta2 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new OperationMetadataV1Beta2(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OperationMetadataV1Beta2> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OperationMetadataV1Beta2> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.functions.v1beta2.OperationMetadataV1Beta2 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

