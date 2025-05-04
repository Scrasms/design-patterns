package iterator.media;

import java.util.ArrayList;
import java.util.List;

// Concrete Iterable collection
public class BookLibrary implements Library<Book> {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }
}
