// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/ml/v1beta1/model_service.proto

package com.google.cloud.ml.api.v1beta1;

public interface DeleteVersionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.ml.v1beta1.DeleteVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the version. You can get the names of all the
   * versions of a model by calling
   * [projects.models.versions.list](/ml/reference/rest/v1beta1/projects.models.versions/list).
   * Authorization: requires `Editor` role on the parent project.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the version. You can get the names of all the
   * versions of a model by calling
   * [projects.models.versions.list](/ml/reference/rest/v1beta1/projects.models.versions/list).
   * Authorization: requires `Editor` role on the parent project.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
