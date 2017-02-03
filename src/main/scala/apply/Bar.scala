package apply

class Bar {
  def apply() = 0
}

object Bar extends App {
  val bar = new Bar
  println(bar()) //0
}