package com.hoho.demo.collection

/**
 * 集合通用方法
 */
object Collection11_paraller {


  def main(args: Array[String]): Unit = {

    // par 将普通集合转为并行集合
    var result1 = (0 to 5).map { x => Thread.currentThread().getName }
    var result2 = (0 to 5).par.map { x => Thread.currentThread().getName }
    var result3 = (0 to 5).toParArray.map { x => Thread.currentThread().getName }

    println(result1)
    println(result2)
    println(result3)

  }


}
