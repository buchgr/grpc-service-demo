// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/text_annotation.proto

package com.google.cloud.vision.v1;

/**
 * <pre>
 * A single symbol representation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1.Symbol}
 */
public  final class Symbol extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1.Symbol)
    SymbolOrBuilder {
  // Use Symbol.newBuilder() to construct.
  private Symbol(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Symbol() {
    text_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Symbol(
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
            com.google.cloud.vision.v1.TextAnnotation.TextProperty.Builder subBuilder = null;
            if (property_ != null) {
              subBuilder = property_.toBuilder();
            }
            property_ = input.readMessage(com.google.cloud.vision.v1.TextAnnotation.TextProperty.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(property_);
              property_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.cloud.vision.v1.BoundingPoly.Builder subBuilder = null;
            if (boundingBox_ != null) {
              subBuilder = boundingBox_.toBuilder();
            }
            boundingBox_ = input.readMessage(com.google.cloud.vision.v1.BoundingPoly.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(boundingBox_);
              boundingBox_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            text_ = s;
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
    return com.google.cloud.vision.v1.TextAnnotationProto.internal_static_google_cloud_vision_v1_Symbol_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1.TextAnnotationProto.internal_static_google_cloud_vision_v1_Symbol_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1.Symbol.class, com.google.cloud.vision.v1.Symbol.Builder.class);
  }

  public static final int PROPERTY_FIELD_NUMBER = 1;
  private com.google.cloud.vision.v1.TextAnnotation.TextProperty property_;
  /**
   * <pre>
   * Additional information detected for the symbol.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
   */
  public boolean hasProperty() {
    return property_ != null;
  }
  /**
   * <pre>
   * Additional information detected for the symbol.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
   */
  public com.google.cloud.vision.v1.TextAnnotation.TextProperty getProperty() {
    return property_ == null ? com.google.cloud.vision.v1.TextAnnotation.TextProperty.getDefaultInstance() : property_;
  }
  /**
   * <pre>
   * Additional information detected for the symbol.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
   */
  public com.google.cloud.vision.v1.TextAnnotation.TextPropertyOrBuilder getPropertyOrBuilder() {
    return getProperty();
  }

  public static final int BOUNDING_BOX_FIELD_NUMBER = 2;
  private com.google.cloud.vision.v1.BoundingPoly boundingBox_;
  /**
   * <pre>
   * The bounding box for the symbol.
   * The vertices are in the order of top-left, top-right, bottom-right,
   * bottom-left. When a rotation of the bounding box is detected the rotation
   * is represented as around the top-left corner as defined when the text is
   * read in the 'natural' orientation.
   * For example:
   *   * when the text is horizontal it might look like:
   *      0----1
   *      |    |
   *      3----2
   *   * when it's rotated 180 degrees around the top-left corner it becomes:
   *      2----3
   *      |    |
   *      1----0
   *   and the vertice order will still be (0, 1, 2, 3).
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
   */
  public boolean hasBoundingBox() {
    return boundingBox_ != null;
  }
  /**
   * <pre>
   * The bounding box for the symbol.
   * The vertices are in the order of top-left, top-right, bottom-right,
   * bottom-left. When a rotation of the bounding box is detected the rotation
   * is represented as around the top-left corner as defined when the text is
   * read in the 'natural' orientation.
   * For example:
   *   * when the text is horizontal it might look like:
   *      0----1
   *      |    |
   *      3----2
   *   * when it's rotated 180 degrees around the top-left corner it becomes:
   *      2----3
   *      |    |
   *      1----0
   *   and the vertice order will still be (0, 1, 2, 3).
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
   */
  public com.google.cloud.vision.v1.BoundingPoly getBoundingBox() {
    return boundingBox_ == null ? com.google.cloud.vision.v1.BoundingPoly.getDefaultInstance() : boundingBox_;
  }
  /**
   * <pre>
   * The bounding box for the symbol.
   * The vertices are in the order of top-left, top-right, bottom-right,
   * bottom-left. When a rotation of the bounding box is detected the rotation
   * is represented as around the top-left corner as defined when the text is
   * read in the 'natural' orientation.
   * For example:
   *   * when the text is horizontal it might look like:
   *      0----1
   *      |    |
   *      3----2
   *   * when it's rotated 180 degrees around the top-left corner it becomes:
   *      2----3
   *      |    |
   *      1----0
   *   and the vertice order will still be (0, 1, 2, 3).
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
   */
  public com.google.cloud.vision.v1.BoundingPolyOrBuilder getBoundingBoxOrBuilder() {
    return getBoundingBox();
  }

  public static final int TEXT_FIELD_NUMBER = 3;
  private volatile java.lang.Object text_;
  /**
   * <pre>
   * The actual UTF-8 representation of the symbol.
   * </pre>
   *
   * <code>string text = 3;</code>
   */
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      text_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The actual UTF-8 representation of the symbol.
   * </pre>
   *
   * <code>string text = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      text_ = b;
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
    if (property_ != null) {
      output.writeMessage(1, getProperty());
    }
    if (boundingBox_ != null) {
      output.writeMessage(2, getBoundingBox());
    }
    if (!getTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, text_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (property_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProperty());
    }
    if (boundingBox_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBoundingBox());
    }
    if (!getTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, text_);
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
    if (!(obj instanceof com.google.cloud.vision.v1.Symbol)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1.Symbol other = (com.google.cloud.vision.v1.Symbol) obj;

    boolean result = true;
    result = result && (hasProperty() == other.hasProperty());
    if (hasProperty()) {
      result = result && getProperty()
          .equals(other.getProperty());
    }
    result = result && (hasBoundingBox() == other.hasBoundingBox());
    if (hasBoundingBox()) {
      result = result && getBoundingBox()
          .equals(other.getBoundingBox());
    }
    result = result && getText()
        .equals(other.getText());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasProperty()) {
      hash = (37 * hash) + PROPERTY_FIELD_NUMBER;
      hash = (53 * hash) + getProperty().hashCode();
    }
    if (hasBoundingBox()) {
      hash = (37 * hash) + BOUNDING_BOX_FIELD_NUMBER;
      hash = (53 * hash) + getBoundingBox().hashCode();
    }
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1.Symbol parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1.Symbol parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.Symbol parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1.Symbol parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.Symbol parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1.Symbol parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.Symbol parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1.Symbol parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.Symbol parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1.Symbol parseFrom(
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
  public static Builder newBuilder(com.google.cloud.vision.v1.Symbol prototype) {
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
   * A single symbol representation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1.Symbol}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1.Symbol)
      com.google.cloud.vision.v1.SymbolOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vision.v1.TextAnnotationProto.internal_static_google_cloud_vision_v1_Symbol_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1.TextAnnotationProto.internal_static_google_cloud_vision_v1_Symbol_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1.Symbol.class, com.google.cloud.vision.v1.Symbol.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1.Symbol.newBuilder()
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
      if (propertyBuilder_ == null) {
        property_ = null;
      } else {
        property_ = null;
        propertyBuilder_ = null;
      }
      if (boundingBoxBuilder_ == null) {
        boundingBox_ = null;
      } else {
        boundingBox_ = null;
        boundingBoxBuilder_ = null;
      }
      text_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vision.v1.TextAnnotationProto.internal_static_google_cloud_vision_v1_Symbol_descriptor;
    }

    public com.google.cloud.vision.v1.Symbol getDefaultInstanceForType() {
      return com.google.cloud.vision.v1.Symbol.getDefaultInstance();
    }

    public com.google.cloud.vision.v1.Symbol build() {
      com.google.cloud.vision.v1.Symbol result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.vision.v1.Symbol buildPartial() {
      com.google.cloud.vision.v1.Symbol result = new com.google.cloud.vision.v1.Symbol(this);
      if (propertyBuilder_ == null) {
        result.property_ = property_;
      } else {
        result.property_ = propertyBuilder_.build();
      }
      if (boundingBoxBuilder_ == null) {
        result.boundingBox_ = boundingBox_;
      } else {
        result.boundingBox_ = boundingBoxBuilder_.build();
      }
      result.text_ = text_;
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
      if (other instanceof com.google.cloud.vision.v1.Symbol) {
        return mergeFrom((com.google.cloud.vision.v1.Symbol)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1.Symbol other) {
      if (other == com.google.cloud.vision.v1.Symbol.getDefaultInstance()) return this;
      if (other.hasProperty()) {
        mergeProperty(other.getProperty());
      }
      if (other.hasBoundingBox()) {
        mergeBoundingBox(other.getBoundingBox());
      }
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
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
      com.google.cloud.vision.v1.Symbol parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.vision.v1.Symbol) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.vision.v1.TextAnnotation.TextProperty property_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vision.v1.TextAnnotation.TextProperty, com.google.cloud.vision.v1.TextAnnotation.TextProperty.Builder, com.google.cloud.vision.v1.TextAnnotation.TextPropertyOrBuilder> propertyBuilder_;
    /**
     * <pre>
     * Additional information detected for the symbol.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    public boolean hasProperty() {
      return propertyBuilder_ != null || property_ != null;
    }
    /**
     * <pre>
     * Additional information detected for the symbol.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    public com.google.cloud.vision.v1.TextAnnotation.TextProperty getProperty() {
      if (propertyBuilder_ == null) {
        return property_ == null ? com.google.cloud.vision.v1.TextAnnotation.TextProperty.getDefaultInstance() : property_;
      } else {
        return propertyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Additional information detected for the symbol.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    public Builder setProperty(com.google.cloud.vision.v1.TextAnnotation.TextProperty value) {
      if (propertyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        property_ = value;
        onChanged();
      } else {
        propertyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Additional information detected for the symbol.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    public Builder setProperty(
        com.google.cloud.vision.v1.TextAnnotation.TextProperty.Builder builderForValue) {
      if (propertyBuilder_ == null) {
        property_ = builderForValue.build();
        onChanged();
      } else {
        propertyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Additional information detected for the symbol.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    public Builder mergeProperty(com.google.cloud.vision.v1.TextAnnotation.TextProperty value) {
      if (propertyBuilder_ == null) {
        if (property_ != null) {
          property_ =
            com.google.cloud.vision.v1.TextAnnotation.TextProperty.newBuilder(property_).mergeFrom(value).buildPartial();
        } else {
          property_ = value;
        }
        onChanged();
      } else {
        propertyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Additional information detected for the symbol.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    public Builder clearProperty() {
      if (propertyBuilder_ == null) {
        property_ = null;
        onChanged();
      } else {
        property_ = null;
        propertyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Additional information detected for the symbol.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    public com.google.cloud.vision.v1.TextAnnotation.TextProperty.Builder getPropertyBuilder() {
      
      onChanged();
      return getPropertyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Additional information detected for the symbol.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    public com.google.cloud.vision.v1.TextAnnotation.TextPropertyOrBuilder getPropertyOrBuilder() {
      if (propertyBuilder_ != null) {
        return propertyBuilder_.getMessageOrBuilder();
      } else {
        return property_ == null ?
            com.google.cloud.vision.v1.TextAnnotation.TextProperty.getDefaultInstance() : property_;
      }
    }
    /**
     * <pre>
     * Additional information detected for the symbol.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vision.v1.TextAnnotation.TextProperty, com.google.cloud.vision.v1.TextAnnotation.TextProperty.Builder, com.google.cloud.vision.v1.TextAnnotation.TextPropertyOrBuilder> 
        getPropertyFieldBuilder() {
      if (propertyBuilder_ == null) {
        propertyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1.TextAnnotation.TextProperty, com.google.cloud.vision.v1.TextAnnotation.TextProperty.Builder, com.google.cloud.vision.v1.TextAnnotation.TextPropertyOrBuilder>(
                getProperty(),
                getParentForChildren(),
                isClean());
        property_ = null;
      }
      return propertyBuilder_;
    }

    private com.google.cloud.vision.v1.BoundingPoly boundingBox_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vision.v1.BoundingPoly, com.google.cloud.vision.v1.BoundingPoly.Builder, com.google.cloud.vision.v1.BoundingPolyOrBuilder> boundingBoxBuilder_;
    /**
     * <pre>
     * The bounding box for the symbol.
     * The vertices are in the order of top-left, top-right, bottom-right,
     * bottom-left. When a rotation of the bounding box is detected the rotation
     * is represented as around the top-left corner as defined when the text is
     * read in the 'natural' orientation.
     * For example:
     *   * when the text is horizontal it might look like:
     *      0----1
     *      |    |
     *      3----2
     *   * when it's rotated 180 degrees around the top-left corner it becomes:
     *      2----3
     *      |    |
     *      1----0
     *   and the vertice order will still be (0, 1, 2, 3).
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
     */
    public boolean hasBoundingBox() {
      return boundingBoxBuilder_ != null || boundingBox_ != null;
    }
    /**
     * <pre>
     * The bounding box for the symbol.
     * The vertices are in the order of top-left, top-right, bottom-right,
     * bottom-left. When a rotation of the bounding box is detected the rotation
     * is represented as around the top-left corner as defined when the text is
     * read in the 'natural' orientation.
     * For example:
     *   * when the text is horizontal it might look like:
     *      0----1
     *      |    |
     *      3----2
     *   * when it's rotated 180 degrees around the top-left corner it becomes:
     *      2----3
     *      |    |
     *      1----0
     *   and the vertice order will still be (0, 1, 2, 3).
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
     */
    public com.google.cloud.vision.v1.BoundingPoly getBoundingBox() {
      if (boundingBoxBuilder_ == null) {
        return boundingBox_ == null ? com.google.cloud.vision.v1.BoundingPoly.getDefaultInstance() : boundingBox_;
      } else {
        return boundingBoxBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The bounding box for the symbol.
     * The vertices are in the order of top-left, top-right, bottom-right,
     * bottom-left. When a rotation of the bounding box is detected the rotation
     * is represented as around the top-left corner as defined when the text is
     * read in the 'natural' orientation.
     * For example:
     *   * when the text is horizontal it might look like:
     *      0----1
     *      |    |
     *      3----2
     *   * when it's rotated 180 degrees around the top-left corner it becomes:
     *      2----3
     *      |    |
     *      1----0
     *   and the vertice order will still be (0, 1, 2, 3).
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
     */
    public Builder setBoundingBox(com.google.cloud.vision.v1.BoundingPoly value) {
      if (boundingBoxBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        boundingBox_ = value;
        onChanged();
      } else {
        boundingBoxBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The bounding box for the symbol.
     * The vertices are in the order of top-left, top-right, bottom-right,
     * bottom-left. When a rotation of the bounding box is detected the rotation
     * is represented as around the top-left corner as defined when the text is
     * read in the 'natural' orientation.
     * For example:
     *   * when the text is horizontal it might look like:
     *      0----1
     *      |    |
     *      3----2
     *   * when it's rotated 180 degrees around the top-left corner it becomes:
     *      2----3
     *      |    |
     *      1----0
     *   and the vertice order will still be (0, 1, 2, 3).
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
     */
    public Builder setBoundingBox(
        com.google.cloud.vision.v1.BoundingPoly.Builder builderForValue) {
      if (boundingBoxBuilder_ == null) {
        boundingBox_ = builderForValue.build();
        onChanged();
      } else {
        boundingBoxBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The bounding box for the symbol.
     * The vertices are in the order of top-left, top-right, bottom-right,
     * bottom-left. When a rotation of the bounding box is detected the rotation
     * is represented as around the top-left corner as defined when the text is
     * read in the 'natural' orientation.
     * For example:
     *   * when the text is horizontal it might look like:
     *      0----1
     *      |    |
     *      3----2
     *   * when it's rotated 180 degrees around the top-left corner it becomes:
     *      2----3
     *      |    |
     *      1----0
     *   and the vertice order will still be (0, 1, 2, 3).
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
     */
    public Builder mergeBoundingBox(com.google.cloud.vision.v1.BoundingPoly value) {
      if (boundingBoxBuilder_ == null) {
        if (boundingBox_ != null) {
          boundingBox_ =
            com.google.cloud.vision.v1.BoundingPoly.newBuilder(boundingBox_).mergeFrom(value).buildPartial();
        } else {
          boundingBox_ = value;
        }
        onChanged();
      } else {
        boundingBoxBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The bounding box for the symbol.
     * The vertices are in the order of top-left, top-right, bottom-right,
     * bottom-left. When a rotation of the bounding box is detected the rotation
     * is represented as around the top-left corner as defined when the text is
     * read in the 'natural' orientation.
     * For example:
     *   * when the text is horizontal it might look like:
     *      0----1
     *      |    |
     *      3----2
     *   * when it's rotated 180 degrees around the top-left corner it becomes:
     *      2----3
     *      |    |
     *      1----0
     *   and the vertice order will still be (0, 1, 2, 3).
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
     */
    public Builder clearBoundingBox() {
      if (boundingBoxBuilder_ == null) {
        boundingBox_ = null;
        onChanged();
      } else {
        boundingBox_ = null;
        boundingBoxBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The bounding box for the symbol.
     * The vertices are in the order of top-left, top-right, bottom-right,
     * bottom-left. When a rotation of the bounding box is detected the rotation
     * is represented as around the top-left corner as defined when the text is
     * read in the 'natural' orientation.
     * For example:
     *   * when the text is horizontal it might look like:
     *      0----1
     *      |    |
     *      3----2
     *   * when it's rotated 180 degrees around the top-left corner it becomes:
     *      2----3
     *      |    |
     *      1----0
     *   and the vertice order will still be (0, 1, 2, 3).
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
     */
    public com.google.cloud.vision.v1.BoundingPoly.Builder getBoundingBoxBuilder() {
      
      onChanged();
      return getBoundingBoxFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The bounding box for the symbol.
     * The vertices are in the order of top-left, top-right, bottom-right,
     * bottom-left. When a rotation of the bounding box is detected the rotation
     * is represented as around the top-left corner as defined when the text is
     * read in the 'natural' orientation.
     * For example:
     *   * when the text is horizontal it might look like:
     *      0----1
     *      |    |
     *      3----2
     *   * when it's rotated 180 degrees around the top-left corner it becomes:
     *      2----3
     *      |    |
     *      1----0
     *   and the vertice order will still be (0, 1, 2, 3).
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
     */
    public com.google.cloud.vision.v1.BoundingPolyOrBuilder getBoundingBoxOrBuilder() {
      if (boundingBoxBuilder_ != null) {
        return boundingBoxBuilder_.getMessageOrBuilder();
      } else {
        return boundingBox_ == null ?
            com.google.cloud.vision.v1.BoundingPoly.getDefaultInstance() : boundingBox_;
      }
    }
    /**
     * <pre>
     * The bounding box for the symbol.
     * The vertices are in the order of top-left, top-right, bottom-right,
     * bottom-left. When a rotation of the bounding box is detected the rotation
     * is represented as around the top-left corner as defined when the text is
     * read in the 'natural' orientation.
     * For example:
     *   * when the text is horizontal it might look like:
     *      0----1
     *      |    |
     *      3----2
     *   * when it's rotated 180 degrees around the top-left corner it becomes:
     *      2----3
     *      |    |
     *      1----0
     *   and the vertice order will still be (0, 1, 2, 3).
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vision.v1.BoundingPoly, com.google.cloud.vision.v1.BoundingPoly.Builder, com.google.cloud.vision.v1.BoundingPolyOrBuilder> 
        getBoundingBoxFieldBuilder() {
      if (boundingBoxBuilder_ == null) {
        boundingBoxBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1.BoundingPoly, com.google.cloud.vision.v1.BoundingPoly.Builder, com.google.cloud.vision.v1.BoundingPolyOrBuilder>(
                getBoundingBox(),
                getParentForChildren(),
                isClean());
        boundingBox_ = null;
      }
      return boundingBoxBuilder_;
    }

    private java.lang.Object text_ = "";
    /**
     * <pre>
     * The actual UTF-8 representation of the symbol.
     * </pre>
     *
     * <code>string text = 3;</code>
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The actual UTF-8 representation of the symbol.
     * </pre>
     *
     * <code>string text = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The actual UTF-8 representation of the symbol.
     * </pre>
     *
     * <code>string text = 3;</code>
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      text_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The actual UTF-8 representation of the symbol.
     * </pre>
     *
     * <code>string text = 3;</code>
     */
    public Builder clearText() {
      
      text_ = getDefaultInstance().getText();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The actual UTF-8 representation of the symbol.
     * </pre>
     *
     * <code>string text = 3;</code>
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      text_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1.Symbol)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1.Symbol)
  private static final com.google.cloud.vision.v1.Symbol DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1.Symbol();
  }

  public static com.google.cloud.vision.v1.Symbol getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Symbol>
      PARSER = new com.google.protobuf.AbstractParser<Symbol>() {
    public Symbol parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Symbol(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Symbol> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Symbol> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.vision.v1.Symbol getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

