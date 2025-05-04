package command.battleship;

// Concrete Command class
public class PortCommand implements ShipCommand {
    private Ship ship;

    public PortCommand(Ship ship) {
        this.ship = ship;
    }

    public void execute() {
        ship.steerToPort();
    }
}
