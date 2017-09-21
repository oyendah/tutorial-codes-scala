val xs = Stream.cons(1, Stream.cons(2, Stream.empty))

var rec = 0
def streamRange(lo: Int, hi: Int): Stream[Int] = {
  rec = rec + 1
  if (lo >= hi) Stream.empty
  else Stream.cons(lo, streamRange(lo + 1, hi))
}
streamRange(1, 10).take(3).toList
rec

val builder = new StringBuilder

val x = { builder += 'x'; 1 }
lazy val y = { builder += 'y'; 2 }
def z = { builder += 'z'; 3 }

z + y + x + z + y + x

builder.result()

//def secondPrime(from: Int, to: Int) = nthPrime(from, to, 2)

//def nthPrime(from: Int, to: Int, n: Int): Int =
//  if (from >= to) throw new Error("no prime")
//  else if (isPrime(from))
//    if (n == 1) from else nthPrime(from + 1, to, n - 1)
//  else nthPrime(from + 1, to, n)

//val primes: Stream[Int] = 2 #:: Stream.from(3).filter { n => !primes.takeWhile(_ <= math.sqrt(n)).exists(n % _ == 0) }

//def isPrime(n: Int) = primes.dropWhile(_ < n).head == n
//def isPrime(n: Int): Boolean = ! ((2 until n-1) exists (n % _ == 0))

