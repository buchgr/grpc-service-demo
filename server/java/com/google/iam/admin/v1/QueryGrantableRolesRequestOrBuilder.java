// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

public interface QueryGrantableRolesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.QueryGrantableRolesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The full resource name to query from the list of grantable roles.
   * The name follows the Google Cloud Platform resource format.
   * For example, a Cloud Platform project with id `my-project` will be named
   * `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * </pre>
   *
   * <code>string full_resource_name = 1;</code>
   */
  java.lang.String getFullResourceName();
  /**
   * <pre>
   * Required. The full resource name to query from the list of grantable roles.
   * The name follows the Google Cloud Platform resource format.
   * For example, a Cloud Platform project with id `my-project` will be named
   * `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * </pre>
   *
   * <code>string full_resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getFullResourceNameBytes();
}
