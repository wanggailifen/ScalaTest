package com.hoho.demo.matchtest

object MatchTest06 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, "4", 5)

    list.map {
      case i: Int => i + 1
      case s: String => s.toInt + 1
    }.foreach(println)
  }
}
