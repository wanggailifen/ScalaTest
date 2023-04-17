package com.hoho.demo.oop

object OopTest13_Interface {
  def main(args: Array[String]): Unit = {
    /**
     * TODO scala中没有接口的概念
     * scala可以将多个对象中相同的特征从对象中剥离出来，在成一个独立的语法结 称之为特质
     * 如果一个对象符合这个特征（特质），那么可以将特质混入到这个对象
     * 向类中混入特质，有2种方式
     *     1. 如果存在交类，那么采用with
     *     2. 如果没有父类，那么可以直接采用 extends 来混入
     */
  }


  trait Run {
    def run(): Unit
  }

  class Cat extends Run {
    override def run(): Unit = {
      println("cat running...")
    }
  }

  class Person {

  }

  class User extends Person with Run {
    override def run(): Unit = {
      println("user  running...")
    }
  }


}




