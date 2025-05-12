package command.game;

public class HealCommand implements GameCommand {
    private Game game;

    public HealCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.heal();
    }
}
