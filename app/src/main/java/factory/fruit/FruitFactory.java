package factory.fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitFactory {
    private String fruit;

    public FruitFactory(String fruit) {
        this.fruit = fruit;
    }

    public Fruit generateFruit() {
        switch (fruit) {
            case "A":
                return new Apple();
            case "B":
                return new Banana();
            case "G":
                return new Grape();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "G");
        List<Fruit> fruits = new ArrayList<Fruit>();

        for (String l : list) {
            FruitFactory fac = new FruitFactory(l);
            fruits.add(fac.generateFruit());
        }

        for (Fruit f : fruits) {
            System.out.println("-------- ---------- ");
            System.out.println(f.getClass().getSimpleName());
            System.out.println("Colour: " + f.getColour() + "\nShape: " + f.getShape());
        }
    }
}
