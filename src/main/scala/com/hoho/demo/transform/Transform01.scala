package com.hoho.demo.transform

object Transform01 {

  /**
   * 隐式转换其实就是类型转换
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {
    /**
     * 两个数据类型之间如果想要转换，那么必须类型之间有关系：父子类，接口，实现类的关系
     * Byte 和Int类型之间没有关系，所以不应该能转换。
     * scala的底层实现了隐式转换，可以自动将不同的类型进行转换
     */
    val b: Byte = 10
    val i: Int = b

    println(i)

    // scala中没有字符串，使用的时候就是java的字符串java中的字符串是一个类，没有小括号访问的方式
    // java中的字符串没有apply方法
    //  String => StringOps
    val s = "hello"
    val ss = s.apply(0).toUpper + s.substring(1)
//    val ss = s(0).toUpper + s.substring(1)
    println(ss)

  }
}
