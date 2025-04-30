package factory.tsexpress.green;

import java.util.List;

public class GreenMilkTea extends GreenTea {
    public GreenMilkTea(String ice, String sugar) {
        super("green", ice, sugar);

        List<String> drinks = List.of("Extra Dry", "2011", "Fearless Kimberley");
        int randName = (int) (Math.random() * drinks.size());
        setName(drinks.get(randName));

        List<String> toppings = List.of("Pearls", "Grass Jelly", "Aloe");
        randName = (int) (Math.random() * toppings.size());
        setTopping(toppings.get(randName));
    }
}
