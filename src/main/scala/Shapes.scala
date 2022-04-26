abstract class Shapes {
  def perimeter: Int
  def area: Int
}
class Square(a: Int) extends Shapes {
  override def perimeter: Int = a * 4
  override def area: Int = a * 2

}