package com.hoho.demo

object FunctionTest {

  def sayHello(name: String): Unit = {
    println("hello " + name)
  }

  // 将函数赋值给对象需要再函数名后面加上 空格与_
  val sayHelloFunc = sayHello _


  // 匿名函数
  val sayHelloFunc2 = (name: String) => println("hello " + name)


  def greeting(func: (String) => Unit, name: String) = {
    func(name)
  }


  def main(args: Array[String]): Unit = {
    sayHelloFunc("tom")
    sayHelloFunc2("jack")

    greeting(sayHello, "hoho")

    greeting((name: String) => println("hello " + name), "hoho")

    // 自动推断参数类型
    greeting(name => println("hello " + name), "hoho")


  }
}
