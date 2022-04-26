abstract class Shapes {
  def perimeter: Double

  def area: Double
}

class ShapesCollection {
  var shapesCollection = List.empty[Shapes]

  def addToCollection(shape: Shapes) = {
    shapesCollection = shapesCollection :+ shape
    true
  }

  def sumAreas: Double = {
    shapesCollection.map(_.area).sum
  }

  def sumPerimeters: Double = {
    shapesCollection.map(_.perimeter).sum
  }
}

class Square(a: Double) extends Shapes {
  override def perimeter: Double = a * 4

  override def area: Double = a * 2
}

class Rectangle(a: Double, b: Double) extends Shapes {
  override def perimeter: Double = a * 2 + b * 2

  override def area: Double = a * b
}

class Triangle(floor: Double, b: Double, c: Double) extends Shapes {

  import scala.math._

  override def perimeter: Double = floor + b + c

  val p = (floor + b + c) / 2

  override def area: Double = sqrt(p * (p - floor) * (p - b) * (p - c))
}

class Circle(radius: Double) extends Shapes {

  import scala.math._

  override def perimeter: Double = (2 * Pi * radius)

  override def area: Double = (Pi * pow(radius, 2))
}