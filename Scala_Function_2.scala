package javaTPoint_Scala

// using default value in function

//in scala we can use operator sign(+,-,*) as function name.
object Scala_Function_2 {

  object Math {

    def add(x: Int, y: Int): Int = {

      return x + y
    }
    def square(x: Int): Int = x * x

  }

  def print(x: Int, y: Int): Unit = {
    println(x + y)
  }

  object Calculation {

    def fixed(x: Int = 12, y: Int = 15): Int = {

      return x * y
    }
  }
  def main(args: Array[String]) {
    
    //anynomous function, no function name. here add1 is variable
    var add1 = (x:Int, y:Int)=> x+y
    println(add1(1,3))

    println(Math.add(11, 33))
    println(Math.square(3))

    println(".................")
    println(Calculation.fixed())

    println(Calculation.fixed(10))
    // assigned heer one parameter, it works like as value of x
    print(101, 102)
  }
}
