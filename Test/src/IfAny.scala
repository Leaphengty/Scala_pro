

object IfAny {
  def main(args: Array[String]): Unit = {
    println("Enter number for a and b: ")
    var a = scala.io.StdIn.readInt();
    var b = scala.io.StdIn.readInt();
    if(a>b)
    {
      println("A is bigger.")
    }
    else if (b>a)
    {
      println("B is bigger")
    }
    else
    {
      println("Equal")
    }
    var result: Any = if(a>b) a else if (b>a) b else "Equal"
      println(result)
  }
}