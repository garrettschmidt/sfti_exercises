package sfti

import java.util
import java.util.Scanner

import scala.collection.{SortedMap, mutable}
import scala.collection.JavaConverters._

object Chapter4 {

  // Set up a map of prices for a number of gizmos that you covet.
  // Then produce a second map with the same keys and the prices at a 10 percent
  // discount
  def ch_4_1(prices: Map[String, BigDecimal]) : Map[String, BigDecimal] = {
    prices.map(x => x._1 -> (x._2 * 0.90 ))
  }

  // Write a program that reads words from a file.  Use a mutable map to count
  // how often each word appears.
  def ch_4_2(filepath: String) : Map[String, Int] = {
    val in = new Scanner(new java.io.File(filepath));
    val res = mutable.Map[String, Int]()
    while (in.hasNext) {
      val token = in.next()
      res(token) = res.getOrElse(token, 0) + 1;
    }
    res.toMap
  }

  // Repeat the preceding exercise with an immutable map.
  def ch_4_3(filepath: String) : Map[String, Int] = {
    val in = new Scanner(new java.io.File(filepath));
    var res = Map[String, Int]()
    while (in.hasNext) {
      val token = in.next()
      res = res + (token -> (res.getOrElse(token, 0) + 1) );
    }
    res
  }

  // Repeat the preceding exercise with a sorted map
  def ch_4_4(filepath: String) : SortedMap[String, Int] = {
    val in = new Scanner(new java.io.File(filepath));
    var res = SortedMap[String, Int]()
    while (in.hasNext) {
      val token = in.next()
      res = res + (token -> (res.getOrElse(token, 0) + 1) );
    }
    res
  }

  // Repeat the preceding exercise with a java.util.TreeMap that you adapt to
  // the Scala API
  def ch_4_5(filepath: String) : SortedMap[String, Int] = {
    val in = new Scanner(new java.io.File(filepath));
    val res = new util.TreeMap[String, Int]()
    while (in.hasNext) {
      val token = in.next()
      if (res.containsKey(token)) {
        res.put(token, res.get(token)+1);
      } else {
        res.put(token, 1);
      }
    }
    res.asScala.toMap.to(collection.immutable.TreeMap)
  }

  // Define a linked hash map that maps weekday names to java.util.calendar names
  def ch_4_6() : mutable.LinkedHashMap[String, Int] = {
    mutable.LinkedHashMap[String, Int](
      "Sunday" -> java.util.Calendar.SUNDAY,
      "Monday" -> java.util.Calendar.MONDAY,
      "Tuesday" -> java.util.Calendar.TUESDAY,
      "Wednesday" -> java.util.Calendar.WEDNESDAY,
      "Thursday" -> java.util.Calendar.THURSDAY,
      "Friday" -> java.util.Calendar.FRIDAY,
      "Saturday" -> java.util.Calendar.SATURDAY)
  }

  // Print a table of all Java properties reported by the getProperties method of the
  // java.lang.System class
  def whitespaceGen(n: Int) = {
    (for (_ <- 1 to n) yield ' ').mkString
  }

  // Print a table of all Java properties reported by the getProperties method of the java.lang.System
  // class
  def ch_4_7() : mutable.Map[String, String] = {
    val props: mutable.Map[String, String] = java.lang.System.getProperties.asScala
    val strMaxLength: (String) => Int = (str) => str.length
    val maxKeyLength: Int = props.keys.maxBy(strMaxLength).length
    val keyBufSize: Int = 10
    val lineBufSize: Int = maxKeyLength + keyBufSize
    props.map(x => {
      val padding = whitespaceGen(lineBufSize - x._1.length)
      (x._1 + padding, x._2)
    });
  }

  // Write a function minmax that returns a pair containing the smallest and largest
  // values in the array.
  def ch_4_8(a: Array[Int]): (Int, Int) = {
    var min = Int.MaxValue;
    var max = Int.MinValue;
    a.foreach(x => {
      min = Math.min(x, min)
      max = Math.max(x, max)
    })
    (min, max)
  }

  // Write a function minmax that returns a pair containing the smallest and largest
  // values in the array.
  def ch_4_9(a: Array[Int], v: Int): (Int, Int, Int) = {
    var lt = 0;
    var eqt = 0;
    var gt = 0;
    a.foreach(x => {
      lt += (if (x < v) 1 else 0)
      eqt += (if (x == v) 1 else 0)
      gt += (if (x > v) 1 else 0)
    })
    (lt, eqt, gt)
  }

}
