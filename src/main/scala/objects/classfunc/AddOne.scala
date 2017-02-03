package objects.classfunc

/*
Classes can also extend Function and those instances can be called with ().

=> A nice short-hand for extends Function1[Int, Int] is extends (Int => Int)
class AddOne extends (Int => Int) {
  def apply(m: Int): Int = m + 1
}
*/
class AddOne extends Function1[Int, Int] {
  def apply(m: Int): Int = m + 1
}

object AddOneApp extends App {

  val plusOne = new AddOne()
  println(plusOne) // function
}