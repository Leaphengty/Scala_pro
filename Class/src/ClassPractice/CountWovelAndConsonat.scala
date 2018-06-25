package ClassPractice

object CountWovelAndConsonat {
  def main(args: Array[String])
  {
    
    var i:Int = 0;
    var countvo:Int=0
    var countCon:Char= ' '
    var sym:Int=0
    println("Enter sentence: ")
    var str = scala.io.StdIn.readLine();
    for (i<-0 to str.length()-1)
    {
        if(str.charAt(i)=='A'||str.charAt(i)=='a'||str.charAt(i)=='E'||
            str.charAt(i)=='e'||str.charAt(i)=='U'||str.charAt(i)=='u'||
            str.charAt(i)=='O'||str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='I')
        {
          countvo = countvo+1;
        }
        else 
        {
          print(str.charAt(i))
        }
    }
    println("\n"+"The length of vowel: "+countvo)
   
      
	}        
  
}
