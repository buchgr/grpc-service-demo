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
public class VariantServiceV1Grpc {

  private VariantServiceV1Grpc() {}

  public static final String SERVICE_NAME = "google.genomics.v1.VariantServiceV1";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.ImportVariantsRequest,
      com.google.longrunning.Operation> METHOD_IMPORT_VARIANTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "ImportVariants"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.ImportVariantsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.CreateVariantSetRequest,
      com.google.genomics.v1.VariantSet> METHOD_CREATE_VARIANT_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "CreateVariantSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.CreateVariantSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.VariantSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.ExportVariantSetRequest,
      com.google.longrunning.Operation> METHOD_EXPORT_VARIANT_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "ExportVariantSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.ExportVariantSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.GetVariantSetRequest,
      com.google.genomics.v1.VariantSet> METHOD_GET_VARIANT_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "GetVariantSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.GetVariantSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.VariantSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.SearchVariantSetsRequest,
      com.google.genomics.v1.SearchVariantSetsResponse> METHOD_SEARCH_VARIANT_SETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "SearchVariantSets"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchVariantSetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchVariantSetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.DeleteVariantSetRequest,
      com.google.protobuf.Empty> METHOD_DELETE_VARIANT_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "DeleteVariantSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.DeleteVariantSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.UpdateVariantSetRequest,
      com.google.genomics.v1.VariantSet> METHOD_UPDATE_VARIANT_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "UpdateVariantSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.UpdateVariantSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.VariantSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.SearchVariantsRequest,
      com.google.genomics.v1.SearchVariantsResponse> METHOD_SEARCH_VARIANTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "SearchVariants"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchVariantsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchVariantsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.CreateVariantRequest,
      com.google.genomics.v1.Variant> METHOD_CREATE_VARIANT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "CreateVariant"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.CreateVariantRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.Variant.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.UpdateVariantRequest,
      com.google.genomics.v1.Variant> METHOD_UPDATE_VARIANT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "UpdateVariant"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.UpdateVariantRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.Variant.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.DeleteVariantRequest,
      com.google.protobuf.Empty> METHOD_DELETE_VARIANT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "DeleteVariant"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.DeleteVariantRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.GetVariantRequest,
      com.google.genomics.v1.Variant> METHOD_GET_VARIANT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "GetVariant"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.GetVariantRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.Variant.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.MergeVariantsRequest,
      com.google.protobuf.Empty> METHOD_MERGE_VARIANTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "MergeVariants"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.MergeVariantsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.SearchCallSetsRequest,
      com.google.genomics.v1.SearchCallSetsResponse> METHOD_SEARCH_CALL_SETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "SearchCallSets"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchCallSetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchCallSetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.CreateCallSetRequest,
      com.google.genomics.v1.CallSet> METHOD_CREATE_CALL_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "CreateCallSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.CreateCallSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.CallSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.UpdateCallSetRequest,
      com.google.genomics.v1.CallSet> METHOD_UPDATE_CALL_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "UpdateCallSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.UpdateCallSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.CallSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.DeleteCallSetRequest,
      com.google.protobuf.Empty> METHOD_DELETE_CALL_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "DeleteCallSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.DeleteCallSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.GetCallSetRequest,
      com.google.genomics.v1.CallSet> METHOD_GET_CALL_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.VariantServiceV1", "GetCallSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.GetCallSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.CallSet.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VariantServiceV1Stub newStub(io.grpc.Channel channel) {
    return new VariantServiceV1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VariantServiceV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VariantServiceV1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static VariantServiceV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VariantServiceV1FutureStub(channel);
  }

  /**
   */
  public static abstract class VariantServiceV1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates variant data by asynchronously importing the provided information.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * The variants for import will be merged with any existing variant that
     * matches its reference sequence, start, end, reference bases, and
     * alternative bases. If no such variant exists, a new one will be created.
     * When variants are merged, the call information from the new variant
     * is added to the existing variant, and Variant info fields are merged
     * as specified in
     * [infoMergeConfig][google.genomics.v1.ImportVariantsRequest.info_merge_config].
     * As a special case, for single-sample VCF files, QUAL and FILTER fields will
     * be moved to the call level; these are sometimes interpreted in a
     * call-specific context.
     * Imported VCF headers are appended to the metadata already in a variant set.
     * </pre>
     */
    public void importVariants(com.google.genomics.v1.ImportVariantsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IMPORT_VARIANTS, responseObserver);
    }

    /**
     * <pre>
     * Creates a new variant set.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * The provided variant set must have a valid `datasetId` set - all other
     * fields are optional. Note that the `id` field will be ignored, as this is
     * assigned by the server.
     * </pre>
     */
    public void createVariantSet(com.google.genomics.v1.CreateVariantSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.VariantSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_VARIANT_SET, responseObserver);
    }

    /**
     * <pre>
     * Exports variant set data to an external destination.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void exportVariantSet(com.google.genomics.v1.ExportVariantSetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXPORT_VARIANT_SET, responseObserver);
    }

    /**
     * <pre>
     * Gets a variant set by ID.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void getVariantSet(com.google.genomics.v1.GetVariantSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.VariantSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_VARIANT_SET, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of all variant sets matching search criteria.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchVariantSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L49).
     * </pre>
     */
    public void searchVariantSets(com.google.genomics.v1.SearchVariantSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchVariantSetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_VARIANT_SETS, responseObserver);
    }

    /**
     * <pre>
     * Deletes a variant set including all variants, call sets, and calls within.
     * This is not reversible.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void deleteVariantSet(com.google.genomics.v1.DeleteVariantSetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_VARIANT_SET, responseObserver);
    }

    /**
     * <pre>
     * Updates a variant set using patch semantics.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void updateVariantSet(com.google.genomics.v1.UpdateVariantSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.VariantSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_VARIANT_SET, responseObserver);
    }

    /**
     * <pre>
     * Gets a list of variants matching the criteria.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchVariants](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L126).
     * </pre>
     */
    public void searchVariants(com.google.genomics.v1.SearchVariantsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchVariantsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_VARIANTS, responseObserver);
    }

    /**
     * <pre>
     * Creates a new variant.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void createVariant(com.google.genomics.v1.CreateVariantRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Variant> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_VARIANT, responseObserver);
    }

    /**
     * <pre>
     * Updates a variant.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This method supports patch semantics. Returns the modified variant without
     * its calls.
     * </pre>
     */
    public void updateVariant(com.google.genomics.v1.UpdateVariantRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Variant> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_VARIANT, responseObserver);
    }

    /**
     * <pre>
     * Deletes a variant.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void deleteVariant(com.google.genomics.v1.DeleteVariantRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_VARIANT, responseObserver);
    }

    /**
     * <pre>
     * Gets a variant by ID.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void getVariant(com.google.genomics.v1.GetVariantRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Variant> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_VARIANT, responseObserver);
    }

    /**
     * <pre>
     * Merges the given variants with existing variants.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Each variant will be
     * merged with an existing variant that matches its reference sequence,
     * start, end, reference bases, and alternative bases. If no such variant
     * exists, a new one will be created.
     * When variants are merged, the call information from the new variant
     * is added to the existing variant. Variant info fields are merged as
     * specified in the
     * [infoMergeConfig][google.genomics.v1.MergeVariantsRequest.info_merge_config]
     * field of the MergeVariantsRequest.
     * Please exercise caution when using this method!  It is easy to introduce
     * mistakes in existing variants and difficult to back out of them.  For
     * example,
     * suppose you were trying to merge a new variant with an existing one and
     * both
     * variants contain calls that belong to callsets with the same callset ID.
     *     // Existing variant - irrelevant fields trimmed for clarity
     *     {
     *         "variantSetId": "10473108253681171589",
     *         "referenceName": "1",
     *         "start": "10582",
     *         "referenceBases": "G",
     *         "alternateBases": [
     *             "A"
     *         ],
     *         "calls": [
     *             {
     *                 "callSetId": "10473108253681171589-0",
     *                 "callSetName": "CALLSET0",
     *                 "genotype": [
     *                     0,
     *                     1
     *                 ],
     *             }
     *         ]
     *     }
     *     // New variant with conflicting call information
     *     {
     *         "variantSetId": "10473108253681171589",
     *         "referenceName": "1",
     *         "start": "10582",
     *         "referenceBases": "G",
     *         "alternateBases": [
     *             "A"
     *         ],
     *         "calls": [
     *             {
     *                 "callSetId": "10473108253681171589-0",
     *                 "callSetName": "CALLSET0",
     *                 "genotype": [
     *                     1,
     *                     1
     *                 ],
     *             }
     *         ]
     *     }
     * The resulting merged variant would overwrite the existing calls with those
     * from the new variant:
     *     {
     *         "variantSetId": "10473108253681171589",
     *         "referenceName": "1",
     *         "start": "10582",
     *         "referenceBases": "G",
     *         "alternateBases": [
     *             "A"
     *         ],
     *         "calls": [
     *             {
     *                 "callSetId": "10473108253681171589-0",
     *                 "callSetName": "CALLSET0",
     *                 "genotype": [
     *                     1,
     *                     1
     *                 ],
     *             }
     *         ]
     *     }
     * This may be the desired outcome, but it is up to the user to determine if
     * if that is indeed the case.
     * </pre>
     */
    public void mergeVariants(com.google.genomics.v1.MergeVariantsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MERGE_VARIANTS, responseObserver);
    }

    /**
     * <pre>
     * Gets a list of call sets matching the criteria.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchCallSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L178).
     * </pre>
     */
    public void searchCallSets(com.google.genomics.v1.SearchCallSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchCallSetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_CALL_SETS, responseObserver);
    }

    /**
     * <pre>
     * Creates a new call set.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void createCallSet(com.google.genomics.v1.CreateCallSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.CallSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_CALL_SET, responseObserver);
    }

    /**
     * <pre>
     * Updates a call set.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This method supports patch semantics.
     * </pre>
     */
    public void updateCallSet(com.google.genomics.v1.UpdateCallSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.CallSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_CALL_SET, responseObserver);
    }

    /**
     * <pre>
     * Deletes a call set.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void deleteCallSet(com.google.genomics.v1.DeleteCallSetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_CALL_SET, responseObserver);
    }

    /**
     * <pre>
     * Gets a call set by ID.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void getCallSet(com.google.genomics.v1.GetCallSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.CallSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CALL_SET, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_IMPORT_VARIANTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.ImportVariantsRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_IMPORT_VARIANTS)))
          .addMethod(
            METHOD_CREATE_VARIANT_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.CreateVariantSetRequest,
                com.google.genomics.v1.VariantSet>(
                  this, METHODID_CREATE_VARIANT_SET)))
          .addMethod(
            METHOD_EXPORT_VARIANT_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.ExportVariantSetRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_EXPORT_VARIANT_SET)))
          .addMethod(
            METHOD_GET_VARIANT_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.GetVariantSetRequest,
                com.google.genomics.v1.VariantSet>(
                  this, METHODID_GET_VARIANT_SET)))
          .addMethod(
            METHOD_SEARCH_VARIANT_SETS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.SearchVariantSetsRequest,
                com.google.genomics.v1.SearchVariantSetsResponse>(
                  this, METHODID_SEARCH_VARIANT_SETS)))
          .addMethod(
            METHOD_DELETE_VARIANT_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.DeleteVariantSetRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_VARIANT_SET)))
          .addMethod(
            METHOD_UPDATE_VARIANT_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.UpdateVariantSetRequest,
                com.google.genomics.v1.VariantSet>(
                  this, METHODID_UPDATE_VARIANT_SET)))
          .addMethod(
            METHOD_SEARCH_VARIANTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.SearchVariantsRequest,
                com.google.genomics.v1.SearchVariantsResponse>(
                  this, METHODID_SEARCH_VARIANTS)))
          .addMethod(
            METHOD_CREATE_VARIANT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.CreateVariantRequest,
                com.google.genomics.v1.Variant>(
                  this, METHODID_CREATE_VARIANT)))
          .addMethod(
            METHOD_UPDATE_VARIANT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.UpdateVariantRequest,
                com.google.genomics.v1.Variant>(
                  this, METHODID_UPDATE_VARIANT)))
          .addMethod(
            METHOD_DELETE_VARIANT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.DeleteVariantRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_VARIANT)))
          .addMethod(
            METHOD_GET_VARIANT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.GetVariantRequest,
                com.google.genomics.v1.Variant>(
                  this, METHODID_GET_VARIANT)))
          .addMethod(
            METHOD_MERGE_VARIANTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.MergeVariantsRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_MERGE_VARIANTS)))
          .addMethod(
            METHOD_SEARCH_CALL_SETS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.SearchCallSetsRequest,
                com.google.genomics.v1.SearchCallSetsResponse>(
                  this, METHODID_SEARCH_CALL_SETS)))
          .addMethod(
            METHOD_CREATE_CALL_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.CreateCallSetRequest,
                com.google.genomics.v1.CallSet>(
                  this, METHODID_CREATE_CALL_SET)))
          .addMethod(
            METHOD_UPDATE_CALL_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.UpdateCallSetRequest,
                com.google.genomics.v1.CallSet>(
                  this, METHODID_UPDATE_CALL_SET)))
          .addMethod(
            METHOD_DELETE_CALL_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.DeleteCallSetRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_CALL_SET)))
          .addMethod(
            METHOD_GET_CALL_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.GetCallSetRequest,
                com.google.genomics.v1.CallSet>(
                  this, METHODID_GET_CALL_SET)))
          .build();
    }
  }

  /**
   */
  public static final class VariantServiceV1Stub extends io.grpc.stub.AbstractStub<VariantServiceV1Stub> {
    private VariantServiceV1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private VariantServiceV1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VariantServiceV1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VariantServiceV1Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates variant data by asynchronously importing the provided information.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * The variants for import will be merged with any existing variant that
     * matches its reference sequence, start, end, reference bases, and
     * alternative bases. If no such variant exists, a new one will be created.
     * When variants are merged, the call information from the new variant
     * is added to the existing variant, and Variant info fields are merged
     * as specified in
     * [infoMergeConfig][google.genomics.v1.ImportVariantsRequest.info_merge_config].
     * As a special case, for single-sample VCF files, QUAL and FILTER fields will
     * be moved to the call level; these are sometimes interpreted in a
     * call-specific context.
     * Imported VCF headers are appended to the metadata already in a variant set.
     * </pre>
     */
    public void importVariants(com.google.genomics.v1.ImportVariantsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IMPORT_VARIANTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new variant set.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * The provided variant set must have a valid `datasetId` set - all other
     * fields are optional. Note that the `id` field will be ignored, as this is
     * assigned by the server.
     * </pre>
     */
    public void createVariantSet(com.google.genomics.v1.CreateVariantSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.VariantSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_VARIANT_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Exports variant set data to an external destination.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void exportVariantSet(com.google.genomics.v1.ExportVariantSetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EXPORT_VARIANT_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a variant set by ID.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void getVariantSet(com.google.genomics.v1.GetVariantSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.VariantSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_VARIANT_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of all variant sets matching search criteria.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchVariantSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L49).
     * </pre>
     */
    public void searchVariantSets(com.google.genomics.v1.SearchVariantSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchVariantSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANT_SETS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a variant set including all variants, call sets, and calls within.
     * This is not reversible.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void deleteVariantSet(com.google.genomics.v1.DeleteVariantSetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_VARIANT_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a variant set using patch semantics.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void updateVariantSet(com.google.genomics.v1.UpdateVariantSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.VariantSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_VARIANT_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a list of variants matching the criteria.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchVariants](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L126).
     * </pre>
     */
    public void searchVariants(com.google.genomics.v1.SearchVariantsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchVariantsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new variant.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void createVariant(com.google.genomics.v1.CreateVariantRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Variant> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_VARIANT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a variant.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This method supports patch semantics. Returns the modified variant without
     * its calls.
     * </pre>
     */
    public void updateVariant(com.google.genomics.v1.UpdateVariantRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Variant> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_VARIANT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a variant.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void deleteVariant(com.google.genomics.v1.DeleteVariantRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_VARIANT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a variant by ID.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void getVariant(com.google.genomics.v1.GetVariantRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.Variant> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_VARIANT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Merges the given variants with existing variants.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Each variant will be
     * merged with an existing variant that matches its reference sequence,
     * start, end, reference bases, and alternative bases. If no such variant
     * exists, a new one will be created.
     * When variants are merged, the call information from the new variant
     * is added to the existing variant. Variant info fields are merged as
     * specified in the
     * [infoMergeConfig][google.genomics.v1.MergeVariantsRequest.info_merge_config]
     * field of the MergeVariantsRequest.
     * Please exercise caution when using this method!  It is easy to introduce
     * mistakes in existing variants and difficult to back out of them.  For
     * example,
     * suppose you were trying to merge a new variant with an existing one and
     * both
     * variants contain calls that belong to callsets with the same callset ID.
     *     // Existing variant - irrelevant fields trimmed for clarity
     *     {
     *         "variantSetId": "10473108253681171589",
     *         "referenceName": "1",
     *         "start": "10582",
     *         "referenceBases": "G",
     *         "alternateBases": [
     *             "A"
     *         ],
     *         "calls": [
     *             {
     *                 "callSetId": "10473108253681171589-0",
     *                 "callSetName": "CALLSET0",
     *                 "genotype": [
     *                     0,
     *                     1
     *                 ],
     *             }
     *         ]
     *     }
     *     // New variant with conflicting call information
     *     {
     *         "variantSetId": "10473108253681171589",
     *         "referenceName": "1",
     *         "start": "10582",
     *         "referenceBases": "G",
     *         "alternateBases": [
     *             "A"
     *         ],
     *         "calls": [
     *             {
     *                 "callSetId": "10473108253681171589-0",
     *                 "callSetName": "CALLSET0",
     *                 "genotype": [
     *                     1,
     *                     1
     *                 ],
     *             }
     *         ]
     *     }
     * The resulting merged variant would overwrite the existing calls with those
     * from the new variant:
     *     {
     *         "variantSetId": "10473108253681171589",
     *         "referenceName": "1",
     *         "start": "10582",
     *         "referenceBases": "G",
     *         "alternateBases": [
     *             "A"
     *         ],
     *         "calls": [
     *             {
     *                 "callSetId": "10473108253681171589-0",
     *                 "callSetName": "CALLSET0",
     *                 "genotype": [
     *                     1,
     *                     1
     *                 ],
     *             }
     *         ]
     *     }
     * This may be the desired outcome, but it is up to the user to determine if
     * if that is indeed the case.
     * </pre>
     */
    public void mergeVariants(com.google.genomics.v1.MergeVariantsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MERGE_VARIANTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a list of call sets matching the criteria.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchCallSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L178).
     * </pre>
     */
    public void searchCallSets(com.google.genomics.v1.SearchCallSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchCallSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_CALL_SETS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new call set.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void createCallSet(com.google.genomics.v1.CreateCallSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.CallSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_CALL_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a call set.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This method supports patch semantics.
     * </pre>
     */
    public void updateCallSet(com.google.genomics.v1.UpdateCallSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.CallSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CALL_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a call set.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void deleteCallSet(com.google.genomics.v1.DeleteCallSetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_CALL_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a call set by ID.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void getCallSet(com.google.genomics.v1.GetCallSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.CallSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CALL_SET, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VariantServiceV1BlockingStub extends io.grpc.stub.AbstractStub<VariantServiceV1BlockingStub> {
    private VariantServiceV1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VariantServiceV1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VariantServiceV1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VariantServiceV1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates variant data by asynchronously importing the provided information.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * The variants for import will be merged with any existing variant that
     * matches its reference sequence, start, end, reference bases, and
     * alternative bases. If no such variant exists, a new one will be created.
     * When variants are merged, the call information from the new variant
     * is added to the existing variant, and Variant info fields are merged
     * as specified in
     * [infoMergeConfig][google.genomics.v1.ImportVariantsRequest.info_merge_config].
     * As a special case, for single-sample VCF files, QUAL and FILTER fields will
     * be moved to the call level; these are sometimes interpreted in a
     * call-specific context.
     * Imported VCF headers are appended to the metadata already in a variant set.
     * </pre>
     */
    public com.google.longrunning.Operation importVariants(com.google.genomics.v1.ImportVariantsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IMPORT_VARIANTS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new variant set.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * The provided variant set must have a valid `datasetId` set - all other
     * fields are optional. Note that the `id` field will be ignored, as this is
     * assigned by the server.
     * </pre>
     */
    public com.google.genomics.v1.VariantSet createVariantSet(com.google.genomics.v1.CreateVariantSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_VARIANT_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Exports variant set data to an external destination.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.longrunning.Operation exportVariantSet(com.google.genomics.v1.ExportVariantSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EXPORT_VARIANT_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a variant set by ID.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.genomics.v1.VariantSet getVariantSet(com.google.genomics.v1.GetVariantSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_VARIANT_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of all variant sets matching search criteria.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchVariantSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L49).
     * </pre>
     */
    public com.google.genomics.v1.SearchVariantSetsResponse searchVariantSets(com.google.genomics.v1.SearchVariantSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_VARIANT_SETS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a variant set including all variants, call sets, and calls within.
     * This is not reversible.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.protobuf.Empty deleteVariantSet(com.google.genomics.v1.DeleteVariantSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_VARIANT_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a variant set using patch semantics.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.genomics.v1.VariantSet updateVariantSet(com.google.genomics.v1.UpdateVariantSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_VARIANT_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a list of variants matching the criteria.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchVariants](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L126).
     * </pre>
     */
    public com.google.genomics.v1.SearchVariantsResponse searchVariants(com.google.genomics.v1.SearchVariantsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_VARIANTS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new variant.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.genomics.v1.Variant createVariant(com.google.genomics.v1.CreateVariantRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_VARIANT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a variant.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This method supports patch semantics. Returns the modified variant without
     * its calls.
     * </pre>
     */
    public com.google.genomics.v1.Variant updateVariant(com.google.genomics.v1.UpdateVariantRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_VARIANT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a variant.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.protobuf.Empty deleteVariant(com.google.genomics.v1.DeleteVariantRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_VARIANT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a variant by ID.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.genomics.v1.Variant getVariant(com.google.genomics.v1.GetVariantRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_VARIANT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Merges the given variants with existing variants.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Each variant will be
     * merged with an existing variant that matches its reference sequence,
     * start, end, reference bases, and alternative bases. If no such variant
     * exists, a new one will be created.
     * When variants are merged, the call information from the new variant
     * is added to the existing variant. Variant info fields are merged as
     * specified in the
     * [infoMergeConfig][google.genomics.v1.MergeVariantsRequest.info_merge_config]
     * field of the MergeVariantsRequest.
     * Please exercise caution when using this method!  It is easy to introduce
     * mistakes in existing variants and difficult to back out of them.  For
     * example,
     * suppose you were trying to merge a new variant with an existing one and
     * both
     * variants contain calls that belong to callsets with the same callset ID.
     *     // Existing variant - irrelevant fields trimmed for clarity
     *     {
     *         "variantSetId": "10473108253681171589",
     *         "referenceName": "1",
     *         "start": "10582",
     *         "referenceBases": "G",
     *         "alternateBases": [
     *             "A"
     *         ],
     *         "calls": [
     *             {
     *                 "callSetId": "10473108253681171589-0",
     *                 "callSetName": "CALLSET0",
     *                 "genotype": [
     *                     0,
     *                     1
     *                 ],
     *             }
     *         ]
     *     }
     *     // New variant with conflicting call information
     *     {
     *         "variantSetId": "10473108253681171589",
     *         "referenceName": "1",
     *         "start": "10582",
     *         "referenceBases": "G",
     *         "alternateBases": [
     *             "A"
     *         ],
     *         "calls": [
     *             {
     *                 "callSetId": "10473108253681171589-0",
     *                 "callSetName": "CALLSET0",
     *                 "genotype": [
     *                     1,
     *                     1
     *                 ],
     *             }
     *         ]
     *     }
     * The resulting merged variant would overwrite the existing calls with those
     * from the new variant:
     *     {
     *         "variantSetId": "10473108253681171589",
     *         "referenceName": "1",
     *         "start": "10582",
     *         "referenceBases": "G",
     *         "alternateBases": [
     *             "A"
     *         ],
     *         "calls": [
     *             {
     *                 "callSetId": "10473108253681171589-0",
     *                 "callSetName": "CALLSET0",
     *                 "genotype": [
     *                     1,
     *                     1
     *                 ],
     *             }
     *         ]
     *     }
     * This may be the desired outcome, but it is up to the user to determine if
     * if that is indeed the case.
     * </pre>
     */
    public com.google.protobuf.Empty mergeVariants(com.google.genomics.v1.MergeVariantsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MERGE_VARIANTS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a list of call sets matching the criteria.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchCallSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L178).
     * </pre>
     */
    public com.google.genomics.v1.SearchCallSetsResponse searchCallSets(com.google.genomics.v1.SearchCallSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_CALL_SETS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new call set.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.genomics.v1.CallSet createCallSet(com.google.genomics.v1.CreateCallSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_CALL_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a call set.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This method supports patch semantics.
     * </pre>
     */
    public com.google.genomics.v1.CallSet updateCallSet(com.google.genomics.v1.UpdateCallSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_CALL_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a call set.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.protobuf.Empty deleteCallSet(com.google.genomics.v1.DeleteCallSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_CALL_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a call set by ID.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.genomics.v1.CallSet getCallSet(com.google.genomics.v1.GetCallSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CALL_SET, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VariantServiceV1FutureStub extends io.grpc.stub.AbstractStub<VariantServiceV1FutureStub> {
    private VariantServiceV1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VariantServiceV1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VariantServiceV1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VariantServiceV1FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates variant data by asynchronously importing the provided information.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * The variants for import will be merged with any existing variant that
     * matches its reference sequence, start, end, reference bases, and
     * alternative bases. If no such variant exists, a new one will be created.
     * When variants are merged, the call information from the new variant
     * is added to the existing variant, and Variant info fields are merged
     * as specified in
     * [infoMergeConfig][google.genomics.v1.ImportVariantsRequest.info_merge_config].
     * As a special case, for single-sample VCF files, QUAL and FILTER fields will
     * be moved to the call level; these are sometimes interpreted in a
     * call-specific context.
     * Imported VCF headers are appended to the metadata already in a variant set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> importVariants(
        com.google.genomics.v1.ImportVariantsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IMPORT_VARIANTS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new variant set.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * The provided variant set must have a valid `datasetId` set - all other
     * fields are optional. Note that the `id` field will be ignored, as this is
     * assigned by the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.VariantSet> createVariantSet(
        com.google.genomics.v1.CreateVariantSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_VARIANT_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Exports variant set data to an external destination.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> exportVariantSet(
        com.google.genomics.v1.ExportVariantSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EXPORT_VARIANT_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a variant set by ID.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.VariantSet> getVariantSet(
        com.google.genomics.v1.GetVariantSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_VARIANT_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of all variant sets matching search criteria.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchVariantSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L49).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.SearchVariantSetsResponse> searchVariantSets(
        com.google.genomics.v1.SearchVariantSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANT_SETS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a variant set including all variants, call sets, and calls within.
     * This is not reversible.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteVariantSet(
        com.google.genomics.v1.DeleteVariantSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_VARIANT_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a variant set using patch semantics.
     * For the definitions of variant sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.VariantSet> updateVariantSet(
        com.google.genomics.v1.UpdateVariantSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_VARIANT_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a list of variants matching the criteria.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchVariants](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L126).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.SearchVariantsResponse> searchVariants(
        com.google.genomics.v1.SearchVariantsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANTS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new variant.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.Variant> createVariant(
        com.google.genomics.v1.CreateVariantRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_VARIANT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a variant.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This method supports patch semantics. Returns the modified variant without
     * its calls.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.Variant> updateVariant(
        com.google.genomics.v1.UpdateVariantRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_VARIANT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a variant.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteVariant(
        com.google.genomics.v1.DeleteVariantRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_VARIANT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a variant by ID.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.Variant> getVariant(
        com.google.genomics.v1.GetVariantRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_VARIANT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Merges the given variants with existing variants.
     * For the definitions of variants and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Each variant will be
     * merged with an existing variant that matches its reference sequence,
     * start, end, reference bases, and alternative bases. If no such variant
     * exists, a new one will be created.
     * When variants are merged, the call information from the new variant
     * is added to the existing variant. Variant info fields are merged as
     * specified in the
     * [infoMergeConfig][google.genomics.v1.MergeVariantsRequest.info_merge_config]
     * field of the MergeVariantsRequest.
     * Please exercise caution when using this method!  It is easy to introduce
     * mistakes in existing variants and difficult to back out of them.  For
     * example,
     * suppose you were trying to merge a new variant with an existing one and
     * both
     * variants contain calls that belong to callsets with the same callset ID.
     *     // Existing variant - irrelevant fields trimmed for clarity
     *     {
     *         "variantSetId": "10473108253681171589",
     *         "referenceName": "1",
     *         "start": "10582",
     *         "referenceBases": "G",
     *         "alternateBases": [
     *             "A"
     *         ],
     *         "calls": [
     *             {
     *                 "callSetId": "10473108253681171589-0",
     *                 "callSetName": "CALLSET0",
     *                 "genotype": [
     *                     0,
     *                     1
     *                 ],
     *             }
     *         ]
     *     }
     *     // New variant with conflicting call information
     *     {
     *         "variantSetId": "10473108253681171589",
     *         "referenceName": "1",
     *         "start": "10582",
     *         "referenceBases": "G",
     *         "alternateBases": [
     *             "A"
     *         ],
     *         "calls": [
     *             {
     *                 "callSetId": "10473108253681171589-0",
     *                 "callSetName": "CALLSET0",
     *                 "genotype": [
     *                     1,
     *                     1
     *                 ],
     *             }
     *         ]
     *     }
     * The resulting merged variant would overwrite the existing calls with those
     * from the new variant:
     *     {
     *         "variantSetId": "10473108253681171589",
     *         "referenceName": "1",
     *         "start": "10582",
     *         "referenceBases": "G",
     *         "alternateBases": [
     *             "A"
     *         ],
     *         "calls": [
     *             {
     *                 "callSetId": "10473108253681171589-0",
     *                 "callSetName": "CALLSET0",
     *                 "genotype": [
     *                     1,
     *                     1
     *                 ],
     *             }
     *         ]
     *     }
     * This may be the desired outcome, but it is up to the user to determine if
     * if that is indeed the case.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> mergeVariants(
        com.google.genomics.v1.MergeVariantsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MERGE_VARIANTS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a list of call sets matching the criteria.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchCallSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L178).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.SearchCallSetsResponse> searchCallSets(
        com.google.genomics.v1.SearchCallSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_CALL_SETS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new call set.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.CallSet> createCallSet(
        com.google.genomics.v1.CreateCallSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_CALL_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a call set.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This method supports patch semantics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.CallSet> updateCallSet(
        com.google.genomics.v1.UpdateCallSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CALL_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a call set.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCallSet(
        com.google.genomics.v1.DeleteCallSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_CALL_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a call set by ID.
     * For the definitions of call sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.CallSet> getCallSet(
        com.google.genomics.v1.GetCallSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CALL_SET, getCallOptions()), request);
    }
  }

  private static final int METHODID_IMPORT_VARIANTS = 0;
  private static final int METHODID_CREATE_VARIANT_SET = 1;
  private static final int METHODID_EXPORT_VARIANT_SET = 2;
  private static final int METHODID_GET_VARIANT_SET = 3;
  private static final int METHODID_SEARCH_VARIANT_SETS = 4;
  private static final int METHODID_DELETE_VARIANT_SET = 5;
  private static final int METHODID_UPDATE_VARIANT_SET = 6;
  private static final int METHODID_SEARCH_VARIANTS = 7;
  private static final int METHODID_CREATE_VARIANT = 8;
  private static final int METHODID_UPDATE_VARIANT = 9;
  private static final int METHODID_DELETE_VARIANT = 10;
  private static final int METHODID_GET_VARIANT = 11;
  private static final int METHODID_MERGE_VARIANTS = 12;
  private static final int METHODID_SEARCH_CALL_SETS = 13;
  private static final int METHODID_CREATE_CALL_SET = 14;
  private static final int METHODID_UPDATE_CALL_SET = 15;
  private static final int METHODID_DELETE_CALL_SET = 16;
  private static final int METHODID_GET_CALL_SET = 17;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VariantServiceV1ImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(VariantServiceV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IMPORT_VARIANTS:
          serviceImpl.importVariants((com.google.genomics.v1.ImportVariantsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_CREATE_VARIANT_SET:
          serviceImpl.createVariantSet((com.google.genomics.v1.CreateVariantSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.VariantSet>) responseObserver);
          break;
        case METHODID_EXPORT_VARIANT_SET:
          serviceImpl.exportVariantSet((com.google.genomics.v1.ExportVariantSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_VARIANT_SET:
          serviceImpl.getVariantSet((com.google.genomics.v1.GetVariantSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.VariantSet>) responseObserver);
          break;
        case METHODID_SEARCH_VARIANT_SETS:
          serviceImpl.searchVariantSets((com.google.genomics.v1.SearchVariantSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchVariantSetsResponse>) responseObserver);
          break;
        case METHODID_DELETE_VARIANT_SET:
          serviceImpl.deleteVariantSet((com.google.genomics.v1.DeleteVariantSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_VARIANT_SET:
          serviceImpl.updateVariantSet((com.google.genomics.v1.UpdateVariantSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.VariantSet>) responseObserver);
          break;
        case METHODID_SEARCH_VARIANTS:
          serviceImpl.searchVariants((com.google.genomics.v1.SearchVariantsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchVariantsResponse>) responseObserver);
          break;
        case METHODID_CREATE_VARIANT:
          serviceImpl.createVariant((com.google.genomics.v1.CreateVariantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.Variant>) responseObserver);
          break;
        case METHODID_UPDATE_VARIANT:
          serviceImpl.updateVariant((com.google.genomics.v1.UpdateVariantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.Variant>) responseObserver);
          break;
        case METHODID_DELETE_VARIANT:
          serviceImpl.deleteVariant((com.google.genomics.v1.DeleteVariantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_VARIANT:
          serviceImpl.getVariant((com.google.genomics.v1.GetVariantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.Variant>) responseObserver);
          break;
        case METHODID_MERGE_VARIANTS:
          serviceImpl.mergeVariants((com.google.genomics.v1.MergeVariantsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEARCH_CALL_SETS:
          serviceImpl.searchCallSets((com.google.genomics.v1.SearchCallSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchCallSetsResponse>) responseObserver);
          break;
        case METHODID_CREATE_CALL_SET:
          serviceImpl.createCallSet((com.google.genomics.v1.CreateCallSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.CallSet>) responseObserver);
          break;
        case METHODID_UPDATE_CALL_SET:
          serviceImpl.updateCallSet((com.google.genomics.v1.UpdateCallSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.CallSet>) responseObserver);
          break;
        case METHODID_DELETE_CALL_SET:
          serviceImpl.deleteCallSet((com.google.genomics.v1.DeleteCallSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_CALL_SET:
          serviceImpl.getCallSet((com.google.genomics.v1.GetCallSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.CallSet>) responseObserver);
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
        METHOD_IMPORT_VARIANTS,
        METHOD_CREATE_VARIANT_SET,
        METHOD_EXPORT_VARIANT_SET,
        METHOD_GET_VARIANT_SET,
        METHOD_SEARCH_VARIANT_SETS,
        METHOD_DELETE_VARIANT_SET,
        METHOD_UPDATE_VARIANT_SET,
        METHOD_SEARCH_VARIANTS,
        METHOD_CREATE_VARIANT,
        METHOD_UPDATE_VARIANT,
        METHOD_DELETE_VARIANT,
        METHOD_GET_VARIANT,
        METHOD_MERGE_VARIANTS,
        METHOD_SEARCH_CALL_SETS,
        METHOD_CREATE_CALL_SET,
        METHOD_UPDATE_CALL_SET,
        METHOD_DELETE_CALL_SET,
        METHOD_GET_CALL_SET);
  }

}
