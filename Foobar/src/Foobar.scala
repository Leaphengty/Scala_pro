

object Foobar {
  def main (agrs: Array[String]){
    var num:Int =100;
    for(num<-1 to 100)
    {
      if (num%15 ==0)
      {
        println("Foobar")
      }
      else if(num%5 ==0)
      {
        println("Foo")
      }
      else if(num%3 == 0)
      {
        println("bar")
      }
      else
      {
       println("OK")
      }
    }
   }
}

