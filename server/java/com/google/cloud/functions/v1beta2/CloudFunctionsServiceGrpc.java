package com.google.cloud.functions.v1beta2;

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
 * A service that application uses to manipulate triggers and functions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/cloud/functions/v1beta2/functions.proto")
public class CloudFunctionsServiceGrpc {

  private CloudFunctionsServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.functions.v1beta2.CloudFunctionsService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.functions.v1beta2.ListFunctionsRequest,
      com.google.cloud.functions.v1beta2.ListFunctionsResponse> METHOD_LIST_FUNCTIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.functions.v1beta2.CloudFunctionsService", "ListFunctions"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.functions.v1beta2.ListFunctionsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.functions.v1beta2.ListFunctionsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.functions.v1beta2.GetFunctionRequest,
      com.google.cloud.functions.v1beta2.CloudFunction> METHOD_GET_FUNCTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.functions.v1beta2.CloudFunctionsService", "GetFunction"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.functions.v1beta2.GetFunctionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.functions.v1beta2.CloudFunction.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.functions.v1beta2.CreateFunctionRequest,
      com.google.longrunning.Operation> METHOD_CREATE_FUNCTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.functions.v1beta2.CloudFunctionsService", "CreateFunction"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.functions.v1beta2.CreateFunctionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.functions.v1beta2.UpdateFunctionRequest,
      com.google.longrunning.Operation> METHOD_UPDATE_FUNCTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.functions.v1beta2.CloudFunctionsService", "UpdateFunction"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.functions.v1beta2.UpdateFunctionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.functions.v1beta2.DeleteFunctionRequest,
      com.google.longrunning.Operation> METHOD_DELETE_FUNCTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.functions.v1beta2.CloudFunctionsService", "DeleteFunction"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.functions.v1beta2.DeleteFunctionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.functions.v1beta2.CallFunctionRequest,
      com.google.cloud.functions.v1beta2.CallFunctionResponse> METHOD_CALL_FUNCTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.functions.v1beta2.CloudFunctionsService", "CallFunction"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.functions.v1beta2.CallFunctionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.functions.v1beta2.CallFunctionResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CloudFunctionsServiceStub newStub(io.grpc.Channel channel) {
    return new CloudFunctionsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CloudFunctionsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CloudFunctionsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static CloudFunctionsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CloudFunctionsServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A service that application uses to manipulate triggers and functions.
   * </pre>
   */
  public static abstract class CloudFunctionsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns a list of functions that belong to the requested project.
     * </pre>
     */
    public void listFunctions(com.google.cloud.functions.v1beta2.ListFunctionsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.functions.v1beta2.ListFunctionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_FUNCTIONS, responseObserver);
    }

    /**
     * <pre>
     * Returns a function with the given name from the requested project.
     * </pre>
     */
    public void getFunction(com.google.cloud.functions.v1beta2.GetFunctionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.functions.v1beta2.CloudFunction> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_FUNCTION, responseObserver);
    }

    /**
     * <pre>
     * Creates a new function. If a function with the given name already exists in
     * the specified project, the long running operation will return
     * `ALREADY_EXISTS` error.
     * </pre>
     */
    public void createFunction(com.google.cloud.functions.v1beta2.CreateFunctionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_FUNCTION, responseObserver);
    }

    /**
     * <pre>
     * Updates existing function.
     * </pre>
     */
    public void updateFunction(com.google.cloud.functions.v1beta2.UpdateFunctionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_FUNCTION, responseObserver);
    }

    /**
     * <pre>
     * Deletes a function with the given name from the specified project. If the
     * given function is used by some trigger, the trigger will be updated to
     * remove this function.
     * </pre>
     */
    public void deleteFunction(com.google.cloud.functions.v1beta2.DeleteFunctionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_FUNCTION, responseObserver);
    }

    /**
     * <pre>
     * Invokes synchronously deployed function. To be used for testing, very
     * limited traffic allowed.
     * </pre>
     */
    public void callFunction(com.google.cloud.functions.v1beta2.CallFunctionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.functions.v1beta2.CallFunctionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CALL_FUNCTION, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_FUNCTIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.functions.v1beta2.ListFunctionsRequest,
                com.google.cloud.functions.v1beta2.ListFunctionsResponse>(
                  this, METHODID_LIST_FUNCTIONS)))
          .addMethod(
            METHOD_GET_FUNCTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.functions.v1beta2.GetFunctionRequest,
                com.google.cloud.functions.v1beta2.CloudFunction>(
                  this, METHODID_GET_FUNCTION)))
          .addMethod(
            METHOD_CREATE_FUNCTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.functions.v1beta2.CreateFunctionRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CREATE_FUNCTION)))
          .addMethod(
            METHOD_UPDATE_FUNCTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.functions.v1beta2.UpdateFunctionRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_UPDATE_FUNCTION)))
          .addMethod(
            METHOD_DELETE_FUNCTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.functions.v1beta2.DeleteFunctionRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_DELETE_FUNCTION)))
          .addMethod(
            METHOD_CALL_FUNCTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.functions.v1beta2.CallFunctionRequest,
                com.google.cloud.functions.v1beta2.CallFunctionResponse>(
                  this, METHODID_CALL_FUNCTION)))
          .build();
    }
  }

  /**
   * <pre>
   * A service that application uses to manipulate triggers and functions.
   * </pre>
   */
  public static final class CloudFunctionsServiceStub extends io.grpc.stub.AbstractStub<CloudFunctionsServiceStub> {
    private CloudFunctionsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CloudFunctionsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudFunctionsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CloudFunctionsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a list of functions that belong to the requested project.
     * </pre>
     */
    public void listFunctions(com.google.cloud.functions.v1beta2.ListFunctionsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.functions.v1beta2.ListFunctionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_FUNCTIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a function with the given name from the requested project.
     * </pre>
     */
    public void getFunction(com.google.cloud.functions.v1beta2.GetFunctionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.functions.v1beta2.CloudFunction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_FUNCTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new function. If a function with the given name already exists in
     * the specified project, the long running operation will return
     * `ALREADY_EXISTS` error.
     * </pre>
     */
    public void createFunction(com.google.cloud.functions.v1beta2.CreateFunctionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_FUNCTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates existing function.
     * </pre>
     */
    public void updateFunction(com.google.cloud.functions.v1beta2.UpdateFunctionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_FUNCTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a function with the given name from the specified project. If the
     * given function is used by some trigger, the trigger will be updated to
     * remove this function.
     * </pre>
     */
    public void deleteFunction(com.google.cloud.functions.v1beta2.DeleteFunctionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_FUNCTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Invokes synchronously deployed function. To be used for testing, very
     * limited traffic allowed.
     * </pre>
     */
    public void callFunction(com.google.cloud.functions.v1beta2.CallFunctionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.functions.v1beta2.CallFunctionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CALL_FUNCTION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A service that application uses to manipulate triggers and functions.
   * </pre>
   */
  public static final class CloudFunctionsServiceBlockingStub extends io.grpc.stub.AbstractStub<CloudFunctionsServiceBlockingStub> {
    private CloudFunctionsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CloudFunctionsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudFunctionsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CloudFunctionsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a list of functions that belong to the requested project.
     * </pre>
     */
    public com.google.cloud.functions.v1beta2.ListFunctionsResponse listFunctions(com.google.cloud.functions.v1beta2.ListFunctionsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_FUNCTIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a function with the given name from the requested project.
     * </pre>
     */
    public com.google.cloud.functions.v1beta2.CloudFunction getFunction(com.google.cloud.functions.v1beta2.GetFunctionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_FUNCTION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new function. If a function with the given name already exists in
     * the specified project, the long running operation will return
     * `ALREADY_EXISTS` error.
     * </pre>
     */
    public com.google.longrunning.Operation createFunction(com.google.cloud.functions.v1beta2.CreateFunctionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_FUNCTION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates existing function.
     * </pre>
     */
    public com.google.longrunning.Operation updateFunction(com.google.cloud.functions.v1beta2.UpdateFunctionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_FUNCTION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a function with the given name from the specified project. If the
     * given function is used by some trigger, the trigger will be updated to
     * remove this function.
     * </pre>
     */
    public com.google.longrunning.Operation deleteFunction(com.google.cloud.functions.v1beta2.DeleteFunctionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_FUNCTION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Invokes synchronously deployed function. To be used for testing, very
     * limited traffic allowed.
     * </pre>
     */
    public com.google.cloud.functions.v1beta2.CallFunctionResponse callFunction(com.google.cloud.functions.v1beta2.CallFunctionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CALL_FUNCTION, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A service that application uses to manipulate triggers and functions.
   * </pre>
   */
  public static final class CloudFunctionsServiceFutureStub extends io.grpc.stub.AbstractStub<CloudFunctionsServiceFutureStub> {
    private CloudFunctionsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CloudFunctionsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudFunctionsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CloudFunctionsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a list of functions that belong to the requested project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.functions.v1beta2.ListFunctionsResponse> listFunctions(
        com.google.cloud.functions.v1beta2.ListFunctionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_FUNCTIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a function with the given name from the requested project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.functions.v1beta2.CloudFunction> getFunction(
        com.google.cloud.functions.v1beta2.GetFunctionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_FUNCTION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new function. If a function with the given name already exists in
     * the specified project, the long running operation will return
     * `ALREADY_EXISTS` error.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> createFunction(
        com.google.cloud.functions.v1beta2.CreateFunctionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_FUNCTION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates existing function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> updateFunction(
        com.google.cloud.functions.v1beta2.UpdateFunctionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_FUNCTION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a function with the given name from the specified project. If the
     * given function is used by some trigger, the trigger will be updated to
     * remove this function.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deleteFunction(
        com.google.cloud.functions.v1beta2.DeleteFunctionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_FUNCTION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Invokes synchronously deployed function. To be used for testing, very
     * limited traffic allowed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.functions.v1beta2.CallFunctionResponse> callFunction(
        com.google.cloud.functions.v1beta2.CallFunctionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CALL_FUNCTION, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_FUNCTIONS = 0;
  private static final int METHODID_GET_FUNCTION = 1;
  private static final int METHODID_CREATE_FUNCTION = 2;
  private static final int METHODID_UPDATE_FUNCTION = 3;
  private static final int METHODID_DELETE_FUNCTION = 4;
  private static final int METHODID_CALL_FUNCTION = 5;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CloudFunctionsServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(CloudFunctionsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_FUNCTIONS:
          serviceImpl.listFunctions((com.google.cloud.functions.v1beta2.ListFunctionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.functions.v1beta2.ListFunctionsResponse>) responseObserver);
          break;
        case METHODID_GET_FUNCTION:
          serviceImpl.getFunction((com.google.cloud.functions.v1beta2.GetFunctionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.functions.v1beta2.CloudFunction>) responseObserver);
          break;
        case METHODID_CREATE_FUNCTION:
          serviceImpl.createFunction((com.google.cloud.functions.v1beta2.CreateFunctionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_FUNCTION:
          serviceImpl.updateFunction((com.google.cloud.functions.v1beta2.UpdateFunctionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_FUNCTION:
          serviceImpl.deleteFunction((com.google.cloud.functions.v1beta2.DeleteFunctionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_CALL_FUNCTION:
          serviceImpl.callFunction((com.google.cloud.functions.v1beta2.CallFunctionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.functions.v1beta2.CallFunctionResponse>) responseObserver);
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
        METHOD_LIST_FUNCTIONS,
        METHOD_GET_FUNCTION,
        METHOD_CREATE_FUNCTION,
        METHOD_UPDATE_FUNCTION,
        METHOD_DELETE_FUNCTION,
        METHOD_CALL_FUNCTION);
  }

}
