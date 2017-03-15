// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/reads.proto

package com.google.genomics.v1;

public interface UpdateReadGroupSetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.UpdateReadGroupSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the read group set to be updated. The caller must have WRITE
   * permissions to the dataset associated with this read group set.
   * </pre>
   *
   * <code>string read_group_set_id = 1;</code>
   */
  java.lang.String getReadGroupSetId();
  /**
   * <pre>
   * The ID of the read group set to be updated. The caller must have WRITE
   * permissions to the dataset associated with this read group set.
   * </pre>
   *
   * <code>string read_group_set_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getReadGroupSetIdBytes();

  /**
   * <pre>
   * The new read group set data. See `updateMask` for details on mutability of
   * fields.
   * </pre>
   *
   * <code>.google.genomics.v1.ReadGroupSet read_group_set = 2;</code>
   */
  boolean hasReadGroupSet();
  /**
   * <pre>
   * The new read group set data. See `updateMask` for details on mutability of
   * fields.
   * </pre>
   *
   * <code>.google.genomics.v1.ReadGroupSet read_group_set = 2;</code>
   */
  com.google.genomics.v1.ReadGroupSet getReadGroupSet();
  /**
   * <pre>
   * The new read group set data. See `updateMask` for details on mutability of
   * fields.
   * </pre>
   *
   * <code>.google.genomics.v1.ReadGroupSet read_group_set = 2;</code>
   */
  com.google.genomics.v1.ReadGroupSetOrBuilder getReadGroupSetOrBuilder();

  /**
   * <pre>
   * An optional mask specifying which fields to update. Supported fields:
   * * [name][google.genomics.v1.ReadGroupSet.name].
   * * [referenceSetId][google.genomics.v1.ReadGroupSet.reference_set_id].
   * Leaving `updateMask` unset is equivalent to specifying all mutable
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * An optional mask specifying which fields to update. Supported fields:
   * * [name][google.genomics.v1.ReadGroupSet.name].
   * * [referenceSetId][google.genomics.v1.ReadGroupSet.reference_set_id].
   * Leaving `updateMask` unset is equivalent to specifying all mutable
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * An optional mask specifying which fields to update. Supported fields:
   * * [name][google.genomics.v1.ReadGroupSet.name].
   * * [referenceSetId][google.genomics.v1.ReadGroupSet.reference_set_id].
   * Leaving `updateMask` unset is equivalent to specifying all mutable
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
