package visitor.shopping;

public class Client {
    public static void main(String[] args) {
        PriceVisitor visitor = new PriceVisitor();
        Cart cart = new Cart();
        cart.addItem(new Boots(50.99));
        cart.addItem(new Tent(100, 25.0));
        cart.addItem(new Rations(17.85, 15.5));
        cart.checkout(visitor);

        System.out.println(visitor.getTotalCost());
    }
}
