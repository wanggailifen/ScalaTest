package com.hoho.demo.function

object FunctionTest06 {
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
