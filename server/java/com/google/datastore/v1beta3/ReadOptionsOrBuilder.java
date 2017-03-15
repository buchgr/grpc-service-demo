// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1beta3/datastore.proto

package com.google.datastore.v1beta3;

public interface ReadOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1beta3.ReadOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The non-transactional read consistency to use.
   * Cannot be set to `STRONG` for global queries.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.ReadOptions.ReadConsistency read_consistency = 1;</code>
   */
  int getReadConsistencyValue();
  /**
   * <pre>
   * The non-transactional read consistency to use.
   * Cannot be set to `STRONG` for global queries.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.ReadOptions.ReadConsistency read_consistency = 1;</code>
   */
  com.google.datastore.v1beta3.ReadOptions.ReadConsistency getReadConsistency();

  /**
   * <pre>
   * The identifier of the transaction in which to read. A
   * transaction identifier is returned by a call to
   * [Datastore.BeginTransaction][google.datastore.v1beta3.Datastore.BeginTransaction].
   * </pre>
   *
   * <code>bytes transaction = 2;</code>
   */
  com.google.protobuf.ByteString getTransaction();

  public com.google.datastore.v1beta3.ReadOptions.ConsistencyTypeCase getConsistencyTypeCase();
}
