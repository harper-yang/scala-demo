class ChecksumAccumulator:
  private var sum = 0

  def add(b: Byte): Unit =
    sum += b

  def checksum(): Int =
    ~(sum & 0xFF) + 1

object ChecksumAccumulator:

  private val cache = scala.collection.mutable.Map[String, Int]()

  def calculate(s: String): Int =
    if cache.contains(s) then
      cache(s)
    else
      val acc = new ChecksumAccumulator()
      for c <- s do
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs

@main def testChecksumAccumulator(): Unit =
  val acc = new ChecksumAccumulator()
  acc.add(1)
  acc.add(2)
  println(acc.checksum())
  println(ChecksumAccumulator.calculate("hello"))
