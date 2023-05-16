package bibloteca;
import java.util.List;
import java.util.ArrayList;

public class LibraryController {
	private LibraryModel model;
    private LibraryView view;

    public LibraryController(LibraryModel model, LibraryView view) {
        this.model = model;
        this.view = view;
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        model.addBook(book);
    }

    public void removeBook(String title, String author) {
        List<Book> books = model.getBooks();
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                model.removeBook(book);
                break;
            }
        }
    }

    public void updateView() {
        List<Book> books = model.getBooks();
        view.displayBooks(books);
    }

}
