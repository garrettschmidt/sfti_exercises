package Chapter5

// Write a class BankAccount with methods deposit and withdraw and
// a readonly property balance
class ch_5_02_BankAccount {
  private var _balance: Int = 0;

  def deposit(value: Int) {
    _balance += value
  }

  def withdraw(value: Int) {
    _balance -= value
  };

  def balance = _balance
}
