package com.hoho.demo.scala04_collection

import scala.collection.mutable

/**
 * 集合通用方法
 */
object Collection10_Queue {


  def main(args: Array[String]): Unit = {
    val queue: mutable.Queue[String] = new mutable.Queue[String]()

    queue.enqueue("a","b","c")

    val queue1 = queue += "d"

    println(queue.eq(queue1))


    println(queue.dequeue())
    println(queue.dequeue())
    println(queue.dequeue())
    println(queue.dequeue())


  }


}
