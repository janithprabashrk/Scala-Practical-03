object AvgCalc{
    def avgCalc(a: Int, b:Int): Float = {
        val mean = (a + b) / 2.0
        "%.2f".format(mean).toFloat
    }

    def main (args : Array[String]): Unit = {
        print(avgCalc(11,123))
    }

}