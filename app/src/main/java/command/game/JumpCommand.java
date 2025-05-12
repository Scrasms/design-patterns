package command.game;

public class JumpCommand implements GameCommand {
    private Game game;

    public JumpCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.jump();
    }
}
