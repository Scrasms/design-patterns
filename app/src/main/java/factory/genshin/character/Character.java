package factory.genshin.character;

// Abstract Product Interface grouping a set of distinct but related products
public interface Character {
    public String getName();
    public int getHp();
    public int getAtk();
    public int getRarity();
}
