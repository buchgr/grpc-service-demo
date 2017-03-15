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
 * Allows retrieving project related information.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/cloud/ml/v1beta1/project_service.proto")
public class ProjectManagementServiceGrpc {

  private ProjectManagementServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.ml.v1beta1.ProjectManagementService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.ml.api.v1beta1.GetConfigRequest,
      com.google.cloud.ml.api.v1beta1.GetConfigResponse> METHOD_GET_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.ml.v1beta1.ProjectManagementService", "GetConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.GetConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.GetConfigResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectManagementServiceStub newStub(io.grpc.Channel channel) {
    return new ProjectManagementServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectManagementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProjectManagementServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectManagementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProjectManagementServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Allows retrieving project related information.
   * </pre>
   */
  public static abstract class ProjectManagementServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get the service account information associated with your project. You need
     * this information in order to grant the service account persmissions for
     * the Google Cloud Storage location where you put your model training code
     * for training the model with Google Cloud Machine Learning.
     * </pre>
     */
    public void getConfig(com.google.cloud.ml.api.v1beta1.GetConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.GetConfigResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CONFIG, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.ml.api.v1beta1.GetConfigRequest,
                com.google.cloud.ml.api.v1beta1.GetConfigResponse>(
                  this, METHODID_GET_CONFIG)))
          .build();
    }
  }

  /**
   * <pre>
   * Allows retrieving project related information.
   * </pre>
   */
  public static final class ProjectManagementServiceStub extends io.grpc.stub.AbstractStub<ProjectManagementServiceStub> {
    private ProjectManagementServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectManagementServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectManagementServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectManagementServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the service account information associated with your project. You need
     * this information in order to grant the service account persmissions for
     * the Google Cloud Storage location where you put your model training code
     * for training the model with Google Cloud Machine Learning.
     * </pre>
     */
    public void getConfig(com.google.cloud.ml.api.v1beta1.GetConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.GetConfigResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CONFIG, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Allows retrieving project related information.
   * </pre>
   */
  public static final class ProjectManagementServiceBlockingStub extends io.grpc.stub.AbstractStub<ProjectManagementServiceBlockingStub> {
    private ProjectManagementServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectManagementServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectManagementServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectManagementServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the service account information associated with your project. You need
     * this information in order to grant the service account persmissions for
     * the Google Cloud Storage location where you put your model training code
     * for training the model with Google Cloud Machine Learning.
     * </pre>
     */
    public com.google.cloud.ml.api.v1beta1.GetConfigResponse getConfig(com.google.cloud.ml.api.v1beta1.GetConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CONFIG, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Allows retrieving project related information.
   * </pre>
   */
  public static final class ProjectManagementServiceFutureStub extends io.grpc.stub.AbstractStub<ProjectManagementServiceFutureStub> {
    private ProjectManagementServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectManagementServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectManagementServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectManagementServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the service account information associated with your project. You need
     * this information in order to grant the service account persmissions for
     * the Google Cloud Storage location where you put your model training code
     * for training the model with Google Cloud Machine Learning.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.ml.api.v1beta1.GetConfigResponse> getConfig(
        com.google.cloud.ml.api.v1beta1.GetConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CONFIG, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CONFIG = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProjectManagementServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ProjectManagementServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CONFIG:
          serviceImpl.getConfig((com.google.cloud.ml.api.v1beta1.GetConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.GetConfigResponse>) responseObserver);
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
        METHOD_GET_CONFIG);
  }

}
