package singleton;

public class Bank {
    private int balance;
    private static Bank instance;

    private Bank(int balance) {
        this.balance = balance;
    }

    public static synchronized Bank getInstance(int balance) {
        if (instance == null) {
            instance = new Bank(balance);
        }

        return instance;
    }

    public synchronized void accessBalance(int num) {
        if ((num % 2) == 0) {
            balance = balance - 7;
        } else {
            balance = balance - 3;
        }
    }

    public synchronized int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        class Thread1 implements Runnable {
            @Override
            public void run() {
                Bank bank = Bank.getInstance((int) (Math.random() * 1000));
                System.out.println("Thread1 value: " + bank.getBalance());
                bank.accessBalance(0);
                System.out.println("Thread1 value: " + bank.getBalance());
            }
        }

        class Thread2 implements Runnable {
            @Override
            public void run() {
                Bank bank = Bank.getInstance((int) (Math.random() * 1000));
                System.out.println("Thread2 value: " + bank.getBalance());
                bank.accessBalance(1);
                System.out.println("Thread2 value: " + bank.getBalance());
            }
        }


        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());

        t1.start();
        t2.start();
    }
}
