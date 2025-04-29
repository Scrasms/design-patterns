package observer.exam;

public abstract class Student {
    private String currDiff;

    public void update(String currDiff) {
        this.currDiff = currDiff;
    }
    public abstract void stateOfMind();

    public void setcurrDiff(String currDiff) {
        this.currDiff = currDiff;
    }

    public String getcurrDiff() {
        return currDiff;
    }
}
