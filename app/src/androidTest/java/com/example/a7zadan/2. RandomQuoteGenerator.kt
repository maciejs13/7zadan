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