import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ShapesSpec  extends AnyFlatSpec with should.Matchers {

  "Square(2)" should "return 8 for perimeter and 4 for area" in {
    val tomek = new Square(2)
    tomek.perimeter shouldBe 8
    tomek.area shouldBe 4
  }

  "Rectangle(2, 3)" should "return 10 for perimeter and 6 for area" in{
    val dd = new Rectangle(2, 3)
    dd.perimeter shouldBe 10
    dd.area shouldBe 6
  }

  "Triangle(10, 6, 6)" should "return 22 for perimeter and 16.583123951777 for area" in {
    val bb = new Triangle(10, 6, 6)
    bb.perimeter shouldBe 22
    bb.area shouldBe 16.583123951777
  }

  "Square(4)" should "return 16 for perimeter and 8 for area" in {
    val aa = new Square(4)
    aa.perimeter shouldBe 16.0
    aa.area shouldBe 8.0
  }
}
