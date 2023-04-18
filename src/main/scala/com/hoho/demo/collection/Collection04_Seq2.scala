package com.hoho.demo.collection

/**
 * 序列
 */
object Collection04_Seq2 {

  def main(args: Array[String]): Unit = {
    // 使用一个不同的方式构建集合
    // :: 这个运算符表示向集合中添加数据，但是因为以冒号结居，所以计算规则从后向前

    // 如果直接使用List()，表示空集合，向空集合种添加数据比较常见的方式就是下面这种
    // 为了操作方便，所以可以采用特殊对象来代智空集合：NiL
    val list = 1 :: 2 :: 3 :: List()
    println(list)
    val list2 = List().::(4).::(3).::(2).::(1)
    println(list2)
    val list3 = 1 :: 2 :: 3 :: Nil
    println(list3)

    // :: 表示添加一个数据，:::表示添加一个集合里面的所有数据
    val list5 = 9::list3::list
    val list6 = 9::list3:::list

    println(list5)
    println(list6)


  }

}
