package observer.exam;

public class Kevin extends Student {

    @Override
    public void stateOfMind() {
        switch (getcurrDiff()) {
            case "easy":
                System.out.println("Kevin cannot do the easy q");
                break;
            case "medium":
                System.out.println("Kevin cannot do the medium q");
                break;
            case "final":
                System.out.println("Kevin never reached the last q");
                break;
            default:
                break;
        }
    }

}
