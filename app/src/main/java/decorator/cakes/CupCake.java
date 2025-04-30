package decorator.cakes;

import decorator.Cake;

// Concrete Component class representing the object to be decorated
public class CupCake implements Cake {
    public static final double PRICE = 5.5;

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getToppings() {
        return "The cupcake has:";
    }
}
