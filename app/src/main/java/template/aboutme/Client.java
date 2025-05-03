package template.aboutme;

import template.aboutme.people.Alex;
import template.aboutme.people.Kevin;
import template.aboutme.people.People;
import template.aboutme.people.Sam;

public class Client {


    public static void main(String[] args) {
        People sam = new Sam();
        People kevin = new Kevin();
        People alex = new Alex();

        sam.aboutMe();
        kevin.aboutMe();
        alex.aboutMe();
    }
}
