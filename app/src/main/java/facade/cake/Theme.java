package facade.cake;

public class Theme {
    public void makeTheme(String theme) {
        switch (theme) {
            case "Chocolate":
                System.out.println("Adding the chocolate theme");
                break;
            case "Strawberry":
                System.out.println("Adding the strawberry theme");
                break;
            case "Among us":
                System.out.println("Adding the amongus theme");
                break;
            default:
        }
    }

    public double calculateCost(String theme) {
        switch (theme) {
            case "Chocolate":
                return 4;
            case "Strawberry":
                return 5;
            case "Among us":
                return 20;
            default:
                return 0;
        }
    }
}
