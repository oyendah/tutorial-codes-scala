trait Animal {
  def fitness: Int
}

trait Reptile extends Animal

trait Mammal extends Animal

trait Zebra extends Mammal {
  def zebraCount: Int
}

trait Giraffe extends Mammal

def selection[A <: Animal](a1: A, a2: A): A =
  if (a1.fitness > a2.fitness) a1 else a2

trait Field[A] {
  def get: A // returns the animal that lives in this field
}

def size[A](xs: List[A]): Int =
  xs match {
    case Nil => 0

    case y :: ys => 1 + size(ys)
  }
size(Nil) //shouldBe 0
size(List(1, 2)) //shouldBe 2
size(List("a", "b", "c")) //shouldBe 3
