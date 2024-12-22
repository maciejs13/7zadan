data class Match(val score: Int)

class SportsResultsAnalyzer(private val matches: MutableList<Match>) {
    fun addMatch(score: Int) {
        matches.add(Match(score))
    }

    fun filterMatches(minScore: Int): List<Match> {
        return matches.filter { it.score >= minScore }
    }
}

