

object ExcepTheLast {
 def main(args: Array[String]){
   var ls1 = List(1,2,3,4)
   var ls2 = List(5,6,7,8)
   var ls3 = ls1++ls2
   println(ls3.init)
 }
}