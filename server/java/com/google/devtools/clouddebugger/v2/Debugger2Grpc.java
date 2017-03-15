package com.google.devtools.clouddebugger.v2;

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
 * The Debugger service provides the API that allows users to collect run-time
 * information from a running application, without stopping or slowing it down
 * and without modifying its state.  An application may include one or
 * more replicated processes performing the same work.
 * The application is represented using the Debuggee concept. The Debugger
 * service provides a way to query for available Debuggees, but does not
 * provide a way to create one.  A debuggee is created using the Controller
 * service, usually by running a debugger agent with the application.
 * The Debugger service enables the client to set one or more Breakpoints on a
 * Debuggee and collect the results of the set Breakpoints.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/devtools/clouddebugger/v2/debugger.proto")
public class Debugger2Grpc {

  private Debugger2Grpc() {}

  public static final String SERVICE_NAME = "google.devtools.clouddebugger.v2.Debugger2";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.clouddebugger.v2.SetBreakpointRequest,
      com.google.devtools.clouddebugger.v2.SetBreakpointResponse> METHOD_SET_BREAKPOINT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.clouddebugger.v2.Debugger2", "SetBreakpoint"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouddebugger.v2.SetBreakpointRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouddebugger.v2.SetBreakpointResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.clouddebugger.v2.GetBreakpointRequest,
      com.google.devtools.clouddebugger.v2.GetBreakpointResponse> METHOD_GET_BREAKPOINT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.clouddebugger.v2.Debugger2", "GetBreakpoint"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouddebugger.v2.GetBreakpointRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouddebugger.v2.GetBreakpointResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest,
      com.google.protobuf.Empty> METHOD_DELETE_BREAKPOINT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.clouddebugger.v2.Debugger2", "DeleteBreakpoint"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.clouddebugger.v2.ListBreakpointsRequest,
      com.google.devtools.clouddebugger.v2.ListBreakpointsResponse> METHOD_LIST_BREAKPOINTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.clouddebugger.v2.Debugger2", "ListBreakpoints"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouddebugger.v2.ListBreakpointsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouddebugger.v2.ListBreakpointsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.clouddebugger.v2.ListDebuggeesRequest,
      com.google.devtools.clouddebugger.v2.ListDebuggeesResponse> METHOD_LIST_DEBUGGEES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.clouddebugger.v2.Debugger2", "ListDebuggees"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouddebugger.v2.ListDebuggeesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouddebugger.v2.ListDebuggeesResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Debugger2Stub newStub(io.grpc.Channel channel) {
    return new Debugger2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Debugger2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Debugger2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static Debugger2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Debugger2FutureStub(channel);
  }

  /**
   * <pre>
   * The Debugger service provides the API that allows users to collect run-time
   * information from a running application, without stopping or slowing it down
   * and without modifying its state.  An application may include one or
   * more replicated processes performing the same work.
   * The application is represented using the Debuggee concept. The Debugger
   * service provides a way to query for available Debuggees, but does not
   * provide a way to create one.  A debuggee is created using the Controller
   * service, usually by running a debugger agent with the application.
   * The Debugger service enables the client to set one or more Breakpoints on a
   * Debuggee and collect the results of the set Breakpoints.
   * </pre>
   */
  public static abstract class Debugger2ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sets the breakpoint to the debuggee.
     * </pre>
     */
    public void setBreakpoint(com.google.devtools.clouddebugger.v2.SetBreakpointRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.SetBreakpointResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_BREAKPOINT, responseObserver);
    }

    /**
     * <pre>
     * Gets breakpoint information.
     * </pre>
     */
    public void getBreakpoint(com.google.devtools.clouddebugger.v2.GetBreakpointRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.GetBreakpointResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BREAKPOINT, responseObserver);
    }

    /**
     * <pre>
     * Deletes the breakpoint from the debuggee.
     * </pre>
     */
    public void deleteBreakpoint(com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_BREAKPOINT, responseObserver);
    }

    /**
     * <pre>
     * Lists all breakpoints for the debuggee.
     * </pre>
     */
    public void listBreakpoints(com.google.devtools.clouddebugger.v2.ListBreakpointsRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.ListBreakpointsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_BREAKPOINTS, responseObserver);
    }

    /**
     * <pre>
     * Lists all the debuggees that the user can set breakpoints to.
     * </pre>
     */
    public void listDebuggees(com.google.devtools.clouddebugger.v2.ListDebuggeesRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.ListDebuggeesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_DEBUGGEES, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SET_BREAKPOINT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.devtools.clouddebugger.v2.SetBreakpointRequest,
                com.google.devtools.clouddebugger.v2.SetBreakpointResponse>(
                  this, METHODID_SET_BREAKPOINT)))
          .addMethod(
            METHOD_GET_BREAKPOINT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.devtools.clouddebugger.v2.GetBreakpointRequest,
                com.google.devtools.clouddebugger.v2.GetBreakpointResponse>(
                  this, METHODID_GET_BREAKPOINT)))
          .addMethod(
            METHOD_DELETE_BREAKPOINT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_BREAKPOINT)))
          .addMethod(
            METHOD_LIST_BREAKPOINTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.devtools.clouddebugger.v2.ListBreakpointsRequest,
                com.google.devtools.clouddebugger.v2.ListBreakpointsResponse>(
                  this, METHODID_LIST_BREAKPOINTS)))
          .addMethod(
            METHOD_LIST_DEBUGGEES,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.devtools.clouddebugger.v2.ListDebuggeesRequest,
                com.google.devtools.clouddebugger.v2.ListDebuggeesResponse>(
                  this, METHODID_LIST_DEBUGGEES)))
          .build();
    }
  }

  /**
   * <pre>
   * The Debugger service provides the API that allows users to collect run-time
   * information from a running application, without stopping or slowing it down
   * and without modifying its state.  An application may include one or
   * more replicated processes performing the same work.
   * The application is represented using the Debuggee concept. The Debugger
   * service provides a way to query for available Debuggees, but does not
   * provide a way to create one.  A debuggee is created using the Controller
   * service, usually by running a debugger agent with the application.
   * The Debugger service enables the client to set one or more Breakpoints on a
   * Debuggee and collect the results of the set Breakpoints.
   * </pre>
   */
  public static final class Debugger2Stub extends io.grpc.stub.AbstractStub<Debugger2Stub> {
    private Debugger2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Debugger2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Debugger2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Debugger2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Sets the breakpoint to the debuggee.
     * </pre>
     */
    public void setBreakpoint(com.google.devtools.clouddebugger.v2.SetBreakpointRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.SetBreakpointResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_BREAKPOINT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets breakpoint information.
     * </pre>
     */
    public void getBreakpoint(com.google.devtools.clouddebugger.v2.GetBreakpointRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.GetBreakpointResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BREAKPOINT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the breakpoint from the debuggee.
     * </pre>
     */
    public void deleteBreakpoint(com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_BREAKPOINT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all breakpoints for the debuggee.
     * </pre>
     */
    public void listBreakpoints(com.google.devtools.clouddebugger.v2.ListBreakpointsRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.ListBreakpointsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_BREAKPOINTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all the debuggees that the user can set breakpoints to.
     * </pre>
     */
    public void listDebuggees(com.google.devtools.clouddebugger.v2.ListDebuggeesRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.ListDebuggeesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_DEBUGGEES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Debugger service provides the API that allows users to collect run-time
   * information from a running application, without stopping or slowing it down
   * and without modifying its state.  An application may include one or
   * more replicated processes performing the same work.
   * The application is represented using the Debuggee concept. The Debugger
   * service provides a way to query for available Debuggees, but does not
   * provide a way to create one.  A debuggee is created using the Controller
   * service, usually by running a debugger agent with the application.
   * The Debugger service enables the client to set one or more Breakpoints on a
   * Debuggee and collect the results of the set Breakpoints.
   * </pre>
   */
  public static final class Debugger2BlockingStub extends io.grpc.stub.AbstractStub<Debugger2BlockingStub> {
    private Debugger2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Debugger2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Debugger2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Debugger2BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sets the breakpoint to the debuggee.
     * </pre>
     */
    public com.google.devtools.clouddebugger.v2.SetBreakpointResponse setBreakpoint(com.google.devtools.clouddebugger.v2.SetBreakpointRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_BREAKPOINT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets breakpoint information.
     * </pre>
     */
    public com.google.devtools.clouddebugger.v2.GetBreakpointResponse getBreakpoint(com.google.devtools.clouddebugger.v2.GetBreakpointRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BREAKPOINT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the breakpoint from the debuggee.
     * </pre>
     */
    public com.google.protobuf.Empty deleteBreakpoint(com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_BREAKPOINT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all breakpoints for the debuggee.
     * </pre>
     */
    public com.google.devtools.clouddebugger.v2.ListBreakpointsResponse listBreakpoints(com.google.devtools.clouddebugger.v2.ListBreakpointsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_BREAKPOINTS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all the debuggees that the user can set breakpoints to.
     * </pre>
     */
    public com.google.devtools.clouddebugger.v2.ListDebuggeesResponse listDebuggees(com.google.devtools.clouddebugger.v2.ListDebuggeesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_DEBUGGEES, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Debugger service provides the API that allows users to collect run-time
   * information from a running application, without stopping or slowing it down
   * and without modifying its state.  An application may include one or
   * more replicated processes performing the same work.
   * The application is represented using the Debuggee concept. The Debugger
   * service provides a way to query for available Debuggees, but does not
   * provide a way to create one.  A debuggee is created using the Controller
   * service, usually by running a debugger agent with the application.
   * The Debugger service enables the client to set one or more Breakpoints on a
   * Debuggee and collect the results of the set Breakpoints.
   * </pre>
   */
  public static final class Debugger2FutureStub extends io.grpc.stub.AbstractStub<Debugger2FutureStub> {
    private Debugger2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Debugger2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Debugger2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Debugger2FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sets the breakpoint to the debuggee.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.clouddebugger.v2.SetBreakpointResponse> setBreakpoint(
        com.google.devtools.clouddebugger.v2.SetBreakpointRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_BREAKPOINT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets breakpoint information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.clouddebugger.v2.GetBreakpointResponse> getBreakpoint(
        com.google.devtools.clouddebugger.v2.GetBreakpointRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BREAKPOINT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the breakpoint from the debuggee.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBreakpoint(
        com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_BREAKPOINT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all breakpoints for the debuggee.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.clouddebugger.v2.ListBreakpointsResponse> listBreakpoints(
        com.google.devtools.clouddebugger.v2.ListBreakpointsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_BREAKPOINTS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all the debuggees that the user can set breakpoints to.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.clouddebugger.v2.ListDebuggeesResponse> listDebuggees(
        com.google.devtools.clouddebugger.v2.ListDebuggeesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_DEBUGGEES, getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_BREAKPOINT = 0;
  private static final int METHODID_GET_BREAKPOINT = 1;
  private static final int METHODID_DELETE_BREAKPOINT = 2;
  private static final int METHODID_LIST_BREAKPOINTS = 3;
  private static final int METHODID_LIST_DEBUGGEES = 4;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Debugger2ImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(Debugger2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_BREAKPOINT:
          serviceImpl.setBreakpoint((com.google.devtools.clouddebugger.v2.SetBreakpointRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.SetBreakpointResponse>) responseObserver);
          break;
        case METHODID_GET_BREAKPOINT:
          serviceImpl.getBreakpoint((com.google.devtools.clouddebugger.v2.GetBreakpointRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.GetBreakpointResponse>) responseObserver);
          break;
        case METHODID_DELETE_BREAKPOINT:
          serviceImpl.deleteBreakpoint((com.google.devtools.clouddebugger.v2.DeleteBreakpointRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_BREAKPOINTS:
          serviceImpl.listBreakpoints((com.google.devtools.clouddebugger.v2.ListBreakpointsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.ListBreakpointsResponse>) responseObserver);
          break;
        case METHODID_LIST_DEBUGGEES:
          serviceImpl.listDebuggees((com.google.devtools.clouddebugger.v2.ListDebuggeesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.ListDebuggeesResponse>) responseObserver);
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
        METHOD_SET_BREAKPOINT,
        METHOD_GET_BREAKPOINT,
        METHOD_DELETE_BREAKPOINT,
        METHOD_LIST_BREAKPOINTS,
        METHOD_LIST_DEBUGGEES);
  }

}
