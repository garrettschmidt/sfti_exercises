
import org.scalatest.FunSuite
import Chapter5._

class Chapter5 extends FunSuite {
  test("ch_5_1 extends beyond Int.MaxValue") {
    val x = new ch_5_01_Counter()
    for (_ <- 0 to Int.MaxValue)
      x.increment()
    assert(x.current() > Int.MaxValue)
  }

  test("ch_5_2 manages balance across deposits, withdrawals") {
    val x = new ch_5_02_BankAccount()
    assert(x.balance == 0)
    x.deposit(7000)
    assert(x.balance == 7000)
    x.withdraw(2300)
    assert(x.balance == 4700)
  }

  test("ch_5_3 throws with illegal arguments") {
    assertThrows[IllegalArgumentException] { // Result type: Assertion
      new ch_5_03_Time(0, 60)
    }

    assertThrows[IllegalArgumentException] { // Result type: Assertion
      new ch_5_03_Time(24, 0)
    }

    assertThrows[IllegalArgumentException] { // Result type: Assertion
      new ch_5_03_Time(-1, 0)
    }

    assertThrows[IllegalArgumentException] { // Result type: Assertion
      new ch_5_03_Time(0, -1)
    }
  }
    test("ch_5_3 compares times correctly") {
    val x = new ch_5_03_Time(3, 59)
    val y = new ch_5_03_Time(4, 0)
    assert(x.before(y))
    assert(!y.before(x))
    assert(!x.before(x))
  }

  test("ch_5_4 compares times correctly") {
    val x = new ch_5_04_Time(3, 59)
    val y = new ch_5_04_Time(4, 0)
    assert(x.before(y))
    assert(!y.before(x))
    assert(!x.before(x))
  }

  test("ch_5_5 generates getters/setters") {
    val x = new ch_5_05_Student("Henry Hill", 12321)
    assert(x.getName.equals("Henry Hill"))
    assert(x.id == (12321))
  }

  test("ch_5_6 mutates age with properties correctly") {
    val x = new ch_5_06_Person(0)
    assert(x.age == 0)
    x.age = 17
    assert(x.age == 17)
    x.age = 3
    assert(x.age == 17)
    x.age = 18
    assert(x.age == 18)
  }

  test("ch_5_7 delimits first, last names") {
    val x = new ch_5_07_Person("Henry Hill")
    assert(x.firstName == "Henry")
    assert(x.lastName == "Hill")
  }

  test("ch_5_8 all varieties of constructors behave properly") {
    val c1 = new ch_5_08_Car("Ford", "Model T")
    assert(c1.manufacturer == "Ford")
    assert(c1.modelName == "Model T")
    assert(c1.modelYear == -1)
    assert(c1.licensePlate == "")

    val c2 = new ch_5_08_Car("Ford", "Model T", 1923);
    assert(c2.manufacturer == "Ford")
    assert(c2.modelName == "Model T")
    assert(c2.modelYear == 1923)
    assert(c2.licensePlate == "")

    val c3 = new ch_5_08_Car("Ford", "Model T", 1924, "HNRYMT");
    assert(c3.manufacturer == "Ford")
    assert(c3.modelName == "Model T")
    assert(c3.modelYear == 1924)
    assert(c3.licensePlate == "HNRYMT")

    val c4 = new ch_5_08_Car("Ford", "Model T", _licensePlate = "HNRYMT");
    assert(c4.manufacturer == "Ford")
    assert(c4.modelName == "Model T")
    assert(c4.modelYear == -1)
    assert(c4.licensePlate == "HNRYMT")
  }

  test("ch_5_10 all varieties of constructors behave properly") {
    val x = new ch_5_10_Employee()
    assert(x.name == "John Q. Public")
    assert(x.salary == BigDecimal(0.0))
  }
}
