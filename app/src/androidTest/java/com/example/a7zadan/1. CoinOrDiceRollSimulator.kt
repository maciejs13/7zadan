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

}