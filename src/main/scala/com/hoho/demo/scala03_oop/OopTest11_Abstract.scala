package com.hoho.demo.scala03_oop

object OopTest11_Abstract {
  def main(args: Array[String]): Unit = {
    val user = new Child()
    println(user.name)
  }

  abstract class User {

    /**
     * TODO  如果类的属性只有声明，没有初始化，就称之为抽家属性，因为不完整
     * 抽象属性的本质
     *     1. 编译器再编译时，抽家属性并不会编译为属性，而是会编译为属性对应的set，get两个抽象方法
     *        2. 子类在编译时，其实就是实现了属性的set,get方法
     *        3. 完整的属性在scala中有重写的概念，因为本质上还是方法的重写
     *        4. 可变变量（var）是不能被重写的
     */
    var name: String
    val age: Int = 30


    /**
     * TODO 不完整的方法（只有声明，没有实现），称之为抽象方法
     *
     */
    def test(): Unit
  }


  class Child extends User {


    override var name: String = _
    override val age: Int = 40

    /**
     * TODO 不完整的方法（只有声明，没有实现），称之为抽象方法
     * 既然类是不完整的，所以无法直接构建对象 如果想要构建对象，需要由子类继承后构建
     * 一个类中如果有抽家方法，那么这个类是抽象类
     * 如果一个类是抽象类，那么这个类不一定有抽象方法
     */
    override def test(): Unit = {


    }


  }

}




