package com.hoho.demo.scala02_function

object FunctionTest04_functionObject {
  def main(args: Array[String]): Unit = {
    /**
     * 函数也是对象，对象也是函数
     * scala：声明了一个函数，等同于声明了一个函数对象
     *
     * 如果不想让函数执行，只是想访问这个函数本身，可以采用特殊符号_进行转换
     */
    def test(): Unit = {
      println("test ...")
    }

    println(test)
    println(test _)

    /*
     TODO 函数是对象 那么
     1. 对象应该有类型
     2. 对象可以赋值给其他变量使用
     */

    /*
    将test赋值给 f 使用 f 可以通过编译器自动推断类型
    Function0[Unit]  0表示参数个数 [Unit]表示没有返回值
    scala 【函数】的参数个数没有限制，但是【函数对象】的参数最多有22个参数
     */
    var f: Function0[Unit] = test _

    def test01(age: Int): String = {
      age.toString
    }

    // Function1[Int, String]  1表示参数个数 [Int, String]表示 参数类型为Int，返回值类型为String
    var f1: Function1[Int, String] = test01 _

    // f1  可以简写  (Int) => String

    println("====函数对象的使用====")
    // TODO 函数对象的使用
    var ff = test _
    // ff只是函数对象，不加()不能执行; 加() 表示执行这个函数
    ff()

    println("====将函数作为参数使用====")

    def fun(): Unit = {
      println("test ...")
    }

    def test03(f: () => Unit): Unit = {
        f()
    }

    // 如果明确函数对象不会被执行 则_可以省略
    val fff = fun _
    test03(fff)

  }
}
