
data class Question(
    val question: String,
    val options: List<String>,
    val correctAnswer: Int
)

val questions = listOf(
    Question("What is the capital of France?", listOf("1. London", "2. Berlin", "3. Paris", "4. Madrid"), 3),
    Question("Which planet is known as the Red Planet?", listOf("1. Earth", "2. Mars", "3. Venus", "4. Jupiter"), 2),
    // Add more questions here
)

var score = 0

fun askQuestion(question: Question) {
    println(question.question)
    for (option in question.options) {
        println(option)
    }
    print("Enter the number of your answer: ")
    val userAnswer = readLine()?.toIntOrNull()

    if (userAnswer != null && userAnswer == question.correctAnswer) {
        println("Correct!\n")
        score++
    } else {
        println("Wrong! The correct answer was: ${question.options[question.correctAnswer]}\n")
    }
}

fun main() {
    println("Welcome to the Quiz Game!")

    for (question in questions) {
        askQuestion(question)
    }

    println("Your final score is: $score out of ${questions.size}")
}
