// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/data.proto

package com.google.devtools.clouddebugger.v2;

public interface StatusMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouddebugger.v2.StatusMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Distinguishes errors from informational messages.
   * </pre>
   *
   * <code>bool is_error = 1;</code>
   */
  boolean getIsError();

  /**
   * <pre>
   * Reference to which the message applies.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.StatusMessage.Reference refers_to = 2;</code>
   */
  int getRefersToValue();
  /**
   * <pre>
   * Reference to which the message applies.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.StatusMessage.Reference refers_to = 2;</code>
   */
  com.google.devtools.clouddebugger.v2.StatusMessage.Reference getRefersTo();

  /**
   * <pre>
   * Status message text.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.FormatMessage description = 3;</code>
   */
  boolean hasDescription();
  /**
   * <pre>
   * Status message text.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.FormatMessage description = 3;</code>
   */
  com.google.devtools.clouddebugger.v2.FormatMessage getDescription();
  /**
   * <pre>
   * Status message text.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.FormatMessage description = 3;</code>
   */
  com.google.devtools.clouddebugger.v2.FormatMessageOrBuilder getDescriptionOrBuilder();
}
