package factory.vehicle;

// Concrete Product class
public class Plane implements Vehicle {
    private int price;

    public Plane(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String moveTo(String location) {
        return "Flying to " + location + " in my epic plane!";
    }
}
