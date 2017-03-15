// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/runtimeconfig/v1beta1/runtimeconfig.proto

package com.google.cloud.runtimeconfig.v1beta1;

public interface CreateVariableRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.runtimeconfig.v1beta1.CreateVariableRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The path to the RutimeConfig resource that this variable should belong to.
   * The configuration must exist beforehand; the path must by in the format:
   * `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The path to the RutimeConfig resource that this variable should belong to.
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
   * The variable to create.
   * </pre>
   *
   * <code>.google.cloud.runtimeconfig.v1beta1.Variable variable = 2;</code>
   */
  boolean hasVariable();
  /**
   * <pre>
   * The variable to create.
   * </pre>
   *
   * <code>.google.cloud.runtimeconfig.v1beta1.Variable variable = 2;</code>
   */
  com.google.cloud.runtimeconfig.v1beta1.Variable getVariable();
  /**
   * <pre>
   * The variable to create.
   * </pre>
   *
   * <code>.google.cloud.runtimeconfig.v1beta1.Variable variable = 2;</code>
   */
  com.google.cloud.runtimeconfig.v1beta1.VariableOrBuilder getVariableOrBuilder();

  /**
   * <pre>
   * An optional but recommended unique `request_id`. If the server
   * receives two `create()` requests  with the same
   * `request_id`, then the second request will be ignored and the
   * first resource created and stored in the backend is returned.
   * Empty `request_id` fields are ignored.
   * It is responsibility of the client to ensure uniqueness of the
   * `request_id` strings.
   * `request_id` strings are limited to 64 characters.
   * </pre>
   *
   * <code>string request_id = 3;</code>
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * An optional but recommended unique `request_id`. If the server
   * receives two `create()` requests  with the same
   * `request_id`, then the second request will be ignored and the
   * first resource created and stored in the backend is returned.
   * Empty `request_id` fields are ignored.
   * It is responsibility of the client to ensure uniqueness of the
   * `request_id` strings.
   * `request_id` strings are limited to 64 characters.
   * </pre>
   *
   * <code>string request_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
