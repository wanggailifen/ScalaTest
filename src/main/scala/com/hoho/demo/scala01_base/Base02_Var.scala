package com.hoho.demo.scala01_base

object Base02_Var {
  def main(args: Array[String]): Unit = {

    // 可变变量
    var name: String = "张三"
    println(name)

    // 不可变变量   仅仅是编译时的约束
    val email = "zhangsan"
    // email = "zhangsan@qq.com"

  }
}
