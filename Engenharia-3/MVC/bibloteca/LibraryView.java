package bibloteca;
import java.util.List;
public class LibraryView {
	 public void displayBooks(List<Book> books) {
	        System.out.println("Library Books:");
	        for (Book book : books) {
	            System.out.println(book.getTitle() + " by " + book.getAuthor());
	        }
	        System.out.println();
	    }

}
