package FunctionOverrloding

    
  
  class Arithmetic
  {
  def Add(a:Int , b:Int)
  {
    var sum = a+b
    println("The sum of two number:"+sum)
  }
  def Add(a:Int , b:Int , c:Int){
    var sum = a+b+c
    println("The Sum of Three number"+sum)
  }
}

object Fun_Overloading {
  def main(args: Array[String]){
    var a = new Arithmetic();
    a.Add(10,10)
    a.Add(10,10,10)
  }
}