package strategy;

// Generic Strategy interface detailing what each Concrete Strategy does
public interface WritingStrategy {
    public void write(String text);
    public String read();
}
