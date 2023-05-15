package com.hoho.demo.scala09_other.regex

object RegexTest01 {
  def main(args: Array[String]): Unit = {

    val regex = "\\d".r

    val str = "zhangsan123"

    val option: Option[String] = regex.findFirstIn(str)
    if (!option.isEmpty) {
      println(regex.findFirstIn(str).get)
    }

    println(regex.findAllIn(str).size)


  }
}
