import Chapter9._

import org.scalatest.FunSuite

class Chapter9 extends FunSuite {

  test("ch_09_02_TabsToSpaces converts tabs to spaces") {
    val spaces = ch_09_02_TabsToSpaces.tabsToSpacesHelper("\t\t", 2)
    assert(spaces == "    ")
  }

  test("ch_09_03_TabsToSpaces converts tabs to spaces") {
    val strings = ch_09_03_FilterStrings.filterStrings(Seq("Pineapple", "Watermelon", "Itzakadoozie", "Itzakadoozie14").iterator)
    assert(strings == Set("Itzakadoozie14"))
  }
}
