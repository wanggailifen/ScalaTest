package com.hoho.demo.matchtest

object MatchTest01 {
  def main(args: Array[String]): Unit = {
    /**
     * 这里的匹配其实就是匹配数据的规则
     * 这里的模式其实就是特定写法的规则
     * 代码执行完华，匹配结束，不会有穿透现象，scala语言中没有break关键字
     * 如果多个规则匹配不成功，可以使用下划线表平任意值，类以于default
     *
     *
     * java的switch语法，case 关健字和default关健字存在执行的先后顺序。
     * scala中没有default关键字，所以如果将下划线分支放置在最前面，那么会优先执行
     * 如果数据没有匹配任何的机则，就会发生错误：scala. MatchError
     */
    val age = 10

    age match {
      case 10 => {
        println("age = 10 ")
      }
      case 20 => {
        println("age = 20 ")
      }
      case _ => {
        println("age = other ")
      }
    }

  }
}
