// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/appengine.proto

package com.google.appengine.v1;

public interface CreateVersionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.CreateVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the parent resource to create this version under. Example:
   * `apps/myapp/services/default`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Name of the parent resource to create this version under. Example:
   * `apps/myapp/services/default`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Application deployment configuration.
   * </pre>
   *
   * <code>.google.appengine.v1.Version version = 2;</code>
   */
  boolean hasVersion();
  /**
   * <pre>
   * Application deployment configuration.
   * </pre>
   *
   * <code>.google.appengine.v1.Version version = 2;</code>
   */
  com.google.appengine.v1.Version getVersion();
  /**
   * <pre>
   * Application deployment configuration.
   * </pre>
   *
   * <code>.google.appengine.v1.Version version = 2;</code>
   */
  com.google.appengine.v1.VersionOrBuilder getVersionOrBuilder();
}
