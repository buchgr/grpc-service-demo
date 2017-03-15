// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/annotations.proto

package com.google.genomics.v1;

public interface BatchCreateAnnotationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.BatchCreateAnnotationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resulting per-annotation entries, ordered consistently with the
   * original request.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.BatchCreateAnnotationsResponse.Entry entries = 1;</code>
   */
  java.util.List<com.google.genomics.v1.BatchCreateAnnotationsResponse.Entry> 
      getEntriesList();
  /**
   * <pre>
   * The resulting per-annotation entries, ordered consistently with the
   * original request.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.BatchCreateAnnotationsResponse.Entry entries = 1;</code>
   */
  com.google.genomics.v1.BatchCreateAnnotationsResponse.Entry getEntries(int index);
  /**
   * <pre>
   * The resulting per-annotation entries, ordered consistently with the
   * original request.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.BatchCreateAnnotationsResponse.Entry entries = 1;</code>
   */
  int getEntriesCount();
  /**
   * <pre>
   * The resulting per-annotation entries, ordered consistently with the
   * original request.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.BatchCreateAnnotationsResponse.Entry entries = 1;</code>
   */
  java.util.List<? extends com.google.genomics.v1.BatchCreateAnnotationsResponse.EntryOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <pre>
   * The resulting per-annotation entries, ordered consistently with the
   * original request.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.BatchCreateAnnotationsResponse.Entry entries = 1;</code>
   */
  com.google.genomics.v1.BatchCreateAnnotationsResponse.EntryOrBuilder getEntriesOrBuilder(
      int index);
}
