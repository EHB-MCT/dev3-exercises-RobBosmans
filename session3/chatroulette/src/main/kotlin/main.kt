import kotlin.random.Random

fun main(){
    val persons = arrayOf(Person("Bert"), Person("Jack"))

    persons.random().introduce()
}