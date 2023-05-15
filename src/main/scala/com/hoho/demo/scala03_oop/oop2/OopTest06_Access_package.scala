package com.hoho.demo.scala03_oop.oop2

import com.hoho.demo.scala03_oop.OopTest06_Acceess.User

object OopTest06_Access_package {
  def main(args: Array[String]): Unit = {
    val user = new User()

    // 不同包 的权限
    def test(): Unit = {
      val user = new User()
      //      println(user.name)
      //      println(user.age)
      //      println(user.email)
      println(user.address)
    }
  }
}
