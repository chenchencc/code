package com.jason.scala

//类的构造器
//构造器的参数就是类的成员变量，如果构造器的参数不用var、val修饰的话，是不能访问的
//构造器的参数可以赋初始值
//主构造器
/**
  *
  * @param name
  * @param age
  * @param face face变量不能被伴生对象访问，虽然没有使用val、var修饰，默认是用val修饰
  */
class Structor(var name : String = "12",val age : Int,face : String) {

  var height : Int = _
  //辅助构造器
  def this(name : String,age : Int,face : String,height : Int){
    //辅助构造器必须首先调用主构造器
    this(name,age,face)
    this.height = height
  }
  def getFace(): String ={
    //此时不可更改，默认使用val修饰
//    face = 100
    //return可不写
//    return face
    face
  }


  def test() : String = {
    "a"
  }

  def print(name :String*):Unit={}

}
object Structor{
  def main(args: Array[String]): Unit = {
    var s = new Structor("12",2,"good")
    print(s.age)
    //构造器的参数没有使用var、val修饰不能访问
//    printf(s.face)
    //参数使用val修饰之后不能修改
//    s.age = 22
  }
}

//问题：在Scala中如何使用static方法和变量呢？