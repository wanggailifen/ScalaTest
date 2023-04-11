package com.hoho.demo.function

/**
 * 控制抽象 自定义while循环
 */
object FunctionTest08_Abstract2 {
  def main(args: Array[String]): Unit = {

    def myWhile(cond: => Boolean)(op: => Unit): Unit = {
      if (cond) {
        op
        myWhile(cond)(op)
      }
    }

    var age = 1
    myWhile(age < 10) {
      println(s"age = $age")
      age += 1
    }

  }
}
