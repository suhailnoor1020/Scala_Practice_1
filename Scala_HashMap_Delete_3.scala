package Scala_learning_1

// HashMapp is created than removing an element is performed

import scala.collection.mutable.HashMap
object Scala_HashMap_Delete_3 {

  def main(args: Array[String]) {

    //creatinh Hashmap
    var delhashmap = HashMap("S" -> "Suhail", "N" -> "Noor", "Sh" -> "Shafin")

      println(delhashmap)
    //iterating elememts

    delhashmap.foreach {
      case (key, value) => println(key + "->" + value)
    }

    //removing hashmap

    delhashmap -= "Sh"

    println("After Remobing Sh key and value")

    delhashmap.foreach {

      case (key, value) => println(key + "->" + value)

    }
    //after deleting value
    println(delhashmap)

  }

}