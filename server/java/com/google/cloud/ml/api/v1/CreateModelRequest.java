// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/ml/v1/model_service.proto

package com.google.cloud.ml.api.v1;

/**
 * <pre>
 * Request message for the CreateModel method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.ml.v1.CreateModelRequest}
 */
public  final class CreateModelRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.ml.v1.CreateModelRequest)
    CreateModelRequestOrBuilder {
  // Use CreateModelRequest.newBuilder() to construct.
  private CreateModelRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateModelRequest() {
    parent_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CreateModelRequest(
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
            com.google.cloud.ml.api.v1.Model.Builder subBuilder = null;
            if (model_ != null) {
              subBuilder = model_.toBuilder();
            }
            model_ = input.readMessage(com.google.cloud.ml.api.v1.Model.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(model_);
              model_ = subBuilder.buildPartial();
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
    return com.google.cloud.ml.api.v1.ModelServiceProto.internal_static_google_cloud_ml_v1_CreateModelRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.ml.api.v1.ModelServiceProto.internal_static_google_cloud_ml_v1_CreateModelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.ml.api.v1.CreateModelRequest.class, com.google.cloud.ml.api.v1.CreateModelRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The project name.
   * Authorization: requires `Editor` role on the specified project.
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
   * Required. The project name.
   * Authorization: requires `Editor` role on the specified project.
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

  public static final int MODEL_FIELD_NUMBER = 2;
  private com.google.cloud.ml.api.v1.Model model_;
  /**
   * <pre>
   * Required. The model to create.
   * </pre>
   *
   * <code>.google.cloud.ml.v1.Model model = 2;</code>
   */
  public boolean hasModel() {
    return model_ != null;
  }
  /**
   * <pre>
   * Required. The model to create.
   * </pre>
   *
   * <code>.google.cloud.ml.v1.Model model = 2;</code>
   */
  public com.google.cloud.ml.api.v1.Model getModel() {
    return model_ == null ? com.google.cloud.ml.api.v1.Model.getDefaultInstance() : model_;
  }
  /**
   * <pre>
   * Required. The model to create.
   * </pre>
   *
   * <code>.google.cloud.ml.v1.Model model = 2;</code>
   */
  public com.google.cloud.ml.api.v1.ModelOrBuilder getModelOrBuilder() {
    return getModel();
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
    if (model_ != null) {
      output.writeMessage(2, getModel());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (model_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getModel());
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
    if (!(obj instanceof com.google.cloud.ml.api.v1.CreateModelRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.ml.api.v1.CreateModelRequest other = (com.google.cloud.ml.api.v1.CreateModelRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && (hasModel() == other.hasModel());
    if (hasModel()) {
      result = result && getModel()
          .equals(other.getModel());
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
    if (hasModel()) {
      hash = (37 * hash) + MODEL_FIELD_NUMBER;
      hash = (53 * hash) + getModel().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.ml.api.v1.CreateModelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.ml.api.v1.CreateModelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1.CreateModelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.ml.api.v1.CreateModelRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1.CreateModelRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1.CreateModelRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1.CreateModelRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1.CreateModelRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1.CreateModelRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1.CreateModelRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.ml.api.v1.CreateModelRequest prototype) {
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
   * Request message for the CreateModel method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.ml.v1.CreateModelRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.ml.v1.CreateModelRequest)
      com.google.cloud.ml.api.v1.CreateModelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.ml.api.v1.ModelServiceProto.internal_static_google_cloud_ml_v1_CreateModelRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.ml.api.v1.ModelServiceProto.internal_static_google_cloud_ml_v1_CreateModelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.ml.api.v1.CreateModelRequest.class, com.google.cloud.ml.api.v1.CreateModelRequest.Builder.class);
    }

    // Construct using com.google.cloud.ml.api.v1.CreateModelRequest.newBuilder()
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

      if (modelBuilder_ == null) {
        model_ = null;
      } else {
        model_ = null;
        modelBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.ml.api.v1.ModelServiceProto.internal_static_google_cloud_ml_v1_CreateModelRequest_descriptor;
    }

    public com.google.cloud.ml.api.v1.CreateModelRequest getDefaultInstanceForType() {
      return com.google.cloud.ml.api.v1.CreateModelRequest.getDefaultInstance();
    }

    public com.google.cloud.ml.api.v1.CreateModelRequest build() {
      com.google.cloud.ml.api.v1.CreateModelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.ml.api.v1.CreateModelRequest buildPartial() {
      com.google.cloud.ml.api.v1.CreateModelRequest result = new com.google.cloud.ml.api.v1.CreateModelRequest(this);
      result.parent_ = parent_;
      if (modelBuilder_ == null) {
        result.model_ = model_;
      } else {
        result.model_ = modelBuilder_.build();
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
      if (other instanceof com.google.cloud.ml.api.v1.CreateModelRequest) {
        return mergeFrom((com.google.cloud.ml.api.v1.CreateModelRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.ml.api.v1.CreateModelRequest other) {
      if (other == com.google.cloud.ml.api.v1.CreateModelRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasModel()) {
        mergeModel(other.getModel());
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
      com.google.cloud.ml.api.v1.CreateModelRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.ml.api.v1.CreateModelRequest) e.getUnfinishedMessage();
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
     * Required. The project name.
     * Authorization: requires `Editor` role on the specified project.
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
     * Required. The project name.
     * Authorization: requires `Editor` role on the specified project.
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
     * Required. The project name.
     * Authorization: requires `Editor` role on the specified project.
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
     * Required. The project name.
     * Authorization: requires `Editor` role on the specified project.
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
     * Required. The project name.
     * Authorization: requires `Editor` role on the specified project.
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

    private com.google.cloud.ml.api.v1.Model model_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.ml.api.v1.Model, com.google.cloud.ml.api.v1.Model.Builder, com.google.cloud.ml.api.v1.ModelOrBuilder> modelBuilder_;
    /**
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.ml.v1.Model model = 2;</code>
     */
    public boolean hasModel() {
      return modelBuilder_ != null || model_ != null;
    }
    /**
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.ml.v1.Model model = 2;</code>
     */
    public com.google.cloud.ml.api.v1.Model getModel() {
      if (modelBuilder_ == null) {
        return model_ == null ? com.google.cloud.ml.api.v1.Model.getDefaultInstance() : model_;
      } else {
        return modelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.ml.v1.Model model = 2;</code>
     */
    public Builder setModel(com.google.cloud.ml.api.v1.Model value) {
      if (modelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        model_ = value;
        onChanged();
      } else {
        modelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.ml.v1.Model model = 2;</code>
     */
    public Builder setModel(
        com.google.cloud.ml.api.v1.Model.Builder builderForValue) {
      if (modelBuilder_ == null) {
        model_ = builderForValue.build();
        onChanged();
      } else {
        modelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.ml.v1.Model model = 2;</code>
     */
    public Builder mergeModel(com.google.cloud.ml.api.v1.Model value) {
      if (modelBuilder_ == null) {
        if (model_ != null) {
          model_ =
            com.google.cloud.ml.api.v1.Model.newBuilder(model_).mergeFrom(value).buildPartial();
        } else {
          model_ = value;
        }
        onChanged();
      } else {
        modelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.ml.v1.Model model = 2;</code>
     */
    public Builder clearModel() {
      if (modelBuilder_ == null) {
        model_ = null;
        onChanged();
      } else {
        model_ = null;
        modelBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.ml.v1.Model model = 2;</code>
     */
    public com.google.cloud.ml.api.v1.Model.Builder getModelBuilder() {
      
      onChanged();
      return getModelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.ml.v1.Model model = 2;</code>
     */
    public com.google.cloud.ml.api.v1.ModelOrBuilder getModelOrBuilder() {
      if (modelBuilder_ != null) {
        return modelBuilder_.getMessageOrBuilder();
      } else {
        return model_ == null ?
            com.google.cloud.ml.api.v1.Model.getDefaultInstance() : model_;
      }
    }
    /**
     * <pre>
     * Required. The model to create.
     * </pre>
     *
     * <code>.google.cloud.ml.v1.Model model = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.ml.api.v1.Model, com.google.cloud.ml.api.v1.Model.Builder, com.google.cloud.ml.api.v1.ModelOrBuilder> 
        getModelFieldBuilder() {
      if (modelBuilder_ == null) {
        modelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.ml.api.v1.Model, com.google.cloud.ml.api.v1.Model.Builder, com.google.cloud.ml.api.v1.ModelOrBuilder>(
                getModel(),
                getParentForChildren(),
                isClean());
        model_ = null;
      }
      return modelBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.ml.v1.CreateModelRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.ml.v1.CreateModelRequest)
  private static final com.google.cloud.ml.api.v1.CreateModelRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.ml.api.v1.CreateModelRequest();
  }

  public static com.google.cloud.ml.api.v1.CreateModelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateModelRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateModelRequest>() {
    public CreateModelRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateModelRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateModelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateModelRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.ml.api.v1.CreateModelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

