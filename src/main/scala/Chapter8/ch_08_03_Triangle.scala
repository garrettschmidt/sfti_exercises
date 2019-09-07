package Chapter8

import ch_08_03_TypeDefs._

class ch_08_03_Triangle(val a : Point2D,
                        val b : Point2D,
                        val c : Point2D) extends ch_08_03_Shape[Point2D] {

  override def area(): Double = distance(a, b) * distance(b, c) / 2.0d

  override def distanceFromOrigin(): Double = distance(centroid(), (0.0, 0.0))

  def centroid() : Point2D = {
    ((a._1 + b._1 + c._1) / 3.0d, (a._2 + b._2 + c._2) / 3.0d)
  }

  override def center(): Point2D = centroid()
}
