package com.hoho.demo.matchtest

object MatchTest03 {
  def main(args: Array[String]): Unit = {

    // 把Array 换成 List也一样
    for (arr <- Array(
      Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(1, 1, 0, 1),
      Array("Hello", 90)
    )) {
      val result = arr match {
        case Array(0) => "0"
        case Array(x, y) => x + "," + y
        // _表示任意值 * 表示任意个数
        case Array(0, _*) => "以0开头的数组"
        case _ => "Something else"
      }
      println(s"result = ${result}")
    }



  }
}
