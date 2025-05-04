package command.remote;

public class DecreaseCommand implements Command {
    private TV tv;

    public DecreaseCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.decreaseVolume();
    }

}
