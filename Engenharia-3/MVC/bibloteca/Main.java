package bibloteca;

public class Main {
	public static void main(String[] args) {
        // Criação dos objetos do MVC
        LibraryModel model = new LibraryModel();
        LibraryView view = new LibraryView();
        LibraryController controller = new LibraryController(model, view);

        // Adicionar alguns livros
        controller.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        controller.addBook("To Kill a Mockingbird", "Harper Lee");
        controller.addBook("1984", "George Orwell");

        // Atualizar a exibição
        controller.updateView();

        // Remover um livro
        controller.removeBook("To Kill a Mockingbird", "Harper Lee");

        // Atualizar a exibição novamente
        controller.updateView();
    }

}
