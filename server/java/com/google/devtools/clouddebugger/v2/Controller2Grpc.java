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
 * The Controller service provides the API for orchestrating a collection of
 * debugger agents to perform debugging tasks. These agents are each attached
 * to a process of an application which may include one or more replicas.
 * The debugger agents register with the Controller to identify the application
 * being debugged, the Debuggee. All agents that register with the same data,
 * represent the same Debuggee, and are assigned the same `debuggee_id`.
 * The debugger agents call the Controller to retrieve  the list of active
 * Breakpoints. Agents with the same `debuggee_id` get the same breakpoints
 * list. An agent that can fulfill the breakpoint request updates the
 * Controller with the breakpoint result. The controller selects the first
 * result received and discards the rest of the results.
 * Agents that poll again for active breakpoints will no longer have
 * the completed breakpoint in the list and should remove that breakpoint from
 * their attached process.
 * The Controller service does not provide a way to retrieve the results of
 * a completed breakpoint. This functionality is available using the Debugger
 * service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: google/devtools/clouddebugger/v2/controller.proto")
public class Controller2Grpc {

  private Controller2Grpc() {}

  public static final String SERVICE_NAME = "google.devtools.clouddebugger.v2.Controller2";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest,
      com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse> METHOD_REGISTER_DEBUGGEE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.clouddebugger.v2.Controller2", "RegisterDebuggee"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest,
      com.google.devtools.clouddebugger.v2.ListActiveBreakpointsResponse> METHOD_LIST_ACTIVE_BREAKPOINTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.clouddebugger.v2.Controller2", "ListActiveBreakpoints"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouddebugger.v2.ListActiveBreakpointsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.devtools.clouddebugger.v2.UpdateActiveBreakpointRequest,
      com.google.devtools.clouddebugger.v2.UpdateActiveBreakpointResponse> METHOD_UPDATE_ACTIVE_BREAKPOINT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.devtools.clouddebugger.v2.Controller2", "UpdateActiveBreakpoint"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouddebugger.v2.UpdateActiveBreakpointRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.devtools.clouddebugger.v2.UpdateActiveBreakpointResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Controller2Stub newStub(io.grpc.Channel channel) {
    return new Controller2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Controller2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Controller2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static Controller2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Controller2FutureStub(channel);
  }

  /**
   * <pre>
   * The Controller service provides the API for orchestrating a collection of
   * debugger agents to perform debugging tasks. These agents are each attached
   * to a process of an application which may include one or more replicas.
   * The debugger agents register with the Controller to identify the application
   * being debugged, the Debuggee. All agents that register with the same data,
   * represent the same Debuggee, and are assigned the same `debuggee_id`.
   * The debugger agents call the Controller to retrieve  the list of active
   * Breakpoints. Agents with the same `debuggee_id` get the same breakpoints
   * list. An agent that can fulfill the breakpoint request updates the
   * Controller with the breakpoint result. The controller selects the first
   * result received and discards the rest of the results.
   * Agents that poll again for active breakpoints will no longer have
   * the completed breakpoint in the list and should remove that breakpoint from
   * their attached process.
   * The Controller service does not provide a way to retrieve the results of
   * a completed breakpoint. This functionality is available using the Debugger
   * service.
   * </pre>
   */
  public static abstract class Controller2ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Registers the debuggee with the controller service.
     * All agents attached to the same application should call this method with
     * the same request content to get back the same stable `debuggee_id`. Agents
     * should call this method again whenever `google.rpc.Code.NOT_FOUND` is
     * returned from any controller method.
     * This allows the controller service to disable the agent or recover from any
     * data loss. If the debuggee is disabled by the server, the response will
     * have `is_disabled` set to `true`.
     * </pre>
     */
    public void registerDebuggee(com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_DEBUGGEE, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of all active breakpoints for the debuggee.
     * The breakpoint specification (location, condition, and expression
     * fields) is semantically immutable, although the field values may
     * change. For example, an agent may update the location line number
     * to reflect the actual line where the breakpoint was set, but this
     * doesn't change the breakpoint semantics.
     * This means that an agent does not need to check if a breakpoint has changed
     * when it encounters the same breakpoint on a successive call.
     * Moreover, an agent should remember the breakpoints that are completed
     * until the controller removes them from the active list to avoid
     * setting those breakpoints again.
     * </pre>
     */
    public void listActiveBreakpoints(com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.ListActiveBreakpointsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_ACTIVE_BREAKPOINTS, responseObserver);
    }

    /**
     * <pre>
     * Updates the breakpoint state or mutable fields.
     * The entire Breakpoint message must be sent back to the controller
     * service.
     * Updates to active breakpoint fields are only allowed if the new value
     * does not change the breakpoint specification. Updates to the `location`,
     * `condition` and `expression` fields should not alter the breakpoint
     * semantics. These may only make changes such as canonicalizing a value
     * or snapping the location to the correct line of code.
     * </pre>
     */
    public void updateActiveBreakpoint(com.google.devtools.clouddebugger.v2.UpdateActiveBreakpointRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.UpdateActiveBreakpointResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_ACTIVE_BREAKPOINT, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_REGISTER_DEBUGGEE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest,
                com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse>(
                  this, METHODID_REGISTER_DEBUGGEE)))
          .addMethod(
            METHOD_LIST_ACTIVE_BREAKPOINTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest,
                com.google.devtools.clouddebugger.v2.ListActiveBreakpointsResponse>(
                  this, METHODID_LIST_ACTIVE_BREAKPOINTS)))
          .addMethod(
            METHOD_UPDATE_ACTIVE_BREAKPOINT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.devtools.clouddebugger.v2.UpdateActiveBreakpointRequest,
                com.google.devtools.clouddebugger.v2.UpdateActiveBreakpointResponse>(
                  this, METHODID_UPDATE_ACTIVE_BREAKPOINT)))
          .build();
    }
  }

  /**
   * <pre>
   * The Controller service provides the API for orchestrating a collection of
   * debugger agents to perform debugging tasks. These agents are each attached
   * to a process of an application which may include one or more replicas.
   * The debugger agents register with the Controller to identify the application
   * being debugged, the Debuggee. All agents that register with the same data,
   * represent the same Debuggee, and are assigned the same `debuggee_id`.
   * The debugger agents call the Controller to retrieve  the list of active
   * Breakpoints. Agents with the same `debuggee_id` get the same breakpoints
   * list. An agent that can fulfill the breakpoint request updates the
   * Controller with the breakpoint result. The controller selects the first
   * result received and discards the rest of the results.
   * Agents that poll again for active breakpoints will no longer have
   * the completed breakpoint in the list and should remove that breakpoint from
   * their attached process.
   * The Controller service does not provide a way to retrieve the results of
   * a completed breakpoint. This functionality is available using the Debugger
   * service.
   * </pre>
   */
  public static final class Controller2Stub extends io.grpc.stub.AbstractStub<Controller2Stub> {
    private Controller2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Controller2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Controller2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Controller2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers the debuggee with the controller service.
     * All agents attached to the same application should call this method with
     * the same request content to get back the same stable `debuggee_id`. Agents
     * should call this method again whenever `google.rpc.Code.NOT_FOUND` is
     * returned from any controller method.
     * This allows the controller service to disable the agent or recover from any
     * data loss. If the debuggee is disabled by the server, the response will
     * have `is_disabled` set to `true`.
     * </pre>
     */
    public void registerDebuggee(com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_DEBUGGEE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the list of all active breakpoints for the debuggee.
     * The breakpoint specification (location, condition, and expression
     * fields) is semantically immutable, although the field values may
     * change. For example, an agent may update the location line number
     * to reflect the actual line where the breakpoint was set, but this
     * doesn't change the breakpoint semantics.
     * This means that an agent does not need to check if a breakpoint has changed
     * when it encounters the same breakpoint on a successive call.
     * Moreover, an agent should remember the breakpoints that are completed
     * until the controller removes them from the active list to avoid
     * setting those breakpoints again.
     * </pre>
     */
    public void listActiveBreakpoints(com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.ListActiveBreakpointsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_ACTIVE_BREAKPOINTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the breakpoint state or mutable fields.
     * The entire Breakpoint message must be sent back to the controller
     * service.
     * Updates to active breakpoint fields are only allowed if the new value
     * does not change the breakpoint specification. Updates to the `location`,
     * `condition` and `expression` fields should not alter the breakpoint
     * semantics. These may only make changes such as canonicalizing a value
     * or snapping the location to the correct line of code.
     * </pre>
     */
    public void updateActiveBreakpoint(com.google.devtools.clouddebugger.v2.UpdateActiveBreakpointRequest request,
        io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.UpdateActiveBreakpointResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ACTIVE_BREAKPOINT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Controller service provides the API for orchestrating a collection of
   * debugger agents to perform debugging tasks. These agents are each attached
   * to a process of an application which may include one or more replicas.
   * The debugger agents register with the Controller to identify the application
   * being debugged, the Debuggee. All agents that register with the same data,
   * represent the same Debuggee, and are assigned the same `debuggee_id`.
   * The debugger agents call the Controller to retrieve  the list of active
   * Breakpoints. Agents with the same `debuggee_id` get the same breakpoints
   * list. An agent that can fulfill the breakpoint request updates the
   * Controller with the breakpoint result. The controller selects the first
   * result received and discards the rest of the results.
   * Agents that poll again for active breakpoints will no longer have
   * the completed breakpoint in the list and should remove that breakpoint from
   * their attached process.
   * The Controller service does not provide a way to retrieve the results of
   * a completed breakpoint. This functionality is available using the Debugger
   * service.
   * </pre>
   */
  public static final class Controller2BlockingStub extends io.grpc.stub.AbstractStub<Controller2BlockingStub> {
    private Controller2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Controller2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Controller2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Controller2BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers the debuggee with the controller service.
     * All agents attached to the same application should call this method with
     * the same request content to get back the same stable `debuggee_id`. Agents
     * should call this method again whenever `google.rpc.Code.NOT_FOUND` is
     * returned from any controller method.
     * This allows the controller service to disable the agent or recover from any
     * data loss. If the debuggee is disabled by the server, the response will
     * have `is_disabled` set to `true`.
     * </pre>
     */
    public com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse registerDebuggee(com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_DEBUGGEE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the list of all active breakpoints for the debuggee.
     * The breakpoint specification (location, condition, and expression
     * fields) is semantically immutable, although the field values may
     * change. For example, an agent may update the location line number
     * to reflect the actual line where the breakpoint was set, but this
     * doesn't change the breakpoint semantics.
     * This means that an agent does not need to check if a breakpoint has changed
     * when it encounters the same breakpoint on a successive call.
     * Moreover, an agent should remember the breakpoints that are completed
     * until the controller removes them from the active list to avoid
     * setting those breakpoints again.
     * </pre>
     */
    public com.google.devtools.clouddebugger.v2.ListActiveBreakpointsResponse listActiveBreakpoints(com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_ACTIVE_BREAKPOINTS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the breakpoint state or mutable fields.
     * The entire Breakpoint message must be sent back to the controller
     * service.
     * Updates to active breakpoint fields are only allowed if the new value
     * does not change the breakpoint specification. Updates to the `location`,
     * `condition` and `expression` fields should not alter the breakpoint
     * semantics. These may only make changes such as canonicalizing a value
     * or snapping the location to the correct line of code.
     * </pre>
     */
    public com.google.devtools.clouddebugger.v2.UpdateActiveBreakpointResponse updateActiveBreakpoint(com.google.devtools.clouddebugger.v2.UpdateActiveBreakpointRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_ACTIVE_BREAKPOINT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Controller service provides the API for orchestrating a collection of
   * debugger agents to perform debugging tasks. These agents are each attached
   * to a process of an application which may include one or more replicas.
   * The debugger agents register with the Controller to identify the application
   * being debugged, the Debuggee. All agents that register with the same data,
   * represent the same Debuggee, and are assigned the same `debuggee_id`.
   * The debugger agents call the Controller to retrieve  the list of active
   * Breakpoints. Agents with the same `debuggee_id` get the same breakpoints
   * list. An agent that can fulfill the breakpoint request updates the
   * Controller with the breakpoint result. The controller selects the first
   * result received and discards the rest of the results.
   * Agents that poll again for active breakpoints will no longer have
   * the completed breakpoint in the list and should remove that breakpoint from
   * their attached process.
   * The Controller service does not provide a way to retrieve the results of
   * a completed breakpoint. This functionality is available using the Debugger
   * service.
   * </pre>
   */
  public static final class Controller2FutureStub extends io.grpc.stub.AbstractStub<Controller2FutureStub> {
    private Controller2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Controller2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Controller2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Controller2FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers the debuggee with the controller service.
     * All agents attached to the same application should call this method with
     * the same request content to get back the same stable `debuggee_id`. Agents
     * should call this method again whenever `google.rpc.Code.NOT_FOUND` is
     * returned from any controller method.
     * This allows the controller service to disable the agent or recover from any
     * data loss. If the debuggee is disabled by the server, the response will
     * have `is_disabled` set to `true`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse> registerDebuggee(
        com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_DEBUGGEE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the list of all active breakpoints for the debuggee.
     * The breakpoint specification (location, condition, and expression
     * fields) is semantically immutable, although the field values may
     * change. For example, an agent may update the location line number
     * to reflect the actual line where the breakpoint was set, but this
     * doesn't change the breakpoint semantics.
     * This means that an agent does not need to check if a breakpoint has changed
     * when it encounters the same breakpoint on a successive call.
     * Moreover, an agent should remember the breakpoints that are completed
     * until the controller removes them from the active list to avoid
     * setting those breakpoints again.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.clouddebugger.v2.ListActiveBreakpointsResponse> listActiveBreakpoints(
        com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_ACTIVE_BREAKPOINTS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the breakpoint state or mutable fields.
     * The entire Breakpoint message must be sent back to the controller
     * service.
     * Updates to active breakpoint fields are only allowed if the new value
     * does not change the breakpoint specification. Updates to the `location`,
     * `condition` and `expression` fields should not alter the breakpoint
     * semantics. These may only make changes such as canonicalizing a value
     * or snapping the location to the correct line of code.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.devtools.clouddebugger.v2.UpdateActiveBreakpointResponse> updateActiveBreakpoint(
        com.google.devtools.clouddebugger.v2.UpdateActiveBreakpointRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ACTIVE_BREAKPOINT, getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_DEBUGGEE = 0;
  private static final int METHODID_LIST_ACTIVE_BREAKPOINTS = 1;
  private static final int METHODID_UPDATE_ACTIVE_BREAKPOINT = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Controller2ImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(Controller2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_DEBUGGEE:
          serviceImpl.registerDebuggee((com.google.devtools.clouddebugger.v2.RegisterDebuggeeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.RegisterDebuggeeResponse>) responseObserver);
          break;
        case METHODID_LIST_ACTIVE_BREAKPOINTS:
          serviceImpl.listActiveBreakpoints((com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.ListActiveBreakpointsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ACTIVE_BREAKPOINT:
          serviceImpl.updateActiveBreakpoint((com.google.devtools.clouddebugger.v2.UpdateActiveBreakpointRequest) request,
              (io.grpc.stub.StreamObserver<com.google.devtools.clouddebugger.v2.UpdateActiveBreakpointResponse>) responseObserver);
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
        METHOD_REGISTER_DEBUGGEE,
        METHOD_LIST_ACTIVE_BREAKPOINTS,
        METHOD_UPDATE_ACTIVE_BREAKPOINT);
  }

}
