

object GreatesNumber {
  def main (args: Array[String]){
    println("How many number that you want to sort:")
    var lg = scala.io.StdIn.readInt()
    var arr = new Array[Int](8)
//    var arr1 = new Array[Int](8)
   // var temp    = new Array[Int](8)
    var j:Int=0
    for(i <-0 to lg)
    {
      var num = scala.io.StdIn.readInt()
      arr(i) = num
    }
    for (i <- 0 to lg)
    {
      for(j <- i+1 to lg)
      {
        if(arr(i)>arr(j))
        {
          var temp = arr(i)
          arr(i)=arr(j)
          arr(j)=temp
        }
      }
    }
    println("After sorted: ")
    for(i<- 0 to lg)
    {
      println(arr(i))
      
    }

   
  }
}