package com.hoho.demo.oop


object Test02_Import {


  def main(args: Array[String]): Unit = {

    /**
     * scala 的import是可以导入包的，java只能导入类
     * import可以在任何地方使用
     * 导入包内所有类使用_
     * 可以在同一行导入一个包类的多个类
     */
    import com.hoho.demo.function
    //    import java.util._
    //    import java.util.{List, LinkedList}
    function.testPackageObject()

    /**
     * 屏蔽类
     * 如果不同包有相同类名，可以通过屏蔽方式进行编译
     */
//    import java.util.Date
//    import java.sql.{Date => _, _}

    /**
     * 给类起别名
     */
    //    import java.util.{HashMap=>JavaHashMap}
    //    var map = new JavaHashMap()

    /**
     * TODO scala中import的规则
     * 以当前包为基准，导入指定子包中的类，如果找不到，再从顶级包中依次查找
     */
    println(new java.util.HashMap())
    println(new _root_.java.util.HashMap())

    /**
     * java.lang 包中的类无需导入
     * scala包 中的类无需导入
     * scala中 Predef对象的方法也无需导入，类似于静态导入
     */
  }


}
package java {
  package util {
    class HashMap {
    }
  }

}


