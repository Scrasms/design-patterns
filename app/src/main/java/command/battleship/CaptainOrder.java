package command.battleship;

import java.util.ArrayList;
import java.util.List;

// Invoker class that issues commands from the Client to the Receiver
public class CaptainOrder {
    private List<ShipCommand> commands = new ArrayList<>();

    public void addCommand(ShipCommand command) {
        commands.add(command);
    }

    public void executeCommands() {
        if (commands.size() == 0) {
            System.out.println("No commands issued!");
            return;
        }

        List<ShipCommand> toRemove = new ArrayList<>();
        for (ShipCommand c : commands) {
            c.execute();
            toRemove.add(c);
        }
        toRemove.forEach(c -> commands.remove(c));
    }
}
