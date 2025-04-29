package observer;

// Conrete Observer
public class Child implements MovieWatcher {
    @Override
    public void update(String scene) {
        switch (scene) {
            case "sad":
                System.out.println("The Child is confused. They're just too young to understand");
                break;

            case "funny":
                System.out.println("The Child is laughing");
                break;

            case "scary":
                System.out.println("The Child starts bawling. You shouldn't let them watch such movies...");
                break;

            default:
                break;
        }
    }
}
