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

    println("=========")

    // flatten 按照默认规则拆开
    val list3 = List(
      List(1, 2),
      List(3, 4)
    )

    println(list3.flatten.size)
    list3.flatten.foreach(println(_))

    val list4 = List(
      "hello you",
      "hello haha"
    )
    println(list4.flatten)


    println(list4.flatMap(_.split(" ")))


    println(list1.groupBy(_ % 2 == 0))


    val dataMap = Map(
      ("a", 1),
      ("b", 2),
      ("c", 3)
    )

    println(dataMap.map(kv => (kv._1, kv._2 * 2)))

    dataMap.mapValues(num => num * 2).foreach(println(_))

  }


}
