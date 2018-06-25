package PraObject

class CompanionOb {
  def hello()
  {  
    println("This is companion class")
  }
}

object CompanClass{
  def main(args: Array[String]){
    new CompanionOb().hello()
    println("This is Companion Object")
  }
}