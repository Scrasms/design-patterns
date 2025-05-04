package command.battleship;

public class Client {
    public static void main(String[] args) {
        Ship ship = new Ship();

        CaptainOrder order = new CaptainOrder();
        order.addCommand(new WeighAnchorCommand(ship));
        order.addCommand(new StarboardCommand(ship));
        order.addCommand(new PortCommand(ship));
        order.addCommand(new StarboardCommand(ship));
        order.addCommand(new DropAnchorCommand(ship));

        order.executeCommands();
    }
}
