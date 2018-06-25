package LoopCon

object ForLoop {
  def main (args: Array[String]){
    println("Enter number for checking:")
    var  num = scala.io.StdIn.readInt()
     for(i<-0 to num)
     {
       if(i%4!=0)
       {
         println(i)
       }
     }
  }
}