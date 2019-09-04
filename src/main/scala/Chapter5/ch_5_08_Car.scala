package Chapter5

// Make a class Car with read-only properties for manufacturer, model name,
// and model year, and a read-write property for the license plate.  Supply
// four constructors.  All require the manufacturer and model name.  Optionally,
// model year and license plate can also be specified in the constructor.  If not,
// the model year is set to -1 and the license plate to the empty string.
class ch_5_08_Car(private val _manufacturer: String,
                  private val _modelName: String,
                  private val _modelYear: Int = -1,
                  private var _licensePlate: String = "") {
  def manufacturer = _manufacturer;

  def modelName = _modelName

  def modelYear = _modelYear

  def licensePlate = _licensePlate

  def licensePlate_=(newValue: String): Unit = {
    _licensePlate = newValue
  }
}