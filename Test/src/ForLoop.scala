

object ForLoop {
  def main(args: Array[String]){
    var num:Int =100
    println(" The Odd number: ")
    for(num <- 1 to 100 by 2){
      println(num)
    }
    var result = for(j <- 1 to 101 if(j%2!=0)) yield j
    println(result)
  }
}