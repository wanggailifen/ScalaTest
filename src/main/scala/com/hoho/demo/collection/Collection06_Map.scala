package com.hoho.demo.collection

/**
 * 映射
 */
object Collection06_Map {

  def main(args: Array[String]): Unit = {

    // Map是一个trait，一般情况下，买用伴生对象的apply方法进行构建，默认为不可变ap
    val map: Map[String, String] = Map.apply(("name", "zhangsan"))
    println(map)

    val kv = "a" -> 1
    val map1 = Map(kv, "bajie" -> 20, "wukong" -> "80", "wujing" -> 100)
    println(map1)

    // 不可变Map 集合的数据基本操作还是特殊符号。
    val map2 = map1 + ("zhangsan" -> 999)
    println(map2)

  }

}
