import org.scalatest.FunSuite
import sfti.Chapter1

class Chapter1 extends FunSuite
{

  def isPrime(num: BigInt): Boolean = (BigInt(2) to num) forall (x => num % x != 0)

  test("ch_1_6 computes 2^1024 correctly") {
    assert(Chapter1.ch_1_6 == BigInt(2).pow(1024))
  }

  test("ch_1_7 produces a prime") {
    assert(Chapter1.ch_1_7.isProbablePrime(10))
  }

  test("ch_1_8 produces a Base 36 Number") {
    val b36Pattern = "([A-Z|0-9])+"
    assert(Chapter1.ch_1_8.matches(b36Pattern))
  }

  test("ch_1_9 grabs first, last character of a string of size > 2") {
    val heart = "heart"
    assert(Chapter1.ch_1_9(heart).equals("ht"))
  }

  test("ch_1_9 grabs first, last character of a string of size == 1") {
    val heart = "Z"
    assert(Chapter1.ch_1_9(heart).equals("ZZ"))
  }

  test("ch_1_9 grabs first, last character of a string of size == 0") {
    val heart = ""
    assert(Chapter1.ch_1_9(heart).equals(""))
  }
}
