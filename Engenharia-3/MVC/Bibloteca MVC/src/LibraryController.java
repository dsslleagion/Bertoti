import java.util.List;

public class LibraryController {
    private LibraryModel model;
    private LibraryView view;

    public LibraryController(LibraryModel model, LibraryView view) {
        this.model = model;
        this.view = view;
    }

    public void addBook(String title, String author) {
        model.addBook(title, author);
    }

    public void removeBook(String title) {
        model.removeBook(title);
    }

    public void searchBooksByTitle(String keyword) {
        List<Book> books = model.getAllBooks();
        SearchStrategy strategy = new SearchByTitleStrategy();
        List<Book> results = strategy.search(books, keyword);
        view.displayBooks(results);
    }

    public void searchBooksByAuthor(String keyword) {
        List<Book> books = model.getAllBooks();
        SearchStrategy strategy = new SearchByAuthorStrategy();
        List<Book> results = strategy.search(books, keyword);
        view.displayBooks(results);
    }
}

