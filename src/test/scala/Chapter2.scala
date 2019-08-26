import org.scalatest.FunSuite
import sfti.{Chapter1, Chapter2}

class Chapter2 extends FunSuite {

  test("ch_1_6 computes signum for zero") {
    assert(Chapter2.ch_2_1(0) == 0)
  }

  test("ch_1_6 computes signum for -1") {
    assert(Chapter2.ch_2_1(-1) == -1)
  }

  test("ch_1_6 computes signum for negative number") {
    assert(Chapter2.ch_2_1(-31231) == -1)
  }

  test("ch_1_6 computes signum for 1") {
    assert(Chapter2.ch_2_1(1) == 1)
  }
  test("ch_1_6 computes signum for positive number") {
    assert(Chapter2.ch_2_1(91) == 1)
  }

  test("ch_2_4 computes reverse range of 10 to 0") {
    val range = Chapter2.ch_2_4
    assert(range == Seq(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0))
  }

  test("ch_2_5 computes reverse range of 6 to 0") {
    val range = Chapter2.ch_2_5(6)
    assert(range == Seq(6, 5, 4, 3, 2, 1, 0))
  }

  test("ch_2_6 takes cumulative Unicode Product") {
    assert(Chapter2.ch_2_6("Hello") == BigInt(9415087488L))
  }

}
