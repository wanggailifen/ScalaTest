package com.hoho.demo.scala03_oop

object OopTest09_Instance_Method {

  def main(args: Array[String]): Unit = {
    // 1. java中类的构造方法默认由JVM提供的：无参，公共的
    //    val user = new User()
    // 2. scala中类的构造方法默认由JVM提供，无参，公共的，小括号可以省略的
    //    val User1 = new User

    //    3. 如果开发人员给类提供了构造方法（任意），JVM不会提供默认的的构造方法
    //    4. new 构建对象时，应该教行构造方法
    //    5. java中构造方法和类的名称是一致的，但是scala中构造方法和类的名称没有关系

    /**
     * scala是完全面向函数式编程语言，所以万物皆函数，声明类就等同于声明函数
     * 声明类的同时所声明的函数其实就是构造函数，当new的时候，函数就会执行
     * scala的函数主要功能就是类的实例化（类主体内容的执行)
     */
    val user2 = new User("Zhangsan")


    /**
     * java中的构造方法可以重载的
     * scala中的构造方法如何重载的？
     * scala中的构造方法分为2大类：
     * 1. 主构造方法  完成类的初始化
     * 2. 辅助构造方法 在类的初始化后，完成类的辅助功能，属性赋值  采用this关键字
     * 辅助构造方法必须直接或间接地调用主构造方法
     * 辅助构造方法有重载的概念，但是主构造方法没有
     */

    val teacher = new Teacher("李四")
  }


  class User(name: String) {
    println("user instance  haha....")

    // 这个不是构造方法,只是普通方法
    def user(): Unit = {
      println("user instance....")
    }

  }


  class Teacher {

    println("11111")
    def this(name: String) = {
      this
      println("22222")
    }
  }

}
