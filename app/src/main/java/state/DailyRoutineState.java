package state;

// Generic State interface detailing what each Concrete State does
public interface DailyRoutineState {
    public String work();
    public String eat();
    public String sleep();
    public String travel();
    public String reportRoutine();
}
