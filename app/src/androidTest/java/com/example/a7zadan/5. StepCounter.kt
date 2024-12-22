class Krokomierz {
    companion object {
        var steps = 0
    }

    fun zróbKrok() {
        steps++
    }

    fun reset() {
        steps = 0
    }

}

fun main(){

    val krokomierz = Krokomierz()

    krokomierz.zróbKrok()
    krokomierz.zróbKrok()
    println("Liczba kroków: ${Krokomierz.steps}")

    krokomierz.reset()
    println("Liczba kroków po resecie: ${Krokomierz.steps}")

}
