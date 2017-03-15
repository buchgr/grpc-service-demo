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
    comments = "Source: google/genomics/v1/reads.proto")
public class StreamingReadServiceGrpc {

  private StreamingReadServiceGrpc() {}

  public static final String SERVICE_NAME = "google.genomics.v1.StreamingReadService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.StreamReadsRequest,
      com.google.genomics.v1.StreamReadsResponse> METHOD_STREAM_READS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "google.genomics.v1.StreamingReadService", "StreamReads"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.StreamReadsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.StreamReadsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StreamingReadServiceStub newStub(io.grpc.Channel channel) {
    return new StreamingReadServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StreamingReadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StreamingReadServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static StreamingReadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StreamingReadServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StreamingReadServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns a stream of all the reads matching the search request, ordered
     * by reference name, position, and ID.
     * </pre>
     */
    public void streamReads(com.google.genomics.v1.StreamReadsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.StreamReadsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_STREAM_READS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_STREAM_READS,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.genomics.v1.StreamReadsRequest,
                com.google.genomics.v1.StreamReadsResponse>(
                  this, METHODID_STREAM_READS)))
          .build();
    }
  }

  /**
   */
  public static final class StreamingReadServiceStub extends io.grpc.stub.AbstractStub<StreamingReadServiceStub> {
    private StreamingReadServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamingReadServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamingReadServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamingReadServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a stream of all the reads matching the search request, ordered
     * by reference name, position, and ID.
     * </pre>
     */
    public void streamReads(com.google.genomics.v1.StreamReadsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.StreamReadsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_STREAM_READS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StreamingReadServiceBlockingStub extends io.grpc.stub.AbstractStub<StreamingReadServiceBlockingStub> {
    private StreamingReadServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamingReadServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamingReadServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamingReadServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a stream of all the reads matching the search request, ordered
     * by reference name, position, and ID.
     * </pre>
     */
    public java.util.Iterator<com.google.genomics.v1.StreamReadsResponse> streamReads(
        com.google.genomics.v1.StreamReadsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_STREAM_READS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StreamingReadServiceFutureStub extends io.grpc.stub.AbstractStub<StreamingReadServiceFutureStub> {
    private StreamingReadServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreamingReadServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamingReadServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreamingReadServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_READS = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StreamingReadServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(StreamingReadServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_READS:
          serviceImpl.streamReads((com.google.genomics.v1.StreamReadsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.StreamReadsResponse>) responseObserver);
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
        METHOD_STREAM_READS);
  }

}
