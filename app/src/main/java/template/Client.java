package template;

// Client class that will use the Template Method

import template.ai.ArmyAI;
import template.ai.GameAI;
import template.ai.NavyAI;

public class Client {
    public static void main(String[] args) {
        GameAI army = new ArmyAI();
        GameAI navy = new NavyAI();
        Location sydney = new Location("Sydney", 10);
        army.attack(sydney);
        navy.attack(sydney);
    }
}
