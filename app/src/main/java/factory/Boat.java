package factory;

// Concrete Product class
public class Boat implements Vehicle {
    private int price;

    public Boat(int price) {
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public String moveTo(String location) {
        return "Sailing to " + location + " in my insane boat!";
    }
}
