// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/table/v1/bigtable_table_service_messages.proto

package com.google.bigtable.admin.table.v1;

public interface RenameTableRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.table.v1.RenameTableRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The current unique name of the table.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The current unique name of the table.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The new name by which the table should be referred to within its containing
   * cluster, e.g. "foobar" rather than "&lt;cluster_name&gt;/tables/foobar".
   * </pre>
   *
   * <code>string new_id = 2;</code>
   */
  java.lang.String getNewId();
  /**
   * <pre>
   * The new name by which the table should be referred to within its containing
   * cluster, e.g. "foobar" rather than "&lt;cluster_name&gt;/tables/foobar".
   * </pre>
   *
   * <code>string new_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getNewIdBytes();
}
