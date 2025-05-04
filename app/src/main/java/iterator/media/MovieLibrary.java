package iterator.media;

import java.util.ArrayList;
import java.util.List;

// Concrete Iterable collection
public class MovieLibrary implements Library<Movie> {
    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    @Override
    public Iterator<Movie> createIterator() {
        return new MovieIterator(movies);
    }
}
