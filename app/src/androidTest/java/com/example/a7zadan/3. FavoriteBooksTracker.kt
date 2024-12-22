data class Book(val title: String, val author: String, val year: Int)

class FavoriteBooksTracker{

    private val books = mutableListOf<Book>()

    fun addBook(book: Book) = books.add(book)

    fun displayBooks() = books.forEach { println("${it.title}, ${it.author}, ${it.year}") }

}

fun main(){

}