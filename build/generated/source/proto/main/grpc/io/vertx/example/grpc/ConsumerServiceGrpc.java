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
public final class ConsumerServiceGrpc {

  private ConsumerServiceGrpc() {}

  public static final String SERVICE_NAME = "io.vertx.example.grpc.ConsumerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.vertx.example.grpc.Messages.StreamingOutputCallRequest,
      io.vertx.example.grpc.Messages.StreamingOutputCallResponse> getStreamingOutputCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamingOutputCall",
      requestType = io.vertx.example.grpc.Messages.StreamingOutputCallRequest.class,
      responseType = io.vertx.example.grpc.Messages.StreamingOutputCallResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.vertx.example.grpc.Messages.StreamingOutputCallRequest,
      io.vertx.example.grpc.Messages.StreamingOutputCallResponse> getStreamingOutputCallMethod() {
    io.grpc.MethodDescriptor<io.vertx.example.grpc.Messages.StreamingOutputCallRequest, io.vertx.example.grpc.Messages.StreamingOutputCallResponse> getStreamingOutputCallMethod;
    if ((getStreamingOutputCallMethod = ConsumerServiceGrpc.getStreamingOutputCallMethod) == null) {
      synchronized (ConsumerServiceGrpc.class) {
        if ((getStreamingOutputCallMethod = ConsumerServiceGrpc.getStreamingOutputCallMethod) == null) {
          ConsumerServiceGrpc.getStreamingOutputCallMethod = getStreamingOutputCallMethod = 
              io.grpc.MethodDescriptor.<io.vertx.example.grpc.Messages.StreamingOutputCallRequest, io.vertx.example.grpc.Messages.StreamingOutputCallResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "io.vertx.example.grpc.ConsumerService", "StreamingOutputCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.vertx.example.grpc.Messages.StreamingOutputCallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.vertx.example.grpc.Messages.StreamingOutputCallResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ConsumerServiceMethodDescriptorSupplier("StreamingOutputCall"))
                  .build();
          }
        }
     }
     return getStreamingOutputCallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConsumerServiceStub newStub(io.grpc.Channel channel) {
    return new ConsumerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConsumerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ConsumerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConsumerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ConsumerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ConsumerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * One request followed by a sequence of responses (streamed download).
     * The server returns the payload with client desired type and sizes.
     * </pre>
     */
    public void streamingOutputCall(io.vertx.example.grpc.Messages.StreamingOutputCallRequest request,
        io.grpc.stub.StreamObserver<io.vertx.example.grpc.Messages.StreamingOutputCallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamingOutputCallMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamingOutputCallMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                io.vertx.example.grpc.Messages.StreamingOutputCallRequest,
                io.vertx.example.grpc.Messages.StreamingOutputCallResponse>(
                  this, METHODID_STREAMING_OUTPUT_CALL)))
          .build();
    }
  }

  /**
   */
  public static final class ConsumerServiceStub extends io.grpc.stub.AbstractStub<ConsumerServiceStub> {
    private ConsumerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConsumerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsumerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConsumerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * One request followed by a sequence of responses (streamed download).
     * The server returns the payload with client desired type and sizes.
     * </pre>
     */
    public void streamingOutputCall(io.vertx.example.grpc.Messages.StreamingOutputCallRequest request,
        io.grpc.stub.StreamObserver<io.vertx.example.grpc.Messages.StreamingOutputCallResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamingOutputCallMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConsumerServiceBlockingStub extends io.grpc.stub.AbstractStub<ConsumerServiceBlockingStub> {
    private ConsumerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConsumerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsumerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConsumerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * One request followed by a sequence of responses (streamed download).
     * The server returns the payload with client desired type and sizes.
     * </pre>
     */
    public java.util.Iterator<io.vertx.example.grpc.Messages.StreamingOutputCallResponse> streamingOutputCall(
        io.vertx.example.grpc.Messages.StreamingOutputCallRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamingOutputCallMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConsumerServiceFutureStub extends io.grpc.stub.AbstractStub<ConsumerServiceFutureStub> {
    private ConsumerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConsumerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsumerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConsumerServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAMING_OUTPUT_CALL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConsumerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConsumerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAMING_OUTPUT_CALL:
          serviceImpl.streamingOutputCall((io.vertx.example.grpc.Messages.StreamingOutputCallRequest) request,
              (io.grpc.stub.StreamObserver<io.vertx.example.grpc.Messages.StreamingOutputCallResponse>) responseObserver);
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

  private static abstract class ConsumerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConsumerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.vertx.example.grpc.ServiceDefinitions.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConsumerService");
    }
  }

  private static final class ConsumerServiceFileDescriptorSupplier
      extends ConsumerServiceBaseDescriptorSupplier {
    ConsumerServiceFileDescriptorSupplier() {}
  }

  private static final class ConsumerServiceMethodDescriptorSupplier
      extends ConsumerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConsumerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConsumerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConsumerServiceFileDescriptorSupplier())
              .addMethod(getStreamingOutputCallMethod())
              .build();
        }
      }
    }
    return result;
  }
}
