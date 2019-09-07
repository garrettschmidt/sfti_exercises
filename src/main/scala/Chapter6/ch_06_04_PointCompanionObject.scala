package Chapter6

object ch_06_04_PointCompanionObject {
  def apply(x : Double, y : Double): ch_06_04_PointCompanionObject = ch_06_04_PointCompanionObject(x, y)
}

class ch_06_04_PointCompanionObject(val x: Double, val y : Double) {
}
