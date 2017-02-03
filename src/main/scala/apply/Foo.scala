package apply

//apply methods give you a nice syntactic sugar for when a class or object has one main use.
class Foo {}

object FooMaker {
  def apply() = new Foo
}

object Foo extends App {
  val newFoo = FooMaker()
  println(newFoo) //new Foo
}