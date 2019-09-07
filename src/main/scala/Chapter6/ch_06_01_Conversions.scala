package Chapter6

// Write an object Conversions with methods inchesToCentimeters,
// gallonsToLiters, and milesToKilometers
object ch_06_01_Conversions {

  def inchesToCentimeters(inches: Double) : Double = {
    inches * 2.54d
  }

  def gallonsToLiters(gallons: Double) : Double = {
    gallons * 3.78541
  }

  def milesToKilometers(miles: Double) : Double = {
    miles * 1.60934
  }
}
