package command.game;

// Invoker class
public class Button {
    private String name;
    private GameCommand command;

    public Button(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCommand(GameCommand command) {
        this.command = command;
    }

    public void executeCommand() {
        System.out.println(name + " was pressed!");
        command.execute();
    }
}
