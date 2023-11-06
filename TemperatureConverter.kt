fun main() {
    println("Temperature Converter")
    println("1. Celsius to Fahrenheit")
    println("2. Fahrenheit to Celsius")
    print("Enter your choice (1/2): ")
    val choice = readln()
    
    if (choice == "1") {
        println("Enter temperature in Celsius: ")
        val celsius = readln().toDouble()
        
        if (celsius != null) {
            val fahrenheit = (celsius * 9/5) + 32
            println("$celsius°C is $fahrenheit°F")
        } else {
            println("Invalid input. Please enter a valid temperature.")
        }
    } else if (choice == "2") {
        println("Enter temperature in Fahrenheit: ")
        val fahrenheit = readln().toDouble()
        
        if (fahrenheit != null) {
            val celsius = (fahrenheit - 32) * 5/9
            println("$fahrenheit°F is $celsius°C")
        } else {
            println("Invalid input. Please enter a valid temperature.")
        }
    } else {
        println("Invalid choice. Please enter 1 or 2.")
    }
}
