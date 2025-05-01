package adapter.language;

// Adapter class. Wraps a JapaneseSpeaker in an interface and allows it to be treated
// as an EnglishSpeaker by the client
public class JapToEngAdapter implements EnglishSpeaker {
    private JapaneseSpeaker japaneseMan;

    public JapToEngAdapter(JapaneseSpeaker japaneseMan) {
        this.japaneseMan = japaneseMan;
    }

    @Override
    public void sayEnglishName() {
        System.out.println("Translating...");
        System.out.println("My name is " + getFirstName() + " " + getLastName() + "!");
    }

    @Override
    public String getFirstName() {
        return japaneseMan.getGivenName();
    }

    @Override
    public String getLastName() {
        return japaneseMan.getFamilyName();
    }
}
