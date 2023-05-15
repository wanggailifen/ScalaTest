package com.hoho.demo.scala03_oop

object OopTest12_object {

  /**
   * object关键字声明的是类，也同时是伴生对象
   * apply方法可以用于构建对象，但是不仅仅用于构建对象
   * apply方法可以放编译器动态识别，所以可以省略
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {
    var user1 = new User()   // 执行类的构造方法
    println("------------")
    var user2 = User  // 直接访问类名，其实是类的伴生对象
    println("------------")
    var user3 = User.apply()   // 主要应用于构建对象
    println("------------")
    val user4 = User()  // apply方法应用场景比较多，所以编译器可以动态识别，所以调用时可以省略
  }

  class User {
    println("user")
  }

  object User {
    def apply(): User = {
      println("user apply")
      new User
    }
  }


}
