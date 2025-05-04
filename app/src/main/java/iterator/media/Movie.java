package iterator.media;

public class Movie extends Media {
    private String studio;
    private int rating;

    public Movie(String name, String studio, int rating) {
        super(name, 3);
        this.studio = studio;
        this.rating = rating;
    }

    public String getStudio() {
        return studio;
    }

    public int getRating() {
        return rating;
    }
}
