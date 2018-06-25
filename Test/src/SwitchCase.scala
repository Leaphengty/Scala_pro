

object SwitchCase {
  def main (agrs: Array[String]): Unit = {
    println("Enter String: ")
    var num = scala.io.StdIn.readLine();
    num  match
    {
      case "hello"=> println("I'm true")
      case _ =>println("false")
    }
     var str = num match
    {
       case "hello"=>println("I'm never wrong")
       case _=>println("I'm always false")
    }
  }
}