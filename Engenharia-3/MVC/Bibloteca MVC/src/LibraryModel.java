import java.util.ArrayList;
import java.util.List;

public class LibraryModel {
    private List<Book> books;
    private List<Observer> observers;

    public LibraryModel() {
        books = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
        notifyObservers();
    }

    public void removeBook(String title) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            notifyObservers();
        }
    }

    public List<Book> getAllBooks() {
        return books;
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
