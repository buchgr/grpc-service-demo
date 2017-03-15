// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/position.proto

package com.google.genomics.v1;

public interface PositionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.Position)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the reference in whatever reference set is being used.
   * </pre>
   *
   * <code>string reference_name = 1;</code>
   */
  java.lang.String getReferenceName();
  /**
   * <pre>
   * The name of the reference in whatever reference set is being used.
   * </pre>
   *
   * <code>string reference_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getReferenceNameBytes();

  /**
   * <pre>
   * The 0-based offset from the start of the forward strand for that reference.
   * </pre>
   *
   * <code>int64 position = 2;</code>
   */
  long getPosition();

  /**
   * <pre>
   * Whether this position is on the reverse strand, as opposed to the forward
   * strand.
   * </pre>
   *
   * <code>bool reverse_strand = 3;</code>
   */
  boolean getReverseStrand();
}
