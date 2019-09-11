package Chapter10

import java.awt.Point
import scala.math.Ordering.Implicits._

class ch_10_02_OrderedPoint(x: Int, y: Int) extends java.awt.Point(x, y) with scala.math.Ordered[Point] {
  def <=>(that: Point): Int = {
    val left = (this.x, this.y)
    val right = (that.x, that.y)
    Seq[(Boolean, Int)]((left < right, -1),
    (left == right, 0),
    (left > right, 1))
      .find(_._1)
      .map(_._2).getOrElse(0)
  }
  def compare(that: Point): Int = {
    this.<=>(that)
  }
}
