package factory.tsexpress.black;

import java.util.List;

public class BlackTeaLatte extends BlackTea {
    public BlackTeaLatte(String ice, String sugar) {
        super("black", ice, sugar);

        List<String> drinks = List.of("1996", "2000", "Jay the Mimic");
        int randName = (int) (Math.random() * drinks.size());
        setName(drinks.get(randName));

        List<String> toppings = List.of("Pearls", "Grass Jelly", "Aloe");
        randName = (int) (Math.random() * toppings.size());
        setTopping(toppings.get(randName));
    }
}
