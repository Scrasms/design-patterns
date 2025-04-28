package strategy;

// Concrete Strategy
public class EssayStrategy implements WritingStrategy {
    private String title;
    private String text = "";

    public EssayStrategy(String title) {
        this.title = title;
    }

    public void write(String text) {
        this.text += text;
    }

    public String read() {
        return "Essay: " + title + ": " + this.text;
    }
}
