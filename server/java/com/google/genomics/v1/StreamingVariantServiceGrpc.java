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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/genomics/v1/variants.proto")
public class StreamingVariantServiceGrpc {

  private StreamingVariantServiceGrpc() {}

  public static final String SERVICE_NAME = "google.genomics.v1.StreamingVariantService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.StreamVariantsRequest,
      com.google.genomics.v1.StreamVariantsResponse> METHOD_STREAM_VARIANTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "google.genomics.v1.StreamingVariantService", "StreamVariants"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.StreamVariantsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.StreamVariantsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StreamingVariantServiceStub newStub(io.grpc.Channel channel) {
    return new StreamingVariantServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StreamingVariantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StreamingVariantServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static StreamingVariantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StreamingVariantServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StreamingVariantServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns a stream of all the variants matching the search request, ordered
     * by reference name, position, and ID.
     * </pre>
     */
    public void streamVariants(com.google.genomics.v1.StreamVariantsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.StreamVariantsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_STREAM_VARIANTS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_STREAM_VARIANTS,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.genomics.v1.StreamVariantsRequest,
                com.google.genomics.v1.StreamVariantsResponse>(
                  this, METHODID_STREAM_VARIANTS)))
          .build();
    }
  }

  /**
   */
  public static final class StreamingVariantServiceStub extends io.grpc.stub.AbstractStub<StreamingVariantServiceStub> {
    private StreamingVariantServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamingVariantServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamingVariantServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamingVariantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a stream of all the variants matching the search request, ordered
     * by reference name, position, and ID.
     * </pre>
     */
    public void streamVariants(com.google.genomics.v1.StreamVariantsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.StreamVariantsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_STREAM_VARIANTS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StreamingVariantServiceBlockingStub extends io.grpc.stub.AbstractStub<StreamingVariantServiceBlockingStub> {
    private StreamingVariantServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamingVariantServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamingVariantServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamingVariantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a stream of all the variants matching the search request, ordered
     * by reference name, position, and ID.
     * </pre>
     */
    public java.util.Iterator<com.google.genomics.v1.StreamVariantsResponse> streamVariants(
        com.google.genomics.v1.StreamVariantsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_STREAM_VARIANTS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StreamingVariantServiceFutureStub extends io.grpc.stub.AbstractStub<StreamingVariantServiceFutureStub> {
    private StreamingVariantServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamingVariantServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamingVariantServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamingVariantServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_VARIANTS = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StreamingVariantServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(StreamingVariantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_VARIANTS:
          serviceImpl.streamVariants((com.google.genomics.v1.StreamVariantsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.StreamVariantsResponse>) responseObserver);
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
        METHOD_STREAM_VARIANTS);
  }

}
