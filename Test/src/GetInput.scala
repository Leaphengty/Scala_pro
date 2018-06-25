

object GetInput {
 def main (agrs: Array[String]){
   println("Enter number")
   var a = scala.io.StdIn.readInt();
   var b = scala.io.StdIn.readInt();
   if (a>b)
   {
     println("A is Bigger.")
   }
   else if(b>a)
   {
     println("B is Bigger.")
   }
   else if (a==b)
   {
     println("A Equal B")
   }
   else
   {
     println("Anything else...")
   }
 }
}