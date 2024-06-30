object SumCalc{
    def sumCalc(numbers : List[Int]) : Int = {
        if (numbers.isEmpty){
            0
        }
        else{
            numbers.head + sumCalc(numbers.tail)
        }
    }

    def main(args: Array[String]) : Unit = {
        val numbers = List(11, 52, 23, 34, 95)
        println(sumCalc(numbers))
    }
}