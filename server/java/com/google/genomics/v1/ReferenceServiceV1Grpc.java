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
    comments = "Source: google/genomics/v1/references.proto")
public class ReferenceServiceV1Grpc {

  private ReferenceServiceV1Grpc() {}

  public static final String SERVICE_NAME = "google.genomics.v1.ReferenceServiceV1";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.SearchReferenceSetsRequest,
      com.google.genomics.v1.SearchReferenceSetsResponse> METHOD_SEARCH_REFERENCE_SETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.ReferenceServiceV1", "SearchReferenceSets"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchReferenceSetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchReferenceSetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.GetReferenceSetRequest,
      com.google.genomics.v1.ReferenceSet> METHOD_GET_REFERENCE_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.ReferenceServiceV1", "GetReferenceSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.GetReferenceSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.ReferenceSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.SearchReferencesRequest,
      com.google.genomics.v1.SearchReferencesResponse> METHOD_SEARCH_REFERENCES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.ReferenceServiceV1", "SearchReferences"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchReferencesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchReferencesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.GetReferenceRequest,
      com.google.genomics.v1.Reference> METHOD_GET_REFERENCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.ReferenceServiceV1", "GetReference"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.GetReferenceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.Reference.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.ListBasesRequest,
      com.google.genomics.v1.ListBasesResponse> METHOD_LIST_BASES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.ReferenceServiceV1", "ListBases"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.ListBasesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.ListBasesResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReferenceServiceV1Stub newStub(io.grpc.Channel channel) {
    return new ReferenceServiceV1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReferenceServiceV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReferenceServiceV1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ReferenceServiceV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReferenceServiceV1FutureStub(channel);
  }

  /**
   */
  public static abstract class ReferenceServiceV1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Searches for reference sets which match the given criteria.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchReferenceSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L71)
     * </pre>
     */
    public void searchReferenceSets(com.google.genomics.v1.SearchReferenceSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchReferenceSetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_REFERENCE_SETS, responseObserver);
    }

    /**
     * <pre>
     * Gets a reference set.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.getReferenceSet](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L83).
     * </pre>
     */
    public void getReferenceSet(com.google.genomics.v1.GetReferenceSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.ReferenceSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_REFERENCE_SET, responseObserver);
    }

    /**
     * <pre>
     * Searches for references which match the given criteria.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchReferences](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L146).
     * </pre>
     */
    public void searchReferences(com.google.genomics.v1.SearchReferencesRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchReferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_REFERENCES, responseObserver);
    }

    /**
     * <pre>
     * Gets a reference.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.getReference](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L158).
     * </pre>
     */
    public void getReference(com.google.genomics.v1.GetReferenceRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Reference> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_REFERENCE, responseObserver);
    }

    /**
     * <pre>
     * Lists the bases in a reference, optionally restricted to a range.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.getReferenceBases](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L221).
     * </pre>
     */
    public void listBases(com.google.genomics.v1.ListBasesRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.ListBasesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_BASES, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SEARCH_REFERENCE_SETS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.SearchReferenceSetsRequest,
                com.google.genomics.v1.SearchReferenceSetsResponse>(
                  this, METHODID_SEARCH_REFERENCE_SETS)))
          .addMethod(
            METHOD_GET_REFERENCE_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.GetReferenceSetRequest,
                com.google.genomics.v1.ReferenceSet>(
                  this, METHODID_GET_REFERENCE_SET)))
          .addMethod(
            METHOD_SEARCH_REFERENCES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.SearchReferencesRequest,
                com.google.genomics.v1.SearchReferencesResponse>(
                  this, METHODID_SEARCH_REFERENCES)))
          .addMethod(
            METHOD_GET_REFERENCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.GetReferenceRequest,
                com.google.genomics.v1.Reference>(
                  this, METHODID_GET_REFERENCE)))
          .addMethod(
            METHOD_LIST_BASES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.ListBasesRequest,
                com.google.genomics.v1.ListBasesResponse>(
                  this, METHODID_LIST_BASES)))
          .build();
    }
  }

  /**
   */
  public static final class ReferenceServiceV1Stub extends io.grpc.stub.AbstractStub<ReferenceServiceV1Stub> {
    private ReferenceServiceV1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReferenceServiceV1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReferenceServiceV1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReferenceServiceV1Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Searches for reference sets which match the given criteria.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchReferenceSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L71)
     * </pre>
     */
    public void searchReferenceSets(com.google.genomics.v1.SearchReferenceSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchReferenceSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_REFERENCE_SETS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a reference set.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.getReferenceSet](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L83).
     * </pre>
     */
    public void getReferenceSet(com.google.genomics.v1.GetReferenceSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.ReferenceSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_REFERENCE_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Searches for references which match the given criteria.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchReferences](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L146).
     * </pre>
     */
    public void searchReferences(com.google.genomics.v1.SearchReferencesRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchReferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_REFERENCES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a reference.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.getReference](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L158).
     * </pre>
     */
    public void getReference(com.google.genomics.v1.GetReferenceRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Reference> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_REFERENCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the bases in a reference, optionally restricted to a range.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.getReferenceBases](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L221).
     * </pre>
     */
    public void listBases(com.google.genomics.v1.ListBasesRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.ListBasesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_BASES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReferenceServiceV1BlockingStub extends io.grpc.stub.AbstractStub<ReferenceServiceV1BlockingStub> {
    private ReferenceServiceV1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReferenceServiceV1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReferenceServiceV1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReferenceServiceV1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Searches for reference sets which match the given criteria.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchReferenceSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L71)
     * </pre>
     */
    public com.google.genomics.v1.SearchReferenceSetsResponse searchReferenceSets(com.google.genomics.v1.SearchReferenceSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_REFERENCE_SETS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a reference set.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.getReferenceSet](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L83).
     * </pre>
     */
    public com.google.genomics.v1.ReferenceSet getReferenceSet(com.google.genomics.v1.GetReferenceSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_REFERENCE_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Searches for references which match the given criteria.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchReferences](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L146).
     * </pre>
     */
    public com.google.genomics.v1.SearchReferencesResponse searchReferences(com.google.genomics.v1.SearchReferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_REFERENCES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a reference.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.getReference](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L158).
     * </pre>
     */
    public com.google.genomics.v1.Reference getReference(com.google.genomics.v1.GetReferenceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_REFERENCE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the bases in a reference, optionally restricted to a range.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.getReferenceBases](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L221).
     * </pre>
     */
    public com.google.genomics.v1.ListBasesResponse listBases(com.google.genomics.v1.ListBasesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_BASES, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReferenceServiceV1FutureStub extends io.grpc.stub.AbstractStub<ReferenceServiceV1FutureStub> {
    private ReferenceServiceV1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReferenceServiceV1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReferenceServiceV1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReferenceServiceV1FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Searches for reference sets which match the given criteria.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchReferenceSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L71)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.SearchReferenceSetsResponse> searchReferenceSets(
        com.google.genomics.v1.SearchReferenceSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_REFERENCE_SETS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a reference set.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.getReferenceSet](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L83).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.ReferenceSet> getReferenceSet(
        com.google.genomics.v1.GetReferenceSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_REFERENCE_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Searches for references which match the given criteria.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchReferences](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L146).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.SearchReferencesResponse> searchReferences(
        com.google.genomics.v1.SearchReferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_REFERENCES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a reference.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.getReference](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L158).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.Reference> getReference(
        com.google.genomics.v1.GetReferenceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_REFERENCE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the bases in a reference, optionally restricted to a range.
     * For the definitions of references and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.getReferenceBases](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L221).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.ListBasesResponse> listBases(
        com.google.genomics.v1.ListBasesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_BASES, getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_REFERENCE_SETS = 0;
  private static final int METHODID_GET_REFERENCE_SET = 1;
  private static final int METHODID_SEARCH_REFERENCES = 2;
  private static final int METHODID_GET_REFERENCE = 3;
  private static final int METHODID_LIST_BASES = 4;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReferenceServiceV1ImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ReferenceServiceV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_REFERENCE_SETS:
          serviceImpl.searchReferenceSets((com.google.genomics.v1.SearchReferenceSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchReferenceSetsResponse>) responseObserver);
          break;
        case METHODID_GET_REFERENCE_SET:
          serviceImpl.getReferenceSet((com.google.genomics.v1.GetReferenceSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.ReferenceSet>) responseObserver);
          break;
        case METHODID_SEARCH_REFERENCES:
          serviceImpl.searchReferences((com.google.genomics.v1.SearchReferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchReferencesResponse>) responseObserver);
          break;
        case METHODID_GET_REFERENCE:
          serviceImpl.getReference((com.google.genomics.v1.GetReferenceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.Reference>) responseObserver);
          break;
        case METHODID_LIST_BASES:
          serviceImpl.listBases((com.google.genomics.v1.ListBasesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.ListBasesResponse>) responseObserver);
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
        METHOD_SEARCH_REFERENCE_SETS,
        METHOD_GET_REFERENCE_SET,
        METHOD_SEARCH_REFERENCES,
        METHOD_GET_REFERENCE,
        METHOD_LIST_BASES);
  }

}
