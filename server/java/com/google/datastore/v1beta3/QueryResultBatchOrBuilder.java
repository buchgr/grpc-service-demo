// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1beta3/query.proto

package com.google.datastore.v1beta3;

public interface QueryResultBatchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1beta3.QueryResultBatch)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The number of results skipped, typically because of an offset.
   * </pre>
   *
   * <code>int32 skipped_results = 6;</code>
   */
  int getSkippedResults();

  /**
   * <pre>
   * A cursor that points to the position after the last skipped result.
   * Will be set when `skipped_results` != 0.
   * </pre>
   *
   * <code>bytes skipped_cursor = 3;</code>
   */
  com.google.protobuf.ByteString getSkippedCursor();

  /**
   * <pre>
   * The result type for every entity in `entity_results`.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.EntityResult.ResultType entity_result_type = 1;</code>
   */
  int getEntityResultTypeValue();
  /**
   * <pre>
   * The result type for every entity in `entity_results`.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.EntityResult.ResultType entity_result_type = 1;</code>
   */
  com.google.datastore.v1beta3.EntityResult.ResultType getEntityResultType();

  /**
   * <pre>
   * The results for this batch.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.EntityResult entity_results = 2;</code>
   */
  java.util.List<com.google.datastore.v1beta3.EntityResult> 
      getEntityResultsList();
  /**
   * <pre>
   * The results for this batch.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.EntityResult entity_results = 2;</code>
   */
  com.google.datastore.v1beta3.EntityResult getEntityResults(int index);
  /**
   * <pre>
   * The results for this batch.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.EntityResult entity_results = 2;</code>
   */
  int getEntityResultsCount();
  /**
   * <pre>
   * The results for this batch.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.EntityResult entity_results = 2;</code>
   */
  java.util.List<? extends com.google.datastore.v1beta3.EntityResultOrBuilder> 
      getEntityResultsOrBuilderList();
  /**
   * <pre>
   * The results for this batch.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.EntityResult entity_results = 2;</code>
   */
  com.google.datastore.v1beta3.EntityResultOrBuilder getEntityResultsOrBuilder(
      int index);

  /**
   * <pre>
   * A cursor that points to the position after the last result in the batch.
   * </pre>
   *
   * <code>bytes end_cursor = 4;</code>
   */
  com.google.protobuf.ByteString getEndCursor();

  /**
   * <pre>
   * The state of the query after the current batch.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.QueryResultBatch.MoreResultsType more_results = 5;</code>
   */
  int getMoreResultsValue();
  /**
   * <pre>
   * The state of the query after the current batch.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.QueryResultBatch.MoreResultsType more_results = 5;</code>
   */
  com.google.datastore.v1beta3.QueryResultBatch.MoreResultsType getMoreResults();

  /**
   * <pre>
   * The version number of the snapshot this batch was returned from.
   * This applies to the range of results from the query's `start_cursor` (or
   * the beginning of the query if no cursor was given) to this batch's
   * `end_cursor` (not the query's `end_cursor`).
   * In a single transaction, subsequent query result batches for the same query
   * can have a greater snapshot version number. Each batch's snapshot version
   * is valid for all preceding batches.
   * The value will be zero for eventually consistent queries.
   * </pre>
   *
   * <code>int64 snapshot_version = 7;</code>
   */
  long getSnapshotVersion();
}
