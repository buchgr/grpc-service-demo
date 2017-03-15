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
 * The Readstore. A data store for DNA sequencing Reads.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/genomics/v1/reads.proto")
public class ReadServiceV1Grpc {

  private ReadServiceV1Grpc() {}

  public static final String SERVICE_NAME = "google.genomics.v1.ReadServiceV1";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.ImportReadGroupSetsRequest,
      com.google.longrunning.Operation> METHOD_IMPORT_READ_GROUP_SETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.ReadServiceV1", "ImportReadGroupSets"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.ImportReadGroupSetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.ExportReadGroupSetRequest,
      com.google.longrunning.Operation> METHOD_EXPORT_READ_GROUP_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.ReadServiceV1", "ExportReadGroupSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.ExportReadGroupSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.longrunning.Operation.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.SearchReadGroupSetsRequest,
      com.google.genomics.v1.SearchReadGroupSetsResponse> METHOD_SEARCH_READ_GROUP_SETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.ReadServiceV1", "SearchReadGroupSets"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchReadGroupSetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchReadGroupSetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.UpdateReadGroupSetRequest,
      com.google.genomics.v1.ReadGroupSet> METHOD_UPDATE_READ_GROUP_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.ReadServiceV1", "UpdateReadGroupSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.UpdateReadGroupSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.ReadGroupSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.DeleteReadGroupSetRequest,
      com.google.protobuf.Empty> METHOD_DELETE_READ_GROUP_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.ReadServiceV1", "DeleteReadGroupSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.DeleteReadGroupSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.GetReadGroupSetRequest,
      com.google.genomics.v1.ReadGroupSet> METHOD_GET_READ_GROUP_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.ReadServiceV1", "GetReadGroupSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.GetReadGroupSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.ReadGroupSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.ListCoverageBucketsRequest,
      com.google.genomics.v1.ListCoverageBucketsResponse> METHOD_LIST_COVERAGE_BUCKETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.ReadServiceV1", "ListCoverageBuckets"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.ListCoverageBucketsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.ListCoverageBucketsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.genomics.v1.SearchReadsRequest,
      com.google.genomics.v1.SearchReadsResponse> METHOD_SEARCH_READS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.genomics.v1.ReadServiceV1", "SearchReads"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchReadsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.genomics.v1.SearchReadsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReadServiceV1Stub newStub(io.grpc.Channel channel) {
    return new ReadServiceV1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReadServiceV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReadServiceV1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ReadServiceV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReadServiceV1FutureStub(channel);
  }

  /**
   * <pre>
   * The Readstore. A data store for DNA sequencing Reads.
   * </pre>
   */
  public static abstract class ReadServiceV1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates read group sets by asynchronously importing the provided
     * information.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * The caller must have WRITE permissions to the dataset.
     * ## Notes on [BAM](https://samtools.github.io/hts-specs/SAMv1.pdf) import
     * - Tags will be converted to strings - tag types are not preserved
     * - Comments (`&#64;CO`) in the input file header will not be preserved
     * - Original header order of references (`&#64;SQ`) will not be preserved
     * - Any reverse stranded unmapped reads will be reverse complemented, and
     * their qualities (also the "BQ" and "OQ" tags, if any) will be reversed
     * - Unmapped reads will be stripped of positional information (reference name
     * and position)
     * </pre>
     */
    public void importReadGroupSets(com.google.genomics.v1.ImportReadGroupSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IMPORT_READ_GROUP_SETS, responseObserver);
    }

    /**
     * <pre>
     * Exports a read group set to a BAM file in Google Cloud Storage.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Note that currently there may be some differences between exported BAM
     * files and the original BAM file at the time of import. See
     * [ImportReadGroupSets][google.genomics.v1.ReadServiceV1.ImportReadGroupSets]
     * for caveats.
     * </pre>
     */
    public void exportReadGroupSet(com.google.genomics.v1.ExportReadGroupSetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXPORT_READ_GROUP_SET, responseObserver);
    }

    /**
     * <pre>
     * Searches for read group sets matching the criteria.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchReadGroupSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/readmethods.avdl#L135).
     * </pre>
     */
    public void searchReadGroupSets(com.google.genomics.v1.SearchReadGroupSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchReadGroupSetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_READ_GROUP_SETS, responseObserver);
    }

    /**
     * <pre>
     * Updates a read group set.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This method supports patch semantics.
     * </pre>
     */
    public void updateReadGroupSet(com.google.genomics.v1.UpdateReadGroupSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.ReadGroupSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_READ_GROUP_SET, responseObserver);
    }

    /**
     * <pre>
     * Deletes a read group set.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void deleteReadGroupSet(com.google.genomics.v1.DeleteReadGroupSetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_READ_GROUP_SET, responseObserver);
    }

    /**
     * <pre>
     * Gets a read group set by ID.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void getReadGroupSet(com.google.genomics.v1.GetReadGroupSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.ReadGroupSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_READ_GROUP_SET, responseObserver);
    }

    /**
     * <pre>
     * Lists fixed width coverage buckets for a read group set, each of which
     * correspond to a range of a reference sequence. Each bucket summarizes
     * coverage information across its corresponding genomic range.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Coverage is defined as the number of reads which are aligned to a given
     * base in the reference sequence. Coverage buckets are available at several
     * precomputed bucket widths, enabling retrieval of various coverage 'zoom
     * levels'. The caller must have READ permissions for the target read group
     * set.
     * </pre>
     */
    public void listCoverageBuckets(com.google.genomics.v1.ListCoverageBucketsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.ListCoverageBucketsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_COVERAGE_BUCKETS, responseObserver);
    }

    /**
     * <pre>
     * Gets a list of reads for one or more read group sets.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Reads search operates over a genomic coordinate space of reference sequence
     * &amp; position defined over the reference sequences to which the requested
     * read group sets are aligned.
     * If a target positional range is specified, search returns all reads whose
     * alignment to the reference genome overlap the range. A query which
     * specifies only read group set IDs yields all reads in those read group
     * sets, including unmapped reads.
     * All reads returned (including reads on subsequent pages) are ordered by
     * genomic coordinate (by reference sequence, then position). Reads with
     * equivalent genomic coordinates are returned in an unspecified order. This
     * order is consistent, such that two queries for the same content (regardless
     * of page size) yield reads in the same order across their respective streams
     * of paginated responses.
     * Implements
     * [GlobalAllianceApi.searchReads](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/readmethods.avdl#L85).
     * </pre>
     */
    public void searchReads(com.google.genomics.v1.SearchReadsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchReadsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_READS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_IMPORT_READ_GROUP_SETS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.ImportReadGroupSetsRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_IMPORT_READ_GROUP_SETS)))
          .addMethod(
            METHOD_EXPORT_READ_GROUP_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.ExportReadGroupSetRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_EXPORT_READ_GROUP_SET)))
          .addMethod(
            METHOD_SEARCH_READ_GROUP_SETS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.SearchReadGroupSetsRequest,
                com.google.genomics.v1.SearchReadGroupSetsResponse>(
                  this, METHODID_SEARCH_READ_GROUP_SETS)))
          .addMethod(
            METHOD_UPDATE_READ_GROUP_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.UpdateReadGroupSetRequest,
                com.google.genomics.v1.ReadGroupSet>(
                  this, METHODID_UPDATE_READ_GROUP_SET)))
          .addMethod(
            METHOD_DELETE_READ_GROUP_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.DeleteReadGroupSetRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_READ_GROUP_SET)))
          .addMethod(
            METHOD_GET_READ_GROUP_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.GetReadGroupSetRequest,
                com.google.genomics.v1.ReadGroupSet>(
                  this, METHODID_GET_READ_GROUP_SET)))
          .addMethod(
            METHOD_LIST_COVERAGE_BUCKETS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.ListCoverageBucketsRequest,
                com.google.genomics.v1.ListCoverageBucketsResponse>(
                  this, METHODID_LIST_COVERAGE_BUCKETS)))
          .addMethod(
            METHOD_SEARCH_READS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.genomics.v1.SearchReadsRequest,
                com.google.genomics.v1.SearchReadsResponse>(
                  this, METHODID_SEARCH_READS)))
          .build();
    }
  }

  /**
   * <pre>
   * The Readstore. A data store for DNA sequencing Reads.
   * </pre>
   */
  public static final class ReadServiceV1Stub extends io.grpc.stub.AbstractStub<ReadServiceV1Stub> {
    private ReadServiceV1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReadServiceV1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReadServiceV1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReadServiceV1Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates read group sets by asynchronously importing the provided
     * information.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * The caller must have WRITE permissions to the dataset.
     * ## Notes on [BAM](https://samtools.github.io/hts-specs/SAMv1.pdf) import
     * - Tags will be converted to strings - tag types are not preserved
     * - Comments (`&#64;CO`) in the input file header will not be preserved
     * - Original header order of references (`&#64;SQ`) will not be preserved
     * - Any reverse stranded unmapped reads will be reverse complemented, and
     * their qualities (also the "BQ" and "OQ" tags, if any) will be reversed
     * - Unmapped reads will be stripped of positional information (reference name
     * and position)
     * </pre>
     */
    public void importReadGroupSets(com.google.genomics.v1.ImportReadGroupSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IMPORT_READ_GROUP_SETS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Exports a read group set to a BAM file in Google Cloud Storage.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Note that currently there may be some differences between exported BAM
     * files and the original BAM file at the time of import. See
     * [ImportReadGroupSets][google.genomics.v1.ReadServiceV1.ImportReadGroupSets]
     * for caveats.
     * </pre>
     */
    public void exportReadGroupSet(com.google.genomics.v1.ExportReadGroupSetRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EXPORT_READ_GROUP_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Searches for read group sets matching the criteria.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchReadGroupSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/readmethods.avdl#L135).
     * </pre>
     */
    public void searchReadGroupSets(com.google.genomics.v1.SearchReadGroupSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchReadGroupSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_READ_GROUP_SETS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a read group set.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This method supports patch semantics.
     * </pre>
     */
    public void updateReadGroupSet(com.google.genomics.v1.UpdateReadGroupSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.ReadGroupSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_READ_GROUP_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a read group set.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void deleteReadGroupSet(com.google.genomics.v1.DeleteReadGroupSetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_READ_GROUP_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a read group set by ID.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public void getReadGroupSet(com.google.genomics.v1.GetReadGroupSetRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.ReadGroupSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_READ_GROUP_SET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists fixed width coverage buckets for a read group set, each of which
     * correspond to a range of a reference sequence. Each bucket summarizes
     * coverage information across its corresponding genomic range.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Coverage is defined as the number of reads which are aligned to a given
     * base in the reference sequence. Coverage buckets are available at several
     * precomputed bucket widths, enabling retrieval of various coverage 'zoom
     * levels'. The caller must have READ permissions for the target read group
     * set.
     * </pre>
     */
    public void listCoverageBuckets(com.google.genomics.v1.ListCoverageBucketsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.ListCoverageBucketsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_COVERAGE_BUCKETS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a list of reads for one or more read group sets.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Reads search operates over a genomic coordinate space of reference sequence
     * &amp; position defined over the reference sequences to which the requested
     * read group sets are aligned.
     * If a target positional range is specified, search returns all reads whose
     * alignment to the reference genome overlap the range. A query which
     * specifies only read group set IDs yields all reads in those read group
     * sets, including unmapped reads.
     * All reads returned (including reads on subsequent pages) are ordered by
     * genomic coordinate (by reference sequence, then position). Reads with
     * equivalent genomic coordinates are returned in an unspecified order. This
     * order is consistent, such that two queries for the same content (regardless
     * of page size) yield reads in the same order across their respective streams
     * of paginated responses.
     * Implements
     * [GlobalAllianceApi.searchReads](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/readmethods.avdl#L85).
     * </pre>
     */
    public void searchReads(com.google.genomics.v1.SearchReadsRequest request,
        io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchReadsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_READS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Readstore. A data store for DNA sequencing Reads.
   * </pre>
   */
  public static final class ReadServiceV1BlockingStub extends io.grpc.stub.AbstractStub<ReadServiceV1BlockingStub> {
    private ReadServiceV1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReadServiceV1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReadServiceV1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReadServiceV1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates read group sets by asynchronously importing the provided
     * information.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * The caller must have WRITE permissions to the dataset.
     * ## Notes on [BAM](https://samtools.github.io/hts-specs/SAMv1.pdf) import
     * - Tags will be converted to strings - tag types are not preserved
     * - Comments (`&#64;CO`) in the input file header will not be preserved
     * - Original header order of references (`&#64;SQ`) will not be preserved
     * - Any reverse stranded unmapped reads will be reverse complemented, and
     * their qualities (also the "BQ" and "OQ" tags, if any) will be reversed
     * - Unmapped reads will be stripped of positional information (reference name
     * and position)
     * </pre>
     */
    public com.google.longrunning.Operation importReadGroupSets(com.google.genomics.v1.ImportReadGroupSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IMPORT_READ_GROUP_SETS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Exports a read group set to a BAM file in Google Cloud Storage.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Note that currently there may be some differences between exported BAM
     * files and the original BAM file at the time of import. See
     * [ImportReadGroupSets][google.genomics.v1.ReadServiceV1.ImportReadGroupSets]
     * for caveats.
     * </pre>
     */
    public com.google.longrunning.Operation exportReadGroupSet(com.google.genomics.v1.ExportReadGroupSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EXPORT_READ_GROUP_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Searches for read group sets matching the criteria.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchReadGroupSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/readmethods.avdl#L135).
     * </pre>
     */
    public com.google.genomics.v1.SearchReadGroupSetsResponse searchReadGroupSets(com.google.genomics.v1.SearchReadGroupSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_READ_GROUP_SETS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a read group set.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This method supports patch semantics.
     * </pre>
     */
    public com.google.genomics.v1.ReadGroupSet updateReadGroupSet(com.google.genomics.v1.UpdateReadGroupSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_READ_GROUP_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a read group set.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.protobuf.Empty deleteReadGroupSet(com.google.genomics.v1.DeleteReadGroupSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_READ_GROUP_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a read group set by ID.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.genomics.v1.ReadGroupSet getReadGroupSet(com.google.genomics.v1.GetReadGroupSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_READ_GROUP_SET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists fixed width coverage buckets for a read group set, each of which
     * correspond to a range of a reference sequence. Each bucket summarizes
     * coverage information across its corresponding genomic range.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Coverage is defined as the number of reads which are aligned to a given
     * base in the reference sequence. Coverage buckets are available at several
     * precomputed bucket widths, enabling retrieval of various coverage 'zoom
     * levels'. The caller must have READ permissions for the target read group
     * set.
     * </pre>
     */
    public com.google.genomics.v1.ListCoverageBucketsResponse listCoverageBuckets(com.google.genomics.v1.ListCoverageBucketsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_COVERAGE_BUCKETS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a list of reads for one or more read group sets.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Reads search operates over a genomic coordinate space of reference sequence
     * &amp; position defined over the reference sequences to which the requested
     * read group sets are aligned.
     * If a target positional range is specified, search returns all reads whose
     * alignment to the reference genome overlap the range. A query which
     * specifies only read group set IDs yields all reads in those read group
     * sets, including unmapped reads.
     * All reads returned (including reads on subsequent pages) are ordered by
     * genomic coordinate (by reference sequence, then position). Reads with
     * equivalent genomic coordinates are returned in an unspecified order. This
     * order is consistent, such that two queries for the same content (regardless
     * of page size) yield reads in the same order across their respective streams
     * of paginated responses.
     * Implements
     * [GlobalAllianceApi.searchReads](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/readmethods.avdl#L85).
     * </pre>
     */
    public com.google.genomics.v1.SearchReadsResponse searchReads(com.google.genomics.v1.SearchReadsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_READS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Readstore. A data store for DNA sequencing Reads.
   * </pre>
   */
  public static final class ReadServiceV1FutureStub extends io.grpc.stub.AbstractStub<ReadServiceV1FutureStub> {
    private ReadServiceV1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReadServiceV1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReadServiceV1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReadServiceV1FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates read group sets by asynchronously importing the provided
     * information.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * The caller must have WRITE permissions to the dataset.
     * ## Notes on [BAM](https://samtools.github.io/hts-specs/SAMv1.pdf) import
     * - Tags will be converted to strings - tag types are not preserved
     * - Comments (`&#64;CO`) in the input file header will not be preserved
     * - Original header order of references (`&#64;SQ`) will not be preserved
     * - Any reverse stranded unmapped reads will be reverse complemented, and
     * their qualities (also the "BQ" and "OQ" tags, if any) will be reversed
     * - Unmapped reads will be stripped of positional information (reference name
     * and position)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> importReadGroupSets(
        com.google.genomics.v1.ImportReadGroupSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IMPORT_READ_GROUP_SETS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Exports a read group set to a BAM file in Google Cloud Storage.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Note that currently there may be some differences between exported BAM
     * files and the original BAM file at the time of import. See
     * [ImportReadGroupSets][google.genomics.v1.ReadServiceV1.ImportReadGroupSets]
     * for caveats.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> exportReadGroupSet(
        com.google.genomics.v1.ExportReadGroupSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EXPORT_READ_GROUP_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Searches for read group sets matching the criteria.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Implements
     * [GlobalAllianceApi.searchReadGroupSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/readmethods.avdl#L135).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.SearchReadGroupSetsResponse> searchReadGroupSets(
        com.google.genomics.v1.SearchReadGroupSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_READ_GROUP_SETS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a read group set.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * This method supports patch semantics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.ReadGroupSet> updateReadGroupSet(
        com.google.genomics.v1.UpdateReadGroupSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_READ_GROUP_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a read group set.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteReadGroupSet(
        com.google.genomics.v1.DeleteReadGroupSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_READ_GROUP_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a read group set by ID.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.ReadGroupSet> getReadGroupSet(
        com.google.genomics.v1.GetReadGroupSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_READ_GROUP_SET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists fixed width coverage buckets for a read group set, each of which
     * correspond to a range of a reference sequence. Each bucket summarizes
     * coverage information across its corresponding genomic range.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Coverage is defined as the number of reads which are aligned to a given
     * base in the reference sequence. Coverage buckets are available at several
     * precomputed bucket widths, enabling retrieval of various coverage 'zoom
     * levels'. The caller must have READ permissions for the target read group
     * set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.ListCoverageBucketsResponse> listCoverageBuckets(
        com.google.genomics.v1.ListCoverageBucketsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_COVERAGE_BUCKETS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a list of reads for one or more read group sets.
     * For the definitions of read group sets and other genomics resources, see
     * [Fundamentals of Google
     * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
     * Reads search operates over a genomic coordinate space of reference sequence
     * &amp; position defined over the reference sequences to which the requested
     * read group sets are aligned.
     * If a target positional range is specified, search returns all reads whose
     * alignment to the reference genome overlap the range. A query which
     * specifies only read group set IDs yields all reads in those read group
     * sets, including unmapped reads.
     * All reads returned (including reads on subsequent pages) are ordered by
     * genomic coordinate (by reference sequence, then position). Reads with
     * equivalent genomic coordinates are returned in an unspecified order. This
     * order is consistent, such that two queries for the same content (regardless
     * of page size) yield reads in the same order across their respective streams
     * of paginated responses.
     * Implements
     * [GlobalAllianceApi.searchReads](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/readmethods.avdl#L85).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.genomics.v1.SearchReadsResponse> searchReads(
        com.google.genomics.v1.SearchReadsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_READS, getCallOptions()), request);
    }
  }

  private static final int METHODID_IMPORT_READ_GROUP_SETS = 0;
  private static final int METHODID_EXPORT_READ_GROUP_SET = 1;
  private static final int METHODID_SEARCH_READ_GROUP_SETS = 2;
  private static final int METHODID_UPDATE_READ_GROUP_SET = 3;
  private static final int METHODID_DELETE_READ_GROUP_SET = 4;
  private static final int METHODID_GET_READ_GROUP_SET = 5;
  private static final int METHODID_LIST_COVERAGE_BUCKETS = 6;
  private static final int METHODID_SEARCH_READS = 7;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReadServiceV1ImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ReadServiceV1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IMPORT_READ_GROUP_SETS:
          serviceImpl.importReadGroupSets((com.google.genomics.v1.ImportReadGroupSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_EXPORT_READ_GROUP_SET:
          serviceImpl.exportReadGroupSet((com.google.genomics.v1.ExportReadGroupSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_SEARCH_READ_GROUP_SETS:
          serviceImpl.searchReadGroupSets((com.google.genomics.v1.SearchReadGroupSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchReadGroupSetsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_READ_GROUP_SET:
          serviceImpl.updateReadGroupSet((com.google.genomics.v1.UpdateReadGroupSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.ReadGroupSet>) responseObserver);
          break;
        case METHODID_DELETE_READ_GROUP_SET:
          serviceImpl.deleteReadGroupSet((com.google.genomics.v1.DeleteReadGroupSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_READ_GROUP_SET:
          serviceImpl.getReadGroupSet((com.google.genomics.v1.GetReadGroupSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.ReadGroupSet>) responseObserver);
          break;
        case METHODID_LIST_COVERAGE_BUCKETS:
          serviceImpl.listCoverageBuckets((com.google.genomics.v1.ListCoverageBucketsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.ListCoverageBucketsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_READS:
          serviceImpl.searchReads((com.google.genomics.v1.SearchReadsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.genomics.v1.SearchReadsResponse>) responseObserver);
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
        METHOD_IMPORT_READ_GROUP_SETS,
        METHOD_EXPORT_READ_GROUP_SET,
        METHOD_SEARCH_READ_GROUP_SETS,
        METHOD_UPDATE_READ_GROUP_SET,
        METHOD_DELETE_READ_GROUP_SET,
        METHOD_GET_READ_GROUP_SET,
        METHOD_LIST_COVERAGE_BUCKETS,
        METHOD_SEARCH_READS);
  }

}
