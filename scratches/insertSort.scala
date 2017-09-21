/*def insertionSort(xs: List[Int]): List[Int] = {
  def insert(y: Int, ys: List[Int]): List[Int] =
    ys match {
      case List() => y :: List()
      case z :: zs =>
        if (y < z) y :: z :: zs
        else z :: insert(y, zs)
    }

  xs match {
    case List() => List()
    case y :: ys => insert(y, insertionSort(ys))
  }
}*/

/*def insertionSort[T](xs: List[T])(ord: Ordering[T]): List[T] = {
  def insert(y: Int, ys: List[Int]): List[Int] =
    ys match {
      case List() => y :: List()
      case z :: zs =>
        if (ord.lt(y, z)) y :: z :: zs
        else z :: insert(y, zs)
    }

  xs match {
    case List() => List()
    case y :: ys => insert(y, insertionSort(ys)(ord))
  }
}*/

/*def insertionSort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
  def insert(y: Int, ys: List[Int]): List[Int] =
    ys match {
      case List() => y :: List()
      case z :: zs =>
        if (ord.lt(y, z)) y :: z :: zs
        else z :: insert(y, zs)
    }

  xs match {
    case List() => List()
    case y :: ys => insert(y, insertionSort(ys))
  }
}*/
