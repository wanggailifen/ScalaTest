package com.hoho.demo.scala02_function


/**
 * 惰性函数
 */
object FunctionTest12_lazy {
  def main(args: Array[String]): Unit = {

    def test(): String = {
      println("test...")
      "zhangsan"
    }

    lazy val a = test()
    println("-------")
    println(a)
  }
}
