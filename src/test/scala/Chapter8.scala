import org.scalatest.FunSuite
import Chapter8._

import scala.collection.mutable.ArrayBuffer

class Chapter8 extends FunSuite {

  test("ch_08_05_Bundle computes price and description for a heterogeneous bundle") {
    val si1 = new ch_08_04_SimpleItem(BigDecimal(0.97), "Banana")
    val si2 = new ch_08_04_SimpleItem(BigDecimal(1.03), "Banana")
    val si3 = new ch_08_04_SimpleItem(BigDecimal(1.50), "Apple")

    val q = new ch_08_05_Bundle(ArrayBuffer(si1, si2, si3))
    assert(q.description() == "Apple -> 1, Banana -> 2")
    assert(q.price() == BigDecimal(3.50))
  }
}
