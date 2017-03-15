// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/ml/v1beta1/job_service.proto

package com.google.cloud.ml.api.v1beta1;

public interface CancelJobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.ml.v1beta1.CancelJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the job to cancel.
   * Authorization: requires `Editor` role on the parent project.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the job to cancel.
   * Authorization: requires `Editor` role on the parent project.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
