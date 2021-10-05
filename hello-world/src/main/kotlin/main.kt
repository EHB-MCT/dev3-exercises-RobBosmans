val array = arrayOf<String>("yassin", "amin", "Tuur", "Cosima")

fun main(){
    println("hello world")
    greeting()
}

fun greeting(){
    for (element in array){
        println("hello " + element)
    }
}