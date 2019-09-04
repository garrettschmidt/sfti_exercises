package Chapter5

// Write a class Person with a primary constructor that accepts a string
// containing a first name, a space, and a last name, such as new Person("Fred Smith").
// Should the primary constructor parameter be a var, val, or a plain parameter? Why?
class ch_5_07_Person(fullName: String) {
  // fullName is a plain param because it's derived values (first, last) are
  // captured in members, not fullName itself
  // See: https://stackoverflow.com/questions/17211077/scala-local-variable-inside-primary-constructor
  val (firstName, lastName) = {
    val firstLastAsArr = fullName.trim.split(" ")
    (firstLastAsArr(0), firstLastAsArr(1))
  }
}

