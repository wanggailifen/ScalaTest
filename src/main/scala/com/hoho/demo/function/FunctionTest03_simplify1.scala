package com.hoho.demo.function

object FunctionTest03_simplify1 {
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


    /*
      TODO 5. 如果逻辑代码中有return返回，但是函数声明为unit，此时return 不起作用
        如果要省略Unit,那么要连着 = 一起省略  此时一定没有返回结果
     */
    def test05(): Unit = {
      return "hello"
    }

    println(test05())

    def test06() {
      return "hello"
    }

    println(test06())

    /*
    TODO 6.如果函数名称不重要的时候，def 和 函数名也可以省略，称之为【匿名函数】
    1. def 和函数名要省略
    2. 返回值类型也需要省略，由逻辑代码自动推断
    3. 等号需要增加大于号 表示关联
     */
    () => {
      println("hello")
    }


  }

}
