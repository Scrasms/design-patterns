package observer.movie;

// Conrete Observer
public class Teenager implements MovieWatcher {
    @Override
    public void update(String scene) {
        switch (scene) {
            case "sad":
                System.out.println("The Teengar is unfazed. They're in their edgy phase");
                break;

            case "funny":
                System.out.println("The Teenager is unfazed. Nothing is funny to this guy");
                break;

            case "scary":
                System.out.println("The Teenager is unfazed. Do they even have emotions?");
                break;

            default:
                break;
        }
    }
}
