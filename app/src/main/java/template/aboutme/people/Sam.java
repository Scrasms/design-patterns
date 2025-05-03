package template.aboutme.people;

public class Sam extends People {

    @Override
    protected void printName() {
        System.out.println("Name: Sam");
    }

    @Override
    protected void printAge() {
        System.out.println("Age: 19");
    }

    @Override
    protected void printHobby() {
        System.out.println("Hobby: bushwalking");
    }

    @Override
    protected boolean wipes() {
        return true;
    }

}
