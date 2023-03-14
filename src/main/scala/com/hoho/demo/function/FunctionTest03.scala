package com.hoho.demo.function

object FunctionTest03 {
  def main(args: Array[String]): Unit = {
    // TODO 1. 如果函数体中的逻辑代码需要返回，可以省略return关健字
    def test01(): String = {
      "hello"
    }

    println(test01())

    // TODO 2. 如果函数体逻辑代码只有一行，可以省略大括号
    def test02(): String = "hello"

    println(test02())

    // TODO 3. 如果能够通过返回值推断出返回值类型，那么返回值类型可以省略
    def test03() = "hello"

    println(test03())

    /*
    TODO 4.如果两数的参数列表中没有声明参数，小括号可以省略
      如果省略参数列表的小括号，那么调用时也不能添加
      因为省略了很多的语法内容，所以变量声明和函数声明很像，所以必须买用关键字区分
     */
    def test04 = "hello"
    println(test04)
  }

}
