package com.jason.scala

class ApplyAndUnApply(var name : String, var age : Int ,var faceValue : Int) {

}

object ApplyAndUnApply{

  def apply(name: String, age: Int, faceValue: Int): ApplyAndUnApply = new ApplyAndUnApply(name, age, faceValue)

  def unapply(arg: ApplyAndUnApply): Option[(String, Int, Int)] = {
    if(arg == null){
      None
    }else{
      Some(arg.name,arg.age,arg.faceValue)
    }
  }
}

object Test{
  def main(args: Array[String]): Unit = {
    val demo = ApplyAndUnApply("cc",26,99)
    demo match {
      case ApplyAndUnApply(name,age,face) => println(s"name.....$name")
      case _ => println("nothing is match!")
    }
  }
}
