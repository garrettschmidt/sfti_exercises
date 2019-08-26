package sfti

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer


object Chapter2 {

  // The signum operatior of a number is 1 if the number is positive, -1 if it is negative,
  // and 0 if it is zero.  Write a function to compute this value.
  def ch_2_1(num: Int) : Int = {
    num match {
      case it if Int.MinValue to -1 contains it => -1
      case it if 0 to 0 contains it => 0
      case _ => 1
    }
  }

  // What is the value of an empty block expression? What is its type?
  def ch_2_2 = {
    // Unit.type
  }

  // Come up with one situation where the assignment x = y = 1 is valid in scala
  def ch_2_3 = {
    var y = 2
    var x = y = 1
  }

  // Write a Scala equivalent for the Java loop:
  //    for (int i = 10; i >=0; i--) System.out.println(i);
  def ch_2_4: ArrayBuffer[Int] = {
    ch_2_5(10)
  }

  // Write a procedure countdown that prints the numbers from n to 0
  def ch_2_5(n: Int): ArrayBuffer[Int] = {
    val v = ArrayBuffer[Int]()
    for (i <- n to 0 by -1) {
      v += i;
    }
    v
  }

  // Write a for loop for computing the product of Unicode codes of all
  // letters in a string.
  def ch_2_6(s: String) : BigInt = {
    s.foldLeft(1L)((x, y) => x * y.toLong)
  }
}
