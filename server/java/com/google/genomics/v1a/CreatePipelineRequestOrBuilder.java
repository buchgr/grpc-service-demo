// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1alpha2/pipelines.proto

package com.google.genomics.v1a;

public interface CreatePipelineRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1alpha2.CreatePipelineRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The pipeline to create. Should not have `pipelineId` populated.
   * </pre>
   *
   * <code>.google.genomics.v1alpha2.Pipeline pipeline = 1;</code>
   */
  boolean hasPipeline();
  /**
   * <pre>
   * The pipeline to create. Should not have `pipelineId` populated.
   * </pre>
   *
   * <code>.google.genomics.v1alpha2.Pipeline pipeline = 1;</code>
   */
  com.google.genomics.v1a.Pipeline getPipeline();
  /**
   * <pre>
   * The pipeline to create. Should not have `pipelineId` populated.
   * </pre>
   *
   * <code>.google.genomics.v1alpha2.Pipeline pipeline = 1;</code>
   */
  com.google.genomics.v1a.PipelineOrBuilder getPipelineOrBuilder();
}
