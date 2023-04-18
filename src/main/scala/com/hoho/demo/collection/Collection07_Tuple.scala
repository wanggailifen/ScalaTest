package com.hoho.demo.collection

object Collection07_Tuple {

  def main(args: Array[String]): Unit = {

    /**
     * 如果想要让无关的数据当作一个整体来使用
     *  1. 如果数据有关系 生成Bean 对象，对应属性
     *     2. 如果数据含义相同 使用集合 Array[Any] Set[Any]等
     *     3. scala语言采用特殊的方式将无关的数据作为一个整体，称之为元素的组合【元组】
     *
     * 元组在scala种是一个特殊的集合，采用小括号声明，将数据包含到小括号中即可
     * Tuple是元素的组合，但是有个数的限制：22个
     * Tuple集合限制的数据的个数，但是没有限制数据的类型，也就意味着将集合对象放置在Tuple中
     */

    val t: Tuple3[Int, String, Int] = (1, "zhangsan", 30)

    // Tuple 如果采用集合类型来表示，比较麻烦，可以采用简化版本
    val t2: (Int, String, Int) = (1, "zhangsan", 30)

    // 无法使用循环操作，因为数据之间没有关系，就不能采用相同的循环逻辑
    // 如果想要访问其中的数据，可以用顺序号
    println(t2._1)
    println(t2._2)
    println(t2._3)

    // 用索引方式访问
    println(t2.productElement(0))
    println(t2.productElement(1))
    println(t2.productElement(2))

    //    如果元组中的元素的数量为2，那么称之为对用元组。也称之为【键值对对象】
    val t3 = ("a", 1)
    val t4 = ("b", 2)
    val tuple: (String, Int) = "a" -> 1


    val map = Map(
      ("a", 1),
      ("b", 2)
    )
    println(map)

    1 -> 2 -> 3 -> 4
    (((1, 2), 3), 4)


    for (kv <- map) {
      println(kv._1 + "===" + kv._2)
    }
  }


}
