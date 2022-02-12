
class AdderTest extends org.scalatest.funsuite.AnyFunSuite {
  val adder = new Adder()

  test("adds ok") {
    assert(adder.add(2, 2) == 4)
  }
}
