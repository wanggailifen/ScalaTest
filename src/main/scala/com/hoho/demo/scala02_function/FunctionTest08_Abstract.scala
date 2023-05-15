package com.hoho.demo.scala02_function

import scala.util.control.Breaks

/**
 * TODO 控制抽象
 */
object FunctionTest08_Abstract {
  def main(args: Array[String]): Unit = {


    // 完整的写法
    def test(f: () => Unit): Unit = {
      f()
    }

    // TODO 函数类型只有返回，【没有输入】的场合，称之为抽象，因为不完整。调用的时族，不能使用小括号。
    //  在传值的时候，就需要进行控制
    def test01(f: => Unit): Unit = {
      f
    }

    // TODO  完整的参数传递，是将函数对象作为参数进行传递
    test(() => {
      println("test...")
    })


    test {
      () => {
        println("test...")
      }
    }

    // TODO 所谓的控制抽象，其实就是将代码作为参数进行传递（一般是设计语法的时候使用）
    test01(println("test..."))

    // TODO *** 如果参数跨越多行，那么可以将小括号改成大括号 ***
    test01(
      println("test...")
    )

    test01 {
      println("test...")
    }

    // 循环中断的代码就是使用了控制抽象
    Breaks.breakable {
      for (i <- 1 to 5) {
        if (i == 3) {
          Breaks.break()
        }
        println(i)
      }
    }

  }
}
