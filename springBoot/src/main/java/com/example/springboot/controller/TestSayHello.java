package com.example.springboot.controller;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import test.TestSayHelloGrpc;


@GrpcService
public class TestSayHello extends TestSayHelloGrpc.TestSayHelloImplBase {



    @Override
    public void sayHello(test.RequestTest request, StreamObserver<test.ResponseTest> responseObserver) {
        responseObserver.onNext(test.ResponseTest.newBuilder().setMes(request.getMess()+" is true").build());
        responseObserver.onCompleted();
    }
}