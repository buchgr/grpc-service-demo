// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/ml/v1/job_service.proto

package com.google.cloud.ml.api.v1;

public interface ListJobsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.ml.v1.ListJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.ml.v1.Job jobs = 1;</code>
   */
  java.util.List<com.google.cloud.ml.api.v1.Job> 
      getJobsList();
  /**
   * <pre>
   * The list of jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.ml.v1.Job jobs = 1;</code>
   */
  com.google.cloud.ml.api.v1.Job getJobs(int index);
  /**
   * <pre>
   * The list of jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.ml.v1.Job jobs = 1;</code>
   */
  int getJobsCount();
  /**
   * <pre>
   * The list of jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.ml.v1.Job jobs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.ml.api.v1.JobOrBuilder> 
      getJobsOrBuilderList();
  /**
   * <pre>
   * The list of jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.ml.v1.Job jobs = 1;</code>
   */
  com.google.cloud.ml.api.v1.JobOrBuilder getJobsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. Pass this token as the `page_token` field of the request for a
   * subsequent call.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Optional. Pass this token as the `page_token` field of the request for a
   * subsequent call.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
