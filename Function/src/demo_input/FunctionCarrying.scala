package demo_input

object FunctionCarrying {
  def add(a:Int)( b:Int) =
  {
    a+b
  }
  def main(args: Array[String]){
    println("Enter vaule for First and Second number: ")
    var a = scala.io.StdIn.readInt()
    var b = scala.io.StdIn.readInt()
    var result = add(a)(b)
    println("First + Second = "+result)
    var addIt = add(a)_
    var result2= addIt
    println("A+B="+result2)
    
  }
}