// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface DiagnoseClusterResultsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.DiagnoseClusterResults)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output-only] The Google Cloud Storage URI of the diagnostic output.
   * The output report is a plain text file with a summary of collected
   * diagnostics.
   * </pre>
   *
   * <code>string output_uri = 1;</code>
   */
  java.lang.String getOutputUri();
  /**
   * <pre>
   * [Output-only] The Google Cloud Storage URI of the diagnostic output.
   * The output report is a plain text file with a summary of collected
   * diagnostics.
   * </pre>
   *
   * <code>string output_uri = 1;</code>
   */
  com.google.protobuf.ByteString
      getOutputUriBytes();
}
