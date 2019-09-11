package Chapter10

trait ch_10_04_CryptoLogger {
  def key = 3
  def encrypt(log: String) : String = {
    log.map((x: Char) => {
      val newChar = (x.toInt + key)
      if (newChar > 'Z') 'A' + (newChar - 'Z' - 1) else newChar
    }).map(_.asInstanceOf[Char])
      .mkString("")
  }
}
