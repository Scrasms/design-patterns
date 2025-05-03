package singleton;

// Thread-safe Singleton implementation
public class Singleton {
    private static Singleton instance;
    private double value;
    private int number;

    private Singleton() {
        value = Math.random();
    }

    // synchronized keyword acts as a lock
    public static synchronized Singleton getInstance() {
        // Double-checked locking (DCL) is more efficient but this is easier to implement
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public synchronized double getValue() {
        return value;
    }

    public synchronized int getNumber() {
        return number;
    }

    public synchronized void addNumber(int amount) {
        this.number += amount;
    }

    public static void main(String[] args) {
        class Thread1 implements Runnable {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
                System.out.println("Thread1 value: " + singleton.getValue());
                System.out.println("Thread1 number: " + singleton.getNumber());
                singleton.addNumber(123);
                System.out.println("Thread1 added 123 to number! The number is now: " + singleton.getNumber());
            }
        }

        class Thread2 implements Runnable {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
                System.out.println("Thread2 value: " + singleton.getValue());
                System.out.println("Thread2 number: " + singleton.getNumber());
                singleton.addNumber(456);
                System.out.println("Thread2 added 456 to number! The number is now: " + singleton.getNumber());
            }
        }


        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());

        t1.start();
        t2.start();
    }
}
