package Chapter8
import ch_08_03_TypeDefs._

class ch_08_03_Circle(val c: Point2D, val radius: Double) extends ch_08_03_Shape[Point2D] {
  override def area(): Double = Math.pow(radius, 2) * Math.PI

  override def center(): Point2D = c

  override def distanceFromOrigin(): Double = distance(c, (0.0, 0.0))
}
