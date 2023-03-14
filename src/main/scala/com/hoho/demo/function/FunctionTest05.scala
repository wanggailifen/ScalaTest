package com.hoho.demo.function

object FunctionTest05 {
  def main(args: Array[String]): Unit = {
    def test(a: Int, b: Int, f: (Int, Int) => Int): Unit = {
      val result = f(a, b)
      println(result)
    }

    def sum(x: Int, y: Int): Int = {
      x + y
    }

    def diff(x: Int, y: Int): Int = {
      x - y
    }

    test(10, 20, sum)
    test(10, 20, diff)
    // 匿名函数 函数名称不重要。 作为参数使用时尽量使用至简原则
    test(10, 20, (a, b) => a * b)

    // TODO 匿名函数中如果【参数】 【按照顺序】【只执行一次】的场合，那么可以使用下划线代替参数，并省略掉参数列表
    test(10, 20, (a, b) => a * b)
    test(10, 20, _ * _)
    test(10, 20, _ - _)

    def test01(f: String => Unit): Unit = {
      f("zhangsan")
    }

    test01(name => {
      println(name)
    })
    test01(name => println(name))
    // 参数用_代替，并省略参数列表
    test01(println(_))
    test01(println)
  }
}
