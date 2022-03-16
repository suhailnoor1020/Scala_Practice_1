package Scala_learning_1

object Reduce_1 {
  /* Reduce function is applied on collection data structure in scala 
   * that contains lists, sets, maps, sequence and tuples. Parameter 
   * in the reduce function is a binary operation which merges all the 
   * elements from the collection and returns a single value. The first 
   * two values is combined with the binary operation and the resultant 
   * of that operation combines with the next value of the collection and 
   * at last we obtain a single value.*/
  
  val lst = List(1,2,3,5,7,10,13)
  val lst1 = List("A", "B", "C", "D")
  
  def main(args:Array[String]){
    
    
    println(lst.reduceLeft(_+_))// first 2 elements are added 
    //put in first place and 2nd element will be added and so on
    //and result will be shown. 1+2=3, 3+3=6, 6+5...
    
    println(lst1.reduceLeft(_+_))
    
    //making pair of two elements and sum
    println(lst.reduceLeft((x,y)=> {println(x + " , " + y); x+y}))
    
    // comparison between reduce left and right
    println(lst.reduceLeft(_-_))// look at result: -39
    println(lst.reduceRight(_-_))// look at result: 7
    println(lst.reduceRight((x,y)=> {println(x + " , " + y); x-y}))//look at result: 7
    
    
    
  } 
  
}