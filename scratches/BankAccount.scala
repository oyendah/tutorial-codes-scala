class BankAccount {
  private var balance = 0

  def deposit(amount: Int): Int = {
    if (amount > 0) balance = balance + amount
    balance
  }

  def withdraw(amount: Int): Int =
    if (0 < amount && amount <= balance) {
      balance = balance - amount
      balance
    } else throw new Error("insufficient funds")
}
val account = new BankAccount
account deposit 50
account withdraw 20
account withdraw 15

val x = new BankAccount
val y = new BankAccount
x deposit 30
x withdraw 20
y deposit 20
y withdraw 20
for (i <- 1 until 3) { System.out.print(i + " ") }
for (i <- 1 until 3; j <- "abc") println(s"$i $j")
def factorial(n: Int): Int = {
  var result = 1
  var i = 1
  while (i <= n) {
    result = result * i
    i = i + 1
  }
  result
}
factorial(5)

val aliceAccount = new BankAccount
val bobAccount = new BankAccount
aliceAccount == bobAccount

case class Note(name: String, duration: String, octave: Int)

val c3 = Note("C", "Quarter", 3)
val cThree = Note("C", "Quarter", 3)
c3 == cThree
