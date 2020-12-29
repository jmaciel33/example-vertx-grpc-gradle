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
public final class ConversationalServiceGrpc {

  private ConversationalServiceGrpc() {}

  public static final String SERVICE_NAME = "io.vertx.example.grpc.ConversationalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.vertx.example.grpc.Messages.StreamingOutputCallRequest,
      io.vertx.example.grpc.Messages.StreamingOutputCallResponse> getFullDuplexCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FullDuplexCall",
      requestType = io.vertx.example.grpc.Messages.StreamingOutputCallRequest.class,
      responseType = io.vertx.example.grpc.Messages.StreamingOutputCallResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.vertx.example.grpc.Messages.StreamingOutputCallRequest,
      io.vertx.example.grpc.Messages.StreamingOutputCallResponse> getFullDuplexCallMethod() {
    io.grpc.MethodDescriptor<io.vertx.example.grpc.Messages.StreamingOutputCallRequest, io.vertx.example.grpc.Messages.StreamingOutputCallResponse> getFullDuplexCallMethod;
    if ((getFullDuplexCallMethod = ConversationalServiceGrpc.getFullDuplexCallMethod) == null) {
      synchronized (ConversationalServiceGrpc.class) {
        if ((getFullDuplexCallMethod = ConversationalServiceGrpc.getFullDuplexCallMethod) == null) {
          ConversationalServiceGrpc.getFullDuplexCallMethod = getFullDuplexCallMethod = 
              io.grpc.MethodDescriptor.<io.vertx.example.grpc.Messages.StreamingOutputCallRequest, io.vertx.example.grpc.Messages.StreamingOutputCallResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "io.vertx.example.grpc.ConversationalService", "FullDuplexCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.vertx.example.grpc.Messages.StreamingOutputCallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.vertx.example.grpc.Messages.StreamingOutputCallResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ConversationalServiceMethodDescriptorSupplier("FullDuplexCall"))
                  .build();
          }
        }
     }
     return getFullDuplexCallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConversationalServiceStub newStub(io.grpc.Channel channel) {
    return new ConversationalServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConversationalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ConversationalServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConversationalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ConversationalServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ConversationalServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A sequence of requests with each request served by the server immediately.
     * As one request could lead to multiple responses, this interface
     * demonstrates the idea of full duplexing.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.vertx.example.grpc.Messages.StreamingOutputCallRequest> fullDuplexCall(
        io.grpc.stub.StreamObserver<io.vertx.example.grpc.Messages.StreamingOutputCallResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFullDuplexCallMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFullDuplexCallMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                io.vertx.example.grpc.Messages.StreamingOutputCallRequest,
                io.vertx.example.grpc.Messages.StreamingOutputCallResponse>(
                  this, METHODID_FULL_DUPLEX_CALL)))
          .build();
    }
  }

  /**
   */
  public static final class ConversationalServiceStub extends io.grpc.stub.AbstractStub<ConversationalServiceStub> {
    private ConversationalServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConversationalServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversationalServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConversationalServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * A sequence of requests with each request served by the server immediately.
     * As one request could lead to multiple responses, this interface
     * demonstrates the idea of full duplexing.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.vertx.example.grpc.Messages.StreamingOutputCallRequest> fullDuplexCall(
        io.grpc.stub.StreamObserver<io.vertx.example.grpc.Messages.StreamingOutputCallResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFullDuplexCallMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ConversationalServiceBlockingStub extends io.grpc.stub.AbstractStub<ConversationalServiceBlockingStub> {
    private ConversationalServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConversationalServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversationalServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConversationalServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class ConversationalServiceFutureStub extends io.grpc.stub.AbstractStub<ConversationalServiceFutureStub> {
    private ConversationalServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConversationalServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversationalServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConversationalServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_FULL_DUPLEX_CALL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConversationalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConversationalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FULL_DUPLEX_CALL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fullDuplexCall(
              (io.grpc.stub.StreamObserver<io.vertx.example.grpc.Messages.StreamingOutputCallResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ConversationalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConversationalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.vertx.example.grpc.ServiceDefinitions.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConversationalService");
    }
  }

  private static final class ConversationalServiceFileDescriptorSupplier
      extends ConversationalServiceBaseDescriptorSupplier {
    ConversationalServiceFileDescriptorSupplier() {}
  }

  private static final class ConversationalServiceMethodDescriptorSupplier
      extends ConversationalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConversationalServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConversationalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConversationalServiceFileDescriptorSupplier())
              .addMethod(getFullDuplexCallMethod())
              .build();
        }
      }
    }
    return result;
  }
}
