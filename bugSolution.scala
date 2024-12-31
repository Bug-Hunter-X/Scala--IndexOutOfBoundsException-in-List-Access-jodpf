```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Safe way to access the last element
  list.lastOption match {
    case Some(lastElement) => println(s"Last element: $lastElement")
    case None => println("List is empty")
  }

  //Or handle potential exception using try-catch block
  try{
    println(list(list.size))
  } catch {
    case e: IndexOutOfBoundsException => println("Exception caught: "+ e.getMessage)
  }
}
```