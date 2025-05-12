package command.game;

public class MoveCommand implements GameCommand {
    private Game game;

    public MoveCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.move();
    }
}
