package com.google.cloud.ml.api.v1beta1;

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
 * The Prediction API, which serves predictions for models managed by
 * ModelService.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/cloud/ml/v1beta1/prediction_service.proto")
public class OnlinePredictionServiceGrpc {

  private OnlinePredictionServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.ml.v1beta1.OnlinePredictionService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.ml.api.v1beta1.PredictRequest,
      com.google.api.HttpBody> METHOD_PREDICT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.ml.v1beta1.OnlinePredictionService", "Predict"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.PredictRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.api.HttpBody.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OnlinePredictionServiceStub newStub(io.grpc.Channel channel) {
    return new OnlinePredictionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OnlinePredictionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OnlinePredictionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static OnlinePredictionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OnlinePredictionServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The Prediction API, which serves predictions for models managed by
   * ModelService.
   * </pre>
   */
  public static abstract class OnlinePredictionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Performs prediction on the data in the request.
     * **** REMOVE FROM GENERATED DOCUMENTATION
     * </pre>
     */
    public void predict(com.google.cloud.ml.api.v1beta1.PredictRequest request,
        io.grpc.stub.StreamObserver<com.google.api.HttpBody> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PREDICT, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PREDICT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.ml.api.v1beta1.PredictRequest,
                com.google.api.HttpBody>(
                  this, METHODID_PREDICT)))
          .build();
    }
  }

  /**
   * <pre>
   * The Prediction API, which serves predictions for models managed by
   * ModelService.
   * </pre>
   */
  public static final class OnlinePredictionServiceStub extends io.grpc.stub.AbstractStub<OnlinePredictionServiceStub> {
    private OnlinePredictionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OnlinePredictionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OnlinePredictionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OnlinePredictionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Performs prediction on the data in the request.
     * **** REMOVE FROM GENERATED DOCUMENTATION
     * </pre>
     */
    public void predict(com.google.cloud.ml.api.v1beta1.PredictRequest request,
        io.grpc.stub.StreamObserver<com.google.api.HttpBody> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PREDICT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Prediction API, which serves predictions for models managed by
   * ModelService.
   * </pre>
   */
  public static final class OnlinePredictionServiceBlockingStub extends io.grpc.stub.AbstractStub<OnlinePredictionServiceBlockingStub> {
    private OnlinePredictionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OnlinePredictionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OnlinePredictionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OnlinePredictionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Performs prediction on the data in the request.
     * **** REMOVE FROM GENERATED DOCUMENTATION
     * </pre>
     */
    public com.google.api.HttpBody predict(com.google.cloud.ml.api.v1beta1.PredictRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PREDICT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Prediction API, which serves predictions for models managed by
   * ModelService.
   * </pre>
   */
  public static final class OnlinePredictionServiceFutureStub extends io.grpc.stub.AbstractStub<OnlinePredictionServiceFutureStub> {
    private OnlinePredictionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OnlinePredictionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OnlinePredictionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OnlinePredictionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Performs prediction on the data in the request.
     * **** REMOVE FROM GENERATED DOCUMENTATION
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.api.HttpBody> predict(
        com.google.cloud.ml.api.v1beta1.PredictRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PREDICT, getCallOptions()), request);
    }
  }

  private static final int METHODID_PREDICT = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OnlinePredictionServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(OnlinePredictionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PREDICT:
          serviceImpl.predict((com.google.cloud.ml.api.v1beta1.PredictRequest) request,
              (io.grpc.stub.StreamObserver<com.google.api.HttpBody>) responseObserver);
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
        METHOD_PREDICT);
  }

}
