data class Book(val title: String, val author: String, val year: Int)

class FavoriteBooksTracker{

    private val books = mutableListOf<Book>()

    fun addBook(book: Book) = books.add(book)

    fun displayBooks() = books.forEach { println("${it.title}, ${it.author}, ${it.year}") }

    fun filterByAuthor(author: String) = books.filter { it.author.contains(author, ignoreCase = true) }
        .forEach { println("${it.title}, ${it.author}, ${it.year}") }

    fun filterByYear(year: Int) = books.filter { it.year == year }
        .forEach { println("${it.title}, ${it.author}, ${it.year}") }

    fun sortBooksByTitle() = books.sortedBy { it.title }
        .forEach { println("${it.title}, ${it.author}, ${it.year}") }

}

fun main(){

}