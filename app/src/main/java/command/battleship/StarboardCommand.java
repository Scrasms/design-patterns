package command.battleship;

// Concrete Command class
public class StarboardCommand implements ShipCommand {
    private Ship ship;

    public StarboardCommand(Ship ship) {
        this.ship = ship;
    }

    public void execute() {
        ship.steerToStarboard();
    }
}
