package com.google.datastore.v1beta3;

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
 * Each RPC normalizes the partition IDs of the keys in its input entities,
 * and always returns entities with keys with normalized partition IDs.
 * This applies to all keys and entities, including those in values, except keys
 * with both an empty path and an empty or unset partition ID. Normalization of
 * input keys sets the project ID (if not already set) to the project ID from
 * the request.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/datastore/v1beta3/datastore.proto")
public class DatastoreGrpc {

  private DatastoreGrpc() {}

  public static final String SERVICE_NAME = "google.datastore.v1beta3.Datastore";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.datastore.v1beta3.LookupRequest,
      com.google.datastore.v1beta3.LookupResponse> METHOD_LOOKUP =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.datastore.v1beta3.Datastore", "Lookup"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.datastore.v1beta3.LookupRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.datastore.v1beta3.LookupResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.datastore.v1beta3.RunQueryRequest,
      com.google.datastore.v1beta3.RunQueryResponse> METHOD_RUN_QUERY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.datastore.v1beta3.Datastore", "RunQuery"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.datastore.v1beta3.RunQueryRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.datastore.v1beta3.RunQueryResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.datastore.v1beta3.BeginTransactionRequest,
      com.google.datastore.v1beta3.BeginTransactionResponse> METHOD_BEGIN_TRANSACTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.datastore.v1beta3.Datastore", "BeginTransaction"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.datastore.v1beta3.BeginTransactionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.datastore.v1beta3.BeginTransactionResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.datastore.v1beta3.CommitRequest,
      com.google.datastore.v1beta3.CommitResponse> METHOD_COMMIT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.datastore.v1beta3.Datastore", "Commit"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.datastore.v1beta3.CommitRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.datastore.v1beta3.CommitResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.datastore.v1beta3.RollbackRequest,
      com.google.datastore.v1beta3.RollbackResponse> METHOD_ROLLBACK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.datastore.v1beta3.Datastore", "Rollback"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.datastore.v1beta3.RollbackRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.datastore.v1beta3.RollbackResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.datastore.v1beta3.AllocateIdsRequest,
      com.google.datastore.v1beta3.AllocateIdsResponse> METHOD_ALLOCATE_IDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.datastore.v1beta3.Datastore", "AllocateIds"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.datastore.v1beta3.AllocateIdsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.datastore.v1beta3.AllocateIdsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatastoreStub newStub(io.grpc.Channel channel) {
    return new DatastoreStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatastoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DatastoreBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static DatastoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DatastoreFutureStub(channel);
  }

  /**
   * <pre>
   * Each RPC normalizes the partition IDs of the keys in its input entities,
   * and always returns entities with keys with normalized partition IDs.
   * This applies to all keys and entities, including those in values, except keys
   * with both an empty path and an empty or unset partition ID. Normalization of
   * input keys sets the project ID (if not already set) to the project ID from
   * the request.
   * </pre>
   */
  public static abstract class DatastoreImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Looks up entities by key.
     * </pre>
     */
    public void lookup(com.google.datastore.v1beta3.LookupRequest request,
        io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.LookupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOOKUP, responseObserver);
    }

    /**
     * <pre>
     * Queries for entities.
     * </pre>
     */
    public void runQuery(com.google.datastore.v1beta3.RunQueryRequest request,
        io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.RunQueryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RUN_QUERY, responseObserver);
    }

    /**
     * <pre>
     * Begins a new transaction.
     * </pre>
     */
    public void beginTransaction(com.google.datastore.v1beta3.BeginTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.BeginTransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BEGIN_TRANSACTION, responseObserver);
    }

    /**
     * <pre>
     * Commits a transaction, optionally creating, deleting or modifying some
     * entities.
     * </pre>
     */
    public void commit(com.google.datastore.v1beta3.CommitRequest request,
        io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.CommitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COMMIT, responseObserver);
    }

    /**
     * <pre>
     * Rolls back a transaction.
     * </pre>
     */
    public void rollback(com.google.datastore.v1beta3.RollbackRequest request,
        io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.RollbackResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ROLLBACK, responseObserver);
    }

    /**
     * <pre>
     * Allocates IDs for the given keys, which is useful for referencing an entity
     * before it is inserted.
     * </pre>
     */
    public void allocateIds(com.google.datastore.v1beta3.AllocateIdsRequest request,
        io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.AllocateIdsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ALLOCATE_IDS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LOOKUP,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.datastore.v1beta3.LookupRequest,
                com.google.datastore.v1beta3.LookupResponse>(
                  this, METHODID_LOOKUP)))
          .addMethod(
            METHOD_RUN_QUERY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.datastore.v1beta3.RunQueryRequest,
                com.google.datastore.v1beta3.RunQueryResponse>(
                  this, METHODID_RUN_QUERY)))
          .addMethod(
            METHOD_BEGIN_TRANSACTION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.datastore.v1beta3.BeginTransactionRequest,
                com.google.datastore.v1beta3.BeginTransactionResponse>(
                  this, METHODID_BEGIN_TRANSACTION)))
          .addMethod(
            METHOD_COMMIT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.datastore.v1beta3.CommitRequest,
                com.google.datastore.v1beta3.CommitResponse>(
                  this, METHODID_COMMIT)))
          .addMethod(
            METHOD_ROLLBACK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.datastore.v1beta3.RollbackRequest,
                com.google.datastore.v1beta3.RollbackResponse>(
                  this, METHODID_ROLLBACK)))
          .addMethod(
            METHOD_ALLOCATE_IDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.datastore.v1beta3.AllocateIdsRequest,
                com.google.datastore.v1beta3.AllocateIdsResponse>(
                  this, METHODID_ALLOCATE_IDS)))
          .build();
    }
  }

  /**
   * <pre>
   * Each RPC normalizes the partition IDs of the keys in its input entities,
   * and always returns entities with keys with normalized partition IDs.
   * This applies to all keys and entities, including those in values, except keys
   * with both an empty path and an empty or unset partition ID. Normalization of
   * input keys sets the project ID (if not already set) to the project ID from
   * the request.
   * </pre>
   */
  public static final class DatastoreStub extends io.grpc.stub.AbstractStub<DatastoreStub> {
    private DatastoreStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatastoreStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatastoreStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatastoreStub(channel, callOptions);
    }

    /**
     * <pre>
     * Looks up entities by key.
     * </pre>
     */
    public void lookup(com.google.datastore.v1beta3.LookupRequest request,
        io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.LookupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOOKUP, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries for entities.
     * </pre>
     */
    public void runQuery(com.google.datastore.v1beta3.RunQueryRequest request,
        io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.RunQueryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RUN_QUERY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Begins a new transaction.
     * </pre>
     */
    public void beginTransaction(com.google.datastore.v1beta3.BeginTransactionRequest request,
        io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.BeginTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BEGIN_TRANSACTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Commits a transaction, optionally creating, deleting or modifying some
     * entities.
     * </pre>
     */
    public void commit(com.google.datastore.v1beta3.CommitRequest request,
        io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.CommitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COMMIT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rolls back a transaction.
     * </pre>
     */
    public void rollback(com.google.datastore.v1beta3.RollbackRequest request,
        io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.RollbackResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ROLLBACK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Allocates IDs for the given keys, which is useful for referencing an entity
     * before it is inserted.
     * </pre>
     */
    public void allocateIds(com.google.datastore.v1beta3.AllocateIdsRequest request,
        io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.AllocateIdsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ALLOCATE_IDS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Each RPC normalizes the partition IDs of the keys in its input entities,
   * and always returns entities with keys with normalized partition IDs.
   * This applies to all keys and entities, including those in values, except keys
   * with both an empty path and an empty or unset partition ID. Normalization of
   * input keys sets the project ID (if not already set) to the project ID from
   * the request.
   * </pre>
   */
  public static final class DatastoreBlockingStub extends io.grpc.stub.AbstractStub<DatastoreBlockingStub> {
    private DatastoreBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatastoreBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatastoreBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatastoreBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Looks up entities by key.
     * </pre>
     */
    public com.google.datastore.v1beta3.LookupResponse lookup(com.google.datastore.v1beta3.LookupRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOOKUP, getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries for entities.
     * </pre>
     */
    public com.google.datastore.v1beta3.RunQueryResponse runQuery(com.google.datastore.v1beta3.RunQueryRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RUN_QUERY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Begins a new transaction.
     * </pre>
     */
    public com.google.datastore.v1beta3.BeginTransactionResponse beginTransaction(com.google.datastore.v1beta3.BeginTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BEGIN_TRANSACTION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Commits a transaction, optionally creating, deleting or modifying some
     * entities.
     * </pre>
     */
    public com.google.datastore.v1beta3.CommitResponse commit(com.google.datastore.v1beta3.CommitRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COMMIT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Rolls back a transaction.
     * </pre>
     */
    public com.google.datastore.v1beta3.RollbackResponse rollback(com.google.datastore.v1beta3.RollbackRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ROLLBACK, getCallOptions(), request);
    }

    /**
     * <pre>
     * Allocates IDs for the given keys, which is useful for referencing an entity
     * before it is inserted.
     * </pre>
     */
    public com.google.datastore.v1beta3.AllocateIdsResponse allocateIds(com.google.datastore.v1beta3.AllocateIdsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ALLOCATE_IDS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Each RPC normalizes the partition IDs of the keys in its input entities,
   * and always returns entities with keys with normalized partition IDs.
   * This applies to all keys and entities, including those in values, except keys
   * with both an empty path and an empty or unset partition ID. Normalization of
   * input keys sets the project ID (if not already set) to the project ID from
   * the request.
   * </pre>
   */
  public static final class DatastoreFutureStub extends io.grpc.stub.AbstractStub<DatastoreFutureStub> {
    private DatastoreFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DatastoreFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatastoreFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DatastoreFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Looks up entities by key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.datastore.v1beta3.LookupResponse> lookup(
        com.google.datastore.v1beta3.LookupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOOKUP, getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries for entities.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.datastore.v1beta3.RunQueryResponse> runQuery(
        com.google.datastore.v1beta3.RunQueryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RUN_QUERY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Begins a new transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.datastore.v1beta3.BeginTransactionResponse> beginTransaction(
        com.google.datastore.v1beta3.BeginTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BEGIN_TRANSACTION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Commits a transaction, optionally creating, deleting or modifying some
     * entities.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.datastore.v1beta3.CommitResponse> commit(
        com.google.datastore.v1beta3.CommitRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COMMIT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Rolls back a transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.datastore.v1beta3.RollbackResponse> rollback(
        com.google.datastore.v1beta3.RollbackRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ROLLBACK, getCallOptions()), request);
    }

    /**
     * <pre>
     * Allocates IDs for the given keys, which is useful for referencing an entity
     * before it is inserted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.datastore.v1beta3.AllocateIdsResponse> allocateIds(
        com.google.datastore.v1beta3.AllocateIdsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ALLOCATE_IDS, getCallOptions()), request);
    }
  }

  private static final int METHODID_LOOKUP = 0;
  private static final int METHODID_RUN_QUERY = 1;
  private static final int METHODID_BEGIN_TRANSACTION = 2;
  private static final int METHODID_COMMIT = 3;
  private static final int METHODID_ROLLBACK = 4;
  private static final int METHODID_ALLOCATE_IDS = 5;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DatastoreImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(DatastoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOOKUP:
          serviceImpl.lookup((com.google.datastore.v1beta3.LookupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.LookupResponse>) responseObserver);
          break;
        case METHODID_RUN_QUERY:
          serviceImpl.runQuery((com.google.datastore.v1beta3.RunQueryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.RunQueryResponse>) responseObserver);
          break;
        case METHODID_BEGIN_TRANSACTION:
          serviceImpl.beginTransaction((com.google.datastore.v1beta3.BeginTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.BeginTransactionResponse>) responseObserver);
          break;
        case METHODID_COMMIT:
          serviceImpl.commit((com.google.datastore.v1beta3.CommitRequest) request,
              (io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.CommitResponse>) responseObserver);
          break;
        case METHODID_ROLLBACK:
          serviceImpl.rollback((com.google.datastore.v1beta3.RollbackRequest) request,
              (io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.RollbackResponse>) responseObserver);
          break;
        case METHODID_ALLOCATE_IDS:
          serviceImpl.allocateIds((com.google.datastore.v1beta3.AllocateIdsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.datastore.v1beta3.AllocateIdsResponse>) responseObserver);
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
        METHOD_LOOKUP,
        METHOD_RUN_QUERY,
        METHOD_BEGIN_TRANSACTION,
        METHOD_COMMIT,
        METHOD_ROLLBACK,
        METHOD_ALLOCATE_IDS);
  }

}
