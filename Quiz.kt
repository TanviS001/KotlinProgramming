
data class Question(
    val question: String,
    val options: List<String>,
    val correctAnswer: Int
)

val questions = listOf(
    Question("What is the capital of France?", listOf("1. London", "2. Berlin", "3. Paris", "4. Madrid"), 3),
    Question("Which planet is known as the Red Planet?", listOf("1. Earth", "2. Mars", "3. Venus", "4. Jupiter"), 2),
    Question("Which is the deepest point in ocean?", listOf("1. Mariana trench", "2. Puerto Rico trench", "3. Philippine trench", "4. Tonga trench"), 1),
    Question("Which is the longest river in the world?", listOf("1. Amazon", "2. Nile", "3. Great Ganga", "4. Yangatse"), 2),
    Question("Which is the largest animal in the world?", listOf("1. Giraffe", "2. Tiger", "3. Elephant", "4. Blue Whale"), 4),
    Question("Which is the biggest continent in the world?", listOf("1. Asia", "2. North America", "3. Africa", "4. Antarctica"), 1),
    Question("Which is India’s first super computer?", listOf("1. Param8", "2. Param80", "3. Param800", "4. Param8000"), 4),
    Question("Which is largest island in the world?", listOf("1. New Guinea", "2. Hawaii", "3. Greenland", "4. Andaman Nicobar"), 3)
)

var score = 0

fun askQuestion(question: Question) {
    println(question.question)
    for (option in question.options) {
        println(option)
    }
    print("Enter the number of your answer: ")
    val userAnswer = readln().toInt()

    if (userAnswer != null && userAnswer == question.correctAnswer) {
        println("Correct!\n")
        score++
    } else {
        println("Wrong! The correct answer was: ${question.options[question.correctAnswer]}\n")
    }
}

fun main() {
    println("Welcome to the Quiz Game!")
    println("-------------------------------------")

    for (question in questions) {
        askQuestion(question)
    }

    println("Your final score is: $score out of ${questions.size}")
}
