public class LibraryApp {
    public static void main(String[] args) {
        // Criação da instância do LibraryFacade
        LibraryFacade libraryFacade = new LibraryFacade();

        // Adicionando alguns livros à biblioteca
        libraryFacade.addBook("Livro 1", "Autor 1");
        libraryFacade.addBook("Livro 2", "Autor 2");
        libraryFacade.addBook("Livro 3", "Autor 1");
        libraryFacade.addBook("Livro 4", "Autor 3");

        // Realizando uma busca por título
        System.out.println("Busca por título:");
        libraryFacade.searchBooksByTitle("Livro");

        // Realizando uma busca por autor
        System.out.println("Busca por autor:");
        libraryFacade.searchBooksByAuthor("Autor 1");

        // Removendo um livro da biblioteca
        libraryFacade.removeBook("Livro 2");

        // Realizando uma nova busca por título
        System.out.println("Busca por título após remoção:");
        libraryFacade.searchBooksByTitle("Livro 2");
    }
}
