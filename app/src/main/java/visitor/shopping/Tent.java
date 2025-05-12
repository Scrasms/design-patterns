package visitor.shopping;

public class Tent extends Item {
    private double discount;

    public Tent(double price, double discount) {
        super(price);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public void accept(CartVisitor visitor) {
        visitor.visit(this);
    }
}
