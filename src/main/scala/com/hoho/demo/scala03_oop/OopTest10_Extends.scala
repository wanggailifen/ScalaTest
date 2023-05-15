package com.hoho.demo.scala03_oop

object OopTest10_Extends {
  def main(args: Array[String]): Unit = {
    /**
     * scala的继再和java是一致的：
     * 1. 存在父子类
     * 2. 主要目的是为了复用功能和属性
     * 3. scala中类的继承和java的继承是一样的，也是单继承，不能多继系，因为会产歧义。这种由于多继承所产生的歧义，称之为【钻石问题】
     */


    /**
     * 构造方法存在访问权限，可以设定为私有的，需要在参数列表的前面增加private关键字
     *
     * 如果类的造方法私有化，那么如何构建对象
     * 1. 辅助构造方法可以使用
     * 2. 买用伴生对象 可以访问伴生类的私有方法
     */
    var p1 = Parent(20)
    var p2 = Parent(20)
  }


  class Parent private(age: Int) {
    var name: String = _
    println("Parent")
  }

  object Parent {
    def apply(age: Int): Parent = new Parent(age)
  }

  // 把子类的构造参数传给父类的构造参数
//    class Child1(age: Int) extends Parent(age) {
//      println("Child1")
//    }
//
//    class Child2 extends Parent(30) {
//      println("Child2")
//    }

}




