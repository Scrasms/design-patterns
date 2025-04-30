package decorator.cakes;

import decorator.Cake;

// Concrete Component class representing the object to be decorated
public class CheeseCake implements Cake {
    public static final double PRICE = 9.45;

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getToppings() {
        return "The cheesecake has:";
    }
}
