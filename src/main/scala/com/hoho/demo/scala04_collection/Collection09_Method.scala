package com.hoho.demo.scala04_collection

/**
 * 集合通用方法
 */
object Collection09_Method {


  def main(args: Array[String]): Unit = {

    // mkString

    val list = List(1, 2, 3, 4, 4, 5, 5, 6)
    println(list.length)
    println(list.size)
    println(list.isEmpty)
    println(list.contains(2))
    println(list.reverse)
    println(list.distinct)
    println(list.mkString(","))


  }


}
