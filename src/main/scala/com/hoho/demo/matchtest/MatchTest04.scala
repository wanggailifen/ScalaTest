package com.hoho.demo.matchtest

object MatchTest04 {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 5, 6, 7)

    list match {
      case first :: second :: rest => println(first + "-" + second + "-" + rest)
      case _ => "Something else"
    }


  }
}
