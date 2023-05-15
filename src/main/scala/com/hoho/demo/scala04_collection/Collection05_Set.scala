package com.hoho.demo.scala04_collection

/**
 * 序列
 */
object Collection05_Set {

  def main(args: Array[String]): Unit = {

    val set1 = Set.apply(1, 2, 3, 4, 5, 6, 7, 8)
    println(set1)

    val set2 = Set.apply(1, 1, 1, 1, 1, 1, 1)
    println(set2)


    //不可变集合的基本数据操作都是采用特殊符号。

    val set3 = set1 + 9
    println(set3)
  }

}
