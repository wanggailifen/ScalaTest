package com.hoho.demo.transform

/**
 * 隐式参数与隐式变量
 */
object Transform03 {

  def main(args: Array[String]): Unit = {

    /**
     * 在参数前增加implicit，表示隐式参数，正常调用的情况下，不会起作用
     * 如果想要让隐式参数起作用，那么就意味着不能正常传递，需要设定隐式变量
     * @param password
     */
    def register(implicit password: String = "000000"): Unit = {
      println(s"密码为 ${password}")
    }

    register("111111")
    register()

    implicit val password = "222222"

    // 直接写方法名 不带参数，就是传递隐式变量
    register

  }

}
