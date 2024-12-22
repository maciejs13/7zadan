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