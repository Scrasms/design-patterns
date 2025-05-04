package facade.cake;

public class Base {
    public void makeBase(String base) {
        switch (base) {
            case "Sponge":
                System.out.println("Making the sponge base");
                break;
            case "Cheese":
                System.out.println("Making the cheese base");
                break;
            case "Cupcake":
                System.out.println("Making the cupcake base");
                break;
            default:
        }
    }

    public double calculateCost(String base) {
        switch (base) {
            case "Sponge":
                return 10.00;
            case "Cheese":
                return 15.00;
            case "Cupcake":
                return 5.00;
            default:
                return 0.00;
        }
    }
}
