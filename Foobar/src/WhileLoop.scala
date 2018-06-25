
import java.util.Scanner
object WhileLoop {
  def main (agrs : Array[String]){
    var a = 50;
    var s  = new Scanner(System.in)
    println("Enter number for : ")
    var line = s.nextInt()
   // print(line)
    while (a<=line)
    {
      println(a)
      a = a+2;
       
    }
  }
}