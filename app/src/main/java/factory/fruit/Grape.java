package factory.fruit;

public class Grape implements Fruit {

    @Override
    public String getColour() {
        return "purple";
    }

    @Override
    public String getShape() {
        return "oval";
    }
}
