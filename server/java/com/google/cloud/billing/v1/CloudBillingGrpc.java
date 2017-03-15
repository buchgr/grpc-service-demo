package com.google.cloud.billing.v1;

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
 * Retrieves Google Cloud Console billing accounts and associates them with
 * projects.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/cloud/billing/v1/cloud_billing.proto")
public class CloudBillingGrpc {

  private CloudBillingGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.billing.v1.CloudBilling";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.billing.v1.GetBillingAccountRequest,
      com.google.cloud.billing.v1.BillingAccount> METHOD_GET_BILLING_ACCOUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.billing.v1.CloudBilling", "GetBillingAccount"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.billing.v1.GetBillingAccountRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.billing.v1.BillingAccount.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.billing.v1.ListBillingAccountsRequest,
      com.google.cloud.billing.v1.ListBillingAccountsResponse> METHOD_LIST_BILLING_ACCOUNTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.billing.v1.CloudBilling", "ListBillingAccounts"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.billing.v1.ListBillingAccountsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.billing.v1.ListBillingAccountsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.billing.v1.ListProjectBillingInfoRequest,
      com.google.cloud.billing.v1.ListProjectBillingInfoResponse> METHOD_LIST_PROJECT_BILLING_INFO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.billing.v1.CloudBilling", "ListProjectBillingInfo"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.billing.v1.ListProjectBillingInfoRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.billing.v1.ListProjectBillingInfoResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.billing.v1.GetProjectBillingInfoRequest,
      com.google.cloud.billing.v1.ProjectBillingInfo> METHOD_GET_PROJECT_BILLING_INFO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.billing.v1.CloudBilling", "GetProjectBillingInfo"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.billing.v1.GetProjectBillingInfoRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.billing.v1.ProjectBillingInfo.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest,
      com.google.cloud.billing.v1.ProjectBillingInfo> METHOD_UPDATE_PROJECT_BILLING_INFO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.billing.v1.CloudBilling", "UpdateProjectBillingInfo"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.billing.v1.ProjectBillingInfo.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CloudBillingStub newStub(io.grpc.Channel channel) {
    return new CloudBillingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CloudBillingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CloudBillingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static CloudBillingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CloudBillingFutureStub(channel);
  }

  /**
   * <pre>
   * Retrieves Google Cloud Console billing accounts and associates them with
   * projects.
   * </pre>
   */
  public static abstract class CloudBillingImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Gets information about a billing account. The current authenticated user
     * must be an [owner of the billing
     * account](https://support.google.com/cloud/answer/4430947).
     * </pre>
     */
    public void getBillingAccount(com.google.cloud.billing.v1.GetBillingAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.BillingAccount> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BILLING_ACCOUNT, responseObserver);
    }

    /**
     * <pre>
     * Lists the billing accounts that the current authenticated user
     * [owns](https://support.google.com/cloud/answer/4430947).
     * </pre>
     */
    public void listBillingAccounts(com.google.cloud.billing.v1.ListBillingAccountsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ListBillingAccountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_BILLING_ACCOUNTS, responseObserver);
    }

    /**
     * <pre>
     * Lists the projects associated with a billing account. The current
     * authenticated user must be an [owner of the billing
     * account](https://support.google.com/cloud/answer/4430947).
     * </pre>
     */
    public void listProjectBillingInfo(com.google.cloud.billing.v1.ListProjectBillingInfoRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ListProjectBillingInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_PROJECT_BILLING_INFO, responseObserver);
    }

    /**
     * <pre>
     * Gets the billing information for a project. The current authenticated user
     * must have [permission to view the
     * project](https://cloud.google.com/docs/permissions-overview#h.bgs0oxofvnoo
     * ).
     * </pre>
     */
    public void getProjectBillingInfo(com.google.cloud.billing.v1.GetProjectBillingInfoRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ProjectBillingInfo> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PROJECT_BILLING_INFO, responseObserver);
    }

    /**
     * <pre>
     * Sets or updates the billing account associated with a project. You specify
     * the new billing account by setting the `billing_account_name` in the
     * `ProjectBillingInfo` resource to the resource name of a billing account.
     * Associating a project with an open billing account enables billing on the
     * project and allows charges for resource usage. If the project already had a
     * billing account, this method changes the billing account used for resource
     * usage charges.
     * *Note:* Incurred charges that have not yet been reported in the transaction
     * history of the Google Cloud Console may be billed to the new billing
     * account, even if the charge occurred before the new billing account was
     * assigned to the project.
     * The current authenticated user must have ownership privileges for both the
     * [project](https://cloud.google.com/docs/permissions-overview#h.bgs0oxofvnoo
     * ) and the [billing
     * account](https://support.google.com/cloud/answer/4430947).
     * You can disable billing on the project by setting the
     * `billing_account_name` field to empty. This action disassociates the
     * current billing account from the project. Any billable activity of your
     * in-use services will stop, and your application could stop functioning as
     * expected. Any unbilled charges to date will be billed to the previously
     * associated account. The current authenticated user must be either an owner
     * of the project or an owner of the billing account for the project.
     * Note that associating a project with a *closed* billing account will have
     * much the same effect as disabling billing on the project: any paid
     * resources used by the project will be shut down. Thus, unless you wish to
     * disable billing, you should always call this method with the name of an
     * *open* billing account.
     * </pre>
     */
    public void updateProjectBillingInfo(com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ProjectBillingInfo> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PROJECT_BILLING_INFO, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_BILLING_ACCOUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.billing.v1.GetBillingAccountRequest,
                com.google.cloud.billing.v1.BillingAccount>(
                  this, METHODID_GET_BILLING_ACCOUNT)))
          .addMethod(
            METHOD_LIST_BILLING_ACCOUNTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.billing.v1.ListBillingAccountsRequest,
                com.google.cloud.billing.v1.ListBillingAccountsResponse>(
                  this, METHODID_LIST_BILLING_ACCOUNTS)))
          .addMethod(
            METHOD_LIST_PROJECT_BILLING_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.billing.v1.ListProjectBillingInfoRequest,
                com.google.cloud.billing.v1.ListProjectBillingInfoResponse>(
                  this, METHODID_LIST_PROJECT_BILLING_INFO)))
          .addMethod(
            METHOD_GET_PROJECT_BILLING_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.billing.v1.GetProjectBillingInfoRequest,
                com.google.cloud.billing.v1.ProjectBillingInfo>(
                  this, METHODID_GET_PROJECT_BILLING_INFO)))
          .addMethod(
            METHOD_UPDATE_PROJECT_BILLING_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest,
                com.google.cloud.billing.v1.ProjectBillingInfo>(
                  this, METHODID_UPDATE_PROJECT_BILLING_INFO)))
          .build();
    }
  }

  /**
   * <pre>
   * Retrieves Google Cloud Console billing accounts and associates them with
   * projects.
   * </pre>
   */
  public static final class CloudBillingStub extends io.grpc.stub.AbstractStub<CloudBillingStub> {
    private CloudBillingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CloudBillingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudBillingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CloudBillingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets information about a billing account. The current authenticated user
     * must be an [owner of the billing
     * account](https://support.google.com/cloud/answer/4430947).
     * </pre>
     */
    public void getBillingAccount(com.google.cloud.billing.v1.GetBillingAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.BillingAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BILLING_ACCOUNT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the billing accounts that the current authenticated user
     * [owns](https://support.google.com/cloud/answer/4430947).
     * </pre>
     */
    public void listBillingAccounts(com.google.cloud.billing.v1.ListBillingAccountsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ListBillingAccountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_BILLING_ACCOUNTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the projects associated with a billing account. The current
     * authenticated user must be an [owner of the billing
     * account](https://support.google.com/cloud/answer/4430947).
     * </pre>
     */
    public void listProjectBillingInfo(com.google.cloud.billing.v1.ListProjectBillingInfoRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ListProjectBillingInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_PROJECT_BILLING_INFO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the billing information for a project. The current authenticated user
     * must have [permission to view the
     * project](https://cloud.google.com/docs/permissions-overview#h.bgs0oxofvnoo
     * ).
     * </pre>
     */
    public void getProjectBillingInfo(com.google.cloud.billing.v1.GetProjectBillingInfoRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ProjectBillingInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PROJECT_BILLING_INFO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets or updates the billing account associated with a project. You specify
     * the new billing account by setting the `billing_account_name` in the
     * `ProjectBillingInfo` resource to the resource name of a billing account.
     * Associating a project with an open billing account enables billing on the
     * project and allows charges for resource usage. If the project already had a
     * billing account, this method changes the billing account used for resource
     * usage charges.
     * *Note:* Incurred charges that have not yet been reported in the transaction
     * history of the Google Cloud Console may be billed to the new billing
     * account, even if the charge occurred before the new billing account was
     * assigned to the project.
     * The current authenticated user must have ownership privileges for both the
     * [project](https://cloud.google.com/docs/permissions-overview#h.bgs0oxofvnoo
     * ) and the [billing
     * account](https://support.google.com/cloud/answer/4430947).
     * You can disable billing on the project by setting the
     * `billing_account_name` field to empty. This action disassociates the
     * current billing account from the project. Any billable activity of your
     * in-use services will stop, and your application could stop functioning as
     * expected. Any unbilled charges to date will be billed to the previously
     * associated account. The current authenticated user must be either an owner
     * of the project or an owner of the billing account for the project.
     * Note that associating a project with a *closed* billing account will have
     * much the same effect as disabling billing on the project: any paid
     * resources used by the project will be shut down. Thus, unless you wish to
     * disable billing, you should always call this method with the name of an
     * *open* billing account.
     * </pre>
     */
    public void updateProjectBillingInfo(com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ProjectBillingInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PROJECT_BILLING_INFO, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Retrieves Google Cloud Console billing accounts and associates them with
   * projects.
   * </pre>
   */
  public static final class CloudBillingBlockingStub extends io.grpc.stub.AbstractStub<CloudBillingBlockingStub> {
    private CloudBillingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CloudBillingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudBillingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CloudBillingBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets information about a billing account. The current authenticated user
     * must be an [owner of the billing
     * account](https://support.google.com/cloud/answer/4430947).
     * </pre>
     */
    public com.google.cloud.billing.v1.BillingAccount getBillingAccount(com.google.cloud.billing.v1.GetBillingAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BILLING_ACCOUNT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the billing accounts that the current authenticated user
     * [owns](https://support.google.com/cloud/answer/4430947).
     * </pre>
     */
    public com.google.cloud.billing.v1.ListBillingAccountsResponse listBillingAccounts(com.google.cloud.billing.v1.ListBillingAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_BILLING_ACCOUNTS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the projects associated with a billing account. The current
     * authenticated user must be an [owner of the billing
     * account](https://support.google.com/cloud/answer/4430947).
     * </pre>
     */
    public com.google.cloud.billing.v1.ListProjectBillingInfoResponse listProjectBillingInfo(com.google.cloud.billing.v1.ListProjectBillingInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_PROJECT_BILLING_INFO, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the billing information for a project. The current authenticated user
     * must have [permission to view the
     * project](https://cloud.google.com/docs/permissions-overview#h.bgs0oxofvnoo
     * ).
     * </pre>
     */
    public com.google.cloud.billing.v1.ProjectBillingInfo getProjectBillingInfo(com.google.cloud.billing.v1.GetProjectBillingInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PROJECT_BILLING_INFO, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets or updates the billing account associated with a project. You specify
     * the new billing account by setting the `billing_account_name` in the
     * `ProjectBillingInfo` resource to the resource name of a billing account.
     * Associating a project with an open billing account enables billing on the
     * project and allows charges for resource usage. If the project already had a
     * billing account, this method changes the billing account used for resource
     * usage charges.
     * *Note:* Incurred charges that have not yet been reported in the transaction
     * history of the Google Cloud Console may be billed to the new billing
     * account, even if the charge occurred before the new billing account was
     * assigned to the project.
     * The current authenticated user must have ownership privileges for both the
     * [project](https://cloud.google.com/docs/permissions-overview#h.bgs0oxofvnoo
     * ) and the [billing
     * account](https://support.google.com/cloud/answer/4430947).
     * You can disable billing on the project by setting the
     * `billing_account_name` field to empty. This action disassociates the
     * current billing account from the project. Any billable activity of your
     * in-use services will stop, and your application could stop functioning as
     * expected. Any unbilled charges to date will be billed to the previously
     * associated account. The current authenticated user must be either an owner
     * of the project or an owner of the billing account for the project.
     * Note that associating a project with a *closed* billing account will have
     * much the same effect as disabling billing on the project: any paid
     * resources used by the project will be shut down. Thus, unless you wish to
     * disable billing, you should always call this method with the name of an
     * *open* billing account.
     * </pre>
     */
    public com.google.cloud.billing.v1.ProjectBillingInfo updateProjectBillingInfo(com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PROJECT_BILLING_INFO, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Retrieves Google Cloud Console billing accounts and associates them with
   * projects.
   * </pre>
   */
  public static final class CloudBillingFutureStub extends io.grpc.stub.AbstractStub<CloudBillingFutureStub> {
    private CloudBillingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CloudBillingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudBillingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CloudBillingFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets information about a billing account. The current authenticated user
     * must be an [owner of the billing
     * account](https://support.google.com/cloud/answer/4430947).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.billing.v1.BillingAccount> getBillingAccount(
        com.google.cloud.billing.v1.GetBillingAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BILLING_ACCOUNT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the billing accounts that the current authenticated user
     * [owns](https://support.google.com/cloud/answer/4430947).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.billing.v1.ListBillingAccountsResponse> listBillingAccounts(
        com.google.cloud.billing.v1.ListBillingAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_BILLING_ACCOUNTS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the projects associated with a billing account. The current
     * authenticated user must be an [owner of the billing
     * account](https://support.google.com/cloud/answer/4430947).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.billing.v1.ListProjectBillingInfoResponse> listProjectBillingInfo(
        com.google.cloud.billing.v1.ListProjectBillingInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_PROJECT_BILLING_INFO, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the billing information for a project. The current authenticated user
     * must have [permission to view the
     * project](https://cloud.google.com/docs/permissions-overview#h.bgs0oxofvnoo
     * ).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.billing.v1.ProjectBillingInfo> getProjectBillingInfo(
        com.google.cloud.billing.v1.GetProjectBillingInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PROJECT_BILLING_INFO, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets or updates the billing account associated with a project. You specify
     * the new billing account by setting the `billing_account_name` in the
     * `ProjectBillingInfo` resource to the resource name of a billing account.
     * Associating a project with an open billing account enables billing on the
     * project and allows charges for resource usage. If the project already had a
     * billing account, this method changes the billing account used for resource
     * usage charges.
     * *Note:* Incurred charges that have not yet been reported in the transaction
     * history of the Google Cloud Console may be billed to the new billing
     * account, even if the charge occurred before the new billing account was
     * assigned to the project.
     * The current authenticated user must have ownership privileges for both the
     * [project](https://cloud.google.com/docs/permissions-overview#h.bgs0oxofvnoo
     * ) and the [billing
     * account](https://support.google.com/cloud/answer/4430947).
     * You can disable billing on the project by setting the
     * `billing_account_name` field to empty. This action disassociates the
     * current billing account from the project. Any billable activity of your
     * in-use services will stop, and your application could stop functioning as
     * expected. Any unbilled charges to date will be billed to the previously
     * associated account. The current authenticated user must be either an owner
     * of the project or an owner of the billing account for the project.
     * Note that associating a project with a *closed* billing account will have
     * much the same effect as disabling billing on the project: any paid
     * resources used by the project will be shut down. Thus, unless you wish to
     * disable billing, you should always call this method with the name of an
     * *open* billing account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.billing.v1.ProjectBillingInfo> updateProjectBillingInfo(
        com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PROJECT_BILLING_INFO, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BILLING_ACCOUNT = 0;
  private static final int METHODID_LIST_BILLING_ACCOUNTS = 1;
  private static final int METHODID_LIST_PROJECT_BILLING_INFO = 2;
  private static final int METHODID_GET_PROJECT_BILLING_INFO = 3;
  private static final int METHODID_UPDATE_PROJECT_BILLING_INFO = 4;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CloudBillingImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(CloudBillingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BILLING_ACCOUNT:
          serviceImpl.getBillingAccount((com.google.cloud.billing.v1.GetBillingAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.BillingAccount>) responseObserver);
          break;
        case METHODID_LIST_BILLING_ACCOUNTS:
          serviceImpl.listBillingAccounts((com.google.cloud.billing.v1.ListBillingAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ListBillingAccountsResponse>) responseObserver);
          break;
        case METHODID_LIST_PROJECT_BILLING_INFO:
          serviceImpl.listProjectBillingInfo((com.google.cloud.billing.v1.ListProjectBillingInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ListProjectBillingInfoResponse>) responseObserver);
          break;
        case METHODID_GET_PROJECT_BILLING_INFO:
          serviceImpl.getProjectBillingInfo((com.google.cloud.billing.v1.GetProjectBillingInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ProjectBillingInfo>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT_BILLING_INFO:
          serviceImpl.updateProjectBillingInfo((com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.billing.v1.ProjectBillingInfo>) responseObserver);
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
        METHOD_GET_BILLING_ACCOUNT,
        METHOD_LIST_BILLING_ACCOUNTS,
        METHOD_LIST_PROJECT_BILLING_INFO,
        METHOD_GET_PROJECT_BILLING_INFO,
        METHOD_UPDATE_PROJECT_BILLING_INFO);
  }

}
