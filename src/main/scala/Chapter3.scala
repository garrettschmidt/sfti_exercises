package sfti

import scala.util.Random

object Chapter3 {

  // Write a code snippet that sets a to an array of n random integers
  // between 0 (inclusive) and n (exclusive)
  def ch_3_1(n: Int) : Array[Int] = {
    val random = new Random
    (0 to (n-1)).map(_ => random.nextInt(n)).toArray
  }

  // Write a loop that swaps adjacent elements of an array of integers
  // (1, 2, 3, 4, 5) => (2, 1, 4, 3, 5)
  def ch_3_2(a: Array[Int]) : Array[Int] = {
    for (i <- 0 until a.length by 2) {
      if (i + 1 < a.size) {
        val i1 = a(i)
        a(i) = a(i+1)
        a(i+1) = i1
      }
    }
    a
  }

  // Repeat the the preceding assignment but produce a new array with the swapped values.
  // Use for/yield
  def ch_3_3(a: Array[Int]) : Array[Int] = {
    val evenPositions = for (i <- 0 until a.length by 2) yield i
    val oddPositions  = for (i <- 1 until a.length by 2) yield i
    val zippedPositions = evenPositions.zip(oddPositions)
    val interleavedPositions = zippedPositions.flatMap( x => List(a(x._2), a(x._1))).toArray
    if (evenPositions.size > oddPositions.size) interleavedPositions :+ a.last else interleavedPositions
  }

  // Given an array of integers, produce a new array that contains all positive values
  // of the original array, in their original order, followed by all values that are zero or negative, in
  // their original order
  def ch_3_4(a: Array[Int]) : Array[Int] = {
    val split = a.partition(x => x > 0)
    split._1 ++ split._2
  }
}