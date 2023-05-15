package com.hoho.demo.scala06_exception;

public class TestException {
    public static void main(String[] args) {
        try {
            Exception01.test();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
