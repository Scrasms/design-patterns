package strategy;

// Concrete Strategy
public class CreativeStrategy implements WritingStrategy {
    private String title;
    private String text = "";

    public CreativeStrategy(String title) {
        this.title = title;
    }

    public void write(String text) {
        this.text += text;
    }

    public String read() {
        return "Creative: " + title + ": " + this.text;
    }
}
