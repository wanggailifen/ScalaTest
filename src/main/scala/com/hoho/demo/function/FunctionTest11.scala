package com.hoho.demo.function

object FunctionTest11 {
  def main(args: Array[String]): Unit = {

    // 递归
    def test1(): Unit = {
      test1()
      println("test...")
    }

    // 尾递归  在递归逻辑的最后一行执行的递归操作 scala会采用while循环来实现递归 可以反编译看
    def test2(): Unit = {
      println("test...")
      test2()
    }
  }
}
