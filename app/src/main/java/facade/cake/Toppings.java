package facade.cake;

public class Toppings {
    public void makeTopping(String toppings) {
        switch (toppings) {
            case "fruit":
                System.out.println("Adding some fruit on top");
                break;
            case "nuts":
                System.out.println("Adding a handful of nuts on top");
                break;
            case "cream":
                System.out.println("Adding whipped cream on top");
                break;
            default:
        }
    }

    public double calculateCost(String toppings) {
        switch (toppings) {
            case "fruit":
                return 3;
            case "nuts":
                return 3;
            case "cream":
                return 1.5;
            default:
                return 0;
        }
    }
}
