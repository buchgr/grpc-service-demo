// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/controller.proto

package com.google.devtools.clouddebugger.v2;

public interface UpdateActiveBreakpointRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouddebugger.v2.UpdateActiveBreakpointRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Identifies the debuggee being debugged.
   * </pre>
   *
   * <code>string debuggee_id = 1;</code>
   */
  java.lang.String getDebuggeeId();
  /**
   * <pre>
   * Identifies the debuggee being debugged.
   * </pre>
   *
   * <code>string debuggee_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getDebuggeeIdBytes();

  /**
   * <pre>
   * Updated breakpoint information.
   * The field 'id' must be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2;</code>
   */
  boolean hasBreakpoint();
  /**
   * <pre>
   * Updated breakpoint information.
   * The field 'id' must be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2;</code>
   */
  com.google.devtools.clouddebugger.v2.Breakpoint getBreakpoint();
  /**
   * <pre>
   * Updated breakpoint information.
   * The field 'id' must be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 2;</code>
   */
  com.google.devtools.clouddebugger.v2.BreakpointOrBuilder getBreakpointOrBuilder();
}
