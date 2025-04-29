package factory;

public class Apple implements Fruit {

    @Override
    public String getColour() {
        return "red";
    }

    @Override
    public String getShape() {
        return "sphere";
    }
}
