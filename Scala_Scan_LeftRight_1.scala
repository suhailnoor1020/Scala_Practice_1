package Scala_learning_1

/*Scan function takes the binary operation as parameter and returns
 * the value for each element in collection for that operation. It returns
 * each iteration for that binary operator in the collection. In scan also
 * we can define the initial value*/

object Scala_Scan_LeftRight_1 {

  // main difference are it iterate on elements seperately
  // gives map of intermediate result.

  def main(args: Array[String]) {

    val lst = List(1, 2, 3, 5, 7, 10, 13)
    val lst1 = List("A", "B", "C", "D")

    println(lst.scanLeft(10)(_ + _))
    // 10 will be added each elemnt on lst
    //List(10, 11, 13, 16, 21, 28, 38, 51)

    println(lst1.scanLeft("k")(_ + _))

    //example:

    //initialize a sequence of numbers
    val numbers: Seq[Int] = Seq(4, 2, 1, 6, 9)
    println(s"Elements of numbers = $numbers")

    //find the sum of the elements using scan function
    val iterations: Seq[Int] = numbers.scan(0)(_ + _)
    println("Running total of all elements" +
      s"in the collection = $iterations")

    //example:

    // initialize a sequence of strings
    val str_elements: Seq[String] = Seq(
      "hello",
      "Geeks", "For", "Geeks")
    println(s"Elements = $str_elements")

    // Concatenate strings with scan function
    val concat: Seq[String] = str_elements.scan("")((a, b) => a + "-" + b)
    println(s"After concatenation = $concat")

  }

}