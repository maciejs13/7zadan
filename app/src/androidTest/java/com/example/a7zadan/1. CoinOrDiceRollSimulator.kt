interface coinOrDiceRoll {

    fun roll(): String

}

class Coin : coinOrDiceRoll {
    override fun roll() = arrayOf("Orzeł", "Reszka").random()
}



fun main(){

}