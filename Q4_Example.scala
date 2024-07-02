object SumCalc {
  def sumCalc(numbers: List[Int]): Int = {
    if (numbers.isEmpty) {
      0
    } else if (numbers.head % 2 == 0) {
      numbers.head + sumCalc(numbers.tail)
    } else {
      sumCalc(numbers.tail)
    }
  }

  def main(args: Array[String]): Unit = {
    val numbers = List(11, 52, 23, 34, 95)
    println(sumCalc(numbers))
  }
}
