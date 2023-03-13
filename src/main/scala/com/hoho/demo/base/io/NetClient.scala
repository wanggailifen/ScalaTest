package com.hoho.demo.base.io

import java.io.OutputStream
import java.net.Socket

object NetClient {
  def main(args: Array[String]): Unit = {
    val server = new Socket("localhost", 9999)
    println("服务器连接成功")
    val out: OutputStream = server.getOutputStream
    out.write(100)
    out.close()
    server.close()
  }
}
