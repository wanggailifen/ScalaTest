package com.hoho.demo.scala07_Implicit


object Transform02 {

  /**
   * 隐式转换其实就是类型转换
   *
   * 程序碰见了问题，如果是类型转换上的问题，可以通过编程手段转换类型解决。
   * 但是解决的过程不能违背OCP开发原则
   * 编译器在编译的时候，如果出现了错误，则会自动查找相应转换操作。
   * 如果查找到，会自动进行转换，进行二次编译
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {

    /**
     * 当程序编出现错误的时候，可以让编译器帮助我们实现功能的转换
     * 为了让编译器可以查找到指定的转换的规则，需要在函数前增加关維字implicit
     * 如果在作用域中存在相同的转换规则，那么转换不起作用。
     *
     * @param d
     * @return
     */
    implicit def transform(d: Double): Int = {
      d.toInt
    }

    //    val age: Int = transform(thridpartGetAge())
    val age: Int = thridpartGetAge()

    println(s"年龄为${age}")

  }


  def thridpartGetAge(): Double = {
    8
  }


}
