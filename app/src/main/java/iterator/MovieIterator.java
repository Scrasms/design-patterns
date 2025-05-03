package iterator;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Concrete Iterator class
public class MovieIterator implements Iterator<Movie> {
    private List<Movie> list;
    private int position = 0;

    public MovieIterator(List<Movie> list) {
        // Sort movies by rating and then alphabetically by studio and name
        this.list = list.stream()
            .sorted(
                Comparator.comparing(Movie::getRating)
                    .thenComparing(Movie::getStudio)
                    .thenComparing(Movie::getName)
            )
            .collect(Collectors.toList());
    }

    public Movie getNext() {
        Movie next = list.get(position);
        position++;
        return next;
    }

    public boolean hasNext() {
        return list != null && position < list.size();
    }
}
