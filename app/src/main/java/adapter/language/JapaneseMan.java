package adapter.language;

public class JapaneseMan implements JapaneseSpeaker {
    private String givenName;
    private String familyName;

    public JapaneseMan(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }

    @Override
    public String getGivenName() {
        return givenName;
    }

    @Override
    public String getFamilyName() {
        return familyName;
    }

    @Override
    public void sayJapaneseName() {
        System.out.println("私は" + familyName + givenName + "です。よろしくお願いします。");
    }
}
