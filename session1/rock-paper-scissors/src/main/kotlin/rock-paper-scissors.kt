import kotlin.random.Random

fun main(){
    val array = arrayOf("rock", "paper", "scissors")
    val randomIndex = Random.nextInt(array.size);
    val computerChoice = array[randomIndex]

    println("Your choice: ")
    val userChoice = readLine()!!
    determineWinner(computerChoice, userChoice)
    println("computer choice was: $computerChoice")
}

fun determineWinner(computerChoice: String, userChoice: String?){
    if(computerChoice == userChoice){
        println("draw")
        return
    }

    val winMessage = "you won"
    val loseMessage = "you lost"

    when(computerChoice){
        "rock" -> if (userChoice == "paper") println(winMessage) else println(loseMessage)
        "paper" -> if (userChoice == "scissors") println(winMessage) else println(loseMessage)
        "scissors" -> if (userChoice == "rock") println(winMessage) else println(loseMessage)
    }
}