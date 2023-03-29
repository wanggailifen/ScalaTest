package com.hoho.demo.oop

import scala.beans.BeanProperty

object OopTest05_Field {
  def main(args: Array[String]): Unit = {

    /*
    1. scala中给类声朋属性等同于给类声明变量 类中的变量称之为属性
    2. 变量使用val var 声明
    3. 变量的类型如果可以推断，就可以省略
    4. 变量必须显示初始化。
        * var声明的属性可以采用下划线赋值,这时候类型必须加上（val不允许）
        * 使用val声明的属性 在编译后会增加final关键字
    5. 类的属性的权限都是 private 并且会同时生成公共的 get、set方法（只是名字不叫setXXX、getXXX）
    6. 当 访问\设置 属性时，等同于调用对象属性的 get\set 方法
    7. scala 提供注解@BeanProperty 来解决bean规范的问题 这样反编译以后就是setXXX、getXXX
     */
    val user = new User()
    println(user.name)

  }


  class User {

    @BeanProperty var name: String = _

    var age: String = _

    val address = "XXXXX"

  }

}
