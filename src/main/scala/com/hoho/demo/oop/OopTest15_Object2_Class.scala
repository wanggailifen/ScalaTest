package com.hoho.demo.oop

object OopTest15_Object2_Class {
  def main(args: Array[String]): Unit = {

    val userClass: Class[User] = classOf[User]
    println(userClass.getInterfaces.mkString("Array(", ", ", ")"))
    println(userClass.getDeclaredFields.mkString("Array(", ", ", ")"))
  }


  class User extends Person {
    val age: Int = 1
    val name: String = "zhangsan"

    def test(): Unit = {

    }
  }

  trait Person{

  }
}




