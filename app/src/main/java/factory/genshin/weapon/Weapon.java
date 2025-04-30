package factory.genshin.weapon;

// Abstract Product Interface grouping a set of distinct but related products
public interface Weapon {
    public String getType();
    public int getAtk();
    public int getRarity();
}
