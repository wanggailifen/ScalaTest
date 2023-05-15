package com.hoho.demo.scala03_oop

object OopTest07_Method {


  def main(args: Array[String]): Unit = {

    // 调用的是class里面的test
    new User().test()
    // 调用的是object里面的test
    User.test()


    val user: Object = new User()
    val user1: Object = new User()
    val user2: Object = new User()

    // scala中能用的方法
    println(user1.eq(user2)) // 这个是函数
    println(user1.equals(user2))  // 这个是方法
    //    user.!=(2)
    //    user.ne(1)

    println(user.isInstanceOf[User])

    // 强制类型转换
    println(user.asInstanceOf[User])

  }


  class User {
    def test(): Unit = {
      println("class test...")
    }
  }

  object User {
    def test(): Unit = {
      println("object test...")
    }
  }
}
