package com.hoho.demo.scala09_other

import scala.io.Source._

object FileTest {
  def main(args: Array[String]): Unit = {
    val lines01 = fromFile("/Users/lifen/Documents/ideaProject/ScalaTest/src/main/resources/a.txt").mkString
    val lines02 = fromFile("/Users/lifen/Documents/ideaProject/ScalaTest/src/main/resources/a.txt").mkString

    //    println(lines01)
    //    println(lines02)

    var lines = List(lines01, lines02)
    var sum = lines.flatMap(_.split(" ")).map((_, 1)).map(_._2).reduceLeft(_ + _)


  }
}
