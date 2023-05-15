package com.hoho.demo.scala08_generic

object Generic04 {

  def main(args: Array[String]): Unit = {

    // 泛型的上下文限定 = 隐式转换 + 泛型
    def function[A: Test](a: A) = {
      println(a)
    }

    implicit val test: Test[Parent] = new Test[Parent]

    function(new Parent())
  }


  class Test[T] {

  }

  class Parent {

  }

  class User extends Parent {

  }

  class Child extends User {

  }
}
