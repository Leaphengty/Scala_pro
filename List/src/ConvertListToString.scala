

object ConvertListToString {
  def main(args: Array[String]){
    var list1 = List(1,2,3,4,5)
    var list2 = List(6,7,8,9,10)
    var list3 = list1++list2
    var convert=list3.mkString
    println(convert)
  }
}