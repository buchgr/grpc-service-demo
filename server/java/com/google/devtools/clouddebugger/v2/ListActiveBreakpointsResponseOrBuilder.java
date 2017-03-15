// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/controller.proto

package com.google.devtools.clouddebugger.v2;

public interface ListActiveBreakpointsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouddebugger.v2.ListActiveBreakpointsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of all active breakpoints.
   * The fields `id` and `location` are guaranteed to be set on each breakpoint.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Breakpoint breakpoints = 1;</code>
   */
  java.util.List<com.google.devtools.clouddebugger.v2.Breakpoint> 
      getBreakpointsList();
  /**
   * <pre>
   * List of all active breakpoints.
   * The fields `id` and `location` are guaranteed to be set on each breakpoint.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Breakpoint breakpoints = 1;</code>
   */
  com.google.devtools.clouddebugger.v2.Breakpoint getBreakpoints(int index);
  /**
   * <pre>
   * List of all active breakpoints.
   * The fields `id` and `location` are guaranteed to be set on each breakpoint.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Breakpoint breakpoints = 1;</code>
   */
  int getBreakpointsCount();
  /**
   * <pre>
   * List of all active breakpoints.
   * The fields `id` and `location` are guaranteed to be set on each breakpoint.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Breakpoint breakpoints = 1;</code>
   */
  java.util.List<? extends com.google.devtools.clouddebugger.v2.BreakpointOrBuilder> 
      getBreakpointsOrBuilderList();
  /**
   * <pre>
   * List of all active breakpoints.
   * The fields `id` and `location` are guaranteed to be set on each breakpoint.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Breakpoint breakpoints = 1;</code>
   */
  com.google.devtools.clouddebugger.v2.BreakpointOrBuilder getBreakpointsOrBuilder(
      int index);

  /**
   * <pre>
   * A wait token that can be used in the next method call to block until
   * the list of breakpoints changes.
   * </pre>
   *
   * <code>string next_wait_token = 2;</code>
   */
  java.lang.String getNextWaitToken();
  /**
   * <pre>
   * A wait token that can be used in the next method call to block until
   * the list of breakpoints changes.
   * </pre>
   *
   * <code>string next_wait_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextWaitTokenBytes();

  /**
   * <pre>
   * The `wait_expired` field is set to true by the server when the
   * request times out and the field `success_on_timeout` is set to true.
   * </pre>
   *
   * <code>bool wait_expired = 3;</code>
   */
  boolean getWaitExpired();
}
