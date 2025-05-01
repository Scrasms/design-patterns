package adapter.linear;

// Client class representing a polynomial of degree 2. This class needs to work with
// the already existing Vector class but can't because they are incompatible
public class P2 {
    private int[] coefficients = new int[3];

    public P2(int a, int b, int c) {
        coefficients[0] = a;
        coefficients[1] = b;
        coefficients[2] = c;
    }

    public int getA() {
        return coefficients[0];
    }

    public int getB() {
        return coefficients[1];
    }

    public int getC() {
        return coefficients[2];
    }

    // Returns a string representing the current polynomial
    public String toString() {
        return getAString() + getBString() + getCString();
    }

    private String getAString() {
        if (getA() == 0) {
            return "";
        } else if (getA() == 1) {
            return "x^2";

        } else if (getA() == -1) {
            return "-x^2";

        } else {
            return Integer.toString(getA()) + "x^2";
        }
    }

    private String getBString() {
        if (getB() == 0) {
            return "";
        } else if (getB() > 0) {
            if (getB() == 1) return "+x";
            return "+" + Integer.toString(getB()) + "x";
        } else {
            if (getB() == -1) return "-x";
            return Integer.toString(getB()) + "x";
        }
    }

    private String getCString() {
        if (getC() == 0) {
            return "";
        } else if (getC() > 0) {
            return "+" + Integer.toString(getC());
        } else {
            return Integer.toString(getC());
        }
    }
}
