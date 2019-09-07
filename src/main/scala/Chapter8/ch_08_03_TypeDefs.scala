package Chapter8
import math.{ sqrt, pow }


object ch_08_03_TypeDefs {
  type Point2D = (Double, Double)
  def distance(x: Point2D, y: Point2D): Double =
    sqrt(pow(x._1 - y._1, 2) + pow(x._2 - x._2, 2))
}
