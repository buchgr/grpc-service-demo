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
 * This service provides storage and positional retrieval of genomic
 * reference annotations, including variant annotations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/genomics/v1/annotations.proto")
public class AnnotationServiceV1Grpc {

  private AnnotationServiceV1Grpc() {}

  public static final String SERVICE_NAME = "google.genomics.v1.AnnotationServiceV1";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.CreateAnnotationSetRequest,
      com.google.genomics.v1.AnnotationSet> METHOD_CREATE_ANNOTATION_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.AnnotationServiceV1", "CreateAnnotationSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.CreateAnnotationSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.AnnotationSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.GetAnnotationSetRequest,
      com.google.genomics.v1.AnnotationSet> METHOD_GET_ANNOTATION_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.AnnotationServiceV1", "GetAnnotationSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.GetAnnotationSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.AnnotationSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.UpdateAnnotationSetRequest,
      com.google.genomics.v1.AnnotationSet> METHOD_UPDATE_ANNOTATION_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.AnnotationServiceV1", "UpdateAnnotationSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.UpdateAnnotationSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.AnnotationSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.DeleteAnnotationSetRequest,
      com.google.protobuf.Empty> METHOD_DELETE_ANNOTATION_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.AnnotationServiceV1", "DeleteAnnotationSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.DeleteAnnotationSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.SearchAnnotationSetsRequest,
      com.google.genomics.v1.SearchAnnotationSetsResponse> METHOD_SEARCH_ANNOTATION_SETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.AnnotationServiceV1", "SearchAnnotationSets"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchAnnotationSetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchAnnotationSetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.CreateAnnotationRequest,
      com.google.genomics.v1.Annotation> METHOD_CREATE_ANNOTATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.AnnotationServiceV1", "CreateAnnotation"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.CreateAnnotationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.Annotation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.BatchCreateAnnotationsRequest,
      com.google.genomics.v1.BatchCreateAnnotationsResponse> METHOD_BATCH_CREATE_ANNOTATIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.AnnotationServiceV1", "BatchCreateAnnotations"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.BatchCreateAnnotationsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.BatchCreateAnnotationsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.GetAnnotationRequest,
      com.google.genomics.v1.Annotation> METHOD_GET_ANNOTATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.AnnotationServiceV1", "GetAnnotation"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.GetAnnotationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.Annotation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.UpdateAnnotationRequest,
      com.google.genomics.v1.Annotation> METHOD_UPDATE_ANNOTATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.AnnotationServiceV1", "UpdateAnnotation"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.UpdateAnnotationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.Annotation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.DeleteAnnotationRequest,
      com.google.protobuf.Empty> METHOD_DELETE_ANNOTATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.AnnotationServiceV1", "DeleteAnnotation"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.DeleteAnnotationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.SearchAnnotationsRequest,
      com.google.genomics.v1.SearchAnnotationsResponse> METHOD_SEARCH_ANNOTATIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.AnnotationServiceV1", "SearchAnnotations"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchAnnotationsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchAnnotationsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnnotationServiceV1Stub newStub(io.grpc.Channel channel) {
    return new AnnotationServiceV1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnnotationServiceV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AnnotationServiceV1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static AnnotationServiceV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AnnotationServiceV1FutureStub(channel);
  }

  /**
   * <pre>
   * This service provides storage and positional retrieval of genomic
   * reference annotations, including variant annotations.
   * </pre>
   */
  public static abstract class AnnotationServiceV1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a new annotation set. Caller must have WRITE permission for the
     * associated dataset.
     * The following fields are required:
     *   * [datasetId][google.genomics.v1.AnnotationSet.dataset_id]
     *   * [referenceSetId][google.genomics.v1.AnnotationSet.reference_set_id]
     * All other fields may be optionally specified, unless documented as being
     * server-generated (for example, the `id` field).
     * </pre>
     */
    public void createAnnotationSet(com.google.genomics.v1.CreateAnnotationSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.AnnotationSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_ANNOTATION_SET, responseObserver);
    }

    /**
     * <pre>
     * Gets an annotation set. Caller must have READ permission for
     * the associated dataset.
     * </pre>
     */
    public void getAnnotationSet(com.google.genomics.v1.GetAnnotationSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.AnnotationSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ANNOTATION_SET, responseObserver);
    }

    /**
     * <pre>
     * Updates an annotation set. The update must respect all mutability
     * restrictions and other invariants described on the annotation set resource.
     * Caller must have WRITE permission for the associated dataset.
     * </pre>
     */
    public void updateAnnotationSet(com.google.genomics.v1.UpdateAnnotationSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.AnnotationSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_ANNOTATION_SET, responseObserver);
    }

    /**
     * <pre>
     * Deletes an annotation set. Caller must have WRITE permission
     * for the associated annotation set.
     * </pre>
     */
    public void deleteAnnotationSet(com.google.genomics.v1.DeleteAnnotationSetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_ANNOTATION_SET, responseObserver);
    }

    /**
     * <pre>
     * Searches for annotation sets that match the given criteria. Annotation sets
     * are returned in an unspecified order. This order is consistent, such that
     * two queries for the same content (regardless of page size) yield annotation
     * sets in the same order across their respective streams of paginated
     * responses. Caller must have READ permission for the queried datasets.
     * </pre>
     */
    public void searchAnnotationSets(com.google.genomics.v1.SearchAnnotationSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchAnnotationSetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_ANNOTATION_SETS, responseObserver);
    }

    /**
     * <pre>
     * Creates a new annotation. Caller must have WRITE permission
     * for the associated annotation set.
     * The following fields are required:
     * * [annotationSetId][google.genomics.v1.Annotation.annotation_set_id]
     * * [referenceName][google.genomics.v1.Annotation.reference_name] or
     *   [referenceId][google.genomics.v1.Annotation.reference_id]
     * ### Transcripts
     * For annotations of type TRANSCRIPT, the following fields of
     * [transcript][google.genomics.v1.Annotation.transcript] must be provided:
     * * [exons.start][google.genomics.v1.Transcript.Exon.start]
     * * [exons.end][google.genomics.v1.Transcript.Exon.end]
     * All other fields may be optionally specified, unless documented as being
     * server-generated (for example, the `id` field). The annotated
     * range must be no longer than 100Mbp (mega base pairs). See the
     * [Annotation resource][google.genomics.v1.Annotation]
     * for additional restrictions on each field.
     * </pre>
     */
    public void createAnnotation(com.google.genomics.v1.CreateAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Annotation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_ANNOTATION, responseObserver);
    }

    /**
     * <pre>
     * Creates one or more new annotations atomically. All annotations must
     * belong to the same annotation set. Caller must have WRITE
     * permission for this annotation set. For optimal performance, batch
     * positionally adjacent annotations together.
     * If the request has a systemic issue, such as an attempt to write to
     * an inaccessible annotation set, the entire RPC will fail accordingly. For
     * lesser data issues, when possible an error will be isolated to the
     * corresponding batch entry in the response; the remaining well formed
     * annotations will be created normally.
     * For details on the requirements for each individual annotation resource,
     * see
     * [CreateAnnotation][google.genomics.v1.AnnotationServiceV1.CreateAnnotation].
     * </pre>
     */
    public void batchCreateAnnotations(com.google.genomics.v1.BatchCreateAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.BatchCreateAnnotationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BATCH_CREATE_ANNOTATIONS, responseObserver);
    }

    /**
     * <pre>
     * Gets an annotation. Caller must have READ permission
     * for the associated annotation set.
     * </pre>
     */
    public void getAnnotation(com.google.genomics.v1.GetAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Annotation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ANNOTATION, responseObserver);
    }

    /**
     * <pre>
     * Updates an annotation. Caller must have
     * WRITE permission for the associated dataset.
     * </pre>
     */
    public void updateAnnotation(com.google.genomics.v1.UpdateAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Annotation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_ANNOTATION, responseObserver);
    }

    /**
     * <pre>
     * Deletes an annotation. Caller must have WRITE permission for
     * the associated annotation set.
     * </pre>
     */
    public void deleteAnnotation(com.google.genomics.v1.DeleteAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_ANNOTATION, responseObserver);
    }

    /**
     * <pre>
     * Searches for annotations that match the given criteria. Results are
     * ordered by genomic coordinate (by reference sequence, then position).
     * Annotations with equivalent genomic coordinates are returned in an
     * unspecified order. This order is consistent, such that two queries for the
     * same content (regardless of page size) yield annotations in the same order
     * across their respective streams of paginated responses. Caller must have
     * READ permission for the queried annotation sets.
     * </pre>
     */
    public void searchAnnotations(com.google.genomics.v1.SearchAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchAnnotationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_ANNOTATIONS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_ANNOTATION_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.CreateAnnotationSetRequest,
                com.google.genomics.v1.AnnotationSet>(
                  this, METHODID_CREATE_ANNOTATION_SET)))
          .addMethod(
            METHOD_GET_ANNOTATION_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.GetAnnotationSetRequest,
                com.google.genomics.v1.AnnotationSet>(
                  this, METHODID_GET_ANNOTATION_SET)))
          .addMethod(
            METHOD_UPDATE_ANNOTATION_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.UpdateAnnotationSetRequest,
                com.google.genomics.v1.AnnotationSet>(
                  this, METHODID_UPDATE_ANNOTATION_SET)))
          .addMethod(
            METHOD_DELETE_ANNOTATION_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.DeleteAnnotationSetRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ANNOTATION_SET)))
          .addMethod(
            METHOD_SEARCH_ANNOTATION_SETS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.SearchAnnotationSetsRequest,
                com.google.genomics.v1.SearchAnnotationSetsResponse>(
                  this, METHODID_SEARCH_ANNOTATION_SETS)))
          .addMethod(
            METHOD_CREATE_ANNOTATION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.CreateAnnotationRequest,
                com.google.genomics.v1.Annotation>(
                  this, METHODID_CREATE_ANNOTATION)))
          .addMethod(
            METHOD_BATCH_CREATE_ANNOTATIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.BatchCreateAnnotationsRequest,
                com.google.genomics.v1.BatchCreateAnnotationsResponse>(
                  this, METHODID_BATCH_CREATE_ANNOTATIONS)))
          .addMethod(
            METHOD_GET_ANNOTATION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.GetAnnotationRequest,
                com.google.genomics.v1.Annotation>(
                  this, METHODID_GET_ANNOTATION)))
          .addMethod(
            METHOD_UPDATE_ANNOTATION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.UpdateAnnotationRequest,
                com.google.genomics.v1.Annotation>(
                  this, METHODID_UPDATE_ANNOTATION)))
          .addMethod(
            METHOD_DELETE_ANNOTATION,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.DeleteAnnotationRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ANNOTATION)))
          .addMethod(
            METHOD_SEARCH_ANNOTATIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.SearchAnnotationsRequest,
                com.google.genomics.v1.SearchAnnotationsResponse>(
                  this, METHODID_SEARCH_ANNOTATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * This service provides storage and positional retrieval of genomic
   * reference annotations, including variant annotations.
   * </pre>
   */
  public static final class AnnotationServiceV1Stub extends io.grpc.stub.AbstractStub<AnnotationServiceV1Stub> {
    private AnnotationServiceV1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnnotationServiceV1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnnotationServiceV1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnnotationServiceV1Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new annotation set. Caller must have WRITE permission for the
     * associated dataset.
     * The following fields are required:
     *   * [datasetId][google.genomics.v1.AnnotationSet.dataset_id]
     *   * [referenceSetId][google.genomics.v1.AnnotationSet.reference_set_id]
     * All other fields may be optionally specified, unless documented as being
     * server-generated (for example, the `id` field).
     * </pre>
     */
    public void createAnnotationSet(com.google.genomics.v1.CreateAnnotationSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.AnnotationSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_ANNOTATION_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an annotation set. Caller must have READ permission for
     * the associated dataset.
     * </pre>
     */
    public void getAnnotationSet(com.google.genomics.v1.GetAnnotationSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.AnnotationSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ANNOTATION_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an annotation set. The update must respect all mutability
     * restrictions and other invariants described on the annotation set resource.
     * Caller must have WRITE permission for the associated dataset.
     * </pre>
     */
    public void updateAnnotationSet(com.google.genomics.v1.UpdateAnnotationSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.AnnotationSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ANNOTATION_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an annotation set. Caller must have WRITE permission
     * for the associated annotation set.
     * </pre>
     */
    public void deleteAnnotationSet(com.google.genomics.v1.DeleteAnnotationSetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_ANNOTATION_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Searches for annotation sets that match the given criteria. Annotation sets
     * are returned in an unspecified order. This order is consistent, such that
     * two queries for the same content (regardless of page size) yield annotation
     * sets in the same order across their respective streams of paginated
     * responses. Caller must have READ permission for the queried datasets.
     * </pre>
     */
    public void searchAnnotationSets(com.google.genomics.v1.SearchAnnotationSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchAnnotationSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_ANNOTATION_SETS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new annotation. Caller must have WRITE permission
     * for the associated annotation set.
     * The following fields are required:
     * * [annotationSetId][google.genomics.v1.Annotation.annotation_set_id]
     * * [referenceName][google.genomics.v1.Annotation.reference_name] or
     *   [referenceId][google.genomics.v1.Annotation.reference_id]
     * ### Transcripts
     * For annotations of type TRANSCRIPT, the following fields of
     * [transcript][google.genomics.v1.Annotation.transcript] must be provided:
     * * [exons.start][google.genomics.v1.Transcript.Exon.start]
     * * [exons.end][google.genomics.v1.Transcript.Exon.end]
     * All other fields may be optionally specified, unless documented as being
     * server-generated (for example, the `id` field). The annotated
     * range must be no longer than 100Mbp (mega base pairs). See the
     * [Annotation resource][google.genomics.v1.Annotation]
     * for additional restrictions on each field.
     * </pre>
     */
    public void createAnnotation(com.google.genomics.v1.CreateAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Annotation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_ANNOTATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates one or more new annotations atomically. All annotations must
     * belong to the same annotation set. Caller must have WRITE
     * permission for this annotation set. For optimal performance, batch
     * positionally adjacent annotations together.
     * If the request has a systemic issue, such as an attempt to write to
     * an inaccessible annotation set, the entire RPC will fail accordingly. For
     * lesser data issues, when possible an error will be isolated to the
     * corresponding batch entry in the response; the remaining well formed
     * annotations will be created normally.
     * For details on the requirements for each individual annotation resource,
     * see
     * [CreateAnnotation][google.genomics.v1.AnnotationServiceV1.CreateAnnotation].
     * </pre>
     */
    public void batchCreateAnnotations(com.google.genomics.v1.BatchCreateAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.BatchCreateAnnotationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BATCH_CREATE_ANNOTATIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an annotation. Caller must have READ permission
     * for the associated annotation set.
     * </pre>
     */
    public void getAnnotation(com.google.genomics.v1.GetAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Annotation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ANNOTATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an annotation. Caller must have
     * WRITE permission for the associated dataset.
     * </pre>
     */
    public void updateAnnotation(com.google.genomics.v1.UpdateAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Annotation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ANNOTATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an annotation. Caller must have WRITE permission for
     * the associated annotation set.
     * </pre>
     */
    public void deleteAnnotation(com.google.genomics.v1.DeleteAnnotationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_ANNOTATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Searches for annotations that match the given criteria. Results are
     * ordered by genomic coordinate (by reference sequence, then position).
     * Annotations with equivalent genomic coordinates are returned in an
     * unspecified order. This order is consistent, such that two queries for the
     * same content (regardless of page size) yield annotations in the same order
     * across their respective streams of paginated responses. Caller must have
     * READ permission for the queried annotation sets.
     * </pre>
     */
    public void searchAnnotations(com.google.genomics.v1.SearchAnnotationsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchAnnotationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_ANNOTATIONS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * This service provides storage and positional retrieval of genomic
   * reference annotations, including variant annotations.
   * </pre>
   */
  public static final class AnnotationServiceV1BlockingStub extends io.grpc.stub.AbstractStub<AnnotationServiceV1BlockingStub> {
    private AnnotationServiceV1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnnotationServiceV1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnnotationServiceV1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnnotationServiceV1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new annotation set. Caller must have WRITE permission for the
     * associated dataset.
     * The following fields are required:
     *   * [datasetId][google.genomics.v1.AnnotationSet.dataset_id]
     *   * [referenceSetId][google.genomics.v1.AnnotationSet.reference_set_id]
     * All other fields may be optionally specified, unless documented as being
     * server-generated (for example, the `id` field).
     * </pre>
     */
    public com.google.genomics.v1.AnnotationSet createAnnotationSet(com.google.genomics.v1.CreateAnnotationSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_ANNOTATION_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an annotation set. Caller must have READ permission for
     * the associated dataset.
     * </pre>
     */
    public com.google.genomics.v1.AnnotationSet getAnnotationSet(com.google.genomics.v1.GetAnnotationSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ANNOTATION_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an annotation set. The update must respect all mutability
     * restrictions and other invariants described on the annotation set resource.
     * Caller must have WRITE permission for the associated dataset.
     * </pre>
     */
    public com.google.genomics.v1.AnnotationSet updateAnnotationSet(com.google.genomics.v1.UpdateAnnotationSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_ANNOTATION_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an annotation set. Caller must have WRITE permission
     * for the associated annotation set.
     * </pre>
     */
    public com.google.protobuf.Empty deleteAnnotationSet(com.google.genomics.v1.DeleteAnnotationSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_ANNOTATION_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Searches for annotation sets that match the given criteria. Annotation sets
     * are returned in an unspecified order. This order is consistent, such that
     * two queries for the same content (regardless of page size) yield annotation
     * sets in the same order across their respective streams of paginated
     * responses. Caller must have READ permission for the queried datasets.
     * </pre>
     */
    public com.google.genomics.v1.SearchAnnotationSetsResponse searchAnnotationSets(com.google.genomics.v1.SearchAnnotationSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_ANNOTATION_SETS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new annotation. Caller must have WRITE permission
     * for the associated annotation set.
     * The following fields are required:
     * * [annotationSetId][google.genomics.v1.Annotation.annotation_set_id]
     * * [referenceName][google.genomics.v1.Annotation.reference_name] or
     *   [referenceId][google.genomics.v1.Annotation.reference_id]
     * ### Transcripts
     * For annotations of type TRANSCRIPT, the following fields of
     * [transcript][google.genomics.v1.Annotation.transcript] must be provided:
     * * [exons.start][google.genomics.v1.Transcript.Exon.start]
     * * [exons.end][google.genomics.v1.Transcript.Exon.end]
     * All other fields may be optionally specified, unless documented as being
     * server-generated (for example, the `id` field). The annotated
     * range must be no longer than 100Mbp (mega base pairs). See the
     * [Annotation resource][google.genomics.v1.Annotation]
     * for additional restrictions on each field.
     * </pre>
     */
    public com.google.genomics.v1.Annotation createAnnotation(com.google.genomics.v1.CreateAnnotationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_ANNOTATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates one or more new annotations atomically. All annotations must
     * belong to the same annotation set. Caller must have WRITE
     * permission for this annotation set. For optimal performance, batch
     * positionally adjacent annotations together.
     * If the request has a systemic issue, such as an attempt to write to
     * an inaccessible annotation set, the entire RPC will fail accordingly. For
     * lesser data issues, when possible an error will be isolated to the
     * corresponding batch entry in the response; the remaining well formed
     * annotations will be created normally.
     * For details on the requirements for each individual annotation resource,
     * see
     * [CreateAnnotation][google.genomics.v1.AnnotationServiceV1.CreateAnnotation].
     * </pre>
     */
    public com.google.genomics.v1.BatchCreateAnnotationsResponse batchCreateAnnotations(com.google.genomics.v1.BatchCreateAnnotationsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BATCH_CREATE_ANNOTATIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an annotation. Caller must have READ permission
     * for the associated annotation set.
     * </pre>
     */
    public com.google.genomics.v1.Annotation getAnnotation(com.google.genomics.v1.GetAnnotationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ANNOTATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an annotation. Caller must have
     * WRITE permission for the associated dataset.
     * </pre>
     */
    public com.google.genomics.v1.Annotation updateAnnotation(com.google.genomics.v1.UpdateAnnotationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_ANNOTATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an annotation. Caller must have WRITE permission for
     * the associated annotation set.
     * </pre>
     */
    public com.google.protobuf.Empty deleteAnnotation(com.google.genomics.v1.DeleteAnnotationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_ANNOTATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Searches for annotations that match the given criteria. Results are
     * ordered by genomic coordinate (by reference sequence, then position).
     * Annotations with equivalent genomic coordinates are returned in an
     * unspecified order. This order is consistent, such that two queries for the
     * same content (regardless of page size) yield annotations in the same order
     * across their respective streams of paginated responses. Caller must have
     * READ permission for the queried annotation sets.
     * </pre>
     */
    public com.google.genomics.v1.SearchAnnotationsResponse searchAnnotations(com.google.genomics.v1.SearchAnnotationsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_ANNOTATIONS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * This service provides storage and positional retrieval of genomic
   * reference annotations, including variant annotations.
   * </pre>
   */
  public static final class AnnotationServiceV1FutureStub extends io.grpc.stub.AbstractStub<AnnotationServiceV1FutureStub> {
    private AnnotationServiceV1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnnotationServiceV1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnnotationServiceV1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnnotationServiceV1FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new annotation set. Caller must have WRITE permission for the
     * associated dataset.
     * The following fields are required:
     *   * [datasetId][google.genomics.v1.AnnotationSet.dataset_id]
     *   * [referenceSetId][google.genomics.v1.AnnotationSet.reference_set_id]
     * All other fields may be optionally specified, unless documented as being
     * server-generated (for example, the `id` field).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.AnnotationSet> createAnnotationSet(
        com.google.genomics.v1.CreateAnnotationSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_ANNOTATION_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an annotation set. Caller must have READ permission for
     * the associated dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.AnnotationSet> getAnnotationSet(
        com.google.genomics.v1.GetAnnotationSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ANNOTATION_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an annotation set. The update must respect all mutability
     * restrictions and other invariants described on the annotation set resource.
     * Caller must have WRITE permission for the associated dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.AnnotationSet> updateAnnotationSet(
        com.google.genomics.v1.UpdateAnnotationSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ANNOTATION_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an annotation set. Caller must have WRITE permission
     * for the associated annotation set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAnnotationSet(
        com.google.genomics.v1.DeleteAnnotationSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_ANNOTATION_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Searches for annotation sets that match the given criteria. Annotation sets
     * are returned in an unspecified order. This order is consistent, such that
     * two queries for the same content (regardless of page size) yield annotation
     * sets in the same order across their respective streams of paginated
     * responses. Caller must have READ permission for the queried datasets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.SearchAnnotationSetsResponse> searchAnnotationSets(
        com.google.genomics.v1.SearchAnnotationSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_ANNOTATION_SETS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new annotation. Caller must have WRITE permission
     * for the associated annotation set.
     * The following fields are required:
     * * [annotationSetId][google.genomics.v1.Annotation.annotation_set_id]
     * * [referenceName][google.genomics.v1.Annotation.reference_name] or
     *   [referenceId][google.genomics.v1.Annotation.reference_id]
     * ### Transcripts
     * For annotations of type TRANSCRIPT, the following fields of
     * [transcript][google.genomics.v1.Annotation.transcript] must be provided:
     * * [exons.start][google.genomics.v1.Transcript.Exon.start]
     * * [exons.end][google.genomics.v1.Transcript.Exon.end]
     * All other fields may be optionally specified, unless documented as being
     * server-generated (for example, the `id` field). The annotated
     * range must be no longer than 100Mbp (mega base pairs). See the
     * [Annotation resource][google.genomics.v1.Annotation]
     * for additional restrictions on each field.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.Annotation> createAnnotation(
        com.google.genomics.v1.CreateAnnotationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_ANNOTATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates one or more new annotations atomically. All annotations must
     * belong to the same annotation set. Caller must have WRITE
     * permission for this annotation set. For optimal performance, batch
     * positionally adjacent annotations together.
     * If the request has a systemic issue, such as an attempt to write to
     * an inaccessible annotation set, the entire RPC will fail accordingly. For
     * lesser data issues, when possible an error will be isolated to the
     * corresponding batch entry in the response; the remaining well formed
     * annotations will be created normally.
     * For details on the requirements for each individual annotation resource,
     * see
     * [CreateAnnotation][google.genomics.v1.AnnotationServiceV1.CreateAnnotation].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.BatchCreateAnnotationsResponse> batchCreateAnnotations(
        com.google.genomics.v1.BatchCreateAnnotationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BATCH_CREATE_ANNOTATIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an annotation. Caller must have READ permission
     * for the associated annotation set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.Annotation> getAnnotation(
        com.google.genomics.v1.GetAnnotationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ANNOTATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an annotation. Caller must have
     * WRITE permission for the associated dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.Annotation> updateAnnotation(
        com.google.genomics.v1.UpdateAnnotationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ANNOTATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an annotation. Caller must have WRITE permission for
     * the associated annotation set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAnnotation(
        com.google.genomics.v1.DeleteAnnotationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_ANNOTATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Searches for annotations that match the given criteria. Results are
     * ordered by genomic coordinate (by reference sequence, then position).
     * Annotations with equivalent genomic coordinates are returned in an
     * unspecified order. This order is consistent, such that two queries for the
     * same content (regardless of page size) yield annotations in the same order
     * across their respective streams of paginated responses. Caller must have
     * READ permission for the queried annotation sets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.SearchAnnotationsResponse> searchAnnotations(
        com.google.genomics.v1.SearchAnnotationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_ANNOTATIONS, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ANNOTATION_SET = 0;
  private static final int METHODID_GET_ANNOTATION_SET = 1;
  private static final int METHODID_UPDATE_ANNOTATION_SET = 2;
  private static final int METHODID_DELETE_ANNOTATION_SET = 3;
  private static final int METHODID_SEARCH_ANNOTATION_SETS = 4;
  private static final int METHODID_CREATE_ANNOTATION = 5;
  private static final int METHODID_BATCH_CREATE_ANNOTATIONS = 6;
  private static final int METHODID_GET_ANNOTATION = 7;
  private static final int METHODID_UPDATE_ANNOTATION = 8;
  private static final int METHODID_DELETE_ANNOTATION = 9;
  private static final int METHODID_SEARCH_ANNOTATIONS = 10;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnnotationServiceV1ImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(AnnotationServiceV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ANNOTATION_SET:
          serviceImpl.createAnnotationSet((com.google.genomics.v1.CreateAnnotationSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.AnnotationSet>) responseObserver);
          break;
        case METHODID_GET_ANNOTATION_SET:
          serviceImpl.getAnnotationSet((com.google.genomics.v1.GetAnnotationSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.AnnotationSet>) responseObserver);
          break;
        case METHODID_UPDATE_ANNOTATION_SET:
          serviceImpl.updateAnnotationSet((com.google.genomics.v1.UpdateAnnotationSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.AnnotationSet>) responseObserver);
          break;
        case METHODID_DELETE_ANNOTATION_SET:
          serviceImpl.deleteAnnotationSet((com.google.genomics.v1.DeleteAnnotationSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEARCH_ANNOTATION_SETS:
          serviceImpl.searchAnnotationSets((com.google.genomics.v1.SearchAnnotationSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchAnnotationSetsResponse>) responseObserver);
          break;
        case METHODID_CREATE_ANNOTATION:
          serviceImpl.createAnnotation((com.google.genomics.v1.CreateAnnotationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.Annotation>) responseObserver);
          break;
        case METHODID_BATCH_CREATE_ANNOTATIONS:
          serviceImpl.batchCreateAnnotations((com.google.genomics.v1.BatchCreateAnnotationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.BatchCreateAnnotationsResponse>) responseObserver);
          break;
        case METHODID_GET_ANNOTATION:
          serviceImpl.getAnnotation((com.google.genomics.v1.GetAnnotationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.Annotation>) responseObserver);
          break;
        case METHODID_UPDATE_ANNOTATION:
          serviceImpl.updateAnnotation((com.google.genomics.v1.UpdateAnnotationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.Annotation>) responseObserver);
          break;
        case METHODID_DELETE_ANNOTATION:
          serviceImpl.deleteAnnotation((com.google.genomics.v1.DeleteAnnotationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEARCH_ANNOTATIONS:
          serviceImpl.searchAnnotations((com.google.genomics.v1.SearchAnnotationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchAnnotationsResponse>) responseObserver);
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
        METHOD_CREATE_ANNOTATION_SET,
        METHOD_GET_ANNOTATION_SET,
        METHOD_UPDATE_ANNOTATION_SET,
        METHOD_DELETE_ANNOTATION_SET,
        METHOD_SEARCH_ANNOTATION_SETS,
        METHOD_CREATE_ANNOTATION,
        METHOD_BATCH_CREATE_ANNOTATIONS,
        METHOD_GET_ANNOTATION,
        METHOD_UPDATE_ANNOTATION,
        METHOD_DELETE_ANNOTATION,
        METHOD_SEARCH_ANNOTATIONS);
  }

}
