package command;

// Concrete Command class
public class DropAnchorCommand implements ShipCommand {
    private Ship ship;

    public DropAnchorCommand(Ship ship) {
        this.ship = ship;
    }

    public void execute() {
        ship.dropAnchor();
    }
}
