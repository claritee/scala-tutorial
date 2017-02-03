class Calculator {

  val brand: String = "HP"

  def add(m: Int, n: Int): Int = m + n
}

object Class extends App {
  val calc = new Calculator
  println(s"calc.add(1, 2): ${calc.add(1, 2)}")
  println(s"calc.brand: ${calc.brand}")
}