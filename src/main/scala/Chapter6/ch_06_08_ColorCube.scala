package Chapter6

object ch_06_08_ColorCube extends Enumeration {
  type RGBColor = Value
  val WHITE = Value("0x000000")
  val RED = Value("0xFF0000")
  val GREEN = Value("0x00FF00")
  val BLUE = Value("0x0000FF")
  val PURPLE = Value("0xFF00FF")
  val YELLOW = Value("0xFFFF00")
  val CYAN = Value("0x00FFFF")
  val BLACK = Value("0xFFFFFF")
}
