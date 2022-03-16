package Scala_learning_1

// to use HashMap import scala.collection.mutuable.HashMap

import scala.collection.mutable.HashMap

object Scala_HashMap_2 {

  // HashMap is a part of collection. it ism used for store the element and retun a map.
  // HashMap is a combination of key-value pairs.
  //key value pairs are stored using a hash Table data structure.
  def main(args: Array[String]) {
    //creating a list

    //creating empty HashMap
    var hashmap = new HashMap()

    //creating hashmap with values
    var hashmap2 = HashMap("C" -> "CSharp", "S" -> "Scala", "P" -> "Python")
    
    println(hashmap);
    println(hashmap2);
    
    // accessing value by using key
    println(hashmap2("S"))
    
    //adding or accessing value
    
    var hashmap3 = hashmap2 + ("J"-> "Java")
    
    //iterating elements
    hashmap3.foreach{
      
      case(key, value)=> println(key + " -> " + value)
      
      //whenever you want to add any element in hashMap
      //you have to apply variablename.foreach{} method.
      
      // everytime iteating values output will be in new line.
      
      // deleting value from hashMap
      
    }
    

  }
}