package singleton;

// A naive implementation of the Singleton patterrn that works in a single-threaded environment
public class NaiveSingleton {
    private static NaiveSingleton instance;
    private double value;

    private NaiveSingleton() {
        value = Math.random();
    }

    public static NaiveSingleton getInstance() {
        // Create new instance or use existing one
        if (instance == null) {
            instance = new NaiveSingleton();
        }

        return instance;
    }

    public double getValue() {
        return value;
    }

    public static void main(String[] args) {
        NaiveSingleton test1 = NaiveSingleton.getInstance();
        NaiveSingleton test2 = NaiveSingleton.getInstance();
        NaiveSingleton test3 = NaiveSingleton.getInstance();
        NaiveSingleton test4 = NaiveSingleton.getInstance();
        NaiveSingleton test5 = NaiveSingleton.getInstance();
        NaiveSingleton test6 = NaiveSingleton.getInstance();

        System.out.println("If they are all the same then the Singleton worked!");
        System.out.println(test1.getValue());
        System.out.println(test2.getValue());
        System.out.println(test3.getValue());
        System.out.println(test4.getValue());
        System.out.println(test5.getValue());
        System.out.println(test6.getValue());
    }
}
