package iterator;

public class Client {
    public static void main(String[] args) {
        BookLibrary library = new BookLibrary();
        library.addBook(new Book("War and Peace", "Leo Tolstoy"));
        library.addBook(new Book("Cosmic", "Kevin"));
        library.addBook(new Book("MathBook", "Rory"));
        library.addBook(new Book("Billy", "Jack"));
        library.addBook(new Book("Billy", "Josh"));

        Iterator<Book> it = library.createIterator();
        while (it.hasNext()) {
            Book b = it.getNext();
            System.out.println(b.getName() + " by " + b.getAuthor());
        }

        MovieLibrary library2 = new MovieLibrary();
        library2.addMovie(new Movie("Hunger Games", "Lionsgate Studios", 7));
        library2.addMovie(new Movie("Cars", "Pixar", 8));
        library2.addMovie(new Movie("Cars", "RandomStudio", 2));
        library2.addMovie(new Movie("dkawkkakad", "Aaaaaaa", 8));
        library2.addMovie(new Movie("WALL-E", "Pixar", 8));
        library2.addMovie(new Movie("Good Movie", "Rando", 8));
        library2.addMovie(new Movie("Great Movie", "Rando", 8));
        library2.addMovie(new Movie("Tales from Earthsea", "Studio Ghibli", 2));
        library2.addMovie(new Movie("Your Name", "CoMix Wave Films", 10));

        Iterator<Movie> it2 = library2.createIterator();
        while (it2.hasNext()) {
            Movie m = it2.getNext();
            System.out.println(m.getName() + " by " + m.getStudio() + " is rated " + m.getRating());
        }
    }
}
