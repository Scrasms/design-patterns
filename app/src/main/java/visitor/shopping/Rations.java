package visitor.shopping;

public class Rations extends Item {
    private double tax;

    public Rations(double price, double tax) {
        super(price);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    @Override
    public void accept(CartVisitor visitor) {
        visitor.visit(this);
    }
}
