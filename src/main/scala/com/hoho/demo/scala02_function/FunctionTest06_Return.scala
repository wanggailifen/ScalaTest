package com.hoho.demo.scala02_function

object FunctionTest06_Return {
  def main(args: Array[String]): Unit = {
    // TODO 将函数作为返回值来使用

    def outer() = {
      def inner(): Unit = {
        println("inner...")
      }

      inner _
    }

    outer()()

  }
}
