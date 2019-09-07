package Chapter8

import scala.collection.mutable

class ch_08_05_Bundle(_items: mutable.ArrayBuffer[ch_08_04_Item]) extends ch_08_04_Item {
  val items = _items.clone()

  override def price(): BigDecimal = {
    items.map(_.price()).foldLeft(BigDecimal(0.0)){ (a, b) => a + b }
  }

  override def description(): String = {
    val counts : mutable.Map[String, Int]  = mutable.Map[String, Int]()
    items.foreach( x => {
      counts(x.description) = counts.getOrElse(x.description, 0) + 1;
    })
    counts.mkString(", ")
  }

}
