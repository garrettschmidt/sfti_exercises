package Chapter9

import java.io.PrintWriter

import scala.io.Source

object ch_09_02_TabsToSpaces {
  def whitespaceGen(n: Int) = {
    (for (_ <- 1 to n) yield ' ').mkString
  }

  def tabsToSpaces(filePath: String, numSpaces: Int) = {
    val src = Source.fromFile(filePath, "UTF-8")
    val raw = src.getLines().toArray.mkString("\n")
    val newContents = tabsToSpacesHelper(raw, numSpaces)
    val out = new PrintWriter(filePath)
    out.write(newContents)
  }

  def tabsToSpacesHelper(raw: String, numSpaces: Int) : String = {
    val whitespace = whitespaceGen(numSpaces)
    raw.replaceAll("\t", whitespace)
  }
}
