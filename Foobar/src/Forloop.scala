
import java.util.Scanner
object Forloop {
  def main (agrs: Array[String]){
    var s = new Scanner(System.in)
    print("Enter number: ")
    var num = s.nextInt()
    for (num <-1 to num if num%2 == 0)
    {
      println(num)
    }
  } 
}