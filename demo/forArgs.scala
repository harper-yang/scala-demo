def m(args: String*) =
  for arg <- args do
    println(arg)

@main def n() =
  val greetStrings: Array[String] = new Array[String](3)
  greetStrings(0) = "hello "
  greetStrings(1) = "this "
  greetStrings(2) = "world\n"

  for i <- 0 to 2 do
    print(greetStrings(i))
