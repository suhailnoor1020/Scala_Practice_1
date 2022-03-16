package Scala_learning_1

// ListMap
/*This class implements immutable maps by using a list-based data 
 * structure. It maintains insertion order and returns ListMap. 
 * This collection is suitable for small elements.*/

import scala.collection.immutable._
object Scala_ListMap_4 {
  
  //empty ListMap
  
  def main(args:Array[String]){
    
    var listMap = ListMap("Samsung"-> 1000, "One Plus" -> 899, "Apple"-> 1299)
    var emptyListMap = new ListMap()// creating empty list map
    var emptyListMap2 = ListMap.empty// crreating empty list map
    
    println(listMap)
    println(emptyListMap)
    println(emptyListMap2)
    
    listMap.foreach{
      
      case (key, value) => println(key + "->" + value)
    }
    
    println(listMap("Apple"))
    var newListMap = listMap + ("LG" -> 699)
    
    newListMap.foreach{
      case (key, value) => println(key + "->" + value)
    }
  }
  
}