package objects.objectfunc

// A Function is a set of traits.
// Specifically, a function that takes one argument is an instance of a Function1 trait.
// This trait defines the apply() syntactic sugar we learned earlier, allowing you to call an object like you would a function.
// Methods defined standalone in the repl are Function* instances.
object addOne extends Function1[Int, Int] {
  def apply(m: Int): Int = m + 1
}

object AddOneFuncApp extends App {
  println(addOne(1)) // 2
}