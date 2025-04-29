package factory.tsexpress;

public interface DrinksFactory {
    public Drink makeDrink(String ice, String sugar, String topping);
}
