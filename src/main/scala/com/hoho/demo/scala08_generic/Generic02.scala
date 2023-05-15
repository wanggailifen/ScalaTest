package com.hoho.demo.scala08_generic

object Generic02 {


  def main(args: Array[String]): Unit = {
    // scala中的泛型也存在上限和下限的概念，但是不是采用关健字，而是采用颜文字


  }


  // 下限
  class Producer[T] {
    def produce(message: Message[_ >: T]): Unit = {
    }
  }


  // 上限
  class Consumer[T] {
    def consume(): Message[_ <: T] = {
      null
    }
  }

  class Message[T] {
    var content: T = _
  }

  class Parent {

  }

  class User extends Parent {

  }

  class Child extends User {

  }
}
