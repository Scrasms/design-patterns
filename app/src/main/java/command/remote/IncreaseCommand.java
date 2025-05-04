package command.remote;

public class IncreaseCommand implements Command {
    private TV tv;

    public IncreaseCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.increaseVolume();
    }

}
