package com.hoho.demo.scala03_oop

object OopTest15_Object1_Equal {
  def main(args: Array[String]): Unit = {
    val user1 = new User
    user1.id = 1001

    val user2 = new User
    user2.id = 1001

    println(user1 == user2)
  }


  class User {
    var id: Int = _

    override def equals(other: Any): Boolean = {
      if (other.isInstanceOf[User]) {
        val otherUser = other.asInstanceOf[User]
        this.id == otherUser.id
      } else {
        false
      }
    }
  }
}




