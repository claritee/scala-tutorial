package classes

class Calculator(brand: String) {

  val color: String = if (brand == "TI") {
    "blue"
  } else if (brand == "HP") {
    "black"
  } else {
    "white"
  }

  def add(m: Int, n: Int): Int = m + n
}

object Class extends App {
  val calc = new Calculator("HP")
  println(s"calc.add(1, 2): ${calc.add(1, 2)}")
  println(s"calc.color: ${calc.color}")
}