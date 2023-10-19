fun main() {
    println("Simple Calculator")

    while (true) {
        print("Enter first number: ")
        val num1 = readLine()!!.toDouble()

        print("Enter operator (+, -, *, /): ")
        val operator = readLine()!!

        print("Enter second number: ")
        val num2 = readLine()!!.toDouble()

        val result = when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> if (num2 != 0.0) num1 / num2 else "Cannot divide by zero"
            else -> "Invalid operator"
        }

        println("Result: $result")

        print("Do you want to perform another calculation? (yes/no): ")
        val continueCalculation = readLine()!!

        if (continueCalculation.toLowerCase() != "yes") {
            break
        }
    }
}
