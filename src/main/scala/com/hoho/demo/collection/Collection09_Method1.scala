package com.hoho.demo.collection

/**
 * 集合通用方法
 */
object Collection09_Method1 {


  def main(args: Array[String]): Unit = {


    val list = List(1, 2, 3, 4)

    println(list.head)
    // 除了头，就是尾部
    println(list.tail) // List(2, 3, 4)
    println(list.tails.foreach(println(_)))

    // 最后一个
    println(list.last)
    // 除了最后一个
    println(list.init)
  }


}
