package com.hoho.demo.collection

/**
 * 集合通用方法
 */
object Collection09_Method3 {


  def main(args: Array[String]): Unit = {
    val list = List(11, 222, 7, 1, 2, 3, 444)

    val list2 = list.sortBy(num => num.toString)
    println(list2)

    val list3: List[Int] = list.sortBy(num => num.toString)(Ordering.String.reverse)

    println(list3)
    list.sortWith((a: Int, b: Int) => {
      a >= b
    })

    // TODO 使用tuple排序，第一个元素相同的按照第二个元素排序   默认升序
    list.sortBy(num => (num, num.toString.length))(Ordering.Tuple2(Ordering.Int, Ordering.Int.reverse))

    val list4 = List(1, 2, 3)
    println(list4.reduce((a, b) => (a + b * 2)))
    println(list4.reduce(_ + _ * 2))
    println(list4.reduceLeft(_ + _ * 2))

    // TODO ***** 注意reduceRight的顺序 不是从后往前！  reversed.reduceLeft[B]((x, y) => op(y, x))
    println(list4.reduceRight(_ + _ * 2))






  }


}
