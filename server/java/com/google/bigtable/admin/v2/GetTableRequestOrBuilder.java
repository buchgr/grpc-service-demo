// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_table_admin.proto

package com.google.bigtable.admin.v2;

public interface GetTableRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.GetTableRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique name of the requested table.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The unique name of the requested table.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The view to be applied to the returned table's fields.
   * Defaults to `SCHEMA_ONLY` if unspecified.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table.View view = 2;</code>
   */
  int getViewValue();
  /**
   * <pre>
   * The view to be applied to the returned table's fields.
   * Defaults to `SCHEMA_ONLY` if unspecified.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table.View view = 2;</code>
   */
  com.google.bigtable.admin.v2.Table.View getView();
}
