package com.hoho.demo.function

object FunctionTest01 {
  /**
   * 声明在类中的函数称之为方法，方法需要收到类的约束
   * 函数只在当前作用域有效
   *
   * 函数就是功能的封装, 名称不能重复，也没有重写重载的概念
   * 方法属于类，可以重写，重载
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {

    /**
     * TODO  函数声明与使用
     * 函数可以在任意位置
     * 函数在scala编译后实质上还是java的方法 增加了修饰符 public static final
     */
    def test(): Unit = {
      println("test funtion")
    }

    // TODO 如果函数名称和方法相同，会默认调用函数
    test()  // 默认指向函数。如果只有方法，则会表示this.test()指向方法   只不过是 this隐藏了
//    this.test() // 指向方法
  }

  /**
   * TODO 方法只能在类中
   */
  def test(): Unit = {
    println("test method")
  }

}
