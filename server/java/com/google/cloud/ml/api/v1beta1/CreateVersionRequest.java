// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/ml/v1beta1/model_service.proto

package com.google.cloud.ml.api.v1beta1;

/**
 * <pre>
 * Uploads the provided trained model version to Cloud Machine Learning.
 * </pre>
 *
 * Protobuf type {@code google.cloud.ml.v1beta1.CreateVersionRequest}
 */
public  final class CreateVersionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.ml.v1beta1.CreateVersionRequest)
    CreateVersionRequestOrBuilder {
  // Use CreateVersionRequest.newBuilder() to construct.
  private CreateVersionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateVersionRequest() {
    parent_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CreateVersionRequest(
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

            parent_ = s;
            break;
          }
          case 18: {
            com.google.cloud.ml.api.v1beta1.Version.Builder subBuilder = null;
            if (version_ != null) {
              subBuilder = version_.toBuilder();
            }
            version_ = input.readMessage(com.google.cloud.ml.api.v1beta1.Version.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(version_);
              version_ = subBuilder.buildPartial();
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
    return com.google.cloud.ml.api.v1beta1.ModelServiceProto.internal_static_google_cloud_ml_v1beta1_CreateVersionRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.ml.api.v1beta1.ModelServiceProto.internal_static_google_cloud_ml_v1beta1_CreateVersionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.ml.api.v1beta1.CreateVersionRequest.class, com.google.cloud.ml.api.v1beta1.CreateVersionRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The name of the model.
   * Authorization: requires `Editor` role on the parent project.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The name of the model.
   * Authorization: requires `Editor` role on the parent project.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private com.google.cloud.ml.api.v1beta1.Version version_;
  /**
   * <pre>
   * Required. The version details.
   * </pre>
   *
   * <code>.google.cloud.ml.v1beta1.Version version = 2;</code>
   */
  public boolean hasVersion() {
    return version_ != null;
  }
  /**
   * <pre>
   * Required. The version details.
   * </pre>
   *
   * <code>.google.cloud.ml.v1beta1.Version version = 2;</code>
   */
  public com.google.cloud.ml.api.v1beta1.Version getVersion() {
    return version_ == null ? com.google.cloud.ml.api.v1beta1.Version.getDefaultInstance() : version_;
  }
  /**
   * <pre>
   * Required. The version details.
   * </pre>
   *
   * <code>.google.cloud.ml.v1beta1.Version version = 2;</code>
   */
  public com.google.cloud.ml.api.v1beta1.VersionOrBuilder getVersionOrBuilder() {
    return getVersion();
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (version_ != null) {
      output.writeMessage(2, getVersion());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (version_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVersion());
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
    if (!(obj instanceof com.google.cloud.ml.api.v1beta1.CreateVersionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.ml.api.v1beta1.CreateVersionRequest other = (com.google.cloud.ml.api.v1beta1.CreateVersionRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && (hasVersion() == other.hasVersion());
    if (hasVersion()) {
      result = result && getVersion()
          .equals(other.getVersion());
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.ml.api.v1beta1.CreateVersionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.ml.api.v1beta1.CreateVersionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1beta1.CreateVersionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.ml.api.v1beta1.CreateVersionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1beta1.CreateVersionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1beta1.CreateVersionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1beta1.CreateVersionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1beta1.CreateVersionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1beta1.CreateVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1beta1.CreateVersionRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.ml.api.v1beta1.CreateVersionRequest prototype) {
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
   * Uploads the provided trained model version to Cloud Machine Learning.
   * </pre>
   *
   * Protobuf type {@code google.cloud.ml.v1beta1.CreateVersionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.ml.v1beta1.CreateVersionRequest)
      com.google.cloud.ml.api.v1beta1.CreateVersionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.ml.api.v1beta1.ModelServiceProto.internal_static_google_cloud_ml_v1beta1_CreateVersionRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.ml.api.v1beta1.ModelServiceProto.internal_static_google_cloud_ml_v1beta1_CreateVersionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.ml.api.v1beta1.CreateVersionRequest.class, com.google.cloud.ml.api.v1beta1.CreateVersionRequest.Builder.class);
    }

    // Construct using com.google.cloud.ml.api.v1beta1.CreateVersionRequest.newBuilder()
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
      parent_ = "";

      if (versionBuilder_ == null) {
        version_ = null;
      } else {
        version_ = null;
        versionBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.ml.api.v1beta1.ModelServiceProto.internal_static_google_cloud_ml_v1beta1_CreateVersionRequest_descriptor;
    }

    public com.google.cloud.ml.api.v1beta1.CreateVersionRequest getDefaultInstanceForType() {
      return com.google.cloud.ml.api.v1beta1.CreateVersionRequest.getDefaultInstance();
    }

    public com.google.cloud.ml.api.v1beta1.CreateVersionRequest build() {
      com.google.cloud.ml.api.v1beta1.CreateVersionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.ml.api.v1beta1.CreateVersionRequest buildPartial() {
      com.google.cloud.ml.api.v1beta1.CreateVersionRequest result = new com.google.cloud.ml.api.v1beta1.CreateVersionRequest(this);
      result.parent_ = parent_;
      if (versionBuilder_ == null) {
        result.version_ = version_;
      } else {
        result.version_ = versionBuilder_.build();
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
      if (other instanceof com.google.cloud.ml.api.v1beta1.CreateVersionRequest) {
        return mergeFrom((com.google.cloud.ml.api.v1beta1.CreateVersionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.ml.api.v1beta1.CreateVersionRequest other) {
      if (other == com.google.cloud.ml.api.v1beta1.CreateVersionRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasVersion()) {
        mergeVersion(other.getVersion());
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
      com.google.cloud.ml.api.v1beta1.CreateVersionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.ml.api.v1beta1.CreateVersionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The name of the model.
     * Authorization: requires `Editor` role on the parent project.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the model.
     * Authorization: requires `Editor` role on the parent project.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the model.
     * Authorization: requires `Editor` role on the parent project.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the model.
     * Authorization: requires `Editor` role on the parent project.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the model.
     * Authorization: requires `Editor` role on the parent project.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.ml.api.v1beta1.Version version_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.ml.api.v1beta1.Version, com.google.cloud.ml.api.v1beta1.Version.Builder, com.google.cloud.ml.api.v1beta1.VersionOrBuilder> versionBuilder_;
    /**
     * <pre>
     * Required. The version details.
     * </pre>
     *
     * <code>.google.cloud.ml.v1beta1.Version version = 2;</code>
     */
    public boolean hasVersion() {
      return versionBuilder_ != null || version_ != null;
    }
    /**
     * <pre>
     * Required. The version details.
     * </pre>
     *
     * <code>.google.cloud.ml.v1beta1.Version version = 2;</code>
     */
    public com.google.cloud.ml.api.v1beta1.Version getVersion() {
      if (versionBuilder_ == null) {
        return version_ == null ? com.google.cloud.ml.api.v1beta1.Version.getDefaultInstance() : version_;
      } else {
        return versionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The version details.
     * </pre>
     *
     * <code>.google.cloud.ml.v1beta1.Version version = 2;</code>
     */
    public Builder setVersion(com.google.cloud.ml.api.v1beta1.Version value) {
      if (versionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        version_ = value;
        onChanged();
      } else {
        versionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The version details.
     * </pre>
     *
     * <code>.google.cloud.ml.v1beta1.Version version = 2;</code>
     */
    public Builder setVersion(
        com.google.cloud.ml.api.v1beta1.Version.Builder builderForValue) {
      if (versionBuilder_ == null) {
        version_ = builderForValue.build();
        onChanged();
      } else {
        versionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The version details.
     * </pre>
     *
     * <code>.google.cloud.ml.v1beta1.Version version = 2;</code>
     */
    public Builder mergeVersion(com.google.cloud.ml.api.v1beta1.Version value) {
      if (versionBuilder_ == null) {
        if (version_ != null) {
          version_ =
            com.google.cloud.ml.api.v1beta1.Version.newBuilder(version_).mergeFrom(value).buildPartial();
        } else {
          version_ = value;
        }
        onChanged();
      } else {
        versionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The version details.
     * </pre>
     *
     * <code>.google.cloud.ml.v1beta1.Version version = 2;</code>
     */
    public Builder clearVersion() {
      if (versionBuilder_ == null) {
        version_ = null;
        onChanged();
      } else {
        version_ = null;
        versionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The version details.
     * </pre>
     *
     * <code>.google.cloud.ml.v1beta1.Version version = 2;</code>
     */
    public com.google.cloud.ml.api.v1beta1.Version.Builder getVersionBuilder() {
      
      onChanged();
      return getVersionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The version details.
     * </pre>
     *
     * <code>.google.cloud.ml.v1beta1.Version version = 2;</code>
     */
    public com.google.cloud.ml.api.v1beta1.VersionOrBuilder getVersionOrBuilder() {
      if (versionBuilder_ != null) {
        return versionBuilder_.getMessageOrBuilder();
      } else {
        return version_ == null ?
            com.google.cloud.ml.api.v1beta1.Version.getDefaultInstance() : version_;
      }
    }
    /**
     * <pre>
     * Required. The version details.
     * </pre>
     *
     * <code>.google.cloud.ml.v1beta1.Version version = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.ml.api.v1beta1.Version, com.google.cloud.ml.api.v1beta1.Version.Builder, com.google.cloud.ml.api.v1beta1.VersionOrBuilder> 
        getVersionFieldBuilder() {
      if (versionBuilder_ == null) {
        versionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.ml.api.v1beta1.Version, com.google.cloud.ml.api.v1beta1.Version.Builder, com.google.cloud.ml.api.v1beta1.VersionOrBuilder>(
                getVersion(),
                getParentForChildren(),
                isClean());
        version_ = null;
      }
      return versionBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.ml.v1beta1.CreateVersionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.ml.v1beta1.CreateVersionRequest)
  private static final com.google.cloud.ml.api.v1beta1.CreateVersionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.ml.api.v1beta1.CreateVersionRequest();
  }

  public static com.google.cloud.ml.api.v1beta1.CreateVersionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateVersionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateVersionRequest>() {
    public CreateVersionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateVersionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateVersionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateVersionRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.ml.api.v1beta1.CreateVersionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

