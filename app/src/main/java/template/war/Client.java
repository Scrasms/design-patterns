package template.war;

// Client class that will use the Template Method

import template.war.ai.ArmyAI;
import template.war.ai.GameAI;
import template.war.ai.NavyAI;

public class Client {
    public static void main(String[] args) {
        GameAI army = new ArmyAI();
        GameAI navy = new NavyAI();
        Location sydney = new Location("Sydney", 10);
        army.attack(sydney);
        navy.attack(sydney);
    }
}
