package com.hoho.demo.scala01_base.io

import java.io.PrintWriter

object FileIOTest {
  def main(args: Array[String]): Unit = {
    //    val age = readInt()
    //    println(age)

    //  输入
    //    val bufferedSource = Source.fromFile("/Users/tlc/IdeaProjects/ScalaTest/src/main/resources/a.txt")
    //    val iter: Iterator[String] = bufferedSource.getLines()
    //    while (iter.hasNext) {
    //      println(iter.next())
    //    }
    //    bufferedSource.close()

    //  输出
    val out = new PrintWriter("/Users/tlc/IdeaProjects/ScalaTest/src/main/resources/c.txt")
    out.println("scala")
    out.flush()
  }
}
