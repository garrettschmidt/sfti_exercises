package Chapter5

import Chapter5.ch_5_03_Time

// Reimplement the Time class from the preceding exercise so that the
// internal representation is the number of minutes since midnight.
// Do not change the public interface
class ch_5_04_Time {
  private var _minutes: Int = 0;

  def this(hours: Int, minutes: Int) {
    this()
    hours match {
      case it if ((it > 23) || (it < 0)) =>
        throw new IllegalArgumentException("Hours input must be in in the range [0, 23]")
      case _ =>
    }
    minutes match {
      case it if ((it > 59) || (it < 0)) =>
        throw new IllegalArgumentException("Minutes input must be in in the range [0, 59]")
      case _ => _minutes = minutes + (60 * hours)
    }
  }

  def before(other: ch_5_03_Time): Boolean = {
    _minutes < (other.minutes + (60 * other.hours))
  }

  def before(other: ch_5_04_Time): Boolean = {
    _minutes < other._minutes
  }
}