package Scala_learning_1

//Map is used to store elements. It stores elements in pairs of key and values.
//In scala, you can create map by using two ways either by using comma separated
//pairs or by using rocket operator.

//map() is a higher order function.
//Every collection object has the map() method.
//map() takes some function as a parameter.
//map() applies the function to every element of the source collection.
//map() returns a new collection of the same type as the source collection.

object Scala_Map_Filter {

  val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val mymap = Map(1 -> "Toma", 2 -> "Shahed", 3 -> "Mustakim")

  def main(args: Array[String]) {
    println(lst.map(_ * 2)) // iterate each element of lst, and give the result double
    println(lst.map(x => x * 2)) // same result as above
    //by using this function you can add, division on lst
    println(lst.map(x => x / 2)) // divide the lst.

    //we can use string too
    println(lst.map(x => "hello_" + x)) //hello will add before every element on lst
    println(lst.map(x => "hi" * x)) // hi will be times basesd on list value

    //now mymap
    println(mymap.map(x => "hi" + x)) // hi will be added before each key value pair
    println("hello".map(_.toUpper)) // hello will be in upper case.
    println(List(List(1, 2, 3), List(3, 4, 5)))

    // to join list of list
    println(List(List(1, 2, 3), List(4, 5, 6)).flatten)
    //flatten makes combine all list into a list

    println(lst.flatMap(x => List(x, x + 1))) // ****
    // 1 1+1=2,2,2+1=3,3-3+1=4

    //same function but using map, lets see
    println(lst.map(x => List(x, x + 1))) // **** look carefully these ****mmethods.
    // map and flatMap.
    
    // user define function
    
    def square(x:Int):Int = {
      
      x*x
    }
    
    var collection = List(1,2,3,4)
    var new_collection = collection.map(square)//...1
    
    println(collection.map(square))//same result
    println(new_collection)// same result....1
    
    
    // anonymous function
    
    //cource collection
    val collection1 = List(10,20,30,40)
    
    //transformed collection
    
    val new_collection1 = collection1.map(x => x+1)
    
    println(new_collection1)
    
    // for filter look at scala.Filter_1

  }

}