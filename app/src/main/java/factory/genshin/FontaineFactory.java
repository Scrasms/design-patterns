package factory.genshin;

import factory.genshin.character.Character;
import factory.genshin.character.FontaineCharacter;
import factory.genshin.weapon.FontaineWeapon;
import factory.genshin.weapon.Weapon;

// Concrete Factory responsible for creating variants of Abstract Products
public class FontaineFactory implements GachaFactory {
    @Override
    public Character createCharacter() {
        return new FontaineCharacter();
    }

    @Override
    public Weapon createWeapon() {
        return new FontaineWeapon();
    }
}
