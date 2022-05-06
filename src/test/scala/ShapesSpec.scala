import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ShapesSpec extends AnyFlatSpec with should.Matchers {

  "Square(2)" should "return 8 for perimeter and 4 for area" in {
    val tomek = Square(2)
    tomek.perimeter shouldBe 8
    tomek.area shouldBe 4
  }

  "Rectangle(2, 3)" should "return 10 for perimeter and 6 for area" in {
    val dd = Rectangle(2, 3)
    dd.perimeter shouldBe 10
    dd.area shouldBe 6
  }

  "Triangle(10, 6, 6)" should "return 22 for perimeter and 16.583123951777 for area" in {
    val bb = Triangle(10, 6, 6)
    bb.perimeter shouldBe 22
    bb.area shouldBe 16.583123951777
  }

  "Square(4)" should "return 16 for perimeter and 8 for area" in {
    val aa = Square(4)
    aa.perimeter shouldBe 16.0
    aa.area shouldBe 8.0
  }
  "ShapesCollection" should "return true while adding a shape to collection" in {
    val box = new Shapes
    val aa = Square(4)
    box.add(aa) shouldBe true
  }

  it should "return 24.583123951777 for sumAreas and 38.0 for sumPerimeters" in {
    val box = new Shapes
    val aa = Square(4)
    val bb = Triangle(10, 6, 6)
    box.add(aa)
    box.add(bb)
    box.sumAreas shouldBe 24.583123951777
    box.sumPerimeters shouldBe 38.0
  }

}
