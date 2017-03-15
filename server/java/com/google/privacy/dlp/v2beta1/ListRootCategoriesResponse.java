// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

/**
 * <pre>
 * Response for ListRootCategories request.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2beta1.ListRootCategoriesResponse}
 */
public  final class ListRootCategoriesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2beta1.ListRootCategoriesResponse)
    ListRootCategoriesResponseOrBuilder {
  // Use ListRootCategoriesResponse.newBuilder() to construct.
  private ListRootCategoriesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListRootCategoriesResponse() {
    categories_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListRootCategoriesResponse(
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
              categories_ = new java.util.ArrayList<com.google.privacy.dlp.v2beta1.CategoryDescription>();
              mutable_bitField0_ |= 0x00000001;
            }
            categories_.add(
                input.readMessage(com.google.privacy.dlp.v2beta1.CategoryDescription.parser(), extensionRegistry));
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
        categories_ = java.util.Collections.unmodifiableList(categories_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_ListRootCategoriesResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_ListRootCategoriesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse.class, com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse.Builder.class);
  }

  public static final int CATEGORIES_FIELD_NUMBER = 1;
  private java.util.List<com.google.privacy.dlp.v2beta1.CategoryDescription> categories_;
  /**
   * <pre>
   * List of all into type categories supported by the API.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
   */
  public java.util.List<com.google.privacy.dlp.v2beta1.CategoryDescription> getCategoriesList() {
    return categories_;
  }
  /**
   * <pre>
   * List of all into type categories supported by the API.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
   */
  public java.util.List<? extends com.google.privacy.dlp.v2beta1.CategoryDescriptionOrBuilder> 
      getCategoriesOrBuilderList() {
    return categories_;
  }
  /**
   * <pre>
   * List of all into type categories supported by the API.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
   */
  public int getCategoriesCount() {
    return categories_.size();
  }
  /**
   * <pre>
   * List of all into type categories supported by the API.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
   */
  public com.google.privacy.dlp.v2beta1.CategoryDescription getCategories(int index) {
    return categories_.get(index);
  }
  /**
   * <pre>
   * List of all into type categories supported by the API.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
   */
  public com.google.privacy.dlp.v2beta1.CategoryDescriptionOrBuilder getCategoriesOrBuilder(
      int index) {
    return categories_.get(index);
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
    for (int i = 0; i < categories_.size(); i++) {
      output.writeMessage(1, categories_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < categories_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, categories_.get(i));
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
    if (!(obj instanceof com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse other = (com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse) obj;

    boolean result = true;
    result = result && getCategoriesList()
        .equals(other.getCategoriesList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCategoriesCount() > 0) {
      hash = (37 * hash) + CATEGORIES_FIELD_NUMBER;
      hash = (53 * hash) + getCategoriesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse prototype) {
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
   * Response for ListRootCategories request.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2beta1.ListRootCategoriesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2beta1.ListRootCategoriesResponse)
      com.google.privacy.dlp.v2beta1.ListRootCategoriesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_ListRootCategoriesResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_ListRootCategoriesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse.class, com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse.newBuilder()
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
        getCategoriesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (categoriesBuilder_ == null) {
        categories_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        categoriesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2beta1.DlpProto.internal_static_google_privacy_dlp_v2beta1_ListRootCategoriesResponse_descriptor;
    }

    public com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse build() {
      com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse buildPartial() {
      com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse result = new com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse(this);
      int from_bitField0_ = bitField0_;
      if (categoriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          categories_ = java.util.Collections.unmodifiableList(categories_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.categories_ = categories_;
      } else {
        result.categories_ = categoriesBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse) {
        return mergeFrom((com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse other) {
      if (other == com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse.getDefaultInstance()) return this;
      if (categoriesBuilder_ == null) {
        if (!other.categories_.isEmpty()) {
          if (categories_.isEmpty()) {
            categories_ = other.categories_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCategoriesIsMutable();
            categories_.addAll(other.categories_);
          }
          onChanged();
        }
      } else {
        if (!other.categories_.isEmpty()) {
          if (categoriesBuilder_.isEmpty()) {
            categoriesBuilder_.dispose();
            categoriesBuilder_ = null;
            categories_ = other.categories_;
            bitField0_ = (bitField0_ & ~0x00000001);
            categoriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCategoriesFieldBuilder() : null;
          } else {
            categoriesBuilder_.addAllMessages(other.categories_);
          }
        }
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
      com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.privacy.dlp.v2beta1.CategoryDescription> categories_ =
      java.util.Collections.emptyList();
    private void ensureCategoriesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        categories_ = new java.util.ArrayList<com.google.privacy.dlp.v2beta1.CategoryDescription>(categories_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.CategoryDescription, com.google.privacy.dlp.v2beta1.CategoryDescription.Builder, com.google.privacy.dlp.v2beta1.CategoryDescriptionOrBuilder> categoriesBuilder_;

    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2beta1.CategoryDescription> getCategoriesList() {
      if (categoriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(categories_);
      } else {
        return categoriesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public int getCategoriesCount() {
      if (categoriesBuilder_ == null) {
        return categories_.size();
      } else {
        return categoriesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.CategoryDescription getCategories(int index) {
      if (categoriesBuilder_ == null) {
        return categories_.get(index);
      } else {
        return categoriesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public Builder setCategories(
        int index, com.google.privacy.dlp.v2beta1.CategoryDescription value) {
      if (categoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCategoriesIsMutable();
        categories_.set(index, value);
        onChanged();
      } else {
        categoriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public Builder setCategories(
        int index, com.google.privacy.dlp.v2beta1.CategoryDescription.Builder builderForValue) {
      if (categoriesBuilder_ == null) {
        ensureCategoriesIsMutable();
        categories_.set(index, builderForValue.build());
        onChanged();
      } else {
        categoriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public Builder addCategories(com.google.privacy.dlp.v2beta1.CategoryDescription value) {
      if (categoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCategoriesIsMutable();
        categories_.add(value);
        onChanged();
      } else {
        categoriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public Builder addCategories(
        int index, com.google.privacy.dlp.v2beta1.CategoryDescription value) {
      if (categoriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCategoriesIsMutable();
        categories_.add(index, value);
        onChanged();
      } else {
        categoriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public Builder addCategories(
        com.google.privacy.dlp.v2beta1.CategoryDescription.Builder builderForValue) {
      if (categoriesBuilder_ == null) {
        ensureCategoriesIsMutable();
        categories_.add(builderForValue.build());
        onChanged();
      } else {
        categoriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public Builder addCategories(
        int index, com.google.privacy.dlp.v2beta1.CategoryDescription.Builder builderForValue) {
      if (categoriesBuilder_ == null) {
        ensureCategoriesIsMutable();
        categories_.add(index, builderForValue.build());
        onChanged();
      } else {
        categoriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public Builder addAllCategories(
        java.lang.Iterable<? extends com.google.privacy.dlp.v2beta1.CategoryDescription> values) {
      if (categoriesBuilder_ == null) {
        ensureCategoriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, categories_);
        onChanged();
      } else {
        categoriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public Builder clearCategories() {
      if (categoriesBuilder_ == null) {
        categories_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        categoriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public Builder removeCategories(int index) {
      if (categoriesBuilder_ == null) {
        ensureCategoriesIsMutable();
        categories_.remove(index);
        onChanged();
      } else {
        categoriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.CategoryDescription.Builder getCategoriesBuilder(
        int index) {
      return getCategoriesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.CategoryDescriptionOrBuilder getCategoriesOrBuilder(
        int index) {
      if (categoriesBuilder_ == null) {
        return categories_.get(index);  } else {
        return categoriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public java.util.List<? extends com.google.privacy.dlp.v2beta1.CategoryDescriptionOrBuilder> 
         getCategoriesOrBuilderList() {
      if (categoriesBuilder_ != null) {
        return categoriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(categories_);
      }
    }
    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.CategoryDescription.Builder addCategoriesBuilder() {
      return getCategoriesFieldBuilder().addBuilder(
          com.google.privacy.dlp.v2beta1.CategoryDescription.getDefaultInstance());
    }
    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public com.google.privacy.dlp.v2beta1.CategoryDescription.Builder addCategoriesBuilder(
        int index) {
      return getCategoriesFieldBuilder().addBuilder(
          index, com.google.privacy.dlp.v2beta1.CategoryDescription.getDefaultInstance());
    }
    /**
     * <pre>
     * List of all into type categories supported by the API.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2beta1.CategoryDescription categories = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2beta1.CategoryDescription.Builder> 
         getCategoriesBuilderList() {
      return getCategoriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.privacy.dlp.v2beta1.CategoryDescription, com.google.privacy.dlp.v2beta1.CategoryDescription.Builder, com.google.privacy.dlp.v2beta1.CategoryDescriptionOrBuilder> 
        getCategoriesFieldBuilder() {
      if (categoriesBuilder_ == null) {
        categoriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2beta1.CategoryDescription, com.google.privacy.dlp.v2beta1.CategoryDescription.Builder, com.google.privacy.dlp.v2beta1.CategoryDescriptionOrBuilder>(
                categories_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        categories_ = null;
      }
      return categoriesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2beta1.ListRootCategoriesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2beta1.ListRootCategoriesResponse)
  private static final com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse();
  }

  public static com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListRootCategoriesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListRootCategoriesResponse>() {
    public ListRootCategoriesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListRootCategoriesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListRootCategoriesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListRootCategoriesResponse> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2beta1.ListRootCategoriesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

