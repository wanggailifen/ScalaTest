package com.hoho.demo.oop

// 伴生类
class OopTest_Class{

}

// 伴生对象
object OopTest_Class {
  def main(args: Array[String]): Unit = {
    /**
     * 1. scala源码中所有声明的类都可以是公共的
     * 2. 使用object关键字也可以声明类，
     *      但是同时也会生成另外一个对象的类，目的是为了模拟静态语法 对象名称(类名).方法
     *
     *      一般情况下，将java中的成员方法和属性声明在object声明类中;
     *                将java中的静态方法和属性声明在object声明在另外一个类中。
     *
*           将object声明的类称之为伴生类，将object声明的对象称之为伴生对象
     *         伴生类和伴生对象可以同时出现在一个源码文件中
     */

  }
}

// 反编译后可以看到都是public的
//class XXX {}
//
//class YYY {}