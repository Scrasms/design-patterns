package iterator.kfc;

public interface Box<T extends MenuItem> {
    public Iterator<T> createIterator();
}
