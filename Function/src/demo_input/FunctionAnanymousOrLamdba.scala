package demo_input

object FunctionAnanymousOrLamdba {
  def main(args: Array[String]) = {
    var a = scala.io.StdIn.readInt();
    var b = scala.io.StdIn.readInt();
    var result1 = (a:Int , b:Int)=>a+b
    var result2 = (_:Int)+(_:Int)
    println(result1(10,10))
    println(result2(20,20))
  }
}