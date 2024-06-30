object reverseString{
    def reverseStr(s : String): String = {
        if(s.isEmpty) ""
        else reverseStr(s.tail) + s.head
    }

    def main(args : Array[String]) : Unit = {
        print("Reversed String : ")
        print(reverseStr("Hello DJK"))
    }
}