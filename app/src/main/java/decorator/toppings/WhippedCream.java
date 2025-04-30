package decorator.toppings;

import decorator.Cake;
import decorator.CakeDecorator;

// Concrete Decorator class containing additional behaviour to be added to a component class
public class WhippedCream extends CakeDecorator {
    public static final double PRICE = 1.45;

    public WhippedCream(Cake wrappee) {
        super(wrappee);
    }

    @Override
    public double getPrice() {
        return PRICE + super.getPrice();
    }

    @Override
    public String getToppings() {
        return super.getToppings() + " whipped cream";
    }
}
