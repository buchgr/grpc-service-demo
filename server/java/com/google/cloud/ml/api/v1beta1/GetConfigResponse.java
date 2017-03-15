// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/ml/v1beta1/project_service.proto

package com.google.cloud.ml.api.v1beta1;

/**
 * <pre>
 * Returns service account information associated with a project.
 * </pre>
 *
 * Protobuf type {@code google.cloud.ml.v1beta1.GetConfigResponse}
 */
public  final class GetConfigResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.ml.v1beta1.GetConfigResponse)
    GetConfigResponseOrBuilder {
  // Use GetConfigResponse.newBuilder() to construct.
  private GetConfigResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetConfigResponse() {
    serviceAccount_ = "";
    serviceAccountProject_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetConfigResponse(
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

            serviceAccount_ = s;
            break;
          }
          case 16: {

            serviceAccountProject_ = input.readInt64();
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
    return com.google.cloud.ml.api.v1beta1.ProjectServiceProto.internal_static_google_cloud_ml_v1beta1_GetConfigResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.ml.api.v1beta1.ProjectServiceProto.internal_static_google_cloud_ml_v1beta1_GetConfigResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.ml.api.v1beta1.GetConfigResponse.class, com.google.cloud.ml.api.v1beta1.GetConfigResponse.Builder.class);
  }

  public static final int SERVICE_ACCOUNT_FIELD_NUMBER = 1;
  private volatile java.lang.Object serviceAccount_;
  /**
   * <pre>
   * The service account Cloud ML uses to access resources in the project.
   * </pre>
   *
   * <code>string service_account = 1;</code>
   */
  public java.lang.String getServiceAccount() {
    java.lang.Object ref = serviceAccount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceAccount_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The service account Cloud ML uses to access resources in the project.
   * </pre>
   *
   * <code>string service_account = 1;</code>
   */
  public com.google.protobuf.ByteString
      getServiceAccountBytes() {
    java.lang.Object ref = serviceAccount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceAccount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_ACCOUNT_PROJECT_FIELD_NUMBER = 2;
  private long serviceAccountProject_;
  /**
   * <pre>
   * The project number for `service_account`.
   * </pre>
   *
   * <code>int64 service_account_project = 2;</code>
   */
  public long getServiceAccountProject() {
    return serviceAccountProject_;
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
    if (!getServiceAccountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceAccount_);
    }
    if (serviceAccountProject_ != 0L) {
      output.writeInt64(2, serviceAccountProject_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getServiceAccountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceAccount_);
    }
    if (serviceAccountProject_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, serviceAccountProject_);
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
    if (!(obj instanceof com.google.cloud.ml.api.v1beta1.GetConfigResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.ml.api.v1beta1.GetConfigResponse other = (com.google.cloud.ml.api.v1beta1.GetConfigResponse) obj;

    boolean result = true;
    result = result && getServiceAccount()
        .equals(other.getServiceAccount());
    result = result && (getServiceAccountProject()
        == other.getServiceAccountProject());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SERVICE_ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getServiceAccount().hashCode();
    hash = (37 * hash) + SERVICE_ACCOUNT_PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getServiceAccountProject());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.ml.api.v1beta1.GetConfigResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.ml.api.v1beta1.GetConfigResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1beta1.GetConfigResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.ml.api.v1beta1.GetConfigResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1beta1.GetConfigResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1beta1.GetConfigResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1beta1.GetConfigResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1beta1.GetConfigResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1beta1.GetConfigResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1beta1.GetConfigResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.ml.api.v1beta1.GetConfigResponse prototype) {
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
   * Returns service account information associated with a project.
   * </pre>
   *
   * Protobuf type {@code google.cloud.ml.v1beta1.GetConfigResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.ml.v1beta1.GetConfigResponse)
      com.google.cloud.ml.api.v1beta1.GetConfigResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.ml.api.v1beta1.ProjectServiceProto.internal_static_google_cloud_ml_v1beta1_GetConfigResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.ml.api.v1beta1.ProjectServiceProto.internal_static_google_cloud_ml_v1beta1_GetConfigResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.ml.api.v1beta1.GetConfigResponse.class, com.google.cloud.ml.api.v1beta1.GetConfigResponse.Builder.class);
    }

    // Construct using com.google.cloud.ml.api.v1beta1.GetConfigResponse.newBuilder()
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
      serviceAccount_ = "";

      serviceAccountProject_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.ml.api.v1beta1.ProjectServiceProto.internal_static_google_cloud_ml_v1beta1_GetConfigResponse_descriptor;
    }

    public com.google.cloud.ml.api.v1beta1.GetConfigResponse getDefaultInstanceForType() {
      return com.google.cloud.ml.api.v1beta1.GetConfigResponse.getDefaultInstance();
    }

    public com.google.cloud.ml.api.v1beta1.GetConfigResponse build() {
      com.google.cloud.ml.api.v1beta1.GetConfigResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.ml.api.v1beta1.GetConfigResponse buildPartial() {
      com.google.cloud.ml.api.v1beta1.GetConfigResponse result = new com.google.cloud.ml.api.v1beta1.GetConfigResponse(this);
      result.serviceAccount_ = serviceAccount_;
      result.serviceAccountProject_ = serviceAccountProject_;
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
      if (other instanceof com.google.cloud.ml.api.v1beta1.GetConfigResponse) {
        return mergeFrom((com.google.cloud.ml.api.v1beta1.GetConfigResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.ml.api.v1beta1.GetConfigResponse other) {
      if (other == com.google.cloud.ml.api.v1beta1.GetConfigResponse.getDefaultInstance()) return this;
      if (!other.getServiceAccount().isEmpty()) {
        serviceAccount_ = other.serviceAccount_;
        onChanged();
      }
      if (other.getServiceAccountProject() != 0L) {
        setServiceAccountProject(other.getServiceAccountProject());
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
      com.google.cloud.ml.api.v1beta1.GetConfigResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.ml.api.v1beta1.GetConfigResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object serviceAccount_ = "";
    /**
     * <pre>
     * The service account Cloud ML uses to access resources in the project.
     * </pre>
     *
     * <code>string service_account = 1;</code>
     */
    public java.lang.String getServiceAccount() {
      java.lang.Object ref = serviceAccount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceAccount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The service account Cloud ML uses to access resources in the project.
     * </pre>
     *
     * <code>string service_account = 1;</code>
     */
    public com.google.protobuf.ByteString
        getServiceAccountBytes() {
      java.lang.Object ref = serviceAccount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceAccount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The service account Cloud ML uses to access resources in the project.
     * </pre>
     *
     * <code>string service_account = 1;</code>
     */
    public Builder setServiceAccount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceAccount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The service account Cloud ML uses to access resources in the project.
     * </pre>
     *
     * <code>string service_account = 1;</code>
     */
    public Builder clearServiceAccount() {
      
      serviceAccount_ = getDefaultInstance().getServiceAccount();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The service account Cloud ML uses to access resources in the project.
     * </pre>
     *
     * <code>string service_account = 1;</code>
     */
    public Builder setServiceAccountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceAccount_ = value;
      onChanged();
      return this;
    }

    private long serviceAccountProject_ ;
    /**
     * <pre>
     * The project number for `service_account`.
     * </pre>
     *
     * <code>int64 service_account_project = 2;</code>
     */
    public long getServiceAccountProject() {
      return serviceAccountProject_;
    }
    /**
     * <pre>
     * The project number for `service_account`.
     * </pre>
     *
     * <code>int64 service_account_project = 2;</code>
     */
    public Builder setServiceAccountProject(long value) {
      
      serviceAccountProject_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The project number for `service_account`.
     * </pre>
     *
     * <code>int64 service_account_project = 2;</code>
     */
    public Builder clearServiceAccountProject() {
      
      serviceAccountProject_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.ml.v1beta1.GetConfigResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.ml.v1beta1.GetConfigResponse)
  private static final com.google.cloud.ml.api.v1beta1.GetConfigResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.ml.api.v1beta1.GetConfigResponse();
  }

  public static com.google.cloud.ml.api.v1beta1.GetConfigResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetConfigResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetConfigResponse>() {
    public GetConfigResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetConfigResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetConfigResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetConfigResponse> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.ml.api.v1beta1.GetConfigResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

