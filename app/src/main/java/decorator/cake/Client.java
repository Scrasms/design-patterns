package decorator.cake;

import decorator.cake.cakes.CheeseCake;
import decorator.cake.cakes.CupCake;
import decorator.cake.cakes.SpongeCake;
import decorator.cake.toppings.Candle;
import decorator.cake.toppings.Fruit;
import decorator.cake.toppings.Icing;
import decorator.cake.toppings.WhippedCream;

// Client class that will use the Decorator Pattern
public class Client {
    public static void main(String[] args) {
        Cake cupCake = new CupCake();
        cupCake = new Icing(cupCake);
        cupCake = new Fruit(cupCake);
        cupCake = new Candle(cupCake);
        cupCake = new WhippedCream(cupCake);

        System.out.println(
            "Expected Price: " + (CupCake.PRICE + Icing.PRICE + Fruit.PRICE + Candle.PRICE + WhippedCream.PRICE));
        System.out.println("Actual Price: " + cupCake.getPrice());
        System.out.println(cupCake.getToppings());

        Cake cheeseCake = new CheeseCake();
        cheeseCake = new Icing(cheeseCake);
        cheeseCake = new Candle(cheeseCake);

        System.out.println(
            "Expected Price: " + (CheeseCake.PRICE + Icing.PRICE + Candle.PRICE));
        System.out.println("Actual Price: " + cheeseCake.getPrice());
        System.out.println(cheeseCake.getToppings());

        Cake spongeCake = new SpongeCake();
        spongeCake = new Fruit(spongeCake);
        spongeCake = new WhippedCream(spongeCake);

        System.out.println(
            "Expected Price: " + (SpongeCake.PRICE + Fruit.PRICE + WhippedCream.PRICE));
        System.out.println("Actual Price: " + spongeCake.getPrice());
        System.out.println(spongeCake.getToppings());
    }
}
