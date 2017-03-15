// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

/**
 * <pre>
 * The variant search response.
 * </pre>
 *
 * Protobuf type {@code google.genomics.v1.SearchVariantsResponse}
 */
public  final class SearchVariantsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.SearchVariantsResponse)
    SearchVariantsResponseOrBuilder {
  // Use SearchVariantsResponse.newBuilder() to construct.
  private SearchVariantsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchVariantsResponse() {
    variants_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SearchVariantsResponse(
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
              variants_ = new java.util.ArrayList<com.google.genomics.v1.Variant>();
              mutable_bitField0_ |= 0x00000001;
            }
            variants_.add(
                input.readMessage(com.google.genomics.v1.Variant.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
        variants_ = java.util.Collections.unmodifiableList(variants_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_SearchVariantsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_SearchVariantsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.SearchVariantsResponse.class, com.google.genomics.v1.SearchVariantsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int VARIANTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.genomics.v1.Variant> variants_;
  /**
   * <pre>
   * The list of matching Variants.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   */
  public java.util.List<com.google.genomics.v1.Variant> getVariantsList() {
    return variants_;
  }
  /**
   * <pre>
   * The list of matching Variants.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   */
  public java.util.List<? extends com.google.genomics.v1.VariantOrBuilder> 
      getVariantsOrBuilderList() {
    return variants_;
  }
  /**
   * <pre>
   * The list of matching Variants.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   */
  public int getVariantsCount() {
    return variants_.size();
  }
  /**
   * <pre>
   * The list of matching Variants.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   */
  public com.google.genomics.v1.Variant getVariants(int index) {
    return variants_.get(index);
  }
  /**
   * <pre>
   * The list of matching Variants.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   */
  public com.google.genomics.v1.VariantOrBuilder getVariantsOrBuilder(
      int index) {
    return variants_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < variants_.size(); i++) {
      output.writeMessage(1, variants_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < variants_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, variants_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.genomics.v1.SearchVariantsResponse)) {
      return super.equals(obj);
    }
    com.google.genomics.v1.SearchVariantsResponse other = (com.google.genomics.v1.SearchVariantsResponse) obj;

    boolean result = true;
    result = result && getVariantsList()
        .equals(other.getVariantsList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getVariantsCount() > 0) {
      hash = (37 * hash) + VARIANTS_FIELD_NUMBER;
      hash = (53 * hash) + getVariantsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.genomics.v1.SearchVariantsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseFrom(
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
  public static Builder newBuilder(com.google.genomics.v1.SearchVariantsResponse prototype) {
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
   * The variant search response.
   * </pre>
   *
   * Protobuf type {@code google.genomics.v1.SearchVariantsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.SearchVariantsResponse)
      com.google.genomics.v1.SearchVariantsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_SearchVariantsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_SearchVariantsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.SearchVariantsResponse.class, com.google.genomics.v1.SearchVariantsResponse.Builder.class);
    }

    // Construct using com.google.genomics.v1.SearchVariantsResponse.newBuilder()
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
        getVariantsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (variantsBuilder_ == null) {
        variants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        variantsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_SearchVariantsResponse_descriptor;
    }

    public com.google.genomics.v1.SearchVariantsResponse getDefaultInstanceForType() {
      return com.google.genomics.v1.SearchVariantsResponse.getDefaultInstance();
    }

    public com.google.genomics.v1.SearchVariantsResponse build() {
      com.google.genomics.v1.SearchVariantsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.SearchVariantsResponse buildPartial() {
      com.google.genomics.v1.SearchVariantsResponse result = new com.google.genomics.v1.SearchVariantsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (variantsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          variants_ = java.util.Collections.unmodifiableList(variants_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.variants_ = variants_;
      } else {
        result.variants_ = variantsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.genomics.v1.SearchVariantsResponse) {
        return mergeFrom((com.google.genomics.v1.SearchVariantsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.SearchVariantsResponse other) {
      if (other == com.google.genomics.v1.SearchVariantsResponse.getDefaultInstance()) return this;
      if (variantsBuilder_ == null) {
        if (!other.variants_.isEmpty()) {
          if (variants_.isEmpty()) {
            variants_ = other.variants_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVariantsIsMutable();
            variants_.addAll(other.variants_);
          }
          onChanged();
        }
      } else {
        if (!other.variants_.isEmpty()) {
          if (variantsBuilder_.isEmpty()) {
            variantsBuilder_.dispose();
            variantsBuilder_ = null;
            variants_ = other.variants_;
            bitField0_ = (bitField0_ & ~0x00000001);
            variantsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVariantsFieldBuilder() : null;
          } else {
            variantsBuilder_.addAllMessages(other.variants_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.genomics.v1.SearchVariantsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.SearchVariantsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.genomics.v1.Variant> variants_ =
      java.util.Collections.emptyList();
    private void ensureVariantsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        variants_ = new java.util.ArrayList<com.google.genomics.v1.Variant>(variants_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.genomics.v1.Variant, com.google.genomics.v1.Variant.Builder, com.google.genomics.v1.VariantOrBuilder> variantsBuilder_;

    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public java.util.List<com.google.genomics.v1.Variant> getVariantsList() {
      if (variantsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(variants_);
      } else {
        return variantsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public int getVariantsCount() {
      if (variantsBuilder_ == null) {
        return variants_.size();
      } else {
        return variantsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public com.google.genomics.v1.Variant getVariants(int index) {
      if (variantsBuilder_ == null) {
        return variants_.get(index);
      } else {
        return variantsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public Builder setVariants(
        int index, com.google.genomics.v1.Variant value) {
      if (variantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVariantsIsMutable();
        variants_.set(index, value);
        onChanged();
      } else {
        variantsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public Builder setVariants(
        int index, com.google.genomics.v1.Variant.Builder builderForValue) {
      if (variantsBuilder_ == null) {
        ensureVariantsIsMutable();
        variants_.set(index, builderForValue.build());
        onChanged();
      } else {
        variantsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public Builder addVariants(com.google.genomics.v1.Variant value) {
      if (variantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVariantsIsMutable();
        variants_.add(value);
        onChanged();
      } else {
        variantsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public Builder addVariants(
        int index, com.google.genomics.v1.Variant value) {
      if (variantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVariantsIsMutable();
        variants_.add(index, value);
        onChanged();
      } else {
        variantsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public Builder addVariants(
        com.google.genomics.v1.Variant.Builder builderForValue) {
      if (variantsBuilder_ == null) {
        ensureVariantsIsMutable();
        variants_.add(builderForValue.build());
        onChanged();
      } else {
        variantsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public Builder addVariants(
        int index, com.google.genomics.v1.Variant.Builder builderForValue) {
      if (variantsBuilder_ == null) {
        ensureVariantsIsMutable();
        variants_.add(index, builderForValue.build());
        onChanged();
      } else {
        variantsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public Builder addAllVariants(
        java.lang.Iterable<? extends com.google.genomics.v1.Variant> values) {
      if (variantsBuilder_ == null) {
        ensureVariantsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, variants_);
        onChanged();
      } else {
        variantsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public Builder clearVariants() {
      if (variantsBuilder_ == null) {
        variants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        variantsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public Builder removeVariants(int index) {
      if (variantsBuilder_ == null) {
        ensureVariantsIsMutable();
        variants_.remove(index);
        onChanged();
      } else {
        variantsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public com.google.genomics.v1.Variant.Builder getVariantsBuilder(
        int index) {
      return getVariantsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public com.google.genomics.v1.VariantOrBuilder getVariantsOrBuilder(
        int index) {
      if (variantsBuilder_ == null) {
        return variants_.get(index);  } else {
        return variantsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public java.util.List<? extends com.google.genomics.v1.VariantOrBuilder> 
         getVariantsOrBuilderList() {
      if (variantsBuilder_ != null) {
        return variantsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(variants_);
      }
    }
    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public com.google.genomics.v1.Variant.Builder addVariantsBuilder() {
      return getVariantsFieldBuilder().addBuilder(
          com.google.genomics.v1.Variant.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public com.google.genomics.v1.Variant.Builder addVariantsBuilder(
        int index) {
      return getVariantsFieldBuilder().addBuilder(
          index, com.google.genomics.v1.Variant.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of matching Variants.
     * </pre>
     *
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     */
    public java.util.List<com.google.genomics.v1.Variant.Builder> 
         getVariantsBuilderList() {
      return getVariantsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.genomics.v1.Variant, com.google.genomics.v1.Variant.Builder, com.google.genomics.v1.VariantOrBuilder> 
        getVariantsFieldBuilder() {
      if (variantsBuilder_ == null) {
        variantsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.genomics.v1.Variant, com.google.genomics.v1.Variant.Builder, com.google.genomics.v1.VariantOrBuilder>(
                variants_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        variants_ = null;
      }
      return variantsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.SearchVariantsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.SearchVariantsResponse)
  private static final com.google.genomics.v1.SearchVariantsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.genomics.v1.SearchVariantsResponse();
  }

  public static com.google.genomics.v1.SearchVariantsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchVariantsResponse>
      PARSER = new com.google.protobuf.AbstractParser<SearchVariantsResponse>() {
    public SearchVariantsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SearchVariantsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchVariantsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchVariantsResponse> getParserForType() {
    return PARSER;
  }

  public com.google.genomics.v1.SearchVariantsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

