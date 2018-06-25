package demo_input

object FunctionCompositon {
  def main (args: Array[String]): Unit={
    println("Enter number : ")
    var a = scala.io.StdIn.readInt();
    var result = multiplyBy2(add2(a))
    println(result)
  }
  def add2(a:Int):Int={
    a+2
  }
  def multiplyBy2(a:Int):Int={
    a*2
  }
}