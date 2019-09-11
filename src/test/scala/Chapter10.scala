import java.awt.geom.Ellipse2D

import org.scalatest.FunSuite
import Chapter10._

class Chapter10 extends FunSuite {
  test("ch_10_1") {
    val egg = new Ellipse2D.Double(5, 10, 20, 30) with ch_10_01_RectangleLike
    egg.translate(10, -10)
    assert(egg.x == 15)
    assert(egg.y == 0)
    assert(egg.width == 20)
    assert(egg.height == 30)

    egg.grow(10, 20)
    assert(egg.width == 30)
    assert(egg.height == 50)
  }

  test("ch_10_2 should indicate point equivalence") {
    val p1 = new ch_10_02_OrderedPoint(3, 4)
    val p2 = new ch_10_02_OrderedPoint(3, 4)
    assert( (p1 <=> p2) == 0)
  }

  test("ch_10_2 should indicate p1 < p2 when p1.x < p2.x") {
    val p1 = new ch_10_02_OrderedPoint(2, 4)
    val p2 = new ch_10_02_OrderedPoint(3, 4)
    assert( (p1 <=> p2) == -1)
  }

  test("ch_10_2 should indicate p1 < p2 when p1.y < p2.y") {
    val p1 = new ch_10_02_OrderedPoint(3, 3)
    val p2 = new ch_10_02_OrderedPoint(3, 4)
    assert( (p1 <=> p2) == -1)
  }

  test("ch_10_2 should indicate p1 > p2 when p1.y > p2.y") {
    val p1 = new ch_10_02_OrderedPoint(3, 5)
    val p2 = new ch_10_02_OrderedPoint(3, 4)
    assert( (p1 <=> p2) == 1)
  }

  test("ch_10_4 should perform Caesar cipher with default key") {
    val logMsg = "AZ"
    val z = new {} with ch_10_04_CryptoLogger {}
    val encrypted = z.encrypt(logMsg)
    assert(encrypted == "DC")
  }

  test("ch_10_4 should perform Caesar cipher with overridden key") {
    val logMsg = "AW"
    val z = new {} with ch_10_04_CryptoLogger {
      override def key = 2
    }
    val encrypted = z.encrypt(logMsg)
    assert(encrypted == "CY")
  }
}