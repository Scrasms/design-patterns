package iterator.media;

public class Media {
    private String name;
    private int maxLoanDays;
    private boolean loaned;

    public Media(String name, int maxLoanDays) {
        this.name = name;
        this.maxLoanDays = maxLoanDays;
        loaned = false;
    }

    public void loan(int days) {
        if (days > maxLoanDays) {
            System.out.println("Cannot loan more than " + maxLoanDays + " days!");
        } else if (loaned) {
            System.out.println("Already loaned to someone else!");
        } else {
            System.out.println("Successfully loaned!");
            loaned = true;
        }
    }

    public String getName() {
        return name;
    }
}
