package iterator.kfc;

public class Chicken extends MenuItem {
    private boolean spicy;

    public Chicken(String name, double price, int popularity, boolean spicy) {
        super(name, price, popularity);
        this.spicy = spicy;
    }

    public String getInfo() {
        return getName() + " costs $" + getPrice() + " has a popularity of " + getPopularity() + "/10";
    }
}
