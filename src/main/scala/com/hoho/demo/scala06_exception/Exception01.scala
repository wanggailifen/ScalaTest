package com.hoho.demo.scala06_exception

object Exception01 {
  def main(args: Array[String]): Unit = {
    // scala中的异常  没有分类，所以没有throws关键字
    try {
      val j = 10 / 0
    } catch {
      case e: ArithmeticException => println("ArithmeticException " + e)
      case e: Exception => println("Exception " + e)
    }
  }


  // 增加这个注解用于java检测这个方法要抛出异常
  @throws[Exception]
  def test() ={
    throw new Exception()
  }


}
