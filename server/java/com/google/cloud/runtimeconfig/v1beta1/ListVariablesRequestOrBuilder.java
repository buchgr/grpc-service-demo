// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/runtimeconfig/v1beta1/runtimeconfig.proto

package com.google.cloud.runtimeconfig.v1beta1;

public interface ListVariablesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.runtimeconfig.v1beta1.ListVariablesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The path to the RuntimeConfig resource for which you want to list variables.
   * The configuration must exist beforehand; the path must by in the format:
   * `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The path to the RuntimeConfig resource for which you want to list variables.
   * The configuration must exist beforehand; the path must by in the format:
   * `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Filters variables by matching the specified filter. For example:
   * `projects/example-project/config/[CONFIG_NAME]/variables/example-variable`.
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Filters variables by matching the specified filter. For example:
   * `projects/example-project/config/[CONFIG_NAME]/variables/example-variable`.
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Specifies the number of results to return per page. If there are fewer
   * elements than the specified number, returns all elements.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * Specifies a page token to use. Set `pageToken` to a `nextPageToken`
   * returned by a previous list request to get the next page of results.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Specifies a page token to use. Set `pageToken` to a `nextPageToken`
   * returned by a previous list request to get the next page of results.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * The flag indicates whether the user wants to return values of variables.
   * If true, then only those variables that user has IAM GetVariable permission
   * will be returned along with their values.
   * </pre>
   *
   * <code>bool return_values = 5;</code>
   */
  boolean getReturnValues();
}
