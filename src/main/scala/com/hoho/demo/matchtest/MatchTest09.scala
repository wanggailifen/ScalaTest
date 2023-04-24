package com.hoho.demo.matchtest

/**
 * 偏函数
 */
object MatchTest09 {
  def main(args: Array[String]): Unit = {
    /**
     * 功能两数中，存在偏函数和全函数的概念
     * 所谓的全函数，表示功能函数会对数据集中的【所有】的数据进行处理
     * 所谓的偏函数，表示功能函数会对象数据集中满足条件的数据进行处理
     */

    var list = List(1, 2, "3", 4)

    // 偏函数真实就是模式匹配，但是不是所有的功能都支持
    val newList = list.collect { case i: Int => i + 1 }
    println(newList)
  }
}
