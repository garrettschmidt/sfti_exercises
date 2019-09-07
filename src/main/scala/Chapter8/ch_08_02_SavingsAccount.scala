package Chapter8

class ch_08_02_SavingsAccount(initialBalance: Double,
                              val activityFee: Double,
                              var freeActivitiesPerMonth: Int,
                              val monthlyInterestPercent: Double)
  extends ch_08_01_BankAccount(initialBalance) {

  var freeActivityCount = freeActivitiesPerMonth

  override def deposit(amount: Double): Double = {
    super.deposit(amount)
    if (freeActivityCount > 0)
      super.withdraw(Math.abs(activityFee))
    freeActivityCount -= 1
    currentBalance
  }

  override def withdraw(amount: Double): Double = {
    super.withdraw(amount)
    if (freeActivityCount > 0)
      super.withdraw(Math.abs(activityFee))
    freeActivityCount -= 1
    currentBalance
  }

  def earnMonthlyInterest() = {
    super.deposit(super.currentBalance * monthlyInterestPercent)
    freeActivityCount = freeActivitiesPerMonth
  }
}
