package com.hoho.demo.transform

object Transform05 {

  /**
   * 隐式转换其实就是类型转换
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)

    /**
     * sortBy 有2 个参数列表
     * def sortBy[B](f: A => B)(implicit ord: Ordering[B]): Repr = sorted(ord on f)
     * 第二个参数列表表示的隐式参数，
     * 调用时无需增加小括号，会自动查找拍寻规则如果不想使用隐式参数，那么需要增加括号
     *
     * 如果程序发生错误，提示(...)，表示隐式变量没有找到
     */
//    println(list.sortBy())
    println(list.sortBy(num => num))
    println(list.sortBy(num => num)(Ordering.Int.reverse))
  }
}
