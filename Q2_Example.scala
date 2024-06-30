object StringFilter{
    def stringFilter(S: List[String]): List[String] = {
        S.filter(_.length > 5) 
    }

    def main(args : Array[String]): Unit = {
        val cars = List("Lamborgini", "BMW", "Konniseg", "Buggati", "Ferrari", "Mclaren", "Merzedes Benz")
        print(stringFilter(cars))
    }
}