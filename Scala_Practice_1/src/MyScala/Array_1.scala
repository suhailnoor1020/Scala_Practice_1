
/*Array is a special kind of collection in scala. 
  it is a fixed size data structure that stores elements 
  of the same data type.*/
  
  // It is a collection of mutable values
  
  /*Scala arrays can be generic. which mean we can have an Array[T], 
   * where T is a type parameter or abstract type.*/
  
  /*Scala supports both one as well as multi-dimension arrays. 
   * A single dimension array is one having only one row and n 
   * columns whereas two dimension array is actually a matrix of 
   * dimension (n * m)*/

object Array_1 {
  
  //Syntax
  //var arrayname = new Array[datatype](size)
  // 1 dimensional array
  
  def main(args: Array[String]){
    
    var name = Array ("shahed", "Mustakim", "Taskin", "Afsin", "Rafid")
    
    var days = Array("Monday","Tuesday","Wednesday","Thursday",
        "Friday","Saturday","Sunday")
    
        
     //updating element in array
        
        name(0) = "Tahmid Bhuiyan"
        
      //  println("Days in a week are: ")
        
        for(i <-days){
          
        //  println(i)
        }
    
    
    //println("Second element in the field is :")
    
    //accessing array element
    println(name(1))
    
    //println(name(0))
    
    for (m1 <- name){
      
      println(m1)
    }
    
        
    
  }
  
}