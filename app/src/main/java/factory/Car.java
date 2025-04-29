package factory;

// Concrete Product class
public class Car implements Vehicle {
    private int price;

    public Car(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String moveTo(String location) {
        return "Driving to " + location + " in my awesome car!";
    }
}
