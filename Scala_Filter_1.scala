package Scala_learning_1

//The filter() method is utilized to select all elements
//of the list which satisfies a stated predicate.

object Scala_Filter_1 {

  def main(args: Array[String]) {
    var value1 = List(1, 2, 3, 4,5,6,9,10,12,13)

    //applying filter method
    var result = value1.filter(_ < 4)
    var result1 = value1.filter(_ < 1)

    //display result
    println(result)
    println(result1) //output: empty list
    
    //EVENE VALUES
    println(value1.filter(x=> x%2==0))
    
    //odd values
    println(value1.filter(x=> x%2!=0))
    
    //this is all about filter method in scala.

  }

}