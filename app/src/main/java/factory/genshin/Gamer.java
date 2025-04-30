package factory.genshin;

import factory.genshin.character.Character;
import factory.genshin.weapon.Weapon;

// Client class
public class Gamer {
    private String name;
    private GachaFactory factory;

    public Gamer(String name, GachaFactory factory) {
        this.name = name;
        this.factory = factory;
    }

    public Character pullCharacter() {
        Character newChar = factory.createCharacter();
        System.out.println(name + " just pulled a " + newChar.getRarity() + "-star " + newChar.getName());
        System.out.println("HP: " + newChar.getHp());
        System.out.println("ATK: " + newChar.getAtk());
        return newChar;
    }

    public Weapon pullWeapon() {
        Weapon newWeapon = factory.createWeapon();
        System.out.println(name + " just pulled a " + newWeapon.getRarity() + "-star " + newWeapon.getType());
        System.out.println("ATK: " + newWeapon.getAtk());
        return newWeapon;
    }

    public static void main(String[] args) {
        Gamer kevin = new Gamer("kevin", new FontaineFactory());
        Gamer alex = new Gamer("alex", new NatlanFactory());

        for (int i = 0; i < 5; i++) {
            kevin.pullCharacter();
            alex.pullCharacter();
            kevin.pullWeapon();
            alex.pullWeapon();
        }
    }
}
