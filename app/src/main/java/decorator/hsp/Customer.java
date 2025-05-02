package decorator.hsp;

import decorator.hsp.meats.Beef;
import decorator.hsp.meats.Chicken;
import decorator.hsp.meats.Mixed;
import decorator.hsp.toppings.BBQSauce;
import decorator.hsp.toppings.Cheese;
import decorator.hsp.toppings.GarlicSauce;

public class Customer {
    public static void main(String[] args) {
        Hsp beef = new Beef();
        beef = new Cheese(beef);
        beef = new BBQSauce(beef);

        System.out.println(beef.getToppings());

        Hsp chicken = new Chicken();

        System.out.println(chicken.getToppings());

        Hsp mixed = new Mixed();
        mixed = new GarlicSauce(mixed);
        mixed = new BBQSauce(mixed);
        mixed = new Cheese(mixed);
        mixed = new Cheese(mixed);

        System.out.println(mixed.getToppings());
    }
}
