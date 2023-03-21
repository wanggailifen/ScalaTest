package com.hoho.demo.function


/**
 * 惰性函数
 */
object FunctionTest12 {
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
