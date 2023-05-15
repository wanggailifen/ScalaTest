package com.hoho.demo.scala01_base.io

import java.io.InputStream
import java.net.{ServerSocket, Socket}

object NetServer {
  def main(args: Array[String]): Unit = {
    val server = new ServerSocket(9999)
    println("服务器启动成功，等待客户端连接")
    val client: Socket = server.accept()
    val in: InputStream = client.getInputStream
    val i: Int = in.read()
    println(i)
  }
}
