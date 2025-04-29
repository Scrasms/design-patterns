package factory.tsexpress;

import java.util.ArrayList;
import java.util.List;

public abstract class Drink {
    private String name;
    private String ice;
    private String sugar;
    private String topping;

    public Drink(String name, String ice, String sugar, String topping) {
        this.name = name;
        this.ice = ice;
        this.sugar = sugar;
        this.topping = topping;
    }
    public String info() {
        return "name: " + name + " ice: " + ice + " sugar: " + sugar + " topping: " + topping;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIce() {
        return ice;
    }
    public void setIce(String ice) {
        this.ice = ice;
    }
    public String getSugar() {
        return sugar;
    }
    public void setSugar(String sugar) {
        this.sugar = sugar;
    }
    public String getTopping() {
        return topping;
    }
    public void setTopping(String topping) {
        this.topping = topping;
    }

    public static void main(String[] args) {
        DrinksFactory mt = new MilkTeaFactory();
        DrinksFactory tl = new TeaLatteFactory();
        DrinksFactory t = new TeaFactory();
        List<Drink> drinks = new ArrayList<>();

        List<String> iceList = List.of("None", "Less", "Full");
        List<String> sugarLevel = List.of("0%", "25%", "50%", "100%");
        List<String> toppingList = List.of("Pearls", "Grass Jelly", "Aloe Vera");
        int num;
        for (int i = 0; i < 10; i++) {
            num = (int) (Math.random() * 3);
            drinks.add(mt.makeDrink(iceList.get(num), sugarLevel.get(num), toppingList.get(num)));
            num = (int) (Math.random() * 3);
            drinks.add(tl.makeDrink(iceList.get(num), sugarLevel.get(num), toppingList.get(num)));
            num = (int) (Math.random() * 3);
            drinks.add(t.makeDrink(iceList.get(num), sugarLevel.get(num), toppingList.get(num)));
        }

        drinks.forEach(d -> System.out.println(d.info()));
    }
}
