// Classe Singleton
public class LibraryManager {
    private static LibraryManager instance;
    private int libraryId;

    private LibraryManager() {
        // Construtor privado para evitar instanciação direta
        libraryId = 1; // Defina o ID da biblioteca aqui
    }

    public static LibraryManager getInstance() {
        if (instance == null) {
            instance = new LibraryManager();
        }
        return instance;
    }

    public int getLibraryId() {
        return libraryId;
    }

    // Outros métodos da classe singleton para gerenciamento da biblioteca
}

