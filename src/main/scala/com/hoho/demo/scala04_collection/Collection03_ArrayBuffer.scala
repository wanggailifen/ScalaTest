package com.hoho.demo.scala04_collection

import scala.collection.mutable.ArrayBuffer

object Collection03_ArrayBuffer {

  def main(args: Array[String]): Unit = {

    // 可变与不可变的转换
    var arr = Array(1, 2, 3, 4)
    val buffer = arr.toBuffer
    val array1 = buffer.toArray


    val array = new ArrayBuffer[Int]()
    array.append(1, 2, 3, 4)

    var arr1 = Array(5, 6, 7, 8)
    array.appendAll(arr1)

    println(array.mkString(","))

    array.insert(0, 100)
    println(array.mkString(","))

    array.insert(3, 1000)
    println(array.mkString(","))

    // 原数组更新
    //    array.update(3, 1000)

    // 创建新的数组更新
    var newArray = array.updated(3, 999)
    println(array.mkString(","))
    println(newArray.mkString(","))


    array.remove(0, 2)
    array.remove(0)


  }
}
