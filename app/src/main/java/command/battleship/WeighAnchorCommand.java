package command.battleship;

// Concrete Command class
public class WeighAnchorCommand implements ShipCommand {
    private Ship ship;

    public WeighAnchorCommand(Ship ship) {
        this.ship = ship;
    }

    public void execute() {
        ship.weighAnchor();
    }
}
