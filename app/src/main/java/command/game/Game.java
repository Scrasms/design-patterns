package command.game;

import java.util.List;

// Receiver class who's commands we are invoking
public class Game {
    public void attack() {
        System.out.println("Character swung their sword!");
    }

    public void jump() {
        System.out.println("Character jumped!");
    }

    public void move() {
        List<String> directions = List.of("North", "South", "East", "West");
        System.out.println("Character moving to " + directions.get((int) Math.random() * 4));
    }

    public void heal() {
        System.out.println("Character is healing!");
    }
}
