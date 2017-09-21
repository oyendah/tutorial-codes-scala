class MyClass(number: Int, text: String) {

  private val classSecret = 42

  def x = MyClass.objectSecret + "?" // MyClass.objectSecret is accessible because it's inside the class. External classes/objects can't access it
}

object MyClass { // it's a companion object because it has the same name
  private val objectSecret = "42"

  def y(arg: MyClass) = arg.classSecret -1 // arg.classSecret is accessible because it's inside the companion object
}

//MyClass.y(list())//.objecttSecret // won't compile
//MyClass.classSecret // won't compile

new MyClass(-1, "random")//.objectSecret // won't compile
new MyClass(-1, "random").x//.classSecret // won't compile

def func(): Int = {
  println("computing stuff....")
  42 // return something
}

def callByValue(x: Int) = {
  println("1st x: " + x)
  println("2nd x: " + x)
}

def callByName(x: => Int) = {
  println("1st x: " + x)
  println("2nd x: " + x)
}

//func()
callByValue(func())
callByName(func())