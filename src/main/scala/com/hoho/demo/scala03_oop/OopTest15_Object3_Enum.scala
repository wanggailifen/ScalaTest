package com.hoho.demo.scala03_oop

object OopTest15_Object3_Enum {

  def main(args: Array[String]): Unit = {
    println(Color.RED)
    println(Color.RED.id)
  }


  object Color extends Enumeration {
    val RED = Value(1, "red")
    val YELLOW = Value(2, "yellow")
    val BLUE = Value(3, "blue")
  }
}




