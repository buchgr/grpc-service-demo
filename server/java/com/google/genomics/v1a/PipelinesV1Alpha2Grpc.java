package com.google.genomics.v1a;

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
 * A service for running genomics pipelines.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/genomics/v1alpha2/pipelines.proto")
public class PipelinesV1Alpha2Grpc {

  private PipelinesV1Alpha2Grpc() {}

  public static final String SERVICE_NAME = "google.genomics.v1alpha2.PipelinesV1Alpha2";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1a.CreatePipelineRequest,
      com.google.genomics.v1a.Pipeline> METHOD_CREATE_PIPELINE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1alpha2.PipelinesV1Alpha2", "CreatePipeline"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1a.CreatePipelineRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1a.Pipeline.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1a.RunPipelineRequest,
      com.google.longrunning.Operation> METHOD_RUN_PIPELINE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1alpha2.PipelinesV1Alpha2", "RunPipeline"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1a.RunPipelineRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1a.GetPipelineRequest,
      com.google.genomics.v1a.Pipeline> METHOD_GET_PIPELINE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1alpha2.PipelinesV1Alpha2", "GetPipeline"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1a.GetPipelineRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1a.Pipeline.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1a.ListPipelinesRequest,
      com.google.genomics.v1a.ListPipelinesResponse> METHOD_LIST_PIPELINES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1alpha2.PipelinesV1Alpha2", "ListPipelines"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1a.ListPipelinesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1a.ListPipelinesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1a.DeletePipelineRequest,
      com.google.protobuf.Empty> METHOD_DELETE_PIPELINE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1alpha2.PipelinesV1Alpha2", "DeletePipeline"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1a.DeletePipelineRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1a.GetControllerConfigRequest,
      com.google.genomics.v1a.ControllerConfig> METHOD_GET_CONTROLLER_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1alpha2.PipelinesV1Alpha2", "GetControllerConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1a.GetControllerConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1a.ControllerConfig.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1a.SetOperationStatusRequest,
      com.google.protobuf.Empty> METHOD_SET_OPERATION_STATUS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1alpha2.PipelinesV1Alpha2", "SetOperationStatus"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1a.SetOperationStatusRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PipelinesV1Alpha2Stub newStub(io.grpc.Channel channel) {
    return new PipelinesV1Alpha2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PipelinesV1Alpha2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PipelinesV1Alpha2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static PipelinesV1Alpha2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PipelinesV1Alpha2FutureStub(channel);
  }

  /**
   * <pre>
   * A service for running genomics pipelines.
   * </pre>
   */
  public static abstract class PipelinesV1Alpha2ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a pipeline that can be run later. Create takes a Pipeline that
     * has all fields other than `pipelineId` populated, and then returns
     * the same pipeline with `pipelineId` populated. This id can be used
     * to run the pipeline.
     * Caller must have WRITE permission to the project.
     * </pre>
     */
    public void createPipeline(com.google.genomics.v1a.CreatePipelineRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1a.Pipeline> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_PIPELINE, responseObserver);
    }

    /**
     * <pre>
     * Runs a pipeline. If `pipelineId` is specified in the request, then
     * run a saved pipeline. If `ephemeralPipeline` is specified, then run
     * that pipeline once without saving a copy.
     * The caller must have READ permission to the project where the pipeline
     * is stored and WRITE permission to the project where the pipeline will be
     * run, as VMs will be created and storage will be used.
     * </pre>
     */
    public void runPipeline(com.google.genomics.v1a.RunPipelineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RUN_PIPELINE, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a pipeline based on ID.
     * Caller must have READ permission to the project.
     * </pre>
     */
    public void getPipeline(com.google.genomics.v1a.GetPipelineRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1a.Pipeline> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PIPELINE, responseObserver);
    }

    /**
     * <pre>
     * Lists pipelines.
     * Caller must have READ permission to the project.
     * </pre>
     */
    public void listPipelines(com.google.genomics.v1a.ListPipelinesRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1a.ListPipelinesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_PIPELINES, responseObserver);
    }

    /**
     * <pre>
     * Deletes a pipeline based on ID.
     * Caller must have WRITE permission to the project.
     * </pre>
     */
    public void deletePipeline(com.google.genomics.v1a.DeletePipelineRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_PIPELINE, responseObserver);
    }

    /**
     * <pre>
     * Gets controller configuration information. Should only be called
     * by VMs created by the Pipelines Service and not by end users.
     * </pre>
     */
    public void getControllerConfig(com.google.genomics.v1a.GetControllerConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1a.ControllerConfig> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CONTROLLER_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Sets status of a given operation. Any new timestamps (as determined by
     * description) are appended to TimestampEvents. Should only be called by VMs
     * created by the Pipelines Service and not by end users.
     * </pre>
     */
    public void setOperationStatus(com.google.genomics.v1a.SetOperationStatusRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_OPERATION_STATUS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_PIPELINE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1a.CreatePipelineRequest,
                com.google.genomics.v1a.Pipeline>(
                  this, METHODID_CREATE_PIPELINE)))
          .addMethod(
            METHOD_RUN_PIPELINE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1a.RunPipelineRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_RUN_PIPELINE)))
          .addMethod(
            METHOD_GET_PIPELINE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1a.GetPipelineRequest,
                com.google.genomics.v1a.Pipeline>(
                  this, METHODID_GET_PIPELINE)))
          .addMethod(
            METHOD_LIST_PIPELINES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1a.ListPipelinesRequest,
                com.google.genomics.v1a.ListPipelinesResponse>(
                  this, METHODID_LIST_PIPELINES)))
          .addMethod(
            METHOD_DELETE_PIPELINE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1a.DeletePipelineRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_PIPELINE)))
          .addMethod(
            METHOD_GET_CONTROLLER_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1a.GetControllerConfigRequest,
                com.google.genomics.v1a.ControllerConfig>(
                  this, METHODID_GET_CONTROLLER_CONFIG)))
          .addMethod(
            METHOD_SET_OPERATION_STATUS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1a.SetOperationStatusRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SET_OPERATION_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * A service for running genomics pipelines.
   * </pre>
   */
  public static final class PipelinesV1Alpha2Stub extends io.grpc.stub.AbstractStub<PipelinesV1Alpha2Stub> {
    private PipelinesV1Alpha2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private PipelinesV1Alpha2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PipelinesV1Alpha2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PipelinesV1Alpha2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a pipeline that can be run later. Create takes a Pipeline that
     * has all fields other than `pipelineId` populated, and then returns
     * the same pipeline with `pipelineId` populated. This id can be used
     * to run the pipeline.
     * Caller must have WRITE permission to the project.
     * </pre>
     */
    public void createPipeline(com.google.genomics.v1a.CreatePipelineRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1a.Pipeline> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_PIPELINE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Runs a pipeline. If `pipelineId` is specified in the request, then
     * run a saved pipeline. If `ephemeralPipeline` is specified, then run
     * that pipeline once without saving a copy.
     * The caller must have READ permission to the project where the pipeline
     * is stored and WRITE permission to the project where the pipeline will be
     * run, as VMs will be created and storage will be used.
     * </pre>
     */
    public void runPipeline(com.google.genomics.v1a.RunPipelineRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RUN_PIPELINE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a pipeline based on ID.
     * Caller must have READ permission to the project.
     * </pre>
     */
    public void getPipeline(com.google.genomics.v1a.GetPipelineRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1a.Pipeline> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PIPELINE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists pipelines.
     * Caller must have READ permission to the project.
     * </pre>
     */
    public void listPipelines(com.google.genomics.v1a.ListPipelinesRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1a.ListPipelinesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_PIPELINES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a pipeline based on ID.
     * Caller must have WRITE permission to the project.
     * </pre>
     */
    public void deletePipeline(com.google.genomics.v1a.DeletePipelineRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_PIPELINE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets controller configuration information. Should only be called
     * by VMs created by the Pipelines Service and not by end users.
     * </pre>
     */
    public void getControllerConfig(com.google.genomics.v1a.GetControllerConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1a.ControllerConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CONTROLLER_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets status of a given operation. Any new timestamps (as determined by
     * description) are appended to TimestampEvents. Should only be called by VMs
     * created by the Pipelines Service and not by end users.
     * </pre>
     */
    public void setOperationStatus(com.google.genomics.v1a.SetOperationStatusRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_OPERATION_STATUS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A service for running genomics pipelines.
   * </pre>
   */
  public static final class PipelinesV1Alpha2BlockingStub extends io.grpc.stub.AbstractStub<PipelinesV1Alpha2BlockingStub> {
    private PipelinesV1Alpha2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PipelinesV1Alpha2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PipelinesV1Alpha2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PipelinesV1Alpha2BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a pipeline that can be run later. Create takes a Pipeline that
     * has all fields other than `pipelineId` populated, and then returns
     * the same pipeline with `pipelineId` populated. This id can be used
     * to run the pipeline.
     * Caller must have WRITE permission to the project.
     * </pre>
     */
    public com.google.genomics.v1a.Pipeline createPipeline(com.google.genomics.v1a.CreatePipelineRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_PIPELINE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Runs a pipeline. If `pipelineId` is specified in the request, then
     * run a saved pipeline. If `ephemeralPipeline` is specified, then run
     * that pipeline once without saving a copy.
     * The caller must have READ permission to the project where the pipeline
     * is stored and WRITE permission to the project where the pipeline will be
     * run, as VMs will be created and storage will be used.
     * </pre>
     */
    public com.google.longrunning.Operation runPipeline(com.google.genomics.v1a.RunPipelineRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RUN_PIPELINE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a pipeline based on ID.
     * Caller must have READ permission to the project.
     * </pre>
     */
    public com.google.genomics.v1a.Pipeline getPipeline(com.google.genomics.v1a.GetPipelineRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PIPELINE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists pipelines.
     * Caller must have READ permission to the project.
     * </pre>
     */
    public com.google.genomics.v1a.ListPipelinesResponse listPipelines(com.google.genomics.v1a.ListPipelinesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_PIPELINES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a pipeline based on ID.
     * Caller must have WRITE permission to the project.
     * </pre>
     */
    public com.google.protobuf.Empty deletePipeline(com.google.genomics.v1a.DeletePipelineRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_PIPELINE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets controller configuration information. Should only be called
     * by VMs created by the Pipelines Service and not by end users.
     * </pre>
     */
    public com.google.genomics.v1a.ControllerConfig getControllerConfig(com.google.genomics.v1a.GetControllerConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CONTROLLER_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets status of a given operation. Any new timestamps (as determined by
     * description) are appended to TimestampEvents. Should only be called by VMs
     * created by the Pipelines Service and not by end users.
     * </pre>
     */
    public com.google.protobuf.Empty setOperationStatus(com.google.genomics.v1a.SetOperationStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_OPERATION_STATUS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A service for running genomics pipelines.
   * </pre>
   */
  public static final class PipelinesV1Alpha2FutureStub extends io.grpc.stub.AbstractStub<PipelinesV1Alpha2FutureStub> {
    private PipelinesV1Alpha2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PipelinesV1Alpha2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PipelinesV1Alpha2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PipelinesV1Alpha2FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a pipeline that can be run later. Create takes a Pipeline that
     * has all fields other than `pipelineId` populated, and then returns
     * the same pipeline with `pipelineId` populated. This id can be used
     * to run the pipeline.
     * Caller must have WRITE permission to the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1a.Pipeline> createPipeline(
        com.google.genomics.v1a.CreatePipelineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_PIPELINE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Runs a pipeline. If `pipelineId` is specified in the request, then
     * run a saved pipeline. If `ephemeralPipeline` is specified, then run
     * that pipeline once without saving a copy.
     * The caller must have READ permission to the project where the pipeline
     * is stored and WRITE permission to the project where the pipeline will be
     * run, as VMs will be created and storage will be used.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> runPipeline(
        com.google.genomics.v1a.RunPipelineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RUN_PIPELINE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a pipeline based on ID.
     * Caller must have READ permission to the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1a.Pipeline> getPipeline(
        com.google.genomics.v1a.GetPipelineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PIPELINE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists pipelines.
     * Caller must have READ permission to the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1a.ListPipelinesResponse> listPipelines(
        com.google.genomics.v1a.ListPipelinesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_PIPELINES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a pipeline based on ID.
     * Caller must have WRITE permission to the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deletePipeline(
        com.google.genomics.v1a.DeletePipelineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_PIPELINE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets controller configuration information. Should only be called
     * by VMs created by the Pipelines Service and not by end users.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1a.ControllerConfig> getControllerConfig(
        com.google.genomics.v1a.GetControllerConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CONTROLLER_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets status of a given operation. Any new timestamps (as determined by
     * description) are appended to TimestampEvents. Should only be called by VMs
     * created by the Pipelines Service and not by end users.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setOperationStatus(
        com.google.genomics.v1a.SetOperationStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_OPERATION_STATUS, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PIPELINE = 0;
  private static final int METHODID_RUN_PIPELINE = 1;
  private static final int METHODID_GET_PIPELINE = 2;
  private static final int METHODID_LIST_PIPELINES = 3;
  private static final int METHODID_DELETE_PIPELINE = 4;
  private static final int METHODID_GET_CONTROLLER_CONFIG = 5;
  private static final int METHODID_SET_OPERATION_STATUS = 6;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PipelinesV1Alpha2ImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(PipelinesV1Alpha2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PIPELINE:
          serviceImpl.createPipeline((com.google.genomics.v1a.CreatePipelineRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1a.Pipeline>) responseObserver);
          break;
        case METHODID_RUN_PIPELINE:
          serviceImpl.runPipeline((com.google.genomics.v1a.RunPipelineRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_PIPELINE:
          serviceImpl.getPipeline((com.google.genomics.v1a.GetPipelineRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1a.Pipeline>) responseObserver);
          break;
        case METHODID_LIST_PIPELINES:
          serviceImpl.listPipelines((com.google.genomics.v1a.ListPipelinesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1a.ListPipelinesResponse>) responseObserver);
          break;
        case METHODID_DELETE_PIPELINE:
          serviceImpl.deletePipeline((com.google.genomics.v1a.DeletePipelineRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_CONTROLLER_CONFIG:
          serviceImpl.getControllerConfig((com.google.genomics.v1a.GetControllerConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1a.ControllerConfig>) responseObserver);
          break;
        case METHODID_SET_OPERATION_STATUS:
          serviceImpl.setOperationStatus((com.google.genomics.v1a.SetOperationStatusRequest) request,
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
        METHOD_CREATE_PIPELINE,
        METHOD_RUN_PIPELINE,
        METHOD_GET_PIPELINE,
        METHOD_LIST_PIPELINES,
        METHOD_DELETE_PIPELINE,
        METHOD_GET_CONTROLLER_CONFIG,
        METHOD_SET_OPERATION_STATUS);
  }

}
