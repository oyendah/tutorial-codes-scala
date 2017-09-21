
class Rational(n: Int, d:Int) {
  require(d > 0, "denominator must be positive")
  private val g = gcd(n, d)

  lazy val numerator: Int = n / g
  lazy val denominator: Int = d / g

  def this(n: Int) = this(n, 1)

  def max(that: Rational) =
    if (this.less(that)) that else this

  def less(that: Rational) =
    numerator * that.denominator < that.numerator * denominator

  def + (that: Rational) =
    new Rational(
      numerator * that.denominator + that.numerator * denominator,
      denominator * that.denominator
    )

  def - (that: Rational) =
    new Rational(
      numerator * that.denominator - that.numerator * denominator,
      denominator * that.denominator
    )

  def * (that:Rational):Rational=
    new Rational(numerator * that.numerator, denominator * that.denominator)

  def / (that:Rational):Rational=
    new Rational(numerator * that.denominator, that.numerator * denominator)

  override def toString = numerator + "/" + denominator

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}

def insertionSort[X](list: List[X])(implicit ord: Ordering[X]) = {
  def insert(list: List[X], value: X) = list.span(x => ord.lt(x, value)) match {
    case (lower, upper) => lower ::: value :: upper
  }

  list.foldLeft(List.empty[X])(insert)
}

val compareRationals: (Rational, Rational) => Int = (x, y) => {
  if (x less y) -1
  else if (y less x) 1
  else 0
}


implicit val rationalOrder: Ordering[Rational] =
  new Ordering[Rational] {
    def compare(x: Rational, y: Rational): Int = compareRationals(x, y)
  }

val half = new Rational(1, 2)
val third = new Rational(1, 3)
val fourth = new Rational(1, 4)
val rationals = List(third, half, fourth)
insertionSort(rationals)

lazy val x = {
  println("computing x")
  3
}

val y = {
  println("computing y")
  10
}

y + y
x + x