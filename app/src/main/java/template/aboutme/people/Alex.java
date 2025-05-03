package template.aboutme.people;

public class Alex extends People {

    @Override
    protected void printName() {
        System.out.println("Name: Alex");
    }

    @Override
    protected void printAge() {
        System.out.println("Age: 19");
    }

    @Override
    protected void printHobby() {
        System.out.println("Hobby: Saying BROTHERMAN randomly");
    }

    @Override
    protected boolean wipes() {
        return true;
    }

}
