package command.remote;

public class Client {
    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote;
        remote = new Remote(new OnCommand(tv));
        remote.executeCommand();
        remote.executeCommand();

        remote.setCommand(new OffCommand(tv));
        remote.executeCommand();
        remote.executeCommand();

        remote.setCommand(new IncreaseCommand(tv));
        remote.executeCommand();
        remote.setCommand(new DecreaseCommand(tv));
        remote.executeCommand();

        remote.setCommand(new OnCommand(tv));
        remote.executeCommand();

        remote.setCommand(new IncreaseCommand(tv));
        for (int i = 0; i < 10; i++) remote.executeCommand();

        remote.setCommand(new DecreaseCommand(tv));
        for (int i = 0; i < 15; i++) remote.executeCommand();
    }
}
