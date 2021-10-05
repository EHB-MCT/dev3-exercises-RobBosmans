fun main(){
    val array = arrayOf("yassin", "amin", "Tuur", "Cosima")
    println("hello world")
    for (friend in array){
        greet(friend)
    }
}
fun greet(friend: String){
    println("hello $friend")
}