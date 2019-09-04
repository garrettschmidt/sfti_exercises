package Chapter5

// Write a class Time with read-only properties hours and minutes
// and a method before(other: Time): Boolean that checks whether this time
// comes before the other.  A Time object should be constructed as new Time(hrs, mins)
// where hrs is in military time format
class ch_5_03_Time {
  private var _hours: Int = 0;
  private var _minutes: Int = 0;

  def hours = _hours;

  def minutes = _minutes

  def this(hours: Int, minutes: Int) {
    this()
    hours match {
      case it if ((it > 23) || (it < 0)) =>
        throw new IllegalArgumentException("Hours input must be in in the range [0, 23]")
      case _ => _hours = hours
    }
    minutes match {
      case it if ((it > 59) || (it < 0)) =>
        throw new IllegalArgumentException("Minutes input must be in in the range [0, 59]")
      case _ => _minutes = minutes
    }
  }
  def minutesElapsed() = {
    hours * 60 + minutes
  }

  def before(other: ch_5_03_Time): Boolean = {
    this.minutesElapsed < other.minutesElapsed
  }
}