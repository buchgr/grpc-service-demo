// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface SeekRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.SeekRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The subscription to affect.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   */
  java.lang.String getSubscription();
  /**
   * <pre>
   * The subscription to affect.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   */
  com.google.protobuf.ByteString
      getSubscriptionBytes();

  /**
   * <pre>
   * The time to seek to.
   * Messages retained in the subscription that were published before this
   * time are marked as acknowledged, and messages retained in the
   * subscription that were published after this time are marked as
   * unacknowledged. Note that this operation affects only those messages
   * retained in the subscription (configured by the combination of
   * `message_retention_duration` and `retain_acked_messages`). For example,
   * if `time` corresponds to a point before the message retention
   * window (or to a point before the system's notion of the subscription
   * creation time), only retained messages will be marked as unacknowledged,
   * and already-expunged messages will not be restored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 2;</code>
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <pre>
   * The time to seek to.
   * Messages retained in the subscription that were published before this
   * time are marked as acknowledged, and messages retained in the
   * subscription that were published after this time are marked as
   * unacknowledged. Note that this operation affects only those messages
   * retained in the subscription (configured by the combination of
   * `message_retention_duration` and `retain_acked_messages`). For example,
   * if `time` corresponds to a point before the message retention
   * window (or to a point before the system's notion of the subscription
   * creation time), only retained messages will be marked as unacknowledged,
   * and already-expunged messages will not be restored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   * <pre>
   * The snapshot to seek to. The snapshot's topic must be the same as that of
   * the provided subscription.
   * Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>string snapshot = 3;</code>
   */
  java.lang.String getSnapshot();
  /**
   * <pre>
   * The snapshot to seek to. The snapshot's topic must be the same as that of
   * the provided subscription.
   * Format is `projects/{project}/snapshots/{snap}`.
   * </pre>
   *
   * <code>string snapshot = 3;</code>
   */
  com.google.protobuf.ByteString
      getSnapshotBytes();

  public com.google.pubsub.v1.SeekRequest.TargetCase getTargetCase();
}
