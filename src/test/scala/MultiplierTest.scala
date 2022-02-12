
class MultiplierTest extends org.scalatest.funsuite.AnyFunSuite {
  private val mul = new Multiplier()

  test("multiplies ok") {
    assert(mul.mul(1, 5) == 5)
  }
}
