package ClassPractice

object Factorial {
  def main(args: Array[String]){
    println("Enter number: ")
    var num = scala.io.StdIn.readInt()
    println(fact(num))
  }
  def fact(num:Int): Int = {
   
    if(num==0)
    {
      return 1
    }
    else
      return num*fact(num-1)
  }
}
