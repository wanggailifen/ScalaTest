package com.hoho.demo

object CaseClassTest {


  class Person

  /**
   * case class 就是java中的javaBean scala编译的时候会自动加上get/set方法
   */
  case class Teacher(name: String, sub: String) extends Person

  case class Student(name: String, cla: String) extends Person

  def check(person: Person): Unit ={
    person match {
      case Teacher(name,sub) => println("Teacher: name is " + name + ",sub is " + sub)
      case Student(name,cla) => println("Student: name is " + name + ",class is " + cla)
    }
  }

  /**
   * main方法只能定义在scala中
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {
    println("hello scala!")
    check(new Student("tom","class1"))
  }

}
