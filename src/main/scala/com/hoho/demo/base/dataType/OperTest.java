package com.hoho.demo.base.dataType;

public class OperTest {
    public static void main(String[] args) {
        String  a = new String("123");
        String b = new String("123");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
