package com.hoho.demo.scala09_other

import scala.language.implicitConversions

/**
 * 隐式转换
 */
object ConvertTest {
  class Cat(val name: String) {
    def catchMouse(): Unit = {
      println(name + "抓老鼠")
    }
  }

  class Dog(val name: String)

  implicit def objectToCat(obj: Object): Cat = {
    if (obj.getClass == classOf[Dog]) {
      val dog = obj.asInstanceOf[Dog]
      new Cat(dog.name)
    } else null
  }

  def main(args: Array[String]): Unit = {
    val dog = new Dog("haha")
    dog.catchMouse()
  }
}


