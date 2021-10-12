
fun main(){
    println("Welcome to Indiana Jones TM")
    challengeOne()
}

fun challengeOne(){
    println("Which animal is Dr Jones afraid of?")
    println("1. scorpions, 2. spiders, 3. snakes")
    val options = arrayOf("scorpions", "spiders", "snakes")
    println("Your choice: ")
    val userChoice = readLine()!!
    if (userChoice == options[2]){
        println("${options[2]} is correct")
        println("CORRECT")
    }
    else{
        gameOver()
    }
}

fun correct(){
    println("CORRECT")
}

fun gameOver(){
    println("GAME OVER")
}