package ClassPractice
case class CaseClass(a:Int , b:Int)

object CaseClass {
  def main(args: Array[String]){
    var a = scala.io.StdIn.readInt()
    var b = scala.io.StdIn.readInt()
    var c = CaseClass(a,b)
    println("A+B = "+c.a + c.b)
  }
  
}