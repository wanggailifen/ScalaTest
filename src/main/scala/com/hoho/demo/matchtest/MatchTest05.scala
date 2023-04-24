package com.hoho.demo.matchtest

object MatchTest05 {


  def main(args: Array[String]): Unit = {

    val (id, name, age) = (1, "zhangsan", 30)

    println(id)
    println(name)
    println(age)

    val map = Map(
      ("a" -> 1),
      ("b" -> 2),
      ("c" -> 3)
    )

    for ((k, v) <- map) {
      println(k + "=" + v)
    }

    // 模式匹配 只有value = 2 才打印
    for ((k, 2) <- map) {
      println(k + "=" + 2)
    }


    val map2 = Map(
      (("河北", "鞋"), 2),
      (("河北", "衣服"), 3),
      (("河南", "衣服"), 4),
      (("河南", "电脑"), 4)
    )

    map2.toList.map(
      t => {
        (t._1._1, (t._1._2, t._2))
      }
    ).foreach(println(_))

    //小括号在匿名函数中表示参数列表，所以无法直接作为模式匹配的元组规则

    map2.toList.map(
      t => {
        (t._1._1, (t._1._2, t._2))
      }
    ).foreach(println(_))

    println("===")

    // TODO  如果想要使用模式匹配来匹配元組，需要使用关键字case明确告诉编译器 需要将小括号变成大括号
    map2.toList.map {
      case ((prv, item), count) => {
        (prv, (item, count))
      }
    }.foreach(println(_))

  }
}
