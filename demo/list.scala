@main def list(): Unit =
  val arr = Array("hello", "nihao")

  val list = List(1, 2, 3)

  val newList = 4 :: list

  println(newList)

  val aList = 1 :: 2 :: 3 :: Nil
  println(aList)

  val pair = (99, "pocket")
  println(pair(0))

  import scala.collection.mutable
  val map = mutable.Map.empty[Int, String]
  map += (1 -> "first element")
  println(map(1))

  val immutableMap: Map[Int, String] = Map(
    1 -> "A",
    2 -> "B",
    3 -> "C",
  )

  println(immutableMap(3))

