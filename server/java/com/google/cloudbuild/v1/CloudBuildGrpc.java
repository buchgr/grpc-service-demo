package com.google.cloudbuild.v1;

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
 * Manages container image build requests in the cloud.
 * The main concept used by this API is a Build, which describes the location of
 * the source to build, how to build the source into a container image, and what
 * tag to apply to the built image when it is pushed to Google Container
 * Registry.
 * A user can list previously-requested builds or get builds by their ID to
 * determine the status of the build.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/devtools/cloudbuild/v1/cloudbuild.proto")
public class CloudBuildGrpc {

  private CloudBuildGrpc() {}

  public static final String SERVICE_NAME = "google.devtools.cloudbuild.v1.CloudBuild";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloudbuild.v1.CreateBuildRequest,
      com.google.longrunning.Operation> METHOD_CREATE_BUILD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.cloudbuild.v1.CloudBuild", "CreateBuild"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloudbuild.v1.CreateBuildRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloudbuild.v1.GetBuildRequest,
      com.google.cloudbuild.v1.Build> METHOD_GET_BUILD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.cloudbuild.v1.CloudBuild", "GetBuild"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloudbuild.v1.GetBuildRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloudbuild.v1.Build.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloudbuild.v1.ListBuildsRequest,
      com.google.cloudbuild.v1.ListBuildsResponse> METHOD_LIST_BUILDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.cloudbuild.v1.CloudBuild", "ListBuilds"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloudbuild.v1.ListBuildsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloudbuild.v1.ListBuildsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloudbuild.v1.CancelBuildRequest,
      com.google.cloudbuild.v1.Build> METHOD_CANCEL_BUILD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.cloudbuild.v1.CloudBuild", "CancelBuild"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloudbuild.v1.CancelBuildRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloudbuild.v1.Build.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloudbuild.v1.CreateBuildTriggerRequest,
      com.google.cloudbuild.v1.BuildTrigger> METHOD_CREATE_BUILD_TRIGGER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.cloudbuild.v1.CloudBuild", "CreateBuildTrigger"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloudbuild.v1.CreateBuildTriggerRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloudbuild.v1.BuildTrigger.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloudbuild.v1.GetBuildTriggerRequest,
      com.google.cloudbuild.v1.BuildTrigger> METHOD_GET_BUILD_TRIGGER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.cloudbuild.v1.CloudBuild", "GetBuildTrigger"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloudbuild.v1.GetBuildTriggerRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloudbuild.v1.BuildTrigger.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloudbuild.v1.ListBuildTriggersRequest,
      com.google.cloudbuild.v1.ListBuildTriggersResponse> METHOD_LIST_BUILD_TRIGGERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.cloudbuild.v1.CloudBuild", "ListBuildTriggers"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloudbuild.v1.ListBuildTriggersRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloudbuild.v1.ListBuildTriggersResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloudbuild.v1.DeleteBuildTriggerRequest,
      com.google.protobuf.Empty> METHOD_DELETE_BUILD_TRIGGER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.cloudbuild.v1.CloudBuild", "DeleteBuildTrigger"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloudbuild.v1.DeleteBuildTriggerRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloudbuild.v1.UpdateBuildTriggerRequest,
      com.google.cloudbuild.v1.BuildTrigger> METHOD_UPDATE_BUILD_TRIGGER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.cloudbuild.v1.CloudBuild", "UpdateBuildTrigger"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloudbuild.v1.UpdateBuildTriggerRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloudbuild.v1.BuildTrigger.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CloudBuildStub newStub(io.grpc.Channel channel) {
    return new CloudBuildStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CloudBuildBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CloudBuildBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static CloudBuildFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CloudBuildFutureStub(channel);
  }

  /**
   * <pre>
   * Manages container image build requests in the cloud.
   * The main concept used by this API is a Build, which describes the location of
   * the source to build, how to build the source into a container image, and what
   * tag to apply to the built image when it is pushed to Google Container
   * Registry.
   * A user can list previously-requested builds or get builds by their ID to
   * determine the status of the build.
   * </pre>
   */
  public static abstract class CloudBuildImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Starts a build with the specified configuration.
     * The long-running Operation returned by this method will include the ID of
     * the build, which can be passed to GetBuild to determine its status (e.g.,
     * success or failure).
     * </pre>
     */
    public void createBuild(com.google.cloudbuild.v1.CreateBuildRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_BUILD, responseObserver);
    }

    /**
     * <pre>
     * Returns information about a previously requested build.
     * The Build that is returned includes its status (e.g., success or failure,
     * or in-progress), and timing information.
     * </pre>
     */
    public void getBuild(com.google.cloudbuild.v1.GetBuildRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.Build> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BUILD, responseObserver);
    }

    /**
     * <pre>
     * Lists previously requested builds.
     * Previously requested builds may still be in-progress, or may have finished
     * successfully or unsuccessfully.
     * </pre>
     */
    public void listBuilds(com.google.cloudbuild.v1.ListBuildsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.ListBuildsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_BUILDS, responseObserver);
    }

    /**
     * <pre>
     * Cancels a requested build in progress.
     * </pre>
     */
    public void cancelBuild(com.google.cloudbuild.v1.CancelBuildRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.Build> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CANCEL_BUILD, responseObserver);
    }

    /**
     * <pre>
     * Creates a new BuildTrigger.
     * This API is experimental.
     * </pre>
     */
    public void createBuildTrigger(com.google.cloudbuild.v1.CreateBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_BUILD_TRIGGER, responseObserver);
    }

    /**
     * <pre>
     * Gets information about a BuildTrigger.
     * This API is experimental.
     * </pre>
     */
    public void getBuildTrigger(com.google.cloudbuild.v1.GetBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BUILD_TRIGGER, responseObserver);
    }

    /**
     * <pre>
     * Lists existing BuildTrigger.
     * This API is experimental.
     * </pre>
     */
    public void listBuildTriggers(com.google.cloudbuild.v1.ListBuildTriggersRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.ListBuildTriggersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_BUILD_TRIGGERS, responseObserver);
    }

    /**
     * <pre>
     * Deletes an BuildTrigger by its project ID and trigger ID.
     * This API is experimental.
     * </pre>
     */
    public void deleteBuildTrigger(com.google.cloudbuild.v1.DeleteBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_BUILD_TRIGGER, responseObserver);
    }

    /**
     * <pre>
     * Updates an BuildTrigger by its project ID and trigger ID.
     * This API is experimental.
     * </pre>
     */
    public void updateBuildTrigger(com.google.cloudbuild.v1.UpdateBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_BUILD_TRIGGER, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_BUILD,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloudbuild.v1.CreateBuildRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CREATE_BUILD)))
          .addMethod(
            METHOD_GET_BUILD,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloudbuild.v1.GetBuildRequest,
                com.google.cloudbuild.v1.Build>(
                  this, METHODID_GET_BUILD)))
          .addMethod(
            METHOD_LIST_BUILDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloudbuild.v1.ListBuildsRequest,
                com.google.cloudbuild.v1.ListBuildsResponse>(
                  this, METHODID_LIST_BUILDS)))
          .addMethod(
            METHOD_CANCEL_BUILD,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloudbuild.v1.CancelBuildRequest,
                com.google.cloudbuild.v1.Build>(
                  this, METHODID_CANCEL_BUILD)))
          .addMethod(
            METHOD_CREATE_BUILD_TRIGGER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloudbuild.v1.CreateBuildTriggerRequest,
                com.google.cloudbuild.v1.BuildTrigger>(
                  this, METHODID_CREATE_BUILD_TRIGGER)))
          .addMethod(
            METHOD_GET_BUILD_TRIGGER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloudbuild.v1.GetBuildTriggerRequest,
                com.google.cloudbuild.v1.BuildTrigger>(
                  this, METHODID_GET_BUILD_TRIGGER)))
          .addMethod(
            METHOD_LIST_BUILD_TRIGGERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloudbuild.v1.ListBuildTriggersRequest,
                com.google.cloudbuild.v1.ListBuildTriggersResponse>(
                  this, METHODID_LIST_BUILD_TRIGGERS)))
          .addMethod(
            METHOD_DELETE_BUILD_TRIGGER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloudbuild.v1.DeleteBuildTriggerRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_BUILD_TRIGGER)))
          .addMethod(
            METHOD_UPDATE_BUILD_TRIGGER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloudbuild.v1.UpdateBuildTriggerRequest,
                com.google.cloudbuild.v1.BuildTrigger>(
                  this, METHODID_UPDATE_BUILD_TRIGGER)))
          .build();
    }
  }

  /**
   * <pre>
   * Manages container image build requests in the cloud.
   * The main concept used by this API is a Build, which describes the location of
   * the source to build, how to build the source into a container image, and what
   * tag to apply to the built image when it is pushed to Google Container
   * Registry.
   * A user can list previously-requested builds or get builds by their ID to
   * determine the status of the build.
   * </pre>
   */
  public static final class CloudBuildStub extends io.grpc.stub.AbstractStub<CloudBuildStub> {
    private CloudBuildStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CloudBuildStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudBuildStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CloudBuildStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts a build with the specified configuration.
     * The long-running Operation returned by this method will include the ID of
     * the build, which can be passed to GetBuild to determine its status (e.g.,
     * success or failure).
     * </pre>
     */
    public void createBuild(com.google.cloudbuild.v1.CreateBuildRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_BUILD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns information about a previously requested build.
     * The Build that is returned includes its status (e.g., success or failure,
     * or in-progress), and timing information.
     * </pre>
     */
    public void getBuild(com.google.cloudbuild.v1.GetBuildRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.Build> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BUILD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists previously requested builds.
     * Previously requested builds may still be in-progress, or may have finished
     * successfully or unsuccessfully.
     * </pre>
     */
    public void listBuilds(com.google.cloudbuild.v1.ListBuildsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.ListBuildsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_BUILDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancels a requested build in progress.
     * </pre>
     */
    public void cancelBuild(com.google.cloudbuild.v1.CancelBuildRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.Build> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CANCEL_BUILD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new BuildTrigger.
     * This API is experimental.
     * </pre>
     */
    public void createBuildTrigger(com.google.cloudbuild.v1.CreateBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_BUILD_TRIGGER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets information about a BuildTrigger.
     * This API is experimental.
     * </pre>
     */
    public void getBuildTrigger(com.google.cloudbuild.v1.GetBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BUILD_TRIGGER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists existing BuildTrigger.
     * This API is experimental.
     * </pre>
     */
    public void listBuildTriggers(com.google.cloudbuild.v1.ListBuildTriggersRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.ListBuildTriggersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_BUILD_TRIGGERS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an BuildTrigger by its project ID and trigger ID.
     * This API is experimental.
     * </pre>
     */
    public void deleteBuildTrigger(com.google.cloudbuild.v1.DeleteBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_BUILD_TRIGGER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an BuildTrigger by its project ID and trigger ID.
     * This API is experimental.
     * </pre>
     */
    public void updateBuildTrigger(com.google.cloudbuild.v1.UpdateBuildTriggerRequest request,
        io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_BUILD_TRIGGER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Manages container image build requests in the cloud.
   * The main concept used by this API is a Build, which describes the location of
   * the source to build, how to build the source into a container image, and what
   * tag to apply to the built image when it is pushed to Google Container
   * Registry.
   * A user can list previously-requested builds or get builds by their ID to
   * determine the status of the build.
   * </pre>
   */
  public static final class CloudBuildBlockingStub extends io.grpc.stub.AbstractStub<CloudBuildBlockingStub> {
    private CloudBuildBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CloudBuildBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudBuildBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CloudBuildBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts a build with the specified configuration.
     * The long-running Operation returned by this method will include the ID of
     * the build, which can be passed to GetBuild to determine its status (e.g.,
     * success or failure).
     * </pre>
     */
    public com.google.longrunning.Operation createBuild(com.google.cloudbuild.v1.CreateBuildRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_BUILD, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns information about a previously requested build.
     * The Build that is returned includes its status (e.g., success or failure,
     * or in-progress), and timing information.
     * </pre>
     */
    public com.google.cloudbuild.v1.Build getBuild(com.google.cloudbuild.v1.GetBuildRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BUILD, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists previously requested builds.
     * Previously requested builds may still be in-progress, or may have finished
     * successfully or unsuccessfully.
     * </pre>
     */
    public com.google.cloudbuild.v1.ListBuildsResponse listBuilds(com.google.cloudbuild.v1.ListBuildsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_BUILDS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancels a requested build in progress.
     * </pre>
     */
    public com.google.cloudbuild.v1.Build cancelBuild(com.google.cloudbuild.v1.CancelBuildRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CANCEL_BUILD, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new BuildTrigger.
     * This API is experimental.
     * </pre>
     */
    public com.google.cloudbuild.v1.BuildTrigger createBuildTrigger(com.google.cloudbuild.v1.CreateBuildTriggerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_BUILD_TRIGGER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets information about a BuildTrigger.
     * This API is experimental.
     * </pre>
     */
    public com.google.cloudbuild.v1.BuildTrigger getBuildTrigger(com.google.cloudbuild.v1.GetBuildTriggerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BUILD_TRIGGER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists existing BuildTrigger.
     * This API is experimental.
     * </pre>
     */
    public com.google.cloudbuild.v1.ListBuildTriggersResponse listBuildTriggers(com.google.cloudbuild.v1.ListBuildTriggersRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_BUILD_TRIGGERS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an BuildTrigger by its project ID and trigger ID.
     * This API is experimental.
     * </pre>
     */
    public com.google.protobuf.Empty deleteBuildTrigger(com.google.cloudbuild.v1.DeleteBuildTriggerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_BUILD_TRIGGER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an BuildTrigger by its project ID and trigger ID.
     * This API is experimental.
     * </pre>
     */
    public com.google.cloudbuild.v1.BuildTrigger updateBuildTrigger(com.google.cloudbuild.v1.UpdateBuildTriggerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_BUILD_TRIGGER, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Manages container image build requests in the cloud.
   * The main concept used by this API is a Build, which describes the location of
   * the source to build, how to build the source into a container image, and what
   * tag to apply to the built image when it is pushed to Google Container
   * Registry.
   * A user can list previously-requested builds or get builds by their ID to
   * determine the status of the build.
   * </pre>
   */
  public static final class CloudBuildFutureStub extends io.grpc.stub.AbstractStub<CloudBuildFutureStub> {
    private CloudBuildFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CloudBuildFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudBuildFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CloudBuildFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts a build with the specified configuration.
     * The long-running Operation returned by this method will include the ID of
     * the build, which can be passed to GetBuild to determine its status (e.g.,
     * success or failure).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> createBuild(
        com.google.cloudbuild.v1.CreateBuildRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_BUILD, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns information about a previously requested build.
     * The Build that is returned includes its status (e.g., success or failure,
     * or in-progress), and timing information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloudbuild.v1.Build> getBuild(
        com.google.cloudbuild.v1.GetBuildRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BUILD, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists previously requested builds.
     * Previously requested builds may still be in-progress, or may have finished
     * successfully or unsuccessfully.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloudbuild.v1.ListBuildsResponse> listBuilds(
        com.google.cloudbuild.v1.ListBuildsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_BUILDS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancels a requested build in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloudbuild.v1.Build> cancelBuild(
        com.google.cloudbuild.v1.CancelBuildRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CANCEL_BUILD, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new BuildTrigger.
     * This API is experimental.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloudbuild.v1.BuildTrigger> createBuildTrigger(
        com.google.cloudbuild.v1.CreateBuildTriggerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_BUILD_TRIGGER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets information about a BuildTrigger.
     * This API is experimental.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloudbuild.v1.BuildTrigger> getBuildTrigger(
        com.google.cloudbuild.v1.GetBuildTriggerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BUILD_TRIGGER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists existing BuildTrigger.
     * This API is experimental.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloudbuild.v1.ListBuildTriggersResponse> listBuildTriggers(
        com.google.cloudbuild.v1.ListBuildTriggersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_BUILD_TRIGGERS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an BuildTrigger by its project ID and trigger ID.
     * This API is experimental.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBuildTrigger(
        com.google.cloudbuild.v1.DeleteBuildTriggerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_BUILD_TRIGGER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an BuildTrigger by its project ID and trigger ID.
     * This API is experimental.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloudbuild.v1.BuildTrigger> updateBuildTrigger(
        com.google.cloudbuild.v1.UpdateBuildTriggerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_BUILD_TRIGGER, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BUILD = 0;
  private static final int METHODID_GET_BUILD = 1;
  private static final int METHODID_LIST_BUILDS = 2;
  private static final int METHODID_CANCEL_BUILD = 3;
  private static final int METHODID_CREATE_BUILD_TRIGGER = 4;
  private static final int METHODID_GET_BUILD_TRIGGER = 5;
  private static final int METHODID_LIST_BUILD_TRIGGERS = 6;
  private static final int METHODID_DELETE_BUILD_TRIGGER = 7;
  private static final int METHODID_UPDATE_BUILD_TRIGGER = 8;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CloudBuildImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(CloudBuildImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BUILD:
          serviceImpl.createBuild((com.google.cloudbuild.v1.CreateBuildRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_BUILD:
          serviceImpl.getBuild((com.google.cloudbuild.v1.GetBuildRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.Build>) responseObserver);
          break;
        case METHODID_LIST_BUILDS:
          serviceImpl.listBuilds((com.google.cloudbuild.v1.ListBuildsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.ListBuildsResponse>) responseObserver);
          break;
        case METHODID_CANCEL_BUILD:
          serviceImpl.cancelBuild((com.google.cloudbuild.v1.CancelBuildRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.Build>) responseObserver);
          break;
        case METHODID_CREATE_BUILD_TRIGGER:
          serviceImpl.createBuildTrigger((com.google.cloudbuild.v1.CreateBuildTriggerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger>) responseObserver);
          break;
        case METHODID_GET_BUILD_TRIGGER:
          serviceImpl.getBuildTrigger((com.google.cloudbuild.v1.GetBuildTriggerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger>) responseObserver);
          break;
        case METHODID_LIST_BUILD_TRIGGERS:
          serviceImpl.listBuildTriggers((com.google.cloudbuild.v1.ListBuildTriggersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.ListBuildTriggersResponse>) responseObserver);
          break;
        case METHODID_DELETE_BUILD_TRIGGER:
          serviceImpl.deleteBuildTrigger((com.google.cloudbuild.v1.DeleteBuildTriggerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_BUILD_TRIGGER:
          serviceImpl.updateBuildTrigger((com.google.cloudbuild.v1.UpdateBuildTriggerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloudbuild.v1.BuildTrigger>) responseObserver);
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
        METHOD_CREATE_BUILD,
        METHOD_GET_BUILD,
        METHOD_LIST_BUILDS,
        METHOD_CANCEL_BUILD,
        METHOD_CREATE_BUILD_TRIGGER,
        METHOD_GET_BUILD_TRIGGER,
        METHOD_LIST_BUILD_TRIGGERS,
        METHOD_DELETE_BUILD_TRIGGER,
        METHOD_UPDATE_BUILD_TRIGGER);
  }

}
