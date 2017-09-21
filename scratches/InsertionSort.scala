class Rational(x: Int, y: Int) {

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)

  lazy val numer: Int = x / g
  lazy val denom: Int = y / g
}

def insertionSort[X](list: List[X])(implicit ord: Ordering[X]) = {
  def insert(list: List[X], value: X) = list.span(x => ord.lt(x, value)) match {
    case (lower, upper) => lower ::: value :: upper
  }
  list.foldLeft(List.empty[X])(insert)
}

val nums = List(-5, 6, 3, 2, 7)
val fruits = List("apple", "pear", "orange", "pineapple")

insertionSort(nums)(Ordering.Int)
insertionSort(fruits)(Ordering.String)

//val compareRationals: (Rational, Rational) => Int =


//implicit val rationalOrder: Ordering[Rational] =
//  new Ordering[Rational] {
//    def compare(x: Rational, y: Rational): Int = compareRationals(x, y)
//  }

val half = new Rational(1, 2)
val third = new Rational(1, 3)
val fourth = new Rational(1, 4)
val rationals = List(third, half, fourth)
insertionSort(rationals) // shouldBe List(fourth, third, half)