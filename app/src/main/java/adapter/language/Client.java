package adapter.language;

public class Client {
    public static void sayEnglishName(EnglishSpeaker man) {
        man.sayEnglishName();
    }

    public static void sayJapaneseName(JapaneseSpeaker man) {
        man.sayJapaneseName();
    }

    public static void main(String[] args) {
        EnglishMan billy = new EnglishMan("Billy", "Bofinger");
        JapaneseMan naruto = new JapaneseMan("ナルト", "うずまき");

        System.out.println("Speaking english as a english speaker...");
        sayEnglishName(billy);

        System.out.println("Speaking japanese as a japanese speaker...");
        sayJapaneseName(naruto);

        // From here onwards, we assume the client can only interact with the EnglishSpeaker interface
        // With the Adapter Pattern, the client can treat a JapaneseMan as a EnglishMan
        System.out.println("Speaking english as a japanese speaker...");
        sayEnglishName(new JapToEngAdapter(naruto));
    }
}
