class bank{
  def getRate()={
    10
  }
}
class school extends bank{
  override def getRate()={
    1000
  }
}
class kit extends bank{
 override def getRate()={
   550 
  }
}
object MultipleFunctionOverriding {
  def main(args: Array[String]){
    var a = new school
    var b = new bank
    var c = new kit
    println("All result"+"  "+a.getRate+" "+ b.getRate+"  "+c.getRate)
  }
}