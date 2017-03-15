// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

public interface StreamVariantsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.StreamVariantsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Google Cloud project ID which will be billed
   * for this access. The caller must have WRITE access to this project.
   * Required.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * The Google Cloud project ID which will be billed
   * for this access. The caller must have WRITE access to this project.
   * Required.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * The variant set ID from which to stream variants.
   * </pre>
   *
   * <code>string variant_set_id = 2;</code>
   */
  java.lang.String getVariantSetId();
  /**
   * <pre>
   * The variant set ID from which to stream variants.
   * </pre>
   *
   * <code>string variant_set_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getVariantSetIdBytes();

  /**
   * <pre>
   * Only return variant calls which belong to call sets with these IDs.
   * Leaving this blank returns all variant calls.
   * </pre>
   *
   * <code>repeated string call_set_ids = 3;</code>
   */
  java.util.List<java.lang.String>
      getCallSetIdsList();
  /**
   * <pre>
   * Only return variant calls which belong to call sets with these IDs.
   * Leaving this blank returns all variant calls.
   * </pre>
   *
   * <code>repeated string call_set_ids = 3;</code>
   */
  int getCallSetIdsCount();
  /**
   * <pre>
   * Only return variant calls which belong to call sets with these IDs.
   * Leaving this blank returns all variant calls.
   * </pre>
   *
   * <code>repeated string call_set_ids = 3;</code>
   */
  java.lang.String getCallSetIds(int index);
  /**
   * <pre>
   * Only return variant calls which belong to call sets with these IDs.
   * Leaving this blank returns all variant calls.
   * </pre>
   *
   * <code>repeated string call_set_ids = 3;</code>
   */
  com.google.protobuf.ByteString
      getCallSetIdsBytes(int index);

  /**
   * <pre>
   * Required. Only return variants in this reference sequence.
   * </pre>
   *
   * <code>string reference_name = 4;</code>
   */
  java.lang.String getReferenceName();
  /**
   * <pre>
   * Required. Only return variants in this reference sequence.
   * </pre>
   *
   * <code>string reference_name = 4;</code>
   */
  com.google.protobuf.ByteString
      getReferenceNameBytes();

  /**
   * <pre>
   * The beginning of the window (0-based, inclusive) for which
   * overlapping variants should be returned.
   * </pre>
   *
   * <code>int64 start = 5;</code>
   */
  long getStart();

  /**
   * <pre>
   * The end of the window (0-based, exclusive) for which overlapping
   * variants should be returned.
   * </pre>
   *
   * <code>int64 end = 6;</code>
   */
  long getEnd();
}
