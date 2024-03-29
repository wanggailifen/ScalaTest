package com.hoho.demo.scala07_Implicit


/**
 * 隐式类
 */
object Transform04 {

  /**
   * TODO 隐式转换作用域
   *  1. 当前类的内部。不能作用于最外层对象
   *  2. 转换规则必须与当前类有关系（父类、特质、父类的伴生对象，特质的伴生对象、包对象、直接导入）
   *
   *  隐式解析机制
   * （1）首先会在当前代码作用域下查找隐式实体（隐式方法、隐式类、隐式对象）。
   * （一般是这种情况）
   *
   * （2）如果第一条规则查找隐式实体失败，会继续在隐式参数的类型的作用域里查找。
   * 类型的作用域是指与该类型相关联的全部伴生对象以及该类型所在包的包对象。
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {

    val user = new User
//    user.insertUser()
    user.updateUser()

  }

  /**
   * TODO 如果类的前面增加implicit，表示当前类应用于隐式转换，称之隐式类
   * @param user
   */
  implicit class UserExt(user: User) {
    def updateUser(): Unit = {
      println("update user ")
    }
  }

  class User {
    def insertUser(): Unit = {
      println("insert user ")
    }
  }
}
