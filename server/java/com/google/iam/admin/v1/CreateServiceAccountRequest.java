// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

/**
 * <pre>
 * The service account create request.
 * </pre>
 *
 * Protobuf type {@code google.iam.admin.v1.CreateServiceAccountRequest}
 */
public  final class CreateServiceAccountRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.iam.admin.v1.CreateServiceAccountRequest)
    CreateServiceAccountRequestOrBuilder {
  // Use CreateServiceAccountRequest.newBuilder() to construct.
  private CreateServiceAccountRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateServiceAccountRequest() {
    name_ = "";
    accountId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CreateServiceAccountRequest(
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

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            accountId_ = s;
            break;
          }
          case 26: {
            com.google.iam.admin.v1.ServiceAccount.Builder subBuilder = null;
            if (serviceAccount_ != null) {
              subBuilder = serviceAccount_.toBuilder();
            }
            serviceAccount_ = input.readMessage(com.google.iam.admin.v1.ServiceAccount.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(serviceAccount_);
              serviceAccount_ = subBuilder.buildPartial();
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
    return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_CreateServiceAccountRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_CreateServiceAccountRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.admin.v1.CreateServiceAccountRequest.class, com.google.iam.admin.v1.CreateServiceAccountRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. The resource name of the project associated with the service
   * accounts, such as `projects/my-project-123`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the project associated with the service
   * accounts, such as `projects/my-project-123`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCOUNT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object accountId_;
  /**
   * <pre>
   * Required. The account id that is used to generate the service account
   * email address and a stable unique id. It is unique within a project,
   * must be 6-30 characters long, and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
   * </pre>
   *
   * <code>string account_id = 2;</code>
   */
  public java.lang.String getAccountId() {
    java.lang.Object ref = accountId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accountId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The account id that is used to generate the service account
   * email address and a stable unique id. It is unique within a project,
   * must be 6-30 characters long, and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
   * </pre>
   *
   * <code>string account_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAccountIdBytes() {
    java.lang.Object ref = accountId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accountId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_ACCOUNT_FIELD_NUMBER = 3;
  private com.google.iam.admin.v1.ServiceAccount serviceAccount_;
  /**
   * <pre>
   * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to create.
   * Currently, only the following values are user assignable:
   * `display_name` .
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
   */
  public boolean hasServiceAccount() {
    return serviceAccount_ != null;
  }
  /**
   * <pre>
   * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to create.
   * Currently, only the following values are user assignable:
   * `display_name` .
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
   */
  public com.google.iam.admin.v1.ServiceAccount getServiceAccount() {
    return serviceAccount_ == null ? com.google.iam.admin.v1.ServiceAccount.getDefaultInstance() : serviceAccount_;
  }
  /**
   * <pre>
   * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to create.
   * Currently, only the following values are user assignable:
   * `display_name` .
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
   */
  public com.google.iam.admin.v1.ServiceAccountOrBuilder getServiceAccountOrBuilder() {
    return getServiceAccount();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getAccountIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, accountId_);
    }
    if (serviceAccount_ != null) {
      output.writeMessage(3, getServiceAccount());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getAccountIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, accountId_);
    }
    if (serviceAccount_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getServiceAccount());
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
    if (!(obj instanceof com.google.iam.admin.v1.CreateServiceAccountRequest)) {
      return super.equals(obj);
    }
    com.google.iam.admin.v1.CreateServiceAccountRequest other = (com.google.iam.admin.v1.CreateServiceAccountRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getAccountId()
        .equals(other.getAccountId());
    result = result && (hasServiceAccount() == other.hasServiceAccount());
    if (hasServiceAccount()) {
      result = result && getServiceAccount()
          .equals(other.getServiceAccount());
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAccountId().hashCode();
    if (hasServiceAccount()) {
      hash = (37 * hash) + SERVICE_ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getServiceAccount().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.iam.admin.v1.CreateServiceAccountRequest parseFrom(
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
  public static Builder newBuilder(com.google.iam.admin.v1.CreateServiceAccountRequest prototype) {
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
   * The service account create request.
   * </pre>
   *
   * Protobuf type {@code google.iam.admin.v1.CreateServiceAccountRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.iam.admin.v1.CreateServiceAccountRequest)
      com.google.iam.admin.v1.CreateServiceAccountRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_CreateServiceAccountRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_CreateServiceAccountRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.admin.v1.CreateServiceAccountRequest.class, com.google.iam.admin.v1.CreateServiceAccountRequest.Builder.class);
    }

    // Construct using com.google.iam.admin.v1.CreateServiceAccountRequest.newBuilder()
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
      name_ = "";

      accountId_ = "";

      if (serviceAccountBuilder_ == null) {
        serviceAccount_ = null;
      } else {
        serviceAccount_ = null;
        serviceAccountBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.iam.admin.v1.IamProto.internal_static_google_iam_admin_v1_CreateServiceAccountRequest_descriptor;
    }

    public com.google.iam.admin.v1.CreateServiceAccountRequest getDefaultInstanceForType() {
      return com.google.iam.admin.v1.CreateServiceAccountRequest.getDefaultInstance();
    }

    public com.google.iam.admin.v1.CreateServiceAccountRequest build() {
      com.google.iam.admin.v1.CreateServiceAccountRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.iam.admin.v1.CreateServiceAccountRequest buildPartial() {
      com.google.iam.admin.v1.CreateServiceAccountRequest result = new com.google.iam.admin.v1.CreateServiceAccountRequest(this);
      result.name_ = name_;
      result.accountId_ = accountId_;
      if (serviceAccountBuilder_ == null) {
        result.serviceAccount_ = serviceAccount_;
      } else {
        result.serviceAccount_ = serviceAccountBuilder_.build();
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
      if (other instanceof com.google.iam.admin.v1.CreateServiceAccountRequest) {
        return mergeFrom((com.google.iam.admin.v1.CreateServiceAccountRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.admin.v1.CreateServiceAccountRequest other) {
      if (other == com.google.iam.admin.v1.CreateServiceAccountRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getAccountId().isEmpty()) {
        accountId_ = other.accountId_;
        onChanged();
      }
      if (other.hasServiceAccount()) {
        mergeServiceAccount(other.getServiceAccount());
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
      com.google.iam.admin.v1.CreateServiceAccountRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.iam.admin.v1.CreateServiceAccountRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. The resource name of the project associated with the service
     * accounts, such as `projects/my-project-123`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the project associated with the service
     * accounts, such as `projects/my-project-123`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the project associated with the service
     * accounts, such as `projects/my-project-123`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the project associated with the service
     * accounts, such as `projects/my-project-123`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the project associated with the service
     * accounts, such as `projects/my-project-123`.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object accountId_ = "";
    /**
     * <pre>
     * Required. The account id that is used to generate the service account
     * email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression
     * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
     * </pre>
     *
     * <code>string account_id = 2;</code>
     */
    public java.lang.String getAccountId() {
      java.lang.Object ref = accountId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accountId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The account id that is used to generate the service account
     * email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression
     * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
     * </pre>
     *
     * <code>string account_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAccountIdBytes() {
      java.lang.Object ref = accountId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accountId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The account id that is used to generate the service account
     * email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression
     * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
     * </pre>
     *
     * <code>string account_id = 2;</code>
     */
    public Builder setAccountId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      accountId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The account id that is used to generate the service account
     * email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression
     * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
     * </pre>
     *
     * <code>string account_id = 2;</code>
     */
    public Builder clearAccountId() {
      
      accountId_ = getDefaultInstance().getAccountId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The account id that is used to generate the service account
     * email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression
     * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
     * </pre>
     *
     * <code>string account_id = 2;</code>
     */
    public Builder setAccountIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      accountId_ = value;
      onChanged();
      return this;
    }

    private com.google.iam.admin.v1.ServiceAccount serviceAccount_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.iam.admin.v1.ServiceAccount, com.google.iam.admin.v1.ServiceAccount.Builder, com.google.iam.admin.v1.ServiceAccountOrBuilder> serviceAccountBuilder_;
    /**
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to create.
     * Currently, only the following values are user assignable:
     * `display_name` .
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     */
    public boolean hasServiceAccount() {
      return serviceAccountBuilder_ != null || serviceAccount_ != null;
    }
    /**
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to create.
     * Currently, only the following values are user assignable:
     * `display_name` .
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     */
    public com.google.iam.admin.v1.ServiceAccount getServiceAccount() {
      if (serviceAccountBuilder_ == null) {
        return serviceAccount_ == null ? com.google.iam.admin.v1.ServiceAccount.getDefaultInstance() : serviceAccount_;
      } else {
        return serviceAccountBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to create.
     * Currently, only the following values are user assignable:
     * `display_name` .
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     */
    public Builder setServiceAccount(com.google.iam.admin.v1.ServiceAccount value) {
      if (serviceAccountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serviceAccount_ = value;
        onChanged();
      } else {
        serviceAccountBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to create.
     * Currently, only the following values are user assignable:
     * `display_name` .
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     */
    public Builder setServiceAccount(
        com.google.iam.admin.v1.ServiceAccount.Builder builderForValue) {
      if (serviceAccountBuilder_ == null) {
        serviceAccount_ = builderForValue.build();
        onChanged();
      } else {
        serviceAccountBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to create.
     * Currently, only the following values are user assignable:
     * `display_name` .
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     */
    public Builder mergeServiceAccount(com.google.iam.admin.v1.ServiceAccount value) {
      if (serviceAccountBuilder_ == null) {
        if (serviceAccount_ != null) {
          serviceAccount_ =
            com.google.iam.admin.v1.ServiceAccount.newBuilder(serviceAccount_).mergeFrom(value).buildPartial();
        } else {
          serviceAccount_ = value;
        }
        onChanged();
      } else {
        serviceAccountBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to create.
     * Currently, only the following values are user assignable:
     * `display_name` .
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     */
    public Builder clearServiceAccount() {
      if (serviceAccountBuilder_ == null) {
        serviceAccount_ = null;
        onChanged();
      } else {
        serviceAccount_ = null;
        serviceAccountBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to create.
     * Currently, only the following values are user assignable:
     * `display_name` .
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     */
    public com.google.iam.admin.v1.ServiceAccount.Builder getServiceAccountBuilder() {
      
      onChanged();
      return getServiceAccountFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to create.
     * Currently, only the following values are user assignable:
     * `display_name` .
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     */
    public com.google.iam.admin.v1.ServiceAccountOrBuilder getServiceAccountOrBuilder() {
      if (serviceAccountBuilder_ != null) {
        return serviceAccountBuilder_.getMessageOrBuilder();
      } else {
        return serviceAccount_ == null ?
            com.google.iam.admin.v1.ServiceAccount.getDefaultInstance() : serviceAccount_;
      }
    }
    /**
     * <pre>
     * The [ServiceAccount][google.iam.admin.v1.ServiceAccount] resource to create.
     * Currently, only the following values are user assignable:
     * `display_name` .
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount service_account = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.iam.admin.v1.ServiceAccount, com.google.iam.admin.v1.ServiceAccount.Builder, com.google.iam.admin.v1.ServiceAccountOrBuilder> 
        getServiceAccountFieldBuilder() {
      if (serviceAccountBuilder_ == null) {
        serviceAccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.admin.v1.ServiceAccount, com.google.iam.admin.v1.ServiceAccount.Builder, com.google.iam.admin.v1.ServiceAccountOrBuilder>(
                getServiceAccount(),
                getParentForChildren(),
                isClean());
        serviceAccount_ = null;
      }
      return serviceAccountBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.iam.admin.v1.CreateServiceAccountRequest)
  }

  // @@protoc_insertion_point(class_scope:google.iam.admin.v1.CreateServiceAccountRequest)
  private static final com.google.iam.admin.v1.CreateServiceAccountRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.iam.admin.v1.CreateServiceAccountRequest();
  }

  public static com.google.iam.admin.v1.CreateServiceAccountRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateServiceAccountRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateServiceAccountRequest>() {
    public CreateServiceAccountRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateServiceAccountRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateServiceAccountRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateServiceAccountRequest> getParserForType() {
    return PARSER;
  }

  public com.google.iam.admin.v1.CreateServiceAccountRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

