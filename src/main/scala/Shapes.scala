abstract class Shapes {
  def perimeter: Int
  def area: Int
}
class Square(a: Int) extends Shapes {
  override def perimeter: Int = a * 4
  override def area: Int = a * 2
}
class Rectangle(a: Int, b: Int) extends Shapes{
  override def perimeter: Int = a * 2 + b * 2
  override def area: Int = a * b
}
class Triangle(floor: Int, b: Int, c: Int) extends Shapes {
  import scala.math._
  override def perimeter: Int = floor + b + c
  val p = (floor + b + c) / 2
  override def area: Int = sqrt(p * (p - floor) * (p - b) * (p - c) ).toInt
}