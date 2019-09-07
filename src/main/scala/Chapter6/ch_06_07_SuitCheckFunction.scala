package Chapter6

object ch_06_07_SuitCheckFunction {
  val redSuits = Set[ch_06_06_SuitEnum.Suit](ch_06_06_SuitEnum.Heart, ch_06_06_SuitEnum.Diamond);
  def isRedSuit(suit: ch_06_06_SuitEnum.Suit) : Boolean = {
    redSuits.contains(suit)
  }
}
