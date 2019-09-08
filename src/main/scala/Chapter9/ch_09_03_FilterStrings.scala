package Chapter9

import java.io.PrintWriter

import Chapter9.ch_09_02_TabsToSpaces.tabsToSpacesHelper

import scala.io.Source

object ch_09_03_FilterStrings {
  def filterShortStrings(filePath: String, numSpaces: Int): Set[String] = {
    val lines = Source.fromFile(filePath, "UTF-8").getLines()
    filterStrings(lines)
  }

  def filterStrings(lines: Iterator[String]): Set[String] = {
    lines.map(_.split(" ")).flatMap(_.toSet).filter(_.size > 12).toSet
  }

}
