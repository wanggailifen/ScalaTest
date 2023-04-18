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
    list.tails.foreach(println(_))

    // 最后一个
    println(list.last)
    // 除了最后一个
    println(list.init)
    list.inits.foreach(println(_))

    // 从左边取三个
    println(list.take(3))
    // 从右边取三个
    println(list.takeRight(3))

    println(list.drop(1))
    println(list.dropRight(1))

    // 切分
    println(list.splitAt(2))

    // 滑动
    list.sliding(2).foreach(println(_))
    println("-----")
    list.sliding(2,2).foreach(println(_))



  }


}
