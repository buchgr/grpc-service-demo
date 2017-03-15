package com.google.container.v1;

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
 * Google Container Engine Cluster Manager v1
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/container/v1/cluster_service.proto")
public class ClusterManagerGrpc {

  private ClusterManagerGrpc() {}

  public static final String SERVICE_NAME = "google.container.v1.ClusterManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.ListClustersRequest,
      com.google.container.v1.ListClustersResponse> METHOD_LIST_CLUSTERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "ListClusters"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.ListClustersRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.ListClustersResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.GetClusterRequest,
      com.google.container.v1.Cluster> METHOD_GET_CLUSTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "GetCluster"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.GetClusterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Cluster.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.CreateClusterRequest,
      com.google.container.v1.Operation> METHOD_CREATE_CLUSTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "CreateCluster"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.CreateClusterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.UpdateClusterRequest,
      com.google.container.v1.Operation> METHOD_UPDATE_CLUSTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "UpdateCluster"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.UpdateClusterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.DeleteClusterRequest,
      com.google.container.v1.Operation> METHOD_DELETE_CLUSTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "DeleteCluster"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.DeleteClusterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.ListOperationsRequest,
      com.google.container.v1.ListOperationsResponse> METHOD_LIST_OPERATIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "ListOperations"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.ListOperationsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.ListOperationsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.GetOperationRequest,
      com.google.container.v1.Operation> METHOD_GET_OPERATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "GetOperation"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.GetOperationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.CancelOperationRequest,
      com.google.protobuf.Empty> METHOD_CANCEL_OPERATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "CancelOperation"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.CancelOperationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.GetServerConfigRequest,
      com.google.container.v1.ServerConfig> METHOD_GET_SERVER_CONFIG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "GetServerConfig"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.GetServerConfigRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.ServerConfig.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.ListNodePoolsRequest,
      com.google.container.v1.ListNodePoolsResponse> METHOD_LIST_NODE_POOLS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "ListNodePools"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.ListNodePoolsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.ListNodePoolsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.GetNodePoolRequest,
      com.google.container.v1.NodePool> METHOD_GET_NODE_POOL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "GetNodePool"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.GetNodePoolRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.NodePool.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.CreateNodePoolRequest,
      com.google.container.v1.Operation> METHOD_CREATE_NODE_POOL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "CreateNodePool"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.CreateNodePoolRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.DeleteNodePoolRequest,
      com.google.container.v1.Operation> METHOD_DELETE_NODE_POOL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "DeleteNodePool"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.DeleteNodePoolRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.RollbackNodePoolUpgradeRequest,
      com.google.container.v1.Operation> METHOD_ROLLBACK_NODE_POOL_UPGRADE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "RollbackNodePoolUpgrade"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.RollbackNodePoolUpgradeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.container.v1.SetNodePoolManagementRequest,
      com.google.container.v1.Operation> METHOD_SET_NODE_POOL_MANAGEMENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.container.v1.ClusterManager", "SetNodePoolManagement"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.SetNodePoolManagementRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.container.v1.Operation.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClusterManagerStub newStub(io.grpc.Channel channel) {
    return new ClusterManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClusterManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClusterManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ClusterManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClusterManagerFutureStub(channel);
  }

  /**
   * <pre>
   * Google Container Engine Cluster Manager v1
   * </pre>
   */
  public static abstract class ClusterManagerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lists all clusters owned by a project in either the specified zone or all
     * zones.
     * </pre>
     */
    public void listClusters(com.google.container.v1.ListClustersRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.ListClustersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_CLUSTERS, responseObserver);
    }

    /**
     * <pre>
     * Gets the details of a specific cluster.
     * </pre>
     */
    public void getCluster(com.google.container.v1.GetClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Cluster> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CLUSTER, responseObserver);
    }

    /**
     * <pre>
     * Creates a cluster, consisting of the specified number and type of Google
     * Compute Engine instances.
     * By default, the cluster is created in the project's
     * [default network](/compute/docs/networks-and-firewalls#networks).
     * One firewall is added for the cluster. After cluster creation,
     * the cluster creates routes for each node to allow the containers
     * on that node to communicate with all other instances in the
     * cluster.
     * Finally, an entry is added to the project's global metadata indicating
     * which CIDR range is being used by the cluster.
     * </pre>
     */
    public void createCluster(com.google.container.v1.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_CLUSTER, responseObserver);
    }

    /**
     * <pre>
     * Updates the settings of a specific cluster.
     * </pre>
     */
    public void updateCluster(com.google.container.v1.UpdateClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_CLUSTER, responseObserver);
    }

    /**
     * <pre>
     * Deletes the cluster, including the Kubernetes endpoint and all worker
     * nodes.
     * Firewalls and routes that were configured during cluster creation
     * are also deleted.
     * Other Google Compute Engine resources that might be in use by the cluster
     * (e.g. load balancer resources) will not be deleted if they weren't present
     * at the initial create time.
     * </pre>
     */
    public void deleteCluster(com.google.container.v1.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_CLUSTER, responseObserver);
    }

    /**
     * <pre>
     * Lists all operations in a project in a specific zone or all zones.
     * </pre>
     */
    public void listOperations(com.google.container.v1.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.ListOperationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_OPERATIONS, responseObserver);
    }

    /**
     * <pre>
     * Gets the specified operation.
     * </pre>
     */
    public void getOperation(com.google.container.v1.GetOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_OPERATION, responseObserver);
    }

    /**
     * <pre>
     * Cancels the specified operation.
     * </pre>
     */
    public void cancelOperation(com.google.container.v1.CancelOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CANCEL_OPERATION, responseObserver);
    }

    /**
     * <pre>
     * Returns configuration info about the Container Engine service.
     * </pre>
     */
    public void getServerConfig(com.google.container.v1.GetServerConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.ServerConfig> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SERVER_CONFIG, responseObserver);
    }

    /**
     * <pre>
     * Lists the node pools for a cluster.
     * </pre>
     */
    public void listNodePools(com.google.container.v1.ListNodePoolsRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.ListNodePoolsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_NODE_POOLS, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the node pool requested.
     * </pre>
     */
    public void getNodePool(com.google.container.v1.GetNodePoolRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.NodePool> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_NODE_POOL, responseObserver);
    }

    /**
     * <pre>
     * Creates a node pool for a cluster.
     * </pre>
     */
    public void createNodePool(com.google.container.v1.CreateNodePoolRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_NODE_POOL, responseObserver);
    }

    /**
     * <pre>
     * Deletes a node pool from a cluster.
     * </pre>
     */
    public void deleteNodePool(com.google.container.v1.DeleteNodePoolRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_NODE_POOL, responseObserver);
    }

    /**
     * <pre>
     * Roll back the previously Aborted or Failed NodePool upgrade.
     * This will be an no-op if the last upgrade successfully completed.
     * </pre>
     */
    public void rollbackNodePoolUpgrade(com.google.container.v1.RollbackNodePoolUpgradeRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ROLLBACK_NODE_POOL_UPGRADE, responseObserver);
    }

    /**
     * <pre>
     * Sets the NodeManagement options for a node pool.
     * </pre>
     */
    public void setNodePoolManagement(com.google.container.v1.SetNodePoolManagementRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_NODE_POOL_MANAGEMENT, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_CLUSTERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.ListClustersRequest,
                com.google.container.v1.ListClustersResponse>(
                  this, METHODID_LIST_CLUSTERS)))
          .addMethod(
            METHOD_GET_CLUSTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.GetClusterRequest,
                com.google.container.v1.Cluster>(
                  this, METHODID_GET_CLUSTER)))
          .addMethod(
            METHOD_CREATE_CLUSTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.CreateClusterRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_CREATE_CLUSTER)))
          .addMethod(
            METHOD_UPDATE_CLUSTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.UpdateClusterRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_UPDATE_CLUSTER)))
          .addMethod(
            METHOD_DELETE_CLUSTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.DeleteClusterRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_DELETE_CLUSTER)))
          .addMethod(
            METHOD_LIST_OPERATIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.ListOperationsRequest,
                com.google.container.v1.ListOperationsResponse>(
                  this, METHODID_LIST_OPERATIONS)))
          .addMethod(
            METHOD_GET_OPERATION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.GetOperationRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_GET_OPERATION)))
          .addMethod(
            METHOD_CANCEL_OPERATION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.CancelOperationRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CANCEL_OPERATION)))
          .addMethod(
            METHOD_GET_SERVER_CONFIG,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.GetServerConfigRequest,
                com.google.container.v1.ServerConfig>(
                  this, METHODID_GET_SERVER_CONFIG)))
          .addMethod(
            METHOD_LIST_NODE_POOLS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.ListNodePoolsRequest,
                com.google.container.v1.ListNodePoolsResponse>(
                  this, METHODID_LIST_NODE_POOLS)))
          .addMethod(
            METHOD_GET_NODE_POOL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.GetNodePoolRequest,
                com.google.container.v1.NodePool>(
                  this, METHODID_GET_NODE_POOL)))
          .addMethod(
            METHOD_CREATE_NODE_POOL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.CreateNodePoolRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_CREATE_NODE_POOL)))
          .addMethod(
            METHOD_DELETE_NODE_POOL,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.DeleteNodePoolRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_DELETE_NODE_POOL)))
          .addMethod(
            METHOD_ROLLBACK_NODE_POOL_UPGRADE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.RollbackNodePoolUpgradeRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_ROLLBACK_NODE_POOL_UPGRADE)))
          .addMethod(
            METHOD_SET_NODE_POOL_MANAGEMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.container.v1.SetNodePoolManagementRequest,
                com.google.container.v1.Operation>(
                  this, METHODID_SET_NODE_POOL_MANAGEMENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Google Container Engine Cluster Manager v1
   * </pre>
   */
  public static final class ClusterManagerStub extends io.grpc.stub.AbstractStub<ClusterManagerStub> {
    private ClusterManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterManagerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all clusters owned by a project in either the specified zone or all
     * zones.
     * </pre>
     */
    public void listClusters(com.google.container.v1.ListClustersRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.ListClustersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_CLUSTERS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the details of a specific cluster.
     * </pre>
     */
    public void getCluster(com.google.container.v1.GetClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Cluster> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CLUSTER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a cluster, consisting of the specified number and type of Google
     * Compute Engine instances.
     * By default, the cluster is created in the project's
     * [default network](/compute/docs/networks-and-firewalls#networks).
     * One firewall is added for the cluster. After cluster creation,
     * the cluster creates routes for each node to allow the containers
     * on that node to communicate with all other instances in the
     * cluster.
     * Finally, an entry is added to the project's global metadata indicating
     * which CIDR range is being used by the cluster.
     * </pre>
     */
    public void createCluster(com.google.container.v1.CreateClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_CLUSTER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the settings of a specific cluster.
     * </pre>
     */
    public void updateCluster(com.google.container.v1.UpdateClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CLUSTER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the cluster, including the Kubernetes endpoint and all worker
     * nodes.
     * Firewalls and routes that were configured during cluster creation
     * are also deleted.
     * Other Google Compute Engine resources that might be in use by the cluster
     * (e.g. load balancer resources) will not be deleted if they weren't present
     * at the initial create time.
     * </pre>
     */
    public void deleteCluster(com.google.container.v1.DeleteClusterRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_CLUSTER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all operations in a project in a specific zone or all zones.
     * </pre>
     */
    public void listOperations(com.google.container.v1.ListOperationsRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.ListOperationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_OPERATIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the specified operation.
     * </pre>
     */
    public void getOperation(com.google.container.v1.GetOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_OPERATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancels the specified operation.
     * </pre>
     */
    public void cancelOperation(com.google.container.v1.CancelOperationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CANCEL_OPERATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns configuration info about the Container Engine service.
     * </pre>
     */
    public void getServerConfig(com.google.container.v1.GetServerConfigRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.ServerConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SERVER_CONFIG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the node pools for a cluster.
     * </pre>
     */
    public void listNodePools(com.google.container.v1.ListNodePoolsRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.ListNodePoolsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_NODE_POOLS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the node pool requested.
     * </pre>
     */
    public void getNodePool(com.google.container.v1.GetNodePoolRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.NodePool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_NODE_POOL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a node pool for a cluster.
     * </pre>
     */
    public void createNodePool(com.google.container.v1.CreateNodePoolRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_NODE_POOL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a node pool from a cluster.
     * </pre>
     */
    public void deleteNodePool(com.google.container.v1.DeleteNodePoolRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_NODE_POOL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Roll back the previously Aborted or Failed NodePool upgrade.
     * This will be an no-op if the last upgrade successfully completed.
     * </pre>
     */
    public void rollbackNodePoolUpgrade(com.google.container.v1.RollbackNodePoolUpgradeRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ROLLBACK_NODE_POOL_UPGRADE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the NodeManagement options for a node pool.
     * </pre>
     */
    public void setNodePoolManagement(com.google.container.v1.SetNodePoolManagementRequest request,
        io.grpc.stub.StreamObserver<com.google.container.v1.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_NODE_POOL_MANAGEMENT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Google Container Engine Cluster Manager v1
   * </pre>
   */
  public static final class ClusterManagerBlockingStub extends io.grpc.stub.AbstractStub<ClusterManagerBlockingStub> {
    private ClusterManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterManagerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all clusters owned by a project in either the specified zone or all
     * zones.
     * </pre>
     */
    public com.google.container.v1.ListClustersResponse listClusters(com.google.container.v1.ListClustersRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_CLUSTERS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the details of a specific cluster.
     * </pre>
     */
    public com.google.container.v1.Cluster getCluster(com.google.container.v1.GetClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CLUSTER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a cluster, consisting of the specified number and type of Google
     * Compute Engine instances.
     * By default, the cluster is created in the project's
     * [default network](/compute/docs/networks-and-firewalls#networks).
     * One firewall is added for the cluster. After cluster creation,
     * the cluster creates routes for each node to allow the containers
     * on that node to communicate with all other instances in the
     * cluster.
     * Finally, an entry is added to the project's global metadata indicating
     * which CIDR range is being used by the cluster.
     * </pre>
     */
    public com.google.container.v1.Operation createCluster(com.google.container.v1.CreateClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_CLUSTER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the settings of a specific cluster.
     * </pre>
     */
    public com.google.container.v1.Operation updateCluster(com.google.container.v1.UpdateClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_CLUSTER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the cluster, including the Kubernetes endpoint and all worker
     * nodes.
     * Firewalls and routes that were configured during cluster creation
     * are also deleted.
     * Other Google Compute Engine resources that might be in use by the cluster
     * (e.g. load balancer resources) will not be deleted if they weren't present
     * at the initial create time.
     * </pre>
     */
    public com.google.container.v1.Operation deleteCluster(com.google.container.v1.DeleteClusterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_CLUSTER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all operations in a project in a specific zone or all zones.
     * </pre>
     */
    public com.google.container.v1.ListOperationsResponse listOperations(com.google.container.v1.ListOperationsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_OPERATIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the specified operation.
     * </pre>
     */
    public com.google.container.v1.Operation getOperation(com.google.container.v1.GetOperationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_OPERATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancels the specified operation.
     * </pre>
     */
    public com.google.protobuf.Empty cancelOperation(com.google.container.v1.CancelOperationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CANCEL_OPERATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns configuration info about the Container Engine service.
     * </pre>
     */
    public com.google.container.v1.ServerConfig getServerConfig(com.google.container.v1.GetServerConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SERVER_CONFIG, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the node pools for a cluster.
     * </pre>
     */
    public com.google.container.v1.ListNodePoolsResponse listNodePools(com.google.container.v1.ListNodePoolsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_NODE_POOLS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the node pool requested.
     * </pre>
     */
    public com.google.container.v1.NodePool getNodePool(com.google.container.v1.GetNodePoolRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_NODE_POOL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a node pool for a cluster.
     * </pre>
     */
    public com.google.container.v1.Operation createNodePool(com.google.container.v1.CreateNodePoolRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_NODE_POOL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a node pool from a cluster.
     * </pre>
     */
    public com.google.container.v1.Operation deleteNodePool(com.google.container.v1.DeleteNodePoolRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_NODE_POOL, getCallOptions(), request);
    }

    /**
     * <pre>
     * Roll back the previously Aborted or Failed NodePool upgrade.
     * This will be an no-op if the last upgrade successfully completed.
     * </pre>
     */
    public com.google.container.v1.Operation rollbackNodePoolUpgrade(com.google.container.v1.RollbackNodePoolUpgradeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ROLLBACK_NODE_POOL_UPGRADE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the NodeManagement options for a node pool.
     * </pre>
     */
    public com.google.container.v1.Operation setNodePoolManagement(com.google.container.v1.SetNodePoolManagementRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_NODE_POOL_MANAGEMENT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Google Container Engine Cluster Manager v1
   * </pre>
   */
  public static final class ClusterManagerFutureStub extends io.grpc.stub.AbstractStub<ClusterManagerFutureStub> {
    private ClusterManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClusterManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClusterManagerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all clusters owned by a project in either the specified zone or all
     * zones.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.ListClustersResponse> listClusters(
        com.google.container.v1.ListClustersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_CLUSTERS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the details of a specific cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Cluster> getCluster(
        com.google.container.v1.GetClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CLUSTER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a cluster, consisting of the specified number and type of Google
     * Compute Engine instances.
     * By default, the cluster is created in the project's
     * [default network](/compute/docs/networks-and-firewalls#networks).
     * One firewall is added for the cluster. After cluster creation,
     * the cluster creates routes for each node to allow the containers
     * on that node to communicate with all other instances in the
     * cluster.
     * Finally, an entry is added to the project's global metadata indicating
     * which CIDR range is being used by the cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> createCluster(
        com.google.container.v1.CreateClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_CLUSTER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the settings of a specific cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> updateCluster(
        com.google.container.v1.UpdateClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CLUSTER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the cluster, including the Kubernetes endpoint and all worker
     * nodes.
     * Firewalls and routes that were configured during cluster creation
     * are also deleted.
     * Other Google Compute Engine resources that might be in use by the cluster
     * (e.g. load balancer resources) will not be deleted if they weren't present
     * at the initial create time.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> deleteCluster(
        com.google.container.v1.DeleteClusterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_CLUSTER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all operations in a project in a specific zone or all zones.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.ListOperationsResponse> listOperations(
        com.google.container.v1.ListOperationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_OPERATIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the specified operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> getOperation(
        com.google.container.v1.GetOperationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_OPERATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancels the specified operation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancelOperation(
        com.google.container.v1.CancelOperationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CANCEL_OPERATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns configuration info about the Container Engine service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.ServerConfig> getServerConfig(
        com.google.container.v1.GetServerConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SERVER_CONFIG, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the node pools for a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.ListNodePoolsResponse> listNodePools(
        com.google.container.v1.ListNodePoolsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_NODE_POOLS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the node pool requested.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.NodePool> getNodePool(
        com.google.container.v1.GetNodePoolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_NODE_POOL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a node pool for a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> createNodePool(
        com.google.container.v1.CreateNodePoolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_NODE_POOL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a node pool from a cluster.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> deleteNodePool(
        com.google.container.v1.DeleteNodePoolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_NODE_POOL, getCallOptions()), request);
    }

    /**
     * <pre>
     * Roll back the previously Aborted or Failed NodePool upgrade.
     * This will be an no-op if the last upgrade successfully completed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> rollbackNodePoolUpgrade(
        com.google.container.v1.RollbackNodePoolUpgradeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ROLLBACK_NODE_POOL_UPGRADE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the NodeManagement options for a node pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.container.v1.Operation> setNodePoolManagement(
        com.google.container.v1.SetNodePoolManagementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_NODE_POOL_MANAGEMENT, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_CLUSTERS = 0;
  private static final int METHODID_GET_CLUSTER = 1;
  private static final int METHODID_CREATE_CLUSTER = 2;
  private static final int METHODID_UPDATE_CLUSTER = 3;
  private static final int METHODID_DELETE_CLUSTER = 4;
  private static final int METHODID_LIST_OPERATIONS = 5;
  private static final int METHODID_GET_OPERATION = 6;
  private static final int METHODID_CANCEL_OPERATION = 7;
  private static final int METHODID_GET_SERVER_CONFIG = 8;
  private static final int METHODID_LIST_NODE_POOLS = 9;
  private static final int METHODID_GET_NODE_POOL = 10;
  private static final int METHODID_CREATE_NODE_POOL = 11;
  private static final int METHODID_DELETE_NODE_POOL = 12;
  private static final int METHODID_ROLLBACK_NODE_POOL_UPGRADE = 13;
  private static final int METHODID_SET_NODE_POOL_MANAGEMENT = 14;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClusterManagerImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ClusterManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_CLUSTERS:
          serviceImpl.listClusters((com.google.container.v1.ListClustersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.ListClustersResponse>) responseObserver);
          break;
        case METHODID_GET_CLUSTER:
          serviceImpl.getCluster((com.google.container.v1.GetClusterRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Cluster>) responseObserver);
          break;
        case METHODID_CREATE_CLUSTER:
          serviceImpl.createCluster((com.google.container.v1.CreateClusterRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_CLUSTER:
          serviceImpl.updateCluster((com.google.container.v1.UpdateClusterRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_DELETE_CLUSTER:
          serviceImpl.deleteCluster((com.google.container.v1.DeleteClusterRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_LIST_OPERATIONS:
          serviceImpl.listOperations((com.google.container.v1.ListOperationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.ListOperationsResponse>) responseObserver);
          break;
        case METHODID_GET_OPERATION:
          serviceImpl.getOperation((com.google.container.v1.GetOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_CANCEL_OPERATION:
          serviceImpl.cancelOperation((com.google.container.v1.CancelOperationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_SERVER_CONFIG:
          serviceImpl.getServerConfig((com.google.container.v1.GetServerConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.ServerConfig>) responseObserver);
          break;
        case METHODID_LIST_NODE_POOLS:
          serviceImpl.listNodePools((com.google.container.v1.ListNodePoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.ListNodePoolsResponse>) responseObserver);
          break;
        case METHODID_GET_NODE_POOL:
          serviceImpl.getNodePool((com.google.container.v1.GetNodePoolRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.NodePool>) responseObserver);
          break;
        case METHODID_CREATE_NODE_POOL:
          serviceImpl.createNodePool((com.google.container.v1.CreateNodePoolRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_DELETE_NODE_POOL:
          serviceImpl.deleteNodePool((com.google.container.v1.DeleteNodePoolRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_ROLLBACK_NODE_POOL_UPGRADE:
          serviceImpl.rollbackNodePoolUpgrade((com.google.container.v1.RollbackNodePoolUpgradeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
          break;
        case METHODID_SET_NODE_POOL_MANAGEMENT:
          serviceImpl.setNodePoolManagement((com.google.container.v1.SetNodePoolManagementRequest) request,
              (io.grpc.stub.StreamObserver<com.google.container.v1.Operation>) responseObserver);
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
        METHOD_LIST_CLUSTERS,
        METHOD_GET_CLUSTER,
        METHOD_CREATE_CLUSTER,
        METHOD_UPDATE_CLUSTER,
        METHOD_DELETE_CLUSTER,
        METHOD_LIST_OPERATIONS,
        METHOD_GET_OPERATION,
        METHOD_CANCEL_OPERATION,
        METHOD_GET_SERVER_CONFIG,
        METHOD_LIST_NODE_POOLS,
        METHOD_GET_NODE_POOL,
        METHOD_CREATE_NODE_POOL,
        METHOD_DELETE_NODE_POOL,
        METHOD_ROLLBACK_NODE_POOL_UPGRADE,
        METHOD_SET_NODE_POOL_MANAGEMENT);
  }

}
