package visitor.shopping;

public class Boots extends Item {
    public Boots(double price) {
        super(price);
    }

    @Override
    public void accept(CartVisitor visitor) {
        visitor.visit(this);
    }
}
