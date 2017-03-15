package com.google.cloud.ml.api.v1;

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
 * Service to create and manage training and batch prediction jobs.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/cloud/ml/v1/job_service.proto")
public class JobServiceGrpc {

  private JobServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.ml.v1.JobService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.ml.api.v1.CreateJobRequest,
      com.google.cloud.ml.api.v1.Job> METHOD_CREATE_JOB =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.ml.v1.JobService", "CreateJob"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1.CreateJobRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1.Job.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.ml.api.v1.ListJobsRequest,
      com.google.cloud.ml.api.v1.ListJobsResponse> METHOD_LIST_JOBS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.ml.v1.JobService", "ListJobs"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1.ListJobsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1.ListJobsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.ml.api.v1.GetJobRequest,
      com.google.cloud.ml.api.v1.Job> METHOD_GET_JOB =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.ml.v1.JobService", "GetJob"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1.GetJobRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1.Job.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.ml.api.v1.CancelJobRequest,
      com.google.protobuf.Empty> METHOD_CANCEL_JOB =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.ml.v1.JobService", "CancelJob"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1.CancelJobRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobServiceStub newStub(io.grpc.Channel channel) {
    return new JobServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JobServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static JobServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JobServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to create and manage training and batch prediction jobs.
   * </pre>
   */
  public static abstract class JobServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a training or a batch prediction job.
     * </pre>
     */
    public void createJob(com.google.cloud.ml.api.v1.CreateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1.Job> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_JOB, responseObserver);
    }

    /**
     * <pre>
     * Lists the jobs in the project.
     * </pre>
     */
    public void listJobs(com.google.cloud.ml.api.v1.ListJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1.ListJobsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_JOBS, responseObserver);
    }

    /**
     * <pre>
     * Describes a job.
     * </pre>
     */
    public void getJob(com.google.cloud.ml.api.v1.GetJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1.Job> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_JOB, responseObserver);
    }

    /**
     * <pre>
     * Cancels a running job.
     * </pre>
     */
    public void cancelJob(com.google.cloud.ml.api.v1.CancelJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CANCEL_JOB, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_JOB,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.ml.api.v1.CreateJobRequest,
                com.google.cloud.ml.api.v1.Job>(
                  this, METHODID_CREATE_JOB)))
          .addMethod(
            METHOD_LIST_JOBS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.ml.api.v1.ListJobsRequest,
                com.google.cloud.ml.api.v1.ListJobsResponse>(
                  this, METHODID_LIST_JOBS)))
          .addMethod(
            METHOD_GET_JOB,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.ml.api.v1.GetJobRequest,
                com.google.cloud.ml.api.v1.Job>(
                  this, METHODID_GET_JOB)))
          .addMethod(
            METHOD_CANCEL_JOB,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.ml.api.v1.CancelJobRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CANCEL_JOB)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to create and manage training and batch prediction jobs.
   * </pre>
   */
  public static final class JobServiceStub extends io.grpc.stub.AbstractStub<JobServiceStub> {
    private JobServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a training or a batch prediction job.
     * </pre>
     */
    public void createJob(com.google.cloud.ml.api.v1.CreateJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1.Job> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_JOB, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the jobs in the project.
     * </pre>
     */
    public void listJobs(com.google.cloud.ml.api.v1.ListJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1.ListJobsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_JOBS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Describes a job.
     * </pre>
     */
    public void getJob(com.google.cloud.ml.api.v1.GetJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1.Job> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_JOB, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancels a running job.
     * </pre>
     */
    public void cancelJob(com.google.cloud.ml.api.v1.CancelJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CANCEL_JOB, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to create and manage training and batch prediction jobs.
   * </pre>
   */
  public static final class JobServiceBlockingStub extends io.grpc.stub.AbstractStub<JobServiceBlockingStub> {
    private JobServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a training or a batch prediction job.
     * </pre>
     */
    public com.google.cloud.ml.api.v1.Job createJob(com.google.cloud.ml.api.v1.CreateJobRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_JOB, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the jobs in the project.
     * </pre>
     */
    public com.google.cloud.ml.api.v1.ListJobsResponse listJobs(com.google.cloud.ml.api.v1.ListJobsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_JOBS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Describes a job.
     * </pre>
     */
    public com.google.cloud.ml.api.v1.Job getJob(com.google.cloud.ml.api.v1.GetJobRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_JOB, getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancels a running job.
     * </pre>
     */
    public com.google.protobuf.Empty cancelJob(com.google.cloud.ml.api.v1.CancelJobRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CANCEL_JOB, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to create and manage training and batch prediction jobs.
   * </pre>
   */
  public static final class JobServiceFutureStub extends io.grpc.stub.AbstractStub<JobServiceFutureStub> {
    private JobServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a training or a batch prediction job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.ml.api.v1.Job> createJob(
        com.google.cloud.ml.api.v1.CreateJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_JOB, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the jobs in the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.ml.api.v1.ListJobsResponse> listJobs(
        com.google.cloud.ml.api.v1.ListJobsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_JOBS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Describes a job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.ml.api.v1.Job> getJob(
        com.google.cloud.ml.api.v1.GetJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_JOB, getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancels a running job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancelJob(
        com.google.cloud.ml.api.v1.CancelJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CANCEL_JOB, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_JOB = 0;
  private static final int METHODID_LIST_JOBS = 1;
  private static final int METHODID_GET_JOB = 2;
  private static final int METHODID_CANCEL_JOB = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(JobServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_JOB:
          serviceImpl.createJob((com.google.cloud.ml.api.v1.CreateJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1.Job>) responseObserver);
          break;
        case METHODID_LIST_JOBS:
          serviceImpl.listJobs((com.google.cloud.ml.api.v1.ListJobsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1.ListJobsResponse>) responseObserver);
          break;
        case METHODID_GET_JOB:
          serviceImpl.getJob((com.google.cloud.ml.api.v1.GetJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1.Job>) responseObserver);
          break;
        case METHODID_CANCEL_JOB:
          serviceImpl.cancelJob((com.google.cloud.ml.api.v1.CancelJobRequest) request,
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
        METHOD_CREATE_JOB,
        METHOD_LIST_JOBS,
        METHOD_GET_JOB,
        METHOD_CANCEL_JOB);
  }

}
