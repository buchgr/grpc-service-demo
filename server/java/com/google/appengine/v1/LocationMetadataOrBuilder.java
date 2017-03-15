// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/location.proto

package com.google.appengine.v1;

public interface LocationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.LocationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * App Engine Standard Environment is available in the given location.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>bool standard_environment_available = 2;</code>
   */
  boolean getStandardEnvironmentAvailable();

  /**
   * <pre>
   * App Engine Flexible Environment is available in the given location.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>bool flexible_environment_available = 4;</code>
   */
  boolean getFlexibleEnvironmentAvailable();
}
