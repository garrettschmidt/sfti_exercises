import org.scalatest.FunSuite
import sfti.Chapter4

import scala.collection.mutable

class Chapter4 extends FunSuite {

  val wordsFile = "./src/test/scala/ch4.txt"

  test("ch_4_1 discounted prices correctly") {
    val adjustedPrices = Chapter4.ch_4_1(Map("shoes"-> BigDecimal(100.00), "bubblegum" -> BigDecimal(0.90)))
    assert(adjustedPrices.equals(Map("shoes"-> BigDecimal(90.00), "bubblegum" -> BigDecimal(0.81))))
  }

  test("ch_4_2 computes word counts correctly") {
    val res = Chapter4.ch_4_2(wordsFile);
    assert(res.equals(Map("bubblegum" -> 1,
      "apple" -> 2, "orange" -> 1, "sushi" -> 1, "shoes" -> 1)))
  }

  test("ch_4_3 computes word counts correctly") {
    val res = Chapter4.ch_4_3(wordsFile);
    assert(res.equals(Map("bubblegum" -> 1,
      "apple" -> 2, "orange" -> 1, "sushi" -> 1, "shoes" -> 1)))
  }

  test("ch_4_4 computes word counts correctly") {
    val res = Chapter4.ch_4_4(wordsFile);
    assert(res.equals(mutable.SortedMap("bubblegum" -> 1,
      "apple" -> 2, "orange" -> 1, "sushi" -> 1, "shoes" -> 1)))
  }

  test("ch_4_5 computes word counts correctly") {
    val res = Chapter4.ch_4_5(wordsFile);
    assert(res.equals(mutable.SortedMap("bubblegum" -> 1,
      "apple" -> 2, "orange" -> 1, "sushi" -> 1, "shoes" -> 1)))
  }

  test("ch_4_6 returns days of the week mapping in order") {
    assert(Chapter4.ch_4_6.equals(mutable.LinkedHashMap[String, Int](
      "Sunday" -> java.util.Calendar.SUNDAY,
      "Monday" -> java.util.Calendar.MONDAY,
      "Tuesday" -> java.util.Calendar.TUESDAY,
      "Wednesday" -> java.util.Calendar.WEDNESDAY,
      "Thursday" -> java.util.Calendar.THURSDAY,
      "Friday" -> java.util.Calendar.FRIDAY,
      "Saturday" -> java.util.Calendar.SATURDAY)))
  }

  test("ch_4_7 returns keys of all the same size (for line padding consistency)") {
    val props = Chapter4.ch_4_7()
    assert(props.keys.map(_.size).toSet.size == 1)
    props.foreach(x => println(x._1 + " | " + x._2))
  }

  test("ch_4_8 returns minmax of array") {
    assert(Chapter4.ch_4_8(Array(3, 1312, -231, 3, 5, 6, 98)) == ((-231, 1312)))
  }

  test("ch_4_9 comparator counts") {
    assert(Chapter4.ch_4_9(Array(3, 1312, -231, 3, 5, 6, 98), 3) == (1, 2, 4))
  }
}
