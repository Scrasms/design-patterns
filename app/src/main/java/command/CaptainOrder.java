package command;

import java.util.ArrayList;
import java.util.List;

// Invoker class that issues commands from the Client to the Receiver
public class CaptainOrder {
    private List<ShipCommand> commands = new ArrayList<>();

    public void addCommand(ShipCommand command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (ShipCommand c : commands) {
            c.execute();
        }
    }
}
