package com.hoho.demo.scala09_other

/**
 * Option 有两种值 some表示有值，none表示没有值
 */
object OptionTest {

  val ages = Map("jack" -> 18, "tom" -> 100, "jessic" -> 27)

  def getAge(name: String): Unit = {
    val age = ages.get(name)
    age match {
      case Some(age) => println("age is " + age)
      case None => println("None")
    }
  }


  def main(args: Array[String]): Unit = {
    getAge("jack")
    getAge("haha")

  }

}
