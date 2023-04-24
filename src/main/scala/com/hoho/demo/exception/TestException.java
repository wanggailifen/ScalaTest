package com.hoho.demo.exception;

public class TestException {
    public static void main(String[] args) {
        try {
            Exception01.test();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
