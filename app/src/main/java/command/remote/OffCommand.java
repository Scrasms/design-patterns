package command.remote;

public class OffCommand implements Command {
    private TV tv;

    public OffCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.turnOff();
    }

}
