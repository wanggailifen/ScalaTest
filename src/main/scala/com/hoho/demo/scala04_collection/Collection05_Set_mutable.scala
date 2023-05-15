package com.hoho.demo.scala04_collection

import scala.collection.mutable

/**
 * 序列
 */
object Collection05_Set_mutable {

  def main(args: Array[String]): Unit = {
    val set = mutable.Set(1, 1, 1, 2, 3, 3, 4, 4)
    set.add(5)
    // 删除数据本身
    set.remove(1)

    println(set)
    // 修改数据：set集合没有位置的概念，所以无法对指定的位置进行修改
    // 所以这里的修改，仅仅是数据的状态修改
    set.update(5, included = false)
    println(set)
    set.update(6, included = true)
    println(set)

    // 换一种写法
    set(5) = true
    println(set)
  }

}
