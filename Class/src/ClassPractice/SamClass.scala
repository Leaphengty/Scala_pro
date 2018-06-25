package ClassPractice


 class Student(id:Int , name:String)
 {
    override 
    def toString(): String = 
    {
      id + " : " + name
    }
 }
object SamClass 
{
  def main(args: Array[String])
  {
    var s = new Student(1111,"Rathanak")
    println(s.toString())
  }
}