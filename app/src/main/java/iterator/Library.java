package iterator;

// Iterable collection interface
public interface Library<T extends Media> {
    public Iterator<T> createIterator();
}
