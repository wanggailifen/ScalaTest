package com.hoho.demo.collection

/**
 * 序列
 */
object Collection04_Seq {

  def main(args: Array[String]): Unit = {
    /**
     * Seq 是一个trait， 所以无法直接构建对象，一般采用伴生对象的appLy方法
     * Seq 是一个trait，无法直接的建对象，所以底层采用的是List集合
     * val seq = new Seq[Int]()
     */
    val seq: Seq[Int] = Seq.apply(1, 2, 3)
    val seq2: Seq[Int] = Seq(1, 2, 3)
    println(seq)
    println(seq2)
    val list1: List[Int] = List.apply(1, 2, 3)
    val list2: List[Int] = List(1, 2, 3)
    println(list1)
    println(list2)

    // Seq, List集合默认使用时就是不可变的，所以常用的数据操作方法其实都是特殊符号
    // 默认情况下，不可变的集合的数据操作，会产生新的集合
    //    list1.:+(4)
    //    list1.+:(5)
    //    list1.++:(list2)

    val list3 = list1 :+ 5
    val list4 = 6 +: list1

    println(list3)
    println(list4)

    val list5 = list1.updated(0, 1)
    println(list5 eq list1)
    println(list5)

    println(list1(0))
    println(list1.mkString(","))
    list1.foreach(println(_))






  }

}
