// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

/**
 * <pre>
 * Results describes the artifacts created by the build pipeline.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.Results}
 */
public  final class Results extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.Results)
    ResultsOrBuilder {
  // Use Results.newBuilder() to construct.
  private Results(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Results() {
    images_ = java.util.Collections.emptyList();
    buildStepImages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Results(
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
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              images_ = new java.util.ArrayList<com.google.cloudbuild.v1.BuiltImage>();
              mutable_bitField0_ |= 0x00000001;
            }
            images_.add(
                input.readMessage(com.google.cloudbuild.v1.BuiltImage.parser(), extensionRegistry));
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              buildStepImages_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            buildStepImages_.add(s);
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
        images_ = java.util.Collections.unmodifiableList(images_);
      }
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        buildStepImages_ = buildStepImages_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_Results_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_Results_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.Results.class, com.google.cloudbuild.v1.Results.Builder.class);
  }

  public static final int IMAGES_FIELD_NUMBER = 2;
  private java.util.List<com.google.cloudbuild.v1.BuiltImage> images_;
  /**
   * <pre>
   * Images that were built as a part of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
   */
  public java.util.List<com.google.cloudbuild.v1.BuiltImage> getImagesList() {
    return images_;
  }
  /**
   * <pre>
   * Images that were built as a part of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
   */
  public java.util.List<? extends com.google.cloudbuild.v1.BuiltImageOrBuilder> 
      getImagesOrBuilderList() {
    return images_;
  }
  /**
   * <pre>
   * Images that were built as a part of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
   */
  public int getImagesCount() {
    return images_.size();
  }
  /**
   * <pre>
   * Images that were built as a part of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
   */
  public com.google.cloudbuild.v1.BuiltImage getImages(int index) {
    return images_.get(index);
  }
  /**
   * <pre>
   * Images that were built as a part of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
   */
  public com.google.cloudbuild.v1.BuiltImageOrBuilder getImagesOrBuilder(
      int index) {
    return images_.get(index);
  }

  public static final int BUILD_STEP_IMAGES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList buildStepImages_;
  /**
   * <pre>
   * List of build step digests, in order corresponding to build step indices.
   * </pre>
   *
   * <code>repeated string build_step_images = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getBuildStepImagesList() {
    return buildStepImages_;
  }
  /**
   * <pre>
   * List of build step digests, in order corresponding to build step indices.
   * </pre>
   *
   * <code>repeated string build_step_images = 3;</code>
   */
  public int getBuildStepImagesCount() {
    return buildStepImages_.size();
  }
  /**
   * <pre>
   * List of build step digests, in order corresponding to build step indices.
   * </pre>
   *
   * <code>repeated string build_step_images = 3;</code>
   */
  public java.lang.String getBuildStepImages(int index) {
    return buildStepImages_.get(index);
  }
  /**
   * <pre>
   * List of build step digests, in order corresponding to build step indices.
   * </pre>
   *
   * <code>repeated string build_step_images = 3;</code>
   */
  public com.google.protobuf.ByteString
      getBuildStepImagesBytes(int index) {
    return buildStepImages_.getByteString(index);
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
    for (int i = 0; i < images_.size(); i++) {
      output.writeMessage(2, images_.get(i));
    }
    for (int i = 0; i < buildStepImages_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, buildStepImages_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < images_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, images_.get(i));
    }
    {
      int dataSize = 0;
      for (int i = 0; i < buildStepImages_.size(); i++) {
        dataSize += computeStringSizeNoTag(buildStepImages_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getBuildStepImagesList().size();
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
    if (!(obj instanceof com.google.cloudbuild.v1.Results)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.Results other = (com.google.cloudbuild.v1.Results) obj;

    boolean result = true;
    result = result && getImagesList()
        .equals(other.getImagesList());
    result = result && getBuildStepImagesList()
        .equals(other.getBuildStepImagesList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getImagesCount() > 0) {
      hash = (37 * hash) + IMAGES_FIELD_NUMBER;
      hash = (53 * hash) + getImagesList().hashCode();
    }
    if (getBuildStepImagesCount() > 0) {
      hash = (37 * hash) + BUILD_STEP_IMAGES_FIELD_NUMBER;
      hash = (53 * hash) + getBuildStepImagesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.Results parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.Results parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.Results parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.Results parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.Results parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.Results parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.Results parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.Results parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.Results parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.Results parseFrom(
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
  public static Builder newBuilder(com.google.cloudbuild.v1.Results prototype) {
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
   * Results describes the artifacts created by the build pipeline.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.Results}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.Results)
      com.google.cloudbuild.v1.ResultsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_Results_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_Results_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.Results.class, com.google.cloudbuild.v1.Results.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.Results.newBuilder()
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
        getImagesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (imagesBuilder_ == null) {
        images_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        imagesBuilder_.clear();
      }
      buildStepImages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_Results_descriptor;
    }

    public com.google.cloudbuild.v1.Results getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.Results.getDefaultInstance();
    }

    public com.google.cloudbuild.v1.Results build() {
      com.google.cloudbuild.v1.Results result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloudbuild.v1.Results buildPartial() {
      com.google.cloudbuild.v1.Results result = new com.google.cloudbuild.v1.Results(this);
      int from_bitField0_ = bitField0_;
      if (imagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          images_ = java.util.Collections.unmodifiableList(images_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.images_ = images_;
      } else {
        result.images_ = imagesBuilder_.build();
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        buildStepImages_ = buildStepImages_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.buildStepImages_ = buildStepImages_;
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
      if (other instanceof com.google.cloudbuild.v1.Results) {
        return mergeFrom((com.google.cloudbuild.v1.Results)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.Results other) {
      if (other == com.google.cloudbuild.v1.Results.getDefaultInstance()) return this;
      if (imagesBuilder_ == null) {
        if (!other.images_.isEmpty()) {
          if (images_.isEmpty()) {
            images_ = other.images_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureImagesIsMutable();
            images_.addAll(other.images_);
          }
          onChanged();
        }
      } else {
        if (!other.images_.isEmpty()) {
          if (imagesBuilder_.isEmpty()) {
            imagesBuilder_.dispose();
            imagesBuilder_ = null;
            images_ = other.images_;
            bitField0_ = (bitField0_ & ~0x00000001);
            imagesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getImagesFieldBuilder() : null;
          } else {
            imagesBuilder_.addAllMessages(other.images_);
          }
        }
      }
      if (!other.buildStepImages_.isEmpty()) {
        if (buildStepImages_.isEmpty()) {
          buildStepImages_ = other.buildStepImages_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureBuildStepImagesIsMutable();
          buildStepImages_.addAll(other.buildStepImages_);
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
      com.google.cloudbuild.v1.Results parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloudbuild.v1.Results) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloudbuild.v1.BuiltImage> images_ =
      java.util.Collections.emptyList();
    private void ensureImagesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        images_ = new java.util.ArrayList<com.google.cloudbuild.v1.BuiltImage>(images_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloudbuild.v1.BuiltImage, com.google.cloudbuild.v1.BuiltImage.Builder, com.google.cloudbuild.v1.BuiltImageOrBuilder> imagesBuilder_;

    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public java.util.List<com.google.cloudbuild.v1.BuiltImage> getImagesList() {
      if (imagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(images_);
      } else {
        return imagesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public int getImagesCount() {
      if (imagesBuilder_ == null) {
        return images_.size();
      } else {
        return imagesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public com.google.cloudbuild.v1.BuiltImage getImages(int index) {
      if (imagesBuilder_ == null) {
        return images_.get(index);
      } else {
        return imagesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public Builder setImages(
        int index, com.google.cloudbuild.v1.BuiltImage value) {
      if (imagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureImagesIsMutable();
        images_.set(index, value);
        onChanged();
      } else {
        imagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public Builder setImages(
        int index, com.google.cloudbuild.v1.BuiltImage.Builder builderForValue) {
      if (imagesBuilder_ == null) {
        ensureImagesIsMutable();
        images_.set(index, builderForValue.build());
        onChanged();
      } else {
        imagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public Builder addImages(com.google.cloudbuild.v1.BuiltImage value) {
      if (imagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureImagesIsMutable();
        images_.add(value);
        onChanged();
      } else {
        imagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public Builder addImages(
        int index, com.google.cloudbuild.v1.BuiltImage value) {
      if (imagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureImagesIsMutable();
        images_.add(index, value);
        onChanged();
      } else {
        imagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public Builder addImages(
        com.google.cloudbuild.v1.BuiltImage.Builder builderForValue) {
      if (imagesBuilder_ == null) {
        ensureImagesIsMutable();
        images_.add(builderForValue.build());
        onChanged();
      } else {
        imagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public Builder addImages(
        int index, com.google.cloudbuild.v1.BuiltImage.Builder builderForValue) {
      if (imagesBuilder_ == null) {
        ensureImagesIsMutable();
        images_.add(index, builderForValue.build());
        onChanged();
      } else {
        imagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public Builder addAllImages(
        java.lang.Iterable<? extends com.google.cloudbuild.v1.BuiltImage> values) {
      if (imagesBuilder_ == null) {
        ensureImagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, images_);
        onChanged();
      } else {
        imagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public Builder clearImages() {
      if (imagesBuilder_ == null) {
        images_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        imagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public Builder removeImages(int index) {
      if (imagesBuilder_ == null) {
        ensureImagesIsMutable();
        images_.remove(index);
        onChanged();
      } else {
        imagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public com.google.cloudbuild.v1.BuiltImage.Builder getImagesBuilder(
        int index) {
      return getImagesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public com.google.cloudbuild.v1.BuiltImageOrBuilder getImagesOrBuilder(
        int index) {
      if (imagesBuilder_ == null) {
        return images_.get(index);  } else {
        return imagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public java.util.List<? extends com.google.cloudbuild.v1.BuiltImageOrBuilder> 
         getImagesOrBuilderList() {
      if (imagesBuilder_ != null) {
        return imagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(images_);
      }
    }
    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public com.google.cloudbuild.v1.BuiltImage.Builder addImagesBuilder() {
      return getImagesFieldBuilder().addBuilder(
          com.google.cloudbuild.v1.BuiltImage.getDefaultInstance());
    }
    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public com.google.cloudbuild.v1.BuiltImage.Builder addImagesBuilder(
        int index) {
      return getImagesFieldBuilder().addBuilder(
          index, com.google.cloudbuild.v1.BuiltImage.getDefaultInstance());
    }
    /**
     * <pre>
     * Images that were built as a part of the build.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
     */
    public java.util.List<com.google.cloudbuild.v1.BuiltImage.Builder> 
         getImagesBuilderList() {
      return getImagesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloudbuild.v1.BuiltImage, com.google.cloudbuild.v1.BuiltImage.Builder, com.google.cloudbuild.v1.BuiltImageOrBuilder> 
        getImagesFieldBuilder() {
      if (imagesBuilder_ == null) {
        imagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloudbuild.v1.BuiltImage, com.google.cloudbuild.v1.BuiltImage.Builder, com.google.cloudbuild.v1.BuiltImageOrBuilder>(
                images_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        images_ = null;
      }
      return imagesBuilder_;
    }

    private com.google.protobuf.LazyStringList buildStepImages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureBuildStepImagesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        buildStepImages_ = new com.google.protobuf.LazyStringArrayList(buildStepImages_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * List of build step digests, in order corresponding to build step indices.
     * </pre>
     *
     * <code>repeated string build_step_images = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getBuildStepImagesList() {
      return buildStepImages_.getUnmodifiableView();
    }
    /**
     * <pre>
     * List of build step digests, in order corresponding to build step indices.
     * </pre>
     *
     * <code>repeated string build_step_images = 3;</code>
     */
    public int getBuildStepImagesCount() {
      return buildStepImages_.size();
    }
    /**
     * <pre>
     * List of build step digests, in order corresponding to build step indices.
     * </pre>
     *
     * <code>repeated string build_step_images = 3;</code>
     */
    public java.lang.String getBuildStepImages(int index) {
      return buildStepImages_.get(index);
    }
    /**
     * <pre>
     * List of build step digests, in order corresponding to build step indices.
     * </pre>
     *
     * <code>repeated string build_step_images = 3;</code>
     */
    public com.google.protobuf.ByteString
        getBuildStepImagesBytes(int index) {
      return buildStepImages_.getByteString(index);
    }
    /**
     * <pre>
     * List of build step digests, in order corresponding to build step indices.
     * </pre>
     *
     * <code>repeated string build_step_images = 3;</code>
     */
    public Builder setBuildStepImages(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBuildStepImagesIsMutable();
      buildStepImages_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of build step digests, in order corresponding to build step indices.
     * </pre>
     *
     * <code>repeated string build_step_images = 3;</code>
     */
    public Builder addBuildStepImages(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBuildStepImagesIsMutable();
      buildStepImages_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of build step digests, in order corresponding to build step indices.
     * </pre>
     *
     * <code>repeated string build_step_images = 3;</code>
     */
    public Builder addAllBuildStepImages(
        java.lang.Iterable<java.lang.String> values) {
      ensureBuildStepImagesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, buildStepImages_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of build step digests, in order corresponding to build step indices.
     * </pre>
     *
     * <code>repeated string build_step_images = 3;</code>
     */
    public Builder clearBuildStepImages() {
      buildStepImages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of build step digests, in order corresponding to build step indices.
     * </pre>
     *
     * <code>repeated string build_step_images = 3;</code>
     */
    public Builder addBuildStepImagesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureBuildStepImagesIsMutable();
      buildStepImages_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.Results)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.Results)
  private static final com.google.cloudbuild.v1.Results DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.Results();
  }

  public static com.google.cloudbuild.v1.Results getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Results>
      PARSER = new com.google.protobuf.AbstractParser<Results>() {
    public Results parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Results(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Results> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Results> getParserForType() {
    return PARSER;
  }

  public com.google.cloudbuild.v1.Results getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

