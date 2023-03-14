package com.hoho.demo.base.dataType

/**
 * 类型转换
 */
object DataTypeConvert {
  def main(args: Array[String]): Unit = {
    val s: String = null
    val b: Byte = 10

    // 隐式转换 将Byte变成了Int
    val i: Int = b
    println(i)

    val k: Int = b.toInt
    println(k)

    // 可以运行   常量是可以在编译时计算的，不涉及运行时的类型转换
    val c: Char = 'A' + 1
    println(c)

    // 不能运行，因为变量只能在运行时计算
//    val a :Char = 'A'
//    val c: Char = a + 1
//    println(c)

  }
}
