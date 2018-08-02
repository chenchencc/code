package com.jason.scala
//类默认就是用public修饰的
class Demo1 {
  //使用val修饰的变量不可修改，既没有set方法，只有get方法
  val page : Int = 100
  //使用var修饰的变量可修改，既get/set方法都有
  var name : String = "Jason"
  //可以使用_表示占位符既默认值(不能与val修饰符一起使用)
  //val hieght : Int = _
  //
  var weight : Int = _

  //使用private修饰的变量不能被其他类访问，只能被伴生对象或当前类访问和修改操作(既在当前这个类中有一个同名的单例类object修饰的)
  private var address : String = _

  //使用private+this修饰的变量可以，改属性属于该对象私有变量，只有本来访问，伴生对象也访问不了
  private[this] var firstName : String = "Chen"

}

object Demo1{
  def main(args: Array[String]): Unit = {
    print("Hello")
    //创建对象一
    val demo = new Demo1()
    //创建对象二
    var d = new Demo1
    d.address = "BJ"
    print(d.address)

  }
}
object Demo{
  def main(args: Array[String]): Unit = {
    val p = new Demo1
    p.name = "aa"
    print(p.name)
    //使用val修饰的变量不可修改
//    p = new Demo1()
    
  }
}