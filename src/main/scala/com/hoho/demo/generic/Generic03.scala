package com.hoho.demo.generic

object Generic03 {

  def main(args: Array[String]): Unit = {

    val list: List[User] = List(new User(), new User(), new User(), new User())

    val parent = list.reduce[Parent]((p1, _) => p1)
    println(parent)


  }


  class Parent {

  }

  class User extends Parent {

  }

  class Child extends User {

  }
}
