package template.war.ai;

import template.war.Location;

// Concrete class that overrides step methods but not the template method
public class NavyAI extends GameAI {
    @Override
    protected void scout(Location location) {
        System.out.println("Sending seaplanes to scout " + location.getName());
        System.out.println(location.getName() + " has " + location.getHealth() + " health");
    }

    @Override
    protected void supportAttack(Location location) {
        location.decreaseHealth(2);
        System.out.println("Calling in a naval bombardment on " + location.getName());
        System.out.println(location.getName() + " now has " + location.getHealth() + " health");
    }

    @Override
    protected void advance(Location location) {
        location.decreaseHealth(4);
        System.out.println("Marines are landing at " + location.getName());
        System.out.println(location.getName() + " now has " + location.getHealth() + " health");
        if (location.getHealth() <= 0) {
            location.setOwner(this);
        }
    }

    @Override
    protected void fortify(Location location) {
        location.increaseHealth(20);
        System.out.println("Building military harbour at " + location.getName());
        System.out.println(location.getName() + " now has " + location.getHealth() + " health");
    }

    @Override
    protected void recuperate(Location location) {
        System.out.println("Failed to capture " + location.getName() + " by sea");
        System.out.println(location.getName() + " now has " + location.getHealth() + " health");
    }
}
