package com.hoho.demo.base.dataType

object OperationTest {
  def main(args: Array[String]): Unit = {

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
    val i = 10;
//    println(i ++)


  }
}
