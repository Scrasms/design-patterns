package observer.exam;

public class Josh extends Student {

    @Override
    public void stateOfMind() {
        switch (getcurrDiff()) {
            case "easy":
                System.out.println("Josh is breezing through the easy q");
                break;
            case "medium":
                System.out.println("Josh is breezing through the medium q");
                break;
            case "final":
                System.out.println("Last q was too much for Josh");
                break;
            default:
                break;
        }
    }

}
