package com.hoho.demo.scala01_base.base01_dataType

object DataType01 {
  /**
   * java中的基本数据类型不是面向对象的
   * 所以scala没有基本数据类型。
   * 所有java中的基本数据类型，scala中都有对应的类型
   */
  def main(args: Array[String]): Unit = {
    /*
     * java中的基本数据类型不是面向对象的
     * 所以scala没有基本数据类型。
     * 所有java中的基本数据类型，scala中都有对应的类型
     */
    var b: Byte = 10
    var s: Short = 10
    var age: Int = 10
    var long: Long = 10
    var float: Float = 10
    var double: Double = 10
    var char: Char = 10
    var bool: Boolean = true

    /**
     * Any为顶层数据类型
     * scala 数据类型分为2大类
     * 1. 任意值类型 AnyVal   包含:
     *                      1.对应java基本数据类型的scala类型都是任意值类型
     *                      2.Unit 表示没有返回值,只有一个对象()
     *                      3.StringOps 字符串相关
     * 2. 任意引用类型 AnyRef 包含:
     *                      1. 所有scala的集合
     *                      2. 所有java的类 classes
     *                      3. 所有scala的类 classes
     *
     *  引用类型为空时赋值为null  null本身也有类型 Null，Null只有一个对象null
     *  Null 是所有引用类型的子类型
     *
     *  Nothing 一般用于异常的返回，表示什么都不返回
     *  Nothing是所有类型的子类型
     */
    println(testUnit())

  }

  def testUnit():Unit={

  }
}
