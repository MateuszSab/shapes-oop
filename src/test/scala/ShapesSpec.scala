import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ShapesSpec  extends AnyFlatSpec with should.Matchers {

  "Square" should "return 8 for perimeter and 4 for area" in {
    val tomek = new Square(2)
    tomek.perimeter shouldBe 8
    tomek.area shouldBe 4
  }

  "Rectangle" should "return 10 for perimeter and 6 for area" in{
    val miś = new Rectangle(2, 3)
    miś.perimeter shouldBe 10
    miś.area shouldBe 6
  }

  "Triangle" should " " in {
    val krzyś = new Triangle(10, 6, 6)
    krzyś.perimeter shouldBe 22
    krzyś.area shouldBe 16
  }
}
