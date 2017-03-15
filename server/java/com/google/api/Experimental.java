// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/experimental/experimental.proto

package com.google.api;

/**
 * <pre>
 * Experimental service configuration. These configuration options can
 * only be used by whitelisted users.
 * </pre>
 *
 * Protobuf type {@code google.api.Experimental}
 */
public  final class Experimental extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.Experimental)
    ExperimentalOrBuilder {
  // Use Experimental.newBuilder() to construct.
  private Experimental(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Experimental() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Experimental(
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
          case 66: {
            com.google.api.AuthorizationConfig.Builder subBuilder = null;
            if (authorization_ != null) {
              subBuilder = authorization_.toBuilder();
            }
            authorization_ = input.readMessage(com.google.api.AuthorizationConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(authorization_);
              authorization_ = subBuilder.buildPartial();
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
    return com.google.api.ExperimentalProto.internal_static_google_api_Experimental_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.ExperimentalProto.internal_static_google_api_Experimental_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.Experimental.class, com.google.api.Experimental.Builder.class);
  }

  public static final int AUTHORIZATION_FIELD_NUMBER = 8;
  private com.google.api.AuthorizationConfig authorization_;
  /**
   * <pre>
   * Authorization configuration.
   * </pre>
   *
   * <code>.google.api.AuthorizationConfig authorization = 8;</code>
   */
  public boolean hasAuthorization() {
    return authorization_ != null;
  }
  /**
   * <pre>
   * Authorization configuration.
   * </pre>
   *
   * <code>.google.api.AuthorizationConfig authorization = 8;</code>
   */
  public com.google.api.AuthorizationConfig getAuthorization() {
    return authorization_ == null ? com.google.api.AuthorizationConfig.getDefaultInstance() : authorization_;
  }
  /**
   * <pre>
   * Authorization configuration.
   * </pre>
   *
   * <code>.google.api.AuthorizationConfig authorization = 8;</code>
   */
  public com.google.api.AuthorizationConfigOrBuilder getAuthorizationOrBuilder() {
    return getAuthorization();
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
    if (authorization_ != null) {
      output.writeMessage(8, getAuthorization());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (authorization_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(8, getAuthorization());
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
    if (!(obj instanceof com.google.api.Experimental)) {
      return super.equals(obj);
    }
    com.google.api.Experimental other = (com.google.api.Experimental) obj;

    boolean result = true;
    result = result && (hasAuthorization() == other.hasAuthorization());
    if (hasAuthorization()) {
      result = result && getAuthorization()
          .equals(other.getAuthorization());
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
    if (hasAuthorization()) {
      hash = (37 * hash) + AUTHORIZATION_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorization().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.Experimental parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Experimental parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Experimental parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Experimental parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Experimental parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.Experimental parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.Experimental parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.Experimental parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.Experimental parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.Experimental parseFrom(
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
  public static Builder newBuilder(com.google.api.Experimental prototype) {
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
   * Experimental service configuration. These configuration options can
   * only be used by whitelisted users.
   * </pre>
   *
   * Protobuf type {@code google.api.Experimental}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.Experimental)
      com.google.api.ExperimentalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.ExperimentalProto.internal_static_google_api_Experimental_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.ExperimentalProto.internal_static_google_api_Experimental_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.Experimental.class, com.google.api.Experimental.Builder.class);
    }

    // Construct using com.google.api.Experimental.newBuilder()
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
      if (authorizationBuilder_ == null) {
        authorization_ = null;
      } else {
        authorization_ = null;
        authorizationBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.ExperimentalProto.internal_static_google_api_Experimental_descriptor;
    }

    public com.google.api.Experimental getDefaultInstanceForType() {
      return com.google.api.Experimental.getDefaultInstance();
    }

    public com.google.api.Experimental build() {
      com.google.api.Experimental result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.api.Experimental buildPartial() {
      com.google.api.Experimental result = new com.google.api.Experimental(this);
      if (authorizationBuilder_ == null) {
        result.authorization_ = authorization_;
      } else {
        result.authorization_ = authorizationBuilder_.build();
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
      if (other instanceof com.google.api.Experimental) {
        return mergeFrom((com.google.api.Experimental)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.Experimental other) {
      if (other == com.google.api.Experimental.getDefaultInstance()) return this;
      if (other.hasAuthorization()) {
        mergeAuthorization(other.getAuthorization());
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
      com.google.api.Experimental parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.Experimental) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.api.AuthorizationConfig authorization_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.api.AuthorizationConfig, com.google.api.AuthorizationConfig.Builder, com.google.api.AuthorizationConfigOrBuilder> authorizationBuilder_;
    /**
     * <pre>
     * Authorization configuration.
     * </pre>
     *
     * <code>.google.api.AuthorizationConfig authorization = 8;</code>
     */
    public boolean hasAuthorization() {
      return authorizationBuilder_ != null || authorization_ != null;
    }
    /**
     * <pre>
     * Authorization configuration.
     * </pre>
     *
     * <code>.google.api.AuthorizationConfig authorization = 8;</code>
     */
    public com.google.api.AuthorizationConfig getAuthorization() {
      if (authorizationBuilder_ == null) {
        return authorization_ == null ? com.google.api.AuthorizationConfig.getDefaultInstance() : authorization_;
      } else {
        return authorizationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Authorization configuration.
     * </pre>
     *
     * <code>.google.api.AuthorizationConfig authorization = 8;</code>
     */
    public Builder setAuthorization(com.google.api.AuthorizationConfig value) {
      if (authorizationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authorization_ = value;
        onChanged();
      } else {
        authorizationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Authorization configuration.
     * </pre>
     *
     * <code>.google.api.AuthorizationConfig authorization = 8;</code>
     */
    public Builder setAuthorization(
        com.google.api.AuthorizationConfig.Builder builderForValue) {
      if (authorizationBuilder_ == null) {
        authorization_ = builderForValue.build();
        onChanged();
      } else {
        authorizationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Authorization configuration.
     * </pre>
     *
     * <code>.google.api.AuthorizationConfig authorization = 8;</code>
     */
    public Builder mergeAuthorization(com.google.api.AuthorizationConfig value) {
      if (authorizationBuilder_ == null) {
        if (authorization_ != null) {
          authorization_ =
            com.google.api.AuthorizationConfig.newBuilder(authorization_).mergeFrom(value).buildPartial();
        } else {
          authorization_ = value;
        }
        onChanged();
      } else {
        authorizationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Authorization configuration.
     * </pre>
     *
     * <code>.google.api.AuthorizationConfig authorization = 8;</code>
     */
    public Builder clearAuthorization() {
      if (authorizationBuilder_ == null) {
        authorization_ = null;
        onChanged();
      } else {
        authorization_ = null;
        authorizationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Authorization configuration.
     * </pre>
     *
     * <code>.google.api.AuthorizationConfig authorization = 8;</code>
     */
    public com.google.api.AuthorizationConfig.Builder getAuthorizationBuilder() {
      
      onChanged();
      return getAuthorizationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Authorization configuration.
     * </pre>
     *
     * <code>.google.api.AuthorizationConfig authorization = 8;</code>
     */
    public com.google.api.AuthorizationConfigOrBuilder getAuthorizationOrBuilder() {
      if (authorizationBuilder_ != null) {
        return authorizationBuilder_.getMessageOrBuilder();
      } else {
        return authorization_ == null ?
            com.google.api.AuthorizationConfig.getDefaultInstance() : authorization_;
      }
    }
    /**
     * <pre>
     * Authorization configuration.
     * </pre>
     *
     * <code>.google.api.AuthorizationConfig authorization = 8;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.api.AuthorizationConfig, com.google.api.AuthorizationConfig.Builder, com.google.api.AuthorizationConfigOrBuilder> 
        getAuthorizationFieldBuilder() {
      if (authorizationBuilder_ == null) {
        authorizationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.AuthorizationConfig, com.google.api.AuthorizationConfig.Builder, com.google.api.AuthorizationConfigOrBuilder>(
                getAuthorization(),
                getParentForChildren(),
                isClean());
        authorization_ = null;
      }
      return authorizationBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.api.Experimental)
  }

  // @@protoc_insertion_point(class_scope:google.api.Experimental)
  private static final com.google.api.Experimental DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.Experimental();
  }

  public static com.google.api.Experimental getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Experimental>
      PARSER = new com.google.protobuf.AbstractParser<Experimental>() {
    public Experimental parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Experimental(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Experimental> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Experimental> getParserForType() {
    return PARSER;
  }

  public com.google.api.Experimental getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

