package iterator.media;

public class Book extends Media {
    private String author;

    public Book(String name, String author) {
        super(name, 7);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
