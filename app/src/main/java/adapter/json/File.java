package adapter.json;

// Service class that the client can't interact with due to conflicting interfaces
public class File {
    private String text;

    public void write(String text) {
        this.text = text;
    }

    public void append(String text) {
        this.text += text;
    }

    public String read() {
        return text;
    }
}
