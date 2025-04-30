package template.war.ai;

import template.war.Location;

// Concrete class that overrides step methods but not the template method
public class ArmyAI extends GameAI {
    @Override
    protected void scout(Location location) {
        System.out.println("Sending scout cars to " + location.getName());
        System.out.println(location.getName() + " has " + location.getHealth() + " health");
    }

    @Override
    protected void supportAttack(Location location) {
        location.decreaseHealth(1);
        System.out.println("Calling in an artillery strike on " + location.getName());
        System.out.println(location.getName() + " now has " + location.getHealth() + " health");
    }

    @Override
    protected void advance(Location location) {
        location.decreaseHealth(6);
        System.out.println("Attacking " + location.getName() + " with infantry and tanks");
        System.out.println(location.getName() + " now has " + location.getHealth() + " health");
        if (location.getHealth() <= 0) {
            location.setOwner(this);
        }
    }

    @Override
    protected void fortify(Location location) {
        location.increaseHealth(10);
        System.out.println("Building military base at " + location.getName());
        System.out.println(location.getName() + " now has " + location.getHealth() + " health");
    }

    @Override
    protected void recuperate(Location location) {
        System.out.println("Failed to capture " + location.getName() + " on land");
        System.out.println(location.getName() + " now has " + location.getHealth() + " health");
    }
}
