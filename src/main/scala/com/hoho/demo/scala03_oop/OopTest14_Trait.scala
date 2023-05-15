package com.hoho.demo.scala03_oop

import org.apache.log4j.Logger

object OopTest14_Trait {

  private val log: Logger = Logger.getLogger(this.getClass)

  def main(args: Array[String]): Unit = {
    /**
     * TODO 将特质（trait）理解为interface 和 abstract class的结合体更好一些
     */

    /**
     * TODO ***初始化顺序***
     * 如果类同时有父类和特质，那么父类的初始化优先;如果类同时多个特质,从左到右依次初始化
     * 如果父类和子类同时有TraitParent Trait > Parent Class > Current Trait >Current Class
     */
    val user = new User()

    /**
     * TODO 动态混入： trait可以在构建对象时，将新的功能混入（添加）到对象中
     */
    val user2 = new User() with Hello
    user2.sayHello()




  }


  trait Hello {
    log.info("hello")

    def sayHello(): Unit = {
      log.info("hello!")
    }
  }


  trait Hello2 {
    log.info("hello2")
  }

  trait Run extends Exception {
    log.info("")

    def run(): Unit
  }

  class Cat extends Run {
    override def run(): Unit = {
      log.info("cat running...")
    }
  }

  class User extends Run with Hello with Hello2 {
    log.info("user")

    override def run(): Unit = {
      log.info("user  running...")
    }
  }


}




