// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/example/library/v1/library.proto

package com.google.example.library.v1;

/**
 * <pre>
 * Request message for LibraryService.UpdateBook.
 * </pre>
 *
 * Protobuf type {@code google.example.library.v1.UpdateBookRequest}
 */
public  final class UpdateBookRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.example.library.v1.UpdateBookRequest)
    UpdateBookRequestOrBuilder {
  // Use UpdateBookRequest.newBuilder() to construct.
  private UpdateBookRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateBookRequest() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UpdateBookRequest(
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
            com.google.example.library.v1.Book.Builder subBuilder = null;
            if (book_ != null) {
              subBuilder = book_.toBuilder();
            }
            book_ = input.readMessage(com.google.example.library.v1.Book.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(book_);
              book_ = subBuilder.buildPartial();
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
    return com.google.example.library.v1.LibraryProto.internal_static_google_example_library_v1_UpdateBookRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.example.library.v1.LibraryProto.internal_static_google_example_library_v1_UpdateBookRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.example.library.v1.UpdateBookRequest.class, com.google.example.library.v1.UpdateBookRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The name of the book to update.
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
   * The name of the book to update.
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

  public static final int BOOK_FIELD_NUMBER = 2;
  private com.google.example.library.v1.Book book_;
  /**
   * <pre>
   * The book to update with. The name must match or be empty.
   * </pre>
   *
   * <code>.google.example.library.v1.Book book = 2;</code>
   */
  public boolean hasBook() {
    return book_ != null;
  }
  /**
   * <pre>
   * The book to update with. The name must match or be empty.
   * </pre>
   *
   * <code>.google.example.library.v1.Book book = 2;</code>
   */
  public com.google.example.library.v1.Book getBook() {
    return book_ == null ? com.google.example.library.v1.Book.getDefaultInstance() : book_;
  }
  /**
   * <pre>
   * The book to update with. The name must match or be empty.
   * </pre>
   *
   * <code>.google.example.library.v1.Book book = 2;</code>
   */
  public com.google.example.library.v1.BookOrBuilder getBookOrBuilder() {
    return getBook();
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
    if (book_ != null) {
      output.writeMessage(2, getBook());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (book_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBook());
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
    if (!(obj instanceof com.google.example.library.v1.UpdateBookRequest)) {
      return super.equals(obj);
    }
    com.google.example.library.v1.UpdateBookRequest other = (com.google.example.library.v1.UpdateBookRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (hasBook() == other.hasBook());
    if (hasBook()) {
      result = result && getBook()
          .equals(other.getBook());
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
    if (hasBook()) {
      hash = (37 * hash) + BOOK_FIELD_NUMBER;
      hash = (53 * hash) + getBook().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.example.library.v1.UpdateBookRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.example.library.v1.UpdateBookRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.example.library.v1.UpdateBookRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.example.library.v1.UpdateBookRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.example.library.v1.UpdateBookRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.example.library.v1.UpdateBookRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.example.library.v1.UpdateBookRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.example.library.v1.UpdateBookRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.example.library.v1.UpdateBookRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.example.library.v1.UpdateBookRequest parseFrom(
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
  public static Builder newBuilder(com.google.example.library.v1.UpdateBookRequest prototype) {
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
   * Request message for LibraryService.UpdateBook.
   * </pre>
   *
   * Protobuf type {@code google.example.library.v1.UpdateBookRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.example.library.v1.UpdateBookRequest)
      com.google.example.library.v1.UpdateBookRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.example.library.v1.LibraryProto.internal_static_google_example_library_v1_UpdateBookRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.example.library.v1.LibraryProto.internal_static_google_example_library_v1_UpdateBookRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.example.library.v1.UpdateBookRequest.class, com.google.example.library.v1.UpdateBookRequest.Builder.class);
    }

    // Construct using com.google.example.library.v1.UpdateBookRequest.newBuilder()
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

      if (bookBuilder_ == null) {
        book_ = null;
      } else {
        book_ = null;
        bookBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.example.library.v1.LibraryProto.internal_static_google_example_library_v1_UpdateBookRequest_descriptor;
    }

    public com.google.example.library.v1.UpdateBookRequest getDefaultInstanceForType() {
      return com.google.example.library.v1.UpdateBookRequest.getDefaultInstance();
    }

    public com.google.example.library.v1.UpdateBookRequest build() {
      com.google.example.library.v1.UpdateBookRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.example.library.v1.UpdateBookRequest buildPartial() {
      com.google.example.library.v1.UpdateBookRequest result = new com.google.example.library.v1.UpdateBookRequest(this);
      result.name_ = name_;
      if (bookBuilder_ == null) {
        result.book_ = book_;
      } else {
        result.book_ = bookBuilder_.build();
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
      if (other instanceof com.google.example.library.v1.UpdateBookRequest) {
        return mergeFrom((com.google.example.library.v1.UpdateBookRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.example.library.v1.UpdateBookRequest other) {
      if (other == com.google.example.library.v1.UpdateBookRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasBook()) {
        mergeBook(other.getBook());
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
      com.google.example.library.v1.UpdateBookRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.example.library.v1.UpdateBookRequest) e.getUnfinishedMessage();
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
     * The name of the book to update.
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
     * The name of the book to update.
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
     * The name of the book to update.
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
     * The name of the book to update.
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
     * The name of the book to update.
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

    private com.google.example.library.v1.Book book_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.example.library.v1.Book, com.google.example.library.v1.Book.Builder, com.google.example.library.v1.BookOrBuilder> bookBuilder_;
    /**
     * <pre>
     * The book to update with. The name must match or be empty.
     * </pre>
     *
     * <code>.google.example.library.v1.Book book = 2;</code>
     */
    public boolean hasBook() {
      return bookBuilder_ != null || book_ != null;
    }
    /**
     * <pre>
     * The book to update with. The name must match or be empty.
     * </pre>
     *
     * <code>.google.example.library.v1.Book book = 2;</code>
     */
    public com.google.example.library.v1.Book getBook() {
      if (bookBuilder_ == null) {
        return book_ == null ? com.google.example.library.v1.Book.getDefaultInstance() : book_;
      } else {
        return bookBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The book to update with. The name must match or be empty.
     * </pre>
     *
     * <code>.google.example.library.v1.Book book = 2;</code>
     */
    public Builder setBook(com.google.example.library.v1.Book value) {
      if (bookBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        book_ = value;
        onChanged();
      } else {
        bookBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The book to update with. The name must match or be empty.
     * </pre>
     *
     * <code>.google.example.library.v1.Book book = 2;</code>
     */
    public Builder setBook(
        com.google.example.library.v1.Book.Builder builderForValue) {
      if (bookBuilder_ == null) {
        book_ = builderForValue.build();
        onChanged();
      } else {
        bookBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The book to update with. The name must match or be empty.
     * </pre>
     *
     * <code>.google.example.library.v1.Book book = 2;</code>
     */
    public Builder mergeBook(com.google.example.library.v1.Book value) {
      if (bookBuilder_ == null) {
        if (book_ != null) {
          book_ =
            com.google.example.library.v1.Book.newBuilder(book_).mergeFrom(value).buildPartial();
        } else {
          book_ = value;
        }
        onChanged();
      } else {
        bookBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The book to update with. The name must match or be empty.
     * </pre>
     *
     * <code>.google.example.library.v1.Book book = 2;</code>
     */
    public Builder clearBook() {
      if (bookBuilder_ == null) {
        book_ = null;
        onChanged();
      } else {
        book_ = null;
        bookBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The book to update with. The name must match or be empty.
     * </pre>
     *
     * <code>.google.example.library.v1.Book book = 2;</code>
     */
    public com.google.example.library.v1.Book.Builder getBookBuilder() {
      
      onChanged();
      return getBookFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The book to update with. The name must match or be empty.
     * </pre>
     *
     * <code>.google.example.library.v1.Book book = 2;</code>
     */
    public com.google.example.library.v1.BookOrBuilder getBookOrBuilder() {
      if (bookBuilder_ != null) {
        return bookBuilder_.getMessageOrBuilder();
      } else {
        return book_ == null ?
            com.google.example.library.v1.Book.getDefaultInstance() : book_;
      }
    }
    /**
     * <pre>
     * The book to update with. The name must match or be empty.
     * </pre>
     *
     * <code>.google.example.library.v1.Book book = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.example.library.v1.Book, com.google.example.library.v1.Book.Builder, com.google.example.library.v1.BookOrBuilder> 
        getBookFieldBuilder() {
      if (bookBuilder_ == null) {
        bookBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.example.library.v1.Book, com.google.example.library.v1.Book.Builder, com.google.example.library.v1.BookOrBuilder>(
                getBook(),
                getParentForChildren(),
                isClean());
        book_ = null;
      }
      return bookBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.example.library.v1.UpdateBookRequest)
  }

  // @@protoc_insertion_point(class_scope:google.example.library.v1.UpdateBookRequest)
  private static final com.google.example.library.v1.UpdateBookRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.example.library.v1.UpdateBookRequest();
  }

  public static com.google.example.library.v1.UpdateBookRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateBookRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateBookRequest>() {
    public UpdateBookRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpdateBookRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateBookRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateBookRequest> getParserForType() {
    return PARSER;
  }

  public com.google.example.library.v1.UpdateBookRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

