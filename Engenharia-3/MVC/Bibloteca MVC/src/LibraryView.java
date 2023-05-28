import java.util.List;

public class LibraryView implements Observer {
    private LibraryModel model;

    public LibraryView(LibraryModel model) {
        this.model = model;
    }

    public void displayBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("Nenhum livro encontrado.");
        } else {
            System.out.println("Livros encontrados:");
            for (Book book : books) {
                System.out.println("Título: " + book.getTitle());
                System.out.println("Autor: " + book.getAuthor());
                System.out.println("-----------------------");
            }
        }
    }

    @Override
    public void update() {
        List<Book> books = model.getAllBooks();
        displayBooks(books);
    }
}

