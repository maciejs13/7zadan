data class Match(val score: Int)

class SportsResultsAnalyzer(private val matches: MutableList<Match>) {
    fun addMatch(score: Int) {
        matches.add(Match(score))
    }

    fun filterMatches(minScore: Int): List<Match> {
        return matches.filter { it.score >= minScore }
    }

    fun addBonusPoints(points: Int) {
        matches.forEach { it.score += points }
    }

    fun sumScores(): Int {
        return matches.sumOf { it.score }
    }

    fun maxScore(): Int? {
        return matches.maxOfOrNull { it.score }
    }

    fun scoreDifference(): Int? {
        val max = matches.maxOfOrNull { it.score }
        val min = matches.minOfOrNull { it.score }
        return if (max != null && min != null) max - min else null
    }
}

