package com.google.cloud.runtimeconfig.v1beta1;

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
 * RuntimeConfig API represents configuration objects and operations on those
 * configuration objects.
 * RuntimeConfig objects consist of Variables logically grouped in the those
 * objects.
 * Variables are simple key-value pairs. Variables can be watched for changes or
 * deletions. Variable key can be hieararchical, e.g. ports/serving_port,
 * ports/monitoring_port, etc. Variable names can be hierarchical. No variable
 * name can be prefix of another.
 * Config objects represent logical containers for variables, e.g. flags,
 * passwords, etc.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/cloud/runtimeconfig/v1beta1/runtimeconfig.proto")
public class RuntimeConfigManagerGrpc {

  private RuntimeConfigManagerGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.runtimeconfig.v1beta1.RuntimeConfigManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.runtimeconfig.v1beta1.ListConfigsRequest,
      com.google.cloud.runtimeconfig.v1beta1.ListConfigsResponse> METHOD_LIST_CONFIGS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.runtimeconfig.v1beta1.RuntimeConfigManager", "ListConfigs"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.ListConfigsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.ListConfigsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.runtimeconfig.v1beta1.GetConfigRequest,
      com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig> METHOD_GET_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.runtimeconfig.v1beta1.RuntimeConfigManager", "GetConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.GetConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.runtimeconfig.v1beta1.CreateConfigRequest,
      com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig> METHOD_CREATE_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.runtimeconfig.v1beta1.RuntimeConfigManager", "CreateConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.CreateConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.runtimeconfig.v1beta1.UpdateConfigRequest,
      com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig> METHOD_UPDATE_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.runtimeconfig.v1beta1.RuntimeConfigManager", "UpdateConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.UpdateConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.runtimeconfig.v1beta1.DeleteConfigRequest,
      com.google.protobuf.Empty> METHOD_DELETE_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.runtimeconfig.v1beta1.RuntimeConfigManager", "DeleteConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.DeleteConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.runtimeconfig.v1beta1.ListVariablesRequest,
      com.google.cloud.runtimeconfig.v1beta1.ListVariablesResponse> METHOD_LIST_VARIABLES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.runtimeconfig.v1beta1.RuntimeConfigManager", "ListVariables"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.ListVariablesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.ListVariablesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.runtimeconfig.v1beta1.GetVariableRequest,
      com.google.cloud.runtimeconfig.v1beta1.Variable> METHOD_GET_VARIABLE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.runtimeconfig.v1beta1.RuntimeConfigManager", "GetVariable"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.GetVariableRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.Variable.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.runtimeconfig.v1beta1.WatchVariableRequest,
      com.google.cloud.runtimeconfig.v1beta1.Variable> METHOD_WATCH_VARIABLE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.runtimeconfig.v1beta1.RuntimeConfigManager", "WatchVariable"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.WatchVariableRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.Variable.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.runtimeconfig.v1beta1.CreateVariableRequest,
      com.google.cloud.runtimeconfig.v1beta1.Variable> METHOD_CREATE_VARIABLE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.runtimeconfig.v1beta1.RuntimeConfigManager", "CreateVariable"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.CreateVariableRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.Variable.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.runtimeconfig.v1beta1.UpdateVariableRequest,
      com.google.cloud.runtimeconfig.v1beta1.Variable> METHOD_UPDATE_VARIABLE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.runtimeconfig.v1beta1.RuntimeConfigManager", "UpdateVariable"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.UpdateVariableRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.Variable.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.runtimeconfig.v1beta1.DeleteVariableRequest,
      com.google.protobuf.Empty> METHOD_DELETE_VARIABLE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.runtimeconfig.v1beta1.RuntimeConfigManager", "DeleteVariable"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.DeleteVariableRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.runtimeconfig.v1beta1.ListWaitersRequest,
      com.google.cloud.runtimeconfig.v1beta1.ListWaitersResponse> METHOD_LIST_WAITERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.runtimeconfig.v1beta1.RuntimeConfigManager", "ListWaiters"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.ListWaitersRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.ListWaitersResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.runtimeconfig.v1beta1.GetWaiterRequest,
      com.google.cloud.runtimeconfig.v1beta1.Waiter> METHOD_GET_WAITER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.runtimeconfig.v1beta1.RuntimeConfigManager", "GetWaiter"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.GetWaiterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.Waiter.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.runtimeconfig.v1beta1.CreateWaiterRequest,
      com.google.longrunning.Operation> METHOD_CREATE_WAITER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.runtimeconfig.v1beta1.RuntimeConfigManager", "CreateWaiter"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.CreateWaiterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.cloud.runtimeconfig.v1beta1.DeleteWaiterRequest,
      com.google.protobuf.Empty> METHOD_DELETE_WAITER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.cloud.runtimeconfig.v1beta1.RuntimeConfigManager", "DeleteWaiter"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.cloud.runtimeconfig.v1beta1.DeleteWaiterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RuntimeConfigManagerStub newStub(io.grpc.Channel channel) {
    return new RuntimeConfigManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RuntimeConfigManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RuntimeConfigManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static RuntimeConfigManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RuntimeConfigManagerFutureStub(channel);
  }

  /**
   * <pre>
   * RuntimeConfig API represents configuration objects and operations on those
   * configuration objects.
   * RuntimeConfig objects consist of Variables logically grouped in the those
   * objects.
   * Variables are simple key-value pairs. Variables can be watched for changes or
   * deletions. Variable key can be hieararchical, e.g. ports/serving_port,
   * ports/monitoring_port, etc. Variable names can be hierarchical. No variable
   * name can be prefix of another.
   * Config objects represent logical containers for variables, e.g. flags,
   * passwords, etc.
   * </pre>
   */
  public static abstract class RuntimeConfigManagerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists all the RuntimeConfig resources within project.
     * </pre>
     */
    public void listConfigs(com.google.cloud.runtimeconfig.v1beta1.ListConfigsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.ListConfigsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_CONFIGS, responseObserver);
    }

    /**
     * <pre>
     * Gets information about a RuntimeConfig resource.
     * </pre>
     */
    public void getConfig(com.google.cloud.runtimeconfig.v1beta1.GetConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Creates a new RuntimeConfig resource. The configuration name must be
     * unique within project.
     * </pre>
     */
    public void createConfig(com.google.cloud.runtimeconfig.v1beta1.CreateConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Updates a RuntimeConfig resource. The configuration must exist beforehand.
     * </pre>
     */
    public void updateConfig(com.google.cloud.runtimeconfig.v1beta1.UpdateConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Deletes a RuntimeConfig resource.
     * </pre>
     */
    public void deleteConfig(com.google.cloud.runtimeconfig.v1beta1.DeleteConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Lists variables within given a configuration, matching any provided filters.
     * This only lists variable names, not the values, unless `return_values` is
     * true, in which case only variables that user has IAM permission to
     * GetVariable will be returned.
     * </pre>
     */
    public void listVariables(com.google.cloud.runtimeconfig.v1beta1.ListVariablesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.ListVariablesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_VARIABLES, responseObserver);
    }

    /**
     * <pre>
     * Gets information about a single variable.
     * </pre>
     */
    public void getVariable(com.google.cloud.runtimeconfig.v1beta1.GetVariableRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.Variable> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_VARIABLE, responseObserver);
    }

    /**
     * <pre>
     * Watches a specific variable and waits for a change in the variable's value.
     * When there is a change, this method returns the new value or times out.
     * If a variable is deleted while being watched, the `variableState` state is
     * set to `DELETED` and the method returns the last known variable `value`.
     * If you set the deadline for watching to a larger value than internal timeout
     * (60 seconds), the current variable value is returned and the `variableState`
     * will be `VARIABLE_STATE_UNSPECIFIED`.
     * To learn more about creating a watcher, read the
     * [Watching a Variable for Changes](/deployment-manager/runtime-configurator/watching-a-variable)
     * documentation.
     * </pre>
     */
    public void watchVariable(com.google.cloud.runtimeconfig.v1beta1.WatchVariableRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.Variable> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_WATCH_VARIABLE, responseObserver);
    }

    /**
     * <pre>
     * Creates a variable within the given configuration. You cannot create
     * a variable with a name that is a prefix of an existing variable name, or a
     * name that has an existing variable name as a prefix.
     * To learn more about creating a variable, read the
     * [Setting and Getting Data](/deployment-manager/runtime-configurator/set-and-get-variables)
     * documentation.
     * </pre>
     */
    public void createVariable(com.google.cloud.runtimeconfig.v1beta1.CreateVariableRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.Variable> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_VARIABLE, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing variable with a new value.
     * </pre>
     */
    public void updateVariable(com.google.cloud.runtimeconfig.v1beta1.UpdateVariableRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.Variable> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_VARIABLE, responseObserver);
    }

    /**
     * <pre>
     * Deletes a variable or multiple variables.
     * If you specify a variable name, then that variable is deleted. If you
     * specify a prefix and `recursive` is true, then all variables with that
     * prefix are deleted. You must set a `recursive` to true if you delete
     * variables by prefix.
     * </pre>
     */
    public void deleteVariable(com.google.cloud.runtimeconfig.v1beta1.DeleteVariableRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_VARIABLE, responseObserver);
    }

    /**
     * <pre>
     * List waiters within the given configuration.
     * </pre>
     */
    public void listWaiters(com.google.cloud.runtimeconfig.v1beta1.ListWaitersRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.ListWaitersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_WAITERS, responseObserver);
    }

    /**
     * <pre>
     * Gets information about a single waiter.
     * </pre>
     */
    public void getWaiter(com.google.cloud.runtimeconfig.v1beta1.GetWaiterRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.Waiter> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_WAITER, responseObserver);
    }

    /**
     * <pre>
     * Creates a Waiter resource. This operation returns a long-running Operation
     * resource which can be polled for completion. However, a waiter with the
     * given name will exist (and can be retrieved) prior to the operation
     * completing. If the operation fails, the failed Waiter resource will
     * still exist and must be deleted prior to subsequent creation attempts.
     * </pre>
     */
    public void createWaiter(com.google.cloud.runtimeconfig.v1beta1.CreateWaiterRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_WAITER, responseObserver);
    }

    /**
     * <pre>
     * Deletes the waiter with the specified name.
     * </pre>
     */
    public void deleteWaiter(com.google.cloud.runtimeconfig.v1beta1.DeleteWaiterRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_WAITER, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_CONFIGS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.runtimeconfig.v1beta1.ListConfigsRequest,
                com.google.cloud.runtimeconfig.v1beta1.ListConfigsResponse>(
                  this, METHODID_LIST_CONFIGS)))
          .addMethod(
            METHOD_GET_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.runtimeconfig.v1beta1.GetConfigRequest,
                com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig>(
                  this, METHODID_GET_CONFIG)))
          .addMethod(
            METHOD_CREATE_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.runtimeconfig.v1beta1.CreateConfigRequest,
                com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig>(
                  this, METHODID_CREATE_CONFIG)))
          .addMethod(
            METHOD_UPDATE_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.runtimeconfig.v1beta1.UpdateConfigRequest,
                com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig>(
                  this, METHODID_UPDATE_CONFIG)))
          .addMethod(
            METHOD_DELETE_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.runtimeconfig.v1beta1.DeleteConfigRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_CONFIG)))
          .addMethod(
            METHOD_LIST_VARIABLES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.runtimeconfig.v1beta1.ListVariablesRequest,
                com.google.cloud.runtimeconfig.v1beta1.ListVariablesResponse>(
                  this, METHODID_LIST_VARIABLES)))
          .addMethod(
            METHOD_GET_VARIABLE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.runtimeconfig.v1beta1.GetVariableRequest,
                com.google.cloud.runtimeconfig.v1beta1.Variable>(
                  this, METHODID_GET_VARIABLE)))
          .addMethod(
            METHOD_WATCH_VARIABLE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.runtimeconfig.v1beta1.WatchVariableRequest,
                com.google.cloud.runtimeconfig.v1beta1.Variable>(
                  this, METHODID_WATCH_VARIABLE)))
          .addMethod(
            METHOD_CREATE_VARIABLE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.runtimeconfig.v1beta1.CreateVariableRequest,
                com.google.cloud.runtimeconfig.v1beta1.Variable>(
                  this, METHODID_CREATE_VARIABLE)))
          .addMethod(
            METHOD_UPDATE_VARIABLE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.runtimeconfig.v1beta1.UpdateVariableRequest,
                com.google.cloud.runtimeconfig.v1beta1.Variable>(
                  this, METHODID_UPDATE_VARIABLE)))
          .addMethod(
            METHOD_DELETE_VARIABLE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.runtimeconfig.v1beta1.DeleteVariableRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_VARIABLE)))
          .addMethod(
            METHOD_LIST_WAITERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.runtimeconfig.v1beta1.ListWaitersRequest,
                com.google.cloud.runtimeconfig.v1beta1.ListWaitersResponse>(
                  this, METHODID_LIST_WAITERS)))
          .addMethod(
            METHOD_GET_WAITER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.runtimeconfig.v1beta1.GetWaiterRequest,
                com.google.cloud.runtimeconfig.v1beta1.Waiter>(
                  this, METHODID_GET_WAITER)))
          .addMethod(
            METHOD_CREATE_WAITER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.runtimeconfig.v1beta1.CreateWaiterRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CREATE_WAITER)))
          .addMethod(
            METHOD_DELETE_WAITER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.runtimeconfig.v1beta1.DeleteWaiterRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_WAITER)))
          .build();
    }
  }

  /**
   * <pre>
   * RuntimeConfig API represents configuration objects and operations on those
   * configuration objects.
   * RuntimeConfig objects consist of Variables logically grouped in the those
   * objects.
   * Variables are simple key-value pairs. Variables can be watched for changes or
   * deletions. Variable key can be hieararchical, e.g. ports/serving_port,
   * ports/monitoring_port, etc. Variable names can be hierarchical. No variable
   * name can be prefix of another.
   * Config objects represent logical containers for variables, e.g. flags,
   * passwords, etc.
   * </pre>
   */
  public static final class RuntimeConfigManagerStub extends io.grpc.stub.AbstractStub<RuntimeConfigManagerStub> {
    private RuntimeConfigManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RuntimeConfigManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RuntimeConfigManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RuntimeConfigManagerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all the RuntimeConfig resources within project.
     * </pre>
     */
    public void listConfigs(com.google.cloud.runtimeconfig.v1beta1.ListConfigsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.ListConfigsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_CONFIGS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets information about a RuntimeConfig resource.
     * </pre>
     */
    public void getConfig(com.google.cloud.runtimeconfig.v1beta1.GetConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new RuntimeConfig resource. The configuration name must be
     * unique within project.
     * </pre>
     */
    public void createConfig(com.google.cloud.runtimeconfig.v1beta1.CreateConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a RuntimeConfig resource. The configuration must exist beforehand.
     * </pre>
     */
    public void updateConfig(com.google.cloud.runtimeconfig.v1beta1.UpdateConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a RuntimeConfig resource.
     * </pre>
     */
    public void deleteConfig(com.google.cloud.runtimeconfig.v1beta1.DeleteConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists variables within given a configuration, matching any provided filters.
     * This only lists variable names, not the values, unless `return_values` is
     * true, in which case only variables that user has IAM permission to
     * GetVariable will be returned.
     * </pre>
     */
    public void listVariables(com.google.cloud.runtimeconfig.v1beta1.ListVariablesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.ListVariablesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_VARIABLES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets information about a single variable.
     * </pre>
     */
    public void getVariable(com.google.cloud.runtimeconfig.v1beta1.GetVariableRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.Variable> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_VARIABLE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Watches a specific variable and waits for a change in the variable's value.
     * When there is a change, this method returns the new value or times out.
     * If a variable is deleted while being watched, the `variableState` state is
     * set to `DELETED` and the method returns the last known variable `value`.
     * If you set the deadline for watching to a larger value than internal timeout
     * (60 seconds), the current variable value is returned and the `variableState`
     * will be `VARIABLE_STATE_UNSPECIFIED`.
     * To learn more about creating a watcher, read the
     * [Watching a Variable for Changes](/deployment-manager/runtime-configurator/watching-a-variable)
     * documentation.
     * </pre>
     */
    public void watchVariable(com.google.cloud.runtimeconfig.v1beta1.WatchVariableRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.Variable> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_WATCH_VARIABLE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a variable within the given configuration. You cannot create
     * a variable with a name that is a prefix of an existing variable name, or a
     * name that has an existing variable name as a prefix.
     * To learn more about creating a variable, read the
     * [Setting and Getting Data](/deployment-manager/runtime-configurator/set-and-get-variables)
     * documentation.
     * </pre>
     */
    public void createVariable(com.google.cloud.runtimeconfig.v1beta1.CreateVariableRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.Variable> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_VARIABLE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing variable with a new value.
     * </pre>
     */
    public void updateVariable(com.google.cloud.runtimeconfig.v1beta1.UpdateVariableRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.Variable> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_VARIABLE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a variable or multiple variables.
     * If you specify a variable name, then that variable is deleted. If you
     * specify a prefix and `recursive` is true, then all variables with that
     * prefix are deleted. You must set a `recursive` to true if you delete
     * variables by prefix.
     * </pre>
     */
    public void deleteVariable(com.google.cloud.runtimeconfig.v1beta1.DeleteVariableRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_VARIABLE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List waiters within the given configuration.
     * </pre>
     */
    public void listWaiters(com.google.cloud.runtimeconfig.v1beta1.ListWaitersRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.ListWaitersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_WAITERS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets information about a single waiter.
     * </pre>
     */
    public void getWaiter(com.google.cloud.runtimeconfig.v1beta1.GetWaiterRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.Waiter> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_WAITER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a Waiter resource. This operation returns a long-running Operation
     * resource which can be polled for completion. However, a waiter with the
     * given name will exist (and can be retrieved) prior to the operation
     * completing. If the operation fails, the failed Waiter resource will
     * still exist and must be deleted prior to subsequent creation attempts.
     * </pre>
     */
    public void createWaiter(com.google.cloud.runtimeconfig.v1beta1.CreateWaiterRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_WAITER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the waiter with the specified name.
     * </pre>
     */
    public void deleteWaiter(com.google.cloud.runtimeconfig.v1beta1.DeleteWaiterRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_WAITER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * RuntimeConfig API represents configuration objects and operations on those
   * configuration objects.
   * RuntimeConfig objects consist of Variables logically grouped in the those
   * objects.
   * Variables are simple key-value pairs. Variables can be watched for changes or
   * deletions. Variable key can be hieararchical, e.g. ports/serving_port,
   * ports/monitoring_port, etc. Variable names can be hierarchical. No variable
   * name can be prefix of another.
   * Config objects represent logical containers for variables, e.g. flags,
   * passwords, etc.
   * </pre>
   */
  public static final class RuntimeConfigManagerBlockingStub extends io.grpc.stub.AbstractStub<RuntimeConfigManagerBlockingStub> {
    private RuntimeConfigManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RuntimeConfigManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RuntimeConfigManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RuntimeConfigManagerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all the RuntimeConfig resources within project.
     * </pre>
     */
    public com.google.cloud.runtimeconfig.v1beta1.ListConfigsResponse listConfigs(com.google.cloud.runtimeconfig.v1beta1.ListConfigsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_CONFIGS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets information about a RuntimeConfig resource.
     * </pre>
     */
    public com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig getConfig(com.google.cloud.runtimeconfig.v1beta1.GetConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new RuntimeConfig resource. The configuration name must be
     * unique within project.
     * </pre>
     */
    public com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig createConfig(com.google.cloud.runtimeconfig.v1beta1.CreateConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a RuntimeConfig resource. The configuration must exist beforehand.
     * </pre>
     */
    public com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig updateConfig(com.google.cloud.runtimeconfig.v1beta1.UpdateConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a RuntimeConfig resource.
     * </pre>
     */
    public com.google.protobuf.Empty deleteConfig(com.google.cloud.runtimeconfig.v1beta1.DeleteConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists variables within given a configuration, matching any provided filters.
     * This only lists variable names, not the values, unless `return_values` is
     * true, in which case only variables that user has IAM permission to
     * GetVariable will be returned.
     * </pre>
     */
    public com.google.cloud.runtimeconfig.v1beta1.ListVariablesResponse listVariables(com.google.cloud.runtimeconfig.v1beta1.ListVariablesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_VARIABLES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets information about a single variable.
     * </pre>
     */
    public com.google.cloud.runtimeconfig.v1beta1.Variable getVariable(com.google.cloud.runtimeconfig.v1beta1.GetVariableRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_VARIABLE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Watches a specific variable and waits for a change in the variable's value.
     * When there is a change, this method returns the new value or times out.
     * If a variable is deleted while being watched, the `variableState` state is
     * set to `DELETED` and the method returns the last known variable `value`.
     * If you set the deadline for watching to a larger value than internal timeout
     * (60 seconds), the current variable value is returned and the `variableState`
     * will be `VARIABLE_STATE_UNSPECIFIED`.
     * To learn more about creating a watcher, read the
     * [Watching a Variable for Changes](/deployment-manager/runtime-configurator/watching-a-variable)
     * documentation.
     * </pre>
     */
    public com.google.cloud.runtimeconfig.v1beta1.Variable watchVariable(com.google.cloud.runtimeconfig.v1beta1.WatchVariableRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_WATCH_VARIABLE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a variable within the given configuration. You cannot create
     * a variable with a name that is a prefix of an existing variable name, or a
     * name that has an existing variable name as a prefix.
     * To learn more about creating a variable, read the
     * [Setting and Getting Data](/deployment-manager/runtime-configurator/set-and-get-variables)
     * documentation.
     * </pre>
     */
    public com.google.cloud.runtimeconfig.v1beta1.Variable createVariable(com.google.cloud.runtimeconfig.v1beta1.CreateVariableRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_VARIABLE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing variable with a new value.
     * </pre>
     */
    public com.google.cloud.runtimeconfig.v1beta1.Variable updateVariable(com.google.cloud.runtimeconfig.v1beta1.UpdateVariableRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_VARIABLE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a variable or multiple variables.
     * If you specify a variable name, then that variable is deleted. If you
     * specify a prefix and `recursive` is true, then all variables with that
     * prefix are deleted. You must set a `recursive` to true if you delete
     * variables by prefix.
     * </pre>
     */
    public com.google.protobuf.Empty deleteVariable(com.google.cloud.runtimeconfig.v1beta1.DeleteVariableRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_VARIABLE, getCallOptions(), request);
    }

    /**
     * <pre>
     * List waiters within the given configuration.
     * </pre>
     */
    public com.google.cloud.runtimeconfig.v1beta1.ListWaitersResponse listWaiters(com.google.cloud.runtimeconfig.v1beta1.ListWaitersRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_WAITERS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets information about a single waiter.
     * </pre>
     */
    public com.google.cloud.runtimeconfig.v1beta1.Waiter getWaiter(com.google.cloud.runtimeconfig.v1beta1.GetWaiterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_WAITER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a Waiter resource. This operation returns a long-running Operation
     * resource which can be polled for completion. However, a waiter with the
     * given name will exist (and can be retrieved) prior to the operation
     * completing. If the operation fails, the failed Waiter resource will
     * still exist and must be deleted prior to subsequent creation attempts.
     * </pre>
     */
    public com.google.longrunning.Operation createWaiter(com.google.cloud.runtimeconfig.v1beta1.CreateWaiterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_WAITER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the waiter with the specified name.
     * </pre>
     */
    public com.google.protobuf.Empty deleteWaiter(com.google.cloud.runtimeconfig.v1beta1.DeleteWaiterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_WAITER, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * RuntimeConfig API represents configuration objects and operations on those
   * configuration objects.
   * RuntimeConfig objects consist of Variables logically grouped in the those
   * objects.
   * Variables are simple key-value pairs. Variables can be watched for changes or
   * deletions. Variable key can be hieararchical, e.g. ports/serving_port,
   * ports/monitoring_port, etc. Variable names can be hierarchical. No variable
   * name can be prefix of another.
   * Config objects represent logical containers for variables, e.g. flags,
   * passwords, etc.
   * </pre>
   */
  public static final class RuntimeConfigManagerFutureStub extends io.grpc.stub.AbstractStub<RuntimeConfigManagerFutureStub> {
    private RuntimeConfigManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RuntimeConfigManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RuntimeConfigManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RuntimeConfigManagerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all the RuntimeConfig resources within project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.runtimeconfig.v1beta1.ListConfigsResponse> listConfigs(
        com.google.cloud.runtimeconfig.v1beta1.ListConfigsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_CONFIGS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets information about a RuntimeConfig resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig> getConfig(
        com.google.cloud.runtimeconfig.v1beta1.GetConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new RuntimeConfig resource. The configuration name must be
     * unique within project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig> createConfig(
        com.google.cloud.runtimeconfig.v1beta1.CreateConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a RuntimeConfig resource. The configuration must exist beforehand.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig> updateConfig(
        com.google.cloud.runtimeconfig.v1beta1.UpdateConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a RuntimeConfig resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteConfig(
        com.google.cloud.runtimeconfig.v1beta1.DeleteConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists variables within given a configuration, matching any provided filters.
     * This only lists variable names, not the values, unless `return_values` is
     * true, in which case only variables that user has IAM permission to
     * GetVariable will be returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.runtimeconfig.v1beta1.ListVariablesResponse> listVariables(
        com.google.cloud.runtimeconfig.v1beta1.ListVariablesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_VARIABLES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets information about a single variable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.runtimeconfig.v1beta1.Variable> getVariable(
        com.google.cloud.runtimeconfig.v1beta1.GetVariableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_VARIABLE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Watches a specific variable and waits for a change in the variable's value.
     * When there is a change, this method returns the new value or times out.
     * If a variable is deleted while being watched, the `variableState` state is
     * set to `DELETED` and the method returns the last known variable `value`.
     * If you set the deadline for watching to a larger value than internal timeout
     * (60 seconds), the current variable value is returned and the `variableState`
     * will be `VARIABLE_STATE_UNSPECIFIED`.
     * To learn more about creating a watcher, read the
     * [Watching a Variable for Changes](/deployment-manager/runtime-configurator/watching-a-variable)
     * documentation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.runtimeconfig.v1beta1.Variable> watchVariable(
        com.google.cloud.runtimeconfig.v1beta1.WatchVariableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_WATCH_VARIABLE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a variable within the given configuration. You cannot create
     * a variable with a name that is a prefix of an existing variable name, or a
     * name that has an existing variable name as a prefix.
     * To learn more about creating a variable, read the
     * [Setting and Getting Data](/deployment-manager/runtime-configurator/set-and-get-variables)
     * documentation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.runtimeconfig.v1beta1.Variable> createVariable(
        com.google.cloud.runtimeconfig.v1beta1.CreateVariableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_VARIABLE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing variable with a new value.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.runtimeconfig.v1beta1.Variable> updateVariable(
        com.google.cloud.runtimeconfig.v1beta1.UpdateVariableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_VARIABLE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a variable or multiple variables.
     * If you specify a variable name, then that variable is deleted. If you
     * specify a prefix and `recursive` is true, then all variables with that
     * prefix are deleted. You must set a `recursive` to true if you delete
     * variables by prefix.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteVariable(
        com.google.cloud.runtimeconfig.v1beta1.DeleteVariableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_VARIABLE, getCallOptions()), request);
    }

    /**
     * <pre>
     * List waiters within the given configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.runtimeconfig.v1beta1.ListWaitersResponse> listWaiters(
        com.google.cloud.runtimeconfig.v1beta1.ListWaitersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_WAITERS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets information about a single waiter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.runtimeconfig.v1beta1.Waiter> getWaiter(
        com.google.cloud.runtimeconfig.v1beta1.GetWaiterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_WAITER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a Waiter resource. This operation returns a long-running Operation
     * resource which can be polled for completion. However, a waiter with the
     * given name will exist (and can be retrieved) prior to the operation
     * completing. If the operation fails, the failed Waiter resource will
     * still exist and must be deleted prior to subsequent creation attempts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> createWaiter(
        com.google.cloud.runtimeconfig.v1beta1.CreateWaiterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_WAITER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the waiter with the specified name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteWaiter(
        com.google.cloud.runtimeconfig.v1beta1.DeleteWaiterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_WAITER, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_CONFIGS = 0;
  private static final int METHODID_GET_CONFIG = 1;
  private static final int METHODID_CREATE_CONFIG = 2;
  private static final int METHODID_UPDATE_CONFIG = 3;
  private static final int METHODID_DELETE_CONFIG = 4;
  private static final int METHODID_LIST_VARIABLES = 5;
  private static final int METHODID_GET_VARIABLE = 6;
  private static final int METHODID_WATCH_VARIABLE = 7;
  private static final int METHODID_CREATE_VARIABLE = 8;
  private static final int METHODID_UPDATE_VARIABLE = 9;
  private static final int METHODID_DELETE_VARIABLE = 10;
  private static final int METHODID_LIST_WAITERS = 11;
  private static final int METHODID_GET_WAITER = 12;
  private static final int METHODID_CREATE_WAITER = 13;
  private static final int METHODID_DELETE_WAITER = 14;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RuntimeConfigManagerImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(RuntimeConfigManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_CONFIGS:
          serviceImpl.listConfigs((com.google.cloud.runtimeconfig.v1beta1.ListConfigsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.ListConfigsResponse>) responseObserver);
          break;
        case METHODID_GET_CONFIG:
          serviceImpl.getConfig((com.google.cloud.runtimeconfig.v1beta1.GetConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig>) responseObserver);
          break;
        case METHODID_CREATE_CONFIG:
          serviceImpl.createConfig((com.google.cloud.runtimeconfig.v1beta1.CreateConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig>) responseObserver);
          break;
        case METHODID_UPDATE_CONFIG:
          serviceImpl.updateConfig((com.google.cloud.runtimeconfig.v1beta1.UpdateConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.RuntimeConfig>) responseObserver);
          break;
        case METHODID_DELETE_CONFIG:
          serviceImpl.deleteConfig((com.google.cloud.runtimeconfig.v1beta1.DeleteConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_VARIABLES:
          serviceImpl.listVariables((com.google.cloud.runtimeconfig.v1beta1.ListVariablesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.ListVariablesResponse>) responseObserver);
          break;
        case METHODID_GET_VARIABLE:
          serviceImpl.getVariable((com.google.cloud.runtimeconfig.v1beta1.GetVariableRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.Variable>) responseObserver);
          break;
        case METHODID_WATCH_VARIABLE:
          serviceImpl.watchVariable((com.google.cloud.runtimeconfig.v1beta1.WatchVariableRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.Variable>) responseObserver);
          break;
        case METHODID_CREATE_VARIABLE:
          serviceImpl.createVariable((com.google.cloud.runtimeconfig.v1beta1.CreateVariableRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.Variable>) responseObserver);
          break;
        case METHODID_UPDATE_VARIABLE:
          serviceImpl.updateVariable((com.google.cloud.runtimeconfig.v1beta1.UpdateVariableRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.Variable>) responseObserver);
          break;
        case METHODID_DELETE_VARIABLE:
          serviceImpl.deleteVariable((com.google.cloud.runtimeconfig.v1beta1.DeleteVariableRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_WAITERS:
          serviceImpl.listWaiters((com.google.cloud.runtimeconfig.v1beta1.ListWaitersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.ListWaitersResponse>) responseObserver);
          break;
        case METHODID_GET_WAITER:
          serviceImpl.getWaiter((com.google.cloud.runtimeconfig.v1beta1.GetWaiterRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.runtimeconfig.v1beta1.Waiter>) responseObserver);
          break;
        case METHODID_CREATE_WAITER:
          serviceImpl.createWaiter((com.google.cloud.runtimeconfig.v1beta1.CreateWaiterRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_WAITER:
          serviceImpl.deleteWaiter((com.google.cloud.runtimeconfig.v1beta1.DeleteWaiterRequest) request,
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
        METHOD_LIST_CONFIGS,
        METHOD_GET_CONFIG,
        METHOD_CREATE_CONFIG,
        METHOD_UPDATE_CONFIG,
        METHOD_DELETE_CONFIG,
        METHOD_LIST_VARIABLES,
        METHOD_GET_VARIABLE,
        METHOD_WATCH_VARIABLE,
        METHOD_CREATE_VARIABLE,
        METHOD_UPDATE_VARIABLE,
        METHOD_DELETE_VARIABLE,
        METHOD_LIST_WAITERS,
        METHOD_GET_WAITER,
        METHOD_CREATE_WAITER,
        METHOD_DELETE_WAITER);
  }

}
