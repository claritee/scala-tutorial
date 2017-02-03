package objects

//Objects are used to hold single instances of a class. Often used for factories.
//Classes and Objects can have the same name. The object is called a ‘Companion Object’.
// We commonly use Companion Objects for Factories.
object Timer {
  var count = 0

  def currentCount(): Long = {
    count += 1
    count
  }
}

object TimerApp extends App {
  println(Timer.currentCount()) //1
  println(Timer.currentCount()) //2
}