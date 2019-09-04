package Chapter5

// In the Person class, provide a primary constructor that turns negative ages to 0.
class ch_5_06_Person(private var privateAge: Int) {
  privateAge = Math.max(privateAge, 0)

  def age = privateAge

  def age_=(newValue: Int): Unit = {
    if (newValue > privateAge) privateAge = newValue
  }
}