package factory.genshin;

import factory.genshin.character.Character;
import factory.genshin.weapon.Weapon;
import factory.genshin.character.NatlanCharacter;
import factory.genshin.weapon.NatlanWeapon;

// Concrete Factory responsible for creating variants of Abstract Products
public class NatlanFactory implements GachaFactory {
    @Override
    public Character createCharacter() {
        return new NatlanCharacter();
    }

    @Override
    public Weapon createWeapon() {
        return new NatlanWeapon();
    }
}
