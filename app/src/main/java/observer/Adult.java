package observer;

// Conrete Observer
public class Adult implements MovieWatcher {
    @Override
    public void update(String scene) {
        switch (scene) {
            case "sad":
                System.out.println("A single tear drips down the Adult's cheek");
                break;

            case "funny":
                System.out.println("The Adult is bored. They're too hardboiled for this juvenile slop");
                break;

            case "scary":
                System.out.println("The Adult is bored. Nothing is scarier than working on a Monday");
                break;

            default:
                break;
        }
    }
}
