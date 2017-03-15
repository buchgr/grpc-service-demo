// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1beta2/pubsub.proto

package com.google.pubsub.v1beta2;

public interface ListTopicSubscriptionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1beta2.ListTopicSubscriptionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the topic that subscriptions are attached to.
   * </pre>
   *
   * <code>string topic = 1;</code>
   */
  java.lang.String getTopic();
  /**
   * <pre>
   * The name of the topic that subscriptions are attached to.
   * </pre>
   *
   * <code>string topic = 1;</code>
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <pre>
   * Maximum number of subscription names to return.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * The value returned by the last ListTopicSubscriptionsResponse; indicates
   * that this is a continuation of a prior ListTopicSubscriptions call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The value returned by the last ListTopicSubscriptionsResponse; indicates
   * that this is a continuation of a prior ListTopicSubscriptions call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
