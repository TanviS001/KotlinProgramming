import kotlin.random.Random

fun main(args:Array<String>) {
    val randomNumber = Random.nextInt(0, 100)
    println("__GUESS THE NUMBER GAME__")
    println("_________________________")
    println("Can you Guess the number?")

    while(true){
        val guess:Int = readln().toInt()

        if(randomNumber==guess){
            println("Congrats! You got the number!")
            break
        }
        else if(randomNumber>guess){
            println("Go higher")
        }
        else{
            println("Go lower")
        }
    }
}
