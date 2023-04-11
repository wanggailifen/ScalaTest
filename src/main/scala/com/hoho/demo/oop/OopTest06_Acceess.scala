package com.hoho.demo.oop

object OopTest06_Acceess {
  def main(args: Array[String]): Unit = {
    /**
     * 1. private：私有，同类
     * 2. private[包名]：包私有，同类，同包(包括子包)
     * 3. protected 受保护的，同类，子类  (scala中 protected没有同包的权限)
     * 4. (default)：公共的，任何他方都可以使用
     */
  }

  class User {
    private var name = "zhangsan"
    private[oop] var age = "zhangsan"
    protected var email = "zhangsan"
    var address = "zhangsan"


    def test(): Unit = {
      println(this.name)
      println(this.age)
      println(this.email)
      println(this.address)
    }
  }

  // 其他类
  class Emp {
    def test(): Unit = {
      val user = new User()
      //      println(user.name)
      println(user.age)
      //      println(user.email)
      println(user.address)
    }
  }

  // 子类
  class Student extends User {
    def test01(): Unit = {
      val user = new User()
      //      println(user.name)
      println(user.age)
//      println(user.email)
      println(user.address)
    }
  }

}

// 子包
package sub06 {

  import com.hoho.demo.oop.OopTest06_Acceess.User

  class SubClass {
    def test(): Unit = {
      val user = new User()
      //            println(user.name)
      println(user.age)
      //            println(user.email)
      println(user.address)
    }
  }
}