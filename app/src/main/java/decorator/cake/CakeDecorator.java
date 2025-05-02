package decorator.cake;

// Base Decorator class that maintains a reference to the class being decorated
// Note that I made this class abstract since it offers no functionality by itself but this is not required
public abstract class CakeDecorator implements Cake {
    private Cake wrappee;

    public CakeDecorator(Cake wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public double getPrice() {
        return wrappee.getPrice();
    }

    @Override
    public String getToppings() {
        return wrappee.getToppings();
    }
}
