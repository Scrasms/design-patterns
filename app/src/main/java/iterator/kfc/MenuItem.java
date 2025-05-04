package iterator.kfc;

public class MenuItem {
    private String name;
    private double price;
    private int popularity;

    public MenuItem(String name, double price, int popularity) {
        this.name = name;
        this.price = price;
        this.popularity = popularity;
    }

    public boolean canAfford(double balance) {
        return balance >= price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getPopularity() {
        return popularity;
    }
}
