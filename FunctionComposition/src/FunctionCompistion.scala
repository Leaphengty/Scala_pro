

object FunctionCompistion {
  def main(args: Array[String])
  {
    
    var result  = getInput(PassTo())
  }
  def PassTo():Int={
    println("Enter Number for checking date:")
    var b = scala.io.StdIn.readInt()
    return b
  }
  def getInput(b:Int){
    b match
    {
      case 1=>println("Monday")
      case 2=>println("Tuesday")
      case 3=>println("Wednesday")
      case 4=>println("Thursday")
      case 5=>println("Friday")
      case 6=>println("Saturday")
      case 7=>println("Sunday")
      case _=>println("No day found")
       
    }
  }
}