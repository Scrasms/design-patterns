package strategy;

// Context class that delegates its actions to the WritingStrategy classes
public class Writer {
    private WritingStrategy strategy;

    public Writer(WritingStrategy strategy) {
        this.strategy = strategy;
    }

    public void write(String text) {
        strategy.write(text);
    }

    public String read() {
        return strategy.read();
    }

    public static void main(String[] args) {
        Writer kevin = new Writer(new CreativeStrategy("Cosmic"));
        kevin.write("Why did it have to be urban?! I groaned, looking around frantically.");
        System.out.println(kevin.read());

        Writer rory = new Writer(new EssayStrategy("Romeo and Juliet Essay"));
        rory.write("I just felt the flow, yeh know?");
        System.out.println(rory.read());

        Writer sebastian = new Writer(new DiscursiveStrategy("Forests"));
        sebastian.write("I am the Lorax, I speak for the trees");
        System.out.println(sebastian.read());
    }
}
