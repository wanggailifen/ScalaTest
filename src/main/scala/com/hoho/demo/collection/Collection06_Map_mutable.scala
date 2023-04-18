package com.hoho.demo.collection

import scala.collection.mutable

/**
 * 映射
 */
object Collection06_Map_mutable {

  def main(args: Array[String]): Unit = {
    var map = mutable.Map("bajie" -> 20, "wukong" -> 80, "wujing" -> 100)
    map.put("haha", 19)
    println(map)


    map.keysIterator.foreach(println(_))
    map.valuesIterator.foreach(println(_))
    map.foreach(println(_))

    /**
     * 获取的结果类型为 0ption 类型，表示选顶类型，这个类型只有2个对象可以选择：
     * Some： 有值 如果数据有值，那么可以获取真实结果
     * None : 无 无需获取结果，如果获取，会发生错误
     * 这里之所以买用新的类型获取结果，主要原因是为了避免空指针异常
     */
    println(map.get("haha"))
    val hehe: Option[Int] = map.get("hehe")

    if (hehe.isEmpty) {
      println("没有结果")
    } else {
      println(hehe.get)
    }
    println(map.getOrElse("hehe", 0))

  }

}
