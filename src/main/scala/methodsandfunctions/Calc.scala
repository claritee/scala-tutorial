package methodsandfunctions

class Calc {
  var acc = 0
  def minc = { acc += 1 } // method
  val finc = { () => acc += 1 } //function
}

object Calc extends App {
  val calc = new Calc
  println(calc.minc) //()
  println(calc.finc) //<function0>
}

