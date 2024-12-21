object Quotes {
    private val quotes = mutableListOf(
        "Wiek nie ma znaczenia, chyba że jesteś serem.",
        "Jeżeli czegoś nie wolno, a bardzo się chce, to można.",
        "Inni nie mogą nam zabrać naszego szacunku dla siebie, jeśli im go nie oddamy.")
    fun getRandomQuote(): String {
        return quotes.random()
    }
    fun addQuote(quote: String){
        quotes.add(quote)
    }
}

fun main(){
    while (true) {
        println("1. Losowy cytat\n2. Dodaj cytat\n3. Zakończ")
        when (readLine()) {
            "1" -> println("Cytat: ${Quotes.getRandomQuote()}")
            "2" -> {
                println("Podaj cytat:")
                Quotes.addQuote(readLine() ?: "")
            }
            "3" -> return
            else -> println("Niepoprawny wybór, przeczytaj opcje jeszcze raz!")
        }
    }
}