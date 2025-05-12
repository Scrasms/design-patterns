package command.game;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        GameController controller = new GameController();

        controller.assignButtonCommand("A", new MoveCommand(game));
        controller.assignButtonCommand("B", new AttackCommand(game));
        controller.assignButtonCommand("X", new JumpCommand(game));
        controller.assignButtonCommand("Y", new HealCommand(game));

        controller.pressButton("A");
        controller.pressButton("B");
        controller.pressButton("X");
        controller.pressButton("Y");

        controller.assignButtonCommand("A", new HealCommand(game));
        controller.assignButtonCommand("B", new MoveCommand(game));
        controller.assignButtonCommand("X", new AttackCommand(game));
        controller.assignButtonCommand("Y", new JumpCommand(game));

        controller.pressButton("A");
        controller.pressButton("B");
        controller.pressButton("X");
        controller.pressButton("Y");
    }
}
