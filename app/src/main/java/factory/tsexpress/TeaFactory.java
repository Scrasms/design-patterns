package factory.tsexpress;

public class TeaFactory implements DrinksFactory {

    @Override
    public Drink makeDrink(String ice, String sugar, String topping) {
        return new Tea(ice, sugar, topping);
    }
}
