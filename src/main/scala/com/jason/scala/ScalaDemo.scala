package com.jason.scala

class ScalaDemo {



}

object ScalaDemo{
  def main(args: Array[String]): Unit = {
    val v = 1 to 10
    println(v)

    for ( i <- -1 to 10){
      println(i)
    }

    var array = Array("a",1)
    println(array)

    //yield关键字是将每一个值都放入到集合中
    val y = for (i <- 1 to 10 ) yield i
    println(y)
    println(1. + (3) )
  }


}