def sumCalc(numbers: List[Int]): Int = {
    if (numbers.isEmpty) {
        0
    } else {
        numbers.head + sumCalc(numbers.tail)
    }
}