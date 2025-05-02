package decorator.cake.cakes;

import decorator.cake.Cake;

// Concrete Component class representing the object to be decorated
public class SpongeCake implements Cake {
    public static final double PRICE = 17.99;

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getToppings() {
        return "The spongecake has:";
    }
}
