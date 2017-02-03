package classes

class EvenMoreScientificCalculator(brand: String) extends ScientificCalculator(brand) {
  // method overloading
  def log(m: Int): Double = log(m, math.exp(1))
}