package Chapter6

object ch_06_06_SuitEnum extends Enumeration {
  type Suit = Value
  val Club = Value("♣")
  val Diamond = Value("♦")
  val Heart = Value("♥")
  val Spade = Value("♠")
}
