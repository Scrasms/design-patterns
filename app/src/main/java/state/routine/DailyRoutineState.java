package state.routine;

// Generic State interface detailing what each Concrete State does
public interface DailyRoutineState {
    public String work();
    public String eat();
    public String sleep();
    // Method that allows each state to modify the state of the Context class
    public String travel();
    public String reportRoutine();
}
