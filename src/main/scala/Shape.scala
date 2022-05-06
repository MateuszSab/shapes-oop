abstract class Shape {
  def perimeter: Double

  def area: Double
}

class Shapes {
  var shapesCollection = List.empty[Shape]

  def add(shape: Shape*) = {
    shapesCollection = shapesCollection ++ shape
    true
  }

  def sumAreas: Double = {
    shapesCollection.map(_.area).sum
  }

  def sumPerimeters: Double = {
    shapesCollection.map(_.perimeter).sum
  }
}

case class Square(a: Double) extends Shape {
  override def perimeter: Double = a * 4

  override def area: Double = a * 2
}

case class Rectangle(a: Double, b: Double) extends Shape {
  override def perimeter: Double = a * 2 + b * 2

  override def area: Double = a * b
}

case class Triangle(floor: Double, b: Double, c: Double) extends Shape {

  import scala.math._

  override def perimeter: Double = floor + b + c

  val p = (floor + b + c) / 2

  override def area: Double = sqrt(p * (p - floor) * (p - b) * (p - c))
}

case class Circle(radius: Double) extends Shape {

  import scala.math._

  override def perimeter: Double = (2 * Pi * radius)

  override def area: Double = (Pi * pow(radius, 2))
}