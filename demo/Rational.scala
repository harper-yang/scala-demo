class Rational(n: Int, d: Int) {

  require(n != 0)

  private val g: Int = gcd(n, d)
  private val numer: Int = n / g
  private val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  override def toString: String = s"$numer / $denom"

  def +(that: Rational): Rational = {
    return Rational(numer * that.denom + denom * that.numer, denom * that.denom)
  }

  def +(i: Int): Rational = {
    Rational(numer + i * denom, denom)
  }

  def *(that: Rational): Rational = {
    return Rational(numer * that.numer, denom * that.denom)
  }

  def *(i: Int): Rational = {
    Rational(numer * i, denom)
  }

  def gcd(a: Int, b: Int): Int = {
    if b == 0 then a else gcd(b, a % b)
  }
}

extension (x: Int) {
  def +(y: Rational): Rational = Rational(x) + y
}

@main def main(): Unit = {
  val rational = Rational(10, 4)
  val res = Rational(10, 4) + Rational(3, 5)
  val res2 = Rational(10, 4) * Rational(3, 5)
  val res3 = Rational(10, 4) + 3
  val res4 = Rational(10, 4) * 3

  println(rational)
  println(res)
  println(res2)
  println(res3)
  println(res4)

  val res5 = 3 + Rational(10, 4)
  println(res5)
}
