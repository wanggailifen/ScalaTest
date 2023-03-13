package com.hoho.demo.base.circle

object ForTest {
  def main(args: Array[String]): Unit = {
    var arr = 1 to 5
    var arr2 = 1 until 5
    var arr3 = Range(1, 5)

    //    for (i: Int <- arr) {
    //      println(i)
    //    }
    //
    //    for (i: Int <- arr2) {
    //      println(i)
    //    }
    //
    //    for (i: Int <- arr3) {
    //      println(i)
    //    }

    // TODO 循环守卫
    for (i <- arr3 if i < 3) {
      println(i)
    }
    println("-----")

    // TODO 循环步长 默认幅度为1
    for (i <- 1 to 5 by 2) {
      println(i)
    }
    println("-----")

    for (i <- Range(1, 5, 2)) {
      println(i)
    }
    println("-----")

    // TODO 循环嵌套
    for (i <- 1 to 3) {
      for (j <- 1 to 3) {
        println(s"i = ${i}, j = ${j}")
      }
    }
    println("-----")
    // 换种写法
    for (i <- 1 to 3; j <- 1 to 3) {
      println(s"i = ${i}, j = ${j}")
    }

    println("-----")
    for (i <- 1 to 3; j = i - 1) {
      println(s"j = ${j}")
    }

    // TODO 循环的返回值
    var result = for (i <- 1 to 3) {
      i
    }
    println(result)

    // yield关键字
    var result2 = for (i <- 1 to 3) yield {
      i * 2
    }
    println("result2 = " + result2)
  }
}
