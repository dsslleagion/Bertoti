package bibloteca;

import java.util.List;
import java.util.ArrayList;

public class LibraryModel {
	private List<Book> books;

    public LibraryModel() {
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

}
