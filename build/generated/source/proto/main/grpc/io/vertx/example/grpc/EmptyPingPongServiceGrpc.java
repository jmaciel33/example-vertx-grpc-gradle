package io.vertx.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: service-definitions.proto")
public final class EmptyPingPongServiceGrpc {

  private EmptyPingPongServiceGrpc() {}

  public static final String SERVICE_NAME = "io.vertx.example.grpc.EmptyPingPongService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.vertx.example.grpc.EmptyProtos.Empty,
      io.vertx.example.grpc.EmptyProtos.Empty> getEmptyCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmptyCall",
      requestType = io.vertx.example.grpc.EmptyProtos.Empty.class,
      responseType = io.vertx.example.grpc.EmptyProtos.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.vertx.example.grpc.EmptyProtos.Empty,
      io.vertx.example.grpc.EmptyProtos.Empty> getEmptyCallMethod() {
    io.grpc.MethodDescriptor<io.vertx.example.grpc.EmptyProtos.Empty, io.vertx.example.grpc.EmptyProtos.Empty> getEmptyCallMethod;
    if ((getEmptyCallMethod = EmptyPingPongServiceGrpc.getEmptyCallMethod) == null) {
      synchronized (EmptyPingPongServiceGrpc.class) {
        if ((getEmptyCallMethod = EmptyPingPongServiceGrpc.getEmptyCallMethod) == null) {
          EmptyPingPongServiceGrpc.getEmptyCallMethod = getEmptyCallMethod = 
              io.grpc.MethodDescriptor.<io.vertx.example.grpc.EmptyProtos.Empty, io.vertx.example.grpc.EmptyProtos.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "io.vertx.example.grpc.EmptyPingPongService", "EmptyCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.vertx.example.grpc.EmptyProtos.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.vertx.example.grpc.EmptyProtos.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new EmptyPingPongServiceMethodDescriptorSupplier("EmptyCall"))
                  .build();
          }
        }
     }
     return getEmptyCallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmptyPingPongServiceStub newStub(io.grpc.Channel channel) {
    return new EmptyPingPongServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmptyPingPongServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmptyPingPongServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmptyPingPongServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmptyPingPongServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class EmptyPingPongServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * One empty request followed by one empty response.
     * </pre>
     */
    public void emptyCall(io.vertx.example.grpc.EmptyProtos.Empty request,
        io.grpc.stub.StreamObserver<io.vertx.example.grpc.EmptyProtos.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEmptyCallMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEmptyCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.vertx.example.grpc.EmptyProtos.Empty,
                io.vertx.example.grpc.EmptyProtos.Empty>(
                  this, METHODID_EMPTY_CALL)))
          .build();
    }
  }

  /**
   */
  public static final class EmptyPingPongServiceStub extends io.grpc.stub.AbstractStub<EmptyPingPongServiceStub> {
    private EmptyPingPongServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmptyPingPongServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmptyPingPongServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmptyPingPongServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * One empty request followed by one empty response.
     * </pre>
     */
    public void emptyCall(io.vertx.example.grpc.EmptyProtos.Empty request,
        io.grpc.stub.StreamObserver<io.vertx.example.grpc.EmptyProtos.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmptyCallMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmptyPingPongServiceBlockingStub extends io.grpc.stub.AbstractStub<EmptyPingPongServiceBlockingStub> {
    private EmptyPingPongServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmptyPingPongServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmptyPingPongServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmptyPingPongServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * One empty request followed by one empty response.
     * </pre>
     */
    public io.vertx.example.grpc.EmptyProtos.Empty emptyCall(io.vertx.example.grpc.EmptyProtos.Empty request) {
      return blockingUnaryCall(
          getChannel(), getEmptyCallMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmptyPingPongServiceFutureStub extends io.grpc.stub.AbstractStub<EmptyPingPongServiceFutureStub> {
    private EmptyPingPongServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmptyPingPongServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmptyPingPongServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmptyPingPongServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * One empty request followed by one empty response.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.vertx.example.grpc.EmptyProtos.Empty> emptyCall(
        io.vertx.example.grpc.EmptyProtos.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getEmptyCallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EMPTY_CALL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmptyPingPongServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmptyPingPongServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EMPTY_CALL:
          serviceImpl.emptyCall((io.vertx.example.grpc.EmptyProtos.Empty) request,
              (io.grpc.stub.StreamObserver<io.vertx.example.grpc.EmptyProtos.Empty>) responseObserver);
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

  private static abstract class EmptyPingPongServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmptyPingPongServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.vertx.example.grpc.ServiceDefinitions.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmptyPingPongService");
    }
  }

  private static final class EmptyPingPongServiceFileDescriptorSupplier
      extends EmptyPingPongServiceBaseDescriptorSupplier {
    EmptyPingPongServiceFileDescriptorSupplier() {}
  }

  private static final class EmptyPingPongServiceMethodDescriptorSupplier
      extends EmptyPingPongServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmptyPingPongServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EmptyPingPongServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmptyPingPongServiceFileDescriptorSupplier())
              .addMethod(getEmptyCallMethod())
              .build();
        }
      }
    }
    return result;
  }
}
