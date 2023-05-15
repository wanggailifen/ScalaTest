package com.hoho.demo.scala04_collection

/**
 * 集合的转换
 */
object Collection08 {


  def main(args: Array[String]): Unit = {

    // list
    val list = List(1, 2, 3, 4, 1)
    val array = list.toArray
    val set = list.toSet

    println(array)
    println(set)

    // 如果list能形成键值对，name也能toMap
    val list3 = List(
      ("a", 1),
      ("b", 2),
      ("c", 3)
    )
    println(list3.toMap)

    // set
    val set1 = Set(1, 2, 3, 4)
    val array1 = set1.toArray
    val list1 = set1.toList

    println(array1)
    println(list1)

    // map
    val map = Map(
      ("a", 1),
      ("b", 2),
      ("c", 3)
    )
    val list2: Any = map.toList
    val array2: Array[(String, Int)] = map.toArray
    println(list2)
    println(array2.mkString("Array(", ", ", ")"))

  }


}
