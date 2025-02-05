package com.example.springboot.controller;

public class ResponseTest {
    private String text;

    public ResponseTest(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
