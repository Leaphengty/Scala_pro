package ConstructorEX

object PrimaryConstructor {
  def main(args: Array[String]){
   // try{
    println("Enter Id: ")
    var id = scala.io.StdIn.readInt();
    println("Enter name: ")
    var name = scala.io.StdIn.readLine();
    var s = new Student(id , name)
    s.result();
   // }
   // catch
    //  {
  //case ioe: Exception => println("HEllo")
  
   // }
  }
  
  
}

class Student(id:Int , name:String){
  def result(){
  println("The ID is: "+id+ "\n"+"The Name is: "+name)
  }

}
