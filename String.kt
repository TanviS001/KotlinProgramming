fun main(args:Array<String>) {
    val a: String = "Hello"
    val b: String = "My name is Android"
    val c: String = "             sjdb          "
    println(a.length)
    println(a.uppercase())
    println(a.lowercase())
    println(a.equals(b))
    println(a.plus(b))
    println(a.isEmpty())
    println(c.trim())
}


//  Output: 
/*
    5
    HELLO
    hello
    false
    HelloMy name is Android
    false
    sjdb
*/
