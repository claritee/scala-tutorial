package objects

class Bar(foo: String)

object Bar {
  def apply(foo: String) = new Bar(foo)
}