package factory;

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
