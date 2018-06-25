
class car{
  def run()
  {
       println("Lambogini")
  }
}
class bike extends car{
  override def run(){
    println("Honda")
  }
}
object FunctionOverriding {
  def main(args: Array[String])
  {
    var b = new car
    b.run
  }
}