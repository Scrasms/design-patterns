package adapter.language;

// Service Class
public class EnglishMan implements EnglishSpeaker {
    private String firstName;
    private String lastName;

    public EnglishMan(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void sayEnglishName() {
        System.out.println("My name is " + firstName + " " + lastName + "! Nice to meet you!");
    }
}
