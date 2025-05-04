package iterator.media;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Concrete Iterator class
public class BookIterator implements Iterator<Book> {
    private List<Book> list;
    private int position = 0;

    public BookIterator(List<Book> list) {
        // Sort books alphabetically by name and then author
        this.list = list.stream()
            .sorted(
                Comparator.comparing(Book::getName)
                    .thenComparing(Book::getAuthor)
            )
            .collect(Collectors.toList());
    }

    public Book getNext() {
        Book next = list.get(position);
        position++;
        return next;
    }

    public boolean hasNext() {
        return list != null && position < list.size();
    }
}
