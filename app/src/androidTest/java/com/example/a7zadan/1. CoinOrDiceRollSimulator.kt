interface coinOrDiceRoll {

    fun roll(): String

}

class Coin : coinOrDiceRoll {
    override fun roll() = arrayOf("Orzeł", "Reszka").random()
}

class Dice : coinOrDiceRoll {
    override fun roll() = (1..6).random().toString()
}


fun main(){

    println("Wybierz opcję: (1) Rzut monetą (2) Rzut kością")
    when (readLine()) {
        "1" -> println("Wynik rzutu monetą: ${Coin().roll()}")
        "2" -> println("Wynik rzutu kością: ${Dice().roll()}")
        else -> println("Niepoprawny wybór!")
    }

}