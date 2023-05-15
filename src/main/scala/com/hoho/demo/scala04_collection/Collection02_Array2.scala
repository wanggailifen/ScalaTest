package com.hoho.demo.scala04_collection

object Collection02_Array2 {

  def main(args: Array[String]): Unit = {
    // 多维数组
    val myMatrix = Array.ofDim[Int](3, 2)
    myMatrix.foreach(list => println(list.mkString(",")))

    // 合并数组
    var arr1 = Array(1,2,3)
    var arr2 = Array(4,5,6)
    val arr3 = Array.concat(arr1, arr2)
    println(arr3.mkString(","))

    // 创建指定范围的数组
    val array1 = Array.range(0, 10)
    println(array1.mkString(","))

    val array2 = Array.fill[Int](5)(-1)
    println(array2.mkString(","))





  }
}
