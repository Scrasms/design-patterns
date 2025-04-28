package strategy;

// Concrete Strategy
public class DiscursiveStrategy implements WritingStrategy {
    private String title;
    private String text = "";

    public DiscursiveStrategy(String title) {
        this.title = title;
    }

    public void write(String text) {
        this.text += text;
    }

    public String read() {
        return "Discursive: " + title + ": " + this.text;
    }
}
