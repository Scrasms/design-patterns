package template.aboutme.people;

public class Kevin extends People {

    @Override
    protected void printName() {
        System.out.println("Name: Kevin");
    }

    @Override
    protected void printAge() {
        System.out.println("Age: 19");
    }

    @Override
    protected void printHobby() {
        System.out.println("Hobby: Staying at home and being a recluse");
    }

    @Override
    protected boolean wipes() {
        return false;
    }

}
