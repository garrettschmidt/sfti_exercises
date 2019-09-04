package Chapter5

// Improve the Counter class in Section 5.1, "Simple Classes and
// Parameterless Methods," on Page 55 so that it doesn't turn negative at
// Int.MaxValue
class ch_5_01_Counter {
  private var value: Long = 0;

  def increment() {
    value += 1
  }

  def current() = value;
}