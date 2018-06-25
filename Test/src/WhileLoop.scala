

object WhileLoop {
  def main(args: Array[String]){
    var sum : Int=0
    println("Enter number: ")
    var a = scala.io.StdIn.readInt()
    while(a!=0){
     sum = sum + a
     a = scala.io.StdIn.readInt()
    }
    println(sum)
  }
}