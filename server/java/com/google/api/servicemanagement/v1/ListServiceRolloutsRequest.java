// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

/**
 * <pre>
 * Request message for 'ListServiceRollouts'
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.ListServiceRolloutsRequest}
 */
public  final class ListServiceRolloutsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.ListServiceRolloutsRequest)
    ListServiceRolloutsRequestOrBuilder {
  // Use ListServiceRolloutsRequest.newBuilder() to construct.
  private ListServiceRolloutsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListServiceRolloutsRequest() {
    serviceName_ = "";
    pageToken_ = "";
    pageSize_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListServiceRolloutsRequest(
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

            serviceName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            pageToken_ = s;
            break;
          }
          case 24: {

            pageSize_ = input.readInt32();
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
    return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_ListServiceRolloutsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_ListServiceRolloutsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.servicemanagement.v1.ListServiceRolloutsRequest.class, com.google.api.servicemanagement.v1.ListServiceRolloutsRequest.Builder.class);
  }

  public static final int SERVICE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object serviceName_;
  /**
   * <pre>
   * The name of the service.  See the [overview](/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>string service_name = 1;</code>
   */
  public java.lang.String getServiceName() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the service.  See the [overview](/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
   * </pre>
   *
   * <code>string service_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getServiceNameBytes() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object pageToken_;
  /**
   * <pre>
   * The token of the page to retrieve.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The token of the page to retrieve.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 3;
  private int pageSize_;
  /**
   * <pre>
   * The max number of items to include in the response list.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  public int getPageSize() {
    return pageSize_;
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
    if (!getServiceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceName_);
    }
    if (!getPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pageToken_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(3, pageSize_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getServiceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceName_);
    }
    if (!getPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pageToken_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, pageSize_);
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
    if (!(obj instanceof com.google.api.servicemanagement.v1.ListServiceRolloutsRequest)) {
      return super.equals(obj);
    }
    com.google.api.servicemanagement.v1.ListServiceRolloutsRequest other = (com.google.api.servicemanagement.v1.ListServiceRolloutsRequest) obj;

    boolean result = true;
    result = result && getServiceName()
        .equals(other.getServiceName());
    result = result && getPageToken()
        .equals(other.getPageToken());
    result = result && (getPageSize()
        == other.getPageSize());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SERVICE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getServiceName().hashCode();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.servicemanagement.v1.ListServiceRolloutsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.servicemanagement.v1.ListServiceRolloutsRequest parseFrom(
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
  public static Builder newBuilder(com.google.api.servicemanagement.v1.ListServiceRolloutsRequest prototype) {
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
   * Request message for 'ListServiceRollouts'
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.ListServiceRolloutsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.ListServiceRolloutsRequest)
      com.google.api.servicemanagement.v1.ListServiceRolloutsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_ListServiceRolloutsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_ListServiceRolloutsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.servicemanagement.v1.ListServiceRolloutsRequest.class, com.google.api.servicemanagement.v1.ListServiceRolloutsRequest.Builder.class);
    }

    // Construct using com.google.api.servicemanagement.v1.ListServiceRolloutsRequest.newBuilder()
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
      serviceName_ = "";

      pageToken_ = "";

      pageSize_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto.internal_static_google_api_servicemanagement_v1_ListServiceRolloutsRequest_descriptor;
    }

    public com.google.api.servicemanagement.v1.ListServiceRolloutsRequest getDefaultInstanceForType() {
      return com.google.api.servicemanagement.v1.ListServiceRolloutsRequest.getDefaultInstance();
    }

    public com.google.api.servicemanagement.v1.ListServiceRolloutsRequest build() {
      com.google.api.servicemanagement.v1.ListServiceRolloutsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.api.servicemanagement.v1.ListServiceRolloutsRequest buildPartial() {
      com.google.api.servicemanagement.v1.ListServiceRolloutsRequest result = new com.google.api.servicemanagement.v1.ListServiceRolloutsRequest(this);
      result.serviceName_ = serviceName_;
      result.pageToken_ = pageToken_;
      result.pageSize_ = pageSize_;
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
      if (other instanceof com.google.api.servicemanagement.v1.ListServiceRolloutsRequest) {
        return mergeFrom((com.google.api.servicemanagement.v1.ListServiceRolloutsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.servicemanagement.v1.ListServiceRolloutsRequest other) {
      if (other == com.google.api.servicemanagement.v1.ListServiceRolloutsRequest.getDefaultInstance()) return this;
      if (!other.getServiceName().isEmpty()) {
        serviceName_ = other.serviceName_;
        onChanged();
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
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
      com.google.api.servicemanagement.v1.ListServiceRolloutsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.servicemanagement.v1.ListServiceRolloutsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object serviceName_ = "";
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>string service_name = 1;</code>
     */
    public java.lang.String getServiceName() {
      java.lang.Object ref = serviceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>string service_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getServiceNameBytes() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>string service_name = 1;</code>
     */
    public Builder setServiceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>string service_name = 1;</code>
     */
    public Builder clearServiceName() {
      
      serviceName_ = getDefaultInstance().getServiceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the service.  See the [overview](/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
     * </pre>
     *
     * <code>string service_name = 1;</code>
     */
    public Builder setServiceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <pre>
     * The token of the page to retrieve.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The token of the page to retrieve.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The token of the page to retrieve.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The token of the page to retrieve.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     */
    public Builder clearPageToken() {
      
      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The token of the page to retrieve.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pageToken_ = value;
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <pre>
     * The max number of items to include in the response list.
     * </pre>
     *
     * <code>int32 page_size = 3;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * The max number of items to include in the response list.
     * </pre>
     *
     * <code>int32 page_size = 3;</code>
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The max number of items to include in the response list.
     * </pre>
     *
     * <code>int32 page_size = 3;</code>
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.ListServiceRolloutsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.ListServiceRolloutsRequest)
  private static final com.google.api.servicemanagement.v1.ListServiceRolloutsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.servicemanagement.v1.ListServiceRolloutsRequest();
  }

  public static com.google.api.servicemanagement.v1.ListServiceRolloutsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListServiceRolloutsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListServiceRolloutsRequest>() {
    public ListServiceRolloutsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListServiceRolloutsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListServiceRolloutsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListServiceRolloutsRequest> getParserForType() {
    return PARSER;
  }

  public com.google.api.servicemanagement.v1.ListServiceRolloutsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

