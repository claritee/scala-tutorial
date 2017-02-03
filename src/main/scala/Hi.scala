import org.joda.time.DateTime

class Hi {
  def sayHello(name: String = "<this is a default value>") {
    println(s"hello ${name}")
  }

  def multiply(i: Int): Int = {
    5 * i
  }

  // anonymous function
  val multiplyAgain = { i: Int=>
    println(s"Multiply ${i} * 7")
    i * 7
  }

  //unnamed paramter
  def adder(m: Int, n: Int) = m + n
  def anotherAdder = adder(2, _ :Int) // i.e. 2 + x

  // curried functions
  def mult(m: Int)(n: Int): Int = m * n
  val timesTwo = mult(2)_ //partially fill in one parameter
  val curriedAdd = (adder _).curried //curriedAdd: Int => (Int => Int) = <function1>
  val addTwo = curriedAdd(2)

  //variable length arguments
  def capitalizeAll(args: String*) = {
    args.map { arg =>
      arg.capitalize
    }
  }
}

object Hi extends App {
  val now = new DateTime()
  println("Hi SBT, the time is " + now.toString("hh:mm aa"))
  val hi = new Hi
  hi.sayHello()
  hi.sayHello("Sam")

  //anonymous function
  val addOne = (x: Int) => x + 1
  println(s"Output of addOne 2 + 1: ${addOne(2)}")

  println(s"Multiply 5 * 3: ${hi.multiply(3)}")
  hi.multiplyAgain //nothing
  hi.multiplyAgain(9)

  println(s"unnamed parameter: ${hi.anotherAdder(3)}")

  println("Curried functions")
  println(s"Calling directly: mult(2)(3): ${hi.mult(2)(3)}")
  println(s"Calling with partially filled in: timesTwo(3): ${hi.timesTwo(3)}")
  println(s"Calling adder with curried functions: addTwo(4): ${hi.addTwo(4)}")

  println("Variable length arguments")
  println(s"printing each variable: ${hi.capitalizeAll("one", "two", "three")}") //Seq[String] = ArrayBuffer(One, Two, Three)
}
