// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/app_yaml.proto

package com.google.appengine.v1;

/**
 * <pre>
 * Custom static error page to be served when an error occurs.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.ErrorHandler}
 */
public  final class ErrorHandler extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.ErrorHandler)
    ErrorHandlerOrBuilder {
  // Use ErrorHandler.newBuilder() to construct.
  private ErrorHandler(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ErrorHandler() {
    errorCode_ = 0;
    staticFile_ = "";
    mimeType_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ErrorHandler(
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
          case 8: {
            int rawValue = input.readEnum();

            errorCode_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            staticFile_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            mimeType_ = s;
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
    return com.google.appengine.v1.AppYamlProto.internal_static_google_appengine_v1_ErrorHandler_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.AppYamlProto.internal_static_google_appengine_v1_ErrorHandler_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.ErrorHandler.class, com.google.appengine.v1.ErrorHandler.Builder.class);
  }

  /**
   * <pre>
   * Error codes.
   * </pre>
   *
   * Protobuf enum {@code google.appengine.v1.ErrorHandler.ErrorCode}
   */
  public enum ErrorCode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified. ERROR_CODE_DEFAULT is assumed.
     * </pre>
     *
     * <code>ERROR_CODE_UNSPECIFIED = 0;</code>
     */
    ERROR_CODE_UNSPECIFIED(0, 0),
    /**
     * <pre>
     * Application has exceeded a resource quota.
     * </pre>
     *
     * <code>ERROR_CODE_OVER_QUOTA = 1;</code>
     */
    ERROR_CODE_OVER_QUOTA(2, 1),
    /**
     * <pre>
     * Client blocked by the application's Denial of Service protection
     * configuration.
     * </pre>
     *
     * <code>ERROR_CODE_DOS_API_DENIAL = 2;</code>
     */
    ERROR_CODE_DOS_API_DENIAL(3, 2),
    /**
     * <pre>
     * Deadline reached before the application responds.
     * </pre>
     *
     * <code>ERROR_CODE_TIMEOUT = 3;</code>
     */
    ERROR_CODE_TIMEOUT(4, 3),
    UNRECOGNIZED(-1, -1),
    ;

    /**
     * <pre>
     * All other error types.
     * </pre>
     *
     * <code>ERROR_CODE_DEFAULT = 0;</code>
     */
    public static final ErrorCode ERROR_CODE_DEFAULT = ERROR_CODE_UNSPECIFIED;
    /**
     * <pre>
     * Not specified. ERROR_CODE_DEFAULT is assumed.
     * </pre>
     *
     * <code>ERROR_CODE_UNSPECIFIED = 0;</code>
     */
    public static final int ERROR_CODE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * All other error types.
     * </pre>
     *
     * <code>ERROR_CODE_DEFAULT = 0;</code>
     */
    public static final int ERROR_CODE_DEFAULT_VALUE = 0;
    /**
     * <pre>
     * Application has exceeded a resource quota.
     * </pre>
     *
     * <code>ERROR_CODE_OVER_QUOTA = 1;</code>
     */
    public static final int ERROR_CODE_OVER_QUOTA_VALUE = 1;
    /**
     * <pre>
     * Client blocked by the application's Denial of Service protection
     * configuration.
     * </pre>
     *
     * <code>ERROR_CODE_DOS_API_DENIAL = 2;</code>
     */
    public static final int ERROR_CODE_DOS_API_DENIAL_VALUE = 2;
    /**
     * <pre>
     * Deadline reached before the application responds.
     * </pre>
     *
     * <code>ERROR_CODE_TIMEOUT = 3;</code>
     */
    public static final int ERROR_CODE_TIMEOUT_VALUE = 3;


    public final int getNumber() {
      if (index == -1) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ErrorCode valueOf(int value) {
      return forNumber(value);
    }

    public static ErrorCode forNumber(int value) {
      switch (value) {
        case 0: return ERROR_CODE_UNSPECIFIED;
        case 1: return ERROR_CODE_OVER_QUOTA;
        case 2: return ERROR_CODE_DOS_API_DENIAL;
        case 3: return ERROR_CODE_TIMEOUT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ErrorCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ErrorCode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ErrorCode>() {
            public ErrorCode findValueByNumber(int number) {
              return ErrorCode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.appengine.v1.ErrorHandler.getDescriptor().getEnumTypes().get(0);
    }

    private static final ErrorCode[] VALUES = {
      ERROR_CODE_UNSPECIFIED, ERROR_CODE_DEFAULT, ERROR_CODE_OVER_QUOTA, ERROR_CODE_DOS_API_DENIAL, ERROR_CODE_TIMEOUT, 
    };

    public static ErrorCode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private ErrorCode(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.appengine.v1.ErrorHandler.ErrorCode)
  }

  public static final int ERROR_CODE_FIELD_NUMBER = 1;
  private int errorCode_;
  /**
   * <pre>
   * Error condition this handler applies to.
   * </pre>
   *
   * <code>.google.appengine.v1.ErrorHandler.ErrorCode error_code = 1;</code>
   */
  public int getErrorCodeValue() {
    return errorCode_;
  }
  /**
   * <pre>
   * Error condition this handler applies to.
   * </pre>
   *
   * <code>.google.appengine.v1.ErrorHandler.ErrorCode error_code = 1;</code>
   */
  public com.google.appengine.v1.ErrorHandler.ErrorCode getErrorCode() {
    com.google.appengine.v1.ErrorHandler.ErrorCode result = com.google.appengine.v1.ErrorHandler.ErrorCode.valueOf(errorCode_);
    return result == null ? com.google.appengine.v1.ErrorHandler.ErrorCode.UNRECOGNIZED : result;
  }

  public static final int STATIC_FILE_FIELD_NUMBER = 2;
  private volatile java.lang.Object staticFile_;
  /**
   * <pre>
   * Static file content to be served for this error.
   * </pre>
   *
   * <code>string static_file = 2;</code>
   */
  public java.lang.String getStaticFile() {
    java.lang.Object ref = staticFile_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      staticFile_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Static file content to be served for this error.
   * </pre>
   *
   * <code>string static_file = 2;</code>
   */
  public com.google.protobuf.ByteString
      getStaticFileBytes() {
    java.lang.Object ref = staticFile_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      staticFile_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MIME_TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object mimeType_;
  /**
   * <pre>
   * MIME type of file. Defaults to `text/html`.
   * </pre>
   *
   * <code>string mime_type = 3;</code>
   */
  public java.lang.String getMimeType() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mimeType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * MIME type of file. Defaults to `text/html`.
   * </pre>
   *
   * <code>string mime_type = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMimeTypeBytes() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mimeType_ = b;
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
    if (errorCode_ != com.google.appengine.v1.ErrorHandler.ErrorCode.ERROR_CODE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, errorCode_);
    }
    if (!getStaticFileBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, staticFile_);
    }
    if (!getMimeTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, mimeType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (errorCode_ != com.google.appengine.v1.ErrorHandler.ErrorCode.ERROR_CODE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, errorCode_);
    }
    if (!getStaticFileBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, staticFile_);
    }
    if (!getMimeTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, mimeType_);
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
    if (!(obj instanceof com.google.appengine.v1.ErrorHandler)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.ErrorHandler other = (com.google.appengine.v1.ErrorHandler) obj;

    boolean result = true;
    result = result && errorCode_ == other.errorCode_;
    result = result && getStaticFile()
        .equals(other.getStaticFile());
    result = result && getMimeType()
        .equals(other.getMimeType());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ERROR_CODE_FIELD_NUMBER;
    hash = (53 * hash) + errorCode_;
    hash = (37 * hash) + STATIC_FILE_FIELD_NUMBER;
    hash = (53 * hash) + getStaticFile().hashCode();
    hash = (37 * hash) + MIME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMimeType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.ErrorHandler parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.ErrorHandler parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.ErrorHandler parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.ErrorHandler parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.ErrorHandler parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.ErrorHandler parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.ErrorHandler parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.ErrorHandler parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.ErrorHandler parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.ErrorHandler parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1.ErrorHandler prototype) {
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
   * Custom static error page to be served when an error occurs.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.ErrorHandler}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.ErrorHandler)
      com.google.appengine.v1.ErrorHandlerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1.AppYamlProto.internal_static_google_appengine_v1_ErrorHandler_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.AppYamlProto.internal_static_google_appengine_v1_ErrorHandler_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.ErrorHandler.class, com.google.appengine.v1.ErrorHandler.Builder.class);
    }

    // Construct using com.google.appengine.v1.ErrorHandler.newBuilder()
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
      errorCode_ = 0;

      staticFile_ = "";

      mimeType_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1.AppYamlProto.internal_static_google_appengine_v1_ErrorHandler_descriptor;
    }

    public com.google.appengine.v1.ErrorHandler getDefaultInstanceForType() {
      return com.google.appengine.v1.ErrorHandler.getDefaultInstance();
    }

    public com.google.appengine.v1.ErrorHandler build() {
      com.google.appengine.v1.ErrorHandler result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.appengine.v1.ErrorHandler buildPartial() {
      com.google.appengine.v1.ErrorHandler result = new com.google.appengine.v1.ErrorHandler(this);
      result.errorCode_ = errorCode_;
      result.staticFile_ = staticFile_;
      result.mimeType_ = mimeType_;
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
      if (other instanceof com.google.appengine.v1.ErrorHandler) {
        return mergeFrom((com.google.appengine.v1.ErrorHandler)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.ErrorHandler other) {
      if (other == com.google.appengine.v1.ErrorHandler.getDefaultInstance()) return this;
      if (other.errorCode_ != 0) {
        setErrorCodeValue(other.getErrorCodeValue());
      }
      if (!other.getStaticFile().isEmpty()) {
        staticFile_ = other.staticFile_;
        onChanged();
      }
      if (!other.getMimeType().isEmpty()) {
        mimeType_ = other.mimeType_;
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
      com.google.appengine.v1.ErrorHandler parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.appengine.v1.ErrorHandler) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int errorCode_ = 0;
    /**
     * <pre>
     * Error condition this handler applies to.
     * </pre>
     *
     * <code>.google.appengine.v1.ErrorHandler.ErrorCode error_code = 1;</code>
     */
    public int getErrorCodeValue() {
      return errorCode_;
    }
    /**
     * <pre>
     * Error condition this handler applies to.
     * </pre>
     *
     * <code>.google.appengine.v1.ErrorHandler.ErrorCode error_code = 1;</code>
     */
    public Builder setErrorCodeValue(int value) {
      errorCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Error condition this handler applies to.
     * </pre>
     *
     * <code>.google.appengine.v1.ErrorHandler.ErrorCode error_code = 1;</code>
     */
    public com.google.appengine.v1.ErrorHandler.ErrorCode getErrorCode() {
      com.google.appengine.v1.ErrorHandler.ErrorCode result = com.google.appengine.v1.ErrorHandler.ErrorCode.valueOf(errorCode_);
      return result == null ? com.google.appengine.v1.ErrorHandler.ErrorCode.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Error condition this handler applies to.
     * </pre>
     *
     * <code>.google.appengine.v1.ErrorHandler.ErrorCode error_code = 1;</code>
     */
    public Builder setErrorCode(com.google.appengine.v1.ErrorHandler.ErrorCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      errorCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Error condition this handler applies to.
     * </pre>
     *
     * <code>.google.appengine.v1.ErrorHandler.ErrorCode error_code = 1;</code>
     */
    public Builder clearErrorCode() {
      
      errorCode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object staticFile_ = "";
    /**
     * <pre>
     * Static file content to be served for this error.
     * </pre>
     *
     * <code>string static_file = 2;</code>
     */
    public java.lang.String getStaticFile() {
      java.lang.Object ref = staticFile_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        staticFile_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Static file content to be served for this error.
     * </pre>
     *
     * <code>string static_file = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStaticFileBytes() {
      java.lang.Object ref = staticFile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        staticFile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Static file content to be served for this error.
     * </pre>
     *
     * <code>string static_file = 2;</code>
     */
    public Builder setStaticFile(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      staticFile_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Static file content to be served for this error.
     * </pre>
     *
     * <code>string static_file = 2;</code>
     */
    public Builder clearStaticFile() {
      
      staticFile_ = getDefaultInstance().getStaticFile();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Static file content to be served for this error.
     * </pre>
     *
     * <code>string static_file = 2;</code>
     */
    public Builder setStaticFileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      staticFile_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object mimeType_ = "";
    /**
     * <pre>
     * MIME type of file. Defaults to `text/html`.
     * </pre>
     *
     * <code>string mime_type = 3;</code>
     */
    public java.lang.String getMimeType() {
      java.lang.Object ref = mimeType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mimeType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * MIME type of file. Defaults to `text/html`.
     * </pre>
     *
     * <code>string mime_type = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMimeTypeBytes() {
      java.lang.Object ref = mimeType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mimeType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * MIME type of file. Defaults to `text/html`.
     * </pre>
     *
     * <code>string mime_type = 3;</code>
     */
    public Builder setMimeType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mimeType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MIME type of file. Defaults to `text/html`.
     * </pre>
     *
     * <code>string mime_type = 3;</code>
     */
    public Builder clearMimeType() {
      
      mimeType_ = getDefaultInstance().getMimeType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MIME type of file. Defaults to `text/html`.
     * </pre>
     *
     * <code>string mime_type = 3;</code>
     */
    public Builder setMimeTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mimeType_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.appengine.v1.ErrorHandler)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.ErrorHandler)
  private static final com.google.appengine.v1.ErrorHandler DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.ErrorHandler();
  }

  public static com.google.appengine.v1.ErrorHandler getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorHandler>
      PARSER = new com.google.protobuf.AbstractParser<ErrorHandler>() {
    public ErrorHandler parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ErrorHandler(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ErrorHandler> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErrorHandler> getParserForType() {
    return PARSER;
  }

  public com.google.appengine.v1.ErrorHandler getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

