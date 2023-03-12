package com.hoho.demo.c1

object TestString {

  def main(args: Array[String]): Unit = {

    // 插值字符串
    val name = "张三"
    println(s"name=${name.substring(0, 1)}")
    // 大括号可以省略，但是去掉后就不能执行表达式，推荐带上
    println(s"name=$name")

    // 多行字符串 常用于json和sql
    // | 竖线表示顶格符号
    val data =
    """
      |hello
      |scala
      |""".stripMargin
    println(data)

    // 指定顶格符
    val data2 =
      """
        #hello
        #scala
        #""".stripMargin('#')
    println(data2)


  }
}
