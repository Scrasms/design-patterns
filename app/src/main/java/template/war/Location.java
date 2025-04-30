package template.war;

import template.war.ai.GameAI;

// Random class not part of the Template Method structure
public class Location {
    private String name;
    private int health;
    private GameAI owner;

    public Location(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void decreaseHealth(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public void increaseHealth(int buff) {
        health += buff;
    }

    public int getHealth() {
        return health;
    }

    public GameAI getOwner() {
        return owner;
    }

    public void setOwner(GameAI owner) {
        this.owner = owner;
    }
}
