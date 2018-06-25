

object AnaFunWithCompoFunc {
  def main (args: Array[String])
  {
    var result1 = (a:Int , b:Int , c:Int)=> if(a>b&&a>c) a  else if (b>a&&b>c) b   else c

    
    println(result1(10,21,32))
   
  }
}



 

