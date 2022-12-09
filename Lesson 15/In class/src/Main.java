import entity.Book;
import entity.Library;
import entity.Reader;
import handle.BookHandle;
import view.Menu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(Arrays.asList(new Book(1, "Dế mén ", "Tô Hoài", "20/20/2021")));
        List<Reader> readers = new ArrayList<>(Arrays.asList(new Reader(1, "Linh","07/07/1996")));
        Library library = new Library(books, readers);

        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu.showMenu();
            menu.chooseFunction(scanner, library);
        }
    }
}