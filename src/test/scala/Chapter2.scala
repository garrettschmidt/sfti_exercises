import org.scalatest.FunSuite
import sfti.{Chapter1, Chapter2}

class Chapter2 extends FunSuite {

  test("ch_2_6 computes signum for zero") {
    assert(Chapter2.ch_2_1(0) == 0)
  }

  test("ch_2_6 computes signum for -1") {
    assert(Chapter2.ch_2_1(-1) == -1)
  }

  test("ch_2_6 computes signum for negative number") {
    assert(Chapter2.ch_2_1(-31231) == -1)
  }

  test("ch_2_6 computes signum for 1") {
    assert(Chapter2.ch_2_1(1) == 1)
  }
  test("ch_2_6 computes signum for positive number") {
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

  test("ch_2_6, ch_2_7, ch_2_8, ch_2_9 all compute equivalent values despite different impls.") {
    val goodbye = "Goodbye"
    Set(
      Chapter2.ch_2_6(goodbye),
      Chapter2.ch_2_7(goodbye),
      Chapter2.ch_2_8(goodbye),
      Chapter2.ch_2_9(goodbye),
    ).size == 1;
  }

  test("ch_2_10 computes x^n correctly with 2^1024") {
    assert(Chapter2.ch_2_10(2, 10) == 1024.0)
  }

  test("ch_2_10 computes x^n correctly with 2^0") {
    assert(Chapter2.ch_2_10(2, 0) == 1)
  }

  test("ch_2_10 computes x^n correctly with 2^1") {
    assert(Chapter2.ch_2_10(2, 1) == 2)
  }

}
