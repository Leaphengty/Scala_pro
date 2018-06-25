package demo_input

object FunctionWithParameterDefualtValue {
  def main (args: Array[String]) = {
    var a = scala.io.StdIn.readInt()
    var b = scala.io.StdIn.readInt()
    var re = functionex(a,b)
    var re1 = functionex(a)
    var re2 = functionex(b)
    var re3 = functionex()
    println(re+"\n"+re1+"\n"+re2+"\n"+re3)
  }
  def functionex(a:Int=0 , b:Int=0): Int={
    
    a+b
  }
}