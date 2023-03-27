package com.hoho.demo.function

/**
 * 闭包
 */
object FunctionTest07_closure {
  def main(args: Array[String]): Unit = {
    /*
    TODO 如果一个函数使用了外部的变量，但是改变这个变量的生命周期, 将这个交量包含到当前函数所作用域内，形成闭合的效果(环境)，
      这个环境叫闭包环境
      闭包的场景：
        1. 内部函数使用了外部的数据，改变数据的生命周期
        2. 将函数作为对象使用，改变函数本身的生命周期
        3. 所有匿名函数都有闭包
        4. 内部函数返回到外部使用也会有闭包
      ** scala在2.12版本前，闭包使用的是匿名函数类实现。
      ** scaLa在2.12饭本后，闭包使用的是改变函数的声明来完成的
     */
    def outer(x: Int) = {
      def inner(y: Int) = {
        x + y
      }

      inner _
    }

    /*
      TODO  反编译可以看到x作为入参传递到了inner函数中
        private static final int inner$1(final int y, final int x$1) {
            return x$1 + y;
     }
   */

    val inner = outer(10)
    val result = inner(20)
    println(result)
  }
}
