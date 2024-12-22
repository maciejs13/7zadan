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

    val tracker = FavoriteBooksTracker()

    // Dodawanie książek
    tracker.addBook(Book("Wiedźmin", "Andrzej Sapkowski", 1990))
    tracker.addBook(Book("Harry Potter", "J.K. Rowling", 1997))
    tracker.addBook(Book("Hobbit", "J.R.R. Tolkien", 1937))

    // Wyświetlanie książek
    println("Wszystkie książki:")
    tracker.displayBooks()

    // Filtrowanie po autorze
    println("\nAutor: J.K. Rowling")
    tracker.filterByAuthor("J.K. Rowling")

    // Filtrowanie po roku
    println("\nRok: 1997")
    tracker.filterByYear(1997)

    // Sortowanie po tytule
    println("\nSortowanie alfabetycznie:")
    tracker.sortBooksByTitle()

}