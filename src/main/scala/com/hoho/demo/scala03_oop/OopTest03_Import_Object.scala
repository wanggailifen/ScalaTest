package com.hoho.demo.scala03_oop

object OopTest03_Import_Object {


  def main(args: Array[String]): Unit = {
    /**
     * // 引入对象
     * println方法我们从来就没有声明过， 但是可以直接调用
     * scala中默认导入了Predef 对象 类似静态导入
     * 但是scala中使用object声明的对象其实模拟静态语法。但是本质上是一个对象
     */
    Predef.println("XXXXX")
    println("XXXX")

    val user = new User
    // 导入对象  必须使用val声明
    import user._
    // 直接使用对象里面的方法
    test()
    test()
    test()
  }

class User{
  def test():Unit = {
    println("hello....")
  }
}
}
