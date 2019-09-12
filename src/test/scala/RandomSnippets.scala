import RandomSnippets._
import com.google.gson.Gson
import org.scalatest.FunSuite
import org.scalatest._

class RandomSnippets extends FunSuite with Matchers {
  val gson = new Gson()

  test("Case class serializes properly with GSON") {
    val json = "{ \"name\": \"AAPL\", \"stockPrice\": 200.00, \"previousPrices\": [210.7, 199.6] }"
    val obj : ASerializableClass = gson.fromJson(json, classOf[ASerializableClass])
    obj.name shouldEqual "AAPL"
    obj.stockPrice shouldEqual 200.0
    obj.previousPrices shouldEqual Array(210.7, 199.6)
  }
}
