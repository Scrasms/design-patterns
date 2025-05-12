package visitor.shopping;

import java.util.ArrayList;
import java.util.List;

// Client class
public class Cart {
    private List<Item> cart = new ArrayList<>();

    public void addItem(Item item) {
        cart.add(item);
    }

    // Checkout and calculate the final price
    public void checkout(CartVisitor visitor) {
        cart.forEach(item -> item.accept(visitor));
    }
}
