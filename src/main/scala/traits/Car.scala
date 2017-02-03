package traits

/**
  * Created by cltran on 03/02/2017.
  */
/*
traits are collections of fields and behaviors that you can extend or mixin to your classes.

When to use trait vs abstract class
- Favor using traits. It’s handy that a class can extend several traits; a class can extend only one class.
- If you need a constructor parameter, use an abstract class.
Abstract class constructors can take parameters; trait constructors can’t

*/
trait Car {
  val brand: String
}
