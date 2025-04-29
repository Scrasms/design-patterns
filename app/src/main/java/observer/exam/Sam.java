package observer.exam;

public class Sam extends Student {

    @Override
    public void stateOfMind() {
        switch (getcurrDiff()) {
            case "easy":
                System.out.println("Sam is breezing through the easy q");
                break;
            case "medium":
                System.out.println("Sam is breezing through the medium q");
                break;
            case "final":
                System.out.println("Though it took a lot of effort, Sam got it");
                break;
            default:
                break;
        }
    }

}
