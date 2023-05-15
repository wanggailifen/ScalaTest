package com.hoho.demo.scala03_oop;

public class TestThread {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.start();
        t2.start();
        // TODO sleep & wait方法的区别？
        // 核心区别就在于字体不一样  IDEA 方法用什么字体是怎么确定的？
        
        /*
         *   sleep 方法是静态的，属于类，和对象无关
         *   休眠的线程不是t1，而是调用这个方法的线程，这里是主线程
         */
        t1.sleep(1000);

        /**
         *  wait方法是成员的，属干对象
         *  等特的线程是t2
         */
        t2.wait();


    }
}
