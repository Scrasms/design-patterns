package decorator.cake.toppings;

import decorator.cake.Cake;
import decorator.cake.CakeDecorator;

// Concrete Decorator class containing additional behaviour to be added to a component class
public class Candle extends CakeDecorator {
    public static final double PRICE = 0.2;

    public Candle(Cake wrappee) {
        super(wrappee);
    }

    @Override
    public double getPrice() {
        return PRICE + super.getPrice();
    }

    @Override
    public String getToppings() {
        return super.getToppings() + " candles";
    }
}
