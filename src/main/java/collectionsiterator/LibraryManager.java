package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {
    Set<Book> libraryBooks;

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public int libraryBooksCount() {
        return libraryBooks.size();
    }

    public Book findBookByRegNumber(int regNumber) {

        for (Iterator<Book> b = libraryBooks.iterator(); b.hasNext(); ) {
            Book current = b.next();
            if (current.getRegNumber() == regNumber) {
                return current;
            }
        }

        throw new MissingBookException("No books found with regnumber: "+regNumber);
    }

    public int removeBookByRegNumber(int regNumber) {
        for (Iterator<Book> b = libraryBooks.iterator(); b.hasNext(); ) {
            Book current = b.next();
            if (current.getRegNumber() == regNumber) {
                b.remove();
                return regNumber;
            }
        }
        throw new MissingBookException("No books found with regnumber: "+regNumber);
    }

    public Set<Book> selectBooksByAuthor(String author) {
        System.out.println(libraryBooks);

        Set<Book> result = new HashSet<>();
        for (Iterator<Book> ib = libraryBooks.iterator(); ib.hasNext(); ) {
            Book current = ib.next();
            if (current.getAuthor().equals(author)) {
                result.add(current);
            }
        }
        if (result.size() == 0) {
            throw new MissingBookException("No books found by "+author);
        }
        return result;
    }

}
