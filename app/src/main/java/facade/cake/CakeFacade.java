package facade.cake;

public class CakeFacade {
    public void order(String base, String theme, String toppings) {
        double total = 0;

        Base b = new Base();
        b.makeBase(base);
        total += b.calculateCost(base);

        Theme t = new Theme();
        t.makeTheme(theme);
        total += t.calculateCost(theme);

        Toppings topping = new Toppings();
        topping.makeTopping(toppings);
        total += topping.calculateCost(toppings);

        System.out.println("The total cost of your cake is $" + total);
    }

    public static void main(String[] args) {
        CakeFacade fac = new CakeFacade();
        fac.order("Sponge", "Chocolate", "nuts");
        fac.order("Cupcake", "Among us", "cream");
    }
}
