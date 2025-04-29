package factory.fruit;

public class Banana implements Fruit {

    @Override
    public String getColour() {
        return "yellow";
    }

    @Override
    public String getShape() {
        return "arc";
    }
}
