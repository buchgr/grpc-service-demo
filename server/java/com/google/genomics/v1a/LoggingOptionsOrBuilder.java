// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1alpha2/pipelines.proto

package com.google.genomics.v1a;

public interface LoggingOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1alpha2.LoggingOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The location in Google Cloud Storage to which the pipeline logs
   * will be copied. Can be specified as a fully qualified directory
   * path, in which case logs will be output with a unique identifier
   * as the filename in that directory, or as a fully specified path,
   * which must end in `.log`, in which case that path will be
   * used, and the user must ensure that logs are not
   * overwritten. Stdout and stderr logs from the run are also
   * generated and output as `-stdout.log` and `-stderr.log`.
   * </pre>
   *
   * <code>string gcs_path = 1;</code>
   */
  java.lang.String getGcsPath();
  /**
   * <pre>
   * The location in Google Cloud Storage to which the pipeline logs
   * will be copied. Can be specified as a fully qualified directory
   * path, in which case logs will be output with a unique identifier
   * as the filename in that directory, or as a fully specified path,
   * which must end in `.log`, in which case that path will be
   * used, and the user must ensure that logs are not
   * overwritten. Stdout and stderr logs from the run are also
   * generated and output as `-stdout.log` and `-stderr.log`.
   * </pre>
   *
   * <code>string gcs_path = 1;</code>
   */
  com.google.protobuf.ByteString
      getGcsPathBytes();
}
