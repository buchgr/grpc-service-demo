// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/ml/v1beta1/prediction_service.proto

package com.google.cloud.ml.api.v1beta1;

/**
 * <pre>
 * Request for predictions to be issued against a trained model.
 * The body of the request is a single JSON object with a single top-level
 * field:
 * &lt;dl&gt;
 *   &lt;dt&gt;instances&lt;/dt&gt;
 *   &lt;dd&gt;A JSON array containing values representing the instances to use for
 *       prediction.&lt;/dd&gt;
 * &lt;/dl&gt;
 * The structure of each element of the instances list is determined by your
 * model's input definition. Instances can include named inputs or can contain
 * only unlabeled values.
 * Not all data includes named inputs. Some instances will be simple
 * JSON values (boolean, number, or string). However, instances are often lists
 * of simple values, or complex nested lists. Here are some examples of request
 * bodies:
 * CSV data with each row encoded as a string value:
 * &lt;pre&gt;
 * {"instances": ["1.0,true,&#92;&#92;"x&#92;&#92;"", "-2.0,false,&#92;&#92;"y&#92;&#92;""]}
 * &lt;/pre&gt;
 * Plain text:
 * &lt;pre&gt;
 * {"instances": ["the quick brown fox", "la bruja le dio"]}
 * &lt;/pre&gt;
 * Sentences encoded as lists of words (vectors of strings):
 * &lt;pre&gt;
 * {
 *   "instances": [
 *     ["the","quick","brown"],
 *     ["la","bruja","le"],
 *     ...
 *   ]
 * }
 * &lt;/pre&gt;
 * Floating point scalar values:
 * &lt;pre&gt;
 * {"instances": [0.0, 1.1, 2.2]}
 * &lt;/pre&gt;
 * Vectors of integers:
 * &lt;pre&gt;
 * {
 *   "instances": [
 *     [0, 1, 2],
 *     [3, 4, 5],
 *     ...
 *   ]
 * }
 * &lt;/pre&gt;
 * Tensors (in this case, two-dimensional tensors):
 * &lt;pre&gt;
 * {
 *   "instances": [
 *     [
 *       [0, 1, 2],
 *       [3, 4, 5]
 *     ],
 *     ...
 *   ]
 * }
 * &lt;/pre&gt;
 * Images can be represented different ways. In this encoding scheme the first
 * two dimensions represent the rows and columns of the image, and the third
 * contains lists (vectors) of the R, G, and B values for each pixel.
 * &lt;pre&gt;
 * {
 *   "instances": [
 *     [
 *       [
 *         [138, 30, 66],
 *         [130, 20, 56],
 *         ...
 *       ],
 *       [
 *         [126, 38, 61],
 *         [122, 24, 57],
 *         ...
 *       ],
 *       ...
 *     ],
 *     ...
 *   ]
 * }
 * &lt;/pre&gt;
 * JSON strings must be encoded as UTF-8. To send binary data, you must
 * base64-encode the data and mark it as binary. To mark a JSON string
 * as binary, replace it with a JSON object with a single attribute named `b64`:
 * &lt;pre&gt;{"b64": "..."} &lt;/pre&gt;
 * For example:
 * Two Serialized tf.Examples (fake data, for illustrative purposes only):
 * &lt;pre&gt;
 * {"instances": [{"b64": "X5ad6u"}, {"b64": "IA9j4nx"}]}
 * &lt;/pre&gt;
 * Two JPEG image byte strings (fake data, for illustrative purposes only):
 * &lt;pre&gt;
 * {"instances": [{"b64": "ASa8asdf"}, {"b64": "JLK7ljk3"}]}
 * &lt;/pre&gt;
 * If your data includes named references, format each instance as a JSON object
 * with the named references as the keys:
 * JSON input data to be preprocessed:
 * &lt;pre&gt;
 * {
 *   "instances": [
 *     {
 *       "a": 1.0,
 *       "b": true,
 *       "c": "x"
 *     },
 *     {
 *       "a": -2.0,
 *       "b": false,
 *       "c": "y"
 *     }
 *   ]
 * }
 * &lt;/pre&gt;
 * Some models have an underlying TensorFlow graph that accepts multiple input
 * tensors. In this case, you should use the names of JSON name/value pairs to
 * identify the input tensors, as shown in the following exmaples:
 * For a graph with input tensor aliases "tag" (string) and "image"
 * (base64-encoded string):
 * &lt;pre&gt;
 * {
 *   "instances": [
 *     {
 *       "tag": "beach",
 *       "image": {"b64": "ASa8asdf"}
 *     },
 *     {
 *       "tag": "car",
 *       "image": {"b64": "JLK7ljk3"}
 *     }
 *   ]
 * }
 * &lt;/pre&gt;
 * For a graph with input tensor aliases "tag" (string) and "image"
 * (3-dimensional array of 8-bit ints):
 * &lt;pre&gt;
 * {
 *   "instances": [
 *     {
 *       "tag": "beach",
 *       "image": [
 *         [
 *           [138, 30, 66],
 *           [130, 20, 56],
 *           ...
 *         ],
 *         [
 *           [126, 38, 61],
 *           [122, 24, 57],
 *           ...
 *         ],
 *         ...
 *       ]
 *     },
 *     {
 *       "tag": "car",
 *       "image": [
 *         [
 *           [255, 0, 102],
 *           [255, 0, 97],
 *           ...
 *         ],
 *         [
 *           [254, 1, 101],
 *           [254, 2, 93],
 *           ...
 *         ],
 *         ...
 *       ]
 *     },
 *     ...
 *   ]
 * }
 * &lt;/pre&gt;
 * If the call is successful, the response body will contain one prediction
 * entry per instance in the request body. If prediction fails for any
 * instance, the response body will contain no predictions and will contian
 * a single error entry instead.
 * </pre>
 *
 * Protobuf type {@code google.cloud.ml.v1beta1.PredictRequest}
 */
public  final class PredictRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.ml.v1beta1.PredictRequest)
    PredictRequestOrBuilder {
  // Use PredictRequest.newBuilder() to construct.
  private PredictRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PredictRequest() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PredictRequest(
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
            com.google.api.HttpBody.Builder subBuilder = null;
            if (httpBody_ != null) {
              subBuilder = httpBody_.toBuilder();
            }
            httpBody_ = input.readMessage(com.google.api.HttpBody.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(httpBody_);
              httpBody_ = subBuilder.buildPartial();
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
    return com.google.cloud.ml.api.v1beta1.PredictionServiceProto.internal_static_google_cloud_ml_v1beta1_PredictRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.ml.api.v1beta1.PredictionServiceProto.internal_static_google_cloud_ml_v1beta1_PredictRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.ml.api.v1beta1.PredictRequest.class, com.google.cloud.ml.api.v1beta1.PredictRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. The resource name of a model or a version.
   * Authorization: requires `Viewer` role on the parent project.
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
   * Required. The resource name of a model or a version.
   * Authorization: requires `Viewer` role on the parent project.
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

  public static final int HTTP_BODY_FIELD_NUMBER = 2;
  private com.google.api.HttpBody httpBody_;
  /**
   * <pre>
   * Required. The prediction request body.
   * </pre>
   *
   * <code>.google.api.HttpBody http_body = 2;</code>
   */
  public boolean hasHttpBody() {
    return httpBody_ != null;
  }
  /**
   * <pre>
   * Required. The prediction request body.
   * </pre>
   *
   * <code>.google.api.HttpBody http_body = 2;</code>
   */
  public com.google.api.HttpBody getHttpBody() {
    return httpBody_ == null ? com.google.api.HttpBody.getDefaultInstance() : httpBody_;
  }
  /**
   * <pre>
   * Required. The prediction request body.
   * </pre>
   *
   * <code>.google.api.HttpBody http_body = 2;</code>
   */
  public com.google.api.HttpBodyOrBuilder getHttpBodyOrBuilder() {
    return getHttpBody();
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
    if (httpBody_ != null) {
      output.writeMessage(2, getHttpBody());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (httpBody_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHttpBody());
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
    if (!(obj instanceof com.google.cloud.ml.api.v1beta1.PredictRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.ml.api.v1beta1.PredictRequest other = (com.google.cloud.ml.api.v1beta1.PredictRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (hasHttpBody() == other.hasHttpBody());
    if (hasHttpBody()) {
      result = result && getHttpBody()
          .equals(other.getHttpBody());
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
    if (hasHttpBody()) {
      hash = (37 * hash) + HTTP_BODY_FIELD_NUMBER;
      hash = (53 * hash) + getHttpBody().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.ml.api.v1beta1.PredictRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.ml.api.v1beta1.PredictRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.ml.api.v1beta1.PredictRequest prototype) {
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
   * Request for predictions to be issued against a trained model.
   * The body of the request is a single JSON object with a single top-level
   * field:
   * &lt;dl&gt;
   *   &lt;dt&gt;instances&lt;/dt&gt;
   *   &lt;dd&gt;A JSON array containing values representing the instances to use for
   *       prediction.&lt;/dd&gt;
   * &lt;/dl&gt;
   * The structure of each element of the instances list is determined by your
   * model's input definition. Instances can include named inputs or can contain
   * only unlabeled values.
   * Not all data includes named inputs. Some instances will be simple
   * JSON values (boolean, number, or string). However, instances are often lists
   * of simple values, or complex nested lists. Here are some examples of request
   * bodies:
   * CSV data with each row encoded as a string value:
   * &lt;pre&gt;
   * {"instances": ["1.0,true,&#92;&#92;"x&#92;&#92;"", "-2.0,false,&#92;&#92;"y&#92;&#92;""]}
   * &lt;/pre&gt;
   * Plain text:
   * &lt;pre&gt;
   * {"instances": ["the quick brown fox", "la bruja le dio"]}
   * &lt;/pre&gt;
   * Sentences encoded as lists of words (vectors of strings):
   * &lt;pre&gt;
   * {
   *   "instances": [
   *     ["the","quick","brown"],
   *     ["la","bruja","le"],
   *     ...
   *   ]
   * }
   * &lt;/pre&gt;
   * Floating point scalar values:
   * &lt;pre&gt;
   * {"instances": [0.0, 1.1, 2.2]}
   * &lt;/pre&gt;
   * Vectors of integers:
   * &lt;pre&gt;
   * {
   *   "instances": [
   *     [0, 1, 2],
   *     [3, 4, 5],
   *     ...
   *   ]
   * }
   * &lt;/pre&gt;
   * Tensors (in this case, two-dimensional tensors):
   * &lt;pre&gt;
   * {
   *   "instances": [
   *     [
   *       [0, 1, 2],
   *       [3, 4, 5]
   *     ],
   *     ...
   *   ]
   * }
   * &lt;/pre&gt;
   * Images can be represented different ways. In this encoding scheme the first
   * two dimensions represent the rows and columns of the image, and the third
   * contains lists (vectors) of the R, G, and B values for each pixel.
   * &lt;pre&gt;
   * {
   *   "instances": [
   *     [
   *       [
   *         [138, 30, 66],
   *         [130, 20, 56],
   *         ...
   *       ],
   *       [
   *         [126, 38, 61],
   *         [122, 24, 57],
   *         ...
   *       ],
   *       ...
   *     ],
   *     ...
   *   ]
   * }
   * &lt;/pre&gt;
   * JSON strings must be encoded as UTF-8. To send binary data, you must
   * base64-encode the data and mark it as binary. To mark a JSON string
   * as binary, replace it with a JSON object with a single attribute named `b64`:
   * &lt;pre&gt;{"b64": "..."} &lt;/pre&gt;
   * For example:
   * Two Serialized tf.Examples (fake data, for illustrative purposes only):
   * &lt;pre&gt;
   * {"instances": [{"b64": "X5ad6u"}, {"b64": "IA9j4nx"}]}
   * &lt;/pre&gt;
   * Two JPEG image byte strings (fake data, for illustrative purposes only):
   * &lt;pre&gt;
   * {"instances": [{"b64": "ASa8asdf"}, {"b64": "JLK7ljk3"}]}
   * &lt;/pre&gt;
   * If your data includes named references, format each instance as a JSON object
   * with the named references as the keys:
   * JSON input data to be preprocessed:
   * &lt;pre&gt;
   * {
   *   "instances": [
   *     {
   *       "a": 1.0,
   *       "b": true,
   *       "c": "x"
   *     },
   *     {
   *       "a": -2.0,
   *       "b": false,
   *       "c": "y"
   *     }
   *   ]
   * }
   * &lt;/pre&gt;
   * Some models have an underlying TensorFlow graph that accepts multiple input
   * tensors. In this case, you should use the names of JSON name/value pairs to
   * identify the input tensors, as shown in the following exmaples:
   * For a graph with input tensor aliases "tag" (string) and "image"
   * (base64-encoded string):
   * &lt;pre&gt;
   * {
   *   "instances": [
   *     {
   *       "tag": "beach",
   *       "image": {"b64": "ASa8asdf"}
   *     },
   *     {
   *       "tag": "car",
   *       "image": {"b64": "JLK7ljk3"}
   *     }
   *   ]
   * }
   * &lt;/pre&gt;
   * For a graph with input tensor aliases "tag" (string) and "image"
   * (3-dimensional array of 8-bit ints):
   * &lt;pre&gt;
   * {
   *   "instances": [
   *     {
   *       "tag": "beach",
   *       "image": [
   *         [
   *           [138, 30, 66],
   *           [130, 20, 56],
   *           ...
   *         ],
   *         [
   *           [126, 38, 61],
   *           [122, 24, 57],
   *           ...
   *         ],
   *         ...
   *       ]
   *     },
   *     {
   *       "tag": "car",
   *       "image": [
   *         [
   *           [255, 0, 102],
   *           [255, 0, 97],
   *           ...
   *         ],
   *         [
   *           [254, 1, 101],
   *           [254, 2, 93],
   *           ...
   *         ],
   *         ...
   *       ]
   *     },
   *     ...
   *   ]
   * }
   * &lt;/pre&gt;
   * If the call is successful, the response body will contain one prediction
   * entry per instance in the request body. If prediction fails for any
   * instance, the response body will contain no predictions and will contian
   * a single error entry instead.
   * </pre>
   *
   * Protobuf type {@code google.cloud.ml.v1beta1.PredictRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.ml.v1beta1.PredictRequest)
      com.google.cloud.ml.api.v1beta1.PredictRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.ml.api.v1beta1.PredictionServiceProto.internal_static_google_cloud_ml_v1beta1_PredictRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.ml.api.v1beta1.PredictionServiceProto.internal_static_google_cloud_ml_v1beta1_PredictRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.ml.api.v1beta1.PredictRequest.class, com.google.cloud.ml.api.v1beta1.PredictRequest.Builder.class);
    }

    // Construct using com.google.cloud.ml.api.v1beta1.PredictRequest.newBuilder()
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

      if (httpBodyBuilder_ == null) {
        httpBody_ = null;
      } else {
        httpBody_ = null;
        httpBodyBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.ml.api.v1beta1.PredictionServiceProto.internal_static_google_cloud_ml_v1beta1_PredictRequest_descriptor;
    }

    public com.google.cloud.ml.api.v1beta1.PredictRequest getDefaultInstanceForType() {
      return com.google.cloud.ml.api.v1beta1.PredictRequest.getDefaultInstance();
    }

    public com.google.cloud.ml.api.v1beta1.PredictRequest build() {
      com.google.cloud.ml.api.v1beta1.PredictRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.ml.api.v1beta1.PredictRequest buildPartial() {
      com.google.cloud.ml.api.v1beta1.PredictRequest result = new com.google.cloud.ml.api.v1beta1.PredictRequest(this);
      result.name_ = name_;
      if (httpBodyBuilder_ == null) {
        result.httpBody_ = httpBody_;
      } else {
        result.httpBody_ = httpBodyBuilder_.build();
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
      if (other instanceof com.google.cloud.ml.api.v1beta1.PredictRequest) {
        return mergeFrom((com.google.cloud.ml.api.v1beta1.PredictRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.ml.api.v1beta1.PredictRequest other) {
      if (other == com.google.cloud.ml.api.v1beta1.PredictRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasHttpBody()) {
        mergeHttpBody(other.getHttpBody());
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
      com.google.cloud.ml.api.v1beta1.PredictRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.ml.api.v1beta1.PredictRequest) e.getUnfinishedMessage();
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
     * Required. The resource name of a model or a version.
     * Authorization: requires `Viewer` role on the parent project.
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
     * Required. The resource name of a model or a version.
     * Authorization: requires `Viewer` role on the parent project.
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
     * Required. The resource name of a model or a version.
     * Authorization: requires `Viewer` role on the parent project.
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
     * Required. The resource name of a model or a version.
     * Authorization: requires `Viewer` role on the parent project.
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
     * Required. The resource name of a model or a version.
     * Authorization: requires `Viewer` role on the parent project.
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

    private com.google.api.HttpBody httpBody_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.api.HttpBody, com.google.api.HttpBody.Builder, com.google.api.HttpBodyOrBuilder> httpBodyBuilder_;
    /**
     * <pre>
     * Required. The prediction request body.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     */
    public boolean hasHttpBody() {
      return httpBodyBuilder_ != null || httpBody_ != null;
    }
    /**
     * <pre>
     * Required. The prediction request body.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     */
    public com.google.api.HttpBody getHttpBody() {
      if (httpBodyBuilder_ == null) {
        return httpBody_ == null ? com.google.api.HttpBody.getDefaultInstance() : httpBody_;
      } else {
        return httpBodyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The prediction request body.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     */
    public Builder setHttpBody(com.google.api.HttpBody value) {
      if (httpBodyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        httpBody_ = value;
        onChanged();
      } else {
        httpBodyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The prediction request body.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     */
    public Builder setHttpBody(
        com.google.api.HttpBody.Builder builderForValue) {
      if (httpBodyBuilder_ == null) {
        httpBody_ = builderForValue.build();
        onChanged();
      } else {
        httpBodyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The prediction request body.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     */
    public Builder mergeHttpBody(com.google.api.HttpBody value) {
      if (httpBodyBuilder_ == null) {
        if (httpBody_ != null) {
          httpBody_ =
            com.google.api.HttpBody.newBuilder(httpBody_).mergeFrom(value).buildPartial();
        } else {
          httpBody_ = value;
        }
        onChanged();
      } else {
        httpBodyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The prediction request body.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     */
    public Builder clearHttpBody() {
      if (httpBodyBuilder_ == null) {
        httpBody_ = null;
        onChanged();
      } else {
        httpBody_ = null;
        httpBodyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The prediction request body.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     */
    public com.google.api.HttpBody.Builder getHttpBodyBuilder() {
      
      onChanged();
      return getHttpBodyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The prediction request body.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     */
    public com.google.api.HttpBodyOrBuilder getHttpBodyOrBuilder() {
      if (httpBodyBuilder_ != null) {
        return httpBodyBuilder_.getMessageOrBuilder();
      } else {
        return httpBody_ == null ?
            com.google.api.HttpBody.getDefaultInstance() : httpBody_;
      }
    }
    /**
     * <pre>
     * Required. The prediction request body.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.api.HttpBody, com.google.api.HttpBody.Builder, com.google.api.HttpBodyOrBuilder> 
        getHttpBodyFieldBuilder() {
      if (httpBodyBuilder_ == null) {
        httpBodyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.HttpBody, com.google.api.HttpBody.Builder, com.google.api.HttpBodyOrBuilder>(
                getHttpBody(),
                getParentForChildren(),
                isClean());
        httpBody_ = null;
      }
      return httpBodyBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.ml.v1beta1.PredictRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.ml.v1beta1.PredictRequest)
  private static final com.google.cloud.ml.api.v1beta1.PredictRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.ml.api.v1beta1.PredictRequest();
  }

  public static com.google.cloud.ml.api.v1beta1.PredictRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PredictRequest>
      PARSER = new com.google.protobuf.AbstractParser<PredictRequest>() {
    public PredictRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PredictRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PredictRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PredictRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.ml.api.v1beta1.PredictRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

