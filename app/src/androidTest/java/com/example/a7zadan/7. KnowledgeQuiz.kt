interface Question {
    fun askQuestion(): String
    fun checkAnswer(answer: String): Boolean
}

class MultipleChoiceQuestion(
    private val questionText: String,
    private val options: List<String>,
    private val correctAnswer: String
) : Question {
    override fun askQuestion(): String {
        return "$questionText\nOpcje: ${options.joinToString(", ")}"
    }

    override fun checkAnswer(answer: String): Boolean {
        return answer.equals(correctAnswer, ignoreCase = true)
    }
}

class TrueFalseQuestion(
    private val questionText: String,
    private val correctAnswer: Boolean
) : Question {
    override fun askQuestion(): String {
        return "$questionText (Prawda/Fałsz)"
    }

    override fun checkAnswer(answer: String): Boolean {
        return answer.equals("Prawda", ignoreCase = true) == correctAnswer
    }
}

fun main() {
    val questions = listOf(
        MultipleChoiceQuestion("Co jest stolicą Polski?", listOf("Warszawa", "Berlin", "Praga"), "Warszawa"),
        TrueFalseQuestion("Czy Kotlin jest językiem programowania?", true),
        MultipleChoiceQuestion("2 + 2 to:", listOf("3", "4", "5"), "4")
    )

    var correctAnswers = 0

    for (question in questions) {
        println(question.askQuestion())
        val userAnswer = readln()
        if (question.checkAnswer(userAnswer)) {
            println("Poprawna odpowiedź!")
            correctAnswers++
        } else {
            println("Niepoprawna odpowiedź.")
        }
    }

    println("Twój wynik: $correctAnswers/${questions.size}")
}
