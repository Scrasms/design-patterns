package visitor.shopping;

public abstract class Item {
    private double price;

    public Item(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract void accept(CartVisitor visitor);
}
