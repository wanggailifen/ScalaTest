package com.hoho.demo.scala09_other

object PersonDemo {
  def main(args: Array[String]): Unit = {
     val p1 = new Person("tom")
     val p2 = new Person("jack")

    p1.sayHello(p2.name)
    p1.makeFriends(p2)
  }
}

trait helloTrait {
  def sayHello(name: String): Unit
}

trait MakeFriendTrait {
  def makeFriends(p: Person): Unit
}


class Person(val name: String) extends helloTrait with MakeFriendTrait {
  def sayHello(name: String): Unit = {
    println("Hello," + name)

  }

  def makeFriends(p: Person): Unit = {
    println("my name :" + name + ", your name :" + p.name)

  }
}