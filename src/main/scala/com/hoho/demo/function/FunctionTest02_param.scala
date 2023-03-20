package com.hoho.demo.function

object FunctionTest02_param {
  def main(args: Array[String]): Unit = {

    /**
     * TODO 可变参数,只能是参数列表最后一项
     * 一个参数列表最多只能有一个可变参数
     *
     */
    def test01(name: String*): Unit = {
      println(name)
    }

    test01()
    test01("1")
    test01("1", "2", "3")

    /**
     * TODO 参数默认值
     *
     */
    def test02(name: String, password: String): Unit = {
      // scala中 函数的参数默认使用val定义，无法修改
      /*  if (name == null) {
            name = "zhangsan"
          }
      */
      println(name + "===" + password)
    }

    def test04(name: String = "zhangsan", password: String ="000000"): Unit = {
      // scala中 函数的参数默认使用val定义，无法修改
      /*  if (name == null) {
            name = "zhangsan"
          }
      */
      println(name + "===" + password)
    }

    test04()
    // TODO 改变参数传值顺序 带名传参
    test04(password = "123456")
  }

}
