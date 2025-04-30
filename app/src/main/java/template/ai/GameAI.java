package template.ai;

import template.Location;

// Abstract class that contains the template method
public abstract class GameAI {

    // Template method - outlines the steps needed for the algorithm to function properly
    public void attack(Location location) {
        scout(location);
        supportAttack(location);
        advance(location);
        if (isCaptured(location)) {
            fortify(location);
        } else {
            recuperate(location);
        }
    }

    // Step methods - can provide default implementation or leave as abstract

    // Scout out the location before attacking
    protected abstract void scout(Location location);

    // Call in support units to attack the location
    protected abstract void supportAttack(Location location);

    // Send main force to attack the location
    protected abstract void advance(Location location);

    // Check if location has been captured
    protected boolean isCaptured(Location location) {
        return location.getOwner() != null && location.getOwner().equals(this);
    }

    // Fortify the location if captured
    protected abstract void fortify(Location location);

    // Rest if not captured
    protected abstract void recuperate(Location location);
}
