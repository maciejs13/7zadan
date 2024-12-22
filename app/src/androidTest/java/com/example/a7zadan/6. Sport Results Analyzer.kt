data class Match(val score: Int)

class SportsResultsAnalyzer(private val matches: MutableList<Match>) {
    fun addMatch(score: Int) {
        matches.add(Match(score))
    }
}