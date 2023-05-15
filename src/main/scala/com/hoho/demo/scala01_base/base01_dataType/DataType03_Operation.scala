package com.hoho.demo.scala01_base.base01_dataType

object DataType03_Operation {
  def main(args: Array[String]): Unit = {

    // 当调用对象的方法时，点.可以省略如果函数参数只有一个，或者没有参数，0可以省略
    // 标准的加法运算

    val i: Int = 1.+(1)
    // （1）当调用对象的方法时，.可以省略
    val j: Int = 1 + (1)
    // （2）如果函数参数只有一个，或者没有参数，()可以省略
    val k: Int = 1 + 1

    println(1.toString())
    println(1 toString())
    println(1 toString)


    var a = new String("123");
    var b = new String("123")
    // scala 中的 == 表示 非空的equals操作 并不比较地址值
    println(a == b)
    // 如果想要比较内存地址 需要使用eq
    println(a.eq(b))

    var c: String = null
    var d: String = new String("123")

    println(c == d)
    println(d.equals(c))

    // 这里会有空指针
    //    println(c.equals(d))

    /**
     * scala 没有 ++ --
     */
    //    val i = 10;
    //    println(i ++)


  }
}
