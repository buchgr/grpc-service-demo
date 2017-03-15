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
 * Provides methods that create and manage machine learning models and their
 * versions.
 * A model in this context is a container for versions. The model can't provide
 * predictions without first having a version created for it.
 * Each version is a trained machine learning model, and each is assumed to be
 * an iteration of the same machine learning problem as the other versions of
 * the same model.
 * Your project can define multiple models, each with multiple versions.
 * The basic life cycle of a model is:
 * *   Create and train the machine learning model and save it to a
 *     Google Cloud Storage location.
 * *   Use
 *     [projects.models.create](/ml/reference/rest/v1beta1/projects.models/create)
 *     to make a new model in your project.
 * *   Use
 *     [projects.models.versions.create](/ml/reference/rest/v1beta1/projects.models.versions/create)
 *     to deploy your saved model.
 * *   Use [projects.predict](/ml/reference/rest/v1beta1/projects/predict to
 *     request predictions of a version of your model, or use
 *     [projects.jobs.create](/ml/reference/rest/v1beta1/projects.jobs/create)
 *     to start a batch prediction job.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/cloud/ml/v1beta1/model_service.proto")
public class ModelServiceGrpc {

  private ModelServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.ml.v1beta1.ModelService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.ml.api.v1beta1.CreateModelRequest,
      com.google.cloud.ml.api.v1beta1.Model> METHOD_CREATE_MODEL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.ml.v1beta1.ModelService", "CreateModel"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.CreateModelRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.Model.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.ml.api.v1beta1.ListModelsRequest,
      com.google.cloud.ml.api.v1beta1.ListModelsResponse> METHOD_LIST_MODELS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.ml.v1beta1.ModelService", "ListModels"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.ListModelsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.ListModelsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.ml.api.v1beta1.GetModelRequest,
      com.google.cloud.ml.api.v1beta1.Model> METHOD_GET_MODEL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.ml.v1beta1.ModelService", "GetModel"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.GetModelRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.Model.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.ml.api.v1beta1.DeleteModelRequest,
      com.google.longrunning.Operation> METHOD_DELETE_MODEL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.ml.v1beta1.ModelService", "DeleteModel"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.DeleteModelRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.ml.api.v1beta1.CreateVersionRequest,
      com.google.longrunning.Operation> METHOD_CREATE_VERSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.ml.v1beta1.ModelService", "CreateVersion"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.CreateVersionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.ml.api.v1beta1.ListVersionsRequest,
      com.google.cloud.ml.api.v1beta1.ListVersionsResponse> METHOD_LIST_VERSIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.ml.v1beta1.ModelService", "ListVersions"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.ListVersionsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.ListVersionsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.ml.api.v1beta1.GetVersionRequest,
      com.google.cloud.ml.api.v1beta1.Version> METHOD_GET_VERSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.ml.v1beta1.ModelService", "GetVersion"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.GetVersionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.Version.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.ml.api.v1beta1.DeleteVersionRequest,
      com.google.longrunning.Operation> METHOD_DELETE_VERSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.ml.v1beta1.ModelService", "DeleteVersion"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.DeleteVersionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.ml.api.v1beta1.SetDefaultVersionRequest,
      com.google.cloud.ml.api.v1beta1.Version> METHOD_SET_DEFAULT_VERSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.ml.v1beta1.ModelService", "SetDefaultVersion"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.SetDefaultVersionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.ml.api.v1beta1.Version.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ModelServiceStub newStub(io.grpc.Channel channel) {
    return new ModelServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ModelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ModelServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ModelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ModelServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Provides methods that create and manage machine learning models and their
   * versions.
   * A model in this context is a container for versions. The model can't provide
   * predictions without first having a version created for it.
   * Each version is a trained machine learning model, and each is assumed to be
   * an iteration of the same machine learning problem as the other versions of
   * the same model.
   * Your project can define multiple models, each with multiple versions.
   * The basic life cycle of a model is:
   * *   Create and train the machine learning model and save it to a
   *     Google Cloud Storage location.
   * *   Use
   *     [projects.models.create](/ml/reference/rest/v1beta1/projects.models/create)
   *     to make a new model in your project.
   * *   Use
   *     [projects.models.versions.create](/ml/reference/rest/v1beta1/projects.models.versions/create)
   *     to deploy your saved model.
   * *   Use [projects.predict](/ml/reference/rest/v1beta1/projects/predict to
   *     request predictions of a version of your model, or use
   *     [projects.jobs.create](/ml/reference/rest/v1beta1/projects.jobs/create)
   *     to start a batch prediction job.
   * </pre>
   */
  public static abstract class ModelServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a model which will later contain one or more versions.
     * You must add at least one version before you can request predictions from
     * the model. Add versions by calling
     * [projects.models.versions.create](/ml/reference/rest/v1beta1/projects.models.versions/create).
     * </pre>
     */
    public void createModel(com.google.cloud.ml.api.v1beta1.CreateModelRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.Model> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_MODEL, responseObserver);
    }

    /**
     * <pre>
     * Lists the models in a project.
     * Each project can contain multiple models, and each model can have multiple
     * versions.
     * </pre>
     */
    public void listModels(com.google.cloud.ml.api.v1beta1.ListModelsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.ListModelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_MODELS, responseObserver);
    }

    /**
     * <pre>
     * Gets information about a model, including its name, the description (if
     * set), and the default version (if at least one version of the model has
     * been deployed).
     * </pre>
     */
    public void getModel(com.google.cloud.ml.api.v1beta1.GetModelRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.Model> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MODEL, responseObserver);
    }

    /**
     * <pre>
     * Deletes a model.
     * You can only delete a model if there are no versions in it. You can delete
     * versions by calling
     * [projects.models.versions.delete](/ml/reference/rest/v1beta1/projects.models.versions/delete).
     * </pre>
     */
    public void deleteModel(com.google.cloud.ml.api.v1beta1.DeleteModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_MODEL, responseObserver);
    }

    /**
     * <pre>
     * Creates a new version of a model from a trained TensorFlow model.
     * If the version created in the cloud by this call is the first deployed
     * version of the specified model, it will be made the default version of the
     * model. When you add a version to a model that already has one or more
     * versions, the default version does not automatically change. If you want a
     * new version to be the default, you must call
     * [projects.models.versions.setDefault](/ml/reference/rest/v1beta1/projects.models.versions/setDefault).
     * </pre>
     */
    public void createVersion(com.google.cloud.ml.api.v1beta1.CreateVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_VERSION, responseObserver);
    }

    /**
     * <pre>
     * Gets basic information about all the versions of a model.
     * If you expect that a model has a lot of versions, or if you need to handle
     * only a limited number of results at a time, you can request that the list
     * be retrieved in batches (called pages):
     * </pre>
     */
    public void listVersions(com.google.cloud.ml.api.v1beta1.ListVersionsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.ListVersionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_VERSIONS, responseObserver);
    }

    /**
     * <pre>
     * Gets information about a model version.
     * Models can have multiple versions. You can call
     * [projects.models.versions.list](/ml/reference/rest/v1beta1/projects.models.versions/list)
     * to get the same information that this method returns for all of the
     * versions of a model.
     * </pre>
     */
    public void getVersion(com.google.cloud.ml.api.v1beta1.GetVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.Version> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_VERSION, responseObserver);
    }

    /**
     * <pre>
     * Deletes a model version.
     * Each model can have multiple versions deployed and in use at any given
     * time. Use this method to remove a single version.
     * Note: You cannot delete the version that is set as the default version
     * of the model unless it is the only remaining version.
     * </pre>
     */
    public void deleteVersion(com.google.cloud.ml.api.v1beta1.DeleteVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_VERSION, responseObserver);
    }

    /**
     * <pre>
     * Designates a version to be the default for the model.
     * The default version is used for prediction requests made against the model
     * that don't specify a version.
     * The first version to be created for a model is automatically set as the
     * default. You must make any subsequent changes to the default version
     * setting manually using this method.
     * </pre>
     */
    public void setDefaultVersion(com.google.cloud.ml.api.v1beta1.SetDefaultVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.Version> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_DEFAULT_VERSION, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_MODEL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.ml.api.v1beta1.CreateModelRequest,
                com.google.cloud.ml.api.v1beta1.Model>(
                  this, METHODID_CREATE_MODEL)))
          .addMethod(
            METHOD_LIST_MODELS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.ml.api.v1beta1.ListModelsRequest,
                com.google.cloud.ml.api.v1beta1.ListModelsResponse>(
                  this, METHODID_LIST_MODELS)))
          .addMethod(
            METHOD_GET_MODEL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.ml.api.v1beta1.GetModelRequest,
                com.google.cloud.ml.api.v1beta1.Model>(
                  this, METHODID_GET_MODEL)))
          .addMethod(
            METHOD_DELETE_MODEL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.ml.api.v1beta1.DeleteModelRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_DELETE_MODEL)))
          .addMethod(
            METHOD_CREATE_VERSION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.ml.api.v1beta1.CreateVersionRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CREATE_VERSION)))
          .addMethod(
            METHOD_LIST_VERSIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.ml.api.v1beta1.ListVersionsRequest,
                com.google.cloud.ml.api.v1beta1.ListVersionsResponse>(
                  this, METHODID_LIST_VERSIONS)))
          .addMethod(
            METHOD_GET_VERSION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.ml.api.v1beta1.GetVersionRequest,
                com.google.cloud.ml.api.v1beta1.Version>(
                  this, METHODID_GET_VERSION)))
          .addMethod(
            METHOD_DELETE_VERSION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.ml.api.v1beta1.DeleteVersionRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_DELETE_VERSION)))
          .addMethod(
            METHOD_SET_DEFAULT_VERSION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.ml.api.v1beta1.SetDefaultVersionRequest,
                com.google.cloud.ml.api.v1beta1.Version>(
                  this, METHODID_SET_DEFAULT_VERSION)))
          .build();
    }
  }

  /**
   * <pre>
   * Provides methods that create and manage machine learning models and their
   * versions.
   * A model in this context is a container for versions. The model can't provide
   * predictions without first having a version created for it.
   * Each version is a trained machine learning model, and each is assumed to be
   * an iteration of the same machine learning problem as the other versions of
   * the same model.
   * Your project can define multiple models, each with multiple versions.
   * The basic life cycle of a model is:
   * *   Create and train the machine learning model and save it to a
   *     Google Cloud Storage location.
   * *   Use
   *     [projects.models.create](/ml/reference/rest/v1beta1/projects.models/create)
   *     to make a new model in your project.
   * *   Use
   *     [projects.models.versions.create](/ml/reference/rest/v1beta1/projects.models.versions/create)
   *     to deploy your saved model.
   * *   Use [projects.predict](/ml/reference/rest/v1beta1/projects/predict to
   *     request predictions of a version of your model, or use
   *     [projects.jobs.create](/ml/reference/rest/v1beta1/projects.jobs/create)
   *     to start a batch prediction job.
   * </pre>
   */
  public static final class ModelServiceStub extends io.grpc.stub.AbstractStub<ModelServiceStub> {
    private ModelServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ModelServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModelServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ModelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a model which will later contain one or more versions.
     * You must add at least one version before you can request predictions from
     * the model. Add versions by calling
     * [projects.models.versions.create](/ml/reference/rest/v1beta1/projects.models.versions/create).
     * </pre>
     */
    public void createModel(com.google.cloud.ml.api.v1beta1.CreateModelRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.Model> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_MODEL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the models in a project.
     * Each project can contain multiple models, and each model can have multiple
     * versions.
     * </pre>
     */
    public void listModels(com.google.cloud.ml.api.v1beta1.ListModelsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.ListModelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_MODELS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets information about a model, including its name, the description (if
     * set), and the default version (if at least one version of the model has
     * been deployed).
     * </pre>
     */
    public void getModel(com.google.cloud.ml.api.v1beta1.GetModelRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.Model> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MODEL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a model.
     * You can only delete a model if there are no versions in it. You can delete
     * versions by calling
     * [projects.models.versions.delete](/ml/reference/rest/v1beta1/projects.models.versions/delete).
     * </pre>
     */
    public void deleteModel(com.google.cloud.ml.api.v1beta1.DeleteModelRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_MODEL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new version of a model from a trained TensorFlow model.
     * If the version created in the cloud by this call is the first deployed
     * version of the specified model, it will be made the default version of the
     * model. When you add a version to a model that already has one or more
     * versions, the default version does not automatically change. If you want a
     * new version to be the default, you must call
     * [projects.models.versions.setDefault](/ml/reference/rest/v1beta1/projects.models.versions/setDefault).
     * </pre>
     */
    public void createVersion(com.google.cloud.ml.api.v1beta1.CreateVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_VERSION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets basic information about all the versions of a model.
     * If you expect that a model has a lot of versions, or if you need to handle
     * only a limited number of results at a time, you can request that the list
     * be retrieved in batches (called pages):
     * </pre>
     */
    public void listVersions(com.google.cloud.ml.api.v1beta1.ListVersionsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.ListVersionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_VERSIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets information about a model version.
     * Models can have multiple versions. You can call
     * [projects.models.versions.list](/ml/reference/rest/v1beta1/projects.models.versions/list)
     * to get the same information that this method returns for all of the
     * versions of a model.
     * </pre>
     */
    public void getVersion(com.google.cloud.ml.api.v1beta1.GetVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.Version> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_VERSION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a model version.
     * Each model can have multiple versions deployed and in use at any given
     * time. Use this method to remove a single version.
     * Note: You cannot delete the version that is set as the default version
     * of the model unless it is the only remaining version.
     * </pre>
     */
    public void deleteVersion(com.google.cloud.ml.api.v1beta1.DeleteVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_VERSION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Designates a version to be the default for the model.
     * The default version is used for prediction requests made against the model
     * that don't specify a version.
     * The first version to be created for a model is automatically set as the
     * default. You must make any subsequent changes to the default version
     * setting manually using this method.
     * </pre>
     */
    public void setDefaultVersion(com.google.cloud.ml.api.v1beta1.SetDefaultVersionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.Version> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_DEFAULT_VERSION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Provides methods that create and manage machine learning models and their
   * versions.
   * A model in this context is a container for versions. The model can't provide
   * predictions without first having a version created for it.
   * Each version is a trained machine learning model, and each is assumed to be
   * an iteration of the same machine learning problem as the other versions of
   * the same model.
   * Your project can define multiple models, each with multiple versions.
   * The basic life cycle of a model is:
   * *   Create and train the machine learning model and save it to a
   *     Google Cloud Storage location.
   * *   Use
   *     [projects.models.create](/ml/reference/rest/v1beta1/projects.models/create)
   *     to make a new model in your project.
   * *   Use
   *     [projects.models.versions.create](/ml/reference/rest/v1beta1/projects.models.versions/create)
   *     to deploy your saved model.
   * *   Use [projects.predict](/ml/reference/rest/v1beta1/projects/predict to
   *     request predictions of a version of your model, or use
   *     [projects.jobs.create](/ml/reference/rest/v1beta1/projects.jobs/create)
   *     to start a batch prediction job.
   * </pre>
   */
  public static final class ModelServiceBlockingStub extends io.grpc.stub.AbstractStub<ModelServiceBlockingStub> {
    private ModelServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ModelServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModelServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ModelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a model which will later contain one or more versions.
     * You must add at least one version before you can request predictions from
     * the model. Add versions by calling
     * [projects.models.versions.create](/ml/reference/rest/v1beta1/projects.models.versions/create).
     * </pre>
     */
    public com.google.cloud.ml.api.v1beta1.Model createModel(com.google.cloud.ml.api.v1beta1.CreateModelRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_MODEL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the models in a project.
     * Each project can contain multiple models, and each model can have multiple
     * versions.
     * </pre>
     */
    public com.google.cloud.ml.api.v1beta1.ListModelsResponse listModels(com.google.cloud.ml.api.v1beta1.ListModelsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_MODELS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets information about a model, including its name, the description (if
     * set), and the default version (if at least one version of the model has
     * been deployed).
     * </pre>
     */
    public com.google.cloud.ml.api.v1beta1.Model getModel(com.google.cloud.ml.api.v1beta1.GetModelRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MODEL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a model.
     * You can only delete a model if there are no versions in it. You can delete
     * versions by calling
     * [projects.models.versions.delete](/ml/reference/rest/v1beta1/projects.models.versions/delete).
     * </pre>
     */
    public com.google.longrunning.Operation deleteModel(com.google.cloud.ml.api.v1beta1.DeleteModelRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_MODEL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new version of a model from a trained TensorFlow model.
     * If the version created in the cloud by this call is the first deployed
     * version of the specified model, it will be made the default version of the
     * model. When you add a version to a model that already has one or more
     * versions, the default version does not automatically change. If you want a
     * new version to be the default, you must call
     * [projects.models.versions.setDefault](/ml/reference/rest/v1beta1/projects.models.versions/setDefault).
     * </pre>
     */
    public com.google.longrunning.Operation createVersion(com.google.cloud.ml.api.v1beta1.CreateVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_VERSION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets basic information about all the versions of a model.
     * If you expect that a model has a lot of versions, or if you need to handle
     * only a limited number of results at a time, you can request that the list
     * be retrieved in batches (called pages):
     * </pre>
     */
    public com.google.cloud.ml.api.v1beta1.ListVersionsResponse listVersions(com.google.cloud.ml.api.v1beta1.ListVersionsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_VERSIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets information about a model version.
     * Models can have multiple versions. You can call
     * [projects.models.versions.list](/ml/reference/rest/v1beta1/projects.models.versions/list)
     * to get the same information that this method returns for all of the
     * versions of a model.
     * </pre>
     */
    public com.google.cloud.ml.api.v1beta1.Version getVersion(com.google.cloud.ml.api.v1beta1.GetVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_VERSION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a model version.
     * Each model can have multiple versions deployed and in use at any given
     * time. Use this method to remove a single version.
     * Note: You cannot delete the version that is set as the default version
     * of the model unless it is the only remaining version.
     * </pre>
     */
    public com.google.longrunning.Operation deleteVersion(com.google.cloud.ml.api.v1beta1.DeleteVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_VERSION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Designates a version to be the default for the model.
     * The default version is used for prediction requests made against the model
     * that don't specify a version.
     * The first version to be created for a model is automatically set as the
     * default. You must make any subsequent changes to the default version
     * setting manually using this method.
     * </pre>
     */
    public com.google.cloud.ml.api.v1beta1.Version setDefaultVersion(com.google.cloud.ml.api.v1beta1.SetDefaultVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_DEFAULT_VERSION, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Provides methods that create and manage machine learning models and their
   * versions.
   * A model in this context is a container for versions. The model can't provide
   * predictions without first having a version created for it.
   * Each version is a trained machine learning model, and each is assumed to be
   * an iteration of the same machine learning problem as the other versions of
   * the same model.
   * Your project can define multiple models, each with multiple versions.
   * The basic life cycle of a model is:
   * *   Create and train the machine learning model and save it to a
   *     Google Cloud Storage location.
   * *   Use
   *     [projects.models.create](/ml/reference/rest/v1beta1/projects.models/create)
   *     to make a new model in your project.
   * *   Use
   *     [projects.models.versions.create](/ml/reference/rest/v1beta1/projects.models.versions/create)
   *     to deploy your saved model.
   * *   Use [projects.predict](/ml/reference/rest/v1beta1/projects/predict to
   *     request predictions of a version of your model, or use
   *     [projects.jobs.create](/ml/reference/rest/v1beta1/projects.jobs/create)
   *     to start a batch prediction job.
   * </pre>
   */
  public static final class ModelServiceFutureStub extends io.grpc.stub.AbstractStub<ModelServiceFutureStub> {
    private ModelServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ModelServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModelServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ModelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a model which will later contain one or more versions.
     * You must add at least one version before you can request predictions from
     * the model. Add versions by calling
     * [projects.models.versions.create](/ml/reference/rest/v1beta1/projects.models.versions/create).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.ml.api.v1beta1.Model> createModel(
        com.google.cloud.ml.api.v1beta1.CreateModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_MODEL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the models in a project.
     * Each project can contain multiple models, and each model can have multiple
     * versions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.ml.api.v1beta1.ListModelsResponse> listModels(
        com.google.cloud.ml.api.v1beta1.ListModelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_MODELS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets information about a model, including its name, the description (if
     * set), and the default version (if at least one version of the model has
     * been deployed).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.ml.api.v1beta1.Model> getModel(
        com.google.cloud.ml.api.v1beta1.GetModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MODEL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a model.
     * You can only delete a model if there are no versions in it. You can delete
     * versions by calling
     * [projects.models.versions.delete](/ml/reference/rest/v1beta1/projects.models.versions/delete).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deleteModel(
        com.google.cloud.ml.api.v1beta1.DeleteModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_MODEL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new version of a model from a trained TensorFlow model.
     * If the version created in the cloud by this call is the first deployed
     * version of the specified model, it will be made the default version of the
     * model. When you add a version to a model that already has one or more
     * versions, the default version does not automatically change. If you want a
     * new version to be the default, you must call
     * [projects.models.versions.setDefault](/ml/reference/rest/v1beta1/projects.models.versions/setDefault).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> createVersion(
        com.google.cloud.ml.api.v1beta1.CreateVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_VERSION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets basic information about all the versions of a model.
     * If you expect that a model has a lot of versions, or if you need to handle
     * only a limited number of results at a time, you can request that the list
     * be retrieved in batches (called pages):
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.ml.api.v1beta1.ListVersionsResponse> listVersions(
        com.google.cloud.ml.api.v1beta1.ListVersionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_VERSIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets information about a model version.
     * Models can have multiple versions. You can call
     * [projects.models.versions.list](/ml/reference/rest/v1beta1/projects.models.versions/list)
     * to get the same information that this method returns for all of the
     * versions of a model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.ml.api.v1beta1.Version> getVersion(
        com.google.cloud.ml.api.v1beta1.GetVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_VERSION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a model version.
     * Each model can have multiple versions deployed and in use at any given
     * time. Use this method to remove a single version.
     * Note: You cannot delete the version that is set as the default version
     * of the model unless it is the only remaining version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> deleteVersion(
        com.google.cloud.ml.api.v1beta1.DeleteVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_VERSION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Designates a version to be the default for the model.
     * The default version is used for prediction requests made against the model
     * that don't specify a version.
     * The first version to be created for a model is automatically set as the
     * default. You must make any subsequent changes to the default version
     * setting manually using this method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.ml.api.v1beta1.Version> setDefaultVersion(
        com.google.cloud.ml.api.v1beta1.SetDefaultVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_DEFAULT_VERSION, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_MODEL = 0;
  private static final int METHODID_LIST_MODELS = 1;
  private static final int METHODID_GET_MODEL = 2;
  private static final int METHODID_DELETE_MODEL = 3;
  private static final int METHODID_CREATE_VERSION = 4;
  private static final int METHODID_LIST_VERSIONS = 5;
  private static final int METHODID_GET_VERSION = 6;
  private static final int METHODID_DELETE_VERSION = 7;
  private static final int METHODID_SET_DEFAULT_VERSION = 8;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ModelServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ModelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_MODEL:
          serviceImpl.createModel((com.google.cloud.ml.api.v1beta1.CreateModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.Model>) responseObserver);
          break;
        case METHODID_LIST_MODELS:
          serviceImpl.listModels((com.google.cloud.ml.api.v1beta1.ListModelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.ListModelsResponse>) responseObserver);
          break;
        case METHODID_GET_MODEL:
          serviceImpl.getModel((com.google.cloud.ml.api.v1beta1.GetModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.Model>) responseObserver);
          break;
        case METHODID_DELETE_MODEL:
          serviceImpl.deleteModel((com.google.cloud.ml.api.v1beta1.DeleteModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_CREATE_VERSION:
          serviceImpl.createVersion((com.google.cloud.ml.api.v1beta1.CreateVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_LIST_VERSIONS:
          serviceImpl.listVersions((com.google.cloud.ml.api.v1beta1.ListVersionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.ListVersionsResponse>) responseObserver);
          break;
        case METHODID_GET_VERSION:
          serviceImpl.getVersion((com.google.cloud.ml.api.v1beta1.GetVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.Version>) responseObserver);
          break;
        case METHODID_DELETE_VERSION:
          serviceImpl.deleteVersion((com.google.cloud.ml.api.v1beta1.DeleteVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_SET_DEFAULT_VERSION:
          serviceImpl.setDefaultVersion((com.google.cloud.ml.api.v1beta1.SetDefaultVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.ml.api.v1beta1.Version>) responseObserver);
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
        METHOD_CREATE_MODEL,
        METHOD_LIST_MODELS,
        METHOD_GET_MODEL,
        METHOD_DELETE_MODEL,
        METHOD_CREATE_VERSION,
        METHOD_LIST_VERSIONS,
        METHOD_GET_VERSION,
        METHOD_DELETE_VERSION,
        METHOD_SET_DEFAULT_VERSION);
  }

}
