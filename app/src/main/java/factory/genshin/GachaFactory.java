package factory.genshin;

import factory.genshin.character.Character;
import factory.genshin.weapon.Weapon;

// Abstract Factory Interface declaring factory methods for each abstract product
public interface GachaFactory {
    // Note that each concrete factory will return the abstract product to avoid coupling with a concrete product
    public Character createCharacter();
    public Weapon createWeapon();
}
