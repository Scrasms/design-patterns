package factory.genshin.weapon;

import java.util.List;

// Concrete Product
public class FontaineWeapon implements Weapon {
    private String type;
    private int atk;
    private int rarity;

    public FontaineWeapon() {
        List<String> types = List.of("Catalyst", "Polearm", "Claymore");
        int randType = (int) (Math.random() * types.size());
        type = types.get(randType);
        atk = (int) (Math.random() * 800);

        // 50% chance of 3, 30% chance of 4, 20% chance of 5
        int randRarity = (int) (Math.random() * 100);
        if (randRarity < 50) {
            rarity = 3;
        } else if (randRarity < 80) {
            rarity = 4;
        } else {
            rarity = 5;
        }
    }

    public String getType() {
        return type;
    }

    public int getAtk() {
        return atk;
    }

    public int getRarity() {
        return rarity;
    }
}
