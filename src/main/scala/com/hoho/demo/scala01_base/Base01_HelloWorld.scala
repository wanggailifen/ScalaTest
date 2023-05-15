package com.hoho.demo.scala01_base

import org.apache.log4j.Logger

/**
 * object 声明单例对象
 * scala语言是一个完全面向对象的语言，但是java中的静态语法不是面向对象的。
 * scala语言没有静态语法
 * scala采用新的关键字object来模拟静态语法 可以通过对象名称实现静态操作
 *
 * HelloWorld 单例对象名称，同时也是类名
 */
object Base01_HelloWorld {
  private val log: Logger = Logger.getLogger(this.getClass)

  def main(args: Array[String]): Unit = {
    System.out.println("Hello world")
    log.info("Hello world")
  }
}
