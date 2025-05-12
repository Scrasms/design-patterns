package command.game;

public class AttackCommand implements GameCommand {
    private Game game;

    public AttackCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.attack();
    }
}
