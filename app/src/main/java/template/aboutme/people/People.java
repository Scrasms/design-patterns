package template.aboutme.people;

public abstract class People {
    public void aboutMe() {
        printName();
        printAge();
        printHobby();

        if (!wipes()) {
            System.out.println("I am billy");
        }
    }

    protected abstract void printName();
    protected abstract void printAge();
    protected abstract void printHobby();
    protected abstract boolean wipes();
}
