package com.google.iam.admin.v1;

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
 * Creates and manages service account objects.
 * Service account is an account that belongs to your project instead
 * of to an individual end user. It is used to authenticate calls
 * to a Google API.
 * To create a service account, specify the `project_id` and `account_id`
 * for the account.  The `account_id` is unique within the project, and used
 * to generate the service account email address and a stable
 * `unique_id`.
 * All other methods can identify accounts using the format
 * `projects/{project}/serviceAccounts/{account}`.
 * Using `-` as a wildcard for the project will infer the project from
 * the account. The `account` value can be the `email` address or the
 * `unique_id` of the service account.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/iam/admin/v1/iam.proto")
public class IAMGrpc {

  private IAMGrpc() {}

  public static final String SERVICE_NAME = "google.iam.admin.v1.IAM";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.admin.v1.ListServiceAccountsRequest,
      com.google.iam.admin.v1.ListServiceAccountsResponse> METHOD_LIST_SERVICE_ACCOUNTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.iam.admin.v1.IAM", "ListServiceAccounts"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.ListServiceAccountsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.ListServiceAccountsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.admin.v1.GetServiceAccountRequest,
      com.google.iam.admin.v1.ServiceAccount> METHOD_GET_SERVICE_ACCOUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.iam.admin.v1.IAM", "GetServiceAccount"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.GetServiceAccountRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.ServiceAccount.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.admin.v1.CreateServiceAccountRequest,
      com.google.iam.admin.v1.ServiceAccount> METHOD_CREATE_SERVICE_ACCOUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.iam.admin.v1.IAM", "CreateServiceAccount"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.CreateServiceAccountRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.ServiceAccount.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.admin.v1.ServiceAccount,
      com.google.iam.admin.v1.ServiceAccount> METHOD_UPDATE_SERVICE_ACCOUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.iam.admin.v1.IAM", "UpdateServiceAccount"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.ServiceAccount.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.ServiceAccount.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.admin.v1.DeleteServiceAccountRequest,
      com.google.protobuf.Empty> METHOD_DELETE_SERVICE_ACCOUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.iam.admin.v1.IAM", "DeleteServiceAccount"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.DeleteServiceAccountRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.admin.v1.ListServiceAccountKeysRequest,
      com.google.iam.admin.v1.ListServiceAccountKeysResponse> METHOD_LIST_SERVICE_ACCOUNT_KEYS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.iam.admin.v1.IAM", "ListServiceAccountKeys"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.ListServiceAccountKeysRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.ListServiceAccountKeysResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.admin.v1.GetServiceAccountKeyRequest,
      com.google.iam.admin.v1.ServiceAccountKey> METHOD_GET_SERVICE_ACCOUNT_KEY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.iam.admin.v1.IAM", "GetServiceAccountKey"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.GetServiceAccountKeyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.ServiceAccountKey.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.admin.v1.CreateServiceAccountKeyRequest,
      com.google.iam.admin.v1.ServiceAccountKey> METHOD_CREATE_SERVICE_ACCOUNT_KEY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.iam.admin.v1.IAM", "CreateServiceAccountKey"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.CreateServiceAccountKeyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.ServiceAccountKey.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.admin.v1.DeleteServiceAccountKeyRequest,
      com.google.protobuf.Empty> METHOD_DELETE_SERVICE_ACCOUNT_KEY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.iam.admin.v1.IAM", "DeleteServiceAccountKey"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.DeleteServiceAccountKeyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.admin.v1.SignBlobRequest,
      com.google.iam.admin.v1.SignBlobResponse> METHOD_SIGN_BLOB =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.iam.admin.v1.IAM", "SignBlob"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.SignBlobRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.SignBlobResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.v1.GetIamPolicyRequest,
      com.google.iam.v1.Policy> METHOD_GET_IAM_POLICY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.iam.admin.v1.IAM", "GetIamPolicy"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.GetIamPolicyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.Policy.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.v1.SetIamPolicyRequest,
      com.google.iam.v1.Policy> METHOD_SET_IAM_POLICY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.iam.admin.v1.IAM", "SetIamPolicy"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.SetIamPolicyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.Policy.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.v1.TestIamPermissionsRequest,
      com.google.iam.v1.TestIamPermissionsResponse> METHOD_TEST_IAM_PERMISSIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.iam.admin.v1.IAM", "TestIamPermissions"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.TestIamPermissionsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.TestIamPermissionsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.admin.v1.QueryGrantableRolesRequest,
      com.google.iam.admin.v1.QueryGrantableRolesResponse> METHOD_QUERY_GRANTABLE_ROLES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.iam.admin.v1.IAM", "QueryGrantableRoles"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.QueryGrantableRolesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.admin.v1.QueryGrantableRolesResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IAMStub newStub(io.grpc.Channel channel) {
    return new IAMStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IAMBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IAMBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static IAMFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IAMFutureStub(channel);
  }

  /**
   * <pre>
   * Creates and manages service account objects.
   * Service account is an account that belongs to your project instead
   * of to an individual end user. It is used to authenticate calls
   * to a Google API.
   * To create a service account, specify the `project_id` and `account_id`
   * for the account.  The `account_id` is unique within the project, and used
   * to generate the service account email address and a stable
   * `unique_id`.
   * All other methods can identify accounts using the format
   * `projects/{project}/serviceAccounts/{account}`.
   * Using `-` as a wildcard for the project will infer the project from
   * the account. The `account` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   */
  public static abstract class IAMImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists [ServiceAccounts][google.iam.admin.v1.ServiceAccount] for a project.
     * </pre>
     */
    public void listServiceAccounts(com.google.iam.admin.v1.ListServiceAccountsRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ListServiceAccountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_SERVICE_ACCOUNTS, responseObserver);
    }

    /**
     * <pre>
     * Gets a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public void getServiceAccount(com.google.iam.admin.v1.GetServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ServiceAccount> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SERVICE_ACCOUNT, responseObserver);
    }

    /**
     * <pre>
     * Creates a [ServiceAccount][google.iam.admin.v1.ServiceAccount]
     * and returns it.
     * </pre>
     */
    public void createServiceAccount(com.google.iam.admin.v1.CreateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ServiceAccount> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_SERVICE_ACCOUNT, responseObserver);
    }

    /**
     * <pre>
     * Updates a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * Currently, only the following fields are updatable:
     * `display_name` .
     * The `etag` is mandatory.
     * </pre>
     */
    public void updateServiceAccount(com.google.iam.admin.v1.ServiceAccount request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ServiceAccount> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_SERVICE_ACCOUNT, responseObserver);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public void deleteServiceAccount(com.google.iam.admin.v1.DeleteServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_SERVICE_ACCOUNT, responseObserver);
    }

    /**
     * <pre>
     * Lists [ServiceAccountKeys][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public void listServiceAccountKeys(com.google.iam.admin.v1.ListServiceAccountKeysRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ListServiceAccountKeysResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_SERVICE_ACCOUNT_KEYS, responseObserver);
    }

    /**
     * <pre>
     * Gets the [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * by key id.
     * </pre>
     */
    public void getServiceAccountKey(com.google.iam.admin.v1.GetServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ServiceAccountKey> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SERVICE_ACCOUNT_KEY, responseObserver);
    }

    /**
     * <pre>
     * Creates a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * and returns it.
     * </pre>
     */
    public void createServiceAccountKey(com.google.iam.admin.v1.CreateServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ServiceAccountKey> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_SERVICE_ACCOUNT_KEY, responseObserver);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public void deleteServiceAccountKey(com.google.iam.admin.v1.DeleteServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_SERVICE_ACCOUNT_KEY, responseObserver);
    }

    /**
     * <pre>
     * Signs a blob using a service account's system-managed private key.
     * </pre>
     */
    public void signBlob(com.google.iam.admin.v1.SignBlobRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.SignBlobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SIGN_BLOB, responseObserver);
    }

    /**
     * <pre>
     * Returns the IAM access control policy for a
     * [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public void getIamPolicy(com.google.iam.v1.GetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_IAM_POLICY, responseObserver);
    }

    /**
     * <pre>
     * Sets the IAM access control policy for a
     * [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public void setIamPolicy(com.google.iam.v1.SetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_IAM_POLICY, responseObserver);
    }

    /**
     * <pre>
     * Tests the specified permissions against the IAM access control policy
     * for a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public void testIamPermissions(com.google.iam.v1.TestIamPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.TestIamPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TEST_IAM_PERMISSIONS, responseObserver);
    }

    /**
     * <pre>
     * Queries roles that can be granted on a particular resource.
     * A role is grantable if it can be used as the role in a binding for a policy
     * for that resource.
     * </pre>
     */
    public void queryGrantableRoles(com.google.iam.admin.v1.QueryGrantableRolesRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.QueryGrantableRolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUERY_GRANTABLE_ROLES, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_SERVICE_ACCOUNTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.admin.v1.ListServiceAccountsRequest,
                com.google.iam.admin.v1.ListServiceAccountsResponse>(
                  this, METHODID_LIST_SERVICE_ACCOUNTS)))
          .addMethod(
            METHOD_GET_SERVICE_ACCOUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.admin.v1.GetServiceAccountRequest,
                com.google.iam.admin.v1.ServiceAccount>(
                  this, METHODID_GET_SERVICE_ACCOUNT)))
          .addMethod(
            METHOD_CREATE_SERVICE_ACCOUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.admin.v1.CreateServiceAccountRequest,
                com.google.iam.admin.v1.ServiceAccount>(
                  this, METHODID_CREATE_SERVICE_ACCOUNT)))
          .addMethod(
            METHOD_UPDATE_SERVICE_ACCOUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.admin.v1.ServiceAccount,
                com.google.iam.admin.v1.ServiceAccount>(
                  this, METHODID_UPDATE_SERVICE_ACCOUNT)))
          .addMethod(
            METHOD_DELETE_SERVICE_ACCOUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.admin.v1.DeleteServiceAccountRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SERVICE_ACCOUNT)))
          .addMethod(
            METHOD_LIST_SERVICE_ACCOUNT_KEYS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.admin.v1.ListServiceAccountKeysRequest,
                com.google.iam.admin.v1.ListServiceAccountKeysResponse>(
                  this, METHODID_LIST_SERVICE_ACCOUNT_KEYS)))
          .addMethod(
            METHOD_GET_SERVICE_ACCOUNT_KEY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.admin.v1.GetServiceAccountKeyRequest,
                com.google.iam.admin.v1.ServiceAccountKey>(
                  this, METHODID_GET_SERVICE_ACCOUNT_KEY)))
          .addMethod(
            METHOD_CREATE_SERVICE_ACCOUNT_KEY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.admin.v1.CreateServiceAccountKeyRequest,
                com.google.iam.admin.v1.ServiceAccountKey>(
                  this, METHODID_CREATE_SERVICE_ACCOUNT_KEY)))
          .addMethod(
            METHOD_DELETE_SERVICE_ACCOUNT_KEY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.admin.v1.DeleteServiceAccountKeyRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SERVICE_ACCOUNT_KEY)))
          .addMethod(
            METHOD_SIGN_BLOB,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.admin.v1.SignBlobRequest,
                com.google.iam.admin.v1.SignBlobResponse>(
                  this, METHODID_SIGN_BLOB)))
          .addMethod(
            METHOD_GET_IAM_POLICY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.v1.GetIamPolicyRequest,
                com.google.iam.v1.Policy>(
                  this, METHODID_GET_IAM_POLICY)))
          .addMethod(
            METHOD_SET_IAM_POLICY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.v1.SetIamPolicyRequest,
                com.google.iam.v1.Policy>(
                  this, METHODID_SET_IAM_POLICY)))
          .addMethod(
            METHOD_TEST_IAM_PERMISSIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.v1.TestIamPermissionsRequest,
                com.google.iam.v1.TestIamPermissionsResponse>(
                  this, METHODID_TEST_IAM_PERMISSIONS)))
          .addMethod(
            METHOD_QUERY_GRANTABLE_ROLES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.admin.v1.QueryGrantableRolesRequest,
                com.google.iam.admin.v1.QueryGrantableRolesResponse>(
                  this, METHODID_QUERY_GRANTABLE_ROLES)))
          .build();
    }
  }

  /**
   * <pre>
   * Creates and manages service account objects.
   * Service account is an account that belongs to your project instead
   * of to an individual end user. It is used to authenticate calls
   * to a Google API.
   * To create a service account, specify the `project_id` and `account_id`
   * for the account.  The `account_id` is unique within the project, and used
   * to generate the service account email address and a stable
   * `unique_id`.
   * All other methods can identify accounts using the format
   * `projects/{project}/serviceAccounts/{account}`.
   * Using `-` as a wildcard for the project will infer the project from
   * the account. The `account` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   */
  public static final class IAMStub extends io.grpc.stub.AbstractStub<IAMStub> {
    private IAMStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IAMStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IAMStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IAMStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists [ServiceAccounts][google.iam.admin.v1.ServiceAccount] for a project.
     * </pre>
     */
    public void listServiceAccounts(com.google.iam.admin.v1.ListServiceAccountsRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ListServiceAccountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_SERVICE_ACCOUNTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public void getServiceAccount(com.google.iam.admin.v1.GetServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ServiceAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SERVICE_ACCOUNT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a [ServiceAccount][google.iam.admin.v1.ServiceAccount]
     * and returns it.
     * </pre>
     */
    public void createServiceAccount(com.google.iam.admin.v1.CreateServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ServiceAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_SERVICE_ACCOUNT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * Currently, only the following fields are updatable:
     * `display_name` .
     * The `etag` is mandatory.
     * </pre>
     */
    public void updateServiceAccount(com.google.iam.admin.v1.ServiceAccount request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ServiceAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SERVICE_ACCOUNT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public void deleteServiceAccount(com.google.iam.admin.v1.DeleteServiceAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_SERVICE_ACCOUNT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists [ServiceAccountKeys][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public void listServiceAccountKeys(com.google.iam.admin.v1.ListServiceAccountKeysRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ListServiceAccountKeysResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_SERVICE_ACCOUNT_KEYS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * by key id.
     * </pre>
     */
    public void getServiceAccountKey(com.google.iam.admin.v1.GetServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ServiceAccountKey> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SERVICE_ACCOUNT_KEY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * and returns it.
     * </pre>
     */
    public void createServiceAccountKey(com.google.iam.admin.v1.CreateServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ServiceAccountKey> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_SERVICE_ACCOUNT_KEY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public void deleteServiceAccountKey(com.google.iam.admin.v1.DeleteServiceAccountKeyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_SERVICE_ACCOUNT_KEY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Signs a blob using a service account's system-managed private key.
     * </pre>
     */
    public void signBlob(com.google.iam.admin.v1.SignBlobRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.SignBlobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SIGN_BLOB, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the IAM access control policy for a
     * [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public void getIamPolicy(com.google.iam.v1.GetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_IAM_POLICY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the IAM access control policy for a
     * [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public void setIamPolicy(com.google.iam.v1.SetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_IAM_POLICY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Tests the specified permissions against the IAM access control policy
     * for a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public void testIamPermissions(com.google.iam.v1.TestIamPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.TestIamPermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TEST_IAM_PERMISSIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries roles that can be granted on a particular resource.
     * A role is grantable if it can be used as the role in a binding for a policy
     * for that resource.
     * </pre>
     */
    public void queryGrantableRoles(com.google.iam.admin.v1.QueryGrantableRolesRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.admin.v1.QueryGrantableRolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUERY_GRANTABLE_ROLES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Creates and manages service account objects.
   * Service account is an account that belongs to your project instead
   * of to an individual end user. It is used to authenticate calls
   * to a Google API.
   * To create a service account, specify the `project_id` and `account_id`
   * for the account.  The `account_id` is unique within the project, and used
   * to generate the service account email address and a stable
   * `unique_id`.
   * All other methods can identify accounts using the format
   * `projects/{project}/serviceAccounts/{account}`.
   * Using `-` as a wildcard for the project will infer the project from
   * the account. The `account` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   */
  public static final class IAMBlockingStub extends io.grpc.stub.AbstractStub<IAMBlockingStub> {
    private IAMBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IAMBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IAMBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IAMBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists [ServiceAccounts][google.iam.admin.v1.ServiceAccount] for a project.
     * </pre>
     */
    public com.google.iam.admin.v1.ListServiceAccountsResponse listServiceAccounts(com.google.iam.admin.v1.ListServiceAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_SERVICE_ACCOUNTS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public com.google.iam.admin.v1.ServiceAccount getServiceAccount(com.google.iam.admin.v1.GetServiceAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SERVICE_ACCOUNT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a [ServiceAccount][google.iam.admin.v1.ServiceAccount]
     * and returns it.
     * </pre>
     */
    public com.google.iam.admin.v1.ServiceAccount createServiceAccount(com.google.iam.admin.v1.CreateServiceAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_SERVICE_ACCOUNT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * Currently, only the following fields are updatable:
     * `display_name` .
     * The `etag` is mandatory.
     * </pre>
     */
    public com.google.iam.admin.v1.ServiceAccount updateServiceAccount(com.google.iam.admin.v1.ServiceAccount request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_SERVICE_ACCOUNT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public com.google.protobuf.Empty deleteServiceAccount(com.google.iam.admin.v1.DeleteServiceAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_SERVICE_ACCOUNT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists [ServiceAccountKeys][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public com.google.iam.admin.v1.ListServiceAccountKeysResponse listServiceAccountKeys(com.google.iam.admin.v1.ListServiceAccountKeysRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_SERVICE_ACCOUNT_KEYS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * by key id.
     * </pre>
     */
    public com.google.iam.admin.v1.ServiceAccountKey getServiceAccountKey(com.google.iam.admin.v1.GetServiceAccountKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SERVICE_ACCOUNT_KEY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * and returns it.
     * </pre>
     */
    public com.google.iam.admin.v1.ServiceAccountKey createServiceAccountKey(com.google.iam.admin.v1.CreateServiceAccountKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_SERVICE_ACCOUNT_KEY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public com.google.protobuf.Empty deleteServiceAccountKey(com.google.iam.admin.v1.DeleteServiceAccountKeyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_SERVICE_ACCOUNT_KEY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Signs a blob using a service account's system-managed private key.
     * </pre>
     */
    public com.google.iam.admin.v1.SignBlobResponse signBlob(com.google.iam.admin.v1.SignBlobRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SIGN_BLOB, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the IAM access control policy for a
     * [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public com.google.iam.v1.Policy getIamPolicy(com.google.iam.v1.GetIamPolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_IAM_POLICY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the IAM access control policy for a
     * [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public com.google.iam.v1.Policy setIamPolicy(com.google.iam.v1.SetIamPolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_IAM_POLICY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Tests the specified permissions against the IAM access control policy
     * for a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public com.google.iam.v1.TestIamPermissionsResponse testIamPermissions(com.google.iam.v1.TestIamPermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TEST_IAM_PERMISSIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries roles that can be granted on a particular resource.
     * A role is grantable if it can be used as the role in a binding for a policy
     * for that resource.
     * </pre>
     */
    public com.google.iam.admin.v1.QueryGrantableRolesResponse queryGrantableRoles(com.google.iam.admin.v1.QueryGrantableRolesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUERY_GRANTABLE_ROLES, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Creates and manages service account objects.
   * Service account is an account that belongs to your project instead
   * of to an individual end user. It is used to authenticate calls
   * to a Google API.
   * To create a service account, specify the `project_id` and `account_id`
   * for the account.  The `account_id` is unique within the project, and used
   * to generate the service account email address and a stable
   * `unique_id`.
   * All other methods can identify accounts using the format
   * `projects/{project}/serviceAccounts/{account}`.
   * Using `-` as a wildcard for the project will infer the project from
   * the account. The `account` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   */
  public static final class IAMFutureStub extends io.grpc.stub.AbstractStub<IAMFutureStub> {
    private IAMFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IAMFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IAMFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IAMFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists [ServiceAccounts][google.iam.admin.v1.ServiceAccount] for a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.admin.v1.ListServiceAccountsResponse> listServiceAccounts(
        com.google.iam.admin.v1.ListServiceAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_SERVICE_ACCOUNTS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.admin.v1.ServiceAccount> getServiceAccount(
        com.google.iam.admin.v1.GetServiceAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SERVICE_ACCOUNT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a [ServiceAccount][google.iam.admin.v1.ServiceAccount]
     * and returns it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.admin.v1.ServiceAccount> createServiceAccount(
        com.google.iam.admin.v1.CreateServiceAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_SERVICE_ACCOUNT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * Currently, only the following fields are updatable:
     * `display_name` .
     * The `etag` is mandatory.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.admin.v1.ServiceAccount> updateServiceAccount(
        com.google.iam.admin.v1.ServiceAccount request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SERVICE_ACCOUNT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteServiceAccount(
        com.google.iam.admin.v1.DeleteServiceAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_SERVICE_ACCOUNT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists [ServiceAccountKeys][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.admin.v1.ListServiceAccountKeysResponse> listServiceAccountKeys(
        com.google.iam.admin.v1.ListServiceAccountKeysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_SERVICE_ACCOUNT_KEYS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * by key id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.admin.v1.ServiceAccountKey> getServiceAccountKey(
        com.google.iam.admin.v1.GetServiceAccountKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SERVICE_ACCOUNT_KEY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey]
     * and returns it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.admin.v1.ServiceAccountKey> createServiceAccountKey(
        com.google.iam.admin.v1.CreateServiceAccountKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_SERVICE_ACCOUNT_KEY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a [ServiceAccountKey][google.iam.admin.v1.ServiceAccountKey].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteServiceAccountKey(
        com.google.iam.admin.v1.DeleteServiceAccountKeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_SERVICE_ACCOUNT_KEY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Signs a blob using a service account's system-managed private key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.admin.v1.SignBlobResponse> signBlob(
        com.google.iam.admin.v1.SignBlobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SIGN_BLOB, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the IAM access control policy for a
     * [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.v1.Policy> getIamPolicy(
        com.google.iam.v1.GetIamPolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_IAM_POLICY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the IAM access control policy for a
     * [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.v1.Policy> setIamPolicy(
        com.google.iam.v1.SetIamPolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_IAM_POLICY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Tests the specified permissions against the IAM access control policy
     * for a [ServiceAccount][google.iam.admin.v1.ServiceAccount].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.v1.TestIamPermissionsResponse> testIamPermissions(
        com.google.iam.v1.TestIamPermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TEST_IAM_PERMISSIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries roles that can be granted on a particular resource.
     * A role is grantable if it can be used as the role in a binding for a policy
     * for that resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.admin.v1.QueryGrantableRolesResponse> queryGrantableRoles(
        com.google.iam.admin.v1.QueryGrantableRolesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUERY_GRANTABLE_ROLES, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SERVICE_ACCOUNTS = 0;
  private static final int METHODID_GET_SERVICE_ACCOUNT = 1;
  private static final int METHODID_CREATE_SERVICE_ACCOUNT = 2;
  private static final int METHODID_UPDATE_SERVICE_ACCOUNT = 3;
  private static final int METHODID_DELETE_SERVICE_ACCOUNT = 4;
  private static final int METHODID_LIST_SERVICE_ACCOUNT_KEYS = 5;
  private static final int METHODID_GET_SERVICE_ACCOUNT_KEY = 6;
  private static final int METHODID_CREATE_SERVICE_ACCOUNT_KEY = 7;
  private static final int METHODID_DELETE_SERVICE_ACCOUNT_KEY = 8;
  private static final int METHODID_SIGN_BLOB = 9;
  private static final int METHODID_GET_IAM_POLICY = 10;
  private static final int METHODID_SET_IAM_POLICY = 11;
  private static final int METHODID_TEST_IAM_PERMISSIONS = 12;
  private static final int METHODID_QUERY_GRANTABLE_ROLES = 13;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IAMImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(IAMImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SERVICE_ACCOUNTS:
          serviceImpl.listServiceAccounts((com.google.iam.admin.v1.ListServiceAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ListServiceAccountsResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_ACCOUNT:
          serviceImpl.getServiceAccount((com.google.iam.admin.v1.GetServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ServiceAccount>) responseObserver);
          break;
        case METHODID_CREATE_SERVICE_ACCOUNT:
          serviceImpl.createServiceAccount((com.google.iam.admin.v1.CreateServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ServiceAccount>) responseObserver);
          break;
        case METHODID_UPDATE_SERVICE_ACCOUNT:
          serviceImpl.updateServiceAccount((com.google.iam.admin.v1.ServiceAccount) request,
              (io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ServiceAccount>) responseObserver);
          break;
        case METHODID_DELETE_SERVICE_ACCOUNT:
          serviceImpl.deleteServiceAccount((com.google.iam.admin.v1.DeleteServiceAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_SERVICE_ACCOUNT_KEYS:
          serviceImpl.listServiceAccountKeys((com.google.iam.admin.v1.ListServiceAccountKeysRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ListServiceAccountKeysResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_ACCOUNT_KEY:
          serviceImpl.getServiceAccountKey((com.google.iam.admin.v1.GetServiceAccountKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ServiceAccountKey>) responseObserver);
          break;
        case METHODID_CREATE_SERVICE_ACCOUNT_KEY:
          serviceImpl.createServiceAccountKey((com.google.iam.admin.v1.CreateServiceAccountKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.admin.v1.ServiceAccountKey>) responseObserver);
          break;
        case METHODID_DELETE_SERVICE_ACCOUNT_KEY:
          serviceImpl.deleteServiceAccountKey((com.google.iam.admin.v1.DeleteServiceAccountKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SIGN_BLOB:
          serviceImpl.signBlob((com.google.iam.admin.v1.SignBlobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.admin.v1.SignBlobResponse>) responseObserver);
          break;
        case METHODID_GET_IAM_POLICY:
          serviceImpl.getIamPolicy((com.google.iam.v1.GetIamPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.v1.Policy>) responseObserver);
          break;
        case METHODID_SET_IAM_POLICY:
          serviceImpl.setIamPolicy((com.google.iam.v1.SetIamPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.v1.Policy>) responseObserver);
          break;
        case METHODID_TEST_IAM_PERMISSIONS:
          serviceImpl.testIamPermissions((com.google.iam.v1.TestIamPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.v1.TestIamPermissionsResponse>) responseObserver);
          break;
        case METHODID_QUERY_GRANTABLE_ROLES:
          serviceImpl.queryGrantableRoles((com.google.iam.admin.v1.QueryGrantableRolesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.admin.v1.QueryGrantableRolesResponse>) responseObserver);
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
        METHOD_LIST_SERVICE_ACCOUNTS,
        METHOD_GET_SERVICE_ACCOUNT,
        METHOD_CREATE_SERVICE_ACCOUNT,
        METHOD_UPDATE_SERVICE_ACCOUNT,
        METHOD_DELETE_SERVICE_ACCOUNT,
        METHOD_LIST_SERVICE_ACCOUNT_KEYS,
        METHOD_GET_SERVICE_ACCOUNT_KEY,
        METHOD_CREATE_SERVICE_ACCOUNT_KEY,
        METHOD_DELETE_SERVICE_ACCOUNT_KEY,
        METHOD_SIGN_BLOB,
        METHOD_GET_IAM_POLICY,
        METHOD_SET_IAM_POLICY,
        METHOD_TEST_IAM_PERMISSIONS,
        METHOD_QUERY_GRANTABLE_ROLES);
  }

}
