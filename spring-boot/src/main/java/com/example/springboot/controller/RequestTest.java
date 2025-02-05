package com.example.springboot.controller;

public class RequestTest {
    private String text;

    public RequestTest(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
