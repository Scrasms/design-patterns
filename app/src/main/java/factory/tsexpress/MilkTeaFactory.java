package factory.tsexpress;

public class MilkTeaFactory implements DrinksFactory {

    @Override
    public Drink makeDrink(String ice, String sugar, String topping) {
        return new MilkTea(ice, sugar, topping);
    }

}
