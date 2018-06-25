package ConstructorEX

object SecondaryConstructor {
  def main(args: Array[String]){
  println("Enter ID:")
  var id = scala.io.StdIn.readInt();
  println("Enter Name: ")
  var name = scala.io.StdIn.readLine();
  println("Enter age:")
  var age = scala.io.StdIn.readInt();
  var s = new student(id , name ,age)
  s.result();
  }
  class student(id:Int , name:String){
    var age:Int =0;
    def result(){
      println(id+"  "+name+"  "+age)
    }
    def this(id:Int , name:String , age:Int){
      this(id,name)
      this.age = age;
    }
  }
}