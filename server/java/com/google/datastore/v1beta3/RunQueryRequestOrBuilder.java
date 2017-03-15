// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1beta3/datastore.proto

package com.google.datastore.v1beta3;

public interface RunQueryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1beta3.RunQueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8;</code>
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8;</code>
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Entities are partitioned into subsets, identified by a partition ID.
   * Queries are scoped to a single partition.
   * This partition ID is normalized with the standard default context
   * partition ID.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.PartitionId partition_id = 2;</code>
   */
  boolean hasPartitionId();
  /**
   * <pre>
   * Entities are partitioned into subsets, identified by a partition ID.
   * Queries are scoped to a single partition.
   * This partition ID is normalized with the standard default context
   * partition ID.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.PartitionId partition_id = 2;</code>
   */
  com.google.datastore.v1beta3.PartitionId getPartitionId();
  /**
   * <pre>
   * Entities are partitioned into subsets, identified by a partition ID.
   * Queries are scoped to a single partition.
   * This partition ID is normalized with the standard default context
   * partition ID.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.PartitionId partition_id = 2;</code>
   */
  com.google.datastore.v1beta3.PartitionIdOrBuilder getPartitionIdOrBuilder();

  /**
   * <pre>
   * The options for this query.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.ReadOptions read_options = 1;</code>
   */
  boolean hasReadOptions();
  /**
   * <pre>
   * The options for this query.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.ReadOptions read_options = 1;</code>
   */
  com.google.datastore.v1beta3.ReadOptions getReadOptions();
  /**
   * <pre>
   * The options for this query.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.ReadOptions read_options = 1;</code>
   */
  com.google.datastore.v1beta3.ReadOptionsOrBuilder getReadOptionsOrBuilder();

  /**
   * <pre>
   * The query to run.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.Query query = 3;</code>
   */
  com.google.datastore.v1beta3.Query getQuery();
  /**
   * <pre>
   * The query to run.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.Query query = 3;</code>
   */
  com.google.datastore.v1beta3.QueryOrBuilder getQueryOrBuilder();

  /**
   * <pre>
   * The GQL query to run.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.GqlQuery gql_query = 7;</code>
   */
  com.google.datastore.v1beta3.GqlQuery getGqlQuery();
  /**
   * <pre>
   * The GQL query to run.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.GqlQuery gql_query = 7;</code>
   */
  com.google.datastore.v1beta3.GqlQueryOrBuilder getGqlQueryOrBuilder();

  public com.google.datastore.v1beta3.RunQueryRequest.QueryTypeCase getQueryTypeCase();
}
