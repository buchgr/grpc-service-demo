package com.google.pubsub.v1beta2;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The service that an application uses to manipulate subscriptions and to
 * consume messages from a subscription via the Pull method.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/pubsub/v1beta2/pubsub.proto")
public class SubscriberGrpc {

  private SubscriberGrpc() {}

  public static final String SERVICE_NAME = "google.pubsub.v1beta2.Subscriber";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1beta2.Subscription,
      com.google.pubsub.v1beta2.Subscription> METHOD_CREATE_SUBSCRIPTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1beta2.Subscriber", "CreateSubscription"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1beta2.Subscription.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1beta2.Subscription.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1beta2.GetSubscriptionRequest,
      com.google.pubsub.v1beta2.Subscription> METHOD_GET_SUBSCRIPTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1beta2.Subscriber", "GetSubscription"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1beta2.GetSubscriptionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1beta2.Subscription.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1beta2.ListSubscriptionsRequest,
      com.google.pubsub.v1beta2.ListSubscriptionsResponse> METHOD_LIST_SUBSCRIPTIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1beta2.Subscriber", "ListSubscriptions"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1beta2.ListSubscriptionsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1beta2.ListSubscriptionsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1beta2.DeleteSubscriptionRequest,
      com.google.protobuf.Empty> METHOD_DELETE_SUBSCRIPTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1beta2.Subscriber", "DeleteSubscription"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1beta2.DeleteSubscriptionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1beta2.ModifyAckDeadlineRequest,
      com.google.protobuf.Empty> METHOD_MODIFY_ACK_DEADLINE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1beta2.Subscriber", "ModifyAckDeadline"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1beta2.ModifyAckDeadlineRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1beta2.AcknowledgeRequest,
      com.google.protobuf.Empty> METHOD_ACKNOWLEDGE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1beta2.Subscriber", "Acknowledge"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1beta2.AcknowledgeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1beta2.PullRequest,
      com.google.pubsub.v1beta2.PullResponse> METHOD_PULL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1beta2.Subscriber", "Pull"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1beta2.PullRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1beta2.PullResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.pubsub.v1beta2.ModifyPushConfigRequest,
      com.google.protobuf.Empty> METHOD_MODIFY_PUSH_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.pubsub.v1beta2.Subscriber", "ModifyPushConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.pubsub.v1beta2.ModifyPushConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubscriberStub newStub(io.grpc.Channel channel) {
    return new SubscriberStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubscriberBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SubscriberBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static SubscriberFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SubscriberFutureStub(channel);
  }

  /**
   * <pre>
   * The service that an application uses to manipulate subscriptions and to
   * consume messages from a subscription via the Pull method.
   * </pre>
   */
  public static abstract class SubscriberImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a subscription to a given topic for a given subscriber.
     * If the subscription already exists, returns ALREADY_EXISTS.
     * If the corresponding topic doesn't exist, returns NOT_FOUND.
     * If the name is not provided in the request, the server will assign a random
     * name for this subscription on the same project as the topic.
     * </pre>
     */
    public void createSubscription(com.google.pubsub.v1beta2.Subscription request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1beta2.Subscription> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_SUBSCRIPTION, responseObserver);
    }

    /**
     * <pre>
     * Gets the configuration details of a subscription.
     * </pre>
     */
    public void getSubscription(com.google.pubsub.v1beta2.GetSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1beta2.Subscription> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SUBSCRIPTION, responseObserver);
    }

    /**
     * <pre>
     * Lists matching subscriptions.
     * </pre>
     */
    public void listSubscriptions(com.google.pubsub.v1beta2.ListSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1beta2.ListSubscriptionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_SUBSCRIPTIONS, responseObserver);
    }

    /**
     * <pre>
     * Deletes an existing subscription. All pending messages in the subscription
     * are immediately dropped. Calls to Pull after deletion will return
     * NOT_FOUND. After a subscription is deleted, a new one may be created with
     * the same name, but the new one has no association with the old
     * subscription, or its topic unless the same topic is specified.
     * </pre>
     */
    public void deleteSubscription(com.google.pubsub.v1beta2.DeleteSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_SUBSCRIPTION, responseObserver);
    }

    /**
     * <pre>
     * Modifies the ack deadline for a specific message. This method is useful to
     * indicate that more time is needed to process a message by the subscriber,
     * or to make the message available for redelivery if the processing was
     * interrupted.
     * </pre>
     */
    public void modifyAckDeadline(com.google.pubsub.v1beta2.ModifyAckDeadlineRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MODIFY_ACK_DEADLINE, responseObserver);
    }

    /**
     * <pre>
     * Acknowledges the messages associated with the ack tokens in the
     * AcknowledgeRequest. The Pub/Sub system can remove the relevant messages
     * from the subscription.
     * Acknowledging a message whose ack deadline has expired may succeed,
     * but such a message may be redelivered later. Acknowledging a message more
     * than once will not result in an error.
     * </pre>
     */
    public void acknowledge(com.google.pubsub.v1beta2.AcknowledgeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ACKNOWLEDGE, responseObserver);
    }

    /**
     * <pre>
     * Pulls messages from the server. Returns an empty list if there are no
     * messages available in the backlog. The server may return UNAVAILABLE if
     * there are too many concurrent pull requests pending for the given
     * subscription.
     * </pre>
     */
    public void pull(com.google.pubsub.v1beta2.PullRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1beta2.PullResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PULL, responseObserver);
    }

    /**
     * <pre>
     * Modifies the PushConfig for a specified subscription.
     * This may be used to change a push subscription to a pull one (signified
     * by an empty PushConfig) or vice versa, or change the endpoint URL and other
     * attributes of a push subscription. Messages will accumulate for
     * delivery continuously through the call regardless of changes to the
     * PushConfig.
     * </pre>
     */
    public void modifyPushConfig(com.google.pubsub.v1beta2.ModifyPushConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MODIFY_PUSH_CONFIG, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_SUBSCRIPTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1beta2.Subscription,
                com.google.pubsub.v1beta2.Subscription>(
                  this, METHODID_CREATE_SUBSCRIPTION)))
          .addMethod(
            METHOD_GET_SUBSCRIPTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1beta2.GetSubscriptionRequest,
                com.google.pubsub.v1beta2.Subscription>(
                  this, METHODID_GET_SUBSCRIPTION)))
          .addMethod(
            METHOD_LIST_SUBSCRIPTIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1beta2.ListSubscriptionsRequest,
                com.google.pubsub.v1beta2.ListSubscriptionsResponse>(
                  this, METHODID_LIST_SUBSCRIPTIONS)))
          .addMethod(
            METHOD_DELETE_SUBSCRIPTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1beta2.DeleteSubscriptionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SUBSCRIPTION)))
          .addMethod(
            METHOD_MODIFY_ACK_DEADLINE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1beta2.ModifyAckDeadlineRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_MODIFY_ACK_DEADLINE)))
          .addMethod(
            METHOD_ACKNOWLEDGE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1beta2.AcknowledgeRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ACKNOWLEDGE)))
          .addMethod(
            METHOD_PULL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1beta2.PullRequest,
                com.google.pubsub.v1beta2.PullResponse>(
                  this, METHODID_PULL)))
          .addMethod(
            METHOD_MODIFY_PUSH_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.pubsub.v1beta2.ModifyPushConfigRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_MODIFY_PUSH_CONFIG)))
          .build();
    }
  }

  /**
   * <pre>
   * The service that an application uses to manipulate subscriptions and to
   * consume messages from a subscription via the Pull method.
   * </pre>
   */
  public static final class SubscriberStub extends io.grpc.stub.AbstractStub<SubscriberStub> {
    private SubscriberStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubscriberStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscriberStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubscriberStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a subscription to a given topic for a given subscriber.
     * If the subscription already exists, returns ALREADY_EXISTS.
     * If the corresponding topic doesn't exist, returns NOT_FOUND.
     * If the name is not provided in the request, the server will assign a random
     * name for this subscription on the same project as the topic.
     * </pre>
     */
    public void createSubscription(com.google.pubsub.v1beta2.Subscription request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1beta2.Subscription> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_SUBSCRIPTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the configuration details of a subscription.
     * </pre>
     */
    public void getSubscription(com.google.pubsub.v1beta2.GetSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1beta2.Subscription> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIPTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists matching subscriptions.
     * </pre>
     */
    public void listSubscriptions(com.google.pubsub.v1beta2.ListSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1beta2.ListSubscriptionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_SUBSCRIPTIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an existing subscription. All pending messages in the subscription
     * are immediately dropped. Calls to Pull after deletion will return
     * NOT_FOUND. After a subscription is deleted, a new one may be created with
     * the same name, but the new one has no association with the old
     * subscription, or its topic unless the same topic is specified.
     * </pre>
     */
    public void deleteSubscription(com.google.pubsub.v1beta2.DeleteSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_SUBSCRIPTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modifies the ack deadline for a specific message. This method is useful to
     * indicate that more time is needed to process a message by the subscriber,
     * or to make the message available for redelivery if the processing was
     * interrupted.
     * </pre>
     */
    public void modifyAckDeadline(com.google.pubsub.v1beta2.ModifyAckDeadlineRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MODIFY_ACK_DEADLINE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Acknowledges the messages associated with the ack tokens in the
     * AcknowledgeRequest. The Pub/Sub system can remove the relevant messages
     * from the subscription.
     * Acknowledging a message whose ack deadline has expired may succeed,
     * but such a message may be redelivered later. Acknowledging a message more
     * than once will not result in an error.
     * </pre>
     */
    public void acknowledge(com.google.pubsub.v1beta2.AcknowledgeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACKNOWLEDGE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pulls messages from the server. Returns an empty list if there are no
     * messages available in the backlog. The server may return UNAVAILABLE if
     * there are too many concurrent pull requests pending for the given
     * subscription.
     * </pre>
     */
    public void pull(com.google.pubsub.v1beta2.PullRequest request,
        io.grpc.stub.StreamObserver<com.google.pubsub.v1beta2.PullResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PULL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modifies the PushConfig for a specified subscription.
     * This may be used to change a push subscription to a pull one (signified
     * by an empty PushConfig) or vice versa, or change the endpoint URL and other
     * attributes of a push subscription. Messages will accumulate for
     * delivery continuously through the call regardless of changes to the
     * PushConfig.
     * </pre>
     */
    public void modifyPushConfig(com.google.pubsub.v1beta2.ModifyPushConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MODIFY_PUSH_CONFIG, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The service that an application uses to manipulate subscriptions and to
   * consume messages from a subscription via the Pull method.
   * </pre>
   */
  public static final class SubscriberBlockingStub extends io.grpc.stub.AbstractStub<SubscriberBlockingStub> {
    private SubscriberBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubscriberBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscriberBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubscriberBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a subscription to a given topic for a given subscriber.
     * If the subscription already exists, returns ALREADY_EXISTS.
     * If the corresponding topic doesn't exist, returns NOT_FOUND.
     * If the name is not provided in the request, the server will assign a random
     * name for this subscription on the same project as the topic.
     * </pre>
     */
    public com.google.pubsub.v1beta2.Subscription createSubscription(com.google.pubsub.v1beta2.Subscription request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_SUBSCRIPTION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the configuration details of a subscription.
     * </pre>
     */
    public com.google.pubsub.v1beta2.Subscription getSubscription(com.google.pubsub.v1beta2.GetSubscriptionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SUBSCRIPTION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists matching subscriptions.
     * </pre>
     */
    public com.google.pubsub.v1beta2.ListSubscriptionsResponse listSubscriptions(com.google.pubsub.v1beta2.ListSubscriptionsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_SUBSCRIPTIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an existing subscription. All pending messages in the subscription
     * are immediately dropped. Calls to Pull after deletion will return
     * NOT_FOUND. After a subscription is deleted, a new one may be created with
     * the same name, but the new one has no association with the old
     * subscription, or its topic unless the same topic is specified.
     * </pre>
     */
    public com.google.protobuf.Empty deleteSubscription(com.google.pubsub.v1beta2.DeleteSubscriptionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_SUBSCRIPTION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Modifies the ack deadline for a specific message. This method is useful to
     * indicate that more time is needed to process a message by the subscriber,
     * or to make the message available for redelivery if the processing was
     * interrupted.
     * </pre>
     */
    public com.google.protobuf.Empty modifyAckDeadline(com.google.pubsub.v1beta2.ModifyAckDeadlineRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MODIFY_ACK_DEADLINE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Acknowledges the messages associated with the ack tokens in the
     * AcknowledgeRequest. The Pub/Sub system can remove the relevant messages
     * from the subscription.
     * Acknowledging a message whose ack deadline has expired may succeed,
     * but such a message may be redelivered later. Acknowledging a message more
     * than once will not result in an error.
     * </pre>
     */
    public com.google.protobuf.Empty acknowledge(com.google.pubsub.v1beta2.AcknowledgeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACKNOWLEDGE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Pulls messages from the server. Returns an empty list if there are no
     * messages available in the backlog. The server may return UNAVAILABLE if
     * there are too many concurrent pull requests pending for the given
     * subscription.
     * </pre>
     */
    public com.google.pubsub.v1beta2.PullResponse pull(com.google.pubsub.v1beta2.PullRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PULL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Modifies the PushConfig for a specified subscription.
     * This may be used to change a push subscription to a pull one (signified
     * by an empty PushConfig) or vice versa, or change the endpoint URL and other
     * attributes of a push subscription. Messages will accumulate for
     * delivery continuously through the call regardless of changes to the
     * PushConfig.
     * </pre>
     */
    public com.google.protobuf.Empty modifyPushConfig(com.google.pubsub.v1beta2.ModifyPushConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MODIFY_PUSH_CONFIG, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The service that an application uses to manipulate subscriptions and to
   * consume messages from a subscription via the Pull method.
   * </pre>
   */
  public static final class SubscriberFutureStub extends io.grpc.stub.AbstractStub<SubscriberFutureStub> {
    private SubscriberFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubscriberFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscriberFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubscriberFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a subscription to a given topic for a given subscriber.
     * If the subscription already exists, returns ALREADY_EXISTS.
     * If the corresponding topic doesn't exist, returns NOT_FOUND.
     * If the name is not provided in the request, the server will assign a random
     * name for this subscription on the same project as the topic.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.pubsub.v1beta2.Subscription> createSubscription(
        com.google.pubsub.v1beta2.Subscription request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_SUBSCRIPTION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the configuration details of a subscription.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.pubsub.v1beta2.Subscription> getSubscription(
        com.google.pubsub.v1beta2.GetSubscriptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIPTION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists matching subscriptions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.pubsub.v1beta2.ListSubscriptionsResponse> listSubscriptions(
        com.google.pubsub.v1beta2.ListSubscriptionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_SUBSCRIPTIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an existing subscription. All pending messages in the subscription
     * are immediately dropped. Calls to Pull after deletion will return
     * NOT_FOUND. After a subscription is deleted, a new one may be created with
     * the same name, but the new one has no association with the old
     * subscription, or its topic unless the same topic is specified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSubscription(
        com.google.pubsub.v1beta2.DeleteSubscriptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_SUBSCRIPTION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Modifies the ack deadline for a specific message. This method is useful to
     * indicate that more time is needed to process a message by the subscriber,
     * or to make the message available for redelivery if the processing was
     * interrupted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> modifyAckDeadline(
        com.google.pubsub.v1beta2.ModifyAckDeadlineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MODIFY_ACK_DEADLINE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Acknowledges the messages associated with the ack tokens in the
     * AcknowledgeRequest. The Pub/Sub system can remove the relevant messages
     * from the subscription.
     * Acknowledging a message whose ack deadline has expired may succeed,
     * but such a message may be redelivered later. Acknowledging a message more
     * than once will not result in an error.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> acknowledge(
        com.google.pubsub.v1beta2.AcknowledgeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACKNOWLEDGE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Pulls messages from the server. Returns an empty list if there are no
     * messages available in the backlog. The server may return UNAVAILABLE if
     * there are too many concurrent pull requests pending for the given
     * subscription.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.pubsub.v1beta2.PullResponse> pull(
        com.google.pubsub.v1beta2.PullRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PULL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Modifies the PushConfig for a specified subscription.
     * This may be used to change a push subscription to a pull one (signified
     * by an empty PushConfig) or vice versa, or change the endpoint URL and other
     * attributes of a push subscription. Messages will accumulate for
     * delivery continuously through the call regardless of changes to the
     * PushConfig.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> modifyPushConfig(
        com.google.pubsub.v1beta2.ModifyPushConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MODIFY_PUSH_CONFIG, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SUBSCRIPTION = 0;
  private static final int METHODID_GET_SUBSCRIPTION = 1;
  private static final int METHODID_LIST_SUBSCRIPTIONS = 2;
  private static final int METHODID_DELETE_SUBSCRIPTION = 3;
  private static final int METHODID_MODIFY_ACK_DEADLINE = 4;
  private static final int METHODID_ACKNOWLEDGE = 5;
  private static final int METHODID_PULL = 6;
  private static final int METHODID_MODIFY_PUSH_CONFIG = 7;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SubscriberImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(SubscriberImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SUBSCRIPTION:
          serviceImpl.createSubscription((com.google.pubsub.v1beta2.Subscription) request,
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1beta2.Subscription>) responseObserver);
          break;
        case METHODID_GET_SUBSCRIPTION:
          serviceImpl.getSubscription((com.google.pubsub.v1beta2.GetSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1beta2.Subscription>) responseObserver);
          break;
        case METHODID_LIST_SUBSCRIPTIONS:
          serviceImpl.listSubscriptions((com.google.pubsub.v1beta2.ListSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1beta2.ListSubscriptionsResponse>) responseObserver);
          break;
        case METHODID_DELETE_SUBSCRIPTION:
          serviceImpl.deleteSubscription((com.google.pubsub.v1beta2.DeleteSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_MODIFY_ACK_DEADLINE:
          serviceImpl.modifyAckDeadline((com.google.pubsub.v1beta2.ModifyAckDeadlineRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ACKNOWLEDGE:
          serviceImpl.acknowledge((com.google.pubsub.v1beta2.AcknowledgeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PULL:
          serviceImpl.pull((com.google.pubsub.v1beta2.PullRequest) request,
              (io.grpc.stub.StreamObserver<com.google.pubsub.v1beta2.PullResponse>) responseObserver);
          break;
        case METHODID_MODIFY_PUSH_CONFIG:
          serviceImpl.modifyPushConfig((com.google.pubsub.v1beta2.ModifyPushConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_CREATE_SUBSCRIPTION,
        METHOD_GET_SUBSCRIPTION,
        METHOD_LIST_SUBSCRIPTIONS,
        METHOD_DELETE_SUBSCRIPTION,
        METHOD_MODIFY_ACK_DEADLINE,
        METHOD_ACKNOWLEDGE,
        METHOD_PULL,
        METHOD_MODIFY_PUSH_CONFIG);
  }

}
