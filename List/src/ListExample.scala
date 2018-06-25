
import scala.collection.mutable.ListBuffer
object ListExample 
{
  def main(a: Array[String])
  {
    var fruit = List("Apple","Banana")
    
    var listt = new ListBuffer[String]()
    listt += ("Strawberry","Orange","Papaya","Plam")
    
    fruit = fruit ++ listt
    
    var fruits = "Kiwi" :: fruit /*Add to first element*/
    var (l,r) = fruits.splitAt(3)
    
    println(fruits)
    println(fruits.slice(2, 5))
    println(fruits.tail)
    println(l + "\n" + r)
    println(fruits)
    println(fruit)
  }
}
