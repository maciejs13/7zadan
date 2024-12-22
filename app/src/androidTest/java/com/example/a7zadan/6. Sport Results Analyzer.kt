data class Match(var score: Int)

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

    fun countMatchesAboveThreshold(threshold: Int): Int {
        return matches.count { it.score > threshold }
    }

    fun getMatches(): List<Match> {
        return matches
    }

}

fun main() {
    val analyzer = SportsResultsAnalyzer(mutableListOf())

    analyzer.addMatch(75)
    analyzer.addMatch(65)
    analyzer.addMatch(80)
    analyzer.addMatch(60)

    println("Przefiltrowane mecze (wynik >= 70): ${analyzer.filterMatches(70)}")
    analyzer.addBonusPoints(10)
    println("Wyniki po dodaniu punktów bonusowych: ${analyzer.getMatches()}")
    println("Suma wyników: ${analyzer.sumScores()}")
    println("Maksymalny wynik: ${analyzer.maxScore()}")
    println("Różnica między maksymalnym a minimalnym wynikiem: ${analyzer.scoreDifference()}")
    println("Mecze z wynikiem powyżej 70: ${analyzer.countMatchesAboveThreshold(70)}")
}

