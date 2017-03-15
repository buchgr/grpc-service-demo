// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface SnapshotOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.Snapshot)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the snapshot.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the snapshot.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The name of the topic from which this snapshot is retaining messages.
   * </pre>
   *
   * <code>string topic = 2;</code>
   */
  java.lang.String getTopic();
  /**
   * <pre>
   * The name of the topic from which this snapshot is retaining messages.
   * </pre>
   *
   * <code>string topic = 2;</code>
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <pre>
   * The snapshot is guaranteed to exist up until this time.
   * A newly-created snapshot expires no later than 7 days from the time of its
   * creation. Its exact lifetime is determined at creation by the existing
   * backlog in the source subscription. Specifically, the lifetime of the
   * snapshot is `7 days - (age of oldest unacked message in the subscription)`.
   * For example, consider a subscription whose oldest unacked message is 3 days
   * old. If a snapshot is created from this subscription, the snapshot -- which
   * will always capture this 3-day-old backlog as long as the snapshot
   * exists -- will expire in 4 days.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 3;</code>
   */
  boolean hasExpirationTime();
  /**
   * <pre>
   * The snapshot is guaranteed to exist up until this time.
   * A newly-created snapshot expires no later than 7 days from the time of its
   * creation. Its exact lifetime is determined at creation by the existing
   * backlog in the source subscription. Specifically, the lifetime of the
   * snapshot is `7 days - (age of oldest unacked message in the subscription)`.
   * For example, consider a subscription whose oldest unacked message is 3 days
   * old. If a snapshot is created from this subscription, the snapshot -- which
   * will always capture this 3-day-old backlog as long as the snapshot
   * exists -- will expire in 4 days.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 3;</code>
   */
  com.google.protobuf.Timestamp getExpirationTime();
  /**
   * <pre>
   * The snapshot is guaranteed to exist up until this time.
   * A newly-created snapshot expires no later than 7 days from the time of its
   * creation. Its exact lifetime is determined at creation by the existing
   * backlog in the source subscription. Specifically, the lifetime of the
   * snapshot is `7 days - (age of oldest unacked message in the subscription)`.
   * For example, consider a subscription whose oldest unacked message is 3 days
   * old. If a snapshot is created from this subscription, the snapshot -- which
   * will always capture this 3-day-old backlog as long as the snapshot
   * exists -- will expire in 4 days.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpirationTimeOrBuilder();
}
