package com.hoho.demo.matchtest

object MatchTest02 {
  def main(args: Array[String]): Unit = {
    //    匹配常量
    def describe(x: Any): String = {
      x match {
        case 5 => "Int five"
        case "hello" => "String hello"
        case true => "Boolean true"
        case "+" => "Char +"
        // TODO  如果case后直接写类型，并不表示类型匹配，而是对象匹配
        case a: Int => "Int"
        case s: String => "String"
        case m: List[_] => "List"
        // TODO *** 类型匹配时，不考虑泛型, Array除外。真正的泛型只在编译时有效，而Array的泛型在运行时也有效。
        case c: Array[Int] => "Array[Int]"

          /**
           *    如果所有的规则都不匹配，会查找下划线的分支，
           *    但是如果想要使用下划线所代表的值，一般会给下划线起名
           *    这里 someThing 就是起的名
           */

        case someThing => "" + someThing
      }
    }


    println(describe(true))
    println(describe(Array(1,2,3,4)))
    println(describe(Array("1","2")))
  }

}
