package command.game;

import java.util.ArrayList;
import java.util.List;

// Client class representing a video game controller
public class GameController {
    private List<Button> buttons = new ArrayList<>(
        List.of(new Button("X"), new Button("Y"), new Button("A"), new Button("B"))
    );

    private Button getButton(String name) {
        return buttons.stream()
            .filter(button -> button.getName().equals(name))
            .findFirst()
            .orElse(null);
    }

    public void assignButtonCommand(String name, GameCommand command) {
        Button button = getButton(name);
        button.setCommand(command);
    }

    public void pressButton(String name) {
        Button button = getButton(name);
        button.executeCommand();
    }
}
