package command.remote;

public class Remote {
    private Command command;

    public Remote(Command commmands) {
        command = commmands;
    }

    public void executeCommand() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
