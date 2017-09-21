package foopkg

trait CanFoo[A] {
  def foos(x: A): String
}

object CanFoo {
  implicit val importIntFoo = new CanFoo[Int] {
    def foos(x: Int) = "importIntFoo:" + x.toString
  }
}

//object Main {
//  def test(): String = {
//    implicit val localIntFoo = new CanFoo[Int] {
//      def foos(x: Int) = "localIntFoo:" + x.toString
//    }
//    import Def.importIntFoo
//
//    foo(1)
//  }
//}

object foopkg {
  def foo[A:CanFoo](x: A): String = implicitly[CanFoo[A]].foos(x)
}

//println(Main. test)
