// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1beta2/pubsub.proto

package com.google.pubsub.v1beta2;

public interface PullRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1beta2.PullRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The subscription from which messages should be pulled.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   */
  java.lang.String getSubscription();
  /**
   * <pre>
   * The subscription from which messages should be pulled.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   */
  com.google.protobuf.ByteString
      getSubscriptionBytes();

  /**
   * <pre>
   * If this is specified as true the system will respond immediately even if
   * it is not able to return a message in the Pull response. Otherwise the
   * system is allowed to wait until at least one message is available rather
   * than returning no messages. The client may cancel the request if it does
   * not wish to wait any longer for the response.
   * </pre>
   *
   * <code>bool return_immediately = 2;</code>
   */
  boolean getReturnImmediately();

  /**
   * <pre>
   * The maximum number of messages returned for this request. The Pub/Sub
   * system may return fewer than the number specified.
   * </pre>
   *
   * <code>int32 max_messages = 3;</code>
   */
  int getMaxMessages();
}
