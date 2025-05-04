package command.remote;

public class OnCommand implements Command {
    private TV tv;

    public OnCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.turnOn();
    }

}
