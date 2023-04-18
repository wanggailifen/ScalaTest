package com.hoho.demo.collection

import scala.collection.mutable.ListBuffer

/**
 * 可变序列
 */
object Collection04_Seq_buffer {

  def main(args: Array[String]): Unit = {

    val buffer: ListBuffer[Int] = ListBuffer(1, 2, 3, 4)
    buffer.append(5)
    buffer.insert(1, 6)

    // 互相转换
    val list = buffer.toList
    val buffer1 = list.toBuffer

  }

}
