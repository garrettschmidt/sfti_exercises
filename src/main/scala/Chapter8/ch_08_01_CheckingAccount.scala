package Chapter8

class ch_08_01_CheckingAccount(initialBalance: Double, val activityFee: Double) extends ch_08_01_BankAccount(initialBalance) {
  override def deposit(amount: Double): Double = {
    super.deposit(amount)
    super.withdraw(Math.abs(activityFee))
  }

  override def withdraw(amount: Double): Double = {
    super.withdraw(amount)
    super.withdraw(Math.abs(activityFee))
  }
}
