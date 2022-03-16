package Scala_learning_1

/* Like reduce fold also takes a binary operation which merges
 * all the elements from the collection and returns a single value.
 * The difference is that fold allows us to define an initial value.
 * Due to this property, fold can also manage empty collections. If the
 * collection is empty, the value initialized becomes the final answer.
 * Due to this we can also return a different value from the set of
 * collection using initial value of some other datatype. Reduce can
 * only return the value of the same type because its initial value is the
 * first value from the collection.*/

object Scala_Fold_LeftRight_1 {

  // so main differenced fold and reduce is fold takes initial value,
  // reduce doesn't take.

  val lst = List(1, 2, 3, 5, 7, 10, 13)
  val lst1 = List("A", "B", "C", "D")

  def main(args: Array[String]) {

    println(lst.foldLeft(0)(_ + _)) // when initialize value is 0, then result
    //will be same as reduceleft.
    println(lst.foldLeft(100)(_ + _))

    //fold right
    println(lst.foldRight(0)(_ + _))
    println(lst.foldRight(100)(_ + _))

    println(lst1.foldRight("")(_ + _))
    println(lst1.foldRight("k")(_ + _))

    //example 2:

    //value initialize

    val str_seq: Seq[String] = Seq("Hello", "Shahed", "How", "Are You!")

    println(s"Seq elements are = $str_seq")

    //

    val string_sequence = str_seq.fold("Wow")((a, b) => a + " - " + b)
    println(s"String sequence are = $string_sequence")
    //wow is added before the elemnts. foldRight=> wow will be added right after the elements

    // initialize a sequence of elements
    val seq_elements: Seq[Double] = Seq(3.5, 5.0, 1.5)
    println(s"Elements = $seq_elements")

    // find the sum of the elements using fold function
    val sum: Double = seq_elements.fold(0.0)((a, b) => a + b)
    println(s"Sum of elements = $sum")

  }

}