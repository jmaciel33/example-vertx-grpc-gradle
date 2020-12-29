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
public final class PingPongServiceGrpc {

  private PingPongServiceGrpc() {}

  public static final String SERVICE_NAME = "io.vertx.example.grpc.PingPongService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.vertx.example.grpc.Messages.SimpleRequest,
      io.vertx.example.grpc.Messages.SimpleResponse> getUnaryCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnaryCall",
      requestType = io.vertx.example.grpc.Messages.SimpleRequest.class,
      responseType = io.vertx.example.grpc.Messages.SimpleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.vertx.example.grpc.Messages.SimpleRequest,
      io.vertx.example.grpc.Messages.SimpleResponse> getUnaryCallMethod() {
    io.grpc.MethodDescriptor<io.vertx.example.grpc.Messages.SimpleRequest, io.vertx.example.grpc.Messages.SimpleResponse> getUnaryCallMethod;
    if ((getUnaryCallMethod = PingPongServiceGrpc.getUnaryCallMethod) == null) {
      synchronized (PingPongServiceGrpc.class) {
        if ((getUnaryCallMethod = PingPongServiceGrpc.getUnaryCallMethod) == null) {
          PingPongServiceGrpc.getUnaryCallMethod = getUnaryCallMethod = 
              io.grpc.MethodDescriptor.<io.vertx.example.grpc.Messages.SimpleRequest, io.vertx.example.grpc.Messages.SimpleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "io.vertx.example.grpc.PingPongService", "UnaryCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.vertx.example.grpc.Messages.SimpleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.vertx.example.grpc.Messages.SimpleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PingPongServiceMethodDescriptorSupplier("UnaryCall"))
                  .build();
          }
        }
     }
     return getUnaryCallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PingPongServiceStub newStub(io.grpc.Channel channel) {
    return new PingPongServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PingPongServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PingPongServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PingPongServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PingPongServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PingPongServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * One request followed by one response.
     * </pre>
     */
    public void unaryCall(io.vertx.example.grpc.Messages.SimpleRequest request,
        io.grpc.stub.StreamObserver<io.vertx.example.grpc.Messages.SimpleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnaryCallMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUnaryCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.vertx.example.grpc.Messages.SimpleRequest,
                io.vertx.example.grpc.Messages.SimpleResponse>(
                  this, METHODID_UNARY_CALL)))
          .build();
    }
  }

  /**
   */
  public static final class PingPongServiceStub extends io.grpc.stub.AbstractStub<PingPongServiceStub> {
    private PingPongServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PingPongServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingPongServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PingPongServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * One request followed by one response.
     * </pre>
     */
    public void unaryCall(io.vertx.example.grpc.Messages.SimpleRequest request,
        io.grpc.stub.StreamObserver<io.vertx.example.grpc.Messages.SimpleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnaryCallMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PingPongServiceBlockingStub extends io.grpc.stub.AbstractStub<PingPongServiceBlockingStub> {
    private PingPongServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PingPongServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingPongServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PingPongServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * One request followed by one response.
     * </pre>
     */
    public io.vertx.example.grpc.Messages.SimpleResponse unaryCall(io.vertx.example.grpc.Messages.SimpleRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnaryCallMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PingPongServiceFutureStub extends io.grpc.stub.AbstractStub<PingPongServiceFutureStub> {
    private PingPongServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PingPongServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingPongServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PingPongServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * One request followed by one response.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.vertx.example.grpc.Messages.SimpleResponse> unaryCall(
        io.vertx.example.grpc.Messages.SimpleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnaryCallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UNARY_CALL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PingPongServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PingPongServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UNARY_CALL:
          serviceImpl.unaryCall((io.vertx.example.grpc.Messages.SimpleRequest) request,
              (io.grpc.stub.StreamObserver<io.vertx.example.grpc.Messages.SimpleResponse>) responseObserver);
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

  private static abstract class PingPongServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PingPongServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.vertx.example.grpc.ServiceDefinitions.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PingPongService");
    }
  }

  private static final class PingPongServiceFileDescriptorSupplier
      extends PingPongServiceBaseDescriptorSupplier {
    PingPongServiceFileDescriptorSupplier() {}
  }

  private static final class PingPongServiceMethodDescriptorSupplier
      extends PingPongServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PingPongServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PingPongServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PingPongServiceFileDescriptorSupplier())
              .addMethod(getUnaryCallMethod())
              .build();
        }
      }
    }
    return result;
  }
}
