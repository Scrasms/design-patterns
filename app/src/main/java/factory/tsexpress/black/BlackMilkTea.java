package factory.tsexpress.black;

import java.util.List;

public class BlackMilkTea extends BlackTea {
    public BlackMilkTea(String ice, String sugar) {
        super("black", ice, sugar);

        List<String> drinks = List.of("April the Fool", "Belle Lavender", "Kevin the Mimic");
        int randName = (int) (Math.random() * drinks.size());
        setName(drinks.get(randName));

        List<String> toppings = List.of("Pearls", "Grass Jelly", "Aloe");
        randName = (int) (Math.random() * toppings.size());
        setTopping(toppings.get(randName));
    }
}
