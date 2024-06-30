def reverseStr(s : String): String = {
    if(s.isEmpty) ""
    else reverseStr(s.tail) + s.head
}
//s.tail, which is the string without its first character
//s.head, First character of the string