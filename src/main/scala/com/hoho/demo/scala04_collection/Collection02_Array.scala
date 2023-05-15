package com.hoho.demo.scala04_collection

object Collection02_Array {

  def main(args: Array[String]): Unit = {
    /**
     * java中数组不算是集合
     * java中的集合都是有自己的类型ArrayList<String>
     * Scala是一个完全面向对象的语言，所以万物皆对象
     * 数组也是对象，也有自己的类型：Array
     */

    // Array 没有添加和删除的能力，只能通过索引的方式修改数据
    // Array 访问时的素引操作采用小括号，而不是中括号
    var arr = new Array[String](3)
    arr(0) = "张三"
    println(arr(0))
    arr(1) = "李四"
    arr(2) = "王五"
    println(arr)
    println("========")
    println(arr.mkString(","))

    println("========")
    // 遍历
    for (str <- arr) {
      println(str)
    }

    println("========")

    arr.foreach(println(_))

    // 初始化数组的同时赋值
    var array1: Array[Int] = Array.apply(1, 2, 3, 4)
    // apply方法可以放scala编译器自动识别的。可以省略
    var array2: Array[Int] = Array(1, 2, 3, 4)


    // arr是不可变数组
    var array3 = array1.+:(5) // 在开头添加
    var array4 = array1.:+(6) //在结尾添加
    println(array1.mkString(","))
    println(array3.mkString(","))
    println(array4.mkString(","))

    //    一般情况下，调用集合对象的特殊符号的方法时，都会采用运算符的方式
    // TODO *** 如果运算符采用冒号结尾，那么运算规则为从右向左计算 ***

    var array5 = 7 +: array2
    var array6 = array2 :+ 8

    println(array5.mkString(","))
    println(array6.mkString(","))

    println("======")
    // ++ 添加集合
    val array7 = array1 ++: array2
    println(array7.mkString(","))


  }


}
