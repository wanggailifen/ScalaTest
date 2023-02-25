package com.hoho.demo

import java.io.{FileNotFoundException, IOException}

object MatchCaseTest {




  def demo(day: Int): Unit = {
    day match {
      case 1 => println("Monday")
      case 2 => println("Tuesday")
      case 3 => println("Wednesday")
      case _ => println("none")
    }
  }

  def processException(e: Exception): Unit = {
    e match {
      case e1: FileNotFoundException => println("FileNotFoundException")
      case e2: IOException => println("IOException")
      case e3: NullPointerException => println("NullPointerException")
      case _ => println("Exception")
    }
  }


  def main(args: Array[String]): Unit = {
    demo(2)
    processException(new NullPointerException())

    try {
      //     val lines01 = fromFile("/Users/lifen/Documents/ideaProject/ScalaTest/src/main/resources/a123.txt").mkString
      1 / 0
    } catch {
      case e1: FileNotFoundException => println("FileNotFoundException   " + e1)
      case e2: IOException => println("IOException   " + e2)
      case e3: NullPointerException => println("NullPointerException   " + e3)
      case e4: ArithmeticException => println("ArithmeticException   " + e4)
      case _: Exception => println("Exception   " + _)
    }


  }
}
