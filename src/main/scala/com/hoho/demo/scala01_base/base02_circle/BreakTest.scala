package com.hoho.demo.scala01_base.base02_circle

import scala.util.control.Breaks
import scala.util.control.Breaks._

object BreakTest {
  /**
   * scala 没有break continue关键字，需要使用其他方式实现
   * continue 使用 if else 代替
   * break 使用面向对象来代替
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {

    Breaks.breakable {
      for (i <- 1 to 5) {
        if (i != 3) {
          // if 代替continue
          println(s"i = ${i}")
        } else {
          //  Breaks.break()会 抛出异常
          Breaks.break()
        }
      }
    }
    println("执行完毕")

    // 通过静态导入来简化
    breakable {
      for (i <- 1 to 5) {
        if (i != 3) {
          // if 代替continue
          println(s"i = ${i}")
        } else {
          //  Breaks.break()会 抛出异常
          break
        }
      }
    }
    println("执行完毕")

  }
}
