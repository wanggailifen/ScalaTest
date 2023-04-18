package com.hoho.demo.collection

/**
 * 集合通用方法
 */
object Collection09_Method2 {


  def main(args: Array[String]): Unit = {


    val list1 = List(1, 2, 3, 4)
    val list2 = List(3, 4, 5, 6)

    // 交集
    println(list1.intersect(list2))

    // 并集
    println(list1.union(list2))

    //差集
    println(list1.diff(list2))


    // 拉链 将数据集中相同位置的数据拉在一起
    println(list1.zip(list2))
    println(list1.zip(list2).toMap)


    println(list1.map(_ * 2))

  }


}
