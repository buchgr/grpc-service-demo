// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/group_service.proto

package com.google.monitoring.v3;

public interface CreateGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.CreateGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The project in which to create the group. The format is
   * `"projects/{project_id_or_number}"`.
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The project in which to create the group. The format is
   * `"projects/{project_id_or_number}"`.
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A group definition. It is an error to define the `name` field because
   * the system assigns the name.
   * </pre>
   *
   * <code>.google.monitoring.v3.Group group = 2;</code>
   */
  boolean hasGroup();
  /**
   * <pre>
   * A group definition. It is an error to define the `name` field because
   * the system assigns the name.
   * </pre>
   *
   * <code>.google.monitoring.v3.Group group = 2;</code>
   */
  com.google.monitoring.v3.Group getGroup();
  /**
   * <pre>
   * A group definition. It is an error to define the `name` field because
   * the system assigns the name.
   * </pre>
   *
   * <code>.google.monitoring.v3.Group group = 2;</code>
   */
  com.google.monitoring.v3.GroupOrBuilder getGroupOrBuilder();

  /**
   * <pre>
   * If true, validate this request but do not create the group.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   */
  boolean getValidateOnly();
}
