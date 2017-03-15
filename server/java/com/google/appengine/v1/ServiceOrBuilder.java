// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/service.proto

package com.google.appengine.v1;

public interface ServiceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.Service)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Full path to the Service resource in the API.
   * Example: `apps/myapp/services/default`.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Full path to the Service resource in the API.
   * Example: `apps/myapp/services/default`.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Relative name of the service within the application.
   * Example: `default`.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * Relative name of the service within the application.
   * Example: `default`.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Mapping that defines fractional HTTP traffic diversion to
   * different versions within the service.
   * </pre>
   *
   * <code>.google.appengine.v1.TrafficSplit split = 3;</code>
   */
  boolean hasSplit();
  /**
   * <pre>
   * Mapping that defines fractional HTTP traffic diversion to
   * different versions within the service.
   * </pre>
   *
   * <code>.google.appengine.v1.TrafficSplit split = 3;</code>
   */
  com.google.appengine.v1.TrafficSplit getSplit();
  /**
   * <pre>
   * Mapping that defines fractional HTTP traffic diversion to
   * different versions within the service.
   * </pre>
   *
   * <code>.google.appengine.v1.TrafficSplit split = 3;</code>
   */
  com.google.appengine.v1.TrafficSplitOrBuilder getSplitOrBuilder();
}
