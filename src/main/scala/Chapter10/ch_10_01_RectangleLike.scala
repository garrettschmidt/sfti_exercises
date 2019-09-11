package Chapter10

trait ch_10_01_RectangleLike {
  this: java.awt.geom.Ellipse2D =>
  def translate(xOffset: Int, yOffset: Int) {
    setFrame(getX + xOffset, getY + yOffset, getWidth, getHeight)
  }

  def grow(plusX: Int, plusY: Int) {
    setFrame(getX, getY, getWidth + plusX, getHeight + plusY)
  }
}
