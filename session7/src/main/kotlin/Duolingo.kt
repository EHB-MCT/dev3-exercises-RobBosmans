class Duolingo {
    val words = mutableSetOf<Word>(
        Word("train", "trein", "en"),
        Word("car", "auto", "en"),
        Word("voiture", "auto", "fr"),
        Word("table", "tafel", "fr"),
        Word("plane", "vliegtuig", "en"),
        Word("avion", "vliegtuig", "fr"),
        Word("chair", "stoel", "en"),
        Word("ordinateur", "computer", "fr"),
        Word("train", "trein", "en"),
        Word("train", "trein", "en")
    )

    fun play(){
        println("Which language do you want to practice, fr or en?")
        val userLanguageChoice = readLine()

        val wordsSelection = words.shuffled().take(5).toMutableSet()
        while (wordsSelection.isNotEmpty()){
            val wordSelection = wordsSelection.random()
            println(wordSelection.original)
            val userAnswer = readLine()

            if (userAnswer == wordSelection.translated){
                wordsSelection.remove(wordSelection)
            }else {
                println(wordSelection.translated)
            }
            println(wordsSelection.count())
        }
    }
}