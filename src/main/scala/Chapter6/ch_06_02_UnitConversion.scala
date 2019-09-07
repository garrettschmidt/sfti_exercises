package Chapter6

abstract class ch_06_02_UnitConversion(val coeff: Double) {
  def convert(sourceUnit: Double) : Double = {
    sourceUnit * coeff
  }
}
