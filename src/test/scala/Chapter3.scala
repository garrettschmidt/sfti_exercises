import org.scalatest.FunSuite
import sfti.{Chapter2, Chapter3}

import scala.collection.mutable.ArrayBuffer

class Chapter3 extends FunSuite {


  test("ch_3_1 computes array of size 5") {
    val n = 5;
    val res = Chapter3.ch_3_1(n);
    // Should find a better way of testing uniform distribution here
    assert(res.max < n)
    assert(res.min >= 0)
    assert(res.length == 5)
  }

  test("ch_3_2 performs pairwise swap on array of odd size") {
    assert(Chapter3.ch_3_2(Array(1, 2, 3, 4, 5)).corresponds(Array(2, 1, 4, 3, 5)){_ == _})
  }

  test("ch_3_2 performs pairwise swap on array of even size") {
    assert(Chapter3.ch_3_2(Array(6, 5, 4, 3, 2, 1)).corresponds(Array(5, 6, 3, 4, 1, 2)){_ == _})
  }

  test("ch_3_3 performs pairwise swap on array of odd size") {
    assert(Chapter3.ch_3_3(Array(1, 2, 3, 4, 5)).corresponds(Array(2, 1, 4, 3, 5)){_ == _})
  }

  test("ch_3_3 performs pairwise swap on array of even size") {
    assert(Chapter3.ch_3_3(Array(6, 5, 4, 3, 2, 1)).corresponds(Array(5, 6, 3, 4, 1, 2)){_ == _})
  }

  test("ch_3_4 performs stable partition") {
    assert(Chapter3.ch_3_4(Array(0, 6, -17, 5, -1, 4, 3, -13, 2, 1)).corresponds(Array(6, 5, 4, 3, 2, 1, 0, -17, -1, -13)){_ == _})
  }

}
