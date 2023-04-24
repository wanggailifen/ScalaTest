package com.hoho.demo.generic

/**
 * 泛型用干约束內部数据的类型，所以需要从外部传递到类的内部,只在编译时有效
 * 所以有时将泛型也称之为类型参数
 * 如果参数没有传递，没有传递泛型。为了保证程序的健壮性，不会发生错误, 会采用通用类型
 *
 * 泛型的应用时机
 * 1. 泛型定义后，才会起作用，不会对之前的代码起作用
 * 2. 泛型在约束类型，意味着使用到了类型才会出现错误，否则不会出现错误
 *
 *
 * 泛型和多态无关
 */
object Generic01 {


  /**
   * Scala中的泛型和Java的泛型大同小异
   * 1. java中的泛型使用是尖括号<>，scala采用的是中括号
   *
   * 2. scala的泛型也是不可变的，泛型是没有多态的
   *
   *
   * TODO 一、如果类型不变。但是泛型存在多态(父子关系)，那么 类型+泛型 也存在多态(父子关系)
   * 实现如果这样的功能，那么泛型就发生了变化，这种变化称之为【协变】
   *
   * TODO 二、如果类型不变。但是泛型存在多态(子父关系）  那么 类型+泛型 也存在多态(子父关系）
   * 实现如果这样的功能，那么泛型就发生了变化，这种变化称之为【逆变】
   */

  def main(args: Array[String]): Unit = {

    val message1: Message[User] = new Message[User]
    //    val message2: Message[User] = new Message[Child]
    val message2: Message[User] = new Message[Parent]
  }

  // TODO 协变的基本语法，就是在泛型的前面增加特殊符号：+
  // TODO 逆变的基本语法，就是在泛型的前面增加特殊符号：-

  //  class Message[+T] {
  //
  //  }

  class Message[-T] {

  }

  class Parent {

  }

  class User extends Parent {

  }

  class Child extends User {

  }
}
