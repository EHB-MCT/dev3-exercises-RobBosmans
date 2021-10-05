import kotlin.random.Random

fun main(){
    val array = arrayOf("rock", "paper", "scissors")
    val randomIndex = Random.nextInt(array.size);
    val randomElement = array[randomIndex]

    print("Your choice: ")
    val stringInput = readLine()!!
    //println("You entered: $stringInput")
    //println("Computer choice " + randomElement)

    if (randomElement == stringInput){
        println("try again")
    }

}