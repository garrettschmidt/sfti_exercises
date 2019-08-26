package sfti

import scala.util.Random

object Chapter1 {

  // Using BigInt, compute 2^1024
  def ch_1_6: BigInt = {
    BigInt(2).pow(1024)
  }

  // What do you need to import so that you can get a random prime as
  // probablePrime(100, Random), without any qualifiers before probablePrime and Random?
  def ch_1_7: BigInt = {
    BigInt.probablePrime(100, new Random)
  }

  // Create a random base 36 string.
  def ch_1_8: String = {
    ch_1_7.toString(36).toUpperCase;
  }

  // Select the first and last Char from a string;
  def ch_1_9(s: String): String = {
    s.length match {
      case 0 => ""
      case _ => s.take(1).concat(s.takeRight(1))
    }
  }
}
