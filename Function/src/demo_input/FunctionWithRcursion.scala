package demo_input

object FunctionWithRcursion {
  def main (args: Array[String]): Unit = {
    println("Enter number for a and c: ")
    var a = scala.io.StdIn.readInt()
    var b = scala.io.StdIn.readInt()
    var result = functionExample(a,b)
    println(result)
    
  }
  def functionExample(a:Int , b:Int): Int={
    if (b==0)
    0
    else
    a+functionExample(a,b-1)  
   
  }
}