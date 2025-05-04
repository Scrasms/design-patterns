package iterator.kfc;

public class Sides extends MenuItem {
    private boolean isVegetarian;

    public Sides(String name, double price, int popularity, boolean isVegetarian) {
        super(name, price, popularity);
        this.isVegetarian = isVegetarian;
    }

    public String getInfo() {
        return getName() + " costs $" + getPrice() + " has a popularity of " + getPopularity() + "/10";
    }
}
