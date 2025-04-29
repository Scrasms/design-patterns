package factory.tsexpress;

public class TeaLatteFactory implements DrinksFactory {

    @Override
    public Drink makeDrink(String ice, String sugar, String topping) {
        return new TeaLatte(ice, sugar, topping);
    }
}
