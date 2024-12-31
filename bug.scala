```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // This will throw an IndexOutOfBoundsException if list is empty
  println(list(list.size))
}
```