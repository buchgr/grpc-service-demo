package com.google.example.library.v1;

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
 * This API represents a simple digital library.  It lets you manage Shelf
 * resources and Book resources in the library. It defines the following
 * resource model:
 * - The API has a collection of [Shelf][google.example.library.v1.Shelf]
 *   resources, named `shelves/&#42;`
 * - Each Shelf has a collection of [Book][google.example.library.v1.Book]
 *   resources, named `shelves/&#42;&#47;books/&#42;`
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/example/library/v1/library.proto")
public class LibraryServiceGrpc {

  private LibraryServiceGrpc() {}

  public static final String SERVICE_NAME = "google.example.library.v1.LibraryService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.v1.CreateShelfRequest,
      com.google.example.library.v1.Shelf> METHOD_CREATE_SHELF =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.example.library.v1.LibraryService", "CreateShelf"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.CreateShelfRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.Shelf.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.v1.GetShelfRequest,
      com.google.example.library.v1.Shelf> METHOD_GET_SHELF =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.example.library.v1.LibraryService", "GetShelf"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.GetShelfRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.Shelf.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.v1.ListShelvesRequest,
      com.google.example.library.v1.ListShelvesResponse> METHOD_LIST_SHELVES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.example.library.v1.LibraryService", "ListShelves"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.ListShelvesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.ListShelvesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.v1.DeleteShelfRequest,
      com.google.protobuf.Empty> METHOD_DELETE_SHELF =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.example.library.v1.LibraryService", "DeleteShelf"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.DeleteShelfRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.v1.MergeShelvesRequest,
      com.google.example.library.v1.Shelf> METHOD_MERGE_SHELVES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.example.library.v1.LibraryService", "MergeShelves"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.MergeShelvesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.Shelf.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.v1.CreateBookRequest,
      com.google.example.library.v1.Book> METHOD_CREATE_BOOK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.example.library.v1.LibraryService", "CreateBook"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.CreateBookRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.Book.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.v1.GetBookRequest,
      com.google.example.library.v1.Book> METHOD_GET_BOOK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.example.library.v1.LibraryService", "GetBook"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.GetBookRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.Book.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.v1.ListBooksRequest,
      com.google.example.library.v1.ListBooksResponse> METHOD_LIST_BOOKS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.example.library.v1.LibraryService", "ListBooks"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.ListBooksRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.ListBooksResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.v1.DeleteBookRequest,
      com.google.protobuf.Empty> METHOD_DELETE_BOOK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.example.library.v1.LibraryService", "DeleteBook"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.DeleteBookRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.v1.UpdateBookRequest,
      com.google.example.library.v1.Book> METHOD_UPDATE_BOOK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.example.library.v1.LibraryService", "UpdateBook"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.UpdateBookRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.Book.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.example.library.v1.MoveBookRequest,
      com.google.example.library.v1.Book> METHOD_MOVE_BOOK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.example.library.v1.LibraryService", "MoveBook"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.MoveBookRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.example.library.v1.Book.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LibraryServiceStub newStub(io.grpc.Channel channel) {
    return new LibraryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LibraryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LibraryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static LibraryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LibraryServiceFutureStub(channel);
  }

  /**
   * <pre>
   * This API represents a simple digital library.  It lets you manage Shelf
   * resources and Book resources in the library. It defines the following
   * resource model:
   * - The API has a collection of [Shelf][google.example.library.v1.Shelf]
   *   resources, named `shelves/&#42;`
   * - Each Shelf has a collection of [Book][google.example.library.v1.Book]
   *   resources, named `shelves/&#42;&#47;books/&#42;`
   * </pre>
   */
  public static abstract class LibraryServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a shelf, and returns the new Shelf.
     * </pre>
     */
    public void createShelf(com.google.example.library.v1.CreateShelfRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.Shelf> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_SHELF, responseObserver);
    }

    /**
     * <pre>
     * Gets a shelf. Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public void getShelf(com.google.example.library.v1.GetShelfRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.Shelf> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SHELF, responseObserver);
    }

    /**
     * <pre>
     * Lists shelves. The order is unspecified but deterministic. Newly created
     * shelves will not necessarily be added to the end of this list.
     * </pre>
     */
    public void listShelves(com.google.example.library.v1.ListShelvesRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.ListShelvesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_SHELVES, responseObserver);
    }

    /**
     * <pre>
     * Deletes a shelf. Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public void deleteShelf(com.google.example.library.v1.DeleteShelfRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_SHELF, responseObserver);
    }

    /**
     * <pre>
     * Merges two shelves by adding all books from the shelf named
     * `other_shelf_name` to shelf `name`, and deletes
     * `other_shelf_name`. Returns the updated shelf.
     * The book ids of the moved books may not be the same as the original books.
     * Returns NOT_FOUND if either shelf does not exist.
     * This call is a no-op if the specified shelves are the same.
     * </pre>
     */
    public void mergeShelves(com.google.example.library.v1.MergeShelvesRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.Shelf> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MERGE_SHELVES, responseObserver);
    }

    /**
     * <pre>
     * Creates a book, and returns the new Book.
     * </pre>
     */
    public void createBook(com.google.example.library.v1.CreateBookRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.Book> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_BOOK, responseObserver);
    }

    /**
     * <pre>
     * Gets a book. Returns NOT_FOUND if the book does not exist.
     * </pre>
     */
    public void getBook(com.google.example.library.v1.GetBookRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.Book> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BOOK, responseObserver);
    }

    /**
     * <pre>
     * Lists books in a shelf. The order is unspecified but deterministic. Newly
     * created books will not necessarily be added to the end of this list.
     * Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public void listBooks(com.google.example.library.v1.ListBooksRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.ListBooksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_BOOKS, responseObserver);
    }

    /**
     * <pre>
     * Deletes a book. Returns NOT_FOUND if the book does not exist.
     * </pre>
     */
    public void deleteBook(com.google.example.library.v1.DeleteBookRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_BOOK, responseObserver);
    }

    /**
     * <pre>
     * Updates a book. Returns INVALID_ARGUMENT if the name of the book
     * is non-empty and does equal the previous name.
     * </pre>
     */
    public void updateBook(com.google.example.library.v1.UpdateBookRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.Book> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_BOOK, responseObserver);
    }

    /**
     * <pre>
     * Moves a book to another shelf, and returns the new book. The book
     * id of the new book may not be the same as the original book.
     * </pre>
     */
    public void moveBook(com.google.example.library.v1.MoveBookRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.Book> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MOVE_BOOK, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_SHELF,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.v1.CreateShelfRequest,
                com.google.example.library.v1.Shelf>(
                  this, METHODID_CREATE_SHELF)))
          .addMethod(
            METHOD_GET_SHELF,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.v1.GetShelfRequest,
                com.google.example.library.v1.Shelf>(
                  this, METHODID_GET_SHELF)))
          .addMethod(
            METHOD_LIST_SHELVES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.v1.ListShelvesRequest,
                com.google.example.library.v1.ListShelvesResponse>(
                  this, METHODID_LIST_SHELVES)))
          .addMethod(
            METHOD_DELETE_SHELF,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.v1.DeleteShelfRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SHELF)))
          .addMethod(
            METHOD_MERGE_SHELVES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.v1.MergeShelvesRequest,
                com.google.example.library.v1.Shelf>(
                  this, METHODID_MERGE_SHELVES)))
          .addMethod(
            METHOD_CREATE_BOOK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.v1.CreateBookRequest,
                com.google.example.library.v1.Book>(
                  this, METHODID_CREATE_BOOK)))
          .addMethod(
            METHOD_GET_BOOK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.v1.GetBookRequest,
                com.google.example.library.v1.Book>(
                  this, METHODID_GET_BOOK)))
          .addMethod(
            METHOD_LIST_BOOKS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.v1.ListBooksRequest,
                com.google.example.library.v1.ListBooksResponse>(
                  this, METHODID_LIST_BOOKS)))
          .addMethod(
            METHOD_DELETE_BOOK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.v1.DeleteBookRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_BOOK)))
          .addMethod(
            METHOD_UPDATE_BOOK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.v1.UpdateBookRequest,
                com.google.example.library.v1.Book>(
                  this, METHODID_UPDATE_BOOK)))
          .addMethod(
            METHOD_MOVE_BOOK,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.example.library.v1.MoveBookRequest,
                com.google.example.library.v1.Book>(
                  this, METHODID_MOVE_BOOK)))
          .build();
    }
  }

  /**
   * <pre>
   * This API represents a simple digital library.  It lets you manage Shelf
   * resources and Book resources in the library. It defines the following
   * resource model:
   * - The API has a collection of [Shelf][google.example.library.v1.Shelf]
   *   resources, named `shelves/&#42;`
   * - Each Shelf has a collection of [Book][google.example.library.v1.Book]
   *   resources, named `shelves/&#42;&#47;books/&#42;`
   * </pre>
   */
  public static final class LibraryServiceStub extends io.grpc.stub.AbstractStub<LibraryServiceStub> {
    private LibraryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LibraryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LibraryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LibraryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a shelf, and returns the new Shelf.
     * </pre>
     */
    public void createShelf(com.google.example.library.v1.CreateShelfRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.Shelf> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_SHELF, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a shelf. Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public void getShelf(com.google.example.library.v1.GetShelfRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.Shelf> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SHELF, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists shelves. The order is unspecified but deterministic. Newly created
     * shelves will not necessarily be added to the end of this list.
     * </pre>
     */
    public void listShelves(com.google.example.library.v1.ListShelvesRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.ListShelvesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_SHELVES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a shelf. Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public void deleteShelf(com.google.example.library.v1.DeleteShelfRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_SHELF, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Merges two shelves by adding all books from the shelf named
     * `other_shelf_name` to shelf `name`, and deletes
     * `other_shelf_name`. Returns the updated shelf.
     * The book ids of the moved books may not be the same as the original books.
     * Returns NOT_FOUND if either shelf does not exist.
     * This call is a no-op if the specified shelves are the same.
     * </pre>
     */
    public void mergeShelves(com.google.example.library.v1.MergeShelvesRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.Shelf> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MERGE_SHELVES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a book, and returns the new Book.
     * </pre>
     */
    public void createBook(com.google.example.library.v1.CreateBookRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.Book> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_BOOK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a book. Returns NOT_FOUND if the book does not exist.
     * </pre>
     */
    public void getBook(com.google.example.library.v1.GetBookRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.Book> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BOOK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists books in a shelf. The order is unspecified but deterministic. Newly
     * created books will not necessarily be added to the end of this list.
     * Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public void listBooks(com.google.example.library.v1.ListBooksRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.ListBooksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_BOOKS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a book. Returns NOT_FOUND if the book does not exist.
     * </pre>
     */
    public void deleteBook(com.google.example.library.v1.DeleteBookRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_BOOK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a book. Returns INVALID_ARGUMENT if the name of the book
     * is non-empty and does equal the previous name.
     * </pre>
     */
    public void updateBook(com.google.example.library.v1.UpdateBookRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.Book> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_BOOK, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Moves a book to another shelf, and returns the new book. The book
     * id of the new book may not be the same as the original book.
     * </pre>
     */
    public void moveBook(com.google.example.library.v1.MoveBookRequest request,
        io.grpc.stub.StreamObserver<com.google.example.library.v1.Book> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MOVE_BOOK, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * This API represents a simple digital library.  It lets you manage Shelf
   * resources and Book resources in the library. It defines the following
   * resource model:
   * - The API has a collection of [Shelf][google.example.library.v1.Shelf]
   *   resources, named `shelves/&#42;`
   * - Each Shelf has a collection of [Book][google.example.library.v1.Book]
   *   resources, named `shelves/&#42;&#47;books/&#42;`
   * </pre>
   */
  public static final class LibraryServiceBlockingStub extends io.grpc.stub.AbstractStub<LibraryServiceBlockingStub> {
    private LibraryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LibraryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LibraryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LibraryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a shelf, and returns the new Shelf.
     * </pre>
     */
    public com.google.example.library.v1.Shelf createShelf(com.google.example.library.v1.CreateShelfRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_SHELF, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a shelf. Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public com.google.example.library.v1.Shelf getShelf(com.google.example.library.v1.GetShelfRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SHELF, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists shelves. The order is unspecified but deterministic. Newly created
     * shelves will not necessarily be added to the end of this list.
     * </pre>
     */
    public com.google.example.library.v1.ListShelvesResponse listShelves(com.google.example.library.v1.ListShelvesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_SHELVES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a shelf. Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public com.google.protobuf.Empty deleteShelf(com.google.example.library.v1.DeleteShelfRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_SHELF, getCallOptions(), request);
    }

    /**
     * <pre>
     * Merges two shelves by adding all books from the shelf named
     * `other_shelf_name` to shelf `name`, and deletes
     * `other_shelf_name`. Returns the updated shelf.
     * The book ids of the moved books may not be the same as the original books.
     * Returns NOT_FOUND if either shelf does not exist.
     * This call is a no-op if the specified shelves are the same.
     * </pre>
     */
    public com.google.example.library.v1.Shelf mergeShelves(com.google.example.library.v1.MergeShelvesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MERGE_SHELVES, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a book, and returns the new Book.
     * </pre>
     */
    public com.google.example.library.v1.Book createBook(com.google.example.library.v1.CreateBookRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_BOOK, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a book. Returns NOT_FOUND if the book does not exist.
     * </pre>
     */
    public com.google.example.library.v1.Book getBook(com.google.example.library.v1.GetBookRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BOOK, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists books in a shelf. The order is unspecified but deterministic. Newly
     * created books will not necessarily be added to the end of this list.
     * Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public com.google.example.library.v1.ListBooksResponse listBooks(com.google.example.library.v1.ListBooksRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_BOOKS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a book. Returns NOT_FOUND if the book does not exist.
     * </pre>
     */
    public com.google.protobuf.Empty deleteBook(com.google.example.library.v1.DeleteBookRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_BOOK, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a book. Returns INVALID_ARGUMENT if the name of the book
     * is non-empty and does equal the previous name.
     * </pre>
     */
    public com.google.example.library.v1.Book updateBook(com.google.example.library.v1.UpdateBookRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_BOOK, getCallOptions(), request);
    }

    /**
     * <pre>
     * Moves a book to another shelf, and returns the new book. The book
     * id of the new book may not be the same as the original book.
     * </pre>
     */
    public com.google.example.library.v1.Book moveBook(com.google.example.library.v1.MoveBookRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MOVE_BOOK, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * This API represents a simple digital library.  It lets you manage Shelf
   * resources and Book resources in the library. It defines the following
   * resource model:
   * - The API has a collection of [Shelf][google.example.library.v1.Shelf]
   *   resources, named `shelves/&#42;`
   * - Each Shelf has a collection of [Book][google.example.library.v1.Book]
   *   resources, named `shelves/&#42;&#47;books/&#42;`
   * </pre>
   */
  public static final class LibraryServiceFutureStub extends io.grpc.stub.AbstractStub<LibraryServiceFutureStub> {
    private LibraryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LibraryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LibraryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LibraryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a shelf, and returns the new Shelf.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.example.library.v1.Shelf> createShelf(
        com.google.example.library.v1.CreateShelfRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_SHELF, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a shelf. Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.example.library.v1.Shelf> getShelf(
        com.google.example.library.v1.GetShelfRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SHELF, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists shelves. The order is unspecified but deterministic. Newly created
     * shelves will not necessarily be added to the end of this list.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.example.library.v1.ListShelvesResponse> listShelves(
        com.google.example.library.v1.ListShelvesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_SHELVES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a shelf. Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteShelf(
        com.google.example.library.v1.DeleteShelfRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_SHELF, getCallOptions()), request);
    }

    /**
     * <pre>
     * Merges two shelves by adding all books from the shelf named
     * `other_shelf_name` to shelf `name`, and deletes
     * `other_shelf_name`. Returns the updated shelf.
     * The book ids of the moved books may not be the same as the original books.
     * Returns NOT_FOUND if either shelf does not exist.
     * This call is a no-op if the specified shelves are the same.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.example.library.v1.Shelf> mergeShelves(
        com.google.example.library.v1.MergeShelvesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MERGE_SHELVES, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a book, and returns the new Book.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.example.library.v1.Book> createBook(
        com.google.example.library.v1.CreateBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_BOOK, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a book. Returns NOT_FOUND if the book does not exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.example.library.v1.Book> getBook(
        com.google.example.library.v1.GetBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BOOK, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists books in a shelf. The order is unspecified but deterministic. Newly
     * created books will not necessarily be added to the end of this list.
     * Returns NOT_FOUND if the shelf does not exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.example.library.v1.ListBooksResponse> listBooks(
        com.google.example.library.v1.ListBooksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_BOOKS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a book. Returns NOT_FOUND if the book does not exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBook(
        com.google.example.library.v1.DeleteBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_BOOK, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a book. Returns INVALID_ARGUMENT if the name of the book
     * is non-empty and does equal the previous name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.example.library.v1.Book> updateBook(
        com.google.example.library.v1.UpdateBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_BOOK, getCallOptions()), request);
    }

    /**
     * <pre>
     * Moves a book to another shelf, and returns the new book. The book
     * id of the new book may not be the same as the original book.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.example.library.v1.Book> moveBook(
        com.google.example.library.v1.MoveBookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MOVE_BOOK, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SHELF = 0;
  private static final int METHODID_GET_SHELF = 1;
  private static final int METHODID_LIST_SHELVES = 2;
  private static final int METHODID_DELETE_SHELF = 3;
  private static final int METHODID_MERGE_SHELVES = 4;
  private static final int METHODID_CREATE_BOOK = 5;
  private static final int METHODID_GET_BOOK = 6;
  private static final int METHODID_LIST_BOOKS = 7;
  private static final int METHODID_DELETE_BOOK = 8;
  private static final int METHODID_UPDATE_BOOK = 9;
  private static final int METHODID_MOVE_BOOK = 10;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LibraryServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(LibraryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SHELF:
          serviceImpl.createShelf((com.google.example.library.v1.CreateShelfRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.v1.Shelf>) responseObserver);
          break;
        case METHODID_GET_SHELF:
          serviceImpl.getShelf((com.google.example.library.v1.GetShelfRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.v1.Shelf>) responseObserver);
          break;
        case METHODID_LIST_SHELVES:
          serviceImpl.listShelves((com.google.example.library.v1.ListShelvesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.v1.ListShelvesResponse>) responseObserver);
          break;
        case METHODID_DELETE_SHELF:
          serviceImpl.deleteShelf((com.google.example.library.v1.DeleteShelfRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_MERGE_SHELVES:
          serviceImpl.mergeShelves((com.google.example.library.v1.MergeShelvesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.v1.Shelf>) responseObserver);
          break;
        case METHODID_CREATE_BOOK:
          serviceImpl.createBook((com.google.example.library.v1.CreateBookRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.v1.Book>) responseObserver);
          break;
        case METHODID_GET_BOOK:
          serviceImpl.getBook((com.google.example.library.v1.GetBookRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.v1.Book>) responseObserver);
          break;
        case METHODID_LIST_BOOKS:
          serviceImpl.listBooks((com.google.example.library.v1.ListBooksRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.v1.ListBooksResponse>) responseObserver);
          break;
        case METHODID_DELETE_BOOK:
          serviceImpl.deleteBook((com.google.example.library.v1.DeleteBookRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_BOOK:
          serviceImpl.updateBook((com.google.example.library.v1.UpdateBookRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.v1.Book>) responseObserver);
          break;
        case METHODID_MOVE_BOOK:
          serviceImpl.moveBook((com.google.example.library.v1.MoveBookRequest) request,
              (io.grpc.stub.StreamObserver<com.google.example.library.v1.Book>) responseObserver);
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
        METHOD_CREATE_SHELF,
        METHOD_GET_SHELF,
        METHOD_LIST_SHELVES,
        METHOD_DELETE_SHELF,
        METHOD_MERGE_SHELVES,
        METHOD_CREATE_BOOK,
        METHOD_GET_BOOK,
        METHOD_LIST_BOOKS,
        METHOD_DELETE_BOOK,
        METHOD_UPDATE_BOOK,
        METHOD_MOVE_BOOK);
  }

}
