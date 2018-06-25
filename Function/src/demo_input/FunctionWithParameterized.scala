package demo_input

object FunctionWithParameterized {
  def main(args: Array[String]): Unit={
    println("Enter number for a and b")
    var a = scala.io.StdIn.readInt()
    var b = scala.io.StdIn.readInt()
    functionExample(a,b)
  }
  def functionExample(a:Int , b:Int){
    var c = a+b;
    println(c)
  }
}