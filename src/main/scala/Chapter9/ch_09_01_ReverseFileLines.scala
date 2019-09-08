package Chapter9

import java.io.PrintWriter

import scala.io.Source

object ch_09_01_ReverseFileLines {
  def reverse(filePath: String) = {
    val src = Source.fromFile(filePath, "UTF-8")
    val reversedLines = src.getLines().toArray.reverse.mkString("\n")
    val out = new PrintWriter("_reversed_" +filePath)
    out.write(reversedLines)
  }
}
