// Classe Facade
public class LibraryFacade {
    private LibraryController controller;
    private LibraryModel model;
    private LibraryView view;

    public LibraryFacade() {
        model = new LibraryModel();
        view = new LibraryView(model);
        controller = new LibraryController(model, view);
        model.addObserver(view);
    }

    public void addBook(String title, String author) {
        controller.addBook(title, author);
    }

    public void removeBook(String title) {
        controller.removeBook(title);
    }

    public void searchBooksByTitle(String keyword) {
        controller.searchBooksByTitle(keyword);
    }

    public void searchBooksByAuthor(String keyword) {
        controller.searchBooksByAuthor(keyword);
    }
}

