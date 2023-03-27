package com.hoho.demo.function

/**
 * TODO 函数柯里化
 *  所谓的函数柯里化，就是为了将西数简单化，将无关的参数分离 可以设置多个参数列表
 */
object FunctionTest10 {

  def main(args: Array[String]): Unit = {
    def test(a: Int, b: Int): Unit = {
      for (i <- 1 to a) {
        println(a)
      }

      for (i <- 1 to b) {
        println(b)
      }
    }

    test(10, 20)

    def test1(a: Int)( b: Int): Unit = {
      for (i <- 1 to a) {
        println(a)
      }

      for (i <- 1 to b) {
        println(b)
      }
    }
    test1(10)(20)

    // 类似于
    def outer() = {
      def inner():Unit ={
        println("inner...")
      }
      inner _
    }
    outer()()

  }

}
