package factory.tsexpress.green;

import java.util.List;

public class GreenTeaLatte extends GreenTea {
    public GreenTeaLatte(String ice, String sugar) {
        super("green", ice, sugar);

        List<String> drinks = List.of("Buckwheat", "Light", "Jasmine");
        int randName = (int) (Math.random() * drinks.size());
        setName(drinks.get(randName));

        List<String> toppings = List.of("Pearls", "Grass Jelly", "Aloe");
        randName = (int) (Math.random() * toppings.size());
        setTopping(toppings.get(randName));
    }
}
