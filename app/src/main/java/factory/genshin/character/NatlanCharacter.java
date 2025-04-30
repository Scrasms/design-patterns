package factory.genshin.character;

import java.util.List;

// Concrete Product
public class NatlanCharacter implements Character {
    private String name;
    private int hp;
    private int atk;
    private int rarity;

    public NatlanCharacter() {
        List<String> names = List.of(
            "Mavuika", "Kinich", "Citlali", "Chasca", "Mualani", "Ororon", "Xilonen", "Kachina");
        int randName = (int) (Math.random() * names.size());
        name = names.get(randName);
        hp = (int) (Math.random() * 15000);
        atk = (int) (Math.random() * 400);

        // 80% chance of 4, 20% chance of 5
        rarity = (int) (Math.random() * 100) < 80 ? 4 : 5;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getRarity() {
        return rarity;
    }
}
