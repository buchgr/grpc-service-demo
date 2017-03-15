// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/spanner_database_admin.proto

package com.google.spanner.admin.database.v1;

/**
 * <pre>
 * The request for [DropDatabase][google.spanner.admin.database.v1.DatabaseAdmin.DropDatabase].
 * </pre>
 *
 * Protobuf type {@code google.spanner.admin.database.v1.DropDatabaseRequest}
 */
public  final class DropDatabaseRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.spanner.admin.database.v1.DropDatabaseRequest)
    DropDatabaseRequestOrBuilder {
  // Use DropDatabaseRequest.newBuilder() to construct.
  private DropDatabaseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DropDatabaseRequest() {
    database_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DropDatabaseRequest(
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

            database_ = s;
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
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto.internal_static_google_spanner_admin_database_v1_DropDatabaseRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto.internal_static_google_spanner_admin_database_v1_DropDatabaseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.admin.database.v1.DropDatabaseRequest.class, com.google.spanner.admin.database.v1.DropDatabaseRequest.Builder.class);
  }

  public static final int DATABASE_FIELD_NUMBER = 1;
  private volatile java.lang.Object database_;
  /**
   * <pre>
   * Required. The database to be dropped.
   * </pre>
   *
   * <code>string database = 1;</code>
   */
  public java.lang.String getDatabase() {
    java.lang.Object ref = database_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      database_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The database to be dropped.
   * </pre>
   *
   * <code>string database = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDatabaseBytes() {
    java.lang.Object ref = database_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      database_ = b;
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
    if (!getDatabaseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, database_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDatabaseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, database_);
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
    if (!(obj instanceof com.google.spanner.admin.database.v1.DropDatabaseRequest)) {
      return super.equals(obj);
    }
    com.google.spanner.admin.database.v1.DropDatabaseRequest other = (com.google.spanner.admin.database.v1.DropDatabaseRequest) obj;

    boolean result = true;
    result = result && getDatabase()
        .equals(other.getDatabase());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DATABASE_FIELD_NUMBER;
    hash = (53 * hash) + getDatabase().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.admin.database.v1.DropDatabaseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.admin.database.v1.DropDatabaseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.admin.database.v1.DropDatabaseRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.admin.database.v1.DropDatabaseRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.admin.database.v1.DropDatabaseRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.admin.database.v1.DropDatabaseRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.admin.database.v1.DropDatabaseRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.spanner.admin.database.v1.DropDatabaseRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.admin.database.v1.DropDatabaseRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.admin.database.v1.DropDatabaseRequest parseFrom(
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
  public static Builder newBuilder(com.google.spanner.admin.database.v1.DropDatabaseRequest prototype) {
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
   * The request for [DropDatabase][google.spanner.admin.database.v1.DatabaseAdmin.DropDatabase].
   * </pre>
   *
   * Protobuf type {@code google.spanner.admin.database.v1.DropDatabaseRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.spanner.admin.database.v1.DropDatabaseRequest)
      com.google.spanner.admin.database.v1.DropDatabaseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto.internal_static_google_spanner_admin_database_v1_DropDatabaseRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto.internal_static_google_spanner_admin_database_v1_DropDatabaseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.admin.database.v1.DropDatabaseRequest.class, com.google.spanner.admin.database.v1.DropDatabaseRequest.Builder.class);
    }

    // Construct using com.google.spanner.admin.database.v1.DropDatabaseRequest.newBuilder()
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
      database_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto.internal_static_google_spanner_admin_database_v1_DropDatabaseRequest_descriptor;
    }

    public com.google.spanner.admin.database.v1.DropDatabaseRequest getDefaultInstanceForType() {
      return com.google.spanner.admin.database.v1.DropDatabaseRequest.getDefaultInstance();
    }

    public com.google.spanner.admin.database.v1.DropDatabaseRequest build() {
      com.google.spanner.admin.database.v1.DropDatabaseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.spanner.admin.database.v1.DropDatabaseRequest buildPartial() {
      com.google.spanner.admin.database.v1.DropDatabaseRequest result = new com.google.spanner.admin.database.v1.DropDatabaseRequest(this);
      result.database_ = database_;
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
      if (other instanceof com.google.spanner.admin.database.v1.DropDatabaseRequest) {
        return mergeFrom((com.google.spanner.admin.database.v1.DropDatabaseRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.admin.database.v1.DropDatabaseRequest other) {
      if (other == com.google.spanner.admin.database.v1.DropDatabaseRequest.getDefaultInstance()) return this;
      if (!other.getDatabase().isEmpty()) {
        database_ = other.database_;
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
      com.google.spanner.admin.database.v1.DropDatabaseRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.spanner.admin.database.v1.DropDatabaseRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object database_ = "";
    /**
     * <pre>
     * Required. The database to be dropped.
     * </pre>
     *
     * <code>string database = 1;</code>
     */
    public java.lang.String getDatabase() {
      java.lang.Object ref = database_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        database_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The database to be dropped.
     * </pre>
     *
     * <code>string database = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDatabaseBytes() {
      java.lang.Object ref = database_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        database_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The database to be dropped.
     * </pre>
     *
     * <code>string database = 1;</code>
     */
    public Builder setDatabase(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      database_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The database to be dropped.
     * </pre>
     *
     * <code>string database = 1;</code>
     */
    public Builder clearDatabase() {
      
      database_ = getDefaultInstance().getDatabase();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The database to be dropped.
     * </pre>
     *
     * <code>string database = 1;</code>
     */
    public Builder setDatabaseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      database_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.spanner.admin.database.v1.DropDatabaseRequest)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.admin.database.v1.DropDatabaseRequest)
  private static final com.google.spanner.admin.database.v1.DropDatabaseRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.spanner.admin.database.v1.DropDatabaseRequest();
  }

  public static com.google.spanner.admin.database.v1.DropDatabaseRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DropDatabaseRequest>
      PARSER = new com.google.protobuf.AbstractParser<DropDatabaseRequest>() {
    public DropDatabaseRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DropDatabaseRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DropDatabaseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DropDatabaseRequest> getParserForType() {
    return PARSER;
  }

  public com.google.spanner.admin.database.v1.DropDatabaseRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

