package com.hoho.demo.scala09_other

object HighFunctionTest {
  def main(args: Array[String]): Unit = {
    // 如果匿名函数只有一个参数 可以用_代替里面的元素
    Array(1, 2, 3, 4, 5).map(_ * 2).foreach(println)
    println("-------")
    Array("hello you", "hello me").flatMap(_.split(" ")).foreach(println)
    println("-------")
    Array(1, 2, 3, 4, 5).filter(_ % 2 == 0).foreach(println)
    println("-------")

    println(Array(1, 2, 3, 4, 5).reduceLeft((a, b) => a + b))
    println("-------")

    // 这里是特例。足够简单的时候才能写两个_
    println(Array(1, 2, 3, 4, 5).reduceLeft(_ + _))
  }
}
