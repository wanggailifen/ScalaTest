package com.hoho.demo.oop

object OopTest14_Trait2 {

  def main(args: Array[String]): Unit = {
    /**
     * TODO ***执行顺序***
     * 为什么要混入特质增加约束功能的补充和叠加
     * 如果混入了多个相同的功能，那么就汤要一个执行的顺序，否则会出现错误
     *
     *
     * TODO Scala 如何解决钻石问题：
     * 将多个功能混入在一起，按照特定的执行顺序进行叠加调用
     * 这里的特定执行顺序其实就是初始化顺序的反向操作
     */
    val mysql = new MySql

    mysql.operateData()
  }


  trait Operate {
    def operateData(): Unit = {
      println("进行数据处理")
    }
  }

  trait Database extends Operate {
    override def operateData(): Unit = {
      println("向数据库中")
      super.operateData()
    }
  }

  trait Log extends Operate {
    override def operateData(): Unit = {
      println("向日志文件中")
      // TODO ****这里的super不是表示父特质，而是表示【叠加功能后的上一级】
      super.operateData()
      // 改变上一级的指向
      // super[Operate].operateData()
    }
  }

  class MySql extends Database with Log {

  }

}




