package demo_input

object FunctionWithMultipleLineExpression {
  def main (args: Array[String]){
    println("Enter number for a and b:")
    var a = scala.io.StdIn.readInt()
    var b = scala.io.StdIn.readInt()
    var result1 = add1(a,b)
    var result2 = add2(a,b)
    println("The result of sum and sub : ")
    println(result1+"\n"+result2)
  }
  def add1(a:Int , b:Int) = 
  {
    a+b
  }
  def add2(a:Int , b:Int) =
  {
    a-b
  }

}