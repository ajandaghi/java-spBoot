package services;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import test.TestSayHelloGrpc;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(
                "localhost", 9090).usePlaintext().build();
        TestSayHelloGrpc.TestSayHelloBlockingStub stub
                = TestSayHelloGrpc.newBlockingStub(channel);
        test.ResponseTest helloResponse = stub.sayHello(test.RequestTest.newBuilder()
                .setMess("the respose is:->")
                .build());
        System.out.println(helloResponse.getMes());
    }

}
