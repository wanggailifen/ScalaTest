package com.hoho.demo.matchtest

object MatchTest07_unapply {
  def main(args: Array[String]): Unit = {

    /**
     * TODO  普通的对象无法在模式匹配中使用。
     * 因为对象的匹配其实就是属性的匹配，就需要通过对象获取其属性，这里需要使用一个方法：【unapply】
     */
    val user = User("zhangsan", 30)
    user match {
      case User("zhangsan", 30) => println("yes")
      case _ => println("no")
    }


  }

  //   对象匹配比较麻烦，需要增加一些特定的方法才可以实现。

  /**
   * 样例类自动实现 可序列化接口，重写方法：equals, copy,hashCode
   * 样例类同时声朋了伴生对象，存在apply,unapply方法
   * @param name
   * @param age
   */
  case class User(name: String, age: Int) { }

  //  object User {
  //    def apply(name: String, age: Int): User = {
  //      val user = new User
  //      user.name = name
  //      user.age = age
  //      user
  //    }
  //
  //    def unapply(user: User): Option[(String, Int)] = {
  //      Option(user.name, user.age)
  //    }
  //  }
}
