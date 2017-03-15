package com.google.storagetransfer.v1.proto;

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
 * Transfers data between between Google Cloud Storage buckets or from a data
 * source external to Google to a Cloud Storage bucket.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/storagetransfer/v1/transfer.proto")
public class StorageTransferServiceGrpc {

  private StorageTransferServiceGrpc() {}

  public static final String SERVICE_NAME = "google.storagetransfer.v1.StorageTransferService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.storagetransfer.v1.proto.TransferProto.GetGoogleServiceAccountRequest,
      com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount> METHOD_GET_GOOGLE_SERVICE_ACCOUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.storagetransfer.v1.StorageTransferService", "GetGoogleServiceAccount"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.storagetransfer.v1.proto.TransferProto.GetGoogleServiceAccountRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest,
      com.google.storagetransfer.v1.proto.TransferTypes.TransferJob> METHOD_CREATE_TRANSFER_JOB =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.storagetransfer.v1.StorageTransferService", "CreateTransferJob"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.storagetransfer.v1.proto.TransferTypes.TransferJob.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest,
      com.google.storagetransfer.v1.proto.TransferTypes.TransferJob> METHOD_UPDATE_TRANSFER_JOB =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.storagetransfer.v1.StorageTransferService", "UpdateTransferJob"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.storagetransfer.v1.proto.TransferTypes.TransferJob.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest,
      com.google.storagetransfer.v1.proto.TransferTypes.TransferJob> METHOD_GET_TRANSFER_JOB =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.storagetransfer.v1.StorageTransferService", "GetTransferJob"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.storagetransfer.v1.proto.TransferTypes.TransferJob.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest,
      com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse> METHOD_LIST_TRANSFER_JOBS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.storagetransfer.v1.StorageTransferService", "ListTransferJobs"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.storagetransfer.v1.proto.TransferProto.PauseTransferOperationRequest,
      com.google.protobuf.Empty> METHOD_PAUSE_TRANSFER_OPERATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.storagetransfer.v1.StorageTransferService", "PauseTransferOperation"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.storagetransfer.v1.proto.TransferProto.PauseTransferOperationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.storagetransfer.v1.proto.TransferProto.ResumeTransferOperationRequest,
      com.google.protobuf.Empty> METHOD_RESUME_TRANSFER_OPERATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.storagetransfer.v1.StorageTransferService", "ResumeTransferOperation"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.storagetransfer.v1.proto.TransferProto.ResumeTransferOperationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StorageTransferServiceStub newStub(io.grpc.Channel channel) {
    return new StorageTransferServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorageTransferServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StorageTransferServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static StorageTransferServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StorageTransferServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Transfers data between between Google Cloud Storage buckets or from a data
   * source external to Google to a Cloud Storage bucket.
   * </pre>
   */
  public static abstract class StorageTransferServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the Google service account that is used by Storage Transfer
     * Service to access buckets in the project where transfers
     * run or in other projects. Each Google service account is associated
     * with one Google Cloud Platform Console project. Users
     * should add this service account to the Google Cloud Storage bucket
     * ACLs to grant access to Storage Transfer Service. This service
     * account is created and owned by Storage Transfer Service and can
     * only be used by Storage Transfer Service.
     * </pre>
     */
    public void getGoogleServiceAccount(com.google.storagetransfer.v1.proto.TransferProto.GetGoogleServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GOOGLE_SERVICE_ACCOUNT, responseObserver);
    }

    /**
     * <pre>
     * Creates a transfer job that runs periodically.
     * </pre>
     */
    public void createTransferJob(com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest request,
        io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_TRANSFER_JOB, responseObserver);
    }

    /**
     * <pre>
     * Updates a transfer job. Updating a job's transfer spec does not affect
     * transfer operations that are running already. Updating the scheduling
     * of a job is not allowed.
     * </pre>
     */
    public void updateTransferJob(com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest request,
        io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_TRANSFER_JOB, responseObserver);
    }

    /**
     * <pre>
     * Gets a transfer job.
     * </pre>
     */
    public void getTransferJob(com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest request,
        io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TRANSFER_JOB, responseObserver);
    }

    /**
     * <pre>
     * Lists transfer jobs.
     * </pre>
     */
    public void listTransferJobs(com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_TRANSFER_JOBS, responseObserver);
    }

    /**
     * <pre>
     * Pauses a transfer operation.
     * </pre>
     */
    public void pauseTransferOperation(com.google.storagetransfer.v1.proto.TransferProto.PauseTransferOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PAUSE_TRANSFER_OPERATION, responseObserver);
    }

    /**
     * <pre>
     * Resumes a transfer operation that is paused.
     * </pre>
     */
    public void resumeTransferOperation(com.google.storagetransfer.v1.proto.TransferProto.ResumeTransferOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RESUME_TRANSFER_OPERATION, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_GOOGLE_SERVICE_ACCOUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.storagetransfer.v1.proto.TransferProto.GetGoogleServiceAccountRequest,
                com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount>(
                  this, METHODID_GET_GOOGLE_SERVICE_ACCOUNT)))
          .addMethod(
            METHOD_CREATE_TRANSFER_JOB,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest,
                com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>(
                  this, METHODID_CREATE_TRANSFER_JOB)))
          .addMethod(
            METHOD_UPDATE_TRANSFER_JOB,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest,
                com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>(
                  this, METHODID_UPDATE_TRANSFER_JOB)))
          .addMethod(
            METHOD_GET_TRANSFER_JOB,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest,
                com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>(
                  this, METHODID_GET_TRANSFER_JOB)))
          .addMethod(
            METHOD_LIST_TRANSFER_JOBS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest,
                com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse>(
                  this, METHODID_LIST_TRANSFER_JOBS)))
          .addMethod(
            METHOD_PAUSE_TRANSFER_OPERATION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.storagetransfer.v1.proto.TransferProto.PauseTransferOperationRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_PAUSE_TRANSFER_OPERATION)))
          .addMethod(
            METHOD_RESUME_TRANSFER_OPERATION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.storagetransfer.v1.proto.TransferProto.ResumeTransferOperationRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_RESUME_TRANSFER_OPERATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Transfers data between between Google Cloud Storage buckets or from a data
   * source external to Google to a Cloud Storage bucket.
   * </pre>
   */
  public static final class StorageTransferServiceStub extends io.grpc.stub.AbstractStub<StorageTransferServiceStub> {
    private StorageTransferServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageTransferServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageTransferServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageTransferServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the Google service account that is used by Storage Transfer
     * Service to access buckets in the project where transfers
     * run or in other projects. Each Google service account is associated
     * with one Google Cloud Platform Console project. Users
     * should add this service account to the Google Cloud Storage bucket
     * ACLs to grant access to Storage Transfer Service. This service
     * account is created and owned by Storage Transfer Service and can
     * only be used by Storage Transfer Service.
     * </pre>
     */
    public void getGoogleServiceAccount(com.google.storagetransfer.v1.proto.TransferProto.GetGoogleServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GOOGLE_SERVICE_ACCOUNT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a transfer job that runs periodically.
     * </pre>
     */
    public void createTransferJob(com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest request,
        io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_TRANSFER_JOB, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a transfer job. Updating a job's transfer spec does not affect
     * transfer operations that are running already. Updating the scheduling
     * of a job is not allowed.
     * </pre>
     */
    public void updateTransferJob(com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest request,
        io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TRANSFER_JOB, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a transfer job.
     * </pre>
     */
    public void getTransferJob(com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest request,
        io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TRANSFER_JOB, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists transfer jobs.
     * </pre>
     */
    public void listTransferJobs(com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_TRANSFER_JOBS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pauses a transfer operation.
     * </pre>
     */
    public void pauseTransferOperation(com.google.storagetransfer.v1.proto.TransferProto.PauseTransferOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PAUSE_TRANSFER_OPERATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resumes a transfer operation that is paused.
     * </pre>
     */
    public void resumeTransferOperation(com.google.storagetransfer.v1.proto.TransferProto.ResumeTransferOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RESUME_TRANSFER_OPERATION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Transfers data between between Google Cloud Storage buckets or from a data
   * source external to Google to a Cloud Storage bucket.
   * </pre>
   */
  public static final class StorageTransferServiceBlockingStub extends io.grpc.stub.AbstractStub<StorageTransferServiceBlockingStub> {
    private StorageTransferServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageTransferServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageTransferServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageTransferServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the Google service account that is used by Storage Transfer
     * Service to access buckets in the project where transfers
     * run or in other projects. Each Google service account is associated
     * with one Google Cloud Platform Console project. Users
     * should add this service account to the Google Cloud Storage bucket
     * ACLs to grant access to Storage Transfer Service. This service
     * account is created and owned by Storage Transfer Service and can
     * only be used by Storage Transfer Service.
     * </pre>
     */
    public com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount getGoogleServiceAccount(com.google.storagetransfer.v1.proto.TransferProto.GetGoogleServiceAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GOOGLE_SERVICE_ACCOUNT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a transfer job that runs periodically.
     * </pre>
     */
    public com.google.storagetransfer.v1.proto.TransferTypes.TransferJob createTransferJob(com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_TRANSFER_JOB, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a transfer job. Updating a job's transfer spec does not affect
     * transfer operations that are running already. Updating the scheduling
     * of a job is not allowed.
     * </pre>
     */
    public com.google.storagetransfer.v1.proto.TransferTypes.TransferJob updateTransferJob(com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_TRANSFER_JOB, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a transfer job.
     * </pre>
     */
    public com.google.storagetransfer.v1.proto.TransferTypes.TransferJob getTransferJob(com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TRANSFER_JOB, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists transfer jobs.
     * </pre>
     */
    public com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse listTransferJobs(com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_TRANSFER_JOBS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Pauses a transfer operation.
     * </pre>
     */
    public com.google.protobuf.Empty pauseTransferOperation(com.google.storagetransfer.v1.proto.TransferProto.PauseTransferOperationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PAUSE_TRANSFER_OPERATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Resumes a transfer operation that is paused.
     * </pre>
     */
    public com.google.protobuf.Empty resumeTransferOperation(com.google.storagetransfer.v1.proto.TransferProto.ResumeTransferOperationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RESUME_TRANSFER_OPERATION, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Transfers data between between Google Cloud Storage buckets or from a data
   * source external to Google to a Cloud Storage bucket.
   * </pre>
   */
  public static final class StorageTransferServiceFutureStub extends io.grpc.stub.AbstractStub<StorageTransferServiceFutureStub> {
    private StorageTransferServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageTransferServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageTransferServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageTransferServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the Google service account that is used by Storage Transfer
     * Service to access buckets in the project where transfers
     * run or in other projects. Each Google service account is associated
     * with one Google Cloud Platform Console project. Users
     * should add this service account to the Google Cloud Storage bucket
     * ACLs to grant access to Storage Transfer Service. This service
     * account is created and owned by Storage Transfer Service and can
     * only be used by Storage Transfer Service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount> getGoogleServiceAccount(
        com.google.storagetransfer.v1.proto.TransferProto.GetGoogleServiceAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GOOGLE_SERVICE_ACCOUNT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a transfer job that runs periodically.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob> createTransferJob(
        com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_TRANSFER_JOB, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a transfer job. Updating a job's transfer spec does not affect
     * transfer operations that are running already. Updating the scheduling
     * of a job is not allowed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob> updateTransferJob(
        com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TRANSFER_JOB, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a transfer job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob> getTransferJob(
        com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TRANSFER_JOB, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists transfer jobs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse> listTransferJobs(
        com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_TRANSFER_JOBS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Pauses a transfer operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> pauseTransferOperation(
        com.google.storagetransfer.v1.proto.TransferProto.PauseTransferOperationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PAUSE_TRANSFER_OPERATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Resumes a transfer operation that is paused.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> resumeTransferOperation(
        com.google.storagetransfer.v1.proto.TransferProto.ResumeTransferOperationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RESUME_TRANSFER_OPERATION, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GOOGLE_SERVICE_ACCOUNT = 0;
  private static final int METHODID_CREATE_TRANSFER_JOB = 1;
  private static final int METHODID_UPDATE_TRANSFER_JOB = 2;
  private static final int METHODID_GET_TRANSFER_JOB = 3;
  private static final int METHODID_LIST_TRANSFER_JOBS = 4;
  private static final int METHODID_PAUSE_TRANSFER_OPERATION = 5;
  private static final int METHODID_RESUME_TRANSFER_OPERATION = 6;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StorageTransferServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(StorageTransferServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GOOGLE_SERVICE_ACCOUNT:
          serviceImpl.getGoogleServiceAccount((com.google.storagetransfer.v1.proto.TransferProto.GetGoogleServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.GoogleServiceAccount>) responseObserver);
          break;
        case METHODID_CREATE_TRANSFER_JOB:
          serviceImpl.createTransferJob((com.google.storagetransfer.v1.proto.TransferProto.CreateTransferJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>) responseObserver);
          break;
        case METHODID_UPDATE_TRANSFER_JOB:
          serviceImpl.updateTransferJob((com.google.storagetransfer.v1.proto.TransferProto.UpdateTransferJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>) responseObserver);
          break;
        case METHODID_GET_TRANSFER_JOB:
          serviceImpl.getTransferJob((com.google.storagetransfer.v1.proto.TransferProto.GetTransferJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferTypes.TransferJob>) responseObserver);
          break;
        case METHODID_LIST_TRANSFER_JOBS:
          serviceImpl.listTransferJobs((com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.storagetransfer.v1.proto.TransferProto.ListTransferJobsResponse>) responseObserver);
          break;
        case METHODID_PAUSE_TRANSFER_OPERATION:
          serviceImpl.pauseTransferOperation((com.google.storagetransfer.v1.proto.TransferProto.PauseTransferOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RESUME_TRANSFER_OPERATION:
          serviceImpl.resumeTransferOperation((com.google.storagetransfer.v1.proto.TransferProto.ResumeTransferOperationRequest) request,
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
        METHOD_GET_GOOGLE_SERVICE_ACCOUNT,
        METHOD_CREATE_TRANSFER_JOB,
        METHOD_UPDATE_TRANSFER_JOB,
        METHOD_GET_TRANSFER_JOB,
        METHOD_LIST_TRANSFER_JOBS,
        METHOD_PAUSE_TRANSFER_OPERATION,
        METHOD_RESUME_TRANSFER_OPERATION);
  }

}
