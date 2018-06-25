class Employee {
  println("Enter Salary in Float: ")
  var salary:Float= scala.io.StdIn.readFloat()
}
class  Programmer extends Employee
{
  println("Enter bonus :")
  var bonus:Int = scala.io.StdIn.readInt()
  println("Salary="+salary)
  println("Bonus="+bonus)
}

object InheritanceExample {
  def main(args: Array[String])
  {
    new Programmer()
  }
}