

object ListOfList {
  def main(args: Array[String]){
    var list1 = List(1,2,3,4,5,6)
    //list1.reverse
    var list2 = List(7,8,9,10,11)
    //list2.reverse
    var list3 = List(list1,list2)
   // list3.reverse
    println(list3)
  }
}