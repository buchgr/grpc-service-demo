// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/ml/v1beta1/model_service.proto

package com.google.cloud.ml.api.v1beta1;

public interface ListModelsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.ml.v1beta1.ListModelsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the project whose models are to be listed.
   * Authorization: requires `Viewer` role on the specified project.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The name of the project whose models are to be listed.
   * Authorization: requires `Viewer` role on the specified project.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. A page token to request the next page of results.
   * You get the token from the `next_page_token` field of the response from
   * the previous call.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. A page token to request the next page of results.
   * You get the token from the `next_page_token` field of the response from
   * the previous call.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Optional. The number of models to retrieve per "page" of results. If there
   * are more remaining results than this number, the response message will
   * contain a valid value in the `next_page_token` field.
   * The default value is 20, and the maximum page size is 100.
   * </pre>
   *
   * <code>int32 page_size = 5;</code>
   */
  int getPageSize();
}
