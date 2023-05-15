package com.hoho.demo.scala03_oop


object OopTest09_Instance {
  def main(args: Array[String]): Unit = {


    //  1.可以通过new构建对象
    val user = new User()
    //  2. 可以通过反射构建对象
    //  3. clone
    //  4. 反序列化
    //  5. 使用object关键字构建单例对象
    println(OopTest09_Instance)


    //    6. scala中有一个方法可以构建对象，实际上采用的就是new，但是编译器可以动态识别
    //    apply方法可以省略，集合对象都是采用这种方式构建
    println(User.apply())
    println(User.apply())
    println(User())
    println(User())

  }

  object User {
    def apply(): User = new User
  }


  class User {

  }
}
