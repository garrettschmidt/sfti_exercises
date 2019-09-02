package sfti

import scala.beans.BeanProperty

object Chapter5 {

  // Improve the Counter class in Section 5.1, "Simple Classes and
  // Parameterless Methods," on Page 55 so that it doesn't turn negative at
  // Int.MaxValue
  class ch_5_01_Counter {
    private var value: BigInt = 0;
    def increment() { value += 1}
    def current() = value;
  }

  // Write a class BankAccount with methods deposit and withdraw and
  // a readonly property balance
  class ch_5_02_BankAccount {
    private var _balance: Int = 0;
    def deposit(value: Int) { _balance += value}
    def withdraw(value: Int) { _balance -= value };
    def balance = _balance
  }

  // Write a class Time with read-only properties hours and minutes
  // and a method before(other: Time): Boolean that checks whether this time
  // comes before the other.  A Time object should be constructed as new Time(hrs, mins)
  // where hrs is in military time format
  class ch_5_03_Time {
    private var _hours : Int = 0;
    private var _minutes : Int = 0;

    def hours = _hours;
    def minutes = _minutes

    def this(hours: Int, minutes: Int){
      this()
      hours match {
        case it if ((it > 23) || (it < 0)) =>
          throw new IllegalArgumentException("Hours input must be in in the range [0, 23]")
      }
      minutes match {
        case it if ((it > 59) || (it < 0)) =>
          throw new IllegalArgumentException("Minutes input must be in in the range [0, 59]")
      }
      _hours = hours
      _minutes = minutes
    }

    def before(other: ch_5_03_Time) : Boolean = {
      _hours < other._hours && _minutes < other._minutes
    }
  }

  // Reimplement the Time class from the preceding exercise so that the
  // internal representation is the number of minutes since midnight.
  // Do not change the public interface
  class ch_5_04_Time {
    private var _minutes : Int = 0;

    def this(hours: Int, minutes: Int){
      this()
      hours match {
        case it if ((it > 23) || (it < 0)) =>
          throw new IllegalArgumentException("Hours input must be in in the range [0, 23]")
      }
      minutes match {
        case it if ((it > 59) || (it < 0)) =>
          throw new IllegalArgumentException("Minutes input must be in in the range [0, 59]")
      }
      _minutes = minutes + (60 * hours)
    }

    def before(other: ch_5_03_Time) : Boolean = {
      _minutes < (other.minutes + (60 * other.hours))
    }

    def before(other: ch_5_04_Time) : Boolean = {
      _minutes < other._minutes
    }
  }

  // Make a class Student with read-write JavaBeans properties name (of type String)
  // and id (of type Long).  What methods are generated?
  class ch_5_05_Student(@BeanProperty var name: String, @BeanProperty var id: Long) {
  }

  // In the Person class, provide a primary constructor that turns negative ages to 0.
  class ch_5_06_Person(private var privateAge: Int) {
    privateAge = Math.max(privateAge, 0)
    def age = privateAge
    def age_=(newValue: Int): Unit = {
      if (newValue > privateAge) privateAge = newValue
    }
  }
}
