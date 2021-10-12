
fun main(){
    println("Welcome to Indiana Jones TM")
    challengeOne()
}

fun challengeOne(){
    println("Which animal is Dr Jones afraid of?")
    println("1. scorpions, 2. spiders, 3. snakes")

    val options = setOf<String>("scorpions", "spiders", "snakes")

    println("Your choice: ")
    val userChoice = readLine()!!

    if (options.contains(userChoice)){
        println("CORRECT")
        challengeTwo()
    }
    else{
        gameOver()
    }
}

fun challengeTwo(){
    val diceResult = (1..6).random()
    val userAnswer = readLine()

    if (userAnswer == "low"){
        if ((1..3).contains(diceResult)) {
            //Winner
        } else {
            gameOver()
        }
    } else {
        if((4..6).contains(diceResult)) {
            //Winner
        } else {
            gameOver()
        }
    }
}

fun gameOver(){
    println("GAME OVER")
}