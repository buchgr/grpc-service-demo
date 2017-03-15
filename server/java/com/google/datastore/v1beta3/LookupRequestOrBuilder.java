// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1beta3/datastore.proto

package com.google.datastore.v1beta3;

public interface LookupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1beta3.LookupRequest)
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
   * The options for this lookup request.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.ReadOptions read_options = 1;</code>
   */
  boolean hasReadOptions();
  /**
   * <pre>
   * The options for this lookup request.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.ReadOptions read_options = 1;</code>
   */
  com.google.datastore.v1beta3.ReadOptions getReadOptions();
  /**
   * <pre>
   * The options for this lookup request.
   * </pre>
   *
   * <code>.google.datastore.v1beta3.ReadOptions read_options = 1;</code>
   */
  com.google.datastore.v1beta3.ReadOptionsOrBuilder getReadOptionsOrBuilder();

  /**
   * <pre>
   * Keys of entities to look up.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.Key keys = 3;</code>
   */
  java.util.List<com.google.datastore.v1beta3.Key> 
      getKeysList();
  /**
   * <pre>
   * Keys of entities to look up.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.Key keys = 3;</code>
   */
  com.google.datastore.v1beta3.Key getKeys(int index);
  /**
   * <pre>
   * Keys of entities to look up.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.Key keys = 3;</code>
   */
  int getKeysCount();
  /**
   * <pre>
   * Keys of entities to look up.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.Key keys = 3;</code>
   */
  java.util.List<? extends com.google.datastore.v1beta3.KeyOrBuilder> 
      getKeysOrBuilderList();
  /**
   * <pre>
   * Keys of entities to look up.
   * </pre>
   *
   * <code>repeated .google.datastore.v1beta3.Key keys = 3;</code>
   */
  com.google.datastore.v1beta3.KeyOrBuilder getKeysOrBuilder(
      int index);
}
