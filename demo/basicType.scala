

@main def main() =
  val name = "harper"
  println(s"print $name")

  val sum = 1 + 2
  val sum1 = 1.+(2)

  println(s"sum: $sum, sum1: $sum1")

  val s: String = "hello world"

  val index1 = s.indexOf("o")

  val index2 = s `indexOf` "o"

  println(s"index1: $index1 index2: $index2")

  val s1 = "HeLLO World"

  // add () when have side effect, remove () when don't have side effect
  val suffixNotation = s1.toLowerCase()

  import scala.language.postfixOps
  val suffixNotation2 = s1 toLowerCase

  println(s"suffix: $suffixNotation, suffix2: $suffixNotation2")

  // should be true
  println("ta" + "ble" == "table")

