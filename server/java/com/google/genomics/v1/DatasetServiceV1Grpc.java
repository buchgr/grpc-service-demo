package com.google.genomics.v1;

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
 * This service manages datasets, which are collections of genomic data.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/genomics/v1/datasets.proto")
public class DatasetServiceV1Grpc {

  private DatasetServiceV1Grpc() {}

  public static final String SERVICE_NAME = "google.genomics.v1.DatasetServiceV1";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.ListDatasetsRequest,
      com.google.genomics.v1.ListDatasetsResponse> METHOD_LIST_DATASETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.DatasetServiceV1", "ListDatasets"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.ListDatasetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.ListDatasetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.CreateDatasetRequest,
      com.google.genomics.v1.Dataset> METHOD_CREATE_DATASET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.DatasetServiceV1", "CreateDataset"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.CreateDatasetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.Dataset.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.GetDatasetRequest,
      com.google.genomics.v1.Dataset> METHOD_GET_DATASET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.DatasetServiceV1", "GetDataset"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.GetDatasetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.Dataset.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.UpdateDatasetRequest,
      com.google.genomics.v1.Dataset> METHOD_UPDATE_DATASET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.DatasetServiceV1", "UpdateDataset"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.UpdateDatasetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.Dataset.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.DeleteDatasetRequest,
      com.google.protobuf.Empty> METHOD_DELETE_DATASET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.DatasetServiceV1", "DeleteDataset"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.DeleteDatasetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.UndeleteDatasetRequest,
      com.google.genomics.v1.Dataset> METHOD_UNDELETE_DATASET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.DatasetServiceV1", "UndeleteDataset"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.UndeleteDatasetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.Dataset.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.v1.SetIamPolicyRequest,
      com.google.iam.v1.Policy> METHOD_SET_IAM_POLICY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.DatasetServiceV1", "SetIamPolicy"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.SetIamPolicyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.Policy.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.v1.GetIamPolicyRequest,
      com.google.iam.v1.Policy> METHOD_GET_IAM_POLICY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.DatasetServiceV1", "GetIamPolicy"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.GetIamPolicyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.Policy.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.iam.v1.TestIamPermissionsRequest,
      com.google.iam.v1.TestIamPermissionsResponse> METHOD_TEST_IAM_PERMISSIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.DatasetServiceV1", "TestIamPermissions"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.TestIamPermissionsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.iam.v1.TestIamPermissionsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatasetServiceV1Stub newStub(io.grpc.Channel channel) {
    return new DatasetServiceV1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatasetServiceV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DatasetServiceV1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static DatasetServiceV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DatasetServiceV1FutureStub(channel);
  }

  /**
   * <pre>
   * This service manages datasets, which are collections of genomic data.
   * </pre>
   */
  public static abstract class DatasetServiceV1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists datasets within a project.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void listDatasets(com.google.genomics.v1.ListDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.ListDatasetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_DATASETS, responseObserver);
    }

    /**
     * <pre>
     * Creates a new dataset.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void createDataset(com.google.genomics.v1.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Dataset> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_DATASET, responseObserver);
    }

    /**
     * <pre>
     * Gets a dataset by ID.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void getDataset(com.google.genomics.v1.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Dataset> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DATASET, responseObserver);
    }

    /**
     * <pre>
     * Updates a dataset.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This method supports patch semantics.
     * </pre>
     */
    public void updateDataset(com.google.genomics.v1.UpdateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Dataset> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_DATASET, responseObserver);
    }

    /**
     * <pre>
     * Deletes a dataset and all of its contents (all read group sets,
     * reference sets, variant sets, call sets, annotation sets, etc.)
     * This is reversible (up to one week after the deletion) via
     * the
     * [datasets.undelete][google.genomics.v1.DatasetServiceV1.UndeleteDataset]
     * operation.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void deleteDataset(com.google.genomics.v1.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_DATASET, responseObserver);
    }

    /**
     * <pre>
     * Undeletes a dataset by restoring a dataset which was deleted via this API.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This operation is only possible for a week after the deletion occurred.
     * </pre>
     */
    public void undeleteDataset(com.google.genomics.v1.UndeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Dataset> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UNDELETE_DATASET, responseObserver);
    }

    /**
     * <pre>
     * Sets the access control policy on the specified dataset. Replaces any
     * existing policy.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * See &lt;a href="/iam/docs/managing-policies#setting_a_policy"&gt;Setting a
     * Policy&lt;/a&gt; for more information.
     * </pre>
     */
    public void setIamPolicy(com.google.iam.v1.SetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_IAM_POLICY, responseObserver);
    }

    /**
     * <pre>
     * Gets the access control policy for the dataset. This is empty if the
     * policy or resource does not exist.
     * See &lt;a href="/iam/docs/managing-policies#getting_a_policy"&gt;Getting a
     * Policy&lt;/a&gt; for more information.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void getIamPolicy(com.google.iam.v1.GetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_IAM_POLICY, responseObserver);
    }

    /**
     * <pre>
     * Returns permissions that a caller has on the specified resource.
     * See &lt;a href="/iam/docs/managing-policies#testing_permissions"&gt;Testing
     * Permissions&lt;/a&gt; for more information.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void testIamPermissions(com.google.iam.v1.TestIamPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.TestIamPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TEST_IAM_PERMISSIONS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_DATASETS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.ListDatasetsRequest,
                com.google.genomics.v1.ListDatasetsResponse>(
                  this, METHODID_LIST_DATASETS)))
          .addMethod(
            METHOD_CREATE_DATASET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.CreateDatasetRequest,
                com.google.genomics.v1.Dataset>(
                  this, METHODID_CREATE_DATASET)))
          .addMethod(
            METHOD_GET_DATASET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.GetDatasetRequest,
                com.google.genomics.v1.Dataset>(
                  this, METHODID_GET_DATASET)))
          .addMethod(
            METHOD_UPDATE_DATASET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.UpdateDatasetRequest,
                com.google.genomics.v1.Dataset>(
                  this, METHODID_UPDATE_DATASET)))
          .addMethod(
            METHOD_DELETE_DATASET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.DeleteDatasetRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_DATASET)))
          .addMethod(
            METHOD_UNDELETE_DATASET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.UndeleteDatasetRequest,
                com.google.genomics.v1.Dataset>(
                  this, METHODID_UNDELETE_DATASET)))
          .addMethod(
            METHOD_SET_IAM_POLICY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.v1.SetIamPolicyRequest,
                com.google.iam.v1.Policy>(
                  this, METHODID_SET_IAM_POLICY)))
          .addMethod(
            METHOD_GET_IAM_POLICY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.v1.GetIamPolicyRequest,
                com.google.iam.v1.Policy>(
                  this, METHODID_GET_IAM_POLICY)))
          .addMethod(
            METHOD_TEST_IAM_PERMISSIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.iam.v1.TestIamPermissionsRequest,
                com.google.iam.v1.TestIamPermissionsResponse>(
                  this, METHODID_TEST_IAM_PERMISSIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * This service manages datasets, which are collections of genomic data.
   * </pre>
   */
  public static final class DatasetServiceV1Stub extends io.grpc.stub.AbstractStub<DatasetServiceV1Stub> {
    private DatasetServiceV1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatasetServiceV1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceV1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatasetServiceV1Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists datasets within a project.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void listDatasets(com.google.genomics.v1.ListDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.ListDatasetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_DATASETS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new dataset.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void createDataset(com.google.genomics.v1.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Dataset> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_DATASET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a dataset by ID.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void getDataset(com.google.genomics.v1.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Dataset> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DATASET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a dataset.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This method supports patch semantics.
     * </pre>
     */
    public void updateDataset(com.google.genomics.v1.UpdateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Dataset> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_DATASET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a dataset and all of its contents (all read group sets,
     * reference sets, variant sets, call sets, annotation sets, etc.)
     * This is reversible (up to one week after the deletion) via
     * the
     * [datasets.undelete][google.genomics.v1.DatasetServiceV1.UndeleteDataset]
     * operation.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void deleteDataset(com.google.genomics.v1.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_DATASET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Undeletes a dataset by restoring a dataset which was deleted via this API.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This operation is only possible for a week after the deletion occurred.
     * </pre>
     */
    public void undeleteDataset(com.google.genomics.v1.UndeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Dataset> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UNDELETE_DATASET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the access control policy on the specified dataset. Replaces any
     * existing policy.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * See &lt;a href="/iam/docs/managing-policies#setting_a_policy"&gt;Setting a
     * Policy&lt;/a&gt; for more information.
     * </pre>
     */
    public void setIamPolicy(com.google.iam.v1.SetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_IAM_POLICY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the access control policy for the dataset. This is empty if the
     * policy or resource does not exist.
     * See &lt;a href="/iam/docs/managing-policies#getting_a_policy"&gt;Getting a
     * Policy&lt;/a&gt; for more information.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void getIamPolicy(com.google.iam.v1.GetIamPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.Policy> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_IAM_POLICY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns permissions that a caller has on the specified resource.
     * See &lt;a href="/iam/docs/managing-policies#testing_permissions"&gt;Testing
     * Permissions&lt;/a&gt; for more information.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void testIamPermissions(com.google.iam.v1.TestIamPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.google.iam.v1.TestIamPermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TEST_IAM_PERMISSIONS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * This service manages datasets, which are collections of genomic data.
   * </pre>
   */
  public static final class DatasetServiceV1BlockingStub extends io.grpc.stub.AbstractStub<DatasetServiceV1BlockingStub> {
    private DatasetServiceV1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatasetServiceV1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceV1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatasetServiceV1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists datasets within a project.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.genomics.v1.ListDatasetsResponse listDatasets(com.google.genomics.v1.ListDatasetsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_DATASETS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new dataset.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.genomics.v1.Dataset createDataset(com.google.genomics.v1.CreateDatasetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_DATASET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a dataset by ID.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.genomics.v1.Dataset getDataset(com.google.genomics.v1.GetDatasetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DATASET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a dataset.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This method supports patch semantics.
     * </pre>
     */
    public com.google.genomics.v1.Dataset updateDataset(com.google.genomics.v1.UpdateDatasetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_DATASET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a dataset and all of its contents (all read group sets,
     * reference sets, variant sets, call sets, annotation sets, etc.)
     * This is reversible (up to one week after the deletion) via
     * the
     * [datasets.undelete][google.genomics.v1.DatasetServiceV1.UndeleteDataset]
     * operation.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.protobuf.Empty deleteDataset(com.google.genomics.v1.DeleteDatasetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_DATASET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Undeletes a dataset by restoring a dataset which was deleted via this API.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This operation is only possible for a week after the deletion occurred.
     * </pre>
     */
    public com.google.genomics.v1.Dataset undeleteDataset(com.google.genomics.v1.UndeleteDatasetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UNDELETE_DATASET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the access control policy on the specified dataset. Replaces any
     * existing policy.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * See &lt;a href="/iam/docs/managing-policies#setting_a_policy"&gt;Setting a
     * Policy&lt;/a&gt; for more information.
     * </pre>
     */
    public com.google.iam.v1.Policy setIamPolicy(com.google.iam.v1.SetIamPolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_IAM_POLICY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the access control policy for the dataset. This is empty if the
     * policy or resource does not exist.
     * See &lt;a href="/iam/docs/managing-policies#getting_a_policy"&gt;Getting a
     * Policy&lt;/a&gt; for more information.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.iam.v1.Policy getIamPolicy(com.google.iam.v1.GetIamPolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_IAM_POLICY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns permissions that a caller has on the specified resource.
     * See &lt;a href="/iam/docs/managing-policies#testing_permissions"&gt;Testing
     * Permissions&lt;/a&gt; for more information.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.iam.v1.TestIamPermissionsResponse testIamPermissions(com.google.iam.v1.TestIamPermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TEST_IAM_PERMISSIONS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * This service manages datasets, which are collections of genomic data.
   * </pre>
   */
  public static final class DatasetServiceV1FutureStub extends io.grpc.stub.AbstractStub<DatasetServiceV1FutureStub> {
    private DatasetServiceV1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatasetServiceV1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatasetServiceV1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatasetServiceV1FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists datasets within a project.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.ListDatasetsResponse> listDatasets(
        com.google.genomics.v1.ListDatasetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_DATASETS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new dataset.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.Dataset> createDataset(
        com.google.genomics.v1.CreateDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_DATASET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a dataset by ID.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.Dataset> getDataset(
        com.google.genomics.v1.GetDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DATASET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a dataset.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This method supports patch semantics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.Dataset> updateDataset(
        com.google.genomics.v1.UpdateDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_DATASET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a dataset and all of its contents (all read group sets,
     * reference sets, variant sets, call sets, annotation sets, etc.)
     * This is reversible (up to one week after the deletion) via
     * the
     * [datasets.undelete][google.genomics.v1.DatasetServiceV1.UndeleteDataset]
     * operation.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDataset(
        com.google.genomics.v1.DeleteDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_DATASET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Undeletes a dataset by restoring a dataset which was deleted via this API.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This operation is only possible for a week after the deletion occurred.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.Dataset> undeleteDataset(
        com.google.genomics.v1.UndeleteDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UNDELETE_DATASET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the access control policy on the specified dataset. Replaces any
     * existing policy.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * See &lt;a href="/iam/docs/managing-policies#setting_a_policy"&gt;Setting a
     * Policy&lt;/a&gt; for more information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.v1.Policy> setIamPolicy(
        com.google.iam.v1.SetIamPolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_IAM_POLICY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the access control policy for the dataset. This is empty if the
     * policy or resource does not exist.
     * See &lt;a href="/iam/docs/managing-policies#getting_a_policy"&gt;Getting a
     * Policy&lt;/a&gt; for more information.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.v1.Policy> getIamPolicy(
        com.google.iam.v1.GetIamPolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_IAM_POLICY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns permissions that a caller has on the specified resource.
     * See &lt;a href="/iam/docs/managing-policies#testing_permissions"&gt;Testing
     * Permissions&lt;/a&gt; for more information.
     * For the definitions of datasets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.iam.v1.TestIamPermissionsResponse> testIamPermissions(
        com.google.iam.v1.TestIamPermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TEST_IAM_PERMISSIONS, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_DATASETS = 0;
  private static final int METHODID_CREATE_DATASET = 1;
  private static final int METHODID_GET_DATASET = 2;
  private static final int METHODID_UPDATE_DATASET = 3;
  private static final int METHODID_DELETE_DATASET = 4;
  private static final int METHODID_UNDELETE_DATASET = 5;
  private static final int METHODID_SET_IAM_POLICY = 6;
  private static final int METHODID_GET_IAM_POLICY = 7;
  private static final int METHODID_TEST_IAM_PERMISSIONS = 8;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DatasetServiceV1ImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(DatasetServiceV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_DATASETS:
          serviceImpl.listDatasets((com.google.genomics.v1.ListDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.ListDatasetsResponse>) responseObserver);
          break;
        case METHODID_CREATE_DATASET:
          serviceImpl.createDataset((com.google.genomics.v1.CreateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.Dataset>) responseObserver);
          break;
        case METHODID_GET_DATASET:
          serviceImpl.getDataset((com.google.genomics.v1.GetDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.Dataset>) responseObserver);
          break;
        case METHODID_UPDATE_DATASET:
          serviceImpl.updateDataset((com.google.genomics.v1.UpdateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.Dataset>) responseObserver);
          break;
        case METHODID_DELETE_DATASET:
          serviceImpl.deleteDataset((com.google.genomics.v1.DeleteDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UNDELETE_DATASET:
          serviceImpl.undeleteDataset((com.google.genomics.v1.UndeleteDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.Dataset>) responseObserver);
          break;
        case METHODID_SET_IAM_POLICY:
          serviceImpl.setIamPolicy((com.google.iam.v1.SetIamPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.v1.Policy>) responseObserver);
          break;
        case METHODID_GET_IAM_POLICY:
          serviceImpl.getIamPolicy((com.google.iam.v1.GetIamPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.v1.Policy>) responseObserver);
          break;
        case METHODID_TEST_IAM_PERMISSIONS:
          serviceImpl.testIamPermissions((com.google.iam.v1.TestIamPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.iam.v1.TestIamPermissionsResponse>) responseObserver);
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
        METHOD_LIST_DATASETS,
        METHOD_CREATE_DATASET,
        METHOD_GET_DATASET,
        METHOD_UPDATE_DATASET,
        METHOD_DELETE_DATASET,
        METHOD_UNDELETE_DATASET,
        METHOD_SET_IAM_POLICY,
        METHOD_GET_IAM_POLICY,
        METHOD_TEST_IAM_PERMISSIONS);
  }

}
